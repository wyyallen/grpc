package io.grpc.examples.nameserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: nameService.proto")
public final class NameServiceGrpc {

  private NameServiceGrpc() {}

  public static final String SERVICE_NAME = "nameserver.NameService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetIpByNameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.nameserver.Name,
      io.grpc.examples.nameserver.Ip> METHOD_GET_IP_BY_NAME = getGetIpByNameMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.nameserver.Name,
      io.grpc.examples.nameserver.Ip> getGetIpByNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.nameserver.Name,
      io.grpc.examples.nameserver.Ip> getGetIpByNameMethod() {
    return getGetIpByNameMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.nameserver.Name,
      io.grpc.examples.nameserver.Ip> getGetIpByNameMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.nameserver.Name, io.grpc.examples.nameserver.Ip> getGetIpByNameMethod;
    if ((getGetIpByNameMethod = NameServiceGrpc.getGetIpByNameMethod) == null) {
      synchronized (NameServiceGrpc.class) {
        if ((getGetIpByNameMethod = NameServiceGrpc.getGetIpByNameMethod) == null) {
          NameServiceGrpc.getGetIpByNameMethod = getGetIpByNameMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.nameserver.Name, io.grpc.examples.nameserver.Ip>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "nameserver.NameService", "getIpByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.nameserver.Name.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.nameserver.Ip.getDefaultInstance()))
                  .setSchemaDescriptor(new NameServiceMethodDescriptorSupplier("getIpByName"))
                  .build();
          }
        }
     }
     return getGetIpByNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NameServiceStub newStub(io.grpc.Channel channel) {
    return new NameServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NameServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NameServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NameServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *服务中的方法，根据Name类型的参数获得一个Ip类型的返回值
     * </pre>
     */
    public void getIpByName(io.grpc.examples.nameserver.Name request,
        io.grpc.stub.StreamObserver<io.grpc.examples.nameserver.Ip> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIpByNameMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetIpByNameMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.nameserver.Name,
                io.grpc.examples.nameserver.Ip>(
                  this, METHODID_GET_IP_BY_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class NameServiceStub extends io.grpc.stub.AbstractStub<NameServiceStub> {
    private NameServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NameServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NameServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *服务中的方法，根据Name类型的参数获得一个Ip类型的返回值
     * </pre>
     */
    public void getIpByName(io.grpc.examples.nameserver.Name request,
        io.grpc.stub.StreamObserver<io.grpc.examples.nameserver.Ip> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIpByNameMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NameServiceBlockingStub extends io.grpc.stub.AbstractStub<NameServiceBlockingStub> {
    private NameServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NameServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NameServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *服务中的方法，根据Name类型的参数获得一个Ip类型的返回值
     * </pre>
     */
    public io.grpc.examples.nameserver.Ip getIpByName(io.grpc.examples.nameserver.Name request) {
      return blockingUnaryCall(
          getChannel(), getGetIpByNameMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NameServiceFutureStub extends io.grpc.stub.AbstractStub<NameServiceFutureStub> {
    private NameServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NameServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NameServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *服务中的方法，根据Name类型的参数获得一个Ip类型的返回值
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.nameserver.Ip> getIpByName(
        io.grpc.examples.nameserver.Name request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIpByNameMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_IP_BY_NAME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NameServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_IP_BY_NAME:
          serviceImpl.getIpByName((io.grpc.examples.nameserver.Name) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.nameserver.Ip>) responseObserver);
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

  private static abstract class NameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.nameserver.NameProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NameService");
    }
  }

  private static final class NameServiceFileDescriptorSupplier
      extends NameServiceBaseDescriptorSupplier {
    NameServiceFileDescriptorSupplier() {}
  }

  private static final class NameServiceMethodDescriptorSupplier
      extends NameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NameServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NameServiceFileDescriptorSupplier())
              .addMethod(getGetIpByNameMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
