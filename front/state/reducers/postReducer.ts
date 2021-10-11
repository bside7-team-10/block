import { ActionType } from '../action-types';
import { Action } from '../actions/index';

interface InitialState {
  loading: boolean;
  message: string | null;
}

const initialState: InitialState = {
  loading: false,
  message: null,
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
    default:
      return state;
  }
};

export default postReducer;
