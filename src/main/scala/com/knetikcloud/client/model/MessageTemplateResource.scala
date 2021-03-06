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


case class MessageTemplateResource (
  /* The content of the template. See Apache Velocity documentation for formatting */
  content: String,
  /* The id of the template. Cannot be changed after creation. default: auto generated */
  id: Option[String],
  /* The name of the template */
  name: String,
  /* A list of tags for search purposes. Will be converted to lower case */
  tags: Option[List[String]]
)

