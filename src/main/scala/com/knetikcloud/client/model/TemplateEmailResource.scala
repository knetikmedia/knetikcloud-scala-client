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


case class TemplateEmailResource (
  /* Address to attribute the outgoing message to. Optional if the config email.out_address is set. */
  from: Option[String],
  /* A list of user ids to send the message to. */
  recipients: List[Integer],
  /* The key for the template */
  templateKey: String,
  /* A list of variables to fill in the template */
  templateVars: Option[List[KeyValuePairstringstring]]
)

