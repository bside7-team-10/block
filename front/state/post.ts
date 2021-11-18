export interface Post {
  content: string;
  rightNow: boolean;
  latitude: number;
  longitude: number;
  address: string;
  date?: string;
  toComeBackPath?: string; //촬영 후 다시 돌아 올 주소
  hashtagIndex?: number[];
  hashtag?: string[];
  imageSource?: string | null;
}
