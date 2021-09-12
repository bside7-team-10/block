import { User } from "../state/user";

interface MockApiObject {
  signup: (user: User) => Promise<any>;
}

const NewMockApi = () => {
  const self = {} as MockApiObject;

  self.signup = ({ email, password, confirmPassword, nickName }: User) => {
    return new Promise((resolve, reject) => {
      if (email && password && confirmPassword && nickName) {
        resolve(1);
        return;
      }
      reject("signup failed");
    });
  };

  return self;
};

export default NewMockApi;
