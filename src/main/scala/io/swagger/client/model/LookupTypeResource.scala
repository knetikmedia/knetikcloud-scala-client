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


case class LookupTypeResource (
  /* The description of the expression type */
  description: String,
  /* The variable type the key expression must be, or null if it's dependent (see description for explanation in this case) */
  keyType: String,
  /* The name of the expression type */
  name: String,
  /* The variable type of the value this expression returns, or null if it's dependent (see description for explanation in this case) */
  valueType: String
)

