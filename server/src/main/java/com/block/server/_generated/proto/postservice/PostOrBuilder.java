// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

public interface PostOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Post)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string postId = 1;</code>
   * @return The postId.
   */
  java.lang.String getPostId();
  /**
   * <code>string postId = 1;</code>
   * @return The bytes for postId.
   */
  com.google.protobuf.ByteString
      getPostIdBytes();

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
   * <code>string imageUrl = 4;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <code>string imageUrl = 4;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <code>int32 likes = 5;</code>
   * @return The likes.
   */
  int getLikes();

  /**
   * <code>repeated .Comment comments = 6;</code>
   */
  java.util.List<com.block.server._generated.proto.postservice.Comment> 
      getCommentsList();
  /**
   * <code>repeated .Comment comments = 6;</code>
   */
  com.block.server._generated.proto.postservice.Comment getComments(int index);
  /**
   * <code>repeated .Comment comments = 6;</code>
   */
  int getCommentsCount();
  /**
   * <code>repeated .Comment comments = 6;</code>
   */
  java.util.List<? extends com.block.server._generated.proto.postservice.CommentOrBuilder> 
      getCommentsOrBuilderList();
  /**
   * <code>repeated .Comment comments = 6;</code>
   */
  com.block.server._generated.proto.postservice.CommentOrBuilder getCommentsOrBuilder(
      int index);

  /**
   * <code>.Location location = 7;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.Location location = 7;</code>
   * @return The location.
   */
  com.block.server._generated.proto.postservice.Location getLocation();
  /**
   * <code>.Location location = 7;</code>
   */
  com.block.server._generated.proto.postservice.LocationOrBuilder getLocationOrBuilder();
}
