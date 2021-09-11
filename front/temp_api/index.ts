import { User } from "../state/user";

interface MockApiObject {
  signup: (user: User) => Promise<any>;
}

const NewMockApi = () => {
  const self = {} as MockApiObject;

  self.signup = ({ email, password, confirmPassword, nickName, birthday, gender }: User) => {
    return new Promise((resolve, reject) => {
      if (email && password && confirmPassword && nickName && birthday && gender) {
        resolve(1);
        return;
      }
      reject();
    });
  };

  return self;
};

export default NewMockApi;
