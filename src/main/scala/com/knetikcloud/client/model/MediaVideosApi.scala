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

import com.knetikcloud.client.model.CommentResource
import com.knetikcloud.client.model.ContributionResource
import com.knetikcloud.client.model.DispositionResource
import com.knetikcloud.client.model.FlagResource
import com.knetikcloud.client.model.PageResourceCommentResource
import com.knetikcloud.client.model.PageResourceDispositionResource
import com.knetikcloud.client.model.PageResourceVideoRelationshipResource
import com.knetikcloud.client.model.PageResourceVideoResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.VideoRelationshipResource
import com.knetikcloud.client.model.VideoResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class MediaVideosApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Adds a user to a video&#39;s whitelist
   * Whitelisted users can view video regardless of privacy setting.
   * @param id The video id 
   * @param userId The user id (optional)
   * @return void
   */
  def addUserToVideoWhitelist(id: Long, userId: Option[Integer] = None) = {
    // create path and map variables
    val path = "/media/videos/{id}/whitelist".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = userId.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Adds a new video in the system
   * 
   * @param videoResource The video object (optional)
   * @return VideoResource
   */
  def addVideo(videoResource: Option[VideoResource] = None): Option[VideoResource] = {
    // create path and map variables
    val path = "/media/videos".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = videoResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[VideoResource]).asInstanceOf[VideoResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Add a new video comment
   * 
   * @param videoId The video id  
   * @param commentResource The comment object (optional)
   * @return CommentResource
   */
  def addVideoComment(videoId: Integer, commentResource: Option[CommentResource] = None): Option[CommentResource] = {
    // create path and map variables
    val path = "/media/videos/{video_id}/comments".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = commentResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[CommentResource]).asInstanceOf[CommentResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Adds a contributor to a video
   * 
   * @param videoId The video id 
   * @param contributionResource The contribution object (optional)
   * @return void
   */
  def addVideoContributor(videoId: Long, contributionResource: Option[ContributionResource] = None) = {
    // create path and map variables
    val path = "/media/videos/{video_id}/contributors".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = contributionResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Add a new flag
   * 
   * @param videoId The video id 
   * @param reason The flag reason (optional)
   * @return FlagResource
   */
  def addVideoFlag(videoId: Long, reason: Option[String] = None): Option[FlagResource] = {
    // create path and map variables
    val path = "/media/videos/{video_id}/moderation".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = reason.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[FlagResource]).asInstanceOf[FlagResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Adds one or more existing videos as related to this one
   * 
   * @param videoId The video id 
   * @param videoRelationshipResource The video relationship object  (optional)
   * @return VideoRelationshipResource
   */
  def addVideoRelationships(videoId: Long, videoRelationshipResource: Option[VideoRelationshipResource] = None): Option[VideoRelationshipResource] = {
    // create path and map variables
    val path = "/media/videos/{video_id}/related".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = videoRelationshipResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[VideoRelationshipResource]).asInstanceOf[VideoRelationshipResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create a video disposition
   * 
   * @param videoId The video id 
   * @param dispositionResource The disposition object (optional)
   * @return DispositionResource
   */
  def createVideoDisposition(videoId: Integer, dispositionResource: Option[DispositionResource] = None): Option[DispositionResource] = {
    // create path and map variables
    val path = "/media/videos/{video_id}/dispositions".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = dispositionResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[DispositionResource]).asInstanceOf[DispositionResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Deletes a video from the system if no resources are attached to it
   * 
   * @param id The video id 
   * @return void
   */
  def deleteVideo(id: Long) = {
    // create path and map variables
    val path = "/media/videos/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete a video comment
   * 
   * @param videoId The video id 
   * @param id The comment id 
   * @return void
   */
  def deleteVideoComment(videoId: Long, id: Long) = {
    // create path and map variables
    val path = "/media/videos/{video_id}/comments/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete a video disposition
   * 
   * @param dispositionId The disposition id 
   * @return void
   */
  def deleteVideoDisposition(dispositionId: Long) = {
    // create path and map variables
    val path = "/media/videos/{video_id}/dispositions/{disposition_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "disposition_id" + "\\}",apiInvoker.escape(dispositionId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete a flag
   * 
   * @param videoId The video id 
   * @return void
   */
  def deleteVideoFlag(videoId: Long) = {
    // create path and map variables
    val path = "/media/videos/{video_id}/moderation".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete a video&#39;s relationship
   * 
   * @param videoId The video id 
   * @param id The relationship id 
   * @return void
   */
  def deleteVideoRelationship(videoId: Long, id: Long) = {
    // create path and map variables
    val path = "/media/videos/{video_id}/related/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get user videos
   * 
   * @param userId The user id 
   * @param excludeFlagged Skip videos that have been flagged by the current user (optional, default to true)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceVideoResource
   */
  def getUserVideos(userId: Integer, excludeFlagged: Option[Boolean] /* = true*/, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceVideoResource] = {
    // create path and map variables
    val path = "/users/{user_id}/videos".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    excludeFlagged.map(paramVal => queryParams += "exclude_flagged" -> paramVal.toString)
    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceVideoResource]).asInstanceOf[PageResourceVideoResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Loads a specific video details
   * 
   * @param id The video id 
   * @return VideoResource
   */
  def getVideo(id: Long): Option[VideoResource] = {
    // create path and map variables
    val path = "/media/videos/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[VideoResource]).asInstanceOf[VideoResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns a page of comments for a video
   * 
   * @param videoId The video id 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceCommentResource
   */
  def getVideoComments(videoId: Integer, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceCommentResource] = {
    // create path and map variables
    val path = "/media/videos/{video_id}/comments".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceCommentResource]).asInstanceOf[PageResourceCommentResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns a page of dispositions for a video
   * 
   * @param videoId The video id 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceDispositionResource
   */
  def getVideoDispositions(videoId: Integer, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceDispositionResource] = {
    // create path and map variables
    val path = "/media/videos/{video_id}/dispositions".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceDispositionResource]).asInstanceOf[PageResourceDispositionResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns a page of video relationships
   * 
   * @param videoId The video id 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceVideoRelationshipResource
   */
  def getVideoRelationships(videoId: Long, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceVideoRelationshipResource] = {
    // create path and map variables
    val path = "/media/videos/{video_id}/related".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceVideoRelationshipResource]).asInstanceOf[PageResourceVideoRelationshipResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Search videos using the documented filters
   * 
   * @param excludeFlagged Skip videos that have been flagged by the current user (optional, default to true)
   * @param filterVideosByUploader Filter for videos by uploader id (optional)
   * @param filterCategory Filter for videos from a specific category by id (optional)
   * @param filterTagset Filter for videos with specified tags (separated by comma) (optional)
   * @param filterVideosByName Filter for videos which name *STARTS* with the given string (optional)
   * @param filterVideosByContributor Filter for videos with contribution from the artist specified by ID (optional)
   * @param filterVideosByAuthor Filter for videos with an artist as author specified by ID (optional)
   * @param filterHasAuthor Filter for videos that have an author set if true, or that have no author if false (optional)
   * @param filterHasUploader Filter for videos that have an uploader set if true, or that have no uploader if false (optional)
   * @param filterRelatedTo Filter for videos that have designated a particular video as the TO of a relationship. Pattern should match VIDEO_ID or VIDEO_ID:DETAILS to match with a specific details string as well (optional)
   * @param filterFriends Filter for videos uploaded by friends. &#39;true&#39; for friends of the caller (requires user token) or a user id for a specific user&#39;s friends (requires VIDEOS_ADMIN permission) (optional)
   * @param filterDisposition Filter for videos a given user has a given disposition towards. USER_ID:DISPOSITION where USER_ID is the id of the user who has this disposition or &#39;me&#39; for the caller (requires user token for &#39;me&#39;) and DISPOSITION is the name of the disposition. E.G. filter_disposition&#x3D;123:like or filter_disposition&#x3D;me:favorite (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to author:ASC)
   * @return PageResourceVideoResource
   */
  def getVideos(excludeFlagged: Option[Boolean] /* = true*/, filterVideosByUploader: Option[String] = None, filterCategory: Option[String] = None, filterTagset: Option[String] = None, filterVideosByName: Option[String] = None, filterVideosByContributor: Option[String] = None, filterVideosByAuthor: Option[String] = None, filterHasAuthor: Option[Boolean] = None, filterHasUploader: Option[Boolean] = None, filterRelatedTo: Option[String] = None, filterFriends: Option[Boolean] = None, filterDisposition: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = author:ASC*/): Option[PageResourceVideoResource] = {
    // create path and map variables
    val path = "/media/videos".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    excludeFlagged.map(paramVal => queryParams += "exclude_flagged" -> paramVal.toString)
    filterVideosByUploader.map(paramVal => queryParams += "filter_videos_by_uploader" -> paramVal.toString)
    filterCategory.map(paramVal => queryParams += "filter_category" -> paramVal.toString)
    filterTagset.map(paramVal => queryParams += "filter_tagset" -> paramVal.toString)
    filterVideosByName.map(paramVal => queryParams += "filter_videos_by_name" -> paramVal.toString)
    filterVideosByContributor.map(paramVal => queryParams += "filter_videos_by_contributor" -> paramVal.toString)
    filterVideosByAuthor.map(paramVal => queryParams += "filter_videos_by_author" -> paramVal.toString)
    filterHasAuthor.map(paramVal => queryParams += "filter_has_author" -> paramVal.toString)
    filterHasUploader.map(paramVal => queryParams += "filter_has_uploader" -> paramVal.toString)
    filterRelatedTo.map(paramVal => queryParams += "filter_related_to" -> paramVal.toString)
    filterFriends.map(paramVal => queryParams += "filter_friends" -> paramVal.toString)
    filterDisposition.map(paramVal => queryParams += "filter_disposition" -> paramVal.toString)
    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    order.map(paramVal => queryParams += "order" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceVideoResource]).asInstanceOf[PageResourceVideoResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Removes a user from a video&#39;s whitelist
   * Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting.
   * @param videoId The video id 
   * @param id The user id 
   * @return void
   */
  def removeUserFromVideoWhitelist(videoId: Long, id: Integer) = {
    // create path and map variables
    val path = "/media/videos/{video_id}/whitelist/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Removes a contributor from a video
   * 
   * @param videoId The video id 
   * @param id The contributor id 
   * @return void
   */
  def removeVideoContributor(videoId: Long, id: Integer) = {
    // create path and map variables
    val path = "/media/videos/{video_id}/contributors/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Modifies a video&#39;s details
   * 
   * @param id The video id 
   * @param videoResource The video object (optional)
   * @return void
   */
  def updateVideo(id: Long, videoResource: Option[VideoResource] = None) = {
    // create path and map variables
    val path = "/media/videos/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = videoResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update a video comment
   * 
   * @param videoId The video id 
   * @param id The comment id 
   * @param content The comment content (optional)
   * @return void
   */
  def updateVideoComment(videoId: Long, id: Long, content: Option[String] = None) = {
    // create path and map variables
    val path = "/media/videos/{video_id}/comments/{id}/content".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = content.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update a video&#39;s relationship details
   * 
   * @param videoId The video id 
   * @param relationshipId The relationship id 
   * @param details The video relationship details (optional)
   * @return void
   */
  def updateVideoRelationship(videoId: Long, relationshipId: Long, details: Option[String] = None) = {
    // create path and map variables
    val path = "/media/videos/{video_id}/related/{id}/relationship_details".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "video_id" + "\\}",apiInvoker.escape(videoId)).replaceAll("\\{" + "relationship_id" + "\\}",apiInvoker.escape(relationshipId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = details.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Increment a video&#39;s view count
   * 
   * @param id The video id 
   * @return void
   */
  def viewVideo(id: Long) = {
    // create path and map variables
    val path = "/media/videos/{id}/views".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
