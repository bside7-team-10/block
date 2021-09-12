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

export interface UserLoginRequestAction {
  type: ActionType.USER_LOGIN_REQUEST;
}

export interface UserLoginSuccessAction {
  type: ActionType.USER_LOGIN_SUCCESS;
}

export interface UserLoginFailureAction {
  type: ActionType.USER_LOGIN_FAILURE;
  payload: string;
}

export type Action = 
  UserSignupRequestAction | UserSignupSuccessAction | UserSignupErrorAction
  | UserLoginRequestAction | UserLoginSuccessAction | UserLoginFailureAction;
