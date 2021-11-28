import { ActionType } from '../action-types/index';
import postReducer from './postReducer';
import Service from '../../__mocks__/service';
import { Post } from '../post';

const service = Service();

test('SAVE_TEMP_POST가 호출되면 작성된 내용들은 임시 저장된다.', async () => {
  const tempPost: Post = {
    content: '작성중인 내용',
    rightNow: false,
    toComeBackPath: '/board/write',
    hashtag: ['오늘의이야기'],
    latitude: 0,
    longitude: 0,
  };

  const state = postReducer(undefined, { type: ActionType.SAVE_TEMP_POST, payload: tempPost });

  expect(state).toEqual({
    loading: false,
    message: null,
    content: '작성중인 내용',
    rightNow: false,
    toComeBackPath: '/board/write',
    imageSource: null,
    hashtag: ['오늘의이야기'],
  });
});

test('CAPTURE_IMAGE_SUCCESS가 호출되면 state에 이미지가 갱신된다.', () => {
  const imageSource = 'image.jpg';

  const state = postReducer(undefined, {
    type: ActionType.CAPTURE_IMAGE_SUCCESS,
    payload: imageSource,
  });

  expect(state.imageSource).toBe('image.jpg');
});

test('REMOVE_TEMP_IMAGE가 호출되면 state에 저장되어있는 사진은 null로 변경된다.', () => {
  const initialState = {
    content: '작성중인 내용',
    rightNow: false,
    toComeBackPath: '/board/write',
    hashtag: ['오늘의이야기'],
    hashtagIndex: [0],
    imageSource: 'image.jpg',
    loading: false,
    message: null,
    writing: false,
  };

  const state = postReducer(initialState, {
    type: ActionType.REMOVE_TEMP_IMAGE,
  });

  expect(state.imageSource).toBeNull();
});

test('내용이 있으면 글쓰기는 완료된다.', async () => {
  const post: Post = {
    content: '작성중인 내용',
    rightNow: true,
    toComeBackPath: '/board/write',
    hashtag: ['오늘의이야기'],
    latitude: 0,
    longitude: 0,
  };

  const result = await service.addPost(post);
  const state = postReducer(undefined, {
    type: ActionType.ADD_POST_SUCCESS,
    payload: result,
  });

  expect(state.message).toBe('게시글이 등록되었습니다.');
});

test('내용이 없으면 글쓰기는 실패한다.', async () => {
  const post: Post = {
    content: '',
    rightNow: true,
    toComeBackPath: '/board/write',
    hashtag: ['오늘의이야기'],
    latitude: 0,
    longitude: 0,
  };

  try {
    await service.addPost(post);
  } catch (error) {
    const state = postReducer(undefined, {
      type: ActionType.ADD_POST_ERROR,
      payload: error,
    });
    expect(state.message).toBe('오류가 발생했습니다.');
  }
});
