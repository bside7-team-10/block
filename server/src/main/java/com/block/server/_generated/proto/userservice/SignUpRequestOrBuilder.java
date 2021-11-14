// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserProtocol.proto

package com.block.server._generated.proto.userservice;

public interface SignUpRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SignUpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string email = 1;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string password = 2;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string nickname = 3;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 3;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>.SignUpRequest.Gender gender = 4;</code>
   * @return The enum numeric value on the wire for gender.
   */
  int getGenderValue();
  /**
   * <code>.SignUpRequest.Gender gender = 4;</code>
   * @return The gender.
   */
  com.block.server._generated.proto.userservice.SignUpRequest.Gender getGender();

  /**
   * <code>string avatarId = 5;</code>
   * @return The avatarId.
   */
  java.lang.String getAvatarId();
  /**
   * <code>string avatarId = 5;</code>
   * @return The bytes for avatarId.
   */
  com.google.protobuf.ByteString
      getAvatarIdBytes();

  /**
   * <code>string birthday = 6;</code>
   * @return The birthday.
   */
  java.lang.String getBirthday();
  /**
   * <code>string birthday = 6;</code>
   * @return The bytes for birthday.
   */
  com.google.protobuf.ByteString
      getBirthdayBytes();

  /**
   * <code>repeated string interestHashTags = 7;</code>
   * @return A list containing the interestHashTags.
   */
  java.util.List<java.lang.String>
      getInterestHashTagsList();
  /**
   * <code>repeated string interestHashTags = 7;</code>
   * @return The count of interestHashTags.
   */
  int getInterestHashTagsCount();
  /**
   * <code>repeated string interestHashTags = 7;</code>
   * @param index The index of the element to return.
   * @return The interestHashTags at the given index.
   */
  java.lang.String getInterestHashTags(int index);
  /**
   * <code>repeated string interestHashTags = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the interestHashTags at the given index.
   */
  com.google.protobuf.ByteString
      getInterestHashTagsBytes(int index);
}
