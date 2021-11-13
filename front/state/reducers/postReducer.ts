import { ActionType } from '../action-types';
import { Action } from '../actions/index';

interface InitialState {
  loading: boolean;
  message: string | unknown | null;
  content: string | null;
  rightNow: boolean | null;
  toComeBackPath?: string | null;
  imageSource?: string | null;
  hashtag?: string[] | null;
  hashtagIndex?: number[] | null;
}

const initialState: InitialState = {
  loading: false,
  message: null,
  content: null,
  rightNow: null,
  toComeBackPath: null,
  imageSource: null,
  hashtag: null,
  hashtagIndex: null,
};

const postReducer = (state = initialState, action: Action) => {
  switch (action.type) {
    case ActionType.ADD_POST_REQUEST:
      return {
        ...state,
        loading: true,
      };
    case ActionType.ADD_POST_SUCCESS:
      return {
        ...state,
        loading: false,
        message: action.payload,
      };
    case ActionType.ADD_POST_ERROR:
      return {
        ...state,
        loading: false,
        message: action.payload,
      };
    case ActionType.SAVE_TEMP_POST:
      return {
        ...state,
        content: action.payload.content,
        rightNow: action.payload.rightNow,
        toComeBackPath: action.payload.toComeBackPath,
        hashtag: action.payload.hashtag,
        hashtagIndex: action.payload.hashtagIndex,
      };
    case ActionType.REMOVE_TEMP_POST:
      return {
        ...state,
        content: null,
        rightNow: false,
        toComeBackPath: null,
      };
    case ActionType.CAPTURE_IMAGE_SUCCESS:
      return {
        ...state,
        loading: false,
        imageSource: action.payload,
      };
    case ActionType.CAPTURE_IMAGE_ERROR:
      return {
        ...state,
        loading: false,
        message: action.payload,
      };
    case ActionType.REMOVE_TEMP_IMAGE:
      return {
        ...state,
        imageSource: null,
      };
    default:
      return state;
  }
};

export default postReducer;
