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


case class VideoGroupPropertyDefinitionResource (
  /* A list of the fields on both the property definition and property of this type */
  fieldList: Option[PropertyFieldListResource],
  /* The name of the property */
  name: String,
  /* Whether the property is required */
  required: Boolean,
  /* The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties. */
  _type: String,
  /* If provided, a file type that the property must match */
  fileType: Option[String],
  /* If provided, the maximum number of files in the group */
  maxCount: Option[Integer],
  /* If provided, the maximum allowed size per file in bytes */
  maxFileSize: Option[Long],
  /* If provided, the minimum number of files in the group */
  minCount: Option[Integer],
  /* If provided, the maximum height of each video */
  maxHeight: Option[Integer],
  /* If provided, the maximum length of each video */
  maxLength: Option[Integer],
  /* If provided, the maximum width of each video */
  maxWidth: Option[Integer],
  /* If provided, the minimum height of each video */
  minHeight: Option[Integer],
  /* If provided, the minimum length of each video */
  minLength: Option[Integer],
  /* If provided, the minimum width of each video */
  minWidth: Option[Integer]
)

