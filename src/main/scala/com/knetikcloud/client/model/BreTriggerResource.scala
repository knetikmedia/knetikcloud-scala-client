/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.knetikcloud.client.model


case class BreTriggerResource (
  /* The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category 'custom' */
  category: Option[String],
  /* The unique name for the event. This serves as the unique identifier. Cannot be changed after creation */
  eventName: String,
  /* A list of parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types */
  parameters: Option[List[BreTriggerParameterDefinition]],
  /* Where this trigger came from. System triggers cannot be removed or updated */
  systemTrigger: Option[Boolean],
  /* A list of tags for filtering */
  tags: Option[List[String]],
  /* A description of the trigger */
  triggerDescription: String,
  /* A human readable name for this trigger */
  triggerName: String
)

