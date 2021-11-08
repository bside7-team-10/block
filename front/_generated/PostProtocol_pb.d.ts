// package: 
// file: PostProtocol.proto

import * as jspb from "google-protobuf";

export class LocationDto extends jspb.Message {
  getLat(): number;
  setLat(value: number): void;

  getLong(): number;
  setLong(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LocationDto.AsObject;
  static toObject(includeInstance: boolean, msg: LocationDto): LocationDto.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LocationDto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LocationDto;
  static deserializeBinaryFromReader(message: LocationDto, reader: jspb.BinaryReader): LocationDto;
}

export namespace LocationDto {
  export type AsObject = {
    lat: number,
    pb_long: number,
  }
}

export class CommentDto extends jspb.Message {
  getCommentid(): string;
  setCommentid(value: string): void;

  getAuthor(): string;
  setAuthor(value: string): void;

  getContent(): string;
  setContent(value: string): void;

  getCreatedts(): number;
  setCreatedts(value: number): void;

  getModifiedts(): number;
  setModifiedts(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CommentDto.AsObject;
  static toObject(includeInstance: boolean, msg: CommentDto): CommentDto.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CommentDto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CommentDto;
  static deserializeBinaryFromReader(message: CommentDto, reader: jspb.BinaryReader): CommentDto;
}

export namespace CommentDto {
  export type AsObject = {
    commentid: string,
    author: string,
    content: string,
    createdts: number,
    modifiedts: number,
  }
}

export class UserDto extends jspb.Message {
  getNickname(): string;
  setNickname(value: string): void;

  getProfileurl(): string;
  setProfileurl(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserDto.AsObject;
  static toObject(includeInstance: boolean, msg: UserDto): UserDto.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserDto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserDto;
  static deserializeBinaryFromReader(message: UserDto, reader: jspb.BinaryReader): UserDto;
}

export namespace UserDto {
  export type AsObject = {
    nickname: string,
    profileurl: string,
  }
}

export class PostDto extends jspb.Message {
  getPostid(): number;
  setPostid(value: number): void;

  hasAuthor(): boolean;
  clearAuthor(): void;
  getAuthor(): UserDto | undefined;
  setAuthor(value?: UserDto): void;

  getContent(): string;
  setContent(value: string): void;

  getImageurl(): string;
  setImageurl(value: string): void;

  getLikes(): number;
  setLikes(value: number): void;

  clearCommentsList(): void;
  getCommentsList(): Array<CommentDto>;
  setCommentsList(value: Array<CommentDto>): void;
  addComments(value?: CommentDto, index?: number): CommentDto;

  hasLocation(): boolean;
  clearLocation(): void;
  getLocation(): LocationDto | undefined;
  setLocation(value?: LocationDto): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PostDto.AsObject;
  static toObject(includeInstance: boolean, msg: PostDto): PostDto.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PostDto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PostDto;
  static deserializeBinaryFromReader(message: PostDto, reader: jspb.BinaryReader): PostDto;
}

export namespace PostDto {
  export type AsObject = {
    postid: number,
    author?: UserDto.AsObject,
    content: string,
    imageurl: string,
    likes: number,
    commentsList: Array<CommentDto.AsObject>,
    location?: LocationDto.AsObject,
  }
}

export class GetPostRequest extends jspb.Message {
  getPostid(): number;
  setPostid(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetPostRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetPostRequest): GetPostRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetPostRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetPostRequest;
  static deserializeBinaryFromReader(message: GetPostRequest, reader: jspb.BinaryReader): GetPostRequest;
}

export namespace GetPostRequest {
  export type AsObject = {
    postid: number,
  }
}

export class GetPostResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  hasPost(): boolean;
  clearPost(): void;
  getPost(): PostDto | undefined;
  setPost(value?: PostDto): void;

