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


case class OptimalPaymentRequest (
  /* The email address of the user */
  email: Option[String],
  /* The first name of the user */
  firstName: Option[String],
  /* The id of the invoice to pay */
  invoiceId: Integer,
  /* The last name of the user */
  lastName: Option[String],
  /* The url to redirect the user to after declining payment */
  onDecline: String,
  /* The url to redirect the user to after an error in payment */
  onError: String,
  /* The url to redirect the user to after successful payment */
  onSuccess: String
)

