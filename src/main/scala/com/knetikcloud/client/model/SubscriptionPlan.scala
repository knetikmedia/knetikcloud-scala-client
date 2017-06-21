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


case class SubscriptionPlan (
  additionalProperties: Option[Map[String, Property]],
  availability: Option[String],
  billGraceDays: Option[Integer],
  consolidated: Option[Boolean],
  firstBill: Option[Integer],
  firstBillUnitOfTime: Option[String],
  id: Option[String],
  latePaymentSku: Option[String],
  locked: Option[Boolean],
  maxAutoRenew: Option[Integer],
  maxBillAttempts: Option[Integer],
  migrationPlan: Option[String],
  minimumTerm: Option[Integer],
  name: Option[String],
  primarySku: Option[String],
  reactivationSku: Option[String],
  recurringSku: Option[String],
  renewPeriod: Option[Integer],
  renewPeriodUnitOfTime: Option[String],
  subscriptionId: Option[Integer]
)

