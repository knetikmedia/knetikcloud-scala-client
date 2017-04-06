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


case class RawSMSResource (
  /* The phone number to attribute the outgoing message to. Optional if the config text.out_number is set. */
  from: Option[String],
  /* A list of user ids to send the message to. */
  recipients: List[Integer],
  /* The body of the outgoing text message. */
  text: String
)
