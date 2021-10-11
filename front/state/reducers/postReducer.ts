import { ActionType } from '../action-types';
import { Action } from '../actions/index';

interface InitialState {
  loading: boolean;
  message: string | null;
  content: string | null;
  rightNow: boolean;
  toComeBackPath: string | null;
}

const initialState: InitialState = {
  loading: false,
  message: null,
  content: null,
  rightNow: false,
  toComeBackPath: null,
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
      };
    case ActionType.REMOVE_TEMP_POST:
      return {
        ...state,
        content: null,
        rightNow: false,
        toComeBackPath: null,
      };
    default:
      return state;
  }
};

export default postReducer;
