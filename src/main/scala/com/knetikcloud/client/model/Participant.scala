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


case class Participant (
  /* Whether this user is the 'host' of the occurrence and has increased access to settings/etc (default: false) */
  host: Option[Boolean],
  /* The current status of the user in the occurrence (default: present) */
  status: Option[String],
  /* The user */
  user: IdRef
)

