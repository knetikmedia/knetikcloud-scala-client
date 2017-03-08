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


case class PaymentAuthorizationResource (
  /* Whether this authorization has been captured */
  captured: Option[Boolean],
  /* The date this authorization was received, unix timestamp in seconds */
  created: Option[Long],
  /* The details for this authorization. Format dependent on payment provider */
  details: Option[Any],
  /* The id of the authorization */
  id: Option[Integer],
  /* The invoice this authorization is intended to pay */
  invoice: Option[Integer],
  /* The payment type (which provider) this payment is through */
  paymentType: SimpleReferenceResourceint
)

