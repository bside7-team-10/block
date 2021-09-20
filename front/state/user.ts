export interface User {
  id?: number;
  email: string;
  password: string;
  confirmPassword: string;
  nickName: string;
  birthday?: string;
  gender?: string;
  latitude: number;
  longitude: number;
}
