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


case class ItemTemplateResource (
  /* The customized behaviors that are required or default for this type of item */
  behaviors: List[ItemBehaviorDefinitionResource],
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Long,
  /* The id of the template */
  id: String,
  /* The name of the template */
  name: String,
  /* The customized properties that are present */
  properties: List[PropertyDefinitionResource],
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Long
)