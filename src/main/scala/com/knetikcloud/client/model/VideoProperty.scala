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


case class VideoProperty (
  /* The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties. */
  _type: String,
  /* A crc value for file integrity verification */
  crc: Option[String],
  /* A description of the file */
  description: Option[String],
  /* The type of file such as txt, mp3, mov or csv */
  fileType: Option[String],
  /* The url of the file */
  url: Option[String]
)

