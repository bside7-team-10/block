package com.block.server._generated.proto.postservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: PostProtocol.proto")
public final class PostProtocolGrpc {

  private PostProtocolGrpc() {}

  public static final String SERVICE_NAME = "PostProtocol";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.GetPostRequest,
      com.block.server._generated.proto.postservice.GetPostResponse> getGetPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPost",
      requestType = com.block.server._generated.proto.postservice.GetPostRequest.class,
      responseType = com.block.server._generated.proto.postservice.GetPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.GetPostRequest,
      com.block.server._generated.proto.postservice.GetPostResponse> getGetPostMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.GetPostRequest, com.block.server._generated.proto.postservice.GetPostResponse> getGetPostMethod;
    if ((getGetPostMethod = PostProtocolGrpc.getGetPostMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getGetPostMethod = PostProtocolGrpc.getGetPostMethod) == null) {
          PostProtocolGrpc.getGetPostMethod = getGetPostMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.GetPostRequest, com.block.server._generated.proto.postservice.GetPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.GetPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.GetPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("GetPost"))
              .build();
        }
      }
    }
    return getGetPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.GetPostsRequest,
      com.block.server._generated.proto.postservice.GetPostsResponse> getGetPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosts",
      requestType = com.block.server._generated.proto.postservice.GetPostsRequest.class,
      responseType = com.block.server._generated.proto.postservice.GetPostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.GetPostsRequest,
      com.block.server._generated.proto.postservice.GetPostsResponse> getGetPostsMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.GetPostsRequest, com.block.server._generated.proto.postservice.GetPostsResponse> getGetPostsMethod;
    if ((getGetPostsMethod = PostProtocolGrpc.getGetPostsMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getGetPostsMethod = PostProtocolGrpc.getGetPostsMethod) == null) {
          PostProtocolGrpc.getGetPostsMethod = getGetPostsMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.GetPostsRequest, com.block.server._generated.proto.postservice.GetPostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.GetPostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.GetPostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("GetPosts"))
              .build();
        }
      }
    }
    return getGetPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.CreatePostRequest,
      com.block.server._generated.proto.postservice.CreatePostResponse> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = com.block.server._generated.proto.postservice.CreatePostRequest.class,
      responseType = com.block.server._generated.proto.postservice.CreatePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.CreatePostRequest,
      com.block.server._generated.proto.postservice.CreatePostResponse> getCreatePostMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.CreatePostRequest, com.block.server._generated.proto.postservice.CreatePostResponse> getCreatePostMethod;
    if ((getCreatePostMethod = PostProtocolGrpc.getCreatePostMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getCreatePostMethod = PostProtocolGrpc.getCreatePostMethod) == null) {
          PostProtocolGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.CreatePostRequest, com.block.server._generated.proto.postservice.CreatePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.CreatePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.CreatePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("CreatePost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.ModifyPostRequest,
      com.block.server._generated.proto.postservice.ModifyPostResponse> getModifyPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyPost",
      requestType = com.block.server._generated.proto.postservice.ModifyPostRequest.class,
      responseType = com.block.server._generated.proto.postservice.ModifyPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.ModifyPostRequest,
      com.block.server._generated.proto.postservice.ModifyPostResponse> getModifyPostMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.ModifyPostRequest, com.block.server._generated.proto.postservice.ModifyPostResponse> getModifyPostMethod;
    if ((getModifyPostMethod = PostProtocolGrpc.getModifyPostMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getModifyPostMethod = PostProtocolGrpc.getModifyPostMethod) == null) {
          PostProtocolGrpc.getModifyPostMethod = getModifyPostMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.ModifyPostRequest, com.block.server._generated.proto.postservice.ModifyPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.ModifyPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.ModifyPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("ModifyPost"))
              .build();
        }
      }
    }
    return getModifyPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.DeletePostRequest,
      com.block.server._generated.proto.postservice.DeletePostResponse> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = com.block.server._generated.proto.postservice.DeletePostRequest.class,
      responseType = com.block.server._generated.proto.postservice.DeletePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.DeletePostRequest,
      com.block.server._generated.proto.postservice.DeletePostResponse> getDeletePostMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.DeletePostRequest, com.block.server._generated.proto.postservice.DeletePostResponse> getDeletePostMethod;
    if ((getDeletePostMethod = PostProtocolGrpc.getDeletePostMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getDeletePostMethod = PostProtocolGrpc.getDeletePostMethod) == null) {
          PostProtocolGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.DeletePostRequest, com.block.server._generated.proto.postservice.DeletePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.DeletePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.DeletePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("DeletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.CreateCommentRequest,
      com.block.server._generated.proto.postservice.CreateCommentResponse> getCreateCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateComment",
      requestType = com.block.server._generated.proto.postservice.CreateCommentRequest.class,
      responseType = com.block.server._generated.proto.postservice.CreateCommentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.CreateCommentRequest,
      com.block.server._generated.proto.postservice.CreateCommentResponse> getCreateCommentMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.CreateCommentRequest, com.block.server._generated.proto.postservice.CreateCommentResponse> getCreateCommentMethod;
    if ((getCreateCommentMethod = PostProtocolGrpc.getCreateCommentMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getCreateCommentMethod = PostProtocolGrpc.getCreateCommentMethod) == null) {
          PostProtocolGrpc.getCreateCommentMethod = getCreateCommentMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.CreateCommentRequest, com.block.server._generated.proto.postservice.CreateCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.CreateCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.CreateCommentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("CreateComment"))
              .build();
        }
      }
    }
    return getCreateCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.ModifyCommentRequest,
      com.block.server._generated.proto.postservice.ModifyCommentResponse> getModifyCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyComment",
      requestType = com.block.server._generated.proto.postservice.ModifyCommentRequest.class,
      responseType = com.block.server._generated.proto.postservice.ModifyCommentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.ModifyCommentRequest,
      com.block.server._generated.proto.postservice.ModifyCommentResponse> getModifyCommentMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.ModifyCommentRequest, com.block.server._generated.proto.postservice.ModifyCommentResponse> getModifyCommentMethod;
    if ((getModifyCommentMethod = PostProtocolGrpc.getModifyCommentMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getModifyCommentMethod = PostProtocolGrpc.getModifyCommentMethod) == null) {
          PostProtocolGrpc.getModifyCommentMethod = getModifyCommentMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.ModifyCommentRequest, com.block.server._generated.proto.postservice.ModifyCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.ModifyCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.ModifyCommentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("ModifyComment"))
              .build();
        }
      }
    }
    return getModifyCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.DeleteCommentRequest,
      com.block.server._generated.proto.postservice.DeleteCommentResponse> getDeleteCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteComment",
      requestType = com.block.server._generated.proto.postservice.DeleteCommentRequest.class,
      responseType = com.block.server._generated.proto.postservice.DeleteCommentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.DeleteCommentRequest,
      com.block.server._generated.proto.postservice.DeleteCommentResponse> getDeleteCommentMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.DeleteCommentRequest, com.block.server._generated.proto.postservice.DeleteCommentResponse> getDeleteCommentMethod;
    if ((getDeleteCommentMethod = PostProtocolGrpc.getDeleteCommentMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getDeleteCommentMethod = PostProtocolGrpc.getDeleteCommentMethod) == null) {
          PostProtocolGrpc.getDeleteCommentMethod = getDeleteCommentMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.DeleteCommentRequest, com.block.server._generated.proto.postservice.DeleteCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.DeleteCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.DeleteCommentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("DeleteComment"))
              .build();
        }
      }
    }
    return getDeleteCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.LikePostRequest,
      com.block.server._generated.proto.postservice.LikePostResponse> getLikePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LikePost",
      requestType = com.block.server._generated.proto.postservice.LikePostRequest.class,
      responseType = com.block.server._generated.proto.postservice.LikePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.LikePostRequest,
      com.block.server._generated.proto.postservice.LikePostResponse> getLikePostMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.LikePostRequest, com.block.server._generated.proto.postservice.LikePostResponse> getLikePostMethod;
    if ((getLikePostMethod = PostProtocolGrpc.getLikePostMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getLikePostMethod = PostProtocolGrpc.getLikePostMethod) == null) {
          PostProtocolGrpc.getLikePostMethod = getLikePostMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.LikePostRequest, com.block.server._generated.proto.postservice.LikePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LikePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.LikePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.LikePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("LikePost"))
              .build();
        }
      }
    }
    return getLikePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.LikePostRequest,
      com.block.server._generated.proto.postservice.LikePostResponse> getCancelLikePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelLikePost",
      requestType = com.block.server._generated.proto.postservice.LikePostRequest.class,
      responseType = com.block.server._generated.proto.postservice.LikePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.LikePostRequest,
      com.block.server._generated.proto.postservice.LikePostResponse> getCancelLikePostMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.LikePostRequest, com.block.server._generated.proto.postservice.LikePostResponse> getCancelLikePostMethod;
    if ((getCancelLikePostMethod = PostProtocolGrpc.getCancelLikePostMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getCancelLikePostMethod = PostProtocolGrpc.getCancelLikePostMethod) == null) {
          PostProtocolGrpc.getCancelLikePostMethod = getCancelLikePostMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.LikePostRequest, com.block.server._generated.proto.postservice.LikePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelLikePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.LikePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.LikePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("CancelLikePost"))
              .build();
        }
      }
    }
    return getCancelLikePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.UploadImageResultRequest,
      com.block.server._generated.proto.postservice.UploadImageResultResponse> getUploadImageResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadImageResult",
      requestType = com.block.server._generated.proto.postservice.UploadImageResultRequest.class,
      responseType = com.block.server._generated.proto.postservice.UploadImageResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.UploadImageResultRequest,
      com.block.server._generated.proto.postservice.UploadImageResultResponse> getUploadImageResultMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.postservice.UploadImageResultRequest, com.block.server._generated.proto.postservice.UploadImageResultResponse> getUploadImageResultMethod;
    if ((getUploadImageResultMethod = PostProtocolGrpc.getUploadImageResultMethod) == null) {
      synchronized (PostProtocolGrpc.class) {
        if ((getUploadImageResultMethod = PostProtocolGrpc.getUploadImageResultMethod) == null) {
          PostProtocolGrpc.getUploadImageResultMethod = getUploadImageResultMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.postservice.UploadImageResultRequest, com.block.server._generated.proto.postservice.UploadImageResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadImageResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.UploadImageResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.postservice.UploadImageResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostProtocolMethodDescriptorSupplier("UploadImageResult"))
              .build();
        }
      }
    }
    return getUploadImageResultMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostProtocolStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostProtocolStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostProtocolStub>() {
        @java.lang.Override
        public PostProtocolStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostProtocolStub(channel, callOptions);
        }
      };
    return PostProtocolStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostProtocolBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostProtocolBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostProtocolBlockingStub>() {
        @java.lang.Override
        public PostProtocolBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostProtocolBlockingStub(channel, callOptions);
        }
      };
    return PostProtocolBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostProtocolFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostProtocolFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostProtocolFutureStub>() {
        @java.lang.Override
        public PostProtocolFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostProtocolFutureStub(channel, callOptions);
        }
      };
    return PostProtocolFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class PostProtocolImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPost(com.block.server._generated.proto.postservice.GetPostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.GetPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostMethod(), responseObserver);
    }

    /**
     */
    public void getPosts(com.block.server._generated.proto.postservice.GetPostsRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.GetPostsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostsMethod(), responseObserver);
    }

    /**
     */
    public void createPost(com.block.server._generated.proto.postservice.CreatePostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.CreatePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     */
    public void modifyPost(com.block.server._generated.proto.postservice.ModifyPostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.ModifyPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyPostMethod(), responseObserver);
    }

    /**
     */
    public void deletePost(com.block.server._generated.proto.postservice.DeletePostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.DeletePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     */
    public void createComment(com.block.server._generated.proto.postservice.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.CreateCommentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommentMethod(), responseObserver);
    }

    /**
     */
    public void modifyComment(com.block.server._generated.proto.postservice.ModifyCommentRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.ModifyCommentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyCommentMethod(), responseObserver);
    }

    /**
     */
    public void deleteComment(com.block.server._generated.proto.postservice.DeleteCommentRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.DeleteCommentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommentMethod(), responseObserver);
    }

    /**
     */
    public void likePost(com.block.server._generated.proto.postservice.LikePostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.LikePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLikePostMethod(), responseObserver);
    }

    /**
     */
    public void cancelLikePost(com.block.server._generated.proto.postservice.LikePostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.LikePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelLikePostMethod(), responseObserver);
    }

    /**
     */
    public void uploadImageResult(com.block.server._generated.proto.postservice.UploadImageResultRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.UploadImageResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadImageResultMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.GetPostRequest,
                com.block.server._generated.proto.postservice.GetPostResponse>(
                  this, METHODID_GET_POST)))
          .addMethod(
            getGetPostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.GetPostsRequest,
                com.block.server._generated.proto.postservice.GetPostsResponse>(
                  this, METHODID_GET_POSTS)))
          .addMethod(
            getCreatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.CreatePostRequest,
                com.block.server._generated.proto.postservice.CreatePostResponse>(
                  this, METHODID_CREATE_POST)))
          .addMethod(
            getModifyPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.ModifyPostRequest,
                com.block.server._generated.proto.postservice.ModifyPostResponse>(
                  this, METHODID_MODIFY_POST)))
          .addMethod(
            getDeletePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.DeletePostRequest,
                com.block.server._generated.proto.postservice.DeletePostResponse>(
                  this, METHODID_DELETE_POST)))
          .addMethod(
            getCreateCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.CreateCommentRequest,
                com.block.server._generated.proto.postservice.CreateCommentResponse>(
                  this, METHODID_CREATE_COMMENT)))
          .addMethod(
            getModifyCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.ModifyCommentRequest,
                com.block.server._generated.proto.postservice.ModifyCommentResponse>(
                  this, METHODID_MODIFY_COMMENT)))
          .addMethod(
            getDeleteCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.DeleteCommentRequest,
                com.block.server._generated.proto.postservice.DeleteCommentResponse>(
                  this, METHODID_DELETE_COMMENT)))
          .addMethod(
            getLikePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.LikePostRequest,
                com.block.server._generated.proto.postservice.LikePostResponse>(
                  this, METHODID_LIKE_POST)))
          .addMethod(
            getCancelLikePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.LikePostRequest,
                com.block.server._generated.proto.postservice.LikePostResponse>(
                  this, METHODID_CANCEL_LIKE_POST)))
          .addMethod(
            getUploadImageResultMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.postservice.UploadImageResultRequest,
                com.block.server._generated.proto.postservice.UploadImageResultResponse>(
                  this, METHODID_UPLOAD_IMAGE_RESULT)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class PostProtocolStub extends io.grpc.stub.AbstractAsyncStub<PostProtocolStub> {
    private PostProtocolStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostProtocolStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostProtocolStub(channel, callOptions);
    }

    /**
     */
    public void getPost(com.block.server._generated.proto.postservice.GetPostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.GetPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPosts(com.block.server._generated.proto.postservice.GetPostsRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.GetPostsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPost(com.block.server._generated.proto.postservice.CreatePostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.CreatePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyPost(com.block.server._generated.proto.postservice.ModifyPostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.ModifyPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(com.block.server._generated.proto.postservice.DeletePostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.DeletePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createComment(com.block.server._generated.proto.postservice.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.CreateCommentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyComment(com.block.server._generated.proto.postservice.ModifyCommentRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.ModifyCommentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteComment(com.block.server._generated.proto.postservice.DeleteCommentRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.DeleteCommentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void likePost(com.block.server._generated.proto.postservice.LikePostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.LikePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLikePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelLikePost(com.block.server._generated.proto.postservice.LikePostRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.LikePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelLikePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadImageResult(com.block.server._generated.proto.postservice.UploadImageResultRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.UploadImageResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadImageResultMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class PostProtocolBlockingStub extends io.grpc.stub.AbstractBlockingStub<PostProtocolBlockingStub> {
    private PostProtocolBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostProtocolBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostProtocolBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.GetPostResponse getPost(com.block.server._generated.proto.postservice.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.GetPostsResponse getPosts(com.block.server._generated.proto.postservice.GetPostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.CreatePostResponse createPost(com.block.server._generated.proto.postservice.CreatePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.ModifyPostResponse modifyPost(com.block.server._generated.proto.postservice.ModifyPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.DeletePostResponse deletePost(com.block.server._generated.proto.postservice.DeletePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.CreateCommentResponse createComment(com.block.server._generated.proto.postservice.CreateCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.ModifyCommentResponse modifyComment(com.block.server._generated.proto.postservice.ModifyCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.DeleteCommentResponse deleteComment(com.block.server._generated.proto.postservice.DeleteCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.LikePostResponse likePost(com.block.server._generated.proto.postservice.LikePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLikePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.LikePostResponse cancelLikePost(com.block.server._generated.proto.postservice.LikePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelLikePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.postservice.UploadImageResultResponse uploadImageResult(com.block.server._generated.proto.postservice.UploadImageResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadImageResultMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class PostProtocolFutureStub extends io.grpc.stub.AbstractFutureStub<PostProtocolFutureStub> {
    private PostProtocolFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostProtocolFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostProtocolFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.GetPostResponse> getPost(
        com.block.server._generated.proto.postservice.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.GetPostsResponse> getPosts(
        com.block.server._generated.proto.postservice.GetPostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.CreatePostResponse> createPost(
        com.block.server._generated.proto.postservice.CreatePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.ModifyPostResponse> modifyPost(
        com.block.server._generated.proto.postservice.ModifyPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.DeletePostResponse> deletePost(
        com.block.server._generated.proto.postservice.DeletePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.CreateCommentResponse> createComment(
        com.block.server._generated.proto.postservice.CreateCommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.ModifyCommentResponse> modifyComment(
        com.block.server._generated.proto.postservice.ModifyCommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.DeleteCommentResponse> deleteComment(
        com.block.server._generated.proto.postservice.DeleteCommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.LikePostResponse> likePost(
        com.block.server._generated.proto.postservice.LikePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLikePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.LikePostResponse> cancelLikePost(
        com.block.server._generated.proto.postservice.LikePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelLikePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.postservice.UploadImageResultResponse> uploadImageResult(
        com.block.server._generated.proto.postservice.UploadImageResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadImageResultMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POST = 0;
  private static final int METHODID_GET_POSTS = 1;
  private static final int METHODID_CREATE_POST = 2;
  private static final int METHODID_MODIFY_POST = 3;
  private static final int METHODID_DELETE_POST = 4;
  private static final int METHODID_CREATE_COMMENT = 5;
  private static final int METHODID_MODIFY_COMMENT = 6;
  private static final int METHODID_DELETE_COMMENT = 7;
  private static final int METHODID_LIKE_POST = 8;
  private static final int METHODID_CANCEL_LIKE_POST = 9;
  private static final int METHODID_UPLOAD_IMAGE_RESULT = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PostProtocolImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PostProtocolImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POST:
          serviceImpl.getPost((com.block.server._generated.proto.postservice.GetPostRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.GetPostResponse>) responseObserver);
          break;
        case METHODID_GET_POSTS:
          serviceImpl.getPosts((com.block.server._generated.proto.postservice.GetPostsRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.GetPostsResponse>) responseObserver);
          break;
        case METHODID_CREATE_POST:
          serviceImpl.createPost((com.block.server._generated.proto.postservice.CreatePostRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.CreatePostResponse>) responseObserver);
          break;
        case METHODID_MODIFY_POST:
          serviceImpl.modifyPost((com.block.server._generated.proto.postservice.ModifyPostRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.ModifyPostResponse>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((com.block.server._generated.proto.postservice.DeletePostRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.DeletePostResponse>) responseObserver);
          break;
        case METHODID_CREATE_COMMENT:
          serviceImpl.createComment((com.block.server._generated.proto.postservice.CreateCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.CreateCommentResponse>) responseObserver);
          break;
        case METHODID_MODIFY_COMMENT:
          serviceImpl.modifyComment((com.block.server._generated.proto.postservice.ModifyCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.ModifyCommentResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMMENT:
          serviceImpl.deleteComment((com.block.server._generated.proto.postservice.DeleteCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.DeleteCommentResponse>) responseObserver);
          break;
        case METHODID_LIKE_POST:
          serviceImpl.likePost((com.block.server._generated.proto.postservice.LikePostRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.LikePostResponse>) responseObserver);
          break;
        case METHODID_CANCEL_LIKE_POST:
          serviceImpl.cancelLikePost((com.block.server._generated.proto.postservice.LikePostRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.LikePostResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_IMAGE_RESULT:
          serviceImpl.uploadImageResult((com.block.server._generated.proto.postservice.UploadImageResultRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.postservice.UploadImageResultResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PostProtocolBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostProtocolBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PostProtocol");
    }
  }

  private static final class PostProtocolFileDescriptorSupplier
      extends PostProtocolBaseDescriptorSupplier {
    PostProtocolFileDescriptorSupplier() {}
  }

  private static final class PostProtocolMethodDescriptorSupplier
      extends PostProtocolBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PostProtocolMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PostProtocolGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostProtocolFileDescriptorSupplier())
              .addMethod(getGetPostMethod())
              .addMethod(getGetPostsMethod())
              .addMethod(getCreatePostMethod())
              .addMethod(getModifyPostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getCreateCommentMethod())
              .addMethod(getModifyCommentMethod())
              .addMethod(getDeleteCommentMethod())
              .addMethod(getLikePostMethod())
              .addMethod(getCancelLikePostMethod())
              .addMethod(getUploadImageResultMethod())
              .build();
        }
      }
    }
    return result;
  }
}
