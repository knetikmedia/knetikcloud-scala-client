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


case class WebsocketUnsubscribeEvent (
  client: Option[String],
  customer: Option[String],
  doNotBroadcast: Option[Boolean],
  section: Option[String],
  source: Option[Any],
  specifics: Option[String],
  synchronous: Option[Boolean],
  timestamp: Option[Long],
  /* The type of the event. Used for polymorphic type recognition and thus must match an expected type */
  _type: String,
  topic: Option[Topic],
  topicSubscriber: Option[TopicSubscriber]
)

