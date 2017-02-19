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


case class OAuth2Resource (
  /* The access token issued by the authorization server */
  accessToken: String,
  /* The lifetime in seconds of the access token */
  expiresIn: String,
  /* The scope of the access token. Currently these values can be ignored, as security defaults to roles and permissions */
  scope: String,
  /* The type of the token issued */
  tokenType: String
)
