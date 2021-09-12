package com.block.server._generated.proto.userservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: UserProtocol.proto")
public final class UserProtocolGrpc {

  private UserProtocolGrpc() {}

  public static final String SERVICE_NAME = "UserProtocol";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.userservice.SignInRequest,
      com.block.server._generated.proto.userservice.SignInResponse> getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignIn",
      requestType = com.block.server._generated.proto.userservice.SignInRequest.class,
      responseType = com.block.server._generated.proto.userservice.SignInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.userservice.SignInRequest,
      com.block.server._generated.proto.userservice.SignInResponse> getSignInMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.userservice.SignInRequest, com.block.server._generated.proto.userservice.SignInResponse> getSignInMethod;
    if ((getSignInMethod = UserProtocolGrpc.getSignInMethod) == null) {
      synchronized (UserProtocolGrpc.class) {
        if ((getSignInMethod = UserProtocolGrpc.getSignInMethod) == null) {
          UserProtocolGrpc.getSignInMethod = getSignInMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.userservice.SignInRequest, com.block.server._generated.proto.userservice.SignInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.userservice.SignInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.userservice.SignInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProtocolMethodDescriptorSupplier("SignIn"))
              .build();
        }
      }
    }
    return getSignInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.userservice.SignUpRequest,
      com.block.server._generated.proto.userservice.SignUpResponse> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignUp",
      requestType = com.block.server._generated.proto.userservice.SignUpRequest.class,
      responseType = com.block.server._generated.proto.userservice.SignUpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.userservice.SignUpRequest,
      com.block.server._generated.proto.userservice.SignUpResponse> getSignUpMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.userservice.SignUpRequest, com.block.server._generated.proto.userservice.SignUpResponse> getSignUpMethod;
    if ((getSignUpMethod = UserProtocolGrpc.getSignUpMethod) == null) {
      synchronized (UserProtocolGrpc.class) {
        if ((getSignUpMethod = UserProtocolGrpc.getSignUpMethod) == null) {
          UserProtocolGrpc.getSignUpMethod = getSignUpMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.userservice.SignUpRequest, com.block.server._generated.proto.userservice.SignUpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.userservice.SignUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.userservice.SignUpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProtocolMethodDescriptorSupplier("SignUp"))
              .build();
        }
      }
    }
    return getSignUpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserProtocolStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProtocolStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProtocolStub>() {
        @java.lang.Override
        public UserProtocolStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProtocolStub(channel, callOptions);
        }
      };
    return UserProtocolStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserProtocolBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProtocolBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProtocolBlockingStub>() {
        @java.lang.Override
        public UserProtocolBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProtocolBlockingStub(channel, callOptions);
        }
      };
    return UserProtocolBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserProtocolFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProtocolFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProtocolFutureStub>() {
        @java.lang.Override
        public UserProtocolFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProtocolFutureStub(channel, callOptions);
        }
      };
    return UserProtocolFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class UserProtocolImplBase implements io.grpc.BindableService {

    /**
     */
    public void signIn(com.block.server._generated.proto.userservice.SignInRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.userservice.SignInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    /**
     */
    public void signUp(com.block.server._generated.proto.userservice.SignUpRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.userservice.SignUpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignInMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.userservice.SignInRequest,
                com.block.server._generated.proto.userservice.SignInResponse>(
                  this, METHODID_SIGN_IN)))
          .addMethod(
            getSignUpMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.userservice.SignUpRequest,
                com.block.server._generated.proto.userservice.SignUpResponse>(
                  this, METHODID_SIGN_UP)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserProtocolStub extends io.grpc.stub.AbstractAsyncStub<UserProtocolStub> {
    private UserProtocolStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProtocolStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProtocolStub(channel, callOptions);
    }

    /**
     */
    public void signIn(com.block.server._generated.proto.userservice.SignInRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.userservice.SignInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signUp(com.block.server._generated.proto.userservice.SignUpRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.userservice.SignUpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserProtocolBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserProtocolBlockingStub> {
    private UserProtocolBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProtocolBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProtocolBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.block.server._generated.proto.userservice.SignInResponse signIn(com.block.server._generated.proto.userservice.SignInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.userservice.SignUpResponse signUp(com.block.server._generated.proto.userservice.SignUpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserProtocolFutureStub extends io.grpc.stub.AbstractFutureStub<UserProtocolFutureStub> {
    private UserProtocolFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProtocolFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProtocolFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.userservice.SignInResponse> signIn(
        com.block.server._generated.proto.userservice.SignInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.userservice.SignUpResponse> signUp(
        com.block.server._generated.proto.userservice.SignUpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_IN = 0;
  private static final int METHODID_SIGN_UP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserProtocolImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserProtocolImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_IN:
          serviceImpl.signIn((com.block.server._generated.proto.userservice.SignInRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.userservice.SignInResponse>) responseObserver);
          break;
        case METHODID_SIGN_UP:
          serviceImpl.signUp((com.block.server._generated.proto.userservice.SignUpRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.userservice.SignUpResponse>) responseObserver);
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

  private static abstract class UserProtocolBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserProtocolBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.block.server._generated.proto.userservice.UserProtocolOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserProtocol");
    }
  }

  private static final class UserProtocolFileDescriptorSupplier
      extends UserProtocolBaseDescriptorSupplier {
    UserProtocolFileDescriptorSupplier() {}
  }

  private static final class UserProtocolMethodDescriptorSupplier
      extends UserProtocolBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserProtocolMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserProtocolGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserProtocolFileDescriptorSupplier())
              .addMethod(getSignInMethod())
              .addMethod(getSignUpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
