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


case class ActivityOccurrenceJoinResult (
  /* The details on the entitlement object needed to enter the occurrence (if any) */
  entitlement: Option[ActivityEntitlementResource],
  /* Zero if the user was/could be added to the occurrence. Jsapi error code indicating the reason of the failure otherwise */
  errorCode: Integer,
  /* An error message if failure */
  message: Option[String],
  /* The user's id */
  userId: Long
)

