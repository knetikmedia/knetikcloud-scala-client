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


case class FinalizeBillingAgreementRequest (
  /* The ID of the invoice being paid along with the creation of this agreement */
  invoiceId: Option[Integer],
  /* Whether the new payment method created should be the user's default */
  newDefault: Option[Boolean],
  /* The payer ID from PayPal (passed as a parameter in the return URL). Only required if an invoice ID was included */
  payerId: Option[String],
  /* The token from PayPal (passed as a parameter in the return URL) */
  token: String,
  /* The ID of the user. Defaults to the logged in user */
  userId: Option[Integer]
)

