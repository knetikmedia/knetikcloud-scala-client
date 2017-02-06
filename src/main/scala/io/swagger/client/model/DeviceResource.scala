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


case class DeviceResource (
  /* The authorization code for the device */
  authorization: String,
  /* The current condition of the device (New, Defective, Reconditioned) */
  condition: String,
  /* The date the device log was created */
  createdDate: Long,
  /* The key/value pairs for extended data */
  data: Map[String, String],
  /* The description of the device */
  description: String,
  /* The type of the device */
  deviceType: String,
  /* The unique ID for this device. Cannot be changed once created */
  id: Integer,
  /* The location of the device */
  location: String,
  /* The MAC (media access control) address of the device */
  macAddress: String,
  /* The make of the device */
  make: String,
  /* The model of the device */
  model: String,
  /* The name of the device */
  name: String,
  /* The OS (operating system) on the device */
  os: String,
  /* The serial number of the device */
  serial: String,
  /* The current status the device (Active, Pending Active, Inactive, Repair */
  status: String,
  /* The date the device log was updated */
  updatedDate: Long,
  /* The user that owns the device */
  user: SimpleUserResource
)
