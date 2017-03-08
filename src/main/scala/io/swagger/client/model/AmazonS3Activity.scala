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


case class AmazonS3Activity (
  /* S3 action (i.e., 'PUT') associated with the activity */
  action: Option[String],
  /* Date the resource was created in S3 */
  createdDate: Option[Long],
  /* Name of the file being processed as a resource in S3 */
  filename: Option[String],
  /* Unique id of the S3 activity */
  id: Option[Long],
  /* S3 object key for the resource */
  objectKey: Option[String],
  /* URL for accessing the S3 resource */
  url: Option[String],
  /* The id of the user that created this S3 activity */
  userId: Option[Integer]
)
