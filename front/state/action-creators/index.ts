import { Dispatch } from 'redux';

import { ActionType } from '../action-types';
import { Action } from '../actions';
import Service from '../service';
import { User } from '../user';

const service = Service();

export const userSignup = (user: User) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.USER_SIGNUP_REQUEST });
    try {
      await service.signup(user);
      dispatch({ type: ActionType.USER_SIGNUP_SUCCESS });
    } catch (error: any) {
      dispatch({ type: ActionType.USER_SIGNUP_ERROR, payload: error });
    }
  };
};

export const userLogin = (user: User, callBack: () => void) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.USER_LOGIN_REQUEST });
    try {
      const result = await service.login(user);
      dispatch({ type: ActionType.USER_LOGIN_SUCCESS, payload: result });
      callBack();
    } catch (error: any) {
      dispatch({ type: ActionType.USER_LOGIN_ERROR, payload: error });
    }
  };
};

export const getUserLocation = () => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.GET_USER_LOCATION_REQUEST });
    try {
      const position = await service.getLocation();
      dispatch({ type: ActionType.GET_USER_LOCATION_SUCCESS, payload: position });
    } catch (error: any) {
      dispatch({ type: ActionType.GET_USER_LOCATION_ERROR, payload: error });
    }
  };
};
