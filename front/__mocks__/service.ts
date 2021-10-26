import { User } from '../state';
import { Post } from '../state/post';

export const userLoginSuccess = {
  nickname: 'block',
  profileUrl: 'block.png',
  token: 'test-jwt-token',
};

interface ServiceInterface {
  login: (user: User) => Promise<any>;
  addPost: (data: Post) => Promise<any>;
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

  return self;
});

export default Service;
