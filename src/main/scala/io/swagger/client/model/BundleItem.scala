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


case class BundleItem (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template */
  additionalProperties: Option[Map[String, Property]],
  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  behaviors: Option[List[Behavior]],
  /* The skus of items to be included in this bundle, and how they influence the bundle total price.  Must have at least one SKU */
  bundledSkus: List[BundledSku],
  /* A category for filtering items */
  category: Option[String],
  /* The date the item was created, unix timestamp in seconds */
  createdDate: Option[Long],
  /* Whether or not the item is currently displayable.  Default = true */
  displayable: Option[Boolean],
  /* A list of country ID to include in the blacklist/whitelist geo policy */
  geoCountryList: Option[List[String]],
  /* Whether to use the geo_country_list as a black list or white list for item geographical availability */
  geoPolicyType: Option[String],
  /* The id of the item */
  id: Option[Integer],
  /* A long description of the item */
  longDescription: Option[String],
  /* The name of the item */
  name: String,
  /* Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0 */
  shippingTier: Option[Integer],
  /* A short description of the item, max 255 chars */
  shortDescription: Option[String],
  /* The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart */
  skus: List[Sku],
  /* A number to use in sorting items.  Default 500 */
  sort: Option[Integer],
  /* The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store */
  storeEnd: Option[Long],
  /* The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately */
  storeStart: Option[Long],
  /* List of tags used for filtering items */
  tags: Option[List[String]],
  /* An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null */
  template: Option[String],
  /* The type of the item */
  typeHint: String,
  /* The unique key for the item */
  uniqueKey: Option[String],
  /* The date the item was last updated, unix timestamp in seconds */
  updatedDate: Option[Long],
  /* The vendor who provides the item */
  vendorId: Integer
)

