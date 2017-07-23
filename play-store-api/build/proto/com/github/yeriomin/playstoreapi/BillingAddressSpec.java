// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code BillingAddressSpec}
 */
public  final class BillingAddressSpec extends
    com.google.protobuf.GeneratedMessage
    implements BillingAddressSpecOrBuilder {
  // Use BillingAddressSpec.newBuilder() to construct.
  private BillingAddressSpec(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private BillingAddressSpec(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final BillingAddressSpec defaultInstance;
  public static BillingAddressSpec getDefaultInstance() {
    return defaultInstance;
  }

  public BillingAddressSpec getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private BillingAddressSpec(
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
          case 8: {
            bitField0_ |= 0x00000001;
            billingAddressType_ = input.readInt32();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              requiredField_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            requiredField_.add(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
              requiredField_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              requiredField_.add(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        requiredField_ = java.util.Collections.unmodifiableList(requiredField_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BillingAddressSpec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BillingAddressSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.BillingAddressSpec.class, com.github.yeriomin.playstoreapi.BillingAddressSpec.Builder.class);
  }

  public static com.google.protobuf.Parser<BillingAddressSpec> PARSER =
      new com.google.protobuf.AbstractParser<BillingAddressSpec>() {
    public BillingAddressSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BillingAddressSpec(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<BillingAddressSpec> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional int32 billingAddressType = 1;
  public static final int BILLINGADDRESSTYPE_FIELD_NUMBER = 1;
  private int billingAddressType_;
  /**
   * <code>optional int32 billingAddressType = 1;</code>
   */
  public boolean hasBillingAddressType() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 billingAddressType = 1;</code>
   */
  public int getBillingAddressType() {
    return billingAddressType_;
  }

  // repeated int32 requiredField = 2;
  public static final int REQUIREDFIELD_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> requiredField_;
  /**
   * <code>repeated int32 requiredField = 2;</code>
   */
  public java.util.List<java.lang.Integer>
      getRequiredFieldList() {
    return requiredField_;
  }
  /**
   * <code>repeated int32 requiredField = 2;</code>
   */
  public int getRequiredFieldCount() {
    return requiredField_.size();
  }
  /**
   * <code>repeated int32 requiredField = 2;</code>
   */
  public int getRequiredField(int index) {
    return requiredField_.get(index);
  }

  private void initFields() {
    billingAddressType_ = 0;
    requiredField_ = java.util.Collections.emptyList();
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
      output.writeInt32(1, billingAddressType_);
    }
    for (int i = 0; i < requiredField_.size(); i++) {
      output.writeInt32(2, requiredField_.get(i));
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
        .computeInt32Size(1, billingAddressType_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < requiredField_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(requiredField_.get(i));
      }
      size += dataSize;
      size += 1 * getRequiredFieldList().size();
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

  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.BillingAddressSpec parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.BillingAddressSpec prototype) {
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
   * Protobuf type {@code BillingAddressSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.BillingAddressSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BillingAddressSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BillingAddressSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.BillingAddressSpec.class, com.github.yeriomin.playstoreapi.BillingAddressSpec.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.BillingAddressSpec.newBuilder()
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
      billingAddressType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      requiredField_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BillingAddressSpec_descriptor;
    }

    public com.github.yeriomin.playstoreapi.BillingAddressSpec getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.BillingAddressSpec.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.BillingAddressSpec build() {
      com.github.yeriomin.playstoreapi.BillingAddressSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.BillingAddressSpec buildPartial() {
      com.github.yeriomin.playstoreapi.BillingAddressSpec result = new com.github.yeriomin.playstoreapi.BillingAddressSpec(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.billingAddressType_ = billingAddressType_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        requiredField_ = java.util.Collections.unmodifiableList(requiredField_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.requiredField_ = requiredField_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.BillingAddressSpec) {
        return mergeFrom((com.github.yeriomin.playstoreapi.BillingAddressSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.BillingAddressSpec other) {
      if (other == com.github.yeriomin.playstoreapi.BillingAddressSpec.getDefaultInstance()) return this;
      if (other.hasBillingAddressType()) {
        setBillingAddressType(other.getBillingAddressType());
      }
      if (!other.requiredField_.isEmpty()) {
        if (requiredField_.isEmpty()) {
          requiredField_ = other.requiredField_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureRequiredFieldIsMutable();
          requiredField_.addAll(other.requiredField_);
        }
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
      com.github.yeriomin.playstoreapi.BillingAddressSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.BillingAddressSpec) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional int32 billingAddressType = 1;
    private int billingAddressType_ ;
    /**
     * <code>optional int32 billingAddressType = 1;</code>
     */
    public boolean hasBillingAddressType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 billingAddressType = 1;</code>
     */
    public int getBillingAddressType() {
      return billingAddressType_;
    }
    /**
     * <code>optional int32 billingAddressType = 1;</code>
     */
    public Builder setBillingAddressType(int value) {
      bitField0_ |= 0x00000001;
      billingAddressType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 billingAddressType = 1;</code>
     */
    public Builder clearBillingAddressType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      billingAddressType_ = 0;
      onChanged();
      return this;
    }

    // repeated int32 requiredField = 2;
    private java.util.List<java.lang.Integer> requiredField_ = java.util.Collections.emptyList();
    private void ensureRequiredFieldIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        requiredField_ = new java.util.ArrayList<java.lang.Integer>(requiredField_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 requiredField = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getRequiredFieldList() {
      return java.util.Collections.unmodifiableList(requiredField_);
    }
    /**
     * <code>repeated int32 requiredField = 2;</code>
     */
    public int getRequiredFieldCount() {
      return requiredField_.size();
    }
    /**
     * <code>repeated int32 requiredField = 2;</code>
     */
    public int getRequiredField(int index) {
      return requiredField_.get(index);
    }
    /**
     * <code>repeated int32 requiredField = 2;</code>
     */
    public Builder setRequiredField(
        int index, int value) {
      ensureRequiredFieldIsMutable();
      requiredField_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 requiredField = 2;</code>
     */
    public Builder addRequiredField(int value) {
      ensureRequiredFieldIsMutable();
      requiredField_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 requiredField = 2;</code>
     */
    public Builder addAllRequiredField(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureRequiredFieldIsMutable();
      super.addAll(values, requiredField_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 requiredField = 2;</code>
     */
    public Builder clearRequiredField() {
      requiredField_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:BillingAddressSpec)
  }

  static {
    defaultInstance = new BillingAddressSpec(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:BillingAddressSpec)
}
