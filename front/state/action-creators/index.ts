import { Dispatch } from "redux";

import { ActionType } from "../action-types";
import { Action } from "../actions";
import NewMockApi from "../../temp_api";
import { User } from "../user";

export const userSignup = (user: User) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.USER_SIGNUP_REQUEST });
    try {
      const mockApi = NewMockApi();
      await mockApi.signup(user);
      dispatch({ type: ActionType.USER_SIGNUP_SUCCESS });
    } catch (error) {
      dispatch({ type: ActionType.USER_SIGNUP_ERROR, payload: error });
    }
  };
};
