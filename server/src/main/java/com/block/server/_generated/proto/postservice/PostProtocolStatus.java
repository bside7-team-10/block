// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

/**
 * Protobuf enum {@code PostProtocolStatus}
 */
public enum PostProtocolStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUCCESS = 0;</code>
   */
  SUCCESS(0),
  /**
   * <code>NO_POST = 1;</code>
   */
  NO_POST(1),
  /**
   * <code>NO_COMMENT = 2;</code>
   */
  NO_COMMENT(2),
  /**
   * <code>NOT_AUTHORIZED = 3;</code>
   */
  NOT_AUTHORIZED(3),
  /**
   * <code>INTERNAL_ERROR = 99;</code>
   */
  INTERNAL_ERROR(99),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUCCESS = 0;</code>
   */
  public static final int SUCCESS_VALUE = 0;
  /**
   * <code>NO_POST = 1;</code>
   */
  public static final int NO_POST_VALUE = 1;
  /**
   * <code>NO_COMMENT = 2;</code>
   */
  public static final int NO_COMMENT_VALUE = 2;
  /**
   * <code>NOT_AUTHORIZED = 3;</code>
   */
  public static final int NOT_AUTHORIZED_VALUE = 3;
  /**
   * <code>INTERNAL_ERROR = 99;</code>
   */
  public static final int INTERNAL_ERROR_VALUE = 99;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PostProtocolStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PostProtocolStatus forNumber(int value) {
    switch (value) {
      case 0: return SUCCESS;
      case 1: return NO_POST;
      case 2: return NO_COMMENT;
      case 3: return NOT_AUTHORIZED;
      case 99: return INTERNAL_ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PostProtocolStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PostProtocolStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PostProtocolStatus>() {
          public PostProtocolStatus findValueByNumber(int number) {
            return PostProtocolStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.block.server._generated.proto.postservice.PostProtocolOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final PostProtocolStatus[] VALUES = values();

  public static PostProtocolStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PostProtocolStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:PostProtocolStatus)
}

