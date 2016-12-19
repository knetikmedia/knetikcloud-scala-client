/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class BreTriggerResource (
  /* The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category 'custom' */
  category: String,
  /* The unique name for the event. This serves as the unique identifier. Cannot be changed after creation */
  eventName: String,
  /* A list af parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types */
  parameters: List[BreTriggerParameterDefinition],
  /* Where this trigger came from. System triggers cannot be removed or updated */
  systemTrigger: Boolean,
  /* A description of the trigger */
  triggerDescription: String,
  /* A human readable name for this trigger */
  triggerName: String
)
