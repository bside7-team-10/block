// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

/**
 * Protobuf type {@code LikePostResponse}
 */
public final class LikePostResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LikePostResponse)
    LikePostResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LikePostResponse.newBuilder() to construct.
  private LikePostResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LikePostResponse() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LikePostResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LikePostResponse(
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
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            com.block.server._generated.proto.postservice.PostDto.Builder subBuilder = null;
            if (post_ != null) {
              subBuilder = post_.toBuilder();
            }
            post_ = input.readMessage(com.block.server._generated.proto.postservice.PostDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(post_);
              post_ = subBuilder.buildPartial();
            }

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
    return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.block.server._generated.proto.postservice.LikePostResponse.class, com.block.server._generated.proto.postservice.LikePostResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.PostProtocolStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.PostProtocolStatus status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public com.block.server._generated.proto.postservice.PostProtocolStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.block.server._generated.proto.postservice.PostProtocolStatus result = com.block.server._generated.proto.postservice.PostProtocolStatus.valueOf(status_);
    return result == null ? com.block.server._generated.proto.postservice.PostProtocolStatus.UNRECOGNIZED : result;
  }

  public static final int POST_FIELD_NUMBER = 2;
  private com.block.server._generated.proto.postservice.PostDto post_;
  /**
   * <code>.PostDto post = 2;</code>
   * @return Whether the post field is set.
   */
  @java.lang.Override
  public boolean hasPost() {
    return post_ != null;
  }
  /**
   * <code>.PostDto post = 2;</code>
   * @return The post.
   */
  @java.lang.Override
  public com.block.server._generated.proto.postservice.PostDto getPost() {
    return post_ == null ? com.block.server._generated.proto.postservice.PostDto.getDefaultInstance() : post_;
  }
  /**
   * <code>.PostDto post = 2;</code>
   */
  @java.lang.Override
  public com.block.server._generated.proto.postservice.PostDtoOrBuilder getPostOrBuilder() {
    return getPost();
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
    if (status_ != com.block.server._generated.proto.postservice.PostProtocolStatus.SUCCESS.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (post_ != null) {
      output.writeMessage(2, getPost());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != com.block.server._generated.proto.postservice.PostProtocolStatus.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (post_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPost());
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
    if (!(obj instanceof com.block.server._generated.proto.postservice.LikePostResponse)) {
      return super.equals(obj);
    }
    com.block.server._generated.proto.postservice.LikePostResponse other = (com.block.server._generated.proto.postservice.LikePostResponse) obj;

    if (status_ != other.status_) return false;
    if (hasPost() != other.hasPost()) return false;
    if (hasPost()) {
      if (!getPost()
          .equals(other.getPost())) return false;
    }
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasPost()) {
      hash = (37 * hash) + POST_FIELD_NUMBER;
      hash = (53 * hash) + getPost().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.LikePostResponse parseFrom(
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
  public static Builder newBuilder(com.block.server._generated.proto.postservice.LikePostResponse prototype) {
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
   * Protobuf type {@code LikePostResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LikePostResponse)
      com.block.server._generated.proto.postservice.LikePostResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.block.server._generated.proto.postservice.LikePostResponse.class, com.block.server._generated.proto.postservice.LikePostResponse.Builder.class);
    }

    // Construct using com.block.server._generated.proto.postservice.LikePostResponse.newBuilder()
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
      status_ = 0;

      if (postBuilder_ == null) {
        post_ = null;
      } else {
        post_ = null;
        postBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_LikePostResponse_descriptor;
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.LikePostResponse getDefaultInstanceForType() {
      return com.block.server._generated.proto.postservice.LikePostResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.LikePostResponse build() {
      com.block.server._generated.proto.postservice.LikePostResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.LikePostResponse buildPartial() {
      com.block.server._generated.proto.postservice.LikePostResponse result = new com.block.server._generated.proto.postservice.LikePostResponse(this);
      result.status_ = status_;
      if (postBuilder_ == null) {
        result.post_ = post_;
      } else {
        result.post_ = postBuilder_.build();
      }
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
      if (other instanceof com.block.server._generated.proto.postservice.LikePostResponse) {
        return mergeFrom((com.block.server._generated.proto.postservice.LikePostResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.block.server._generated.proto.postservice.LikePostResponse other) {
      if (other == com.block.server._generated.proto.postservice.LikePostResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasPost()) {
        mergePost(other.getPost());
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
      com.block.server._generated.proto.postservice.LikePostResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.block.server._generated.proto.postservice.LikePostResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.PostProtocolStatus status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.PostProtocolStatus status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.PostProtocolStatus status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.block.server._generated.proto.postservice.PostProtocolStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.block.server._generated.proto.postservice.PostProtocolStatus result = com.block.server._generated.proto.postservice.PostProtocolStatus.valueOf(status_);
      return result == null ? com.block.server._generated.proto.postservice.PostProtocolStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.PostProtocolStatus status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.block.server._generated.proto.postservice.PostProtocolStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.PostProtocolStatus status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private com.block.server._generated.proto.postservice.PostDto post_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.block.server._generated.proto.postservice.PostDto, com.block.server._generated.proto.postservice.PostDto.Builder, com.block.server._generated.proto.postservice.PostDtoOrBuilder> postBuilder_;
    /**
     * <code>.PostDto post = 2;</code>
     * @return Whether the post field is set.
     */
    public boolean hasPost() {
      return postBuilder_ != null || post_ != null;
    }
    /**
     * <code>.PostDto post = 2;</code>
     * @return The post.
     */
    public com.block.server._generated.proto.postservice.PostDto getPost() {
      if (postBuilder_ == null) {
        return post_ == null ? com.block.server._generated.proto.postservice.PostDto.getDefaultInstance() : post_;
      } else {
        return postBuilder_.getMessage();
      }
    }
    /**
     * <code>.PostDto post = 2;</code>
     */
    public Builder setPost(com.block.server._generated.proto.postservice.PostDto value) {
      if (postBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        post_ = value;
        onChanged();
      } else {
        postBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.PostDto post = 2;</code>
     */
    public Builder setPost(
        com.block.server._generated.proto.postservice.PostDto.Builder builderForValue) {
      if (postBuilder_ == null) {
        post_ = builderForValue.build();
        onChanged();
      } else {
        postBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.PostDto post = 2;</code>
     */
    public Builder mergePost(com.block.server._generated.proto.postservice.PostDto value) {
      if (postBuilder_ == null) {
        if (post_ != null) {
          post_ =
            com.block.server._generated.proto.postservice.PostDto.newBuilder(post_).mergeFrom(value).buildPartial();
        } else {
          post_ = value;
        }
        onChanged();
      } else {
        postBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.PostDto post = 2;</code>
     */
    public Builder clearPost() {
      if (postBuilder_ == null) {
        post_ = null;
        onChanged();
      } else {
        post_ = null;
        postBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.PostDto post = 2;</code>
     */
    public com.block.server._generated.proto.postservice.PostDto.Builder getPostBuilder() {
      
      onChanged();
      return getPostFieldBuilder().getBuilder();
    }
    /**
     * <code>.PostDto post = 2;</code>
     */
    public com.block.server._generated.proto.postservice.PostDtoOrBuilder getPostOrBuilder() {
      if (postBuilder_ != null) {
        return postBuilder_.getMessageOrBuilder();
      } else {
        return post_ == null ?
            com.block.server._generated.proto.postservice.PostDto.getDefaultInstance() : post_;
      }
    }
    /**
     * <code>.PostDto post = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.block.server._generated.proto.postservice.PostDto, com.block.server._generated.proto.postservice.PostDto.Builder, com.block.server._generated.proto.postservice.PostDtoOrBuilder> 
        getPostFieldBuilder() {
      if (postBuilder_ == null) {
        postBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.block.server._generated.proto.postservice.PostDto, com.block.server._generated.proto.postservice.PostDto.Builder, com.block.server._generated.proto.postservice.PostDtoOrBuilder>(
                getPost(),
                getParentForChildren(),
                isClean());
        post_ = null;
      }
      return postBuilder_;
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


    // @@protoc_insertion_point(builder_scope:LikePostResponse)
  }

  // @@protoc_insertion_point(class_scope:LikePostResponse)
  private static final com.block.server._generated.proto.postservice.LikePostResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.block.server._generated.proto.postservice.LikePostResponse();
  }

  public static com.block.server._generated.proto.postservice.LikePostResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LikePostResponse>
      PARSER = new com.google.protobuf.AbstractParser<LikePostResponse>() {
    @java.lang.Override
    public LikePostResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LikePostResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LikePostResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LikePostResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.block.server._generated.proto.postservice.LikePostResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

