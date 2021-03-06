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


case class BreEventLog (
  /* The customer of the BRE event log */
  customer: Option[String],
  /* The event id of the BRE event log */
  eventId: Option[String],
  /* The event name of the BRE event log */
  eventName: Option[String],
  /* The event start date of the BRE event log */
  eventStartDate: Option[Long],
  /* The id of the BRE event log */
  id: Option[String],
  /* The event paramters of the BRE event log */
  parameters: Option[Any],
  /* The rules of the BRE event log */
  rules: Option[List[BreRuleLog]]
)

