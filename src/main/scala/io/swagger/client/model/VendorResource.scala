/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class VendorResource (
  /* Whether the vendor is active.  Default = true */
  active: Boolean,
  /* The date the vendor was added. Unix timestamp in seconds */
  createDate: Long,
  /* A description of the vendor */
  description: String,
  /* The id of the vendor */
  id: Integer,
  /* The url of an image for the vendor */
  imageUrl: String,
  /* Whether the vendor needs to manually approve invoices before they are paid.  A separate checkout flow is required in this case.  Default: false */
  manualApproval: Boolean,
  /* The name of the vendor */
  name: String,
  /* The primary email address for the vendor */
  primaryContactEmail: String,
  /* The name of the primary contact for the vendor */
  primaryContactName: String,
  /* The primary phone number for the vendor */
  primaryContactPhone: String,
  /* The email address for sale inquiries for the vendor */
  salesEmail: String,
  /* The email address for support inquiries for the vendor */
  supportEmail: String,
  /* The date the vendor was last updated. Unix timestamp in seconds */
  updateDate: Long,
  /* The url for the vendor's site */
  url: String
)
