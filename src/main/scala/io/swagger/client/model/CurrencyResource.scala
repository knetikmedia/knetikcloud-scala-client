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


case class CurrencyResource (
  /* Whether the currency is active. Default true */
  active: Boolean,
  /* The unique id code for the currency. Maximum 5 characters */
  code: String,
  /* The unix timestamp in seconds the currency was added to the system */
  createdDate: Long,
  /* The decimal to multiply the system base currency (from config 'currency') to localize to this one. Should be 1 for the base currency itself. */
  factor: Double,
  /* The url for an icon of the currency */
  icon: String,
  /* The name of the currency */
  name: String,
  /* The type of currency. Default 'real' */
  _type: String,
  /* The unix timestamp in seconds the currency was last updated in the system. */
  updatedDate: Long
)