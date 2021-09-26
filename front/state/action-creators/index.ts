import { Dispatch } from 'redux';

import { ActionType } from '../action-types';
import { Action } from '../actions';
import NewMockApi from '../../temp_api';
import { User } from '../user';

export const userSignup = (user: User, callback: () => void) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.USER_SIGNUP_REQUEST });
    try {
      const mockApi = NewMockApi();
      await mockApi.signup(user);
      dispatch({ type: ActionType.USER_SIGNUP_SUCCESS });
      callback();
    } catch (error) {
      dispatch({ type: ActionType.USER_SIGNUP_ERROR, payload: `${error}` });
    }
  };
};

export const userLogin = (user: User, callBack: () => void) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.USER_LOGIN_REQUEST });
    try {
      const mockApi = NewMockApi();
      const userData = await mockApi.login(user);
      dispatch({ type: ActionType.USER_LOGIN_SUCCESS });
      callBack();
    } catch (error) {
      dispatch({ type: ActionType.USER_LOGIN_ERROR, payload: `${error}` });
    }
  };
};

export const getUserLocation = () => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.GET_USER_LOCATION_REQUEST });
    try {
      const mockApi = NewMockApi();
      const position = await mockApi.getLocation();
      dispatch({ type: ActionType.GET_USER_LOCATION_SUCCESS, payload: position });
    } catch (error) {
      dispatch({ type: ActionType.GET_USER_LOCATION_ERROR, payload: `${error}` });
    }
  };
};
