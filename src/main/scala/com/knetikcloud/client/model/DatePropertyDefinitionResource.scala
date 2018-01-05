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


case class DatePropertyDefinitionResource (
  /* The description of the property */
  description: Option[String],
  /* A list of the fields on both the property definition and property of this type */
  fieldList: Option[PropertyFieldListResource],
  /* The friendly front-facing name of the property */
  friendlyName: Option[String],
  /* The name of the property */
  name: String,
  /* The JSON path to the option label */
  optionLabelPath: Option[String],
  /* The JSON path to the option value */
  optionValuePath: Option[String],
  /* URL of service containing the property options (assumed JSON array) */
  optionsUrl: Option[String],
  /* Whether the property is required */
  required: Boolean,
  /* The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties. */
  _type: String,
  /* If provided, the maximum value */
  max: Option[Long],
  /* If provided, the minimum value */
  min: Option[Long]
)

