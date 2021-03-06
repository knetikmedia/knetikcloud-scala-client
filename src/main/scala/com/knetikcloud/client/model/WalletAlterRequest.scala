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


case class WalletAlterRequest (
  /* The amount of currency to add/remove. positive to add, negative to remove */
  delta: Double,
  /* The id of an invoice to attribute the transaction to */
  invoiceId: Option[Integer],
  /* The admin entered or system generated reason */
  reason: String,
  /* The transaction type to allow for search/etc */
  _type: Option[String]
)

