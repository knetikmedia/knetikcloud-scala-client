/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class LeaderboardResource (
  /* The paginated list of user results, in order from best to worst */
  entries: List[LeaderboardEntryResource],
  /* The id of the leaderboard */
  id: Long,
  /* The name of the strategy that defines how entries are stored and compared */
  strategy: String
)
