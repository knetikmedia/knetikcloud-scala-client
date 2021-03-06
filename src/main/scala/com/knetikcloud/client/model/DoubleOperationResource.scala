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


case class DoubleOperationResource (
  /* The arguments the operator apply to. See notes for details. */
  args: List[ExpressionResource],
  definition: Option[String],
  /* The operator to be used in this predicate. See notes for details. */
  op: String,
  returnType: Option[String],
  /* The operators supported by this expression */
  supportedOperators: Option[List[OperationDefinitionResource]],
  _type: Option[String]
)

