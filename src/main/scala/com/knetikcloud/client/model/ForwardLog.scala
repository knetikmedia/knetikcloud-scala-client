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


case class ForwardLog (
  /* The end date of the forward log entry */
  endDate: Option[Long],
  errorMsg: Option[String],
  /* The http status code the forward log entry */
  httpStatusCode: Option[Integer],
  /* The id of the forward log entry */
  id: Option[String],
  /* The payload of the forward log entry */
  payload: Option[Any],
  /* The response string of the forward log entry */
  response: Option[String],
  /* The retry count of the forward log entry */
  retryCount: Option[Integer],
  /* The start date of the forward log entry */
  startDate: Option[Long],
  /* The endpoint url of the forward log entry */
  url: Option[String]
)

