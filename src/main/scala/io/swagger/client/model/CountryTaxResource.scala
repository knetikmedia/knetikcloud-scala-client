/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


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