import { Dispatch } from 'redux';

import { ActionType } from '../action-types';
import { Action } from '../actions';
import Service from '../service';
import { User, Post, LatLng } from '../';

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

let init = true;
let i = 1;
const unit = 0.0003;

const getFakePosition = (data: LatLng) => {
  const { latitude, longitude } = data;
  const calcI = i++

  if (i == 20) i = 1;

  if (i < 20) {
    return { latitude: latitude + unit * calcI, longitude: longitude - unit * calcI };
  }
  return { latitude, longitude };
}

export const getFakeUserLocation = (data: LatLng) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.GET_USER_LOCATION_REQUEST });
    try {
      let position: { latitude: number, longitude: number };
      let newPosition: any;
      if (init) {
        position = await service.getLocation();
      } else {
        position = getFakePosition(data)
        newPosition = {
          coords: {
            latitude: position.latitude,
            longitude: position.longitude
          }
        }
      }

      init = false;
      dispatch({ type: ActionType.GET_USER_LOCATION_SUCCESS, payload: newPosition });
    } catch (error: any) {
      dispatch({ type: ActionType.GET_USER_LOCATION_ERROR, payload: error });
    }
  };
};

export const getAddressByLocation = (data: LatLng) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.GET_ADDRESS_BY_LOCATION_REQUEST });
    try {
      const address = await service.getAddressByLocation(data);
      dispatch({ type: ActionType.GET_ADDRESS_BY_LOCATION_SUCCESS, payload: address });
    } catch (error: any) {
      dispatch({ type: ActionType.GET_ADDRESS_BY_LOCATION_ERROR, payload: error });
    }
  };
};

export const startWritePost = () => {
  return (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.START_WRITE_POST });
  }
}

export const addPost = (data: Post, callback: () => void) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.ADD_POST_REQUEST });
    try {
      const response = await service.addPost(data);
      dispatch({ type: ActionType.ADD_POST_SUCCESS, payload: response });
      callback();
    } catch (error: any) {
      dispatch({ type: ActionType.ADD_POST_ERROR, payload: error });
    }
  };
};

export const getPost = (postId: number) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.ADD_POST_REQUEST });
    try {
      const response = await service.getPost(postId);
      dispatch({ type: ActionType.GET_POST_SUCCESS, payload: response });
    } catch (error: any) {
      dispatch({ type: ActionType.GET_POST_ERROR, payload: error });
    }
  };
};

export const getPosts = ({ latitude, longitude }: LatLng) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.GET_POSTS_REQUEST });
    try {
      const response = await service.getPosts({ latitude, longitude });
      dispatch({ type: ActionType.GET_POSTS_SUCCESS, payload: response });
    } catch (error: any) {
      dispatch({ type: ActionType.GET_POSTS_ERROR, payload: error });
    }
  };
};

export const saveTempPost = (data: Post) => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.SAVE_TEMP_POST, payload: data });
  };
};

export const removeTempPost = () => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.REMOVE_TEMP_POST });
  };
};

export const removeTempImage = () => {
  return async (dispatch: Dispatch<Action>) => {
    dispatch({ type: ActionType.REMOVE_TEMP_IMAGE });
  };
};

export const captureImage = (image: string, callback: () => void) => {
  return async (dispatch: Dispatch<Action>) => {
    if (image) {
      dispatch({ type: ActionType.CAPTURE_IMAGE_SUCCESS, payload: image });
    } else {
      dispatch({ type: ActionType.CAPTURE_IMAGE_ERROR, payload: '이미지 등록에 실패했습니다.' });
    }
    callback();
  };
};
