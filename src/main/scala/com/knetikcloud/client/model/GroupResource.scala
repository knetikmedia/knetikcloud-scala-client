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


case class GroupResource (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  additionalProperties: Option[Map[String, Property]],
  /* A description of the group. Max 250 characters */
  description: Option[String],
  /* The number of users in the group */
  memberCount: Option[Integer],
  /* A message of the day for members of the group */
  messageOfTheDay: Option[String],
  /* The name of the group. Max 50 characters */
  name: String,
  /* The unique name of another group that this group is a subset of */
  parent: Option[String],
  /* The status which describes whether other users can freely join the group or not */
  status: String,
  /* The number of users in child groups */
  subMemberCount: Option[Integer],
  /* A group template this group is validated against. May be null and no validation of additional_properties will be done */
  template: Option[String],
  /* Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created */
  uniqueName: String
)

