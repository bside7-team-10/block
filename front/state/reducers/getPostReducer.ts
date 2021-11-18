import { ActionType } from '../action-types';
import { Action } from '../actions/index';

interface InitialState {
  loading: boolean;
  post: null,
}

const initialState: InitialState = {
  loading: false,
  post: null,
};

const getPostReducer = (state = initialState, action: Action) => {
  switch (action.type) {
    case ActionType.GET_POST_REQUEST:
      return {
        ...state,
        loading: true,
      };
    case ActionType.GET_POST_SUCCESS:
      return {
        ...state,
        loading: false,
        post: action.payload,
      };
    case ActionType.GET_POST_ERROR:
      return {
        ...state,
        loading: false,
        post: action.payload,
      };
    default:
      return state;
  }
};

export default getPostReducer;
