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

package io.swagger.client.model


case class AvailableSettingResource (
  /* Whether the setting is advanced. Default: false */
  advancedOption: Option[Boolean],
  /* The value of the default option (must be in options array) */
  defaultValue: String,
  /* The description of the setting */
  description: Option[String],
  /* The unique ID for the setting */
  key: String,
  /* The textual name of the setting */
  name: String,
  /* The set of options available for this setting */
  options: List[SettingOption]
)
