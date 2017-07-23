// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface ImageOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int32 imageType = 1;
  /**
   * <code>optional int32 imageType = 1;</code>
   */
  boolean hasImageType();
  /**
   * <code>optional int32 imageType = 1;</code>
   */
  int getImageType();

  // optional group Dimension = 2 {
  /**
   * <code>optional group Dimension = 2 { ... }</code>
   */
  boolean hasDimension();
  /**
   * <code>optional group Dimension = 2 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.Image.Dimension getDimension();
  /**
   * <code>optional group Dimension = 2 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.Image.DimensionOrBuilder getDimensionOrBuilder();

  // optional string imageUrl = 5;
  /**
   * <code>optional string imageUrl = 5;</code>
   */
  boolean hasImageUrl();
  /**
   * <code>optional string imageUrl = 5;</code>
   */
  java.lang.String getImageUrl();
  /**
   * <code>optional string imageUrl = 5;</code>
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  // optional string altTextLocalized = 6;
  /**
   * <code>optional string altTextLocalized = 6;</code>
   */
  boolean hasAltTextLocalized();
  /**
   * <code>optional string altTextLocalized = 6;</code>
   */
  java.lang.String getAltTextLocalized();
  /**
   * <code>optional string altTextLocalized = 6;</code>
   */
  com.google.protobuf.ByteString
      getAltTextLocalizedBytes();

  // optional string secureUrl = 7;
  /**
   * <code>optional string secureUrl = 7;</code>
   */
  boolean hasSecureUrl();
  /**
   * <code>optional string secureUrl = 7;</code>
   */
  java.lang.String getSecureUrl();
  /**
   * <code>optional string secureUrl = 7;</code>
   */
  com.google.protobuf.ByteString
      getSecureUrlBytes();

  // optional int32 positionInSequence = 8;
  /**
   * <code>optional int32 positionInSequence = 8;</code>
   */
  boolean hasPositionInSequence();
  /**
   * <code>optional int32 positionInSequence = 8;</code>
   */
  int getPositionInSequence();

  // optional bool supportsFifeUrlOptions = 9;
  /**
   * <code>optional bool supportsFifeUrlOptions = 9;</code>
   */
  boolean hasSupportsFifeUrlOptions();
  /**
   * <code>optional bool supportsFifeUrlOptions = 9;</code>
   */
  boolean getSupportsFifeUrlOptions();

  // optional group Citation = 10 {
  /**
   * <code>optional group Citation = 10 { ... }</code>
   */
  boolean hasCitation();
  /**
   * <code>optional group Citation = 10 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.Image.Citation getCitation();
  /**
   * <code>optional group Citation = 10 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.Image.CitationOrBuilder getCitationOrBuilder();

  // optional string color = 15;
  /**
   * <code>optional string color = 15;</code>
   */
  boolean hasColor();
  /**
   * <code>optional string color = 15;</code>
   */
  java.lang.String getColor();
  /**
   * <code>optional string color = 15;</code>
   */
  com.google.protobuf.ByteString
      getColorBytes();
}