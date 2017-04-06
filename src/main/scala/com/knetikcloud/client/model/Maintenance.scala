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


case class Maintenance (
  /* Whether access to the system has been locked */
  accessLocked: Boolean,
  /* A simple object of any schema for client side use and processing */
  details: Option[Any],
  /* User displayable message about the maintenance */
  message: String
)
