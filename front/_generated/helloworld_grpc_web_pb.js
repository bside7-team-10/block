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

const proto = require('./helloworld_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.GreeterClient =
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
proto.GreeterPromiseClient =
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
 *   !proto.HelloRequest,
 *   !proto.HelloReply>}
 */
const methodDescriptor_Greeter_SayHello = new grpc.web.MethodDescriptor(
  '/Greeter/SayHello',
  grpc.web.MethodType.UNARY,
  proto.HelloRequest,
  proto.HelloReply,
  /**
   * @param {!proto.HelloRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.HelloRequest,
 *   !proto.HelloReply>}
 */
const methodInfo_Greeter_SayHello = new grpc.web.AbstractClientBase.MethodInfo(
  proto.HelloReply,
  /**
   * @param {!proto.HelloRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.HelloReply.deserializeBinary
);


/**
 * @param {!proto.HelloRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.HelloReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.HelloReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GreeterClient.prototype.sayHello =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Greeter/SayHello',
      request,
      metadata || {},
      methodDescriptor_Greeter_SayHello,
      callback);
};


/**
 * @param {!proto.HelloRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.HelloReply>}
 *     Promise that resolves to the response
 */
proto.GreeterPromiseClient.prototype.sayHello =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Greeter/SayHello',
      request,
      metadata || {},
      methodDescriptor_Greeter_SayHello);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.AddRequest,
 *   !proto.AddReply>}
 */
const methodDescriptor_Greeter_AddTwoNumber = new grpc.web.MethodDescriptor(
  '/Greeter/AddTwoNumber',
  grpc.web.MethodType.UNARY,
  proto.AddRequest,
  proto.AddReply,
  /**
   * @param {!proto.AddRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AddReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.AddRequest,
 *   !proto.AddReply>}
 */
const methodInfo_Greeter_AddTwoNumber = new grpc.web.AbstractClientBase.MethodInfo(
  proto.AddReply,
  /**
   * @param {!proto.AddRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.AddReply.deserializeBinary
);


/**
 * @param {!proto.AddRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.AddReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.AddReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GreeterClient.prototype.addTwoNumber =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Greeter/AddTwoNumber',
      request,
      metadata || {},
      methodDescriptor_Greeter_AddTwoNumber,
      callback);
};


/**
 * @param {!proto.AddRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.AddReply>}
 *     Promise that resolves to the response
 */
proto.GreeterPromiseClient.prototype.addTwoNumber =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Greeter/AddTwoNumber',
      request,
      metadata || {},
      methodDescriptor_Greeter_AddTwoNumber);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.MultiplyRequest,
 *   !proto.MultiplyResponse>}
 */
const methodDescriptor_Greeter_Multiply = new grpc.web.MethodDescriptor(
  '/Greeter/Multiply',
  grpc.web.MethodType.UNARY,
  proto.MultiplyRequest,
  proto.MultiplyResponse,
  /**
   * @param {!proto.MultiplyRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.MultiplyResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.MultiplyRequest,
 *   !proto.MultiplyResponse>}
 */
const methodInfo_Greeter_Multiply = new grpc.web.AbstractClientBase.MethodInfo(
  proto.MultiplyResponse,
  /**
   * @param {!proto.MultiplyRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.MultiplyResponse.deserializeBinary
);


/**
 * @param {!proto.MultiplyRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.MultiplyResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.MultiplyResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.GreeterClient.prototype.multiply =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Greeter/Multiply',
      request,
      metadata || {},
      methodDescriptor_Greeter_Multiply,
      callback);
};


/**
 * @param {!proto.MultiplyRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.MultiplyResponse>}
 *     Promise that resolves to the response
 */
proto.GreeterPromiseClient.prototype.multiply =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Greeter/Multiply',
      request,
      metadata || {},
      methodDescriptor_Greeter_Multiply);
};


module.exports = proto;

