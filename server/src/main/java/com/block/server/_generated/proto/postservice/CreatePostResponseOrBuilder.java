// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

public interface CreatePostResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreatePostResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.PostProtocolStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.PostProtocolStatus status = 1;</code>
   * @return The status.
   */
  com.block.server._generated.proto.postservice.PostProtocolStatus getStatus();

  /**
   * <code>int64 postId = 2;</code>
   * @return The postId.
   */
  long getPostId();

  /**
   * <code>string uploadImageUrl = 3;</code>
   * @return The uploadImageUrl.
   */
  java.lang.String getUploadImageUrl();
  /**
   * <code>string uploadImageUrl = 3;</code>
   * @return The bytes for uploadImageUrl.
   */
  com.google.protobuf.ByteString
      getUploadImageUrlBytes();
}
