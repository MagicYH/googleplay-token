// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface NotificationOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int32 notificationType = 1;
  /**
   * <code>optional int32 notificationType = 1;</code>
   */
  boolean hasNotificationType();
  /**
   * <code>optional int32 notificationType = 1;</code>
   */
  int getNotificationType();

  // optional int64 timestamp = 3;
  /**
   * <code>optional int64 timestamp = 3;</code>
   */
  boolean hasTimestamp();
  /**
   * <code>optional int64 timestamp = 3;</code>
   */
  long getTimestamp();

  // optional .Docid docid = 4;
  /**
   * <code>optional .Docid docid = 4;</code>
   */
  boolean hasDocid();
  /**
   * <code>optional .Docid docid = 4;</code>
   */
  com.github.yeriomin.playstoreapi.Docid getDocid();
  /**
   * <code>optional .Docid docid = 4;</code>
   */
  com.github.yeriomin.playstoreapi.DocidOrBuilder getDocidOrBuilder();

  // optional string docTitle = 5;
  /**
   * <code>optional string docTitle = 5;</code>
   */
  boolean hasDocTitle();
  /**
   * <code>optional string docTitle = 5;</code>
   */
  java.lang.String getDocTitle();
  /**
   * <code>optional string docTitle = 5;</code>
   */
  com.google.protobuf.ByteString
      getDocTitleBytes();

  // optional string userEmail = 6;
  /**
   * <code>optional string userEmail = 6;</code>
   */
  boolean hasUserEmail();
  /**
   * <code>optional string userEmail = 6;</code>
   */
  java.lang.String getUserEmail();
  /**
   * <code>optional string userEmail = 6;</code>
   */
  com.google.protobuf.ByteString
      getUserEmailBytes();

  // optional .AndroidAppNotificationData appData = 7;
  /**
   * <code>optional .AndroidAppNotificationData appData = 7;</code>
   */
  boolean hasAppData();
  /**
   * <code>optional .AndroidAppNotificationData appData = 7;</code>
   */
  com.github.yeriomin.playstoreapi.AndroidAppNotificationData getAppData();
  /**
   * <code>optional .AndroidAppNotificationData appData = 7;</code>
   */
  com.github.yeriomin.playstoreapi.AndroidAppNotificationDataOrBuilder getAppDataOrBuilder();

  // optional .AndroidAppDeliveryData appDeliveryData = 8;
  /**
   * <code>optional .AndroidAppDeliveryData appDeliveryData = 8;</code>
   */
  boolean hasAppDeliveryData();
  /**
   * <code>optional .AndroidAppDeliveryData appDeliveryData = 8;</code>
   */
  com.github.yeriomin.playstoreapi.AndroidAppDeliveryData getAppDeliveryData();
  /**
   * <code>optional .AndroidAppDeliveryData appDeliveryData = 8;</code>
   */
  com.github.yeriomin.playstoreapi.AndroidAppDeliveryDataOrBuilder getAppDeliveryDataOrBuilder();

  // optional .PurchaseRemovalData purchaseRemovalData = 9;
  /**
   * <code>optional .PurchaseRemovalData purchaseRemovalData = 9;</code>
   */
  boolean hasPurchaseRemovalData();
  /**
   * <code>optional .PurchaseRemovalData purchaseRemovalData = 9;</code>
   */
  com.github.yeriomin.playstoreapi.PurchaseRemovalData getPurchaseRemovalData();
  /**
   * <code>optional .PurchaseRemovalData purchaseRemovalData = 9;</code>
   */
  com.github.yeriomin.playstoreapi.PurchaseRemovalDataOrBuilder getPurchaseRemovalDataOrBuilder();

  // optional .UserNotificationData userNotificationData = 10;
  /**
   * <code>optional .UserNotificationData userNotificationData = 10;</code>
   */
  boolean hasUserNotificationData();
  /**
   * <code>optional .UserNotificationData userNotificationData = 10;</code>
   */
  com.github.yeriomin.playstoreapi.UserNotificationData getUserNotificationData();
  /**
   * <code>optional .UserNotificationData userNotificationData = 10;</code>
   */
  com.github.yeriomin.playstoreapi.UserNotificationDataOrBuilder getUserNotificationDataOrBuilder();

  // optional .InAppNotificationData inAppNotificationData = 11;
  /**
   * <code>optional .InAppNotificationData inAppNotificationData = 11;</code>
   */
  boolean hasInAppNotificationData();
  /**
   * <code>optional .InAppNotificationData inAppNotificationData = 11;</code>
   */
  com.github.yeriomin.playstoreapi.InAppNotificationData getInAppNotificationData();
  /**
   * <code>optional .InAppNotificationData inAppNotificationData = 11;</code>
   */
  com.github.yeriomin.playstoreapi.InAppNotificationDataOrBuilder getInAppNotificationDataOrBuilder();

  // optional .PurchaseDeclinedData purchaseDeclinedData = 12;
  /**
   * <code>optional .PurchaseDeclinedData purchaseDeclinedData = 12;</code>
   */
  boolean hasPurchaseDeclinedData();
  /**
   * <code>optional .PurchaseDeclinedData purchaseDeclinedData = 12;</code>
   */
  com.github.yeriomin.playstoreapi.PurchaseDeclinedData getPurchaseDeclinedData();
  /**
   * <code>optional .PurchaseDeclinedData purchaseDeclinedData = 12;</code>
   */
  com.github.yeriomin.playstoreapi.PurchaseDeclinedDataOrBuilder getPurchaseDeclinedDataOrBuilder();

  // optional string notificationId = 13;
  /**
   * <code>optional string notificationId = 13;</code>
   */
  boolean hasNotificationId();
  /**
   * <code>optional string notificationId = 13;</code>
   */
  java.lang.String getNotificationId();
  /**
   * <code>optional string notificationId = 13;</code>
   */
  com.google.protobuf.ByteString
      getNotificationIdBytes();

  // optional .LibraryUpdate libraryUpdate = 14;
  /**
   * <code>optional .LibraryUpdate libraryUpdate = 14;</code>
   */
  boolean hasLibraryUpdate();
  /**
   * <code>optional .LibraryUpdate libraryUpdate = 14;</code>
   */
  com.github.yeriomin.playstoreapi.LibraryUpdate getLibraryUpdate();
  /**
   * <code>optional .LibraryUpdate libraryUpdate = 14;</code>
   */
  com.github.yeriomin.playstoreapi.LibraryUpdateOrBuilder getLibraryUpdateOrBuilder();

  // optional .LibraryDirtyData libraryDirtyData = 15;
  /**
   * <code>optional .LibraryDirtyData libraryDirtyData = 15;</code>
   */
  boolean hasLibraryDirtyData();
  /**
   * <code>optional .LibraryDirtyData libraryDirtyData = 15;</code>
   */
  com.github.yeriomin.playstoreapi.LibraryDirtyData getLibraryDirtyData();
  /**
   * <code>optional .LibraryDirtyData libraryDirtyData = 15;</code>
   */
  com.github.yeriomin.playstoreapi.LibraryDirtyDataOrBuilder getLibraryDirtyDataOrBuilder();
}