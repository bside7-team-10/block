import { ActionType } from '../action-types';

export interface UserSignupRequestAction {
  type: ActionType.USER_SIGNUP_REQUEST;
}

export interface UserSignupSuccessAction {
  type: ActionType.USER_SIGNUP_SUCCESS;
}

export interface UserSignupErrorAction {
  type: ActionType.USER_SIGNUP_ERROR;
  payload: string | null;
}

export interface UserLoginRequestAction {
  type: ActionType.USER_LOGIN_REQUEST;
}

export interface UserLoginSuccessAction {
  type: ActionType.USER_LOGIN_SUCCESS;
}

export interface UserLoginErrorAction {
  type: ActionType.USER_LOGIN_ERROR;
  payload: string;
}

export interface GetUserLocationRequestAction {
  type: ActionType.GET_USER_LOCATION_REQUEST;
}

export interface GetUserLocationSuccessAction {
  type: ActionType.GET_USER_LOCATION_SUCCESS;
  payload: any;
}

export interface GetUserLocationErrorAction {
  type: ActionType.GET_USER_LOCATION_ERROR;
  payload: string;
}

export type Action =
  | UserSignupRequestAction
  | UserSignupSuccessAction
  | UserSignupErrorAction
  | UserLoginRequestAction
  | UserLoginSuccessAction
  | UserLoginErrorAction
  | GetUserLocationRequestAction
  | GetUserLocationSuccessAction
  | GetUserLocationErrorAction;
