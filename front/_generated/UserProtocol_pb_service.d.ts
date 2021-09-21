// package: 
// file: UserProtocol.proto

import * as UserProtocol_pb from "./UserProtocol_pb";
import {grpc} from "@improbable-eng/grpc-web";

type UserProtocolSignIn = {
  readonly methodName: string;
  readonly service: typeof UserProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof UserProtocol_pb.SignInRequest;
  readonly responseType: typeof UserProtocol_pb.SignInResponse;
};

type UserProtocolSignUp = {
  readonly methodName: string;
  readonly service: typeof UserProtocol;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof UserProtocol_pb.SignUpRequest;
  readonly responseType: typeof UserProtocol_pb.SignUpResponse;
};

export class UserProtocol {
  static readonly serviceName: string;
  static readonly SignIn: UserProtocolSignIn;
  static readonly SignUp: UserProtocolSignUp;
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

export class UserProtocolClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  signIn(
    requestMessage: UserProtocol_pb.SignInRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: UserProtocol_pb.SignInResponse|null) => void
  ): UnaryResponse;
  signIn(
    requestMessage: UserProtocol_pb.SignInRequest,
    callback: (error: ServiceError|null, responseMessage: UserProtocol_pb.SignInResponse|null) => void
  ): UnaryResponse;
  signUp(
    requestMessage: UserProtocol_pb.SignUpRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: UserProtocol_pb.SignUpResponse|null) => void
  ): UnaryResponse;
  signUp(
    requestMessage: UserProtocol_pb.SignUpRequest,
    callback: (error: ServiceError|null, responseMessage: UserProtocol_pb.SignUpResponse|null) => void
  ): UnaryResponse;
}

