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
