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


case class ActivityOccurrenceResults (
  /* The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed */
  users: List[UserActivityResultsResource]
)
