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

import io.swagger.client.model.PageResourceChallengeEventParticipantResource
import io.swagger.client.model.Result
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ReportingChallengesApi(val defBasePath: String = "https://sandbox.knetikcloud.com/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Retrieve a challenge event leaderboard details
   * Lists all leaderboard entries with additional user details
   * @param filterEvent A sepecific challenge event id (optional)
   * @return PageResourceChallengeEventParticipantResource
   */
  def getChallengeEventLeaderboard(filterEvent: Option[Long] = None): Option[PageResourceChallengeEventParticipantResource] = {
    // create path and map variables
    val path = "/reporting/events/leaderboard".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterEvent.map(paramVal => queryParams += "filter_event" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceChallengeEventParticipantResource]).asInstanceOf[PageResourceChallengeEventParticipantResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve a challenge event participant details
   * Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation
   * @param filterEvent A sepecific challenge event id (optional)
   * @return PageResourceChallengeEventParticipantResource
   */
  def getChallengeEventParticipants(filterEvent: Option[Long] = None): Option[PageResourceChallengeEventParticipantResource] = {
    // create path and map variables
    val path = "/reporting/events/participants".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterEvent.map(paramVal => queryParams += "filter_event" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceChallengeEventParticipantResource]).asInstanceOf[PageResourceChallengeEventParticipantResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
