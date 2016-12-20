/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class ActionResource (
  /* The category the action is in. All customer specific actions are in the 'custom' category */
  category: String,
  /* The description of the action */
  description: String,
  /* The name of the action. Used as the unique id for reference */
  name: String,
  /* The variables required for the action */
  variables: List[ActionVariableResource]
)
