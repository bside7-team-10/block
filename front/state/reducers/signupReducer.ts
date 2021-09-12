import { ActionType } from "../action-types";
import { Action } from "../actions";

interface CommonState {
  loading: boolean;
  error: string | null;
}

const initalState: CommonState = {
  loading: false,
  error: null,
};

const reducer = (state: CommonState = initalState, action: Action) => {
  switch (action.type) {
    case ActionType.USER_SIGNUP_REQUEST:
      return {
        ...state,
        loading: true,
      };

    case ActionType.USER_SIGNUP_SUCCESS:
      return {
        ...state,
        loading: false,
      };

    case ActionType.USER_SIGNUP_ERROR:
      return {
        ...state,
        loading: false,
        error: action.payload,
      };

    default:
      return state;
  }
};

export default reducer;
