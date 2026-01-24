package com.terraform.plugin.v6;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *&#47;///// Information about what a provider supports/expects
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ProviderGrpc {

  private ProviderGrpc() {}

  public static final java.lang.String SERVICE_NAME = "tfplugin6.Provider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetMetadata.Request,
      com.terraform.plugin.v6.GetMetadata.Response> getGetMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetadata",
      requestType = com.terraform.plugin.v6.GetMetadata.Request.class,
      responseType = com.terraform.plugin.v6.GetMetadata.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetMetadata.Request,
      com.terraform.plugin.v6.GetMetadata.Response> getGetMetadataMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetMetadata.Request, com.terraform.plugin.v6.GetMetadata.Response> getGetMetadataMethod;
    if ((getGetMetadataMethod = ProviderGrpc.getGetMetadataMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getGetMetadataMethod = ProviderGrpc.getGetMetadataMethod) == null) {
          ProviderGrpc.getGetMetadataMethod = getGetMetadataMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.GetMetadata.Request, com.terraform.plugin.v6.GetMetadata.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetMetadata.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetMetadata.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("GetMetadata"))
              .build();
        }
      }
    }
    return getGetMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetProviderSchema.Request,
      com.terraform.plugin.v6.GetProviderSchema.Response> getGetProviderSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProviderSchema",
      requestType = com.terraform.plugin.v6.GetProviderSchema.Request.class,
      responseType = com.terraform.plugin.v6.GetProviderSchema.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetProviderSchema.Request,
      com.terraform.plugin.v6.GetProviderSchema.Response> getGetProviderSchemaMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetProviderSchema.Request, com.terraform.plugin.v6.GetProviderSchema.Response> getGetProviderSchemaMethod;
    if ((getGetProviderSchemaMethod = ProviderGrpc.getGetProviderSchemaMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getGetProviderSchemaMethod = ProviderGrpc.getGetProviderSchemaMethod) == null) {
          ProviderGrpc.getGetProviderSchemaMethod = getGetProviderSchemaMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.GetProviderSchema.Request, com.terraform.plugin.v6.GetProviderSchema.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProviderSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetProviderSchema.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetProviderSchema.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("GetProviderSchema"))
              .build();
        }
      }
    }
    return getGetProviderSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateProviderConfig.Request,
      com.terraform.plugin.v6.ValidateProviderConfig.Response> getValidateProviderConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateProviderConfig",
      requestType = com.terraform.plugin.v6.ValidateProviderConfig.Request.class,
      responseType = com.terraform.plugin.v6.ValidateProviderConfig.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateProviderConfig.Request,
      com.terraform.plugin.v6.ValidateProviderConfig.Response> getValidateProviderConfigMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateProviderConfig.Request, com.terraform.plugin.v6.ValidateProviderConfig.Response> getValidateProviderConfigMethod;
    if ((getValidateProviderConfigMethod = ProviderGrpc.getValidateProviderConfigMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getValidateProviderConfigMethod = ProviderGrpc.getValidateProviderConfigMethod) == null) {
          ProviderGrpc.getValidateProviderConfigMethod = getValidateProviderConfigMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ValidateProviderConfig.Request, com.terraform.plugin.v6.ValidateProviderConfig.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateProviderConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateProviderConfig.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateProviderConfig.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ValidateProviderConfig"))
              .build();
        }
      }
    }
    return getValidateProviderConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateResourceConfig.Request,
      com.terraform.plugin.v6.ValidateResourceConfig.Response> getValidateResourceConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateResourceConfig",
      requestType = com.terraform.plugin.v6.ValidateResourceConfig.Request.class,
      responseType = com.terraform.plugin.v6.ValidateResourceConfig.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateResourceConfig.Request,
      com.terraform.plugin.v6.ValidateResourceConfig.Response> getValidateResourceConfigMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateResourceConfig.Request, com.terraform.plugin.v6.ValidateResourceConfig.Response> getValidateResourceConfigMethod;
    if ((getValidateResourceConfigMethod = ProviderGrpc.getValidateResourceConfigMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getValidateResourceConfigMethod = ProviderGrpc.getValidateResourceConfigMethod) == null) {
          ProviderGrpc.getValidateResourceConfigMethod = getValidateResourceConfigMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ValidateResourceConfig.Request, com.terraform.plugin.v6.ValidateResourceConfig.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateResourceConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateResourceConfig.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateResourceConfig.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ValidateResourceConfig"))
              .build();
        }
      }
    }
    return getValidateResourceConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateDataResourceConfig.Request,
      com.terraform.plugin.v6.ValidateDataResourceConfig.Response> getValidateDataResourceConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateDataResourceConfig",
      requestType = com.terraform.plugin.v6.ValidateDataResourceConfig.Request.class,
      responseType = com.terraform.plugin.v6.ValidateDataResourceConfig.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateDataResourceConfig.Request,
      com.terraform.plugin.v6.ValidateDataResourceConfig.Response> getValidateDataResourceConfigMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateDataResourceConfig.Request, com.terraform.plugin.v6.ValidateDataResourceConfig.Response> getValidateDataResourceConfigMethod;
    if ((getValidateDataResourceConfigMethod = ProviderGrpc.getValidateDataResourceConfigMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getValidateDataResourceConfigMethod = ProviderGrpc.getValidateDataResourceConfigMethod) == null) {
          ProviderGrpc.getValidateDataResourceConfigMethod = getValidateDataResourceConfigMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ValidateDataResourceConfig.Request, com.terraform.plugin.v6.ValidateDataResourceConfig.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateDataResourceConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateDataResourceConfig.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateDataResourceConfig.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ValidateDataResourceConfig"))
              .build();
        }
      }
    }
    return getValidateDataResourceConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.UpgradeResourceState.Request,
      com.terraform.plugin.v6.UpgradeResourceState.Response> getUpgradeResourceStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpgradeResourceState",
      requestType = com.terraform.plugin.v6.UpgradeResourceState.Request.class,
      responseType = com.terraform.plugin.v6.UpgradeResourceState.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.UpgradeResourceState.Request,
      com.terraform.plugin.v6.UpgradeResourceState.Response> getUpgradeResourceStateMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.UpgradeResourceState.Request, com.terraform.plugin.v6.UpgradeResourceState.Response> getUpgradeResourceStateMethod;
    if ((getUpgradeResourceStateMethod = ProviderGrpc.getUpgradeResourceStateMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getUpgradeResourceStateMethod = ProviderGrpc.getUpgradeResourceStateMethod) == null) {
          ProviderGrpc.getUpgradeResourceStateMethod = getUpgradeResourceStateMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.UpgradeResourceState.Request, com.terraform.plugin.v6.UpgradeResourceState.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpgradeResourceState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.UpgradeResourceState.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.UpgradeResourceState.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("UpgradeResourceState"))
              .build();
        }
      }
    }
    return getUpgradeResourceStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetResourceIdentitySchemas.Request,
      com.terraform.plugin.v6.GetResourceIdentitySchemas.Response> getGetResourceIdentitySchemasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResourceIdentitySchemas",
      requestType = com.terraform.plugin.v6.GetResourceIdentitySchemas.Request.class,
      responseType = com.terraform.plugin.v6.GetResourceIdentitySchemas.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetResourceIdentitySchemas.Request,
      com.terraform.plugin.v6.GetResourceIdentitySchemas.Response> getGetResourceIdentitySchemasMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetResourceIdentitySchemas.Request, com.terraform.plugin.v6.GetResourceIdentitySchemas.Response> getGetResourceIdentitySchemasMethod;
    if ((getGetResourceIdentitySchemasMethod = ProviderGrpc.getGetResourceIdentitySchemasMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getGetResourceIdentitySchemasMethod = ProviderGrpc.getGetResourceIdentitySchemasMethod) == null) {
          ProviderGrpc.getGetResourceIdentitySchemasMethod = getGetResourceIdentitySchemasMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.GetResourceIdentitySchemas.Request, com.terraform.plugin.v6.GetResourceIdentitySchemas.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetResourceIdentitySchemas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetResourceIdentitySchemas.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetResourceIdentitySchemas.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("GetResourceIdentitySchemas"))
              .build();
        }
      }
    }
    return getGetResourceIdentitySchemasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.UpgradeResourceIdentity.Request,
      com.terraform.plugin.v6.UpgradeResourceIdentity.Response> getUpgradeResourceIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpgradeResourceIdentity",
      requestType = com.terraform.plugin.v6.UpgradeResourceIdentity.Request.class,
      responseType = com.terraform.plugin.v6.UpgradeResourceIdentity.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.UpgradeResourceIdentity.Request,
      com.terraform.plugin.v6.UpgradeResourceIdentity.Response> getUpgradeResourceIdentityMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.UpgradeResourceIdentity.Request, com.terraform.plugin.v6.UpgradeResourceIdentity.Response> getUpgradeResourceIdentityMethod;
    if ((getUpgradeResourceIdentityMethod = ProviderGrpc.getUpgradeResourceIdentityMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getUpgradeResourceIdentityMethod = ProviderGrpc.getUpgradeResourceIdentityMethod) == null) {
          ProviderGrpc.getUpgradeResourceIdentityMethod = getUpgradeResourceIdentityMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.UpgradeResourceIdentity.Request, com.terraform.plugin.v6.UpgradeResourceIdentity.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpgradeResourceIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.UpgradeResourceIdentity.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.UpgradeResourceIdentity.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("UpgradeResourceIdentity"))
              .build();
        }
      }
    }
    return getUpgradeResourceIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ConfigureProvider.Request,
      com.terraform.plugin.v6.ConfigureProvider.Response> getConfigureProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureProvider",
      requestType = com.terraform.plugin.v6.ConfigureProvider.Request.class,
      responseType = com.terraform.plugin.v6.ConfigureProvider.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ConfigureProvider.Request,
      com.terraform.plugin.v6.ConfigureProvider.Response> getConfigureProviderMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ConfigureProvider.Request, com.terraform.plugin.v6.ConfigureProvider.Response> getConfigureProviderMethod;
    if ((getConfigureProviderMethod = ProviderGrpc.getConfigureProviderMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getConfigureProviderMethod = ProviderGrpc.getConfigureProviderMethod) == null) {
          ProviderGrpc.getConfigureProviderMethod = getConfigureProviderMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ConfigureProvider.Request, com.terraform.plugin.v6.ConfigureProvider.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ConfigureProvider.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ConfigureProvider.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ConfigureProvider"))
              .build();
        }
      }
    }
    return getConfigureProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ReadResource.Request,
      com.terraform.plugin.v6.ReadResource.Response> getReadResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadResource",
      requestType = com.terraform.plugin.v6.ReadResource.Request.class,
      responseType = com.terraform.plugin.v6.ReadResource.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ReadResource.Request,
      com.terraform.plugin.v6.ReadResource.Response> getReadResourceMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ReadResource.Request, com.terraform.plugin.v6.ReadResource.Response> getReadResourceMethod;
    if ((getReadResourceMethod = ProviderGrpc.getReadResourceMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getReadResourceMethod = ProviderGrpc.getReadResourceMethod) == null) {
          ProviderGrpc.getReadResourceMethod = getReadResourceMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ReadResource.Request, com.terraform.plugin.v6.ReadResource.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ReadResource.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ReadResource.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ReadResource"))
              .build();
        }
      }
    }
    return getReadResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.PlanResourceChange.Request,
      com.terraform.plugin.v6.PlanResourceChange.Response> getPlanResourceChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlanResourceChange",
      requestType = com.terraform.plugin.v6.PlanResourceChange.Request.class,
      responseType = com.terraform.plugin.v6.PlanResourceChange.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.PlanResourceChange.Request,
      com.terraform.plugin.v6.PlanResourceChange.Response> getPlanResourceChangeMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.PlanResourceChange.Request, com.terraform.plugin.v6.PlanResourceChange.Response> getPlanResourceChangeMethod;
    if ((getPlanResourceChangeMethod = ProviderGrpc.getPlanResourceChangeMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getPlanResourceChangeMethod = ProviderGrpc.getPlanResourceChangeMethod) == null) {
          ProviderGrpc.getPlanResourceChangeMethod = getPlanResourceChangeMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.PlanResourceChange.Request, com.terraform.plugin.v6.PlanResourceChange.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlanResourceChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.PlanResourceChange.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.PlanResourceChange.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("PlanResourceChange"))
              .build();
        }
      }
    }
    return getPlanResourceChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ApplyResourceChange.Request,
      com.terraform.plugin.v6.ApplyResourceChange.Response> getApplyResourceChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyResourceChange",
      requestType = com.terraform.plugin.v6.ApplyResourceChange.Request.class,
      responseType = com.terraform.plugin.v6.ApplyResourceChange.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ApplyResourceChange.Request,
      com.terraform.plugin.v6.ApplyResourceChange.Response> getApplyResourceChangeMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ApplyResourceChange.Request, com.terraform.plugin.v6.ApplyResourceChange.Response> getApplyResourceChangeMethod;
    if ((getApplyResourceChangeMethod = ProviderGrpc.getApplyResourceChangeMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getApplyResourceChangeMethod = ProviderGrpc.getApplyResourceChangeMethod) == null) {
          ProviderGrpc.getApplyResourceChangeMethod = getApplyResourceChangeMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ApplyResourceChange.Request, com.terraform.plugin.v6.ApplyResourceChange.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyResourceChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ApplyResourceChange.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ApplyResourceChange.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ApplyResourceChange"))
              .build();
        }
      }
    }
    return getApplyResourceChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ImportResourceState.Request,
      com.terraform.plugin.v6.ImportResourceState.Response> getImportResourceStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportResourceState",
      requestType = com.terraform.plugin.v6.ImportResourceState.Request.class,
      responseType = com.terraform.plugin.v6.ImportResourceState.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ImportResourceState.Request,
      com.terraform.plugin.v6.ImportResourceState.Response> getImportResourceStateMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ImportResourceState.Request, com.terraform.plugin.v6.ImportResourceState.Response> getImportResourceStateMethod;
    if ((getImportResourceStateMethod = ProviderGrpc.getImportResourceStateMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getImportResourceStateMethod = ProviderGrpc.getImportResourceStateMethod) == null) {
          ProviderGrpc.getImportResourceStateMethod = getImportResourceStateMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ImportResourceState.Request, com.terraform.plugin.v6.ImportResourceState.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportResourceState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ImportResourceState.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ImportResourceState.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ImportResourceState"))
              .build();
        }
      }
    }
    return getImportResourceStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.MoveResourceState.Request,
      com.terraform.plugin.v6.MoveResourceState.Response> getMoveResourceStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveResourceState",
      requestType = com.terraform.plugin.v6.MoveResourceState.Request.class,
      responseType = com.terraform.plugin.v6.MoveResourceState.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.MoveResourceState.Request,
      com.terraform.plugin.v6.MoveResourceState.Response> getMoveResourceStateMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.MoveResourceState.Request, com.terraform.plugin.v6.MoveResourceState.Response> getMoveResourceStateMethod;
    if ((getMoveResourceStateMethod = ProviderGrpc.getMoveResourceStateMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getMoveResourceStateMethod = ProviderGrpc.getMoveResourceStateMethod) == null) {
          ProviderGrpc.getMoveResourceStateMethod = getMoveResourceStateMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.MoveResourceState.Request, com.terraform.plugin.v6.MoveResourceState.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveResourceState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.MoveResourceState.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.MoveResourceState.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("MoveResourceState"))
              .build();
        }
      }
    }
    return getMoveResourceStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ReadDataSource.Request,
      com.terraform.plugin.v6.ReadDataSource.Response> getReadDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadDataSource",
      requestType = com.terraform.plugin.v6.ReadDataSource.Request.class,
      responseType = com.terraform.plugin.v6.ReadDataSource.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ReadDataSource.Request,
      com.terraform.plugin.v6.ReadDataSource.Response> getReadDataSourceMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ReadDataSource.Request, com.terraform.plugin.v6.ReadDataSource.Response> getReadDataSourceMethod;
    if ((getReadDataSourceMethod = ProviderGrpc.getReadDataSourceMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getReadDataSourceMethod = ProviderGrpc.getReadDataSourceMethod) == null) {
          ProviderGrpc.getReadDataSourceMethod = getReadDataSourceMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ReadDataSource.Request, com.terraform.plugin.v6.ReadDataSource.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ReadDataSource.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ReadDataSource.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ReadDataSource"))
              .build();
        }
      }
    }
    return getReadDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.GenerateResourceConfig.Request,
      com.terraform.plugin.v6.GenerateResourceConfig.Response> getGenerateResourceConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateResourceConfig",
      requestType = com.terraform.plugin.v6.GenerateResourceConfig.Request.class,
      responseType = com.terraform.plugin.v6.GenerateResourceConfig.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.GenerateResourceConfig.Request,
      com.terraform.plugin.v6.GenerateResourceConfig.Response> getGenerateResourceConfigMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.GenerateResourceConfig.Request, com.terraform.plugin.v6.GenerateResourceConfig.Response> getGenerateResourceConfigMethod;
    if ((getGenerateResourceConfigMethod = ProviderGrpc.getGenerateResourceConfigMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getGenerateResourceConfigMethod = ProviderGrpc.getGenerateResourceConfigMethod) == null) {
          ProviderGrpc.getGenerateResourceConfigMethod = getGenerateResourceConfigMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.GenerateResourceConfig.Request, com.terraform.plugin.v6.GenerateResourceConfig.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateResourceConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GenerateResourceConfig.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GenerateResourceConfig.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("GenerateResourceConfig"))
              .build();
        }
      }
    }
    return getGenerateResourceConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request,
      com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response> getValidateEphemeralResourceConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateEphemeralResourceConfig",
      requestType = com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request.class,
      responseType = com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request,
      com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response> getValidateEphemeralResourceConfigMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request, com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response> getValidateEphemeralResourceConfigMethod;
    if ((getValidateEphemeralResourceConfigMethod = ProviderGrpc.getValidateEphemeralResourceConfigMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getValidateEphemeralResourceConfigMethod = ProviderGrpc.getValidateEphemeralResourceConfigMethod) == null) {
          ProviderGrpc.getValidateEphemeralResourceConfigMethod = getValidateEphemeralResourceConfigMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request, com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateEphemeralResourceConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ValidateEphemeralResourceConfig"))
              .build();
        }
      }
    }
    return getValidateEphemeralResourceConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.OpenEphemeralResource.Request,
      com.terraform.plugin.v6.OpenEphemeralResource.Response> getOpenEphemeralResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenEphemeralResource",
      requestType = com.terraform.plugin.v6.OpenEphemeralResource.Request.class,
      responseType = com.terraform.plugin.v6.OpenEphemeralResource.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.OpenEphemeralResource.Request,
      com.terraform.plugin.v6.OpenEphemeralResource.Response> getOpenEphemeralResourceMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.OpenEphemeralResource.Request, com.terraform.plugin.v6.OpenEphemeralResource.Response> getOpenEphemeralResourceMethod;
    if ((getOpenEphemeralResourceMethod = ProviderGrpc.getOpenEphemeralResourceMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getOpenEphemeralResourceMethod = ProviderGrpc.getOpenEphemeralResourceMethod) == null) {
          ProviderGrpc.getOpenEphemeralResourceMethod = getOpenEphemeralResourceMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.OpenEphemeralResource.Request, com.terraform.plugin.v6.OpenEphemeralResource.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenEphemeralResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.OpenEphemeralResource.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.OpenEphemeralResource.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("OpenEphemeralResource"))
              .build();
        }
      }
    }
    return getOpenEphemeralResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.RenewEphemeralResource.Request,
      com.terraform.plugin.v6.RenewEphemeralResource.Response> getRenewEphemeralResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenewEphemeralResource",
      requestType = com.terraform.plugin.v6.RenewEphemeralResource.Request.class,
      responseType = com.terraform.plugin.v6.RenewEphemeralResource.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.RenewEphemeralResource.Request,
      com.terraform.plugin.v6.RenewEphemeralResource.Response> getRenewEphemeralResourceMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.RenewEphemeralResource.Request, com.terraform.plugin.v6.RenewEphemeralResource.Response> getRenewEphemeralResourceMethod;
    if ((getRenewEphemeralResourceMethod = ProviderGrpc.getRenewEphemeralResourceMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getRenewEphemeralResourceMethod = ProviderGrpc.getRenewEphemeralResourceMethod) == null) {
          ProviderGrpc.getRenewEphemeralResourceMethod = getRenewEphemeralResourceMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.RenewEphemeralResource.Request, com.terraform.plugin.v6.RenewEphemeralResource.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewEphemeralResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.RenewEphemeralResource.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.RenewEphemeralResource.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("RenewEphemeralResource"))
              .build();
        }
      }
    }
    return getRenewEphemeralResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.CloseEphemeralResource.Request,
      com.terraform.plugin.v6.CloseEphemeralResource.Response> getCloseEphemeralResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseEphemeralResource",
      requestType = com.terraform.plugin.v6.CloseEphemeralResource.Request.class,
      responseType = com.terraform.plugin.v6.CloseEphemeralResource.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.CloseEphemeralResource.Request,
      com.terraform.plugin.v6.CloseEphemeralResource.Response> getCloseEphemeralResourceMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.CloseEphemeralResource.Request, com.terraform.plugin.v6.CloseEphemeralResource.Response> getCloseEphemeralResourceMethod;
    if ((getCloseEphemeralResourceMethod = ProviderGrpc.getCloseEphemeralResourceMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getCloseEphemeralResourceMethod = ProviderGrpc.getCloseEphemeralResourceMethod) == null) {
          ProviderGrpc.getCloseEphemeralResourceMethod = getCloseEphemeralResourceMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.CloseEphemeralResource.Request, com.terraform.plugin.v6.CloseEphemeralResource.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseEphemeralResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.CloseEphemeralResource.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.CloseEphemeralResource.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("CloseEphemeralResource"))
              .build();
        }
      }
    }
    return getCloseEphemeralResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ListResource.Request,
      com.terraform.plugin.v6.ListResource.Event> getListResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResource",
      requestType = com.terraform.plugin.v6.ListResource.Request.class,
      responseType = com.terraform.plugin.v6.ListResource.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ListResource.Request,
      com.terraform.plugin.v6.ListResource.Event> getListResourceMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ListResource.Request, com.terraform.plugin.v6.ListResource.Event> getListResourceMethod;
    if ((getListResourceMethod = ProviderGrpc.getListResourceMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getListResourceMethod = ProviderGrpc.getListResourceMethod) == null) {
          ProviderGrpc.getListResourceMethod = getListResourceMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ListResource.Request, com.terraform.plugin.v6.ListResource.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ListResource.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ListResource.Event.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ListResource"))
              .build();
        }
      }
    }
    return getListResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateListResourceConfig.Request,
      com.terraform.plugin.v6.ValidateListResourceConfig.Response> getValidateListResourceConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateListResourceConfig",
      requestType = com.terraform.plugin.v6.ValidateListResourceConfig.Request.class,
      responseType = com.terraform.plugin.v6.ValidateListResourceConfig.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateListResourceConfig.Request,
      com.terraform.plugin.v6.ValidateListResourceConfig.Response> getValidateListResourceConfigMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateListResourceConfig.Request, com.terraform.plugin.v6.ValidateListResourceConfig.Response> getValidateListResourceConfigMethod;
    if ((getValidateListResourceConfigMethod = ProviderGrpc.getValidateListResourceConfigMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getValidateListResourceConfigMethod = ProviderGrpc.getValidateListResourceConfigMethod) == null) {
          ProviderGrpc.getValidateListResourceConfigMethod = getValidateListResourceConfigMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ValidateListResourceConfig.Request, com.terraform.plugin.v6.ValidateListResourceConfig.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateListResourceConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateListResourceConfig.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateListResourceConfig.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ValidateListResourceConfig"))
              .build();
        }
      }
    }
    return getValidateListResourceConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetFunctions.Request,
      com.terraform.plugin.v6.GetFunctions.Response> getGetFunctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFunctions",
      requestType = com.terraform.plugin.v6.GetFunctions.Request.class,
      responseType = com.terraform.plugin.v6.GetFunctions.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetFunctions.Request,
      com.terraform.plugin.v6.GetFunctions.Response> getGetFunctionsMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetFunctions.Request, com.terraform.plugin.v6.GetFunctions.Response> getGetFunctionsMethod;
    if ((getGetFunctionsMethod = ProviderGrpc.getGetFunctionsMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getGetFunctionsMethod = ProviderGrpc.getGetFunctionsMethod) == null) {
          ProviderGrpc.getGetFunctionsMethod = getGetFunctionsMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.GetFunctions.Request, com.terraform.plugin.v6.GetFunctions.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFunctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetFunctions.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetFunctions.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("GetFunctions"))
              .build();
        }
      }
    }
    return getGetFunctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.CallFunction.Request,
      com.terraform.plugin.v6.CallFunction.Response> getCallFunctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallFunction",
      requestType = com.terraform.plugin.v6.CallFunction.Request.class,
      responseType = com.terraform.plugin.v6.CallFunction.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.CallFunction.Request,
      com.terraform.plugin.v6.CallFunction.Response> getCallFunctionMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.CallFunction.Request, com.terraform.plugin.v6.CallFunction.Response> getCallFunctionMethod;
    if ((getCallFunctionMethod = ProviderGrpc.getCallFunctionMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getCallFunctionMethod = ProviderGrpc.getCallFunctionMethod) == null) {
          ProviderGrpc.getCallFunctionMethod = getCallFunctionMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.CallFunction.Request, com.terraform.plugin.v6.CallFunction.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallFunction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.CallFunction.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.CallFunction.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("CallFunction"))
              .build();
        }
      }
    }
    return getCallFunctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateStateStore.Request,
      com.terraform.plugin.v6.ValidateStateStore.Response> getValidateStateStoreConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateStateStoreConfig",
      requestType = com.terraform.plugin.v6.ValidateStateStore.Request.class,
      responseType = com.terraform.plugin.v6.ValidateStateStore.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateStateStore.Request,
      com.terraform.plugin.v6.ValidateStateStore.Response> getValidateStateStoreConfigMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateStateStore.Request, com.terraform.plugin.v6.ValidateStateStore.Response> getValidateStateStoreConfigMethod;
    if ((getValidateStateStoreConfigMethod = ProviderGrpc.getValidateStateStoreConfigMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getValidateStateStoreConfigMethod = ProviderGrpc.getValidateStateStoreConfigMethod) == null) {
          ProviderGrpc.getValidateStateStoreConfigMethod = getValidateStateStoreConfigMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ValidateStateStore.Request, com.terraform.plugin.v6.ValidateStateStore.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateStateStoreConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateStateStore.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateStateStore.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ValidateStateStoreConfig"))
              .build();
        }
      }
    }
    return getValidateStateStoreConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ConfigureStateStore.Request,
      com.terraform.plugin.v6.ConfigureStateStore.Response> getConfigureStateStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureStateStore",
      requestType = com.terraform.plugin.v6.ConfigureStateStore.Request.class,
      responseType = com.terraform.plugin.v6.ConfigureStateStore.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ConfigureStateStore.Request,
      com.terraform.plugin.v6.ConfigureStateStore.Response> getConfigureStateStoreMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ConfigureStateStore.Request, com.terraform.plugin.v6.ConfigureStateStore.Response> getConfigureStateStoreMethod;
    if ((getConfigureStateStoreMethod = ProviderGrpc.getConfigureStateStoreMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getConfigureStateStoreMethod = ProviderGrpc.getConfigureStateStoreMethod) == null) {
          ProviderGrpc.getConfigureStateStoreMethod = getConfigureStateStoreMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ConfigureStateStore.Request, com.terraform.plugin.v6.ConfigureStateStore.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureStateStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ConfigureStateStore.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ConfigureStateStore.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ConfigureStateStore"))
              .build();
        }
      }
    }
    return getConfigureStateStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ReadStateBytes.Request,
      com.terraform.plugin.v6.ReadStateBytes.Response> getReadStateBytesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadStateBytes",
      requestType = com.terraform.plugin.v6.ReadStateBytes.Request.class,
      responseType = com.terraform.plugin.v6.ReadStateBytes.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ReadStateBytes.Request,
      com.terraform.plugin.v6.ReadStateBytes.Response> getReadStateBytesMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ReadStateBytes.Request, com.terraform.plugin.v6.ReadStateBytes.Response> getReadStateBytesMethod;
    if ((getReadStateBytesMethod = ProviderGrpc.getReadStateBytesMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getReadStateBytesMethod = ProviderGrpc.getReadStateBytesMethod) == null) {
          ProviderGrpc.getReadStateBytesMethod = getReadStateBytesMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ReadStateBytes.Request, com.terraform.plugin.v6.ReadStateBytes.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadStateBytes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ReadStateBytes.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ReadStateBytes.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ReadStateBytes"))
              .build();
        }
      }
    }
    return getReadStateBytesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.WriteStateBytes.RequestChunk,
      com.terraform.plugin.v6.WriteStateBytes.Response> getWriteStateBytesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteStateBytes",
      requestType = com.terraform.plugin.v6.WriteStateBytes.RequestChunk.class,
      responseType = com.terraform.plugin.v6.WriteStateBytes.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.WriteStateBytes.RequestChunk,
      com.terraform.plugin.v6.WriteStateBytes.Response> getWriteStateBytesMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.WriteStateBytes.RequestChunk, com.terraform.plugin.v6.WriteStateBytes.Response> getWriteStateBytesMethod;
    if ((getWriteStateBytesMethod = ProviderGrpc.getWriteStateBytesMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getWriteStateBytesMethod = ProviderGrpc.getWriteStateBytesMethod) == null) {
          ProviderGrpc.getWriteStateBytesMethod = getWriteStateBytesMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.WriteStateBytes.RequestChunk, com.terraform.plugin.v6.WriteStateBytes.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteStateBytes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.WriteStateBytes.RequestChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.WriteStateBytes.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("WriteStateBytes"))
              .build();
        }
      }
    }
    return getWriteStateBytesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.LockState.Request,
      com.terraform.plugin.v6.LockState.Response> getLockStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockState",
      requestType = com.terraform.plugin.v6.LockState.Request.class,
      responseType = com.terraform.plugin.v6.LockState.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.LockState.Request,
      com.terraform.plugin.v6.LockState.Response> getLockStateMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.LockState.Request, com.terraform.plugin.v6.LockState.Response> getLockStateMethod;
    if ((getLockStateMethod = ProviderGrpc.getLockStateMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getLockStateMethod = ProviderGrpc.getLockStateMethod) == null) {
          ProviderGrpc.getLockStateMethod = getLockStateMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.LockState.Request, com.terraform.plugin.v6.LockState.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.LockState.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.LockState.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("LockState"))
              .build();
        }
      }
    }
    return getLockStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.UnlockState.Request,
      com.terraform.plugin.v6.UnlockState.Response> getUnlockStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlockState",
      requestType = com.terraform.plugin.v6.UnlockState.Request.class,
      responseType = com.terraform.plugin.v6.UnlockState.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.UnlockState.Request,
      com.terraform.plugin.v6.UnlockState.Response> getUnlockStateMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.UnlockState.Request, com.terraform.plugin.v6.UnlockState.Response> getUnlockStateMethod;
    if ((getUnlockStateMethod = ProviderGrpc.getUnlockStateMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getUnlockStateMethod = ProviderGrpc.getUnlockStateMethod) == null) {
          ProviderGrpc.getUnlockStateMethod = getUnlockStateMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.UnlockState.Request, com.terraform.plugin.v6.UnlockState.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlockState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.UnlockState.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.UnlockState.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("UnlockState"))
              .build();
        }
      }
    }
    return getUnlockStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetStates.Request,
      com.terraform.plugin.v6.GetStates.Response> getGetStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStates",
      requestType = com.terraform.plugin.v6.GetStates.Request.class,
      responseType = com.terraform.plugin.v6.GetStates.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetStates.Request,
      com.terraform.plugin.v6.GetStates.Response> getGetStatesMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.GetStates.Request, com.terraform.plugin.v6.GetStates.Response> getGetStatesMethod;
    if ((getGetStatesMethod = ProviderGrpc.getGetStatesMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getGetStatesMethod = ProviderGrpc.getGetStatesMethod) == null) {
          ProviderGrpc.getGetStatesMethod = getGetStatesMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.GetStates.Request, com.terraform.plugin.v6.GetStates.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetStates.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.GetStates.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("GetStates"))
              .build();
        }
      }
    }
    return getGetStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.DeleteState.Request,
      com.terraform.plugin.v6.DeleteState.Response> getDeleteStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteState",
      requestType = com.terraform.plugin.v6.DeleteState.Request.class,
      responseType = com.terraform.plugin.v6.DeleteState.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.DeleteState.Request,
      com.terraform.plugin.v6.DeleteState.Response> getDeleteStateMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.DeleteState.Request, com.terraform.plugin.v6.DeleteState.Response> getDeleteStateMethod;
    if ((getDeleteStateMethod = ProviderGrpc.getDeleteStateMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getDeleteStateMethod = ProviderGrpc.getDeleteStateMethod) == null) {
          ProviderGrpc.getDeleteStateMethod = getDeleteStateMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.DeleteState.Request, com.terraform.plugin.v6.DeleteState.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.DeleteState.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.DeleteState.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("DeleteState"))
              .build();
        }
      }
    }
    return getDeleteStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.PlanAction.Request,
      com.terraform.plugin.v6.PlanAction.Response> getPlanActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlanAction",
      requestType = com.terraform.plugin.v6.PlanAction.Request.class,
      responseType = com.terraform.plugin.v6.PlanAction.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.PlanAction.Request,
      com.terraform.plugin.v6.PlanAction.Response> getPlanActionMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.PlanAction.Request, com.terraform.plugin.v6.PlanAction.Response> getPlanActionMethod;
    if ((getPlanActionMethod = ProviderGrpc.getPlanActionMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getPlanActionMethod = ProviderGrpc.getPlanActionMethod) == null) {
          ProviderGrpc.getPlanActionMethod = getPlanActionMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.PlanAction.Request, com.terraform.plugin.v6.PlanAction.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlanAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.PlanAction.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.PlanAction.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("PlanAction"))
              .build();
        }
      }
    }
    return getPlanActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.InvokeAction.Request,
      com.terraform.plugin.v6.InvokeAction.Event> getInvokeActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InvokeAction",
      requestType = com.terraform.plugin.v6.InvokeAction.Request.class,
      responseType = com.terraform.plugin.v6.InvokeAction.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.InvokeAction.Request,
      com.terraform.plugin.v6.InvokeAction.Event> getInvokeActionMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.InvokeAction.Request, com.terraform.plugin.v6.InvokeAction.Event> getInvokeActionMethod;
    if ((getInvokeActionMethod = ProviderGrpc.getInvokeActionMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getInvokeActionMethod = ProviderGrpc.getInvokeActionMethod) == null) {
          ProviderGrpc.getInvokeActionMethod = getInvokeActionMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.InvokeAction.Request, com.terraform.plugin.v6.InvokeAction.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InvokeAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.InvokeAction.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.InvokeAction.Event.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("InvokeAction"))
              .build();
        }
      }
    }
    return getInvokeActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateActionConfig.Request,
      com.terraform.plugin.v6.ValidateActionConfig.Response> getValidateActionConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateActionConfig",
      requestType = com.terraform.plugin.v6.ValidateActionConfig.Request.class,
      responseType = com.terraform.plugin.v6.ValidateActionConfig.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateActionConfig.Request,
      com.terraform.plugin.v6.ValidateActionConfig.Response> getValidateActionConfigMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.ValidateActionConfig.Request, com.terraform.plugin.v6.ValidateActionConfig.Response> getValidateActionConfigMethod;
    if ((getValidateActionConfigMethod = ProviderGrpc.getValidateActionConfigMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getValidateActionConfigMethod = ProviderGrpc.getValidateActionConfigMethod) == null) {
          ProviderGrpc.getValidateActionConfigMethod = getValidateActionConfigMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.ValidateActionConfig.Request, com.terraform.plugin.v6.ValidateActionConfig.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateActionConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateActionConfig.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.ValidateActionConfig.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("ValidateActionConfig"))
              .build();
        }
      }
    }
    return getValidateActionConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.terraform.plugin.v6.StopProvider.Request,
      com.terraform.plugin.v6.StopProvider.Response> getStopProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopProvider",
      requestType = com.terraform.plugin.v6.StopProvider.Request.class,
      responseType = com.terraform.plugin.v6.StopProvider.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.terraform.plugin.v6.StopProvider.Request,
      com.terraform.plugin.v6.StopProvider.Response> getStopProviderMethod() {
    io.grpc.MethodDescriptor<com.terraform.plugin.v6.StopProvider.Request, com.terraform.plugin.v6.StopProvider.Response> getStopProviderMethod;
    if ((getStopProviderMethod = ProviderGrpc.getStopProviderMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getStopProviderMethod = ProviderGrpc.getStopProviderMethod) == null) {
          ProviderGrpc.getStopProviderMethod = getStopProviderMethod =
              io.grpc.MethodDescriptor.<com.terraform.plugin.v6.StopProvider.Request, com.terraform.plugin.v6.StopProvider.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.StopProvider.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.terraform.plugin.v6.StopProvider.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("StopProvider"))
              .build();
        }
      }
    }
    return getStopProviderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProviderStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderStub>() {
        @java.lang.Override
        public ProviderStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderStub(channel, callOptions);
        }
      };
    return ProviderStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProviderBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderBlockingV2Stub>() {
        @java.lang.Override
        public ProviderBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderBlockingV2Stub(channel, callOptions);
        }
      };
    return ProviderBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderBlockingStub>() {
        @java.lang.Override
        public ProviderBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderBlockingStub(channel, callOptions);
        }
      };
    return ProviderBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderFutureStub>() {
        @java.lang.Override
        public ProviderFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderFutureStub(channel, callOptions);
        }
      };
    return ProviderFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *&#47;///// Information about what a provider supports/expects
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetMetadata returns upfront information about server capabilities and
     * supported resource types without requiring the server to instantiate all
     * schema information, which may be memory intensive.
     * This method is CURRENTLY UNUSED and it serves mostly for convenience
     * of code generation inside of terraform-plugin-mux.
     * </pre>
     */
    default void getMetadata(com.terraform.plugin.v6.GetMetadata.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetMetadata.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSchema returns schema information for the provider, data resources,
     * and managed resources.
     * </pre>
     */
    default void getProviderSchema(com.terraform.plugin.v6.GetProviderSchema.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetProviderSchema.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProviderSchemaMethod(), responseObserver);
    }

    /**
     */
    default void validateProviderConfig(com.terraform.plugin.v6.ValidateProviderConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateProviderConfig.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateProviderConfigMethod(), responseObserver);
    }

    /**
     */
    default void validateResourceConfig(com.terraform.plugin.v6.ValidateResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateResourceConfig.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateResourceConfigMethod(), responseObserver);
    }

    /**
     */
    default void validateDataResourceConfig(com.terraform.plugin.v6.ValidateDataResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateDataResourceConfig.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateDataResourceConfigMethod(), responseObserver);
    }

    /**
     */
    default void upgradeResourceState(com.terraform.plugin.v6.UpgradeResourceState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.UpgradeResourceState.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpgradeResourceStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetResourceIdentitySchemas returns the identity schemas for all managed
     * resources.
     * </pre>
     */
    default void getResourceIdentitySchemas(com.terraform.plugin.v6.GetResourceIdentitySchemas.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetResourceIdentitySchemas.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResourceIdentitySchemasMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpgradeResourceIdentityData should return the upgraded resource identity
     * data for a managed resource type.
     * </pre>
     */
    default void upgradeResourceIdentity(com.terraform.plugin.v6.UpgradeResourceIdentity.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.UpgradeResourceIdentity.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpgradeResourceIdentityMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47;///// One-time initialization, called before other functions below
     * </pre>
     */
    default void configureProvider(com.terraform.plugin.v6.ConfigureProvider.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ConfigureProvider.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureProviderMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Managed Resource Lifecycle
     * </pre>
     */
    default void readResource(com.terraform.plugin.v6.ReadResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ReadResource.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadResourceMethod(), responseObserver);
    }

    /**
     */
    default void planResourceChange(com.terraform.plugin.v6.PlanResourceChange.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.PlanResourceChange.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanResourceChangeMethod(), responseObserver);
    }

    /**
     */
    default void applyResourceChange(com.terraform.plugin.v6.ApplyResourceChange.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ApplyResourceChange.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyResourceChangeMethod(), responseObserver);
    }

    /**
     */
    default void importResourceState(com.terraform.plugin.v6.ImportResourceState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ImportResourceState.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportResourceStateMethod(), responseObserver);
    }

    /**
     */
    default void moveResourceState(com.terraform.plugin.v6.MoveResourceState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.MoveResourceState.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveResourceStateMethod(), responseObserver);
    }

    /**
     */
    default void readDataSource(com.terraform.plugin.v6.ReadDataSource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ReadDataSource.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadDataSourceMethod(), responseObserver);
    }

    /**
     */
    default void generateResourceConfig(com.terraform.plugin.v6.GenerateResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GenerateResourceConfig.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateResourceConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Ephemeral Resource Lifecycle
     * </pre>
     */
    default void validateEphemeralResourceConfig(com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateEphemeralResourceConfigMethod(), responseObserver);
    }

    /**
     */
    default void openEphemeralResource(com.terraform.plugin.v6.OpenEphemeralResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.OpenEphemeralResource.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenEphemeralResourceMethod(), responseObserver);
    }

    /**
     */
    default void renewEphemeralResource(com.terraform.plugin.v6.RenewEphemeralResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.RenewEphemeralResource.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewEphemeralResourceMethod(), responseObserver);
    }

    /**
     */
    default void closeEphemeralResource(com.terraform.plugin.v6.CloseEphemeralResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.CloseEphemeralResource.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseEphemeralResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47;//// List
     * </pre>
     */
    default void listResource(com.terraform.plugin.v6.ListResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ListResource.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourceMethod(), responseObserver);
    }

    /**
     */
    default void validateListResourceConfig(com.terraform.plugin.v6.ValidateListResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateListResourceConfig.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateListResourceConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetFunctions returns the definitions of all functions.
     * </pre>
     */
    default void getFunctions(com.terraform.plugin.v6.GetFunctions.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetFunctions.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFunctionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Provider-contributed Functions
     * </pre>
     */
    default void callFunction(com.terraform.plugin.v6.CallFunction.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.CallFunction.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallFunctionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidateStateStoreConfig performs configuration validation
     * </pre>
     */
    default void validateStateStoreConfig(com.terraform.plugin.v6.ValidateStateStore.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateStateStore.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateStateStoreConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConfigureStateStore configures the state store, such as S3 connection in the context of already configured provider
     * </pre>
     */
    default void configureStateStore(com.terraform.plugin.v6.ConfigureStateStore.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ConfigureStateStore.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureStateStoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReadStateBytes streams byte chunks of a given state file from a state store
     * </pre>
     */
    default void readStateBytes(com.terraform.plugin.v6.ReadStateBytes.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ReadStateBytes.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadStateBytesMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteStateBytes streams byte chunks of a given state file into a state store
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.terraform.plugin.v6.WriteStateBytes.RequestChunk> writeStateBytes(
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.WriteStateBytes.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteStateBytesMethod(), responseObserver);
    }

    /**
     * <pre>
     * LockState locks a given state (i.e. CE workspace)
     * </pre>
     */
    default void lockState(com.terraform.plugin.v6.LockState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.LockState.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnlockState unlocks a given state (i.e. CE workspace)
     * </pre>
     */
    default void unlockState(com.terraform.plugin.v6.UnlockState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.UnlockState.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlockStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetStates returns a list of all states (i.e. CE workspaces) managed by a given state store
     * </pre>
     */
    default void getStates(com.terraform.plugin.v6.GetStates.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetStates.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteState instructs a given state store to delete a specific state (i.e. a CE workspace)
     * </pre>
     */
    default void deleteState(com.terraform.plugin.v6.DeleteState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.DeleteState.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStateMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Actions
     * </pre>
     */
    default void planAction(com.terraform.plugin.v6.PlanAction.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.PlanAction.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanActionMethod(), responseObserver);
    }

    /**
     */
    default void invokeAction(com.terraform.plugin.v6.InvokeAction.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.InvokeAction.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInvokeActionMethod(), responseObserver);
    }

    /**
     */
    default void validateActionConfig(com.terraform.plugin.v6.ValidateActionConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateActionConfig.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateActionConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Graceful Shutdown
     * </pre>
     */
    default void stopProvider(com.terraform.plugin.v6.StopProvider.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.StopProvider.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopProviderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Provider.
   * <pre>
   *&#47;///// Information about what a provider supports/expects
   * </pre>
   */
  public static abstract class ProviderImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProviderGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Provider.
   * <pre>
   *&#47;///// Information about what a provider supports/expects
   * </pre>
   */
  public static final class ProviderStub
      extends io.grpc.stub.AbstractAsyncStub<ProviderStub> {
    private ProviderStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMetadata returns upfront information about server capabilities and
     * supported resource types without requiring the server to instantiate all
     * schema information, which may be memory intensive.
     * This method is CURRENTLY UNUSED and it serves mostly for convenience
     * of code generation inside of terraform-plugin-mux.
     * </pre>
     */
    public void getMetadata(com.terraform.plugin.v6.GetMetadata.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetMetadata.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSchema returns schema information for the provider, data resources,
     * and managed resources.
     * </pre>
     */
    public void getProviderSchema(com.terraform.plugin.v6.GetProviderSchema.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetProviderSchema.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProviderSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateProviderConfig(com.terraform.plugin.v6.ValidateProviderConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateProviderConfig.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateProviderConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateResourceConfig(com.terraform.plugin.v6.ValidateResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateResourceConfig.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateResourceConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateDataResourceConfig(com.terraform.plugin.v6.ValidateDataResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateDataResourceConfig.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateDataResourceConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upgradeResourceState(com.terraform.plugin.v6.UpgradeResourceState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.UpgradeResourceState.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpgradeResourceStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetResourceIdentitySchemas returns the identity schemas for all managed
     * resources.
     * </pre>
     */
    public void getResourceIdentitySchemas(com.terraform.plugin.v6.GetResourceIdentitySchemas.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetResourceIdentitySchemas.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResourceIdentitySchemasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpgradeResourceIdentityData should return the upgraded resource identity
     * data for a managed resource type.
     * </pre>
     */
    public void upgradeResourceIdentity(com.terraform.plugin.v6.UpgradeResourceIdentity.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.UpgradeResourceIdentity.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpgradeResourceIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47;///// One-time initialization, called before other functions below
     * </pre>
     */
    public void configureProvider(com.terraform.plugin.v6.ConfigureProvider.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ConfigureProvider.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Managed Resource Lifecycle
     * </pre>
     */
    public void readResource(com.terraform.plugin.v6.ReadResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ReadResource.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void planResourceChange(com.terraform.plugin.v6.PlanResourceChange.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.PlanResourceChange.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanResourceChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applyResourceChange(com.terraform.plugin.v6.ApplyResourceChange.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ApplyResourceChange.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyResourceChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void importResourceState(com.terraform.plugin.v6.ImportResourceState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ImportResourceState.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportResourceStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void moveResourceState(com.terraform.plugin.v6.MoveResourceState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.MoveResourceState.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveResourceStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readDataSource(com.terraform.plugin.v6.ReadDataSource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ReadDataSource.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateResourceConfig(com.terraform.plugin.v6.GenerateResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GenerateResourceConfig.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateResourceConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Ephemeral Resource Lifecycle
     * </pre>
     */
    public void validateEphemeralResourceConfig(com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateEphemeralResourceConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openEphemeralResource(com.terraform.plugin.v6.OpenEphemeralResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.OpenEphemeralResource.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenEphemeralResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renewEphemeralResource(com.terraform.plugin.v6.RenewEphemeralResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.RenewEphemeralResource.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewEphemeralResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeEphemeralResource(com.terraform.plugin.v6.CloseEphemeralResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.CloseEphemeralResource.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseEphemeralResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47;//// List
     * </pre>
     */
    public void listResource(com.terraform.plugin.v6.ListResource.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ListResource.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateListResourceConfig(com.terraform.plugin.v6.ValidateListResourceConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateListResourceConfig.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateListResourceConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetFunctions returns the definitions of all functions.
     * </pre>
     */
    public void getFunctions(com.terraform.plugin.v6.GetFunctions.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetFunctions.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFunctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Provider-contributed Functions
     * </pre>
     */
    public void callFunction(com.terraform.plugin.v6.CallFunction.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.CallFunction.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallFunctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidateStateStoreConfig performs configuration validation
     * </pre>
     */
    public void validateStateStoreConfig(com.terraform.plugin.v6.ValidateStateStore.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateStateStore.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateStateStoreConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConfigureStateStore configures the state store, such as S3 connection in the context of already configured provider
     * </pre>
     */
    public void configureStateStore(com.terraform.plugin.v6.ConfigureStateStore.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ConfigureStateStore.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureStateStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReadStateBytes streams byte chunks of a given state file from a state store
     * </pre>
     */
    public void readStateBytes(com.terraform.plugin.v6.ReadStateBytes.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ReadStateBytes.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadStateBytesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteStateBytes streams byte chunks of a given state file into a state store
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.terraform.plugin.v6.WriteStateBytes.RequestChunk> writeStateBytes(
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.WriteStateBytes.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteStateBytesMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * LockState locks a given state (i.e. CE workspace)
     * </pre>
     */
    public void lockState(com.terraform.plugin.v6.LockState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.LockState.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnlockState unlocks a given state (i.e. CE workspace)
     * </pre>
     */
    public void unlockState(com.terraform.plugin.v6.UnlockState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.UnlockState.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlockStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetStates returns a list of all states (i.e. CE workspaces) managed by a given state store
     * </pre>
     */
    public void getStates(com.terraform.plugin.v6.GetStates.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetStates.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteState instructs a given state store to delete a specific state (i.e. a CE workspace)
     * </pre>
     */
    public void deleteState(com.terraform.plugin.v6.DeleteState.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.DeleteState.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Actions
     * </pre>
     */
    public void planAction(com.terraform.plugin.v6.PlanAction.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.PlanAction.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void invokeAction(com.terraform.plugin.v6.InvokeAction.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.InvokeAction.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getInvokeActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateActionConfig(com.terraform.plugin.v6.ValidateActionConfig.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateActionConfig.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateActionConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47;///// Graceful Shutdown
     * </pre>
     */
    public void stopProvider(com.terraform.plugin.v6.StopProvider.Request request,
        io.grpc.stub.StreamObserver<com.terraform.plugin.v6.StopProvider.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopProviderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Provider.
   * <pre>
   *&#47;///// Information about what a provider supports/expects
   * </pre>
   */
  public static final class ProviderBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProviderBlockingV2Stub> {
    private ProviderBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMetadata returns upfront information about server capabilities and
     * supported resource types without requiring the server to instantiate all
     * schema information, which may be memory intensive.
     * This method is CURRENTLY UNUSED and it serves mostly for convenience
     * of code generation inside of terraform-plugin-mux.
     * </pre>
     */
    public com.terraform.plugin.v6.GetMetadata.Response getMetadata(com.terraform.plugin.v6.GetMetadata.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSchema returns schema information for the provider, data resources,
     * and managed resources.
     * </pre>
     */
    public com.terraform.plugin.v6.GetProviderSchema.Response getProviderSchema(com.terraform.plugin.v6.GetProviderSchema.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProviderSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateProviderConfig.Response validateProviderConfig(com.terraform.plugin.v6.ValidateProviderConfig.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateProviderConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateResourceConfig.Response validateResourceConfig(com.terraform.plugin.v6.ValidateResourceConfig.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateDataResourceConfig.Response validateDataResourceConfig(com.terraform.plugin.v6.ValidateDataResourceConfig.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateDataResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.UpgradeResourceState.Response upgradeResourceState(com.terraform.plugin.v6.UpgradeResourceState.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpgradeResourceStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetResourceIdentitySchemas returns the identity schemas for all managed
     * resources.
     * </pre>
     */
    public com.terraform.plugin.v6.GetResourceIdentitySchemas.Response getResourceIdentitySchemas(com.terraform.plugin.v6.GetResourceIdentitySchemas.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetResourceIdentitySchemasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpgradeResourceIdentityData should return the upgraded resource identity
     * data for a managed resource type.
     * </pre>
     */
    public com.terraform.plugin.v6.UpgradeResourceIdentity.Response upgradeResourceIdentity(com.terraform.plugin.v6.UpgradeResourceIdentity.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpgradeResourceIdentityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// One-time initialization, called before other functions below
     * </pre>
     */
    public com.terraform.plugin.v6.ConfigureProvider.Response configureProvider(com.terraform.plugin.v6.ConfigureProvider.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getConfigureProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Managed Resource Lifecycle
     * </pre>
     */
    public com.terraform.plugin.v6.ReadResource.Response readResource(com.terraform.plugin.v6.ReadResource.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReadResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.PlanResourceChange.Response planResourceChange(com.terraform.plugin.v6.PlanResourceChange.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPlanResourceChangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ApplyResourceChange.Response applyResourceChange(com.terraform.plugin.v6.ApplyResourceChange.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getApplyResourceChangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ImportResourceState.Response importResourceState(com.terraform.plugin.v6.ImportResourceState.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getImportResourceStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.MoveResourceState.Response moveResourceState(com.terraform.plugin.v6.MoveResourceState.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getMoveResourceStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ReadDataSource.Response readDataSource(com.terraform.plugin.v6.ReadDataSource.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReadDataSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.GenerateResourceConfig.Response generateResourceConfig(com.terraform.plugin.v6.GenerateResourceConfig.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGenerateResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Ephemeral Resource Lifecycle
     * </pre>
     */
    public com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response validateEphemeralResourceConfig(com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateEphemeralResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.OpenEphemeralResource.Response openEphemeralResource(com.terraform.plugin.v6.OpenEphemeralResource.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getOpenEphemeralResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.RenewEphemeralResource.Response renewEphemeralResource(com.terraform.plugin.v6.RenewEphemeralResource.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRenewEphemeralResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.CloseEphemeralResource.Response closeEphemeralResource(com.terraform.plugin.v6.CloseEphemeralResource.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCloseEphemeralResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;//// List
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, com.terraform.plugin.v6.ListResource.Event>
        listResource(com.terraform.plugin.v6.ListResource.Request request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getListResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateListResourceConfig.Response validateListResourceConfig(com.terraform.plugin.v6.ValidateListResourceConfig.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateListResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetFunctions returns the definitions of all functions.
     * </pre>
     */
    public com.terraform.plugin.v6.GetFunctions.Response getFunctions(com.terraform.plugin.v6.GetFunctions.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFunctionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Provider-contributed Functions
     * </pre>
     */
    public com.terraform.plugin.v6.CallFunction.Response callFunction(com.terraform.plugin.v6.CallFunction.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCallFunctionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidateStateStoreConfig performs configuration validation
     * </pre>
     */
    public com.terraform.plugin.v6.ValidateStateStore.Response validateStateStoreConfig(com.terraform.plugin.v6.ValidateStateStore.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateStateStoreConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConfigureStateStore configures the state store, such as S3 connection in the context of already configured provider
     * </pre>
     */
    public com.terraform.plugin.v6.ConfigureStateStore.Response configureStateStore(com.terraform.plugin.v6.ConfigureStateStore.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getConfigureStateStoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReadStateBytes streams byte chunks of a given state file from a state store
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, com.terraform.plugin.v6.ReadStateBytes.Response>
        readStateBytes(com.terraform.plugin.v6.ReadStateBytes.Request request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getReadStateBytesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteStateBytes streams byte chunks of a given state file into a state store
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<com.terraform.plugin.v6.WriteStateBytes.RequestChunk, com.terraform.plugin.v6.WriteStateBytes.Response>
        writeStateBytes() {
      return io.grpc.stub.ClientCalls.blockingClientStreamingCall(
          getChannel(), getWriteStateBytesMethod(), getCallOptions());
    }

    /**
     * <pre>
     * LockState locks a given state (i.e. CE workspace)
     * </pre>
     */
    public com.terraform.plugin.v6.LockState.Response lockState(com.terraform.plugin.v6.LockState.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLockStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnlockState unlocks a given state (i.e. CE workspace)
     * </pre>
     */
    public com.terraform.plugin.v6.UnlockState.Response unlockState(com.terraform.plugin.v6.UnlockState.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUnlockStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetStates returns a list of all states (i.e. CE workspaces) managed by a given state store
     * </pre>
     */
    public com.terraform.plugin.v6.GetStates.Response getStates(com.terraform.plugin.v6.GetStates.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteState instructs a given state store to delete a specific state (i.e. a CE workspace)
     * </pre>
     */
    public com.terraform.plugin.v6.DeleteState.Response deleteState(com.terraform.plugin.v6.DeleteState.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Actions
     * </pre>
     */
    public com.terraform.plugin.v6.PlanAction.Response planAction(com.terraform.plugin.v6.PlanAction.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPlanActionMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, com.terraform.plugin.v6.InvokeAction.Event>
        invokeAction(com.terraform.plugin.v6.InvokeAction.Request request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getInvokeActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateActionConfig.Response validateActionConfig(com.terraform.plugin.v6.ValidateActionConfig.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateActionConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Graceful Shutdown
     * </pre>
     */
    public com.terraform.plugin.v6.StopProvider.Response stopProvider(com.terraform.plugin.v6.StopProvider.Request request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getStopProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Provider.
   * <pre>
   *&#47;///// Information about what a provider supports/expects
   * </pre>
   */
  public static final class ProviderBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProviderBlockingStub> {
    private ProviderBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMetadata returns upfront information about server capabilities and
     * supported resource types without requiring the server to instantiate all
     * schema information, which may be memory intensive.
     * This method is CURRENTLY UNUSED and it serves mostly for convenience
     * of code generation inside of terraform-plugin-mux.
     * </pre>
     */
    public com.terraform.plugin.v6.GetMetadata.Response getMetadata(com.terraform.plugin.v6.GetMetadata.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSchema returns schema information for the provider, data resources,
     * and managed resources.
     * </pre>
     */
    public com.terraform.plugin.v6.GetProviderSchema.Response getProviderSchema(com.terraform.plugin.v6.GetProviderSchema.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProviderSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateProviderConfig.Response validateProviderConfig(com.terraform.plugin.v6.ValidateProviderConfig.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateProviderConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateResourceConfig.Response validateResourceConfig(com.terraform.plugin.v6.ValidateResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateDataResourceConfig.Response validateDataResourceConfig(com.terraform.plugin.v6.ValidateDataResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateDataResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.UpgradeResourceState.Response upgradeResourceState(com.terraform.plugin.v6.UpgradeResourceState.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpgradeResourceStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetResourceIdentitySchemas returns the identity schemas for all managed
     * resources.
     * </pre>
     */
    public com.terraform.plugin.v6.GetResourceIdentitySchemas.Response getResourceIdentitySchemas(com.terraform.plugin.v6.GetResourceIdentitySchemas.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResourceIdentitySchemasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpgradeResourceIdentityData should return the upgraded resource identity
     * data for a managed resource type.
     * </pre>
     */
    public com.terraform.plugin.v6.UpgradeResourceIdentity.Response upgradeResourceIdentity(com.terraform.plugin.v6.UpgradeResourceIdentity.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpgradeResourceIdentityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// One-time initialization, called before other functions below
     * </pre>
     */
    public com.terraform.plugin.v6.ConfigureProvider.Response configureProvider(com.terraform.plugin.v6.ConfigureProvider.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Managed Resource Lifecycle
     * </pre>
     */
    public com.terraform.plugin.v6.ReadResource.Response readResource(com.terraform.plugin.v6.ReadResource.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.PlanResourceChange.Response planResourceChange(com.terraform.plugin.v6.PlanResourceChange.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanResourceChangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ApplyResourceChange.Response applyResourceChange(com.terraform.plugin.v6.ApplyResourceChange.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyResourceChangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ImportResourceState.Response importResourceState(com.terraform.plugin.v6.ImportResourceState.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportResourceStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.MoveResourceState.Response moveResourceState(com.terraform.plugin.v6.MoveResourceState.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveResourceStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ReadDataSource.Response readDataSource(com.terraform.plugin.v6.ReadDataSource.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadDataSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.GenerateResourceConfig.Response generateResourceConfig(com.terraform.plugin.v6.GenerateResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Ephemeral Resource Lifecycle
     * </pre>
     */
    public com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response validateEphemeralResourceConfig(com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateEphemeralResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.OpenEphemeralResource.Response openEphemeralResource(com.terraform.plugin.v6.OpenEphemeralResource.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenEphemeralResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.RenewEphemeralResource.Response renewEphemeralResource(com.terraform.plugin.v6.RenewEphemeralResource.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewEphemeralResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.CloseEphemeralResource.Response closeEphemeralResource(com.terraform.plugin.v6.CloseEphemeralResource.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseEphemeralResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;//// List
     * </pre>
     */
    public java.util.Iterator<com.terraform.plugin.v6.ListResource.Event> listResource(
        com.terraform.plugin.v6.ListResource.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateListResourceConfig.Response validateListResourceConfig(com.terraform.plugin.v6.ValidateListResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateListResourceConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetFunctions returns the definitions of all functions.
     * </pre>
     */
    public com.terraform.plugin.v6.GetFunctions.Response getFunctions(com.terraform.plugin.v6.GetFunctions.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFunctionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Provider-contributed Functions
     * </pre>
     */
    public com.terraform.plugin.v6.CallFunction.Response callFunction(com.terraform.plugin.v6.CallFunction.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallFunctionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidateStateStoreConfig performs configuration validation
     * </pre>
     */
    public com.terraform.plugin.v6.ValidateStateStore.Response validateStateStoreConfig(com.terraform.plugin.v6.ValidateStateStore.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateStateStoreConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConfigureStateStore configures the state store, such as S3 connection in the context of already configured provider
     * </pre>
     */
    public com.terraform.plugin.v6.ConfigureStateStore.Response configureStateStore(com.terraform.plugin.v6.ConfigureStateStore.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureStateStoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReadStateBytes streams byte chunks of a given state file from a state store
     * </pre>
     */
    public java.util.Iterator<com.terraform.plugin.v6.ReadStateBytes.Response> readStateBytes(
        com.terraform.plugin.v6.ReadStateBytes.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadStateBytesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LockState locks a given state (i.e. CE workspace)
     * </pre>
     */
    public com.terraform.plugin.v6.LockState.Response lockState(com.terraform.plugin.v6.LockState.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnlockState unlocks a given state (i.e. CE workspace)
     * </pre>
     */
    public com.terraform.plugin.v6.UnlockState.Response unlockState(com.terraform.plugin.v6.UnlockState.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlockStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetStates returns a list of all states (i.e. CE workspaces) managed by a given state store
     * </pre>
     */
    public com.terraform.plugin.v6.GetStates.Response getStates(com.terraform.plugin.v6.GetStates.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteState instructs a given state store to delete a specific state (i.e. a CE workspace)
     * </pre>
     */
    public com.terraform.plugin.v6.DeleteState.Response deleteState(com.terraform.plugin.v6.DeleteState.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Actions
     * </pre>
     */
    public com.terraform.plugin.v6.PlanAction.Response planAction(com.terraform.plugin.v6.PlanAction.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.terraform.plugin.v6.InvokeAction.Event> invokeAction(
        com.terraform.plugin.v6.InvokeAction.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getInvokeActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.terraform.plugin.v6.ValidateActionConfig.Response validateActionConfig(com.terraform.plugin.v6.ValidateActionConfig.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateActionConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;///// Graceful Shutdown
     * </pre>
     */
    public com.terraform.plugin.v6.StopProvider.Response stopProvider(com.terraform.plugin.v6.StopProvider.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Provider.
   * <pre>
   *&#47;///// Information about what a provider supports/expects
   * </pre>
   */
  public static final class ProviderFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProviderFutureStub> {
    private ProviderFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMetadata returns upfront information about server capabilities and
     * supported resource types without requiring the server to instantiate all
     * schema information, which may be memory intensive.
     * This method is CURRENTLY UNUSED and it serves mostly for convenience
     * of code generation inside of terraform-plugin-mux.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.GetMetadata.Response> getMetadata(
        com.terraform.plugin.v6.GetMetadata.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSchema returns schema information for the provider, data resources,
     * and managed resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.GetProviderSchema.Response> getProviderSchema(
        com.terraform.plugin.v6.GetProviderSchema.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProviderSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ValidateProviderConfig.Response> validateProviderConfig(
        com.terraform.plugin.v6.ValidateProviderConfig.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateProviderConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ValidateResourceConfig.Response> validateResourceConfig(
        com.terraform.plugin.v6.ValidateResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateResourceConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ValidateDataResourceConfig.Response> validateDataResourceConfig(
        com.terraform.plugin.v6.ValidateDataResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateDataResourceConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.UpgradeResourceState.Response> upgradeResourceState(
        com.terraform.plugin.v6.UpgradeResourceState.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpgradeResourceStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetResourceIdentitySchemas returns the identity schemas for all managed
     * resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.GetResourceIdentitySchemas.Response> getResourceIdentitySchemas(
        com.terraform.plugin.v6.GetResourceIdentitySchemas.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResourceIdentitySchemasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpgradeResourceIdentityData should return the upgraded resource identity
     * data for a managed resource type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.UpgradeResourceIdentity.Response> upgradeResourceIdentity(
        com.terraform.plugin.v6.UpgradeResourceIdentity.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpgradeResourceIdentityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47;///// One-time initialization, called before other functions below
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ConfigureProvider.Response> configureProvider(
        com.terraform.plugin.v6.ConfigureProvider.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureProviderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47;///// Managed Resource Lifecycle
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ReadResource.Response> readResource(
        com.terraform.plugin.v6.ReadResource.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.PlanResourceChange.Response> planResourceChange(
        com.terraform.plugin.v6.PlanResourceChange.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanResourceChangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ApplyResourceChange.Response> applyResourceChange(
        com.terraform.plugin.v6.ApplyResourceChange.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyResourceChangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ImportResourceState.Response> importResourceState(
        com.terraform.plugin.v6.ImportResourceState.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportResourceStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.MoveResourceState.Response> moveResourceState(
        com.terraform.plugin.v6.MoveResourceState.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveResourceStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ReadDataSource.Response> readDataSource(
        com.terraform.plugin.v6.ReadDataSource.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadDataSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.GenerateResourceConfig.Response> generateResourceConfig(
        com.terraform.plugin.v6.GenerateResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateResourceConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47;///// Ephemeral Resource Lifecycle
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response> validateEphemeralResourceConfig(
        com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateEphemeralResourceConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.OpenEphemeralResource.Response> openEphemeralResource(
        com.terraform.plugin.v6.OpenEphemeralResource.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenEphemeralResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.RenewEphemeralResource.Response> renewEphemeralResource(
        com.terraform.plugin.v6.RenewEphemeralResource.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewEphemeralResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.CloseEphemeralResource.Response> closeEphemeralResource(
        com.terraform.plugin.v6.CloseEphemeralResource.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseEphemeralResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ValidateListResourceConfig.Response> validateListResourceConfig(
        com.terraform.plugin.v6.ValidateListResourceConfig.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateListResourceConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetFunctions returns the definitions of all functions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.GetFunctions.Response> getFunctions(
        com.terraform.plugin.v6.GetFunctions.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFunctionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47;///// Provider-contributed Functions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.CallFunction.Response> callFunction(
        com.terraform.plugin.v6.CallFunction.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallFunctionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidateStateStoreConfig performs configuration validation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ValidateStateStore.Response> validateStateStoreConfig(
        com.terraform.plugin.v6.ValidateStateStore.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateStateStoreConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConfigureStateStore configures the state store, such as S3 connection in the context of already configured provider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ConfigureStateStore.Response> configureStateStore(
        com.terraform.plugin.v6.ConfigureStateStore.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureStateStoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LockState locks a given state (i.e. CE workspace)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.LockState.Response> lockState(
        com.terraform.plugin.v6.LockState.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnlockState unlocks a given state (i.e. CE workspace)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.UnlockState.Response> unlockState(
        com.terraform.plugin.v6.UnlockState.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlockStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetStates returns a list of all states (i.e. CE workspaces) managed by a given state store
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.GetStates.Response> getStates(
        com.terraform.plugin.v6.GetStates.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteState instructs a given state store to delete a specific state (i.e. a CE workspace)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.DeleteState.Response> deleteState(
        com.terraform.plugin.v6.DeleteState.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47;///// Actions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.PlanAction.Response> planAction(
        com.terraform.plugin.v6.PlanAction.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanActionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.ValidateActionConfig.Response> validateActionConfig(
        com.terraform.plugin.v6.ValidateActionConfig.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateActionConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47;///// Graceful Shutdown
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.terraform.plugin.v6.StopProvider.Response> stopProvider(
        com.terraform.plugin.v6.StopProvider.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopProviderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_METADATA = 0;
  private static final int METHODID_GET_PROVIDER_SCHEMA = 1;
  private static final int METHODID_VALIDATE_PROVIDER_CONFIG = 2;
  private static final int METHODID_VALIDATE_RESOURCE_CONFIG = 3;
  private static final int METHODID_VALIDATE_DATA_RESOURCE_CONFIG = 4;
  private static final int METHODID_UPGRADE_RESOURCE_STATE = 5;
  private static final int METHODID_GET_RESOURCE_IDENTITY_SCHEMAS = 6;
  private static final int METHODID_UPGRADE_RESOURCE_IDENTITY = 7;
  private static final int METHODID_CONFIGURE_PROVIDER = 8;
  private static final int METHODID_READ_RESOURCE = 9;
  private static final int METHODID_PLAN_RESOURCE_CHANGE = 10;
  private static final int METHODID_APPLY_RESOURCE_CHANGE = 11;
  private static final int METHODID_IMPORT_RESOURCE_STATE = 12;
  private static final int METHODID_MOVE_RESOURCE_STATE = 13;
  private static final int METHODID_READ_DATA_SOURCE = 14;
  private static final int METHODID_GENERATE_RESOURCE_CONFIG = 15;
  private static final int METHODID_VALIDATE_EPHEMERAL_RESOURCE_CONFIG = 16;
  private static final int METHODID_OPEN_EPHEMERAL_RESOURCE = 17;
  private static final int METHODID_RENEW_EPHEMERAL_RESOURCE = 18;
  private static final int METHODID_CLOSE_EPHEMERAL_RESOURCE = 19;
  private static final int METHODID_LIST_RESOURCE = 20;
  private static final int METHODID_VALIDATE_LIST_RESOURCE_CONFIG = 21;
  private static final int METHODID_GET_FUNCTIONS = 22;
  private static final int METHODID_CALL_FUNCTION = 23;
  private static final int METHODID_VALIDATE_STATE_STORE_CONFIG = 24;
  private static final int METHODID_CONFIGURE_STATE_STORE = 25;
  private static final int METHODID_READ_STATE_BYTES = 26;
  private static final int METHODID_LOCK_STATE = 27;
  private static final int METHODID_UNLOCK_STATE = 28;
  private static final int METHODID_GET_STATES = 29;
  private static final int METHODID_DELETE_STATE = 30;
  private static final int METHODID_PLAN_ACTION = 31;
  private static final int METHODID_INVOKE_ACTION = 32;
  private static final int METHODID_VALIDATE_ACTION_CONFIG = 33;
  private static final int METHODID_STOP_PROVIDER = 34;
  private static final int METHODID_WRITE_STATE_BYTES = 35;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_METADATA:
          serviceImpl.getMetadata((com.terraform.plugin.v6.GetMetadata.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetMetadata.Response>) responseObserver);
          break;
        case METHODID_GET_PROVIDER_SCHEMA:
          serviceImpl.getProviderSchema((com.terraform.plugin.v6.GetProviderSchema.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetProviderSchema.Response>) responseObserver);
          break;
        case METHODID_VALIDATE_PROVIDER_CONFIG:
          serviceImpl.validateProviderConfig((com.terraform.plugin.v6.ValidateProviderConfig.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateProviderConfig.Response>) responseObserver);
          break;
        case METHODID_VALIDATE_RESOURCE_CONFIG:
          serviceImpl.validateResourceConfig((com.terraform.plugin.v6.ValidateResourceConfig.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateResourceConfig.Response>) responseObserver);
          break;
        case METHODID_VALIDATE_DATA_RESOURCE_CONFIG:
          serviceImpl.validateDataResourceConfig((com.terraform.plugin.v6.ValidateDataResourceConfig.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateDataResourceConfig.Response>) responseObserver);
          break;
        case METHODID_UPGRADE_RESOURCE_STATE:
          serviceImpl.upgradeResourceState((com.terraform.plugin.v6.UpgradeResourceState.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.UpgradeResourceState.Response>) responseObserver);
          break;
        case METHODID_GET_RESOURCE_IDENTITY_SCHEMAS:
          serviceImpl.getResourceIdentitySchemas((com.terraform.plugin.v6.GetResourceIdentitySchemas.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetResourceIdentitySchemas.Response>) responseObserver);
          break;
        case METHODID_UPGRADE_RESOURCE_IDENTITY:
          serviceImpl.upgradeResourceIdentity((com.terraform.plugin.v6.UpgradeResourceIdentity.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.UpgradeResourceIdentity.Response>) responseObserver);
          break;
        case METHODID_CONFIGURE_PROVIDER:
          serviceImpl.configureProvider((com.terraform.plugin.v6.ConfigureProvider.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ConfigureProvider.Response>) responseObserver);
          break;
        case METHODID_READ_RESOURCE:
          serviceImpl.readResource((com.terraform.plugin.v6.ReadResource.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ReadResource.Response>) responseObserver);
          break;
        case METHODID_PLAN_RESOURCE_CHANGE:
          serviceImpl.planResourceChange((com.terraform.plugin.v6.PlanResourceChange.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.PlanResourceChange.Response>) responseObserver);
          break;
        case METHODID_APPLY_RESOURCE_CHANGE:
          serviceImpl.applyResourceChange((com.terraform.plugin.v6.ApplyResourceChange.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ApplyResourceChange.Response>) responseObserver);
          break;
        case METHODID_IMPORT_RESOURCE_STATE:
          serviceImpl.importResourceState((com.terraform.plugin.v6.ImportResourceState.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ImportResourceState.Response>) responseObserver);
          break;
        case METHODID_MOVE_RESOURCE_STATE:
          serviceImpl.moveResourceState((com.terraform.plugin.v6.MoveResourceState.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.MoveResourceState.Response>) responseObserver);
          break;
        case METHODID_READ_DATA_SOURCE:
          serviceImpl.readDataSource((com.terraform.plugin.v6.ReadDataSource.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ReadDataSource.Response>) responseObserver);
          break;
        case METHODID_GENERATE_RESOURCE_CONFIG:
          serviceImpl.generateResourceConfig((com.terraform.plugin.v6.GenerateResourceConfig.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GenerateResourceConfig.Response>) responseObserver);
          break;
        case METHODID_VALIDATE_EPHEMERAL_RESOURCE_CONFIG:
          serviceImpl.validateEphemeralResourceConfig((com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response>) responseObserver);
          break;
        case METHODID_OPEN_EPHEMERAL_RESOURCE:
          serviceImpl.openEphemeralResource((com.terraform.plugin.v6.OpenEphemeralResource.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.OpenEphemeralResource.Response>) responseObserver);
          break;
        case METHODID_RENEW_EPHEMERAL_RESOURCE:
          serviceImpl.renewEphemeralResource((com.terraform.plugin.v6.RenewEphemeralResource.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.RenewEphemeralResource.Response>) responseObserver);
          break;
        case METHODID_CLOSE_EPHEMERAL_RESOURCE:
          serviceImpl.closeEphemeralResource((com.terraform.plugin.v6.CloseEphemeralResource.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.CloseEphemeralResource.Response>) responseObserver);
          break;
        case METHODID_LIST_RESOURCE:
          serviceImpl.listResource((com.terraform.plugin.v6.ListResource.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ListResource.Event>) responseObserver);
          break;
        case METHODID_VALIDATE_LIST_RESOURCE_CONFIG:
          serviceImpl.validateListResourceConfig((com.terraform.plugin.v6.ValidateListResourceConfig.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateListResourceConfig.Response>) responseObserver);
          break;
        case METHODID_GET_FUNCTIONS:
          serviceImpl.getFunctions((com.terraform.plugin.v6.GetFunctions.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetFunctions.Response>) responseObserver);
          break;
        case METHODID_CALL_FUNCTION:
          serviceImpl.callFunction((com.terraform.plugin.v6.CallFunction.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.CallFunction.Response>) responseObserver);
          break;
        case METHODID_VALIDATE_STATE_STORE_CONFIG:
          serviceImpl.validateStateStoreConfig((com.terraform.plugin.v6.ValidateStateStore.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateStateStore.Response>) responseObserver);
          break;
        case METHODID_CONFIGURE_STATE_STORE:
          serviceImpl.configureStateStore((com.terraform.plugin.v6.ConfigureStateStore.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ConfigureStateStore.Response>) responseObserver);
          break;
        case METHODID_READ_STATE_BYTES:
          serviceImpl.readStateBytes((com.terraform.plugin.v6.ReadStateBytes.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ReadStateBytes.Response>) responseObserver);
          break;
        case METHODID_LOCK_STATE:
          serviceImpl.lockState((com.terraform.plugin.v6.LockState.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.LockState.Response>) responseObserver);
          break;
        case METHODID_UNLOCK_STATE:
          serviceImpl.unlockState((com.terraform.plugin.v6.UnlockState.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.UnlockState.Response>) responseObserver);
          break;
        case METHODID_GET_STATES:
          serviceImpl.getStates((com.terraform.plugin.v6.GetStates.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.GetStates.Response>) responseObserver);
          break;
        case METHODID_DELETE_STATE:
          serviceImpl.deleteState((com.terraform.plugin.v6.DeleteState.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.DeleteState.Response>) responseObserver);
          break;
        case METHODID_PLAN_ACTION:
          serviceImpl.planAction((com.terraform.plugin.v6.PlanAction.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.PlanAction.Response>) responseObserver);
          break;
        case METHODID_INVOKE_ACTION:
          serviceImpl.invokeAction((com.terraform.plugin.v6.InvokeAction.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.InvokeAction.Event>) responseObserver);
          break;
        case METHODID_VALIDATE_ACTION_CONFIG:
          serviceImpl.validateActionConfig((com.terraform.plugin.v6.ValidateActionConfig.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.ValidateActionConfig.Response>) responseObserver);
          break;
        case METHODID_STOP_PROVIDER:
          serviceImpl.stopProvider((com.terraform.plugin.v6.StopProvider.Request) request,
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.StopProvider.Response>) responseObserver);
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
        case METHODID_WRITE_STATE_BYTES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.writeStateBytes(
              (io.grpc.stub.StreamObserver<com.terraform.plugin.v6.WriteStateBytes.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.GetMetadata.Request,
              com.terraform.plugin.v6.GetMetadata.Response>(
                service, METHODID_GET_METADATA)))
        .addMethod(
          getGetProviderSchemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.GetProviderSchema.Request,
              com.terraform.plugin.v6.GetProviderSchema.Response>(
                service, METHODID_GET_PROVIDER_SCHEMA)))
        .addMethod(
          getValidateProviderConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ValidateProviderConfig.Request,
              com.terraform.plugin.v6.ValidateProviderConfig.Response>(
                service, METHODID_VALIDATE_PROVIDER_CONFIG)))
        .addMethod(
          getValidateResourceConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ValidateResourceConfig.Request,
              com.terraform.plugin.v6.ValidateResourceConfig.Response>(
                service, METHODID_VALIDATE_RESOURCE_CONFIG)))
        .addMethod(
          getValidateDataResourceConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ValidateDataResourceConfig.Request,
              com.terraform.plugin.v6.ValidateDataResourceConfig.Response>(
                service, METHODID_VALIDATE_DATA_RESOURCE_CONFIG)))
        .addMethod(
          getUpgradeResourceStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.UpgradeResourceState.Request,
              com.terraform.plugin.v6.UpgradeResourceState.Response>(
                service, METHODID_UPGRADE_RESOURCE_STATE)))
        .addMethod(
          getGetResourceIdentitySchemasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.GetResourceIdentitySchemas.Request,
              com.terraform.plugin.v6.GetResourceIdentitySchemas.Response>(
                service, METHODID_GET_RESOURCE_IDENTITY_SCHEMAS)))
        .addMethod(
          getUpgradeResourceIdentityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.UpgradeResourceIdentity.Request,
              com.terraform.plugin.v6.UpgradeResourceIdentity.Response>(
                service, METHODID_UPGRADE_RESOURCE_IDENTITY)))
        .addMethod(
          getConfigureProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ConfigureProvider.Request,
              com.terraform.plugin.v6.ConfigureProvider.Response>(
                service, METHODID_CONFIGURE_PROVIDER)))
        .addMethod(
          getReadResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ReadResource.Request,
              com.terraform.plugin.v6.ReadResource.Response>(
                service, METHODID_READ_RESOURCE)))
        .addMethod(
          getPlanResourceChangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.PlanResourceChange.Request,
              com.terraform.plugin.v6.PlanResourceChange.Response>(
                service, METHODID_PLAN_RESOURCE_CHANGE)))
        .addMethod(
          getApplyResourceChangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ApplyResourceChange.Request,
              com.terraform.plugin.v6.ApplyResourceChange.Response>(
                service, METHODID_APPLY_RESOURCE_CHANGE)))
        .addMethod(
          getImportResourceStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ImportResourceState.Request,
              com.terraform.plugin.v6.ImportResourceState.Response>(
                service, METHODID_IMPORT_RESOURCE_STATE)))
        .addMethod(
          getMoveResourceStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.MoveResourceState.Request,
              com.terraform.plugin.v6.MoveResourceState.Response>(
                service, METHODID_MOVE_RESOURCE_STATE)))
        .addMethod(
          getReadDataSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ReadDataSource.Request,
              com.terraform.plugin.v6.ReadDataSource.Response>(
                service, METHODID_READ_DATA_SOURCE)))
        .addMethod(
          getGenerateResourceConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.GenerateResourceConfig.Request,
              com.terraform.plugin.v6.GenerateResourceConfig.Response>(
                service, METHODID_GENERATE_RESOURCE_CONFIG)))
        .addMethod(
          getValidateEphemeralResourceConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Request,
              com.terraform.plugin.v6.ValidateEphemeralResourceConfig.Response>(
                service, METHODID_VALIDATE_EPHEMERAL_RESOURCE_CONFIG)))
        .addMethod(
          getOpenEphemeralResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.OpenEphemeralResource.Request,
              com.terraform.plugin.v6.OpenEphemeralResource.Response>(
                service, METHODID_OPEN_EPHEMERAL_RESOURCE)))
        .addMethod(
          getRenewEphemeralResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.RenewEphemeralResource.Request,
              com.terraform.plugin.v6.RenewEphemeralResource.Response>(
                service, METHODID_RENEW_EPHEMERAL_RESOURCE)))
        .addMethod(
          getCloseEphemeralResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.CloseEphemeralResource.Request,
              com.terraform.plugin.v6.CloseEphemeralResource.Response>(
                service, METHODID_CLOSE_EPHEMERAL_RESOURCE)))
        .addMethod(
          getListResourceMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ListResource.Request,
              com.terraform.plugin.v6.ListResource.Event>(
                service, METHODID_LIST_RESOURCE)))
        .addMethod(
          getValidateListResourceConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ValidateListResourceConfig.Request,
              com.terraform.plugin.v6.ValidateListResourceConfig.Response>(
                service, METHODID_VALIDATE_LIST_RESOURCE_CONFIG)))
        .addMethod(
          getGetFunctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.GetFunctions.Request,
              com.terraform.plugin.v6.GetFunctions.Response>(
                service, METHODID_GET_FUNCTIONS)))
        .addMethod(
          getCallFunctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.CallFunction.Request,
              com.terraform.plugin.v6.CallFunction.Response>(
                service, METHODID_CALL_FUNCTION)))
        .addMethod(
          getValidateStateStoreConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ValidateStateStore.Request,
              com.terraform.plugin.v6.ValidateStateStore.Response>(
                service, METHODID_VALIDATE_STATE_STORE_CONFIG)))
        .addMethod(
          getConfigureStateStoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ConfigureStateStore.Request,
              com.terraform.plugin.v6.ConfigureStateStore.Response>(
                service, METHODID_CONFIGURE_STATE_STORE)))
        .addMethod(
          getReadStateBytesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ReadStateBytes.Request,
              com.terraform.plugin.v6.ReadStateBytes.Response>(
                service, METHODID_READ_STATE_BYTES)))
        .addMethod(
          getWriteStateBytesMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.terraform.plugin.v6.WriteStateBytes.RequestChunk,
              com.terraform.plugin.v6.WriteStateBytes.Response>(
                service, METHODID_WRITE_STATE_BYTES)))
        .addMethod(
          getLockStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.LockState.Request,
              com.terraform.plugin.v6.LockState.Response>(
                service, METHODID_LOCK_STATE)))
        .addMethod(
          getUnlockStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.UnlockState.Request,
              com.terraform.plugin.v6.UnlockState.Response>(
                service, METHODID_UNLOCK_STATE)))
        .addMethod(
          getGetStatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.GetStates.Request,
              com.terraform.plugin.v6.GetStates.Response>(
                service, METHODID_GET_STATES)))
        .addMethod(
          getDeleteStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.DeleteState.Request,
              com.terraform.plugin.v6.DeleteState.Response>(
                service, METHODID_DELETE_STATE)))
        .addMethod(
          getPlanActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.PlanAction.Request,
              com.terraform.plugin.v6.PlanAction.Response>(
                service, METHODID_PLAN_ACTION)))
        .addMethod(
          getInvokeActionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.terraform.plugin.v6.InvokeAction.Request,
              com.terraform.plugin.v6.InvokeAction.Event>(
                service, METHODID_INVOKE_ACTION)))
        .addMethod(
          getValidateActionConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.ValidateActionConfig.Request,
              com.terraform.plugin.v6.ValidateActionConfig.Response>(
                service, METHODID_VALIDATE_ACTION_CONFIG)))
        .addMethod(
          getStopProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.terraform.plugin.v6.StopProvider.Request,
              com.terraform.plugin.v6.StopProvider.Response>(
                service, METHODID_STOP_PROVIDER)))
        .build();
  }

  private static abstract class ProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.terraform.plugin.v6.Tfplugin6Proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Provider");
    }
  }

  private static final class ProviderFileDescriptorSupplier
      extends ProviderBaseDescriptorSupplier {
    ProviderFileDescriptorSupplier() {}
  }

  private static final class ProviderMethodDescriptorSupplier
      extends ProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProviderMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProviderFileDescriptorSupplier())
              .addMethod(getGetMetadataMethod())
              .addMethod(getGetProviderSchemaMethod())
              .addMethod(getValidateProviderConfigMethod())
              .addMethod(getValidateResourceConfigMethod())
              .addMethod(getValidateDataResourceConfigMethod())
              .addMethod(getUpgradeResourceStateMethod())
              .addMethod(getGetResourceIdentitySchemasMethod())
              .addMethod(getUpgradeResourceIdentityMethod())
              .addMethod(getConfigureProviderMethod())
              .addMethod(getReadResourceMethod())
              .addMethod(getPlanResourceChangeMethod())
              .addMethod(getApplyResourceChangeMethod())
              .addMethod(getImportResourceStateMethod())
              .addMethod(getMoveResourceStateMethod())
              .addMethod(getReadDataSourceMethod())
              .addMethod(getGenerateResourceConfigMethod())
              .addMethod(getValidateEphemeralResourceConfigMethod())
              .addMethod(getOpenEphemeralResourceMethod())
              .addMethod(getRenewEphemeralResourceMethod())
              .addMethod(getCloseEphemeralResourceMethod())
              .addMethod(getListResourceMethod())
              .addMethod(getValidateListResourceConfigMethod())
              .addMethod(getGetFunctionsMethod())
              .addMethod(getCallFunctionMethod())
              .addMethod(getValidateStateStoreConfigMethod())
              .addMethod(getConfigureStateStoreMethod())
              .addMethod(getReadStateBytesMethod())
              .addMethod(getWriteStateBytesMethod())
              .addMethod(getLockStateMethod())
              .addMethod(getUnlockStateMethod())
              .addMethod(getGetStatesMethod())
              .addMethod(getDeleteStateMethod())
              .addMethod(getPlanActionMethod())
              .addMethod(getInvokeActionMethod())
              .addMethod(getValidateActionConfigMethod())
              .addMethod(getStopProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
