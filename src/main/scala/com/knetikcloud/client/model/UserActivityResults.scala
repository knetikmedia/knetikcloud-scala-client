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


case class UserActivityResults (
  /* Any currency rewarded to this user */
  currencyRewards: Option[List[RewardCurrencyResource]],
  /* Any items rewarded to this user */
  itemRewards: Option[List[RewardItemResource]],
  /* The position of the user in the leaderboard. Null means non-compete or disqualification */
  rank: Option[Long],
  /* The raw score in this leaderboard. Null means non-compete or disqualification */
  score: Option[Long],
  /* Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 10 tags and 50 characters each */
  tags: Option[List[String]],
  /* The number of users tied at this rank, including this user. 1 means no tie */
  ties: Option[Integer],
  /* The date this score was recorded or updated. Unix timestamp in seconds */
  updatedDate: Option[Long],
  /* The player for this entry */
  user: SimpleUserResource
)

