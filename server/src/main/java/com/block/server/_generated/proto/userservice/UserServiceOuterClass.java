// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserService.proto

package com.block.server._generated.proto.userservice;

public final class UserServiceOuterClass {
  private UserServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignInRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignInRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignInResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignInResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignUpRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignUpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignUpResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignUpResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021UserService.proto\"0\n\rSignInRequest\022\r\n\005" +
      "email\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"\271\001\n\016SignIn" +
      "Response\022,\n\006status\030\001 \001(\0162\034.SignInRespons" +
      "e.SignInStatus\022\020\n\010nickname\030\002 \001(\t\022\022\n\nprof" +
      "ileUrl\030\003 \001(\t\"S\n\014SignInStatus\022\013\n\007SUCCESS\020" +
      "\000\022\016\n\nNO_ACCOUNT\020\001\022\022\n\016WRONG_PASSWORD\020\002\022\022\n" +
      "\016INTERNAL_ERROR\020\003\"\253\001\n\rSignUpRequest\022\r\n\005e" +
      "mail\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\020\n\010nickname" +
      "\030\003 \001(\t\022%\n\006gender\030\004 \001(\0162\025.SignUpRequest.G" +
      "ender\022\016\n\006avatar\030\005 \001(\t\022\020\n\010birthday\030\006 \001(\t\"" +
      "\036\n\006Gender\022\010\n\004MALE\020\000\022\n\n\006FEMALE\020\001\"\274\001\n\016Sign" +
      "UpResponse\022,\n\006status\030\001 \001(\0162\034.SignUpRespo" +
      "nse.SignUpStatus\022\020\n\010nickname\030\002 \001(\t\022\022\n\npr" +
      "ofileUrl\030\003 \001(\t\"V\n\014SignUpStatus\022\013\n\007SUCCES" +
      "S\020\000\022\022\n\016ACCOUNT_EXISTS\020\001\022\021\n\rINVALID_INPUT" +
      "\020\002\022\022\n\016INTERNAL_ERROR\020\0032g\n\013UserService\022+\n" +
      "\006SignIn\022\016.SignInRequest\032\017.SignInResponse" +
      "\"\000\022+\n\006SignUp\022\016.SignUpRequest\032\017.SignUpRes" +
      "ponse\"\000B1\n-com.block.server._generated.p" +
      "roto.userserviceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SignInRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SignInRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignInRequest_descriptor,
        new java.lang.String[] { "Email", "Password", });
    internal_static_SignInResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SignInResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignInResponse_descriptor,
        new java.lang.String[] { "Status", "Nickname", "ProfileUrl", });
    internal_static_SignUpRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SignUpRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignUpRequest_descriptor,
        new java.lang.String[] { "Email", "Password", "Nickname", "Gender", "Avatar", "Birthday", });
    internal_static_SignUpResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SignUpResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignUpResponse_descriptor,
        new java.lang.String[] { "Status", "Nickname", "ProfileUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
