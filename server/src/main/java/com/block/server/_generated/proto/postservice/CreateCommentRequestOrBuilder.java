// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

public interface CreateCommentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateCommentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string author = 1;</code>
   * @return The author.
   */
  java.lang.String getAuthor();
  /**
   * <code>string author = 1;</code>
   * @return The bytes for author.
   */
  com.google.protobuf.ByteString
      getAuthorBytes();

  /**
   * <code>string postId = 2;</code>
   * @return The postId.
   */
  java.lang.String getPostId();
  /**
   * <code>string postId = 2;</code>
   * @return The bytes for postId.
   */
  com.google.protobuf.ByteString
      getPostIdBytes();

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
}
