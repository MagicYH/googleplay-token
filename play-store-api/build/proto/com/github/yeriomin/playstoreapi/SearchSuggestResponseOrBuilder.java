// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface SearchSuggestResponseOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // repeated .SearchSuggestEntry entry = 1;
  /**
   * <code>repeated .SearchSuggestEntry entry = 1;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.SearchSuggestEntry> 
      getEntryList();
  /**
   * <code>repeated .SearchSuggestEntry entry = 1;</code>
   */
  com.github.yeriomin.playstoreapi.SearchSuggestEntry getEntry(int index);
  /**
   * <code>repeated .SearchSuggestEntry entry = 1;</code>
   */
  int getEntryCount();
  /**
   * <code>repeated .SearchSuggestEntry entry = 1;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.SearchSuggestEntryOrBuilder> 
      getEntryOrBuilderList();
  /**
   * <code>repeated .SearchSuggestEntry entry = 1;</code>
   */
  com.github.yeriomin.playstoreapi.SearchSuggestEntryOrBuilder getEntryOrBuilder(
      int index);
}