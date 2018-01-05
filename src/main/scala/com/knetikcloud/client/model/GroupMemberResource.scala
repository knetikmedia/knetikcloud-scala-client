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


case class GroupMemberResource (
  /* A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this type, or be an extra not from the template */
  additionalProperties: Option[Map[String, Property]],
  /* The group. Id is the unique name */
  group: Option[SimpleGroupResource],
  /* Whether this membership is explicit (the user was added directly to the group) or implicit (the user was added only to one or more child groups) */
  _implicit: Option[Boolean],
  /* The id of the membership entry */
  membershipId: Option[Long],
  /* The position of the member in the group if applicable. Read notes for details */
  order: Option[String],
  /* The member's access level. Default: member */
  status: Option[String],
  /* A template this member additional properties are validated against (private). May be null and no validation of properties will be done */
  template: Option[String],
  /* The user */
  user: SimpleUserResource
)

