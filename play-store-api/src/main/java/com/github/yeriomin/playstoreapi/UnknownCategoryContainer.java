// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code UnknownCategoryContainer}
 */
public  final class UnknownCategoryContainer extends
    com.google.protobuf.GeneratedMessage
    implements UnknownCategoryContainerOrBuilder {
  // Use UnknownCategoryContainer.newBuilder() to construct.
  private UnknownCategoryContainer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private UnknownCategoryContainer(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final UnknownCategoryContainer defaultInstance;
  public static UnknownCategoryContainer getDefaultInstance() {
    return defaultInstance;
  }

  public UnknownCategoryContainer getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private UnknownCategoryContainer(
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
          case 42: {
            com.github.yeriomin.playstoreapi.CategoryIdContainer.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = categoryIdContainer_.toBuilder();
            }
            categoryIdContainer_ = input.readMessage(com.github.yeriomin.playstoreapi.CategoryIdContainer.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(categoryIdContainer_);
              categoryIdContainer_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_UnknownCategoryContainer_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_UnknownCategoryContainer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.UnknownCategoryContainer.class, com.github.yeriomin.playstoreapi.UnknownCategoryContainer.Builder.class);
  }

  public static com.google.protobuf.Parser<UnknownCategoryContainer> PARSER =
      new com.google.protobuf.AbstractParser<UnknownCategoryContainer>() {
    public UnknownCategoryContainer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UnknownCategoryContainer(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<UnknownCategoryContainer> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional .CategoryIdContainer categoryIdContainer = 5;
  public static final int CATEGORYIDCONTAINER_FIELD_NUMBER = 5;
  private com.github.yeriomin.playstoreapi.CategoryIdContainer categoryIdContainer_;
  /**
   * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
   */
  public boolean hasCategoryIdContainer() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
   */
  public com.github.yeriomin.playstoreapi.CategoryIdContainer getCategoryIdContainer() {
    return categoryIdContainer_;
  }
  /**
   * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
   */
  public com.github.yeriomin.playstoreapi.CategoryIdContainerOrBuilder getCategoryIdContainerOrBuilder() {
    return categoryIdContainer_;
  }

  private void initFields() {
    categoryIdContainer_ = com.github.yeriomin.playstoreapi.CategoryIdContainer.getDefaultInstance();
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
      output.writeMessage(5, categoryIdContainer_);
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
        .computeMessageSize(5, categoryIdContainer_);
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

  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.UnknownCategoryContainer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.UnknownCategoryContainer prototype) {
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
   * Protobuf type {@code UnknownCategoryContainer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.UnknownCategoryContainerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_UnknownCategoryContainer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_UnknownCategoryContainer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.UnknownCategoryContainer.class, com.github.yeriomin.playstoreapi.UnknownCategoryContainer.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.UnknownCategoryContainer.newBuilder()
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
        getCategoryIdContainerFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (categoryIdContainerBuilder_ == null) {
        categoryIdContainer_ = com.github.yeriomin.playstoreapi.CategoryIdContainer.getDefaultInstance();
      } else {
        categoryIdContainerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_UnknownCategoryContainer_descriptor;
    }

    public com.github.yeriomin.playstoreapi.UnknownCategoryContainer getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.UnknownCategoryContainer.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.UnknownCategoryContainer build() {
      com.github.yeriomin.playstoreapi.UnknownCategoryContainer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.UnknownCategoryContainer buildPartial() {
      com.github.yeriomin.playstoreapi.UnknownCategoryContainer result = new com.github.yeriomin.playstoreapi.UnknownCategoryContainer(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (categoryIdContainerBuilder_ == null) {
        result.categoryIdContainer_ = categoryIdContainer_;
      } else {
        result.categoryIdContainer_ = categoryIdContainerBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.UnknownCategoryContainer) {
        return mergeFrom((com.github.yeriomin.playstoreapi.UnknownCategoryContainer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.UnknownCategoryContainer other) {
      if (other == com.github.yeriomin.playstoreapi.UnknownCategoryContainer.getDefaultInstance()) return this;
      if (other.hasCategoryIdContainer()) {
        mergeCategoryIdContainer(other.getCategoryIdContainer());
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
      com.github.yeriomin.playstoreapi.UnknownCategoryContainer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.UnknownCategoryContainer) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional .CategoryIdContainer categoryIdContainer = 5;
    private com.github.yeriomin.playstoreapi.CategoryIdContainer categoryIdContainer_ = com.github.yeriomin.playstoreapi.CategoryIdContainer.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.CategoryIdContainer, com.github.yeriomin.playstoreapi.CategoryIdContainer.Builder, com.github.yeriomin.playstoreapi.CategoryIdContainerOrBuilder> categoryIdContainerBuilder_;
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public boolean hasCategoryIdContainer() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public com.github.yeriomin.playstoreapi.CategoryIdContainer getCategoryIdContainer() {
      if (categoryIdContainerBuilder_ == null) {
        return categoryIdContainer_;
      } else {
        return categoryIdContainerBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public Builder setCategoryIdContainer(com.github.yeriomin.playstoreapi.CategoryIdContainer value) {
      if (categoryIdContainerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        categoryIdContainer_ = value;
        onChanged();
      } else {
        categoryIdContainerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public Builder setCategoryIdContainer(
        com.github.yeriomin.playstoreapi.CategoryIdContainer.Builder builderForValue) {
      if (categoryIdContainerBuilder_ == null) {
        categoryIdContainer_ = builderForValue.build();
        onChanged();
      } else {
        categoryIdContainerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public Builder mergeCategoryIdContainer(com.github.yeriomin.playstoreapi.CategoryIdContainer value) {
      if (categoryIdContainerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            categoryIdContainer_ != com.github.yeriomin.playstoreapi.CategoryIdContainer.getDefaultInstance()) {
          categoryIdContainer_ =
            com.github.yeriomin.playstoreapi.CategoryIdContainer.newBuilder(categoryIdContainer_).mergeFrom(value).buildPartial();
        } else {
          categoryIdContainer_ = value;
        }
        onChanged();
      } else {
        categoryIdContainerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public Builder clearCategoryIdContainer() {
      if (categoryIdContainerBuilder_ == null) {
        categoryIdContainer_ = com.github.yeriomin.playstoreapi.CategoryIdContainer.getDefaultInstance();
        onChanged();
      } else {
        categoryIdContainerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public com.github.yeriomin.playstoreapi.CategoryIdContainer.Builder getCategoryIdContainerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCategoryIdContainerFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public com.github.yeriomin.playstoreapi.CategoryIdContainerOrBuilder getCategoryIdContainerOrBuilder() {
      if (categoryIdContainerBuilder_ != null) {
        return categoryIdContainerBuilder_.getMessageOrBuilder();
      } else {
        return categoryIdContainer_;
      }
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.CategoryIdContainer, com.github.yeriomin.playstoreapi.CategoryIdContainer.Builder, com.github.yeriomin.playstoreapi.CategoryIdContainerOrBuilder> 
        getCategoryIdContainerFieldBuilder() {
      if (categoryIdContainerBuilder_ == null) {
        categoryIdContainerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.yeriomin.playstoreapi.CategoryIdContainer, com.github.yeriomin.playstoreapi.CategoryIdContainer.Builder, com.github.yeriomin.playstoreapi.CategoryIdContainerOrBuilder>(
                categoryIdContainer_,
                getParentForChildren(),
                isClean());
        categoryIdContainer_ = null;
      }
      return categoryIdContainerBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:UnknownCategoryContainer)
  }

  static {
    defaultInstance = new UnknownCategoryContainer(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:UnknownCategoryContainer)
}

