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


case class User (
  additionalProperties: Map[String, Property],
  address: String,
  address2: String,
  affiliate: Affiliate,
  avatarUrl: String,
  children: List[UserRelationship],
  city: String,
  country: Country,
  currency: Currency,
  dateCreated: Long,
  dateOfBirth: Long,
  dateUpdated: Long,
  description: String,
  displayName: String,
  email: String,
  firstName: String,
  fullname: String,
  gender: String,
  groups: List[GroupMember],
  guest: Boolean,
  id: Integer,
  inviteToken: String,
  lang: Language,
  lastActivity: Long,
  lastLogin: Long,
  lastName: String,
  lockoutAttempts: Integer,
  lockoutDate: Long,
  mobileNumber: String,
  oldId: Integer,
  parents: List[UserRelationship],
  password: String,
  postalCode: String,
  propertiesString: String,
  roles: List[Role],
  state: String,
  status: String,
  tagStrings: List[String],
  tags: List[UserTag],
  template: String,
  timezone: Timezone,
  token: String,
  typeHint: String,
  username: String
)
