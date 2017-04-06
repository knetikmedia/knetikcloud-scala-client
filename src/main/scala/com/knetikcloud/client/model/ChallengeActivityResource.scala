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


case class ChallengeActivityResource (
  /* The id of the activity */
  activityId: Long,
  /* The id of the challenge */
  challengeId: Option[Long],
  /* The entitlement item needed to participate in the activity as part of this event. Null indicates free entry. When creating/updating only id is used. Item must be pre-existing */
  entitlement: Option[ActivityEntitlementResource],
  /* The unique ID for this resource */
  id: Option[Long],
  /* The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing */
  rewardSet: Option[RewardSetResource],
  /* The list of settings and the select options */
  settings: Option[List[SelectedSettingResource]]
)

