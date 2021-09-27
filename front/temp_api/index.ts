import { User } from '../state/user';
import { UserProtocolClient } from '../_generated/UserProtocol_pb_service';
import { SignUpRequest } from '../_generated/UserProtocol_pb';

interface MockApiObject {
  signup: (user: User) => Promise<any>;
  login: (user: User) => Promise<any>;
  getLocation: () => Promise<any>;
}

const NewMockApi = () => {
  const self = {} as MockApiObject;

  self.signup = ({ email, password, nickName }: User) => {
    // return new Promise((resolve, reject) => {
    //   if (email && password && confirmPassword && nickName) {
    //     resolve(1);
    //     return;
    //   }
    //   reject("signup failed");
    // });
    return new Promise((resolve, reject) => {
      const req = new SignUpRequest();
      req.setEmail(email);
      req.setPassword(password);
      req.setNickname(nickName);
      req.setBirthday('2021-01-01');
      req.setAvatar('1.png');
      req.setGender(SignUpRequest.Gender.MALE);
      const userClient = new UserProtocolClient('http://52.78.170.114:8081');
      // const userClient = new UserProtocolClient("http://localhost:8081");
      userClient.signUp(req, (err, res) => {
        if (err !== null) {
          console.error(err);
          reject(err);
          return;
        } else {
          console.log(res);
          resolve(res);
          return;
        }
      });
    });
  };

  self.login = ({ email, password }: User) => {
    return new Promise((resolve, reject) => {
      if (email && password) {
        if (email === 'test@test.com' && password === '1234') {
          resolve(1);
        } else {
          reject('아이디 혹은 비밀번호가 틀립니다.');
        }
        return;
      }
      reject('login failed');
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

export default NewMockApi;