  getImageuploadurl(): string;
  setImageuploadurl(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetPostResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetPostResponse): GetPostResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetPostResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetPostResponse;
  static deserializeBinaryFromReader(message: GetPostResponse, reader: jspb.BinaryReader): GetPostResponse;
}

export namespace GetPostResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
    post?: PostDto.AsObject,
    imageuploadurl: string,
  }
}

export class GetPostsRequest extends jspb.Message {
  getPagenumber(): number;
  setPagenumber(value: number): void;

  hasResultperpage(): boolean;
  clearResultperpage(): void;
  getResultperpage(): number;
  setResultperpage(value: number): void;

  hasCurrentlocation(): boolean;
  clearCurrentlocation(): void;
  getCurrentlocation(): LocationDto | undefined;
  setCurrentlocation(value?: LocationDto): void;

  hasFilter(): boolean;
  clearFilter(): void;
  getFilter(): GetPostsRequest.Filter | undefined;
  setFilter(value?: GetPostsRequest.Filter): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetPostsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetPostsRequest): GetPostsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetPostsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetPostsRequest;
  static deserializeBinaryFromReader(message: GetPostsRequest, reader: jspb.BinaryReader): GetPostsRequest;
}

export namespace GetPostsRequest {
  export type AsObject = {
    pagenumber: number,
    resultperpage: number,
    currentlocation?: LocationDto.AsObject,
    filter?: GetPostsRequest.Filter.AsObject,
  }

  export class Filter extends jspb.Message {
    hasDistancefilter(): boolean;
    clearDistancefilter(): void;
    getDistancefilter(): GetPostsRequest.Filter.DistanceFilter | undefined;
    setDistancefilter(value?: GetPostsRequest.Filter.DistanceFilter): void;

    getRightnowfilter(): boolean;
    setRightnowfilter(value: boolean): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): Filter.AsObject;
    static toObject(includeInstance: boolean, msg: Filter): Filter.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: Filter, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): Filter;
    static deserializeBinaryFromReader(message: Filter, reader: jspb.BinaryReader): Filter;
  }

  export namespace Filter {
    export type AsObject = {
      distancefilter?: GetPostsRequest.Filter.DistanceFilter.AsObject,
      rightnowfilter: boolean,
    }

    export class DistanceFilter extends jspb.Message {
      getEnabled(): boolean;
      setEnabled(value: boolean): void;

      getDistance(): number;
      setDistance(value: number): void;

      serializeBinary(): Uint8Array;
      toObject(includeInstance?: boolean): DistanceFilter.AsObject;
      static toObject(includeInstance: boolean, msg: DistanceFilter): DistanceFilter.AsObject;
      static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
      static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
      static serializeBinaryToWriter(message: DistanceFilter, writer: jspb.BinaryWriter): void;
      static deserializeBinary(bytes: Uint8Array): DistanceFilter;
      static deserializeBinaryFromReader(message: DistanceFilter, reader: jspb.BinaryReader): DistanceFilter;
    }

    export namespace DistanceFilter {
      export type AsObject = {
        enabled: boolean,
        distance: number,
      }
    }
  }
}

export class GetPostsResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  clearPostsList(): void;
  getPostsList(): Array<PostDto>;
  setPostsList(value: Array<PostDto>): void;
  addPosts(value?: PostDto, index?: number): PostDto;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetPostsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetPostsResponse): GetPostsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetPostsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetPostsResponse;
  static deserializeBinaryFromReader(message: GetPostsResponse, reader: jspb.BinaryReader): GetPostsResponse;
}

export namespace GetPostsResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
    postsList: Array<PostDto.AsObject>,
  }
}

export class CreatePostRequest extends jspb.Message {
  getAuthor(): string;
  setAuthor(value: string): void;

  getContent(): string;
  setContent(value: string): void;

  hasLocation(): boolean;
  clearLocation(): void;
  getLocation(): LocationDto | undefined;
  setLocation(value?: LocationDto): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreatePostRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreatePostRequest): CreatePostRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CreatePostRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreatePostRequest;
  static deserializeBinaryFromReader(message: CreatePostRequest, reader: jspb.BinaryReader): CreatePostRequest;
}

