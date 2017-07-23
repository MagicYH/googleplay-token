// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code CategoryInfo}
 */
public  final class CategoryInfo extends
    com.google.protobuf.GeneratedMessage
    implements CategoryInfoOrBuilder {
  // Use CategoryInfo.newBuilder() to construct.
  private CategoryInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private CategoryInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final CategoryInfo defaultInstance;
  public static CategoryInfo getDefaultInstance() {
    return defaultInstance;
  }

  public CategoryInfo getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private CategoryInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            bitField0_ |= 0x00000001;
            appType_ = input.readBytes();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            appCategory_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.CategoryInfo.class, com.github.yeriomin.playstoreapi.CategoryInfo.Builder.class);
  }

  public static com.google.protobuf.Parser<CategoryInfo> PARSER =
      new com.google.protobuf.AbstractParser<CategoryInfo>() {
    public CategoryInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CategoryInfo(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<CategoryInfo> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional string appType = 1;
  public static final int APPTYPE_FIELD_NUMBER = 1;
  private java.lang.Object appType_;
  /**
   * <code>optional string appType = 1;</code>
   */
  public boolean hasAppType() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string appType = 1;</code>
   */
  public java.lang.String getAppType() {
    java.lang.Object ref = appType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        appType_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string appType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAppTypeBytes() {
    java.lang.Object ref = appType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional string appCategory = 2;
  public static final int APPCATEGORY_FIELD_NUMBER = 2;
  private java.lang.Object appCategory_;
  /**
   * <code>optional string appCategory = 2;</code>
   */
  public boolean hasAppCategory() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string appCategory = 2;</code>
   */
  public java.lang.String getAppCategory() {
    java.lang.Object ref = appCategory_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        appCategory_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string appCategory = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAppCategoryBytes() {
    java.lang.Object ref = appCategory_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appCategory_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    appType_ = "";
    appCategory_ = "";
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBytes(1, getAppTypeBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getAppCategoryBytes());
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getAppTypeBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getAppCategoryBytes());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static com.github.yeriomin.playstoreapi.CategoryInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.CategoryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CategoryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.CategoryInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CategoryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.CategoryInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CategoryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.CategoryInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CategoryInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.CategoryInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.CategoryInfo prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code CategoryInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.CategoryInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.CategoryInfo.class, com.github.yeriomin.playstoreapi.CategoryInfo.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.CategoryInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      appType_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      appCategory_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryInfo_descriptor;
    }

    public com.github.yeriomin.playstoreapi.CategoryInfo getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.CategoryInfo.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.CategoryInfo build() {
      com.github.yeriomin.playstoreapi.CategoryInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.CategoryInfo buildPartial() {
      com.github.yeriomin.playstoreapi.CategoryInfo result = new com.github.yeriomin.playstoreapi.CategoryInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.appType_ = appType_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.appCategory_ = appCategory_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.CategoryInfo) {
        return mergeFrom((com.github.yeriomin.playstoreapi.CategoryInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.CategoryInfo other) {
      if (other == com.github.yeriomin.playstoreapi.CategoryInfo.getDefaultInstance()) return this;
      if (other.hasAppType()) {
        bitField0_ |= 0x00000001;
        appType_ = other.appType_;
        onChanged();
      }
      if (other.hasAppCategory()) {
        bitField0_ |= 0x00000002;
        appCategory_ = other.appCategory_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.yeriomin.playstoreapi.CategoryInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.CategoryInfo) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional string appType = 1;
    private java.lang.Object appType_ = "";
    /**
     * <code>optional string appType = 1;</code>
     */
    public boolean hasAppType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string appType = 1;</code>
     */
    public java.lang.String getAppType() {
      java.lang.Object ref = appType_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        appType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string appType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppTypeBytes() {
      java.lang.Object ref = appType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string appType = 1;</code>
     */
    public Builder setAppType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      appType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string appType = 1;</code>
     */
    public Builder clearAppType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      appType_ = getDefaultInstance().getAppType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string appType = 1;</code>
     */
    public Builder setAppTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      appType_ = value;
      onChanged();
      return this;
    }

    // optional string appCategory = 2;
    private java.lang.Object appCategory_ = "";
    /**
     * <code>optional string appCategory = 2;</code>
     */
    public boolean hasAppCategory() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string appCategory = 2;</code>
     */
    public java.lang.String getAppCategory() {
      java.lang.Object ref = appCategory_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        appCategory_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string appCategory = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAppCategoryBytes() {
      java.lang.Object ref = appCategory_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appCategory_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string appCategory = 2;</code>
     */
    public Builder setAppCategory(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      appCategory_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string appCategory = 2;</code>
     */
    public Builder clearAppCategory() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appCategory_ = getDefaultInstance().getAppCategory();
      onChanged();
      return this;
    }
    /**
     * <code>optional string appCategory = 2;</code>
     */
    public Builder setAppCategoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      appCategory_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:CategoryInfo)
  }

  static {
    defaultInstance = new CategoryInfo(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:CategoryInfo)
}
