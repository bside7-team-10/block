import { ActionType } from './../action-types/index';
import configureStore from 'redux-mock-store';
import thunk from 'redux-thunk';

import { addPost, captureImage, removeTempImage, removeTempPost, saveTempPost } from './index';
import { Post } from '../post';

const middlewares = [thunk];
const mockStore = configureStore(middlewares);
const store = mockStore({});

const post: Post = {
  content: '내용',
  rightNow: false,
  latitude: 37.498095,
  longitude: 127.02761,
  date: '2021-10-25',
  toComeBackPath: '/board/write',
  hashtag: ['오늘의이야기'],
  image: 'picture.jpg',
};

const postWithoutContent: Post = {
  content: '',
  rightNow: false,
  latitude: 37.498095,
  longitude: 127.02761,
  date: '2021-10-25',
  toComeBackPath: '/board/write',
  hashtag: ['오늘의이야기'],
  image: 'picture.jpg',
};

const tempImage = 'picture.jpg';

const testCallback = () => {
  //...
};

test('addPost action creator success test ', async () => {
  await store.dispatch(addPost(post, testCallback) as any);
  const actions = store.getActions();

  expect(actions[0]).toEqual({ type: ActionType.ADD_POST_REQUEST });
  expect(actions[1]).toEqual({
    type: ActionType.ADD_POST_SUCCESS,
    payload: '게시글이 등록되었습니다.',
  });
});

test('addPost action creator error test ', async () => {
  await store.dispatch(addPost(postWithoutContent, testCallback) as any);
  const actions = store.getActions();

  expect(actions[2]).toEqual({ type: ActionType.ADD_POST_REQUEST });
  expect(actions[3]).toEqual({
    type: ActionType.ADD_POST_ERROR,
    payload: '오류가 발생했습니다.',
  });
});

test('saveTempPost action creator test ', async () => {
  await store.dispatch(saveTempPost(post) as any);
  const actions = store.getActions();
  expect(actions[4]).toEqual({ type: ActionType.SAVE_TEMP_POST, payload: post });
});

test('removeTempPost action creator test ', async () => {
  await store.dispatch(removeTempPost() as any);
  const actions = store.getActions();
  expect(actions[5]).toEqual({ type: ActionType.REMOVE_TEMP_POST });
});

test('removeTempImage action creator test ', async () => {
  await store.dispatch(removeTempImage() as any);
  const actions = store.getActions();
  expect(actions[6]).toEqual({ type: ActionType.REMOVE_TEMP_IMAGE });
});

test('captureImage action creator success test ', async () => {
  await store.dispatch(captureImage(tempImage, testCallback) as any);
  const actions = store.getActions();

  expect(actions[7]).toEqual({
    type: ActionType.CAPTURE_IMAGE_SUCCESS,
    payload: tempImage,
  });
});

test('captureImage action creator error test ', async () => {
  await store.dispatch(captureImage('', testCallback) as any);
  const actions = store.getActions();

  expect(actions[8]).toEqual({
    type: ActionType.CAPTURE_IMAGE_ERROR,
    payload: '이미지 등록에 실패했습니다.',
  });
});
