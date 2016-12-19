/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class UserLevelingResource (
  /* The name of the last tier the user has qualified for */
  lastTierName: String,
  /* The progress level of the last tier the user has qualified for */
  lastTierProgress: Integer,
  /* The name of the level schema */
  levelName: String,
  /* The name of the next tier the user can qualify for */
  nextTierName: String,
  /* The progress needed to qualify for the next tier */
  nextTierProgress: Integer,
  /* The amount of progress the user has */
  progress: Integer,
  /* The names of the tiers the user has qualified for */
  tierNames: List[String],
  /* The ID of the user */
  userId: Integer
)
