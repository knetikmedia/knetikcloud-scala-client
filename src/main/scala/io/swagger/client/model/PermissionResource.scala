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


case class PermissionResource (
  /* The date the permission was added. Unix timestamp in seconds */
  createdDate: Option[Long],
  /* The description of the permission */
  description: Option[String],
  /* Whether a permission is locked from being deleted */
  locked: Option[Boolean],
  /* The name of the permission used for display purposes */
  name: String,
  /* The name of the parent of the permission */
  parent: Option[String],
  /* The keyword that defines the permission */
  permission: String,
  /* The date the permission was updated. Unix timestamp in seconds */
  updatedDate: Option[Long]
)

