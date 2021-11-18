import { LoginUser } from './../loginUser';
import { ActionType } from '../action-types';
import { Post } from '../post';

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
  payload: LoginUser;
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

export interface GetAddressByLocationRequestAction {
  type: ActionType.GET_ADDRESS_BY_LOCATION_REQUEST;
}

export interface GetAddressByLocationSuccessAction {
  type: ActionType.GET_ADDRESS_BY_LOCATION_SUCCESS;
  payload: any;
}

export interface GetAddressLocationErrorAction {
  type: ActionType.GET_ADDRESS_BY_LOCATION_ERROR;
  payload: string;
}

export interface AddPostRequestAction {
  type: ActionType.ADD_POST_REQUEST;
}

export interface AddPostSuccessAction {
  type: ActionType.ADD_POST_SUCCESS;
  payload: string;
}

export interface AddPostErrorAction {
  type: ActionType.ADD_POST_ERROR;
  payload: string | unknown;
}

export interface GetPostsRequestAction {
  type: ActionType.GET_POSTS_REQUEST;
}

export interface GetPostsSuccessAction {
  type: ActionType.GET_POSTS_SUCCESS;
  payload: string;
}

export interface GetPostsErrorAction {
  type: ActionType.GET_POSTS_ERROR;
  payload: string | unknown;
}

export interface GetPostRequestAction {
  type: ActionType.GET_POST_REQUEST;
}

export interface GetPostSuccessAction {
  type: ActionType.GET_POST_SUCCESS;
  payload: string;
}

export interface GetPostErrorAction {
  type: ActionType.GET_POST_ERROR;
  payload: string | unknown;
}

export interface CaptureImageSuccessAction {
  type: ActionType.CAPTURE_IMAGE_SUCCESS;
  payload: string;
}

export interface CaptureImageErrorAction {
  type: ActionType.CAPTURE_IMAGE_ERROR;
  payload: string;
}

export interface SaveTempPost {
  type: ActionType.SAVE_TEMP_POST;
  payload: Post;
}

export interface RemoveTempPost {
  type: ActionType.REMOVE_TEMP_POST;
}

export interface RemoveTempImage {
  type: ActionType.REMOVE_TEMP_IMAGE;
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
  | GetUserLocationErrorAction
  | AddPostRequestAction
  | AddPostSuccessAction
  | AddPostErrorAction
  | CaptureImageSuccessAction
  | CaptureImageErrorAction
  | SaveTempPost
  | RemoveTempPost
  | RemoveTempImage
  | GetAddressByLocationRequestAction
  | GetAddressByLocationSuccessAction
  | GetAddressLocationErrorAction
  | GetPostsRequestAction
  | GetPostsSuccessAction
  | GetPostsErrorAction
  | GetPostRequestAction
  | GetPostSuccessAction
  | GetPostErrorAction