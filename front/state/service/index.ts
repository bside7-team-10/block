import { LoginUser, User } from '../user';
import { UserProtocolClient } from '../../_generated/UserProtocol_pb_service';
import { SignInRequest, SignUpRequest } from '../../_generated/UserProtocol_pb';

interface ServiceInterface {
  signup: (user: User) => Promise<any>;
  login: (user: LoginUser) => Promise<any>;
  getLocation: () => Promise<any>;
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

  self.login = ({ email, password }: LoginUser) => {
    return new Promise((resolve, reject) => {
      const req = new SignInRequest();
      req.setEmail(email);
      req.setPassword(password);
      const userClient = new UserProtocolClient('http://52.78.170.114:8081');
      userClient.signIn(req, (err, res) => {
        if (err !== null) {
          // console.error(err);
          reject(err);
        } else {
          // console.log(res);
          resolve(res);
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

  return self;
};

export default Service;
