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


case class PollAnswerResource (
  /* The number of uesrs that selected this answer */
  count: Integer,
  /* The key to the answer (for code reference) */
  key: String,
  /* The text of the answer (for user display) */
  text: String
)
