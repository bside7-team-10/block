import { User } from '../state';

export const userLoginSuccess = {
  nickname: 'block',
  profileUrl: 'block.png',
  token: 'test-jwt-token',
};

interface ServiceInterface {
  login: (user: User) => Promise<any>;
}

const Service = jest.fn(() => {
  const self = {} as ServiceInterface;

  self.login = ({ email, password }: User) => {
    return new Promise((resolve, reject) => {
      if (email === '123' && password === '123') {
        resolve(userLoginSuccess);
      } else {
        reject('아이디 또는 비밀번호가 다릅니다.');
      }
    });
  };

  return self;
});

export default Service;
