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


case class PermissionResource (
  /* The date the permission was added. Unix timestamp in seconds */
  createdDate: Long,
  /* The description of the permission */
  description: String,
  /* Whether a permission is locked from being deleted */
  locked: Boolean,
  /* The name of the permission used for display purposes */
  name: String,
  /* The name of the parent of the permission */
  parent: String,
  /* The keyword that defines the permission */
  permission: String,
  /* The date the permission was updated. Unix timestamp in seconds */
  updatedDate: Long
)
