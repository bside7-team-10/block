// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

public interface CreateCommentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateCommentResponse)
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
   * <code>int64 commentId = 2;</code>
   * @return The commentId.
   */
  long getCommentId();
}
