// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface BulkDetailsResponseOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // repeated .BulkDetailsEntry entry = 1;
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.BulkDetailsEntry> 
      getEntryList();
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  com.github.yeriomin.playstoreapi.BulkDetailsEntry getEntry(int index);
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  int getEntryCount();
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.BulkDetailsEntryOrBuilder> 
      getEntryOrBuilderList();
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  com.github.yeriomin.playstoreapi.BulkDetailsEntryOrBuilder getEntryOrBuilder(
      int index);
}
