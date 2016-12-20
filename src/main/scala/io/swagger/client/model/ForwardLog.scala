/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class ForwardLog (
  /* The end date of the forward log entry */
  endDate: Long,
  errorMsg: String,
  /* The http status code the forward log entry */
  httpStatusCode: Integer,
  /* The id of the forward log entry */
  id: String,
  /* The payload of the forward log entry */
  payload: Any,
  /* The response string of the forward log entry */
  response: String,
  /* The retry count of the forward log entry */
  retryCount: Integer,
  /* The start date of the forward log entry */
  startDate: Long,
  /* The endpoint url of the forward log entry */
  url: String
)
