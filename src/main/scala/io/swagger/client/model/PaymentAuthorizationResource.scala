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


case class PaymentAuthorizationResource (
  /* Whether this authorization has been captured */
  captured: Boolean,
  /* The date this authorization was received, unix timestamp in seconds */
  created: Long,
  /* The details for this authorization. Format dependent on payment provider */
  details: Any,
  /* The id of the authorization */
  id: Integer,
  /* The invoice this authorization is intended to pay */
  invoice: Integer,
  /* The payment type (which provider) this payment is through */
  paymentType: SimpleReferenceResourceint
)
