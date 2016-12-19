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


case class ItemBehaviorDefinitionResource (
  /* The default version of the behavior */
  behavior: Behavior,
  /* Whether the behavior's values can be modified */
  modifiable: Boolean,
  /* Whether the behavior can be removed */
  required: Boolean
)
