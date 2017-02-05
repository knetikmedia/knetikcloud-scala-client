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


case class SelectedSettingResource (
  /* The unique ID for the setting */
  key: String,
  /* The textual name of the setting */
  keyName: String,
  /* The unique ID for the option */
  value: String,
  /* The textual name of the option */
  valueName: String
)
