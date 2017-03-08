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


case class RewardItemResource (
  /* The id of the item to reward */
  itemId: Integer,
  /* The name of the item to reward (read only, set by id) */
  itemName: Option[String],
  /* The highest number (worst) rank to give the reward to. Must be greater than or equal to minRank */
  maxRank: Integer,
  /* The lowest number (best) rank to give the reward to. Must be greater than zero */
  minRank: Integer,
  /* How many copies to give */
  quantity: Integer
)
