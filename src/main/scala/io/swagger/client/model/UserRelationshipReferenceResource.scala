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


case class UserRelationshipReferenceResource (
  /* The url of the user's avatar image */
  avatarUrl: String,
  /* The context of the relationship */
  context: String,
  /* The public username of the user */
  displayName: String,
  /* The id of the user */
  id: Integer,
  /* The id of the relationship */
  relationshipId: Long,
  /* The username of the user */
  username: String
)
