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


case class DispositionResource (
  /* The context of that resource. Required when passed to /dispositions rather than context specific endpoint */
  context: Option[String],
  /* The context_id of that resource. Required when passed to /dispositions rather than context specific endpoint */
  contextId: Option[String],
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Option[Long],
  /* The unique ID for that resource */
  id: Option[Long],
  /* The name of the disposition, 1-20 characters. (ex: like/dislike/favorite, etc) */
  name: String,
  /* The user */
  user: Option[SimpleUserResource]
)

