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


case class DeviceResource (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template if one is specified */
  additionalProperties: Option[Map[String, Property]],
  /* The date the device log was created */
  createdDate: Option[Long],
  /* The description of the device */
  description: Option[String],
  /* The type of device. Use mobile_device to specifically register mobile devices. This particular type will be used to send and receive notifications */
  deviceType: Option[String],
  /* The unique ID for this device. Cannot be changed after creation. Default: random */
  id: Option[String],
  /* The physical location of the device, coordinates or named place (office, living room, etc) */
  location: Option[String],
  /* The MAC (media access control) address of the device */
  macAddress: Option[String],
  /* The make of the device */
  make: Option[String],
  /* The model of the device */
  model: Option[String],
  /* The name of the device */
  name: Option[String],
  /* The OS (operating system) on the device */
  os: Option[String],
  /* The user that owns the device */
  owner: Option[SimpleUserResource],
  /* The serial number of the device */
  serial: Option[String],
  /* Random tags to facilitate search */
  tags: Option[List[String]],
  /* Use to describe and validate custom properties (custom schema). May be null and no validation of additional_properties will be done */
  template: Option[String],
  /* The date the device log was updated */
  updatedDate: Option[Long],
  /* The users currently using the device */
  users: Option[List[SimpleUserResource]]
)

