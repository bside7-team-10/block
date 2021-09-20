import { combineReducers } from 'redux';
import loginReducer from './loginReducer';
import signupReduer from './signupReducer';
import locationReducer from './locationReducer';

const reducers = combineReducers({
  signup: signupReduer,
  login: loginReducer,
  location: locationReducer,
});

export default reducers;
