/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.knetikcloud.client.model


case class BundledSku (
  /* The amount this item will cost inside the bundle instead of its regular price */
  priceOverride: Option[Number],
  /* The quantity of this item within the bundle */
  quantity: Integer,
  /* The stock keeping unit (SKU) for an item included in the bundle */
  sku: String
)

