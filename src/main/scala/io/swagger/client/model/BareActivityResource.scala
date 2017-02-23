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


case class BareActivityResource (
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Long,
  /* The unique ID for that resource */
  id: Long,
  /* Details about how to launch the activity */
  launch: String,
  /* The user friendly name of that resource. Defaults to blank string */
  longDescription: String,
  /* The user friendly name of that resource */
  name: String,
  /* The user friendly name of that resource. Defaults to blank string */
  shortDescription: String,
  /* Whether this activity is a template for other activities. Default: false */
  template: Boolean,
  /* The type of the activity */
  _type: String,
  /* The unique key (for static reference in code) of the activity */
  uniqueKey: String,
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Long
)
