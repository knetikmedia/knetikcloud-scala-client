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


case class SimpleUserResource (
  /* The url of the user's avatar image */
  avatarUrl: Option[String],
  /* The public username of the user */
  displayName: Option[String],
  /* The id of the user */
  id: Integer,
  /* The username of the user */
  username: Option[String]
)

