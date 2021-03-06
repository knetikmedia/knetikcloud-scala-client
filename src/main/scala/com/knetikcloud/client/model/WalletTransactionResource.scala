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


case class WalletTransactionResource (
  /* The new balance of the wallet after the transaction */
  balance: Option[Number],
  /* The unix timestamp in seconds of the transaction */
  createDate: Option[Long],
  /* The code of the currency for the transaction */
  currencyCode: Option[String],
  /* The specific details of the transaction, such as a message from the admin that created it */
  details: Option[String],
  /* The id of the transaction */
  id: Option[Integer],
  /* The id of the invoice that spawned the transaction, if any */
  invoiceId: Option[Integer],
  /* Whether the transaction has been refunded */
  isRefunded: Option[Boolean],
  /* The response */
  response: Option[String],
  /* The root source of the transaction */
  source: Option[String],
  /* If the transaction was successful */
  successful: Option[Boolean],
  /* The payment gateway (external) transaction ID */
  transactionId: Option[String],
  /* The general type of the transaction */
  _type: Option[String],
  /* The table name of the subclass */
  typeHint: Option[String],
  /* The owner of the wallet */
  user: Option[SimpleUserResource],
  /* The amount of the transaction, positive if a gain, negative if an expenditure */
  value: Option[Number],
  /* The id of the wallet this transaction affected */
  walletId: Option[Integer]
)

