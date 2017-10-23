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


case class CommentResource (
  /* The comment content of that resource */
  content: String,
  /* The type of object this comment applies to (ex: video, article, etc). Required when passed to /comments */
  context: Option[String],
  /* The id of the object this comment applies to.  Required when passed to /comments */
  contextId: Option[Integer],
  /* The date/time this resource was created in seconds since epoch */
  createdDate: Option[Long],
  /* The unique ID for that resource */
  id: Option[Long],
  /* The summary of that resource */
  summary: Option[String],
  /* The date/time this resource was last updated in seconds since epoch */
  updatedDate: Option[Long],
  /* The user who created the comment */
  user: Option[SimpleUserResource]
)

