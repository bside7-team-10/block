import { ActionType } from '../action-types';
import { Action } from '../actions/index';

interface InitialState {
  loading: boolean;
  error: string | null;
  src: string | null;
}

const initialState: InitialState = {
  loading: false,
  error: null,
  src: null,
};

const imageReducer = (state = initialState, action: Action) => {
  switch (action.type) {
    case ActionType.CAPTURE_IMAGE_REQUEST:
      return {
        ...state,
        loading: true,
      };
    case ActionType.CAPTURE_IMAGE_SUCCESS:
      return {
        ...state,
        loading: false,
        src: action.payload,
      };
    case ActionType.CAPTURE_IMAGE_ERROR:
      return {
        ...state,
        loading: false,
        error: action.payload,
      };
    default:
      return state;
  }
};

export default imageReducer;
