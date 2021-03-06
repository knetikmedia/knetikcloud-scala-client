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


case class UserAchievementGroupResource (
  /* The list of achievements associated with the group */
  achievements: List[UserAchievementResource],
  /* The name of the group.  If used by Leveling, this will represent the level name */
  groupName: String,
  /* The id of the achievement progress */
  id: Option[String],
  /* The current progress of the user on the group */
  progress: Integer,
  /* The id of the user whose progress is being tracked */
  userId: Integer
)

