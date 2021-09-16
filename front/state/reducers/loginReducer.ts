import { ActionType } from "../action-types";
import { Action } from "../actions";

interface InitialState {
  isLoggedIn: boolean;
  loading: boolean;
  error: string | null;
}

const initialState: InitialState = {
  isLoggedIn: false,
  loading: false,
  error: null,
}

const loginReducer = (state = initialState, action: Action) => {
  switch(action.type) {
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
      };
    case ActionType.USER_LOGIN_FAILURE:
      return {
        ...state,
        loading: false,
        error: action.payload,
      };
    default:
      return state;
  }
}

export default loginReducer;