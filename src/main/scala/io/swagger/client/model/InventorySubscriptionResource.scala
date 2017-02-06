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


case class InventorySubscriptionResource (
  /* The date the subscription will be billed */
  billDate: Long,
  /* A credit of money already applied to a subscription for the next bill, or a debt if negative */
  credit: Double,
  /* A record of past and present credit/debt changes */
  creditLog: List[SubscriptionCreditResource],
  /* The date the grace period ends */
  graceEnd: Long,
  /* The id of the inventory */
  inventoryId: Integer,
  /* The inventory status object */
  inventoryStatus: String,
  /* The id of the item */
  itemId: Integer,
  /* The payment method object */
  paymentMethod: PaymentMethodResource,
  /* The recurring price */
  recurringPrice: Double,
  /* The sku of the subscription */
  sku: String,
  /* The date the subscription will start */
  startDate: Long,
  /* The status of the subscription */
  subscriptionStatus: Integer,
  /* The user */
  user: SimpleUserResource
)
