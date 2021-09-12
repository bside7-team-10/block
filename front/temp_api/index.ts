import { User } from "../state/user";

interface MockApiObject {
  signup: (user: User) => Promise<any>;
  login: (user: User) => Promise<any>;
}

const NewMockApi = () => {
  const self = {} as MockApiObject;

  self.signup = ({ email, password, confirmPassword, nickName }: User) => {
    return new Promise((resolve, reject) => {
      if (email && password && confirmPassword && nickName) {
        resolve(1);
        return;
      }
      reject("signup failed");
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
    })
  }

  return self;
};

export default NewMockApi;
