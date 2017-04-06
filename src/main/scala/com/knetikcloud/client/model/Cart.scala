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

package com.knetikcloud.client.model


case class Cart (
  availableShippingOptions: Option[List[CartShippingOption]],
  countryTax: Option[Double],
  coupons: Option[List[CouponDefinition]],
  created: Option[Long],
  currencyCode: Option[String],
  discountTotal: Option[Double],
  errorCode: Option[Integer],
  errorMessage: Option[String],
  grandTotal: Option[Double],
  id: Option[String],
  invoiceId: Option[Double],
  items: Option[List[CartLineItem]],
  owner: Option[Integer],
  selectedShippingOptions: Option[List[CartShippingOption]],
  shippable: Option[Boolean],
  shippingAddress: Option[CartShippingAddressRequest],
  shippingCost: Option[Double],
  stateTax: Option[Double],
  status: Option[String],
  subtotal: Option[Double],
  updated: Option[Long]
)
