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


case class ImportJobResource (
  /* The id of the category to assign all questions in the import to */
  categoryId: String,
  /* The date the job was created in seconds since unix epoc */
  createdDate: Long,
  /* The id of the job */
  id: Long,
  /* A name for this import for later reference */
  name: String,
  /* Error information from validation */
  output: List[ImportJobOutputResource],
  /* The number of questions form the CSV file. Filled in after validation */
  recordCount: Long,
  /* The status of the job */
  status: String,
  /* The date the job was last updated in seconds since unix epoc */
  updatedDate: Long,
  /* The url of a CSV file to pull trivia questions from. Cannot be changed after initial POST */
  url: String,
  /* The vendor who supplied this set of questions */
  vendor: String
)
