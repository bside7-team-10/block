import { combineReducers } from 'redux';
import loginReducer from './loginReducer';
import signupReduer from './signupReducer';
import locationReducer from './locationReducer';
import postReducer from './postReducer';
import getPostReducer from './getPostReducer';
import getPostsReducer from './getPostsReducer';

const reducers = combineReducers({
  signup: signupReduer,
  login: loginReducer,
  location: locationReducer,
  post: postReducer,
  getPost: getPostReducer,
  posts: getPostsReducer,
});

export default reducers;

export type RootState = ReturnType<typeof reducers>;
