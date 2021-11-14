// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

public interface PostDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PostDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 postId = 1;</code>
   * @return The postId.
   */
  long getPostId();

  /**
   * <code>.UserDto author = 2;</code>
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   * <code>.UserDto author = 2;</code>
   * @return The author.
   */
  com.block.server._generated.proto.postservice.UserDto getAuthor();
  /**
   * <code>.UserDto author = 2;</code>
   */
  com.block.server._generated.proto.postservice.UserDtoOrBuilder getAuthorOrBuilder();

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
   * <code>repeated .CommentDto comments = 6;</code>
   */
  java.util.List<com.block.server._generated.proto.postservice.CommentDto> 
      getCommentsList();
  /**
   * <code>repeated .CommentDto comments = 6;</code>
   */
  com.block.server._generated.proto.postservice.CommentDto getComments(int index);
  /**
   * <code>repeated .CommentDto comments = 6;</code>
   */
  int getCommentsCount();
  /**
   * <code>repeated .CommentDto comments = 6;</code>
   */
  java.util.List<? extends com.block.server._generated.proto.postservice.CommentDtoOrBuilder> 
      getCommentsOrBuilderList();
  /**
   * <code>repeated .CommentDto comments = 6;</code>
   */
  com.block.server._generated.proto.postservice.CommentDtoOrBuilder getCommentsOrBuilder(
      int index);

  /**
   * <code>.LocationDto location = 7;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.LocationDto location = 7;</code>
   * @return The location.
   */
  com.block.server._generated.proto.postservice.LocationDto getLocation();
  /**
   * <code>.LocationDto location = 7;</code>
   */
  com.block.server._generated.proto.postservice.LocationDtoOrBuilder getLocationOrBuilder();

  /**
   * <code>string address = 8;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 8;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}
