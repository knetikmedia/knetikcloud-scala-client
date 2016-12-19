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


case class CartSummary (
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Long,
  /* The unique id code for the currency used in the cart */
  currencyCode: String,
  /* The grand total for the cart */
  grandTotal: Double,
  /* The unique ID for the cart */
  id: String,
  /* The ID of the invoice associated with this cart */
  invoiceId: Double,
  /* The number of items in the cart */
  itemsInCart: Integer,
  /* The status of the cart */
  status: String,
  /* The subtotal of all items in the cart */
  subtotal: Double
)
