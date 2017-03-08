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


case class Permission (
  createdDate: Option[Long],
  description: Option[String],
  id: Option[Integer],
  locked: Option[Boolean],
  name: Option[String],
  parent: Option[String],
  permission: Option[String],
  updatedDate: Option[Long]
)

