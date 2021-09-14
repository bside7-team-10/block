/**
 * @fileoverview gRPC-Web generated client stub for 
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');

const proto = require('./UserProtocol_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.UserProtocolClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.UserProtocolPromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.SignInRequest,
 *   !proto.SignInResponse>}
 */
const methodDescriptor_UserProtocol_SignIn = new grpc.web.MethodDescriptor(
  '/UserProtocol/SignIn',
  grpc.web.MethodType.UNARY,
  proto.SignInRequest,
  proto.SignInResponse,
  /**
   * @param {!proto.SignInRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.SignInResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.SignInRequest,
 *   !proto.SignInResponse>}
 */
const methodInfo_UserProtocol_SignIn = new grpc.web.AbstractClientBase.MethodInfo(
  proto.SignInResponse,
  /**
   * @param {!proto.SignInRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.SignInResponse.deserializeBinary
);


/**
 * @param {!proto.SignInRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.SignInResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.SignInResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.UserProtocolClient.prototype.signIn =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/UserProtocol/SignIn',
      request,
      metadata || {},
      methodDescriptor_UserProtocol_SignIn,
      callback);
};


/**
 * @param {!proto.SignInRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.SignInResponse>}
 *     Promise that resolves to the response
 */
proto.UserProtocolPromiseClient.prototype.signIn =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/UserProtocol/SignIn',
      request,
      metadata || {},
      methodDescriptor_UserProtocol_SignIn);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.SignUpRequest,
 *   !proto.SignUpResponse>}
 */
const methodDescriptor_UserProtocol_SignUp = new grpc.web.MethodDescriptor(
  '/UserProtocol/SignUp',
  grpc.web.MethodType.UNARY,
  proto.SignUpRequest,
  proto.SignUpResponse,
  /**
   * @param {!proto.SignUpRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.SignUpResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.SignUpRequest,
 *   !proto.SignUpResponse>}
 */
const methodInfo_UserProtocol_SignUp = new grpc.web.AbstractClientBase.MethodInfo(
  proto.SignUpResponse,
  /**
   * @param {!proto.SignUpRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.SignUpResponse.deserializeBinary
);


/**
 * @param {!proto.SignUpRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.SignUpResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.SignUpResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.UserProtocolClient.prototype.signUp =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/UserProtocol/SignUp',
      request,
      metadata || {},
      methodDescriptor_UserProtocol_SignUp,
      callback);
};


/**
 * @param {!proto.SignUpRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.SignUpResponse>}
 *     Promise that resolves to the response
 */
proto.UserProtocolPromiseClient.prototype.signUp =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/UserProtocol/SignUp',
      request,
      metadata || {},
      methodDescriptor_UserProtocol_SignUp);
};


module.exports = proto;
