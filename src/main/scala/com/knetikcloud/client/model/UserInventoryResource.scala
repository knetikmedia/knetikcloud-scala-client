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


case class UserInventoryResource (
  /* A map of data for behaviors */
  behaviorData: Option[Any],
  /* The date/time this resource was created in seconds since epoch */
  createdDate: Option[Long],
  /* The date/time this resource exires in seconds since epoch. Null for no expiration. For subscriptions, this is the end of the 'grace period' if left unpaid */
  expires: Option[Long],
  /* The id of the inventory */
  id: Option[Integer],
  /* The id of the invoice that resulted in this inventory, if any */
  invoiceId: Option[Integer],
  /* The id of the item */
  itemId: Option[Integer],
  /* The name of the item */
  itemName: Option[String],
  /* The type hint of the item */
  itemTypeHint: Option[String],
  /* The status of the inventory. Pending inventory is not yet ready for use. Inactive inventory has expired or been used up */
  status: Option[String],
  /* The date/time this resource was last updated in seconds since epoch */
  updatedDate: Option[Long],
  /* The id of the user this inventory belongs to */
  user: Option[SimpleUserResource]
)

