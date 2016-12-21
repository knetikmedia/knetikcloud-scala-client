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


case class CreatePayPalPaymentRequest (
  /* The endpoint URL to which PayPal should forward the user to if they cancel the checkout process */
  cancelUrl: String,
  /* The ID of an invoice to pay */
  invoiceId: Integer,
  /* The endpoint URL to which PayPal should forward the user after they accept. This endpoint will receive information needed for the next step */
  returnUrl: String
)
