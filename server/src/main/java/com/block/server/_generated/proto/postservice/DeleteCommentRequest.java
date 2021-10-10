// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

/**
 * Protobuf type {@code DeleteCommentRequest}
 */
public final class DeleteCommentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DeleteCommentRequest)
    DeleteCommentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteCommentRequest.newBuilder() to construct.
  private DeleteCommentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteCommentRequest() {
    commentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteCommentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteCommentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            commentId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_DeleteCommentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_DeleteCommentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.block.server._generated.proto.postservice.DeleteCommentRequest.class, com.block.server._generated.proto.postservice.DeleteCommentRequest.Builder.class);
  }

  public static final int COMMENTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object commentId_;
  /**
   * <code>string commentId = 1;</code>
   * @return The commentId.
   */
  @java.lang.Override
  public java.lang.String getCommentId() {
    java.lang.Object ref = commentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      commentId_ = s;
      return s;
    }
  }
  /**
   * <code>string commentId = 1;</code>
   * @return The bytes for commentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommentIdBytes() {
    java.lang.Object ref = commentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      commentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCommentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, commentId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCommentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, commentId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.block.server._generated.proto.postservice.DeleteCommentRequest)) {
      return super.equals(obj);
    }
    com.block.server._generated.proto.postservice.DeleteCommentRequest other = (com.block.server._generated.proto.postservice.DeleteCommentRequest) obj;

    if (!getCommentId()
        .equals(other.getCommentId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COMMENTID_FIELD_NUMBER;
    hash = (53 * hash) + getCommentId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.DeleteCommentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.block.server._generated.proto.postservice.DeleteCommentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code DeleteCommentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DeleteCommentRequest)
      com.block.server._generated.proto.postservice.DeleteCommentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_DeleteCommentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_DeleteCommentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.block.server._generated.proto.postservice.DeleteCommentRequest.class, com.block.server._generated.proto.postservice.DeleteCommentRequest.Builder.class);
    }

    // Construct using com.block.server._generated.proto.postservice.DeleteCommentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      commentId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_DeleteCommentRequest_descriptor;
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.DeleteCommentRequest getDefaultInstanceForType() {
      return com.block.server._generated.proto.postservice.DeleteCommentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.DeleteCommentRequest build() {
      com.block.server._generated.proto.postservice.DeleteCommentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.DeleteCommentRequest buildPartial() {
      com.block.server._generated.proto.postservice.DeleteCommentRequest result = new com.block.server._generated.proto.postservice.DeleteCommentRequest(this);
      result.commentId_ = commentId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.block.server._generated.proto.postservice.DeleteCommentRequest) {
        return mergeFrom((com.block.server._generated.proto.postservice.DeleteCommentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.block.server._generated.proto.postservice.DeleteCommentRequest other) {
      if (other == com.block.server._generated.proto.postservice.DeleteCommentRequest.getDefaultInstance()) return this;
      if (!other.getCommentId().isEmpty()) {
        commentId_ = other.commentId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.block.server._generated.proto.postservice.DeleteCommentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.block.server._generated.proto.postservice.DeleteCommentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object commentId_ = "";
    /**
     * <code>string commentId = 1;</code>
     * @return The commentId.
     */
    public java.lang.String getCommentId() {
      java.lang.Object ref = commentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        commentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string commentId = 1;</code>
     * @return The bytes for commentId.
     */
    public com.google.protobuf.ByteString
        getCommentIdBytes() {
      java.lang.Object ref = commentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        commentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string commentId = 1;</code>
     * @param value The commentId to set.
     * @return This builder for chaining.
     */
    public Builder setCommentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      commentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string commentId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommentId() {
      
      commentId_ = getDefaultInstance().getCommentId();
      onChanged();
      return this;
    }
    /**
     * <code>string commentId = 1;</code>
     * @param value The bytes for commentId to set.
     * @return This builder for chaining.
     */
    public Builder setCommentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      commentId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:DeleteCommentRequest)
  }

  // @@protoc_insertion_point(class_scope:DeleteCommentRequest)
  private static final com.block.server._generated.proto.postservice.DeleteCommentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.block.server._generated.proto.postservice.DeleteCommentRequest();
  }

  public static com.block.server._generated.proto.postservice.DeleteCommentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteCommentRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteCommentRequest>() {
    @java.lang.Override
    public DeleteCommentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteCommentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteCommentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteCommentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.block.server._generated.proto.postservice.DeleteCommentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
