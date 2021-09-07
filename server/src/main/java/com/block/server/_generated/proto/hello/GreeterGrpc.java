package com.block.server._generated.proto.hello;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.hello.HelloRequest,
      com.block.server._generated.proto.hello.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.block.server._generated.proto.hello.HelloRequest.class,
      responseType = com.block.server._generated.proto.hello.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.hello.HelloRequest,
      com.block.server._generated.proto.hello.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.hello.HelloRequest, com.block.server._generated.proto.hello.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.hello.HelloRequest, com.block.server._generated.proto.hello.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.hello.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.hello.AddRequest,
      com.block.server._generated.proto.hello.AddReply> getAddTwoNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTwoNumber",
      requestType = com.block.server._generated.proto.hello.AddRequest.class,
      responseType = com.block.server._generated.proto.hello.AddReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.hello.AddRequest,
      com.block.server._generated.proto.hello.AddReply> getAddTwoNumberMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.hello.AddRequest, com.block.server._generated.proto.hello.AddReply> getAddTwoNumberMethod;
    if ((getAddTwoNumberMethod = GreeterGrpc.getAddTwoNumberMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getAddTwoNumberMethod = GreeterGrpc.getAddTwoNumberMethod) == null) {
          GreeterGrpc.getAddTwoNumberMethod = getAddTwoNumberMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.hello.AddRequest, com.block.server._generated.proto.hello.AddReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTwoNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.hello.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.hello.AddReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("AddTwoNumber"))
              .build();
        }
      }
    }
    return getAddTwoNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.block.server._generated.proto.hello.MultiplyRequest,
      com.block.server._generated.proto.hello.MultiplyResponse> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Multiply",
      requestType = com.block.server._generated.proto.hello.MultiplyRequest.class,
      responseType = com.block.server._generated.proto.hello.MultiplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.block.server._generated.proto.hello.MultiplyRequest,
      com.block.server._generated.proto.hello.MultiplyResponse> getMultiplyMethod() {
    io.grpc.MethodDescriptor<com.block.server._generated.proto.hello.MultiplyRequest, com.block.server._generated.proto.hello.MultiplyResponse> getMultiplyMethod;
    if ((getMultiplyMethod = GreeterGrpc.getMultiplyMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getMultiplyMethod = GreeterGrpc.getMultiplyMethod) == null) {
          GreeterGrpc.getMultiplyMethod = getMultiplyMethod =
              io.grpc.MethodDescriptor.<com.block.server._generated.proto.hello.MultiplyRequest, com.block.server._generated.proto.hello.MultiplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.hello.MultiplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.block.server._generated.proto.hello.MultiplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("Multiply"))
              .build();
        }
      }
    }
    return getMultiplyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.block.server._generated.proto.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.hello.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void addTwoNumber(com.block.server._generated.proto.hello.AddRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.hello.AddReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTwoNumberMethod(), responseObserver);
    }

    /**
     */
    public void multiply(com.block.server._generated.proto.hello.MultiplyRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.hello.MultiplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.hello.HelloRequest,
                com.block.server._generated.proto.hello.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getAddTwoNumberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.hello.AddRequest,
                com.block.server._generated.proto.hello.AddReply>(
                  this, METHODID_ADD_TWO_NUMBER)))
          .addMethod(
            getMultiplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.block.server._generated.proto.hello.MultiplyRequest,
                com.block.server._generated.proto.hello.MultiplyResponse>(
                  this, METHODID_MULTIPLY)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.block.server._generated.proto.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.hello.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTwoNumber(com.block.server._generated.proto.hello.AddRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.hello.AddReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTwoNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiply(com.block.server._generated.proto.hello.MultiplyRequest request,
        io.grpc.stub.StreamObserver<com.block.server._generated.proto.hello.MultiplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.block.server._generated.proto.hello.HelloReply sayHello(com.block.server._generated.proto.hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.hello.AddReply addTwoNumber(com.block.server._generated.proto.hello.AddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTwoNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.block.server._generated.proto.hello.MultiplyResponse multiply(com.block.server._generated.proto.hello.MultiplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.hello.HelloReply> sayHello(
        com.block.server._generated.proto.hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.hello.AddReply> addTwoNumber(
        com.block.server._generated.proto.hello.AddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTwoNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.block.server._generated.proto.hello.MultiplyResponse> multiply(
        com.block.server._generated.proto.hello.MultiplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_ADD_TWO_NUMBER = 1;
  private static final int METHODID_MULTIPLY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.block.server._generated.proto.hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.hello.HelloReply>) responseObserver);
          break;
        case METHODID_ADD_TWO_NUMBER:
          serviceImpl.addTwoNumber((com.block.server._generated.proto.hello.AddRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.hello.AddReply>) responseObserver);
          break;
        case METHODID_MULTIPLY:
          serviceImpl.multiply((com.block.server._generated.proto.hello.MultiplyRequest) request,
              (io.grpc.stub.StreamObserver<com.block.server._generated.proto.hello.MultiplyResponse>) responseObserver);
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

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.block.server._generated.proto.hello.Helloworld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getAddTwoNumberMethod())
              .addMethod(getMultiplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
