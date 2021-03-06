// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code GservicesSetting}
 */
public  final class GservicesSetting extends
    com.google.protobuf.GeneratedMessage
    implements GservicesSettingOrBuilder {
  // Use GservicesSetting.newBuilder() to construct.
  private GservicesSetting(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private GservicesSetting(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final GservicesSetting defaultInstance;
  public static GservicesSetting getDefaultInstance() {
    return defaultInstance;
  }

  public GservicesSetting getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private GservicesSetting(
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
            name_ = input.readBytes();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            value_ = input.readBytes();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_GservicesSetting_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_GservicesSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.GservicesSetting.class, com.github.yeriomin.playstoreapi.GservicesSetting.Builder.class);
  }

  public static com.google.protobuf.Parser<GservicesSetting> PARSER =
      new com.google.protobuf.AbstractParser<GservicesSetting>() {
    public GservicesSetting parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GservicesSetting(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<GservicesSetting> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional bytes name = 1;
  public static final int NAME_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString name_;
  /**
   * <code>optional bytes name = 1;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bytes name = 1;</code>
   */
  public com.google.protobuf.ByteString getName() {
    return name_;
  }

  // optional bytes value = 2;
  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString value_;
  /**
   * <code>optional bytes value = 2;</code>
   */
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional bytes value = 2;</code>
   */
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  private void initFields() {
    name_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
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
      output.writeBytes(1, name_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, value_);
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
        .computeBytesSize(1, name_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, value_);
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

  public static com.github.yeriomin.playstoreapi.GservicesSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.GservicesSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.GservicesSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.GservicesSetting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.GservicesSetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.GservicesSetting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.GservicesSetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.GservicesSetting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.GservicesSetting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.GservicesSetting parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.GservicesSetting prototype) {
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
   * Protobuf type {@code GservicesSetting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.GservicesSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_GservicesSetting_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_GservicesSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.GservicesSetting.class, com.github.yeriomin.playstoreapi.GservicesSetting.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.GservicesSetting.newBuilder()
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
      name_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_GservicesSetting_descriptor;
    }

    public com.github.yeriomin.playstoreapi.GservicesSetting getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.GservicesSetting.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.GservicesSetting build() {
      com.github.yeriomin.playstoreapi.GservicesSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.GservicesSetting buildPartial() {
      com.github.yeriomin.playstoreapi.GservicesSetting result = new com.github.yeriomin.playstoreapi.GservicesSetting(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.value_ = value_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.GservicesSetting) {
        return mergeFrom((com.github.yeriomin.playstoreapi.GservicesSetting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.GservicesSetting other) {
      if (other == com.github.yeriomin.playstoreapi.GservicesSetting.getDefaultInstance()) return this;
      if (other.hasName()) {
        setName(other.getName());
      }
      if (other.hasValue()) {
        setValue(other.getValue());
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
      com.github.yeriomin.playstoreapi.GservicesSetting parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.GservicesSetting) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional bytes name = 1;
    private com.google.protobuf.ByteString name_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes name = 1;</code>
     */
    public com.google.protobuf.ByteString getName() {
      return name_;
    }
    /**
     * <code>optional bytes name = 1;</code>
     */
    public Builder setName(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes name = 1;</code>
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }

    // optional bytes value = 2;
    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes value = 2;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <code>optional bytes value = 2;</code>
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes value = 2;</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:GservicesSetting)
  }

  static {
    defaultInstance = new GservicesSetting(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:GservicesSetting)
}

