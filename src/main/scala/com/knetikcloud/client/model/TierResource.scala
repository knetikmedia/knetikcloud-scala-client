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


case class TierResource (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  additionalProperties: Option[Map[String, Property]],
  /* The name of the tier */
  name: Option[String],
  /* The required progress for the tier */
  requiredProgress: Integer,
  /* The name of the triggered event */
  triggerEventName: Option[String]
)

