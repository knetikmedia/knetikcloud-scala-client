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


case class SubscriptionResource (
  /* A map of item additional properties, keyed on the property name. Must match the names and types defined in the template for this item type. */
  additionalProperties: Option[Map[String, Property]],
  /* Who can purchase this subscription */
  availability: Option[String],
  /* A category for filtering items */
  category: Option[String],
  /* The day of the month 1..31 this subscription will renew */
  consolidationDayOfMonth: Option[Integer],
  /* The date the item was created, unix timestamp in seconds */
  createdDate: Option[Long],
  /* A list of country iso3 codes to include in the blacklist/whitelist geo policy */
  geoCountryList: Option[List[String]],
  /* Whether to use the geo_country_list as a black list or white list for item geographical availability */
  geoPolicyType: Option[String],
  /* The id of the item */
  id: Option[Integer],
  /* A long description of the subscription */
  longDescription: Option[String],
  /* The name of the item */
  name: String,
  /* The billing options for this subscription */
  plans: Option[List[SubscriptionPlanResource]],
  /* A short description of the subscription.  Max 255 characters */
  shortDescription: Option[String],
  /* A number to use in sorting items.  Default 500 */
  sort: Option[Integer],
  /* Used to schedule removal from store.  Null means the subscription will never be removed */
  storeEnd: Option[Long],
  /* Used to schedule appearance in store.  Null means the subscription will appear now */
  storeStart: Option[Long],
  /* List of tags used for filtering items */
  tags: Option[List[String]],
  /* An item template this item is validated against. May be null and no validation of additional properties will be done. */
  template: Option[String],
  /* The unique key for the item */
  uniqueKey: Option[String],
  /* The date the item was last updated */
  updatedDate: Option[Long],
  /* The vendor who provides the item */
  vendorId: Integer
)

