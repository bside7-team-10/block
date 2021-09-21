// package: 
// file: UserProtocol.proto

var UserProtocol_pb = require("./UserProtocol_pb");
var grpc = require("@improbable-eng/grpc-web").grpc;

var UserProtocol = (function () {
  function UserProtocol() {}
  UserProtocol.serviceName = "UserProtocol";
  return UserProtocol;
}());

UserProtocol.SignIn = {
  methodName: "SignIn",
  service: UserProtocol,
  requestStream: false,
  responseStream: false,
  requestType: UserProtocol_pb.SignInRequest,
  responseType: UserProtocol_pb.SignInResponse
};

UserProtocol.SignUp = {
  methodName: "SignUp",
  service: UserProtocol,
  requestStream: false,
  responseStream: false,
  requestType: UserProtocol_pb.SignUpRequest,
  responseType: UserProtocol_pb.SignUpResponse
};

exports.UserProtocol = UserProtocol;

function UserProtocolClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

UserProtocolClient.prototype.signIn = function signIn(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(UserProtocol.SignIn, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

UserProtocolClient.prototype.signUp = function signUp(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(UserProtocol.SignUp, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

exports.UserProtocolClient = UserProtocolClient;

