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


case class ActivityUserResource (
  /* Whether this user is the 'host' of the occurrence and has increased access to settings/etc (default: false) */
  host: Option[Boolean],
  /* The id of the activity user entry */
  id: Option[Long],
  /* The date this user last joined the occurrence, unix timestamp in seconds */
  joinedDate: Option[Long],
  /* The date this user last left the occurrence, unix timestamp in seconds. Null if still present */
  leftDate: Option[Long],
  /* The metric for the user's results, after the game is over */
  metric: Option[MetricResource],
  /* The current status of the user in the occurrence (default: present) */
  status: Option[String],
  /* The user */
  user: SimpleUserResource
)

