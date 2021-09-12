import { combineReducers } from "redux";
import loginReducer from "./loginReducer";
import signupReduer from "./signupReducer";

const reducers = combineReducers({
  signup: signupReduer,
  login: loginReducer,
});

export default reducers;
