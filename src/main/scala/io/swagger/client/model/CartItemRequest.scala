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


case class CartItemRequest (
  /* The affiliate key of the item */
  affiliateKey: String,
  /* The catalog SKU of the item */
  catalogSku: String,
  /* The quantity of the item */
  quantity: Integer
)