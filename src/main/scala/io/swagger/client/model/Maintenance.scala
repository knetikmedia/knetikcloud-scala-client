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


case class Maintenance (
  /* Whether access to the system has been locked */
  accessLocked: Boolean,
  /* A simple object of any schema for client side use and processing */
  details: Any,
  /* User displayable message about the maintenance */
  message: String
)
