// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface InstallOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional fixed64 androidId = 1;
  /**
   * <code>optional fixed64 androidId = 1;</code>
   */
  boolean hasAndroidId();
  /**
   * <code>optional fixed64 androidId = 1;</code>
   */
  long getAndroidId();

  // optional int32 version = 2;
  /**
   * <code>optional int32 version = 2;</code>
   */
  boolean hasVersion();
  /**
   * <code>optional int32 version = 2;</code>
   */
  int getVersion();

  // optional bool bundled = 3;
  /**
   * <code>optional bool bundled = 3;</code>
   */
  boolean hasBundled();
  /**
   * <code>optional bool bundled = 3;</code>
   */
  boolean getBundled();
}