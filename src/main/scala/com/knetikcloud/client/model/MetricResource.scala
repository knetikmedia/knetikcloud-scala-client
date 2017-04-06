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


case class MetricResource (
  /* The id of the activity occurence where this score/metric occured */
  activityOccurenceId: Long,
  /* Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each */
  tags: Option[List[String]],
  /* The value/score of the metric */
  value: Long
)
