import { grpc } from '@improbable-eng/grpc-web';
import axios from 'axios';
import { Cookies } from 'react-cookie';

import { SignInRequest, SignUpRequest } from '../../_generated/UserProtocol_pb';
import { CreatePostRequest, GetPostRequest, LocationDto, UploadImageResultRequest } from '../../_generated/PostProtocol_pb';
import { LoginUser } from '../loginUser';
import { UserProtocolClient } from '../../_generated/UserProtocol_pb_service';
import { PostProtocolClient } from '../../_generated/PostProtocol_pb_service';
import { User, Post, LatLng } from '../';
import { createAxios } from '../../lib/axios';
import config from '../../config/test-config';

const serverUrl = "https://dev-be.block-app.io";
// const serverUrl = "http://localhost:8081"; 
export interface ServiceInterface {
  signup: (user: User) => Promise<any>;
  login: (user: User) => Promise<any>;
  getLocation: () => Promise<any>;
  addPost: (data: Post) => Promise<any>;
  getPost: (postId: number) => Promise<any>;
  getAddressByLocation: (data: LatLng) => Promise<any>;
}

const Service = () => {
  const self = {} as ServiceInterface;

  self.signup = ({ email, password, nickName, birthday, gender }: User) => {
    return new Promise((resolve, reject) => {
      const req = new SignUpRequest();
      req.setEmail(email);
      req.setPassword(password);
      req.setNickname(nickName);
      req.setBirthday(birthday);
      req.setAvatar('1.png');
      req.setGender(gender);
      const userClient = new UserProtocolClient(serverUrl);
      userClient.signUp(req, (err, res) => {
        if (err !== null) {
          console.error(err);
          reject(err);
        } else {
          console.log(res);
          resolve(res);
        }
      });
    });
  };

  self.login = ({ email, password }: User) => {
    return new Promise((resolve, reject) => {
      const req = new SignInRequest();
      req.setEmail(email);
      req.setPassword(password);
      const userClient = new UserProtocolClient(serverUrl);
      userClient.signIn(req, (err, res) => {
        if (err !== null) {
          console.log('failure');
          reject('아이디 또는 비밀번호가 다릅니다.');
        } else {
          console.log('success');

          const loginUser: LoginUser = {
            nickname: res ?.getNickname(),
            profileUrl: res ?.getProfileurl(),
            token: res ?.getToken(),
          };
          const cookie = new Cookies();
          cookie.set('accessToken', loginUser.token, {
            path: '/',
            secure: true,
          });
          resolve(loginUser);
        }
      });
    });
  };

  self.getLocation = () => {
    return new Promise((resolve, reject) => {
      navigator.geolocation.getCurrentPosition(
        (position) => resolve(position),
        () => reject('sorry, no position available')
      );
    });
  };

  self.addPost = ({ content, latitude, longitude, imageSource }: Post) => {
    return new Promise((resolve, reject) => {
      const req = new CreatePostRequest();
      req.setContent(content);
      const loc = new LocationDto();
      loc.setLat(latitude);
      loc.setLong(longitude);
      req.setLocation(loc);
      const postClient = new PostProtocolClient(serverUrl);
      const headers = new grpc.Metadata();
      const cookies = new Cookies();
      headers.append('Authorization', 'Bearer ' + cookies.get('accessToken'));
      postClient.createPost(req, headers, async (err, res) => {
        if (err !== null) {
          console.error(err);
          reject(err);
        } else if (res !== null) {
          console.log(res);
          const imageUrl = res.getUploadimageurl();
          const result = await axios.put(imageUrl, imageSource);
          console.log("upload image: ", result);
          const uploadSuccessResult = new UploadImageResultRequest();
          uploadSuccessResult.setPostid(res.getPostid());
          uploadSuccessResult.setSuccess(true);
          postClient.uploadImageResult(uploadSuccessResult, headers, async (err, resres) => {
            if (err !== null) {
              console.error(err);
              return reject(err);
            }
            const message = {
              postId: res.getPostid(),
              status: res.getStatus(),
            };
            console.log(message);
            resolve(message);
          });
        }
      });
    });
  };

  self.getPost = (postId: number) => {
    return new Promise((resolve, reject) => {
      const req = new GetPostRequest();
      req.setPostid(postId);
      const postClient = new PostProtocolClient(serverUrl);
      const headers = new grpc.Metadata();
      const cookies = new Cookies();
      headers.append("Authorization", "Bearer " + cookies.get("accessToken"));
      postClient.getPost(req, headers, async (err, res) => {
        if (err !== null) {
          console.error(err);
          reject(err);
        } else if (res !== null) {
          const post = res.getPost();
          if (!post) {
            return reject("post is null");
          }
          const imageUrl = post.getImageurl();
          const imageResult = await axios.get(imageUrl);

          const responsePost = {
            post: res.getPost(),
            image: imageResult.data
          };
          resolve(responsePost);
        }
      });
    });
  };

  self.getAddressByLocation = async ({ latitude, longitude }: LatLng) => {
    const axios = createAxios(`https://maps.googleapis.com/maps/api/geocode/json`);

    const params = {
      params: {
        latlng: `${latitude},${longitude}`,
        key: `${config.GOOGLE_MAP_KEY}`
      }
    };

    const response = await axios.get('', params);
    return response.data;
  }

  return self;
};

export default Service;
