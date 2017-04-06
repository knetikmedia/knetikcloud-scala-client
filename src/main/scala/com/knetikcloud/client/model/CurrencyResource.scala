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


case class CurrencyResource (
  /* Whether the currency is active. Default true */
  active: Option[Boolean],
  /* The unique id code for the currency. Maximum 5 characters */
  code: String,
  /* The unix timestamp in seconds the currency was added to the system */
  createdDate: Option[Long],
  /* The decimal to multiply the system base currency (from config 'currency') to localize to this one. Should be 1 for the base currency itself. */
  factor: Double,
  /* The url for an icon of the currency */
  icon: Option[String],
  /* The name of the currency */
  name: String,
  /* The type of currency. Default 'real' */
  _type: Option[String],
  /* The unix timestamp in seconds the currency was last updated in the system. */
  updatedDate: Option[Long]
)
