import { ActionType } from '../action-types';
import { Action } from '../actions/index';
import { MPost } from '../'

interface InitialState {
  loading: boolean;
  posts: MPost[],
}

const initialState: InitialState = {
  loading: false,
  posts: [],
};

const getPostsReducer = (state = initialState, action: Action) => {
  switch (action.type) {
    case ActionType.GET_POSTS_REQUEST:
      return {
        ...state,
        loading: true,
      };
    case ActionType.GET_POSTS_SUCCESS:
      return {
        ...state,
        loading: false,
        posts: action.payload,
      };
    case ActionType.GET_POSTS_ERROR:
      console.error(action.payload);
      return {
        ...state,
        loading: false,
        // posts: action.payload, // should not set state when failed
      };
    default:
      return state;
  }
};

export default getPostsReducer;
