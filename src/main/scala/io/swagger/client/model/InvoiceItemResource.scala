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


case class InvoiceItemResource (
  affiliateId: Integer,
  bundleSku: String,
  currentFulfillmentStatus: String,
  id: Integer,
  invoiceId: Integer,
  itemId: Integer,
  itemName: String,
  originalTotalPrice: Double,
  originalUnitPrice: Double,
  qty: Integer,
  saleName: String,
  sku: String,
  skuDescription: String,
  systemPrice: Double,
  totalPrice: Double,
  typeHint: String,
  unitPrice: Double
)
