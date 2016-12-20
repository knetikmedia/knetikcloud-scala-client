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


case class UserInventoryAddRequest (
  /* A note to be passed to the invoice or transaction */
  note: String,
  /* A list of behaviors to ignore explicitely.  Ex: 'limited_gettable' */
  overrides: List[String],
  /* If set to true will cause the endpoint to skip creation of cart and invoice to track the inventory change */
  skipInvoice: Boolean,
  /* The specific SKU of the item to be added to the inventory */
  sku: String
)