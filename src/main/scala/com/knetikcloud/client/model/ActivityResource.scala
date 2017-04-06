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


case class ActivityResource (
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Option[Long],
  /* The list of items that can be used for entitlement (wager amounts/etc) */
  entitlements: Option[List[ActivityEntitlementResource]],
  /* The unique ID for that resource */
  id: Option[Long],
  /* Details about how to launch the activity */
  launch: Option[String],
  /* The user friendly name of that resource. Defaults to blank string */
  longDescription: Option[String],
  /* The user friendly name of that resource */
  name: String,
  /* The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing */
  rewardSet: Option[RewardSetResource],
  /* The list of settings and their options available for this activity. Not populated when getting listing */
  settings: Option[List[AvailableSettingResource]],
  /* The user friendly name of that resource. Defaults to blank string */
  shortDescription: Option[String],
  /* Whether this activity is a template for other activities. Default: false */
  template: Option[Boolean],
  /* The type of the activity */
  _type: String,
  /* The unique key (for static reference in code) of the activity */
  uniqueKey: Option[String],
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Option[Long]
)

