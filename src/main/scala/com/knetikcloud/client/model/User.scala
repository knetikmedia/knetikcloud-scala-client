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


case class User (
  additionalProperties: Option[Map[String, Property]],
  address: Option[String],
  address2: Option[String],
  affiliate: Option[Affiliate],
  avatarUrl: Option[String],
  children: Option[List[UserRelationship]],
  city: Option[String],
  country: Option[Country],
  currency: Option[Currency],
  dateCreated: Option[Long],
  dateOfBirth: Option[Long],
  dateUpdated: Option[Long],
  description: Option[String],
  displayName: Option[String],
  email: Option[String],
  firstName: Option[String],
  fullname: Option[String],
  gender: Option[String],
  groups: Option[List[GroupMember]],
  guest: Option[Boolean],
  id: Option[Integer],
  inviteToken: Option[String],
  lang: Option[Language],
  lastActivity: Option[Long],
  lastLogin: Option[Long],
  lastName: Option[String],
  lockoutAttempts: Option[Integer],
  lockoutDate: Option[Long],
  mobileNumber: Option[String],
  oldId: Option[Integer],
  parents: Option[List[UserRelationship]],
  password: Option[String],
  postalCode: Option[String],
  propertiesString: Option[String],
  roles: Option[List[Role]],
  state: Option[String],
  status: Option[String],
  tagStrings: Option[List[String]],
  tags: Option[List[UserTag]],
  template: Option[String],
  timezone: Option[Timezone],
  token: Option[String],
  typeHint: Option[String],
  username: Option[String]
)
