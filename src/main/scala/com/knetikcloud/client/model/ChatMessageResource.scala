/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.knetikcloud.client.model


case class ChatMessageResource (
  /* The content of the message */
  content: Any,
  /* The date the chat message was created */
  createdDate: Option[Long],
  /* Whether the message has been edited */
  edited: Option[Boolean],
  /* The id for this message */
  id: Option[String],
  /* The type of the message set by the client */
  messageType: String,
  /* The id of the recipient: user id or topic id */
  recipientId: String,
  /* The recipient type of the message */
  recipientType: String,
  /* The id of the sender */
  senderId: Option[Integer],
  /* The id of the thread */
  threadId: Option[String],
  /* The date the chat message was updated */
  updatedDate: Option[Long]
)
