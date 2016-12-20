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


case class AmazonS3Activity (
  /* S3 action (i.e., 'PUT') associated with the activity */
  action: String,
  /* Date the resource was created in S3 */
  createdDate: Long,
  /* Name of the file being processed as a resource in S3 */
  filename: String,
  /* Unique id of the S3 activity */
  id: Long,
  /* S3 object key for the resource */
  objectKey: String,
  /* URL for accessing the S3 resource */
  url: String,
  /* The id of the user that created this S3 activity */
  userId: Integer
)