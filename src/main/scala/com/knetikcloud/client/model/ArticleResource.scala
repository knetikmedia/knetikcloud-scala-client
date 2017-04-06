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

package com.knetikcloud.client.model


case class ArticleResource (
  /* Whether the article is active */
  active: Boolean,
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  additionalProperties: Option[Map[String, Property]],
  /* The body of the article */
  body: String,
  /* The category for the article */
  category: NestedCategory,
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Option[Long],
  /* The id of the article */
  id: Option[String],
  /* The tags for the article */
  tags: Option[List[String]],
  /* An article template this article is validated against (private). May be null and no validation of additional_properties will be done */
  template: Option[String],
  /* The title of the article */
  title: String,
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Option[Long]
)

