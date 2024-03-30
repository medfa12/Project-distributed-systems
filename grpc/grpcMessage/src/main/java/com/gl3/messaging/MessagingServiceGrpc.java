package com.gl3.messaging;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: messaging_service.proto")
public final class MessagingServiceGrpc {

  private MessagingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gl3.messaging.MessagingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest,
      com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest.class,
      responseType = com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest,
      com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest, com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = MessagingServiceGrpc.getSendMessageMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getSendMessageMethod = MessagingServiceGrpc.getSendMessageMethod) == null) {
          MessagingServiceGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest, com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.gl3.messaging.MessagingService", "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("SendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest,
      com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse> getGetMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessages",
      requestType = com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest.class,
      responseType = com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest,
      com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse> getGetMessagesMethod() {
    io.grpc.MethodDescriptor<com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest, com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse> getGetMessagesMethod;
    if ((getGetMessagesMethod = MessagingServiceGrpc.getGetMessagesMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getGetMessagesMethod = MessagingServiceGrpc.getGetMessagesMethod) == null) {
          MessagingServiceGrpc.getGetMessagesMethod = getGetMessagesMethod = 
              io.grpc.MethodDescriptor.<com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest, com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.gl3.messaging.MessagingService", "GetMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("GetMessages"))
                  .build();
          }
        }
     }
     return getGetMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagingServiceStub newStub(io.grpc.Channel channel) {
    return new MessagingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessagingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessagingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MessagingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendMessage(com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest request,
        io.grpc.stub.StreamObserver<com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     */
    public void getMessages(com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest request,
        io.grpc.stub.StreamObserver<com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMessagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest,
                com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getGetMessagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest,
                com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse>(
                  this, METHODID_GET_MESSAGES)))
          .build();
    }
  }

  /**
   */
  public static final class MessagingServiceStub extends io.grpc.stub.AbstractStub<MessagingServiceStub> {
    private MessagingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendMessage(com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest request,
        io.grpc.stub.StreamObserver<com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessages(com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest request,
        io.grpc.stub.StreamObserver<com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessagingServiceBlockingStub extends io.grpc.stub.AbstractStub<MessagingServiceBlockingStub> {
    private MessagingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse sendMessage(com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse getMessages(com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessagingServiceFutureStub extends io.grpc.stub.AbstractStub<MessagingServiceFutureStub> {
    private MessagingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse> sendMessage(
        com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse> getMessages(
        com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_GET_MESSAGES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessagingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessagingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse>) responseObserver);
          break;
        case METHODID_GET_MESSAGES:
          serviceImpl.getMessages((com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest) request,
              (io.grpc.stub.StreamObserver<com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse>) responseObserver);
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

  private static abstract class MessagingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gl3.messaging.MessagingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessagingService");
    }
  }

  private static final class MessagingServiceFileDescriptorSupplier
      extends MessagingServiceBaseDescriptorSupplier {
    MessagingServiceFileDescriptorSupplier() {}
  }

  private static final class MessagingServiceMethodDescriptorSupplier
      extends MessagingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessagingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessagingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagingServiceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .addMethod(getGetMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
