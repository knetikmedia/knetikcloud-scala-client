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


case class Cart (
  availableShippingOptions: Option[List[CartShippingOption]],
  countryTax: Option[Number],
  coupons: Option[List[CouponDefinition]],
  created: Option[Long],
  currencyCode: Option[String],
  discountTotal: Option[Number],
  errorCode: Option[Integer],
  errorMessage: Option[String],
  grandTotal: Option[Number],
  id: Option[String],
  invoiceId: Option[Number],
  items: Option[List[CartLineItem]],
  owner: Option[Integer],
  selectedShippingOptions: Option[List[CartShippingOption]],
  shippable: Option[Boolean],
  shippingAddress: Option[CartShippingAddressRequest],
  shippingCost: Option[Number],
  stateTax: Option[Number],
  status: Option[String],
  subtotal: Option[Number],
  updated: Option[Long]
)

