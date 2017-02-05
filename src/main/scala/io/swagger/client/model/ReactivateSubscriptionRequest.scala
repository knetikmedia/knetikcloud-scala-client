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


case class ReactivateSubscriptionRequest (
  /* The inventory to reactivate. Only required if using the deprecated subscriptions service */
  inventoryId: Integer,
  /* Whether to add the additional reactivation fee in addition to the recurring fee */
  reactivationFee: Boolean
)
