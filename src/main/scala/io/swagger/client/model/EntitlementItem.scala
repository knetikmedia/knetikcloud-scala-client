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


case class EntitlementItem (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template */
  additionalProperties: Map[String, Property],
  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  behaviors: List[Behavior],
  /* A category for filtering items */
  category: String,
  /* The date the item was created, unix timestamp in seconds */
  createdDate: Long,
  /* The id of the item */
  id: Integer,
  /* A long description of the item */
  longDescription: String,
  /* The name of the item */
  name: String,
  /* A short description of the item, max 255 chars */
  shortDescription: String,
  /* A number to use in sorting items.  Default 500 */
  sort: Integer,
  /* List of tags used for filtering items */
  tags: List[String],
  /* An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null */
  template: String,
  /* The type of the item */
  typeHint: String,
  /* The unique key for the item */
  uniqueKey: String,
  /* The date the item was last updated, unix timestamp in seconds */
  updatedDate: Long
)