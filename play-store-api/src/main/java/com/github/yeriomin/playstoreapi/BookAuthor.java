// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code BookAuthor}
 */
public  final class BookAuthor extends
    com.google.protobuf.GeneratedMessage
    implements BookAuthorOrBuilder {
  // Use BookAuthor.newBuilder() to construct.
  private BookAuthor(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private BookAuthor(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final BookAuthor defaultInstance;
  public static BookAuthor getDefaultInstance() {
    return defaultInstance;
  }

  public BookAuthor getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private BookAuthor(
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
            deprecatedQuery_ = input.readBytes();
            break;
          }
          case 26: {
            com.github.yeriomin.playstoreapi.Docid.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = docid_.toBuilder();
            }
            docid_ = input.readMessage(com.github.yeriomin.playstoreapi.Docid.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(docid_);
              docid_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BookAuthor_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BookAuthor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.BookAuthor.class, com.github.yeriomin.playstoreapi.BookAuthor.Builder.class);
  }

  public static com.google.protobuf.Parser<BookAuthor> PARSER =
      new com.google.protobuf.AbstractParser<BookAuthor>() {
    public BookAuthor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BookAuthor(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<BookAuthor> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional string name = 1;
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional string deprecatedQuery = 2;
  public static final int DEPRECATEDQUERY_FIELD_NUMBER = 2;
  private java.lang.Object deprecatedQuery_;
  /**
   * <code>optional string deprecatedQuery = 2;</code>
   */
  public boolean hasDeprecatedQuery() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string deprecatedQuery = 2;</code>
   */
  public java.lang.String getDeprecatedQuery() {
    java.lang.Object ref = deprecatedQuery_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        deprecatedQuery_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string deprecatedQuery = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDeprecatedQueryBytes() {
    java.lang.Object ref = deprecatedQuery_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deprecatedQuery_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional .Docid docid = 3;
  public static final int DOCID_FIELD_NUMBER = 3;
  private com.github.yeriomin.playstoreapi.Docid docid_;
  /**
   * <code>optional .Docid docid = 3;</code>
   */
  public boolean hasDocid() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .Docid docid = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.Docid getDocid() {
    return docid_;
  }
  /**
   * <code>optional .Docid docid = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.DocidOrBuilder getDocidOrBuilder() {
    return docid_;
  }

  private void initFields() {
    name_ = "";
    deprecatedQuery_ = "";
    docid_ = com.github.yeriomin.playstoreapi.Docid.getDefaultInstance();
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
      output.writeBytes(1, getNameBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getDeprecatedQueryBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, docid_);
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
        .computeBytesSize(1, getNameBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getDeprecatedQueryBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, docid_);
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

  public static com.github.yeriomin.playstoreapi.BookAuthor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.BookAuthor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BookAuthor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.BookAuthor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BookAuthor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.BookAuthor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BookAuthor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.BookAuthor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BookAuthor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.BookAuthor parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.BookAuthor prototype) {
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
   * Protobuf type {@code BookAuthor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.BookAuthorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BookAuthor_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BookAuthor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.BookAuthor.class, com.github.yeriomin.playstoreapi.BookAuthor.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.BookAuthor.newBuilder()
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
        getDocidFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      deprecatedQuery_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (docidBuilder_ == null) {
        docid_ = com.github.yeriomin.playstoreapi.Docid.getDefaultInstance();
      } else {
        docidBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BookAuthor_descriptor;
    }

    public com.github.yeriomin.playstoreapi.BookAuthor getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.BookAuthor.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.BookAuthor build() {
      com.github.yeriomin.playstoreapi.BookAuthor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.BookAuthor buildPartial() {
      com.github.yeriomin.playstoreapi.BookAuthor result = new com.github.yeriomin.playstoreapi.BookAuthor(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.deprecatedQuery_ = deprecatedQuery_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      if (docidBuilder_ == null) {
        result.docid_ = docid_;
      } else {
        result.docid_ = docidBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.BookAuthor) {
        return mergeFrom((com.github.yeriomin.playstoreapi.BookAuthor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.BookAuthor other) {
      if (other == com.github.yeriomin.playstoreapi.BookAuthor.getDefaultInstance()) return this;
      if (other.hasName()) {
        bitField0_ |= 0x00000001;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasDeprecatedQuery()) {
        bitField0_ |= 0x00000002;
        deprecatedQuery_ = other.deprecatedQuery_;
        onChanged();
      }
      if (other.hasDocid()) {
        mergeDocid(other.getDocid());
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
      com.github.yeriomin.playstoreapi.BookAuthor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.BookAuthor) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional string name = 1;
    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }

    // optional string deprecatedQuery = 2;
    private java.lang.Object deprecatedQuery_ = "";
    /**
     * <code>optional string deprecatedQuery = 2;</code>
     */
    public boolean hasDeprecatedQuery() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string deprecatedQuery = 2;</code>
     */
    public java.lang.String getDeprecatedQuery() {
      java.lang.Object ref = deprecatedQuery_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        deprecatedQuery_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string deprecatedQuery = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDeprecatedQueryBytes() {
      java.lang.Object ref = deprecatedQuery_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deprecatedQuery_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string deprecatedQuery = 2;</code>
     */
    public Builder setDeprecatedQuery(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      deprecatedQuery_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string deprecatedQuery = 2;</code>
     */
    public Builder clearDeprecatedQuery() {
      bitField0_ = (bitField0_ & ~0x00000002);
      deprecatedQuery_ = getDefaultInstance().getDeprecatedQuery();
      onChanged();
      return this;
    }
    /**
     * <code>optional string deprecatedQuery = 2;</code>
     */
    public Builder setDeprecatedQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      deprecatedQuery_ = value;
      onChanged();
      return this;
    }

    // optional .Docid docid = 3;
    private com.github.yeriomin.playstoreapi.Docid docid_ = com.github.yeriomin.playstoreapi.Docid.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.Docid, com.github.yeriomin.playstoreapi.Docid.Builder, com.github.yeriomin.playstoreapi.DocidOrBuilder> docidBuilder_;
    /**
     * <code>optional .Docid docid = 3;</code>
     */
    public boolean hasDocid() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .Docid docid = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.Docid getDocid() {
      if (docidBuilder_ == null) {
        return docid_;
      } else {
        return docidBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Docid docid = 3;</code>
     */
    public Builder setDocid(com.github.yeriomin.playstoreapi.Docid value) {
      if (docidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        docid_ = value;
        onChanged();
      } else {
        docidBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Docid docid = 3;</code>
     */
    public Builder setDocid(
        com.github.yeriomin.playstoreapi.Docid.Builder builderForValue) {
      if (docidBuilder_ == null) {
        docid_ = builderForValue.build();
        onChanged();
      } else {
        docidBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Docid docid = 3;</code>
     */
    public Builder mergeDocid(com.github.yeriomin.playstoreapi.Docid value) {
      if (docidBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            docid_ != com.github.yeriomin.playstoreapi.Docid.getDefaultInstance()) {
          docid_ =
            com.github.yeriomin.playstoreapi.Docid.newBuilder(docid_).mergeFrom(value).buildPartial();
        } else {
          docid_ = value;
        }
        onChanged();
      } else {
        docidBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Docid docid = 3;</code>
     */
    public Builder clearDocid() {
      if (docidBuilder_ == null) {
        docid_ = com.github.yeriomin.playstoreapi.Docid.getDefaultInstance();
        onChanged();
      } else {
        docidBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .Docid docid = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.Docid.Builder getDocidBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDocidFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Docid docid = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.DocidOrBuilder getDocidOrBuilder() {
      if (docidBuilder_ != null) {
        return docidBuilder_.getMessageOrBuilder();
      } else {
        return docid_;
      }
    }
    /**
     * <code>optional .Docid docid = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.Docid, com.github.yeriomin.playstoreapi.Docid.Builder, com.github.yeriomin.playstoreapi.DocidOrBuilder> 
        getDocidFieldBuilder() {
      if (docidBuilder_ == null) {
        docidBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.yeriomin.playstoreapi.Docid, com.github.yeriomin.playstoreapi.Docid.Builder, com.github.yeriomin.playstoreapi.DocidOrBuilder>(
                docid_,
                getParentForChildren(),
                isClean());
        docid_ = null;
      }
      return docidBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:BookAuthor)
  }

  static {
    defaultInstance = new BookAuthor(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:BookAuthor)
}

