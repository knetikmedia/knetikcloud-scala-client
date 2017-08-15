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


case class FattMerchantPaymentMethod (
  address1: Option[String],
  address2: Option[String],
  addressCity: Option[String],
  addressCountry: Option[String],
  addressState: Option[String],
  addressZip: Option[String],
  /* Last four digits of the credit card */
  cardLastFour: String,
  createdAt: Option[String],
  /* Unique FattMerchant customer ID */
  customerId: String,
  deletedAt: Option[String],
  id: Option[String],
  /* Nickname given to the FattMerchant payment method */
  nickname: String,
  updatedAt: Option[String]
)
