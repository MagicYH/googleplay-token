// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code CategoryContainer}
 */
public  final class CategoryContainer extends
    com.google.protobuf.GeneratedMessage
    implements CategoryContainerOrBuilder {
  // Use CategoryContainer.newBuilder() to construct.
  private CategoryContainer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private CategoryContainer(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final CategoryContainer defaultInstance;
  public static CategoryContainer getDefaultInstance() {
    return defaultInstance;
  }

  public CategoryContainer getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private CategoryContainer(
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
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              category_ = new java.util.ArrayList<com.github.yeriomin.playstoreapi.BrowseLink>();
              mutable_bitField0_ |= 0x00000001;
            }
            category_.add(input.readMessage(com.github.yeriomin.playstoreapi.BrowseLink.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        category_ = java.util.Collections.unmodifiableList(category_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryContainer_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryContainer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.CategoryContainer.class, com.github.yeriomin.playstoreapi.CategoryContainer.Builder.class);
  }

  public static com.google.protobuf.Parser<CategoryContainer> PARSER =
      new com.google.protobuf.AbstractParser<CategoryContainer>() {
    public CategoryContainer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CategoryContainer(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<CategoryContainer> getParserForType() {
    return PARSER;
  }

  // repeated .BrowseLink category = 4;
  public static final int CATEGORY_FIELD_NUMBER = 4;
  private java.util.List<com.github.yeriomin.playstoreapi.BrowseLink> category_;
  /**
   * <code>repeated .BrowseLink category = 4;</code>
   */
  public java.util.List<com.github.yeriomin.playstoreapi.BrowseLink> getCategoryList() {
    return category_;
  }
  /**
   * <code>repeated .BrowseLink category = 4;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstoreapi.BrowseLinkOrBuilder> 
      getCategoryOrBuilderList() {
    return category_;
  }
  /**
   * <code>repeated .BrowseLink category = 4;</code>
   */
  public int getCategoryCount() {
    return category_.size();
  }
  /**
   * <code>repeated .BrowseLink category = 4;</code>
   */
  public com.github.yeriomin.playstoreapi.BrowseLink getCategory(int index) {
    return category_.get(index);
  }
  /**
   * <code>repeated .BrowseLink category = 4;</code>
   */
  public com.github.yeriomin.playstoreapi.BrowseLinkOrBuilder getCategoryOrBuilder(
      int index) {
    return category_.get(index);
  }

  private void initFields() {
    category_ = java.util.Collections.emptyList();
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
    for (int i = 0; i < category_.size(); i++) {
      output.writeMessage(4, category_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < category_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, category_.get(i));
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

  public static com.github.yeriomin.playstoreapi.CategoryContainer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.CategoryContainer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CategoryContainer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.CategoryContainer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CategoryContainer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.CategoryContainer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CategoryContainer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.CategoryContainer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CategoryContainer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.CategoryContainer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.CategoryContainer prototype) {
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
   * Protobuf type {@code CategoryContainer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.CategoryContainerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryContainer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryContainer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.CategoryContainer.class, com.github.yeriomin.playstoreapi.CategoryContainer.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.CategoryContainer.newBuilder()
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
        getCategoryFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (categoryBuilder_ == null) {
        category_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        categoryBuilder_.clear();
      }
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_CategoryContainer_descriptor;
    }

    public com.github.yeriomin.playstoreapi.CategoryContainer getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.CategoryContainer.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.CategoryContainer build() {
      com.github.yeriomin.playstoreapi.CategoryContainer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.CategoryContainer buildPartial() {
      com.github.yeriomin.playstoreapi.CategoryContainer result = new com.github.yeriomin.playstoreapi.CategoryContainer(this);
      int from_bitField0_ = bitField0_;
      if (categoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          category_ = java.util.Collections.unmodifiableList(category_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.category_ = category_;
      } else {
        result.category_ = categoryBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.CategoryContainer) {
        return mergeFrom((com.github.yeriomin.playstoreapi.CategoryContainer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.CategoryContainer other) {
      if (other == com.github.yeriomin.playstoreapi.CategoryContainer.getDefaultInstance()) return this;
      if (categoryBuilder_ == null) {
        if (!other.category_.isEmpty()) {
          if (category_.isEmpty()) {
            category_ = other.category_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCategoryIsMutable();
            category_.addAll(other.category_);
          }
          onChanged();
        }
      } else {
        if (!other.category_.isEmpty()) {
          if (categoryBuilder_.isEmpty()) {
            categoryBuilder_.dispose();
            categoryBuilder_ = null;
            category_ = other.category_;
            bitField0_ = (bitField0_ & ~0x00000001);
            categoryBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCategoryFieldBuilder() : null;
          } else {
            categoryBuilder_.addAllMessages(other.category_);
          }
        }
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
      com.github.yeriomin.playstoreapi.CategoryContainer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.CategoryContainer) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // repeated .BrowseLink category = 4;
    private java.util.List<com.github.yeriomin.playstoreapi.BrowseLink> category_ =
      java.util.Collections.emptyList();
    private void ensureCategoryIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        category_ = new java.util.ArrayList<com.github.yeriomin.playstoreapi.BrowseLink>(category_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.yeriomin.playstoreapi.BrowseLink, com.github.yeriomin.playstoreapi.BrowseLink.Builder, com.github.yeriomin.playstoreapi.BrowseLinkOrBuilder> categoryBuilder_;

    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.BrowseLink> getCategoryList() {
      if (categoryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(category_);
      } else {
        return categoryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public int getCategoryCount() {
      if (categoryBuilder_ == null) {
        return category_.size();
      } else {
        return categoryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.BrowseLink getCategory(int index) {
      if (categoryBuilder_ == null) {
        return category_.get(index);
      } else {
        return categoryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public Builder setCategory(
        int index, com.github.yeriomin.playstoreapi.BrowseLink value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.set(index, value);
        onChanged();
      } else {
        categoryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public Builder setCategory(
        int index, com.github.yeriomin.playstoreapi.BrowseLink.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.set(index, builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public Builder addCategory(com.github.yeriomin.playstoreapi.BrowseLink value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.add(value);
        onChanged();
      } else {
        categoryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public Builder addCategory(
        int index, com.github.yeriomin.playstoreapi.BrowseLink value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.add(index, value);
        onChanged();
      } else {
        categoryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public Builder addCategory(
        com.github.yeriomin.playstoreapi.BrowseLink.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.add(builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public Builder addCategory(
        int index, com.github.yeriomin.playstoreapi.BrowseLink.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.add(index, builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public Builder addAllCategory(
        java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.BrowseLink> values) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        super.addAll(values, category_);
        onChanged();
      } else {
        categoryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public Builder clearCategory() {
      if (categoryBuilder_ == null) {
        category_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        categoryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public Builder removeCategory(int index) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.remove(index);
        onChanged();
      } else {
        categoryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.BrowseLink.Builder getCategoryBuilder(
        int index) {
      return getCategoryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.BrowseLinkOrBuilder getCategoryOrBuilder(
        int index) {
      if (categoryBuilder_ == null) {
        return category_.get(index);  } else {
        return categoryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public java.util.List<? extends com.github.yeriomin.playstoreapi.BrowseLinkOrBuilder> 
         getCategoryOrBuilderList() {
      if (categoryBuilder_ != null) {
        return categoryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(category_);
      }
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.BrowseLink.Builder addCategoryBuilder() {
      return getCategoryFieldBuilder().addBuilder(
          com.github.yeriomin.playstoreapi.BrowseLink.getDefaultInstance());
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.BrowseLink.Builder addCategoryBuilder(
        int index) {
      return getCategoryFieldBuilder().addBuilder(
          index, com.github.yeriomin.playstoreapi.BrowseLink.getDefaultInstance());
    }
    /**
     * <code>repeated .BrowseLink category = 4;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.BrowseLink.Builder> 
         getCategoryBuilderList() {
      return getCategoryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.yeriomin.playstoreapi.BrowseLink, com.github.yeriomin.playstoreapi.BrowseLink.Builder, com.github.yeriomin.playstoreapi.BrowseLinkOrBuilder> 
        getCategoryFieldBuilder() {
      if (categoryBuilder_ == null) {
        categoryBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.github.yeriomin.playstoreapi.BrowseLink, com.github.yeriomin.playstoreapi.BrowseLink.Builder, com.github.yeriomin.playstoreapi.BrowseLinkOrBuilder>(
                category_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        category_ = null;
      }
      return categoryBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:CategoryContainer)
  }

  static {
    defaultInstance = new CategoryContainer(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:CategoryContainer)
}

