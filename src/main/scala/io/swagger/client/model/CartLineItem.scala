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


case class CartLineItem (
  currencyCode: String,
  description: String,
  discount: Discount,
  lineTotal: Double,
  name: String,
  originalLineTotal: Double,
  originalUnitPrice: Double,
  qty: Integer,
  saleName: String,
  sku: String,
  skuDescription: String,
  storeItemId: Integer,
  tags: List[String],
  thumbUrl: String,
  unitPrice: Double,
  vendorId: Integer,
  vendorName: String
)
