/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class SubscriptionCreditResource (
  /* The amount of the credit, negative for debt */
  amount: Double,
  /* The date this credit was added, unix timestamp in seconds */
  createdDate: Long,
  /* The id of the credit record */
  id: Integer,
  /* The id of the subscription inventory entry */
  inventoryId: Integer,
  /* The reason for the subscription credit */
  reason: String
)
