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


case class LevelingResource (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  additionalProperties: Map[String, Property],
  /* The date the leveling schema was created */
  createdDate: Long,
  /* The description of the leveling schema */
  description: String,
  /* The name of the leveling schema.  IMMUTABLE */
  name: String,
  /* A set of tiers that contain experience boundaries */
  tiers: List[TierResource],
  /* The date the leveling schema was updated */
  updatedDate: Long
)
