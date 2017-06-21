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


case class AchievementDefinitionResource (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this resource type */
  additionalProperties: Option[Map[String, Property]],
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Option[Long],
  /* The description of the achievement. Must be at least 2 characters in length. */
  description: Option[String],
  /* Whether the achievement is hidden from the user */
  hidden: Boolean,
  /* The name of the achievement. Must be at least 6 characters in length. IMMUTABLE */
  name: String,
  /* The required progress for the achievement definition */
  requiredProgress: Integer,
  /* The id of the rule generated for this achievement */
  ruleId: Option[String],
  /* The tags for the achievement definition */
  tags: Option[List[String]],
  /* An achievement template this achievement is validated against (private). May be null and no validation of additional_properties will be done */
  template: Option[String],
  /* The name of the trigger event associated with this achievement */
  triggerEventName: Option[String],
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Option[Long]
)

