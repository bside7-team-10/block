import Axios from 'axios';

export const createAxios = (url: string) => Axios.create({
  baseURL: url,
});
