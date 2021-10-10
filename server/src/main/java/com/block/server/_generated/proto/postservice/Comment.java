// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

/**
 * Protobuf type {@code Comment}
 */
public final class Comment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Comment)
    CommentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Comment.newBuilder() to construct.
  private Comment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Comment() {
    commentId_ = "";
    writer_ = "";
    content_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Comment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Comment(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            writer_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 32: {

            createdTS_ = input.readInt32();
            break;
          }
          case 40: {

            modifiedTS_ = input.readInt32();
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
    return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_Comment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_Comment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.block.server._generated.proto.postservice.Comment.class, com.block.server._generated.proto.postservice.Comment.Builder.class);
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

  public static final int WRITER_FIELD_NUMBER = 2;
  private volatile java.lang.Object writer_;
  /**
   * <code>string writer = 2;</code>
   * @return The writer.
   */
  @java.lang.Override
  public java.lang.String getWriter() {
    java.lang.Object ref = writer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      writer_ = s;
      return s;
    }
  }
  /**
   * <code>string writer = 2;</code>
   * @return The bytes for writer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWriterBytes() {
    java.lang.Object ref = writer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      writer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object content_;
  /**
   * <code>string content = 3;</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <code>string content = 3;</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEDTS_FIELD_NUMBER = 4;
  private int createdTS_;
  /**
   * <code>int32 createdTS = 4;</code>
   * @return The createdTS.
   */
  @java.lang.Override
  public int getCreatedTS() {
    return createdTS_;
  }

  public static final int MODIFIEDTS_FIELD_NUMBER = 5;
  private int modifiedTS_;
  /**
   * <code>int32 modifiedTS = 5;</code>
   * @return The modifiedTS.
   */
  @java.lang.Override
  public int getModifiedTS() {
    return modifiedTS_;
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
    if (!getWriterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, writer_);
    }
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_);
    }
    if (createdTS_ != 0) {
      output.writeInt32(4, createdTS_);
    }
    if (modifiedTS_ != 0) {
      output.writeInt32(5, modifiedTS_);
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
    if (!getWriterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, writer_);
    }
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, content_);
    }
    if (createdTS_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, createdTS_);
    }
    if (modifiedTS_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, modifiedTS_);
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
    if (!(obj instanceof com.block.server._generated.proto.postservice.Comment)) {
      return super.equals(obj);
    }
    com.block.server._generated.proto.postservice.Comment other = (com.block.server._generated.proto.postservice.Comment) obj;

    if (!getCommentId()
        .equals(other.getCommentId())) return false;
    if (!getWriter()
        .equals(other.getWriter())) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
    if (getCreatedTS()
        != other.getCreatedTS()) return false;
    if (getModifiedTS()
        != other.getModifiedTS()) return false;
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
    hash = (37 * hash) + WRITER_FIELD_NUMBER;
    hash = (53 * hash) + getWriter().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + CREATEDTS_FIELD_NUMBER;
    hash = (53 * hash) + getCreatedTS();
    hash = (37 * hash) + MODIFIEDTS_FIELD_NUMBER;
    hash = (53 * hash) + getModifiedTS();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.block.server._generated.proto.postservice.Comment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.Comment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.Comment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.Comment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.Comment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.postservice.Comment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.Comment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.Comment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.Comment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.Comment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.postservice.Comment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.postservice.Comment parseFrom(
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
  public static Builder newBuilder(com.block.server._generated.proto.postservice.Comment prototype) {
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
   * Protobuf type {@code Comment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Comment)
      com.block.server._generated.proto.postservice.CommentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_Comment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_Comment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.block.server._generated.proto.postservice.Comment.class, com.block.server._generated.proto.postservice.Comment.Builder.class);
    }

    // Construct using com.block.server._generated.proto.postservice.Comment.newBuilder()
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

      writer_ = "";

      content_ = "";

      createdTS_ = 0;

      modifiedTS_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.block.server._generated.proto.postservice.PostProtocolOuterClass.internal_static_Comment_descriptor;
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.Comment getDefaultInstanceForType() {
      return com.block.server._generated.proto.postservice.Comment.getDefaultInstance();
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.Comment build() {
      com.block.server._generated.proto.postservice.Comment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.block.server._generated.proto.postservice.Comment buildPartial() {
      com.block.server._generated.proto.postservice.Comment result = new com.block.server._generated.proto.postservice.Comment(this);
      result.commentId_ = commentId_;
      result.writer_ = writer_;
      result.content_ = content_;
      result.createdTS_ = createdTS_;
      result.modifiedTS_ = modifiedTS_;
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
      if (other instanceof com.block.server._generated.proto.postservice.Comment) {
        return mergeFrom((com.block.server._generated.proto.postservice.Comment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.block.server._generated.proto.postservice.Comment other) {
      if (other == com.block.server._generated.proto.postservice.Comment.getDefaultInstance()) return this;
      if (!other.getCommentId().isEmpty()) {
        commentId_ = other.commentId_;
        onChanged();
      }
      if (!other.getWriter().isEmpty()) {
        writer_ = other.writer_;
        onChanged();
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (other.getCreatedTS() != 0) {
        setCreatedTS(other.getCreatedTS());
      }
      if (other.getModifiedTS() != 0) {
        setModifiedTS(other.getModifiedTS());
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
      com.block.server._generated.proto.postservice.Comment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.block.server._generated.proto.postservice.Comment) e.getUnfinishedMessage();
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

    private java.lang.Object writer_ = "";
    /**
     * <code>string writer = 2;</code>
     * @return The writer.
     */
    public java.lang.String getWriter() {
      java.lang.Object ref = writer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        writer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string writer = 2;</code>
     * @return The bytes for writer.
     */
    public com.google.protobuf.ByteString
        getWriterBytes() {
      java.lang.Object ref = writer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        writer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string writer = 2;</code>
     * @param value The writer to set.
     * @return This builder for chaining.
     */
    public Builder setWriter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      writer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string writer = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWriter() {
      
      writer_ = getDefaultInstance().getWriter();
      onChanged();
      return this;
    }
    /**
     * <code>string writer = 2;</code>
     * @param value The bytes for writer to set.
     * @return This builder for chaining.
     */
    public Builder setWriterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      writer_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <code>string content = 3;</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content = 3;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content = 3;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <code>string content = 3;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value;
      onChanged();
      return this;
    }

    private int createdTS_ ;
    /**
     * <code>int32 createdTS = 4;</code>
     * @return The createdTS.
     */
    @java.lang.Override
    public int getCreatedTS() {
      return createdTS_;
    }
    /**
     * <code>int32 createdTS = 4;</code>
     * @param value The createdTS to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedTS(int value) {
      
      createdTS_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 createdTS = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreatedTS() {
      
      createdTS_ = 0;
      onChanged();
      return this;
    }

    private int modifiedTS_ ;
    /**
     * <code>int32 modifiedTS = 5;</code>
     * @return The modifiedTS.
     */
    @java.lang.Override
    public int getModifiedTS() {
      return modifiedTS_;
    }
    /**
     * <code>int32 modifiedTS = 5;</code>
     * @param value The modifiedTS to set.
     * @return This builder for chaining.
     */
    public Builder setModifiedTS(int value) {
      
      modifiedTS_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 modifiedTS = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearModifiedTS() {
      
      modifiedTS_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Comment)
  }

  // @@protoc_insertion_point(class_scope:Comment)
  private static final com.block.server._generated.proto.postservice.Comment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.block.server._generated.proto.postservice.Comment();
  }

  public static com.block.server._generated.proto.postservice.Comment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Comment>
      PARSER = new com.google.protobuf.AbstractParser<Comment>() {
    @java.lang.Override
    public Comment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Comment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Comment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Comment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.block.server._generated.proto.postservice.Comment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

