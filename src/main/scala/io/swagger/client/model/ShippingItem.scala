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


case class ShippingItem (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template */
  additionalProperties: Map[String, Property],
  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  behaviors: List[Behavior],
  /* A category for filtering items */
  category: String,
  /* A unique list of country iso3 codes that allow the shipping option */
  countries: List[String],
  /* The date the item was created, unix timestamp in seconds */
  createdDate: Long,
  /* Whether or not the item is currently displayable.  Default = true */
  displayable: Boolean,
  /* A list of country ID to include in the blacklist/whitelist geo policy */
  geoCountryList: List[String],
  /* Whether to use the geo_country_list as a black list or white list for item geographical availability */
  geoPolicyType: String,
  /* The id of the item */
  id: Integer,
  /* A long description of the item */
  longDescription: String,
  /* An abstract max value that the values of item's shipping_tier work against to decide whether an order can be fulfilled */
  maxTierTotal: Integer,
  /* The name of the item */
  name: String,
  /* Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0 */
  shippingTier: Integer,
  /* A short description of the item, max 255 chars */
  shortDescription: String,
  /* The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart */
  skus: List[Sku],
  /* A number to use in sorting items.  Default 500 */
  sort: Integer,
  /* The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store */
  storeEnd: Long,
  /* The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately */
  storeStart: Long,
  /* List of tags used for filtering items */
  tags: List[String],
  /* Whether tax should be applied to the shipping price.  Default = false */
  taxable: Boolean,
  /* An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null */
  template: String,
  /* The type of the item */
  typeHint: String,
  /* The unique key for the item */
  uniqueKey: String,
  /* The date the item was last updated, unix timestamp in seconds */
  updatedDate: Long,
  /* The vendor who provides the item */
  vendorId: Integer
)
