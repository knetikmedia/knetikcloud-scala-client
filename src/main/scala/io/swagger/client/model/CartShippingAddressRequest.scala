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
  city: Option[String],
  /* The country code of the user */
  countryCodeIso3: Option[String],
  /* The email of the user */
  email: Option[String],
  /* The first name of the user */
  firstName: Option[String],
  /* The last name of the user */
  lastName: Option[String],
  namePrefix: Option[String],
  /* The order notes the user */
  orderNotes: Option[String],
  /* The phone number of the user */
  phoneNumber: Option[String],
  /* The postal state code of the user */
  postalStateCode: Option[String],
  /* The shipping address of the user, first line */
  shippingAddressLine1: Option[String],
  /* The shipping address of the user, second line */
  shippingAddressLine2: Option[String],
  /* The zipcode of the user */
  zip: Option[String]
)
