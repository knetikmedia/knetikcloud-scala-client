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


case class LevelingResource (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  additionalProperties: Option[Map[String, Property]],
  /* The date the leveling schema was created */
  createdDate: Option[Long],
  /* The description of the leveling schema */
  description: Option[String],
  /* The name of the leveling schema.  IMMUTABLE */
  name: String,
  /* A set of tiers that contain experience boundaries */
  tiers: Option[List[TierResource]],
  /* The name of an event that will add one progress to this level when fired */
  triggerEventName: Option[String],
  /* The date the leveling schema was updated */
  updatedDate: Option[Long]
)

