import { ActionType } from "../action-types";
import { User } from "../user";

export interface UserSignupRequestAction {
  type: ActionType.USER_SIGNUP_REQUEST;
}

export interface UserSignupSuccessAction {
  type: ActionType.USER_SIGNUP_SUCCESS;
}

export interface UserSignupErrorAction {
  type: ActionType.USER_SIGNUP_ERROR;
  payload: string;
}

export type Action = UserSignupRequestAction | UserSignupSuccessAction | UserSignupErrorAction;
