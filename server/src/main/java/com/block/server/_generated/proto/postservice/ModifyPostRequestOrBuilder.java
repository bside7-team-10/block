// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

public interface ModifyPostRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ModifyPostRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 postId = 1;</code>
   * @return The postId.
   */
  long getPostId();

  /**
   * <code>string content = 2;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 2;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>bool modifiedImage = 3;</code>
   * @return The modifiedImage.
   */
  boolean getModifiedImage();
}
