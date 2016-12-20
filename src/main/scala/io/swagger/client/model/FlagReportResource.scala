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


case class FlagReportResource (
  /* The context of that resource  */
  context: String,
  /* The context ID of that resource */
  contextId: String,
  /* The date/time this resource was created in seconds since epoch */
  createdDate: Long,
  /* The unique ID for that resource */
  id: Long,
  /* The reason of that resource required only in case of active resolution */
  reason: String,
  /* The resolution of that resource */
  resolution: String,
  /* The date/time this report was resolved in seconds since epoch. Null if not resolved yet */
  resolved: Long,
  /* The date/time this resource was last updated in seconds since epoch */
  updatedDate: Long
)
