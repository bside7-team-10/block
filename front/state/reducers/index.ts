import { combineReducers } from "redux";
import signupReduer from "./signupReducer";

const reducers = combineReducers({
  signup: signupReduer,
});

export default reducers;
