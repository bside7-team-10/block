import { ActionType } from '../action-types/index';
import loginReducer from './loginReducer';
import Service from '../../__mocks__/service';
import { User } from '../user';

const service = Service();

test('로그인 요청시 loading의 상태는 true이다.', () => {
  const state = loginReducer(undefined, { type: ActionType.USER_LOGIN_REQUEST });
  expect(state.loading).toEqual(true);
});

test("아이디와 비밀번호가 '123'일 때 로그인은 성공한다", async () => {
  const user: User = {
    email: '123',
    password: '123',
    nickName: '',
    birthday: '',
    gender: 0,
    avatar: 'image.jpg',
  };

  const result = await service.login(user);
  const state = loginReducer(undefined, {
    type: ActionType.USER_LOGIN_SUCCESS,
    payload: result,
  });

  expect(state.user.nickname).toEqual('block');
});

test("아이디와 비밀번호가 '123'이 아닐 때 로그인은 실패한다.", async () => {
  const user: User = {
    email: '321',
    password: '321',
    nickName: '',
    birthday: '',
    gender: 0,
    avatar: 'image.jpg',
  };

  try {
    await service.login(user);
  } catch (e: any) {
    const state = loginReducer(undefined, {
      type: ActionType.USER_LOGIN_ERROR,
      payload: e,
    });
    expect(state.error).toEqual('아이디 또는 비밀번호가 다릅니다.');
  }
});
