export interface User {
  id?: number;
  email: string;
  password: string;
  confirmPassword?: string;
  nickName: string;
  birthday: string;
  gender: 0 | 1;
  latitude?: number;
  longitude?: number;
  avatar: string;
}
