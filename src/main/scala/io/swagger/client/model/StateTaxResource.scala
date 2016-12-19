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


case class StateTaxResource (
  /* The iso3 code of the country, cannot be changed */
  countryIso3: String,
  /* Whether the state is exempt from paying the country tax */
  federallyExempt: Boolean,
  /* The name of the tax */
  name: String,
  /* The tax rate as a percentage to a maximum of two decimal places (1.5 means 1.5%) */
  rate: Double,
  /* The code of the state, cannot be changed */
  stateCode: String,
  /* Whether the tax applies to shipping costs */
  taxShipping: Boolean
)