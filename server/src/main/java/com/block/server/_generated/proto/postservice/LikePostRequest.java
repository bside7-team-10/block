// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

/**
 * Protobuf type {@code LikePostRequest}
 */
public final class LikePostRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LikePostRequest)
    LikePostRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LikePostRequest.newBuilder() to construct.
  private LikePostRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LikePostRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LikePostRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LikePostRequest(
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
          case 8: {

            postId_ = input.readInt64();
            break;
          }
          case 16: {

            like_ = input.readBool();
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
    return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.block.server._generated.proto.postservice.LikePostRequest.class, com.block.server._generated.proto.postservice.LikePostRequest.Builder.class);
  }

  public static final int POSTID_FIELD_NUMBER = 1;
  private long postId_;
  /**
   * <code>int64 postId = 1;</code>
   * @return The postId.
   */
  @java.lang.Override
  public long getPostId() {
    return postId_;
  }

  public static final int LIKE_FIELD_NUMBER = 2;
  private boolean like_;
  /**
   * <code>bool like = 2;</code>
   * @return The like.
   */
  @java.lang.Override
  public boolean getLike() {
    return like_;
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
    if (postId_ != 0L) {
      output.writeInt64(1, postId_);
    }
    if (like_ != false) {
      output.writeBool(2, like_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (postId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, postId_);
    }
    if (like_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, like_);
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
    if (!(obj instanceof com.block.server._generated.proto.postservice.LikePostRequest)) {
      return super.equals(obj);
    }
    com.block.server._generated.proto.postservice.LikePostRequest other = (com.block.server._generated.proto.postservice.LikePostRequest) obj;

    if (getPostId()
        != other.getPostId()) return false;
    if (getLike()
        != other.getLike()) return false;
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
    hash = (37 * hash) + POSTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPostId());
    hash = (37 * hash) + LIKE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLike());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.LikePostRequest parseFrom(
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
  public static Builder newBuilder(com.block.server._generated.proto.postservice.LikePostRequest prototype) {
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
   * Protobuf type {@code LikePostRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LikePostRequest)
      com.block.server._generated.proto.postservice.LikePostRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.block.server._generated.proto.postservice.LikePostRequest.class, com.block.server._generated.proto.postservice.LikePostRequest.Builder.class);
    }

    // Construct using com.block.server._generated.proto.postservice.LikePostRequest.newBuilder()
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
      postId_ = 0L;

      like_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostRequest_descriptor;
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.LikePostRequest getDefaultInstanceForType() {
      return com.block.server._generated.proto.postservice.LikePostRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.LikePostRequest build() {
      com.block.server._generated.proto.postservice.LikePostRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.LikePostRequest buildPartial() {
      com.block.server._generated.proto.postservice.LikePostRequest result = new com.block.server._generated.proto.postservice.LikePostRequest(this);
      result.postId_ = postId_;
      result.like_ = like_;
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
      if (other instanceof com.block.server._generated.proto.postservice.LikePostRequest) {
        return mergeFrom((com.block.server._generated.proto.postservice.LikePostRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.block.server._generated.proto.postservice.LikePostRequest other) {
      if (other == com.block.server._generated.proto.postservice.LikePostRequest.getDefaultInstance()) return this;
      if (other.getPostId() != 0L) {
        setPostId(other.getPostId());
      }
      if (other.getLike() != false) {
        setLike(other.getLike());
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
      com.block.server._generated.proto.postservice.LikePostRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.block.server._generated.proto.postservice.LikePostRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long postId_ ;
    /**
     * <code>int64 postId = 1;</code>
     * @return The postId.
     */
    @java.lang.Override
    public long getPostId() {
      return postId_;
    }
    /**
     * <code>int64 postId = 1;</code>
     * @param value The postId to set.
     * @return This builder for chaining.
     */
    public Builder setPostId(long value) {
      
      postId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 postId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPostId() {
      
      postId_ = 0L;
      onChanged();
      return this;
    }

    private boolean like_ ;
    /**
     * <code>bool like = 2;</code>
     * @return The like.
     */
    @java.lang.Override
    public boolean getLike() {
      return like_;
    }
    /**
     * <code>bool like = 2;</code>
     * @param value The like to set.
     * @return This builder for chaining.
     */
    public Builder setLike(boolean value) {
      
      like_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool like = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLike() {
      
      like_ = false;
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


    // @@protoc_insertion_point(builder_scope:LikePostRequest)
  }

  // @@protoc_insertion_point(class_scope:LikePostRequest)
  private static final com.block.server._generated.proto.postservice.LikePostRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.block.server._generated.proto.postservice.LikePostRequest();
  }

  public static com.block.server._generated.proto.postservice.LikePostRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LikePostRequest>
      PARSER = new com.google.protobuf.AbstractParser<LikePostRequest>() {
    @java.lang.Override
    public LikePostRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LikePostRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LikePostRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LikePostRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.block.server._generated.proto.postservice.LikePostRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
