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


case class UserInventoryResource (
  /* A map of data for behaviors */
  behaviorData: Any,
  /* The date/time this resource was created in seconds since epoch */
  createdDate: Long,
  /* The date/time this resource exires in seconds since epoch. Null for no expiration. For subscriptions, this is the end of the 'grace period' if left unpaid */
  expires: Long,
  /* The id of the inventory */
  id: Integer,
  /* The id of the invoice that resulted in this inventory, if any */
  invoiceId: Integer,
  /* The id of the item */
  itemId: Integer,
  /* The name of the item */
  itemName: String,
  /* The type hint of the item */
  itemTypeHint: String,
  /* The status of the inventory. Pending inventory is not yet ready for use. Inactive inventory has expired or been used up */
  status: String,
  /* The date/time this resource was last updated in seconds since epoch */
  updatedDate: Long,
  /* The id of the user this inventory belongs to */
  user: SimpleUserResource
)
