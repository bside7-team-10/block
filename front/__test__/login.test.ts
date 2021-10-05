import { LoginUser } from '../state';
import Service from '../state/service';

const service = Service();
const mockUser: LoginUser = {
  email: '123',
  password: '123',
};

it('login success test', async () => {
  await service.login(mockUser);
});
