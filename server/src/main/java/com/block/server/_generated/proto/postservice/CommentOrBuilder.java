// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

public interface CommentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Comment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string commentId = 1;</code>
   * @return The commentId.
   */
  java.lang.String getCommentId();
  /**
   * <code>string commentId = 1;</code>
   * @return The bytes for commentId.
   */
  com.google.protobuf.ByteString
      getCommentIdBytes();

  /**
   * <code>string writer = 2;</code>
   * @return The writer.
   */
  java.lang.String getWriter();
  /**
   * <code>string writer = 2;</code>
   * @return The bytes for writer.
   */
  com.google.protobuf.ByteString
      getWriterBytes();

  /**
   * <code>string content = 3;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 3;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>int32 createdTS = 4;</code>
   * @return The createdTS.
   */
  int getCreatedTS();

  /**
   * <code>int32 modifiedTS = 5;</code>
   * @return The modifiedTS.
   */
  int getModifiedTS();
}
