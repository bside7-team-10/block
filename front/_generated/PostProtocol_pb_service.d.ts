// package: 
// file: PostProtocol.proto

import * as PostProtocol_pb from "./PostProtocol_pb";
import {grpc} from "@improbable-eng/grpc-web";

type PostProtocolGetPost = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.GetPostRequest;
  readonly responseType: typeof PostProtocol_pb.GetPostResponse;
};

type PostProtocolGetPosts = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.GetPostsRequest;
  readonly responseType: typeof PostProtocol_pb.GetPostsResponse;
};

type PostProtocolCreatePost = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.CreatePostRequest;
  readonly responseType: typeof PostProtocol_pb.CreatePostResponse;
};

type PostProtocolModifyPost = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.ModifyPostRequest;
  readonly responseType: typeof PostProtocol_pb.ModifyPostResponse;
};

type PostProtocolDeletePost = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.DeletePostRequest;
  readonly responseType: typeof PostProtocol_pb.DeletePostResponse;
};

type PostProtocolCreateComment = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.CreateCommentRequest;
  readonly responseType: typeof PostProtocol_pb.CreateCommentResponse;
};

type PostProtocolModifyComment = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.ModifyCommentRequest;
  readonly responseType: typeof PostProtocol_pb.ModifyCommentResponse;
};

type PostProtocolDeleteComment = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.DeleteCommentRequest;
  readonly responseType: typeof PostProtocol_pb.DeleteCommentResponse;
};

type PostProtocolLikePost = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.LikePostRequest;
  readonly responseType: typeof PostProtocol_pb.LikePostResponse;
};

type PostProtocolCancleLikePost = {
  readonly methodName: string;
  readonly service: typeof PostProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof PostProtocol_pb.LikePostRequest;
  readonly responseType: typeof PostProtocol_pb.LikePostResponse;
};

export class PostProtocol {
  static readonly serviceName: string;
  static readonly GetPost: PostProtocolGetPost;
  static readonly GetPosts: PostProtocolGetPosts;
  static readonly CreatePost: PostProtocolCreatePost;
  static readonly ModifyPost: PostProtocolModifyPost;
  static readonly DeletePost: PostProtocolDeletePost;
  static readonly CreateComment: PostProtocolCreateComment;
  static readonly ModifyComment: PostProtocolModifyComment;
  static readonly DeleteComment: PostProtocolDeleteComment;
  static readonly LikePost: PostProtocolLikePost;
  static readonly CancleLikePost: PostProtocolCancleLikePost;
}

export type ServiceError = { message: string, code: number; metadata: grpc.Metadata }
export type Status = { details: string, code: number; metadata: grpc.Metadata }

interface UnaryResponse {
  cancel(): void;
}
interface ResponseStream<T> {
  cancel(): void;
  on(type: 'data', handler: (message: T) => void): ResponseStream<T>;
  on(type: 'end', handler: (status?: Status) => void): ResponseStream<T>;
  on(type: 'status', handler: (status: Status) => void): ResponseStream<T>;
}
interface RequestStream<T> {
  write(message: T): RequestStream<T>;
  end(): void;
  cancel(): void;
  on(type: 'end', handler: (status?: Status) => void): RequestStream<T>;
  on(type: 'status', handler: (status: Status) => void): RequestStream<T>;
}
interface BidirectionalStream<ReqT, ResT> {
  write(message: ReqT): BidirectionalStream<ReqT, ResT>;
  end(): void;
  cancel(): void;
  on(type: 'data', handler: (message: ResT) => void): BidirectionalStream<ReqT, ResT>;
  on(type: 'end', handler: (status?: Status) => void): BidirectionalStream<ReqT, ResT>;
  on(type: 'status', handler: (status: Status) => void): BidirectionalStream<ReqT, ResT>;
}

export class PostProtocolClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  getPost(
    requestMessage: PostProtocol_pb.GetPostRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.GetPostResponse|null) => void
  ): UnaryResponse;
  getPost(
    requestMessage: PostProtocol_pb.GetPostRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.GetPostResponse|null) => void
  ): UnaryResponse;
  getPosts(
    requestMessage: PostProtocol_pb.GetPostsRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.GetPostsResponse|null) => void
  ): UnaryResponse;
  getPosts(
    requestMessage: PostProtocol_pb.GetPostsRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.GetPostsResponse|null) => void
  ): UnaryResponse;
  createPost(
    requestMessage: PostProtocol_pb.CreatePostRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.CreatePostResponse|null) => void
  ): UnaryResponse;
  createPost(
    requestMessage: PostProtocol_pb.CreatePostRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.CreatePostResponse|null) => void
  ): UnaryResponse;
  modifyPost(
    requestMessage: PostProtocol_pb.ModifyPostRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.ModifyPostResponse|null) => void
  ): UnaryResponse;
  modifyPost(
    requestMessage: PostProtocol_pb.ModifyPostRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.ModifyPostResponse|null) => void
  ): UnaryResponse;
  deletePost(
    requestMessage: PostProtocol_pb.DeletePostRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.DeletePostResponse|null) => void
  ): UnaryResponse;
  deletePost(
    requestMessage: PostProtocol_pb.DeletePostRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.DeletePostResponse|null) => void
  ): UnaryResponse;
  createComment(
    requestMessage: PostProtocol_pb.CreateCommentRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.CreateCommentResponse|null) => void
  ): UnaryResponse;
  createComment(
    requestMessage: PostProtocol_pb.CreateCommentRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.CreateCommentResponse|null) => void
  ): UnaryResponse;
  modifyComment(
    requestMessage: PostProtocol_pb.ModifyCommentRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.ModifyCommentResponse|null) => void
  ): UnaryResponse;
  modifyComment(
    requestMessage: PostProtocol_pb.ModifyCommentRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.ModifyCommentResponse|null) => void
  ): UnaryResponse;
  deleteComment(
    requestMessage: PostProtocol_pb.DeleteCommentRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.DeleteCommentResponse|null) => void
  ): UnaryResponse;
  deleteComment(
    requestMessage: PostProtocol_pb.DeleteCommentRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.DeleteCommentResponse|null) => void
  ): UnaryResponse;
  likePost(
    requestMessage: PostProtocol_pb.LikePostRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.LikePostResponse|null) => void
  ): UnaryResponse;
  likePost(
    requestMessage: PostProtocol_pb.LikePostRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.LikePostResponse|null) => void
  ): UnaryResponse;
  cancleLikePost(
    requestMessage: PostProtocol_pb.LikePostRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.LikePostResponse|null) => void
  ): UnaryResponse;
  cancleLikePost(
    requestMessage: PostProtocol_pb.LikePostRequest,
    callback: (error: ServiceError|null, responseMessage: PostProtocol_pb.LikePostResponse|null) => void
  ): UnaryResponse;
}

