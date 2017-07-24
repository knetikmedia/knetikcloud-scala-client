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


case class QuestionResource (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  additionalProperties: Option[Map[String, Property]],
  /* The list of available answers */
  answers: Option[List[AnswerResource]],
  /* The category for the question */
  category: NestedCategory,
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Option[Long],
  /* The difficulty of the question */
  difficulty: Integer,
  /* The unique ID for that resource */
  id: Option[String],
  /* The id of the import job that created the question, or null if not from an import */
  importId: Option[Long],
  /* When the question becomes available, null for never, in seconds since epoch */
  publishedDate: Option[Long],
  /* The question. Different 'type' values indicate different structures as the question may be test, image, etc. See information on additional properties for the list and their structures */
  question: Property,
  /* The first source of the question */
  source1: Option[String],
  /* The second source of the question */
  source2: Option[String],
  /* The list of tags */
  tags: Option[List[String]],
  /* A question template this question is validated against (private). May be null and no validation of additional_properties will be done */
  template: Option[String],
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Option[Long],
  /* The supplier of the question */
  vendor: Option[String]
)

