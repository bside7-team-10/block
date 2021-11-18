import { ActionType } from '../action-types';
import { Action } from '../actions';

interface InitialState {
  loading: boolean;
  latitude: number;
  longitude: number;
  error: string | null;
}

const initialState: InitialState = {
  loading: false,
  latitude: 37.498095,
  longitude: 127.02761,
  error: null,
};

const locationReducer = (state = initialState, action: Action) => {
  switch (action.type) {
    case ActionType.GET_USER_LOCATION_REQUEST:
      return {
        ...state,
        loading: true,
      };
    case ActionType.GET_USER_LOCATION_SUCCESS:
      return {
        ...state,
        loading: false,
        latitude: action.payload.coords.latitude,
        longitude: action.payload.coords.longitude,
      };
    case ActionType.GET_USER_LOCATION_ERROR:
      return {
        ...state,
        loading: false,
        error: action.payload,
      };
    default:
      return state;
  }
};

export default locationReducer;
