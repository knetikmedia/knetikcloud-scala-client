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


case class ActivityResource (
  /* A map of additional properties keyed on the property name. Used to further describe an activity. While settings will vary from one activity occurrence (a game) to another, additional properties are shared by all the occurrences of this activity. Ex: Activity Logo, Disclaimer, Greeting, etc. Validated against template if one exists for activities */
  additionalProperties: Option[Map[String, Property]],
  /* Defines core settings about the activity that affect how it can be created/played by users. */
  coreSettings: Option[CoreActivitySettings],
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Option[Long],
  /* The list of items that can be used for entitlement (wager amounts/etc) */
  entitlements: Option[List[ActivityEntitlementResource]],
  /* The unique ID for that resource */
  id: Option[Long],
  /* Details about how to launch the activity */
  launch: Option[String],
  /* The strategy for calculating the leaderboard. No strategy means no leaderboard for the top level context. Value MUST come from the list of available strategies from the Leaderboard Service */
  leaderboardStrategy: Option[String],
  /* The user friendly name of that resource. Defaults to blank string */
  longDescription: Option[String],
  /* The user friendly name of that resource */
  name: String,
  /* The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing */
  rewardSet: Option[RewardSetResource],
  /* Define what parameters are required/available to start and run an activity. For example: Difficulty, Number of Questions, Character name, Avatar, Duration, etc. Not populated when getting listing */
  settings: Option[List[AvailableSettingResource]],
  /* The user friendly name of that resource. Defaults to blank string */
  shortDescription: Option[String],
  /* Whether this activity is a template for other activities. Default: false */
  template: Option[Boolean],
  /* An activity template this activity is validated against (private). May be null and no validation of additional_properties will be done */
  templateId: Option[String],
  /* The type of the activity */
  _type: Option[String],
  /* The unique key (for static reference in code) of the activity */
  uniqueKey: Option[String],
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Option[Long]
)

