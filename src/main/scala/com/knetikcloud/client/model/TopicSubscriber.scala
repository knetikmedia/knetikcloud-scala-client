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


case class TopicSubscriber (
  disabled: Option[Boolean],
  email: Option[String],
  joinDate: Option[Long],
  mobileNumber: Option[String],
  topicId: Option[String],
  topicSubscriberMap: Option[Any],
  userId: Option[Integer],
  username: Option[String]
)

