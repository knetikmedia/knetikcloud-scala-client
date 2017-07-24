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


case class SubscriptionPlanResource (
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this subscription */
  additionalProperties: Option[Map[String, Property]],
  /* The length of the billing cycle in number of billing cycle unit */
  billingCycleLength: Integer,
  /* The time period unit to apply to the length of billing cycles */
  billingCycleUnit: String,
  /* Whether this plan will be renewed on the consolidated billing cycle */
  consolidated: Boolean,
  /* The ISO3 currency code to use for the fees */
  currencyCode: String,
  /* Used to schedule plan availability end date */
  endDate: Option[Long],
  /* Optional override for the length of the first billing cycle before the first recurring billing */
  firstBillingCycleLength: Option[Integer],
  /* The time period unit to apply to the length of the first billing cycle. Required when first_billing_cycle_length is specified */
  firstBillingCycleUnit: Option[String],
  /* The number of late payment days before a subscription is canceled */
  gracePeriod: Integer,
  /* The id of the plan used to generate the SKUs */
  id: Option[String],
  /* The fee charged when the subscription is purchased */
  initialFee: Double,
  /* The SKU to be used when purchasing the subscription through the cart */
  initialSku: Option[String],
  /* The fee to add to the bill when an invoice has gone unpaid passed the grace period */
  latePaymentFee: Double,
  /* The SKU that will show on the invoice when the subscription is delinquent */
  latePaymentSku: Option[String],
  /* Whether this plan is locked because it has been purchased by at least one user.  When locked, a number of properties can no longer be changed */
  locked: Option[Boolean],
  /* The number of charge attempts before the subscription becomes delinquent */
  maxBillAttempts: Integer,
  /* Maximum number of renewals. If a migration plan is provided, the subscription will automatically switch to it when this limit is reached */
  maxCycles: Option[Integer],
  /* Automatically migrate to the specified plan when the subscription is first renewed */
  migrateToPlan: Option[String],
  /* The minimum number of renewals to charge for */
  minCycles: Option[Integer],
  /* The name of the plan used to generate the SKUs */
  name: String,
  /* Whether this plan is currently available */
  published: Boolean,
  /* The fee to charge when a suspended subscription is to be re-activated */
  reactivationFee: Double,
  /* The SKU that will show on the invoice when the subscription is re-activated after a suspension */
  reactivationSku: Option[String],
  /* The recurring fee to charge for each renewal */
  recurringFee: Double,
  /* The SKU that will show on the invoice when the subscription is activated */
  recurringSku: Option[String],
  /* Used to schedule plan availability start date */
  startDate: Option[Long]
)

