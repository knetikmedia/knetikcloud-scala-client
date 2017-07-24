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


case class BehaviorDefinitionResource (
  /* Description of the behavior */
  description: Option[String],
  /* Pre-requisite behaviors that an item must have in order to also have this behavior */
  prerequisiteBehaviors: Option[List[Behavior]],
  /* Configurable properties of the behavior */
  properties: List[PropertyFieldResource],
  /* The behavior type */
  typeHint: String
)

