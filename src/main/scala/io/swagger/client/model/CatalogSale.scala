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


case class CatalogSale (
  /* The iso3 code for the currency for this discountValue.  The sku purchased will have to match for it this sale to apply */
  currencyCode: String,
  /* The way in which the price is reduced. 'value' means subtracting directly, 'percentage' means subtracting by the price times the discountValue (1.0 == 100%) */
  discountType: String,
  /* The amount deducted from the price, in the same currencyCode as the item */
  discountValue: Double,
  /* The id of the sale */
  id: Integer,
  /* The id of the item this sale applies to.  Leave null to use other filters */
  item: Integer,
  /* The long description of the sale */
  longDescription: String,
  /* The name of the sale.  Max 40 characters */
  name: String,
  /* The date the sale ends, null for never.  Unix timestamp in seconds */
  saleEndDate: Long,
  /* The date the sale begins.  Unix timestamp in seconds */
  saleStartDate: Long,
  /* The short description of the sale.  Max 140 characters */
  shortDescription: String,
  /* The tag this sale applies to.  Leave null to skip this filter (applies to all tags) */
  tag: String,
  /* The id of the vendor this sale applies to.  Leave null to skip this filter (applies to all vendors) */
  vendor: Integer
)
