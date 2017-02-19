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

package io.swagger.client.api

import io.swagger.client.model.OauthAccessTokenResource
import io.swagger.client.model.PageResourceOauthAccessTokenResource
import io.swagger.client.model.Result
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class AuthTokensApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Delete a token by username and client id
   * 
   * @param username The username of the user 
   * @param clientId The id of the client 
   * @return void
   */
  def deleteToken(username: String, clientId: String) = {
    // create path and map variables
    val path = "/auth/tokens/{username}/{client_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "username" + "\\}",apiInvoker.escape(username)).replaceAll("\\{" + "client_id" + "\\}",apiInvoker.escape(clientId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling AuthTokensApi->deleteToken")

    if (clientId == null) throw new Exception("Missing required parameter 'clientId' when calling AuthTokensApi->deleteToken")

    

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
   * Delete all tokens by username
   * 
   * @param username The username of the user 
   * @return void
   */
  def deleteTokens(username: String) = {
    // create path and map variables
    val path = "/auth/tokens/{username}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "username" + "\\}",apiInvoker.escape(username))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling AuthTokensApi->deleteTokens")

    

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
   * Get a single token by username and client id
   * 
   * @param username The username of the user 
   * @param clientId The id of the client 
   * @return OauthAccessTokenResource
   */
  def getToken(username: String, clientId: String): Option[OauthAccessTokenResource] = {
    // create path and map variables
    val path = "/auth/tokens/{username}/{client_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "username" + "\\}",apiInvoker.escape(username)).replaceAll("\\{" + "client_id" + "\\}",apiInvoker.escape(clientId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling AuthTokensApi->getToken")

    if (clientId == null) throw new Exception("Missing required parameter 'clientId' when calling AuthTokensApi->getToken")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[OauthAccessTokenResource]).asInstanceOf[OauthAccessTokenResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List usernames and client ids
   * Token value not shown
   * @param filterClientId Filters for token whose client id matches provided string (optional)
   * @param filterUsername Filters for token whose username matches provided string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to username:ASC)
   * @return PageResourceOauthAccessTokenResource
   */
  def getTokens(filterClientId: Option[String] = None, filterUsername: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = username:ASC*/): Option[PageResourceOauthAccessTokenResource] = {
    // create path and map variables
    val path = "/auth/tokens".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterClientId.map(paramVal => queryParams += "filter_client_id" -> paramVal.toString)
    filterUsername.map(paramVal => queryParams += "filter_username" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceOauthAccessTokenResource]).asInstanceOf[PageResourceOauthAccessTokenResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
