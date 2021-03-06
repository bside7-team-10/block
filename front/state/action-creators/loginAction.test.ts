import { ActionType } from './../action-types/index';
import configureStore from 'redux-mock-store';
import thunk from 'redux-thunk';

import { userLogin } from './index';
import { User } from '../user';

const middlewares = [thunk];
const mockStore = configureStore(middlewares);

const user: User = {
  email: '123',
  password: '123',
  nickName: '',
  birthday: '',
  gender: 0,
  avatar: 'image.jpg',
};

const testCallback = () => {
  //...
};

test('userLogin action creator test ', async () => {
  const store = mockStore({});
  store.dispatch(userLogin(user, testCallback) as any);
  const actions = store.getActions();
  expect(actions[0]).toEqual({ type: ActionType.USER_LOGIN_REQUEST });
});
