// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AppProto.proto

package com.proto.generated;

public interface StudentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uc.mei.is.Student)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string telephone = 2;</code>
   * @return Whether the telephone field is set.
   */
  boolean hasTelephone();
  /**
   * <code>optional string telephone = 2;</code>
   * @return The telephone.
   */
  java.lang.String getTelephone();
  /**
   * <code>optional string telephone = 2;</code>
   * @return The bytes for telephone.
   */
  com.google.protobuf.ByteString
      getTelephoneBytes();

  /**
   * <code>optional string gender = 3;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <code>optional string gender = 3;</code>
   * @return The gender.
   */
  java.lang.String getGender();
  /**
   * <code>optional string gender = 3;</code>
   * @return The bytes for gender.
   */
  com.google.protobuf.ByteString
      getGenderBytes();

  /**
   * <code>optional string birthdate = 4;</code>
   * @return Whether the birthdate field is set.
   */
  boolean hasBirthdate();
  /**
   * <code>optional string birthdate = 4;</code>
   * @return The birthdate.
   */
  java.lang.String getBirthdate();
  /**
   * <code>optional string birthdate = 4;</code>
   * @return The bytes for birthdate.
   */
  com.google.protobuf.ByteString
      getBirthdateBytes();

  /**
   * <code>optional string address = 5;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>optional string address = 5;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>optional string address = 5;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>optional .uc.mei.is.Teacher teacher = 6;</code>
   * @return Whether the teacher field is set.
   */
  boolean hasTeacher();
  /**
   * <code>optional .uc.mei.is.Teacher teacher = 6;</code>
   * @return The teacher.
   */
  com.proto.generated.Teacher getTeacher();
  /**
   * <code>optional .uc.mei.is.Teacher teacher = 6;</code>
   */
  com.proto.generated.TeacherOrBuilder getTeacherOrBuilder();

  /**
   * <code>optional string registrationDate = 7;</code>
   * @return Whether the registrationDate field is set.
   */
  boolean hasRegistrationDate();
  /**
   * <code>optional string registrationDate = 7;</code>
   * @return The registrationDate.
   */
  java.lang.String getRegistrationDate();
  /**
   * <code>optional string registrationDate = 7;</code>
   * @return The bytes for registrationDate.
   */
  com.google.protobuf.ByteString
      getRegistrationDateBytes();
}
