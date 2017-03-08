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


case class CampaignResource (
  /* Whether the campaign is active or not.  Defaults to false */
  active: Option[Boolean],
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  additionalProperties: Option[Map[String, Property]],
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Option[Long],
  /* The unique ID for that resource */
  id: Option[Long],
  /* The strategy for calculating the leaderboard. Defaults to highest score. Value MUST come from the list of available strategies from the Leaderboard Service */
  leaderboardStrategy: Option[String],
  /* The user friendly name of that resource. Defaults to blank string */
  longDescription: Option[String],
  /* The user friendly name of that resource */
  name: String,
  /* The name of the next challenge coming up */
  nextChallenge: Option[String],
  /* The date/time of the next challenge coming up */
  nextChallengeDate: Option[Long],
  /* The rewards to give at the end of the campaign. When creating/updating only id is used. Reward set must be pre-existing */
  rewardSet: Option[RewardSetResource],
  /* Indicate if the rewards have been given out already */
  rewardStatus: Option[String],
  /* The user friendly name of that resource. Defaults to blank string */
  shortDescription: Option[String],
  /* A campaign template this campaign is validated against (private). May be null and no validation of additional_properties will be done */
  template: Option[String],
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Option[Long]
)
