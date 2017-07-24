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


case class SavedAddressResource (
  /* The first line of the address */
  address1: String,
  /* A second line of the address */
  address2: Option[String],
  /* The city */
  city: String,
  /* The iso3 code for the country */
  countryCode: String,
  default: Option[Boolean],
  /* The first name of the user */
  firstName: String,
  /* The id of the address */
  id: Option[Integer],
  /* The last name of the user */
  lastName: String,
  /* The name of the address */
  name: String,
  /* The first phone number of the user */
  phone1: Option[String],
  /* The second phone number of the user */
  phone2: Option[String],
  /* The postal code */
  postalCode: Option[String],
  /* The code for the state. Required if the country has states/provinces/equivalent */
  stateCode: Option[String]
)

