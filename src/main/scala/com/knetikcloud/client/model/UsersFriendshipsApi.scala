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

import com.knetikcloud.client.model.PageResourceSimpleUserResource
import com.knetikcloud.client.model.Result
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class UsersFriendshipsApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Add a friend
   * As a user, either creates or confirm a pending request. As an admin, call this endpoint twice while inverting the IDs to create a confirmed friendship.
   * @param userId The id of the user or &#39;me&#39; if logged in 
   * @param id The id of the user to befriend 
   * @return void
   */
  def addFriend(userId: String, id: Integer) = {
    // create path and map variables
    val path = "/users/{user_id}/friends/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersFriendshipsApi->addFriend")

    

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

  /**
   * Get friends list
   * 
   * @param userId The id of the user or &#39;me&#39; 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceSimpleUserResource
   */
  def getFriends(userId: String, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceSimpleUserResource] = {
    // create path and map variables
    val path = "/users/{user_id}/friends".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersFriendshipsApi->getFriends")

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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceSimpleUserResource]).asInstanceOf[PageResourceSimpleUserResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns the invite token
   * This is a unique invite token that allows direct connection to the request user.  Exposing that token presents privacy issues if the token is leaked. Use friend request flow instead if confirmation is required
   * @param userId The id of the user or &#39;me&#39; if logged in 
   * @return String
   */
  def getInviteToken(userId: String): Option[String] = {
    // create path and map variables
    val path = "/users/{user_id}/invite-token".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersFriendshipsApi->getInviteToken")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[String]).asInstanceOf[String])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get pending invites
   * Invites that the specified user received
   * @param userId The id of the user or &#39;me&#39; 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceSimpleUserResource
   */
  def getInvites(userId: String, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceSimpleUserResource] = {
    // create path and map variables
    val path = "/users/{user_id}/invites".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersFriendshipsApi->getInvites")

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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceSimpleUserResource]).asInstanceOf[PageResourceSimpleUserResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Redeem friendship token
   * Immediately connects the requested user with the user mapped by the provided invite token
   * @param userId The id of the user or &#39;me&#39; if logged in 
   * @param token The invite token (optional)
   * @return void
   */
  def redeemFriendshipToken(userId: String, token: Option[String] = None) = {
    // create path and map variables
    val path = "/users/{user_id}/friends/tokens".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersFriendshipsApi->redeemFriendshipToken")

    

    var postBody: AnyRef = token.map(paramVal => paramVal)

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
   * Remove or decline a friend
   * 
   * @param userId The id of the user or &#39;me&#39; if logged in 
   * @param id The id of the user to befriend 
   * @return void
   */
  def removeOrDeclineFriend(userId: String, id: Integer) = {
    // create path and map variables
    val path = "/users/{user_id}/friends/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersFriendshipsApi->removeOrDeclineFriend")

    

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

}
