/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class UserRelationshipResource (
  /* The child in the relationship */
  child: SimpleUserResource,
  /* Context about the relationship or its type */
  context: String,
  /* A generated unique id. Read-Only */
  id: Long,
  /* The parent in the relationship */
  parent: SimpleUserResource
)
