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


case class SubscriptionResource (
  /* A map of item additional properties, keyed on the property name. Must match the names and types defined in the template for this item type. */
  additionalProperties: Map[String, Property],
  /* Who can purchase this subscription */
  availability: String,
  /* A category for filtering items */
  category: String,
  /* The day of the month 1..31 this subscription will renew */
  consolidationDayOfMonth: Integer,
  /* The date the item was created, unix timestamp in seconds */
  createdDate: Long,
  /* A list of country iso3 codes to include in the blacklist/whitelist geo policy */
  geoCountryList: List[String],
  /* Whether to use the geo_country_list as a black list or white list for item geographical availability */
  geoPolicyType: String,
  /* The id of the item */
  id: Integer,
  /* A long description of the subscription */
  longDescription: String,
  /* The name of the item */
  name: String,
  /* The billing options for this subscription */
  plans: List[SubscriptionPlanResource],
  /* A short description of the subscription.  Max 255 characters */
  shortDescription: String,
  /* A number to use in sorting items.  Default 500 */
  sort: Integer,
  /* Used to schedule removal from store.  Null means the subscription will never be removed */
  storeEnd: Long,
  /* Used to schedule appearance in store.  Null means the subscription will appear now */
  storeStart: Long,
  /* List of tags used for filtering items */
  tags: List[String],
  /* An item template this item is validated against. May be null and no validation of additional properties will be done. */
  template: String,
  /* The unique key for the item */
  uniqueKey: String,
  /* The date the item was last updated */
  updatedDate: Long,
  /* The vendor who provides the item */
  vendorId: Integer
)
