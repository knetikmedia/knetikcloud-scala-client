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


case class VideoResource (
  /* Whether the video is available, based on various factors */
  active: Option[Boolean],
  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  additionalProperties: Option[Map[String, Property]],
  /* The original artist of the media */
  author: Option[SimpleReferenceResourcelong],
  /* The date the media was created as a unix timestamp in seconds */
  authored: Option[Long],
  /* Whether the video has been banned or not */
  banned: Option[Boolean],
  /* The category of the video */
  category: SimpleReferenceResourcestring,
  /* The comments of the video */
  comments: Option[List[CommentResource]],
  /* Artists that contributed to the creation. See separate endpoint to add to list */
  contributors: Option[List[ContributionResource]],
  /* The date/time this resource was created in seconds since unix epoch */
  createdDate: Option[Long],
  /* The country of an embedable version */
  embed: Option[String],
  /* The file extension of the media file. 1-5 characters */
  extension: String,
  /* The height of the video in px */
  height: Integer,
  /* The unique ID for that resource */
  id: Option[Long],
  /* The length of the video in seconds */
  length: Integer,
  /* The country of the media. Typically a url. Cannot be blank */
  location: String,
  /* The user friendly name of that resource. Defaults to blank string */
  longDescription: Option[String],
  /* The mime-type of the media */
  mimeType: Option[String],
  /* The user friendly name of that resource */
  name: String,
  /* The sort order of the video. default: 100 */
  priority: Option[Integer],
  /* The privacy setting. default: private */
  privacy: Option[String],
  /* Whether the video has been made public. Default true */
  published: Option[Boolean],
  /* The user friendly name of that resource. Defaults to blank string */
  shortDescription: Option[String],
  /* The size of the media. Minimum 0 if supplied */
  size: Option[Long],
  /* The tags for the video */
  tags: Option[List[String]],
  /* A video template this video is validated against (private). May be null and no validation of additional_properties will be done */
  template: Option[String],
  /* The country of a thumbnail version. Typically a url */
  thumbnail: Option[String],
  /* The date/time this resource was last updated in seconds since unix epoch */
  updatedDate: Option[Long],
  /* The user the media was uploaded by. May be null for system uploaded media. May only be set to a user other than the current caller if VIDEOS_ADMIN permission. Null will mean the caller is the uploader unless the caller has VIDEOS_ADMIN permission, in which case it will be set to null */
  uploader: Option[SimpleUserResource],
  /* The view count of the video */
  views: Option[Long],
  /* The width of the video in px */
  width: Integer
)

