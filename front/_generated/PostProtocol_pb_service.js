// package: 
// file: PostProtocol.proto

var PostProtocol_pb = require("./PostProtocol_pb");
var grpc = require("@improbable-eng/grpc-web").grpc;

var PostProtocol = (function () {
  function PostProtocol() {}
  PostProtocol.serviceName = "PostProtocol";
  return PostProtocol;
}());

PostProtocol.GetPost = {
  methodName: "GetPost",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.GetPostRequest,
  responseType: PostProtocol_pb.GetPostResponse
};

PostProtocol.GetPosts = {
  methodName: "GetPosts",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.GetPostsRequest,
  responseType: PostProtocol_pb.GetPostsResponse
};

PostProtocol.CreatePost = {
  methodName: "CreatePost",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.CreatePostRequest,
  responseType: PostProtocol_pb.CreatePostResponse
};

PostProtocol.ModifyPost = {
  methodName: "ModifyPost",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.ModifyPostRequest,
  responseType: PostProtocol_pb.ModifyPostResponse
};

PostProtocol.DeletePost = {
  methodName: "DeletePost",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.DeletePostRequest,
  responseType: PostProtocol_pb.DeletePostResponse
};

PostProtocol.CreateComment = {
  methodName: "CreateComment",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.CreateCommentRequest,
  responseType: PostProtocol_pb.CreateCommentResponse
};

PostProtocol.ModifyComment = {
  methodName: "ModifyComment",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.ModifyCommentRequest,
  responseType: PostProtocol_pb.ModifyCommentResponse
};

PostProtocol.DeleteComment = {
  methodName: "DeleteComment",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.DeleteCommentRequest,
  responseType: PostProtocol_pb.DeleteCommentResponse
};

PostProtocol.LikePost = {
  methodName: "LikePost",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.LikePostRequest,
  responseType: PostProtocol_pb.LikePostResponse
};

PostProtocol.CancelLikePost = {
  methodName: "CancelLikePost",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.LikePostRequest,
  responseType: PostProtocol_pb.LikePostResponse
};

PostProtocol.UploadImageResult = {
  methodName: "UploadImageResult",
  service: PostProtocol,
  requestStream: false,
  responseStream: false,
  requestType: PostProtocol_pb.UploadImageResultRequest,
  responseType: PostProtocol_pb.UploadImageResultResponse
};

exports.PostProtocol = PostProtocol;

function PostProtocolClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

PostProtocolClient.prototype.getPost = function getPost(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.GetPost, {
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

PostProtocolClient.prototype.getPosts = function getPosts(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.GetPosts, {
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

PostProtocolClient.prototype.createPost = function createPost(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.CreatePost, {
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

PostProtocolClient.prototype.modifyPost = function modifyPost(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.ModifyPost, {
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

PostProtocolClient.prototype.deletePost = function deletePost(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.DeletePost, {
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

PostProtocolClient.prototype.createComment = function createComment(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.CreateComment, {
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

PostProtocolClient.prototype.modifyComment = function modifyComment(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.ModifyComment, {
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

PostProtocolClient.prototype.deleteComment = function deleteComment(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.DeleteComment, {
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

PostProtocolClient.prototype.likePost = function likePost(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.LikePost, {
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

PostProtocolClient.prototype.cancelLikePost = function cancelLikePost(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.CancelLikePost, {
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

PostProtocolClient.prototype.uploadImageResult = function uploadImageResult(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(PostProtocol.UploadImageResult, {
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

exports.PostProtocolClient = PostProtocolClient;