export namespace CreatePostRequest {
  export type AsObject = {
    author: string,
    content: string,
    location?: LocationDto.AsObject,
  }
}

export class CreatePostResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  getPostid(): number;
  setPostid(value: number): void;

  getUploadimageurl(): string;
  setUploadimageurl(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreatePostResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CreatePostResponse): CreatePostResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CreatePostResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreatePostResponse;
  static deserializeBinaryFromReader(message: CreatePostResponse, reader: jspb.BinaryReader): CreatePostResponse;
}

export namespace CreatePostResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
    postid: number,
    uploadimageurl: string,
  }
}

export class ModifyPostRequest extends jspb.Message {
  getPostid(): number;
  setPostid(value: number): void;

  getContent(): string;
  setContent(value: string): void;

  getModifiedimage(): boolean;
  setModifiedimage(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ModifyPostRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ModifyPostRequest): ModifyPostRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ModifyPostRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ModifyPostRequest;
  static deserializeBinaryFromReader(message: ModifyPostRequest, reader: jspb.BinaryReader): ModifyPostRequest;
}

export namespace ModifyPostRequest {
  export type AsObject = {
    postid: number,
    content: string,
    modifiedimage: boolean,
  }
}

export class ModifyPostResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  getPostid(): number;
  setPostid(value: number): void;

  getUploadimageurl(): string;
  setUploadimageurl(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ModifyPostResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ModifyPostResponse): ModifyPostResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ModifyPostResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ModifyPostResponse;
  static deserializeBinaryFromReader(message: ModifyPostResponse, reader: jspb.BinaryReader): ModifyPostResponse;
}

export namespace ModifyPostResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
    postid: number,
    uploadimageurl: string,
  }
}

export class DeletePostRequest extends jspb.Message {
  getPostid(): number;
  setPostid(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeletePostRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeletePostRequest): DeletePostRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeletePostRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeletePostRequest;
  static deserializeBinaryFromReader(message: DeletePostRequest, reader: jspb.BinaryReader): DeletePostRequest;
}

export namespace DeletePostRequest {
  export type AsObject = {
    postid: number,
  }
}

export class DeletePostResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  getPostid(): number;
  setPostid(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeletePostResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeletePostResponse): DeletePostResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeletePostResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeletePostResponse;
  static deserializeBinaryFromReader(message: DeletePostResponse, reader: jspb.BinaryReader): DeletePostResponse;
}

export namespace DeletePostResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
    postid: number,
  }
}

export class CreateCommentRequest extends jspb.Message {
  getAuthor(): string;
  setAuthor(value: string): void;

  getPostid(): number;
  setPostid(value: number): void;

  getContent(): string;
  setContent(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateCommentRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreateCommentRequest): CreateCommentRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CreateCommentRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateCommentRequest;
  static deserializeBinaryFromReader(message: CreateCommentRequest, reader: jspb.BinaryReader): CreateCommentRequest;
}

export namespace CreateCommentRequest {
  export type AsObject = {
    author: string,
    postid: number,
    content: string,
  }
}

export class CreateCommentResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  getCommentid(): number;
  setCommentid(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateCommentResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CreateCommentResponse): CreateCommentResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CreateCommentResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateCommentResponse;
  static deserializeBinaryFromReader(message: CreateCommentResponse, reader: jspb.BinaryReader): CreateCommentResponse;
}

export namespace CreateCommentResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
    commentid: number,
  }
}

export class ModifyCommentRequest extends jspb.Message {
  getCommentid(): number;
  setCommentid(value: number): void;

  getContent(): string;
  setContent(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ModifyCommentRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ModifyCommentRequest): ModifyCommentRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ModifyCommentRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ModifyCommentRequest;
  static deserializeBinaryFromReader(message: ModifyCommentRequest, reader: jspb.BinaryReader): ModifyCommentRequest;
}

