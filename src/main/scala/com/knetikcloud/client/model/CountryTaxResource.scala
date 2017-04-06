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


case class CountryTaxResource (
  /* The iso3 code of the country, cannot be changed */
  countryIso3: String,
  /* The name of the tax */
  name: String,
  /* The tax rate as a percentage to a maximum of two decimal places (1.5 means 1.5%) */
  rate: Double,
  /* Whether the tax applies to shipping costs */
  taxShipping: Boolean
)
