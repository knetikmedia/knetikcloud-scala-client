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

package io.swagger.client.model


case class CityResource (
  /* The iso3 of the country this city is in */
  countryCodeIso3: String,
  /* The unique ID for this city */
  id: Integer,
  /* The name of the city */
  name: String,
  /* The code for the state this city is in */
  stateCode: String
)