export namespace ModifyCommentRequest {
  export type AsObject = {
    commentid: number,
    content: string,
  }
}

export class ModifyCommentResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  getCommentid(): number;
  setCommentid(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ModifyCommentResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ModifyCommentResponse): ModifyCommentResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ModifyCommentResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ModifyCommentResponse;
  static deserializeBinaryFromReader(message: ModifyCommentResponse, reader: jspb.BinaryReader): ModifyCommentResponse;
}

export namespace ModifyCommentResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
    commentid: number,
  }
}

export class DeleteCommentRequest extends jspb.Message {
  getCommentid(): number;
  setCommentid(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteCommentRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteCommentRequest): DeleteCommentRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteCommentRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteCommentRequest;
  static deserializeBinaryFromReader(message: DeleteCommentRequest, reader: jspb.BinaryReader): DeleteCommentRequest;
}

export namespace DeleteCommentRequest {
  export type AsObject = {
    commentid: number,
  }
}

export class DeleteCommentResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteCommentResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteCommentResponse): DeleteCommentResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteCommentResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteCommentResponse;
  static deserializeBinaryFromReader(message: DeleteCommentResponse, reader: jspb.BinaryReader): DeleteCommentResponse;
}

export namespace DeleteCommentResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
  }
}

export class LikePostRequest extends jspb.Message {
  getPostid(): number;
  setPostid(value: number): void;

  getLike(): boolean;
  setLike(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LikePostRequest.AsObject;
  static toObject(includeInstance: boolean, msg: LikePostRequest): LikePostRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LikePostRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LikePostRequest;
  static deserializeBinaryFromReader(message: LikePostRequest, reader: jspb.BinaryReader): LikePostRequest;
}

export namespace LikePostRequest {
  export type AsObject = {
    postid: number,
    like: boolean,
  }
}

export class LikePostResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  hasPost(): boolean;
  clearPost(): void;
  getPost(): PostDto | undefined;
  setPost(value?: PostDto): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LikePostResponse.AsObject;
  static toObject(includeInstance: boolean, msg: LikePostResponse): LikePostResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LikePostResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LikePostResponse;
  static deserializeBinaryFromReader(message: LikePostResponse, reader: jspb.BinaryReader): LikePostResponse;
}

export namespace LikePostResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
    post?: PostDto.AsObject,
  }
}

export class UploadImageResultRequest extends jspb.Message {
  getPostid(): number;
  setPostid(value: number): void;

  getSuccess(): boolean;
  setSuccess(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UploadImageResultRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UploadImageResultRequest): UploadImageResultRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UploadImageResultRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UploadImageResultRequest;
  static deserializeBinaryFromReader(message: UploadImageResultRequest, reader: jspb.BinaryReader): UploadImageResultRequest;
}

export namespace UploadImageResultRequest {
  export type AsObject = {
    postid: number,
    success: boolean,
  }
}

export class UploadImageResultResponse extends jspb.Message {
  getStatus(): PostProtocolStatusMap[keyof PostProtocolStatusMap];
  setStatus(value: PostProtocolStatusMap[keyof PostProtocolStatusMap]): void;

  getPostid(): number;
  setPostid(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UploadImageResultResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UploadImageResultResponse): UploadImageResultResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UploadImageResultResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UploadImageResultResponse;
  static deserializeBinaryFromReader(message: UploadImageResultResponse, reader: jspb.BinaryReader): UploadImageResultResponse;
}

export namespace UploadImageResultResponse {
  export type AsObject = {
    status: PostProtocolStatusMap[keyof PostProtocolStatusMap],
    postid: number,
  }
}

export interface PostProtocolStatusMap {
  SUCCESS: 0;
  NO_POST: 1;
  NO_COMMENT: 2;
  NOT_AUTHORIZED: 3;
  INTERNAL_ERROR: 99;
}

export const PostProtocolStatus: PostProtocolStatusMap;

