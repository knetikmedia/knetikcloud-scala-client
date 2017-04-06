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

import com.knetikcloud.client.model.LeaderboardEntryResource
import com.knetikcloud.client.model.LeaderboardResource
import com.knetikcloud.client.model.Result
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class GamificationLeaderboardsApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Retrieves leaderboard details and paginated entries
   * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.
   * @param contextType The context type for the leaderboard 
   * @param contextId The context id for the leaderboard 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return LeaderboardResource
   */
  def getLeaderboard(contextType: String, contextId: String, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[LeaderboardResource] = {
    // create path and map variables
    val path = "/leaderboards/{context_type}/{context_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "context_type" + "\\}",apiInvoker.escape(contextType)).replaceAll("\\{" + "context_id" + "\\}",apiInvoker.escape(contextId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (contextType == null) throw new Exception("Missing required parameter 'contextType' when calling GamificationLeaderboardsApi->getLeaderboard")

    if (contextId == null) throw new Exception("Missing required parameter 'contextId' when calling GamificationLeaderboardsApi->getLeaderboard")

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
           Some(apiInvoker.deserialize(s, "", classOf[LeaderboardResource]).asInstanceOf[LeaderboardResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieves a specific user entry with rank
   * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard
   * @param contextType The context type for the leaderboard 
   * @param contextId The context id for the leaderboard 
   * @param id The id of a user 
   * @return LeaderboardEntryResource
   */
  def getLeaderboardRank(contextType: String, contextId: String, id: String): Option[LeaderboardEntryResource] = {
    // create path and map variables
    val path = "/leaderboards/{context_type}/{context_id}/users/{id}/rank".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "context_type" + "\\}",apiInvoker.escape(contextType)).replaceAll("\\{" + "context_id" + "\\}",apiInvoker.escape(contextId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (contextType == null) throw new Exception("Missing required parameter 'contextType' when calling GamificationLeaderboardsApi->getLeaderboardRank")

    if (contextId == null) throw new Exception("Missing required parameter 'contextId' when calling GamificationLeaderboardsApi->getLeaderboardRank")

    if (id == null) throw new Exception("Missing required parameter 'id' when calling GamificationLeaderboardsApi->getLeaderboardRank")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[LeaderboardEntryResource]).asInstanceOf[LeaderboardEntryResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a list of available leaderboard strategy names
   * 
   * @return List[String]
   */
  def getLeaderboardStrategies(): Option[List[String]] = {
    // create path and map variables
    val path = "/leaderboards/strategies".replaceAll("\\{format\\}", "json")

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
           Some(apiInvoker.deserialize(s, "array", classOf[String]).asInstanceOf[List[String]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}