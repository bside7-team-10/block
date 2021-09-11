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
      state.loading = true;
      return state;

    case ActionType.USER_SIGNUP_SUCCESS:
      return state;

    case ActionType.USER_SIGNUP_ERROR:
      state.error = action.payload;

    default:
      return state;
  }
};

export default reducer;
