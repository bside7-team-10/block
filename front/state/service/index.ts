import { Cookies } from 'react-cookie';

import { SignInRequest, SignUpRequest } from '../../_generated/UserProtocol_pb';
import { LoginUser } from '../loginUser';
import { UserProtocolClient } from '../../_generated/UserProtocol_pb_service';
import { User } from '../user';
import { Post } from '../post';
import { Image } from '../image';

interface ServiceInterface {
  signup: (user: User) => Promise<any>;
  login: (user: User) => Promise<any>;
  getLocation: () => Promise<any>;
  addPost: (data: Post) => Promise<any>;
  captureImage: (image: Image) => Promise<any>;
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
      const userClient = new UserProtocolClient('http://52.78.170.114:8081');
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
      const userClient = new UserProtocolClient('http://52.78.170.114:8081');
      userClient.signIn(req, (err, res) => {
        if (err !== null) {
          reject('아이디 또는 비밀번호가 다릅니다.');
        } else {
          const loginUser: LoginUser = {
            nickname: res?.getNickname(),
            profileUrl: res?.getProfileurl(),
            token: res?.getToken(),
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

  self.addPost = (data: Post) => {
    return new Promise((resolve, reject) => {
      const { content } = data;
      if (content) {
        resolve('게시글이 등록되었습니다.');
      } else {
        reject('오류가 발생했습니다.');
      }
    });
  };

  self.captureImage = (image: Image) => {
    return new Promise((resolve, reject) => {
      const { src, date } = image;
      if (src) {
        resolve(src);
      } else {
        reject('이미지 등록에 실패했습니다.');
      }
    });
  };

  return self;
};

export default Service;
