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


case class CartShippingAddressRequest (
  /* The city of the user */
  city: String,
  /* The country code of the user */
  countryCodeIso3: String,
  /* The email of the user */
  email: String,
  /* The first name of the user */
  firstName: String,
  /* The last name of the user */
  lastName: String,
  namePrefix: String,
  /* The order notes the user */
  orderNotes: String,
  /* The phone number of the user */
  phoneNumber: String,
  /* The postal state code of the user */
  postalStateCode: String,
  /* The shipping address of the user, first line */
  shippingAddressLine1: String,
  /* The shipping address of the user, second line */
  shippingAddressLine2: String,
  /* The zipcode of the user */
  zip: String
)
