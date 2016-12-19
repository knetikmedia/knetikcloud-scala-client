/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class CategoryResource (
  /* Whether the category is currently active. If not, it and its questions will be filtered out. */
  active: Boolean,
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  additionalProperties: Map[String, Property],
  /* The unique ID for this category */
  id: String,
  /* The name of this category. Cannot be blank */
  name: String,
  /* A category template this category is validated against (private). May be null and no validation of additional_properties will be done */
  template: String
)
