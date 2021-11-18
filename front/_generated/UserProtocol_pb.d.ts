// package: 
// file: UserProtocol.proto

import * as jspb from "google-protobuf";

export class SignInRequest extends jspb.Message {
  getEmail(): string;
  setEmail(value: string): void;

  getPassword(): string;
  setPassword(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SignInRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SignInRequest): SignInRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SignInRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SignInRequest;
  static deserializeBinaryFromReader(message: SignInRequest, reader: jspb.BinaryReader): SignInRequest;
}

export namespace SignInRequest {
  export type AsObject = {
    email: string,
    password: string,
  }
}

export class SignInResponse extends jspb.Message {
  getStatus(): SignInResponse.SignInStatusMap[keyof SignInResponse.SignInStatusMap];
  setStatus(value: SignInResponse.SignInStatusMap[keyof SignInResponse.SignInStatusMap]): void;

  getNickname(): string;
  setNickname(value: string): void;

  getAvatarid(): string;
  setAvatarid(value: string): void;

  getToken(): string;
  setToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SignInResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SignInResponse): SignInResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SignInResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SignInResponse;
  static deserializeBinaryFromReader(message: SignInResponse, reader: jspb.BinaryReader): SignInResponse;
}

export namespace SignInResponse {
  export type AsObject = {
    status: SignInResponse.SignInStatusMap[keyof SignInResponse.SignInStatusMap],
    nickname: string,
    avatarid: string,
    token: string,
  }

  export interface SignInStatusMap {
    SUCCESS: 0;
    NO_ACCOUNT: 1;
    WRONG_PASSWORD: 2;
    INTERNAL_ERROR: 3;
  }

  export const SignInStatus: SignInStatusMap;
}

export class SignUpRequest extends jspb.Message {
  getEmail(): string;
  setEmail(value: string): void;

  getPassword(): string;
  setPassword(value: string): void;

  getNickname(): string;
  setNickname(value: string): void;

  getGender(): SignUpRequest.GenderMap[keyof SignUpRequest.GenderMap];
  setGender(value: SignUpRequest.GenderMap[keyof SignUpRequest.GenderMap]): void;

  getAvatarid(): string;
  setAvatarid(value: string): void;

  getBirthday(): string;
  setBirthday(value: string): void;

  clearInteresthashtagsList(): void;
  getInteresthashtagsList(): Array<string>;
  setInteresthashtagsList(value: Array<string>): void;
  addInteresthashtags(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SignUpRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SignUpRequest): SignUpRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SignUpRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SignUpRequest;
  static deserializeBinaryFromReader(message: SignUpRequest, reader: jspb.BinaryReader): SignUpRequest;
}

export namespace SignUpRequest {
  export type AsObject = {
    email: string,
    password: string,
    nickname: string,
    gender: SignUpRequest.GenderMap[keyof SignUpRequest.GenderMap],
    avatarid: string,
    birthday: string,
    interesthashtagsList: Array<string>,
  }

  export interface GenderMap {
    MALE: 0;
    FEMALE: 1;
  }

  export const Gender: GenderMap;
}

export class SignUpResponse extends jspb.Message {
  getStatus(): SignUpResponse.SignUpStatusMap[keyof SignUpResponse.SignUpStatusMap];
  setStatus(value: SignUpResponse.SignUpStatusMap[keyof SignUpResponse.SignUpStatusMap]): void;

  getNickname(): string;
  setNickname(value: string): void;

  getAvatarid(): string;
  setAvatarid(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SignUpResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SignUpResponse): SignUpResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SignUpResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SignUpResponse;
  static deserializeBinaryFromReader(message: SignUpResponse, reader: jspb.BinaryReader): SignUpResponse;
}

export namespace SignUpResponse {
  export type AsObject = {
    status: SignUpResponse.SignUpStatusMap[keyof SignUpResponse.SignUpStatusMap],
    nickname: string,
    avatarid: string,
  }

  export interface SignUpStatusMap {
    SUCCESS: 0;
    ACCOUNT_EXISTS: 1;
    INVALID_INPUT: 2;
    INTERNAL_ERROR: 3;
  }

  export const SignUpStatus: SignUpStatusMap;
}

