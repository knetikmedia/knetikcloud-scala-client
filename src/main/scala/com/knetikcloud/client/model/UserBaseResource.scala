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

package com.knetikcloud.client.model


case class UserBaseResource (
  /* The url of the user's avatar image */
  avatarUrl: Option[String],
  /* The chosen display name of the user, defaults to username if not present */
  displayName: Option[String],
  /* The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822) */
  email: String,
  /* The user's full name (private) */
  fullname: Option[String],
  /* The id of the user */
  id: Option[Integer],
  /* The date the user's info was last updated as a unix timestamp */
  lastUpdated: Option[Long],
  /* The user's date of registration as a unix timestamp */
  memberSince: Option[Long],
  /* The login username for the user (private). May be set to match email if system does not require usernames separately. */
  username: String
)

