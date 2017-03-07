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

package io.swagger.client.model


case class SubscriptionTemplateResource (
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Option[Long],
  /* The id of the template */
  id: Option[String],
  /* The name of the template */
  name: String,
  /* A template to apply to all plans on a subscription using this template */
  planTemplate: Option[TemplateResource],
  /* The customized properties that are present */
  properties: Option[List[PropertyDefinitionResource]],
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Option[Long]
)

