// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code CarrierBillingCredentials}
 */
public  final class CarrierBillingCredentials extends
    com.google.protobuf.GeneratedMessage
    implements CarrierBillingCredentialsOrBuilder {
  // Use CarrierBillingCredentials.newBuilder() to construct.
  private CarrierBillingCredentials(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private CarrierBillingCredentials(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final CarrierBillingCredentials defaultInstance;
  public static CarrierBillingCredentials getDefaultInstance() {
    return defaultInstance;
  }

  public CarrierBillingCredentials getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private CarrierBillingCredentials(
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
            value_ = input.readBytes();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            expiration_ = input.readInt64();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CarrierBillingCredentials_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CarrierBillingCredentials_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.CarrierBillingCredentials.class, com.github.yeriomin.playstoreapi.CarrierBillingCredentials.Builder.class);
  }

  public static com.google.protobuf.Parser<CarrierBillingCredentials> PARSER =
      new com.google.protobuf.AbstractParser<CarrierBillingCredentials>() {
    public CarrierBillingCredentials parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CarrierBillingCredentials(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<CarrierBillingCredentials> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional string value = 1;
  public static final int VALUE_FIELD_NUMBER = 1;
  private java.lang.Object value_;
  /**
   * <code>optional string value = 1;</code>
   */
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string value = 1;</code>
   */
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string value = 1;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional int64 expiration = 2;
  public static final int EXPIRATION_FIELD_NUMBER = 2;
  private long expiration_;
  /**
   * <code>optional int64 expiration = 2;</code>
   */
  public boolean hasExpiration() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 expiration = 2;</code>
   */
  public long getExpiration() {
    return expiration_;
  }

  private void initFields() {
    value_ = "";
    expiration_ = 0L;
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
      output.writeBytes(1, getValueBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, expiration_);
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
        .computeBytesSize(1, getValueBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, expiration_);
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

  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.CarrierBillingCredentials parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.CarrierBillingCredentials prototype) {
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
   * Protobuf type {@code CarrierBillingCredentials}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.CarrierBillingCredentialsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CarrierBillingCredentials_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CarrierBillingCredentials_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.CarrierBillingCredentials.class, com.github.yeriomin.playstoreapi.CarrierBillingCredentials.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.CarrierBillingCredentials.newBuilder()
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
      value_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      expiration_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CarrierBillingCredentials_descriptor;
    }

    public com.github.yeriomin.playstoreapi.CarrierBillingCredentials getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.CarrierBillingCredentials.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.CarrierBillingCredentials build() {
      com.github.yeriomin.playstoreapi.CarrierBillingCredentials result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.CarrierBillingCredentials buildPartial() {
      com.github.yeriomin.playstoreapi.CarrierBillingCredentials result = new com.github.yeriomin.playstoreapi.CarrierBillingCredentials(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.value_ = value_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.expiration_ = expiration_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.CarrierBillingCredentials) {
        return mergeFrom((com.github.yeriomin.playstoreapi.CarrierBillingCredentials)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.CarrierBillingCredentials other) {
      if (other == com.github.yeriomin.playstoreapi.CarrierBillingCredentials.getDefaultInstance()) return this;
      if (other.hasValue()) {
        bitField0_ |= 0x00000001;
        value_ = other.value_;
        onChanged();
      }
      if (other.hasExpiration()) {
        setExpiration(other.getExpiration());
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
      com.github.yeriomin.playstoreapi.CarrierBillingCredentials parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.CarrierBillingCredentials) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional string value = 1;
    private java.lang.Object value_ = "";
    /**
     * <code>optional string value = 1;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string value = 1;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string value = 1;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string value = 1;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 1;</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 1;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      value_ = value;
      onChanged();
      return this;
    }

    // optional int64 expiration = 2;
    private long expiration_ ;
    /**
     * <code>optional int64 expiration = 2;</code>
     */
    public boolean hasExpiration() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 expiration = 2;</code>
     */
    public long getExpiration() {
      return expiration_;
    }
    /**
     * <code>optional int64 expiration = 2;</code>
     */
    public Builder setExpiration(long value) {
      bitField0_ |= 0x00000002;
      expiration_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 expiration = 2;</code>
     */
    public Builder clearExpiration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      expiration_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:CarrierBillingCredentials)
  }

  static {
    defaultInstance = new CarrierBillingCredentials(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:CarrierBillingCredentials)
}

