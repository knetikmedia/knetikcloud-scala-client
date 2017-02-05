/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class DeltaResource (
  /* The id of the category for question */
  categoryId: String,
  /* The media type of the question */
  mediaType: String,
  /* The id of the question */
  questionId: String,
  /* Whether the question was updated or removed */
  state: String,
  /* The tags for the question */
  tags: List[String],
  /* The date this question was last updated in seconds since unix epoch */
  updatedDate: Long
)
