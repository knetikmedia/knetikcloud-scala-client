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


case class ChallengeEventResource (
  /* The id of the challenge */
  challengeId: Long,
  /* The end date in seconds */
  endDate: Long,
  /* The id of the challenge event */
  id: Long,
  /* Indicate if the rewards have been given out already  */
  rewardStatus: String,
  /* The start date in seconds */
  startDate: Long
)
