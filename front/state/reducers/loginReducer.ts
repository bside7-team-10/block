import { LoginUser } from './../loginUser';
import { ActionType } from '../action-types';
import { Action } from '../actions';

interface InitialState {
  isLoggedIn: boolean;
  loading: boolean;
  error: string | null;
  user: LoginUser;
}

const initialState: InitialState = {
  isLoggedIn: false,
  loading: false,
  error: null,
  user: {
    nickname: null,
    profileUrl: null,
    token: null,
  },
};

const loginReducer = (state = initialState, action: Action) => {
  switch (action.type) {
    case ActionType.USER_LOGIN_REQUEST:
      return {
        ...state,
        loading: true,
      };
    case ActionType.USER_LOGIN_SUCCESS:
      return {
        ...state,
        loading: false,
        isLoggedIn: true,
        user: action.payload,
      };
    case ActionType.USER_LOGIN_ERROR:
      return {
        ...state,
        loading: false,
        error: action.payload,
      };
    default:
      return state;
  }
};

export default loginReducer;
