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

import io.swagger.client.model.ChallengeActivityResource
import io.swagger.client.model.ChallengeEventResource
import io.swagger.client.model.ChallengeResource
import io.swagger.client.model.PageResourceBareChallengeActivityResource
import io.swagger.client.model.PageResourceChallengeEventResource
import io.swagger.client.model.PageResourceChallengeResource
import io.swagger.client.model.PageResourceTemplateResource
import io.swagger.client.model.Result
import io.swagger.client.model.TemplateResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class CampaignsChallengesApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Create a challenge
   * Challenges do not run on their own.  They must be added to a campaign before events will spawn.
   * @param challengeResource The challenge resource object (optional)
   * @return ChallengeResource
   */
  def createChallenge(challengeResource: Option[ChallengeResource] = None): Option[ChallengeResource] = {
    // create path and map variables
    val path = "/challenges".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = challengeResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[ChallengeResource]).asInstanceOf[ChallengeResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create a challenge activity
   * 
   * @param challengeId The challenge id 
   * @param challengeActivityResource The challenge activity resource object (optional)
   * @param validateSettings Whether to validate the settings being sent against the available settings on the base activity. (optional, default to false)
   * @return ChallengeActivityResource
   */
  def createChallengeActivity(challengeId: Long, challengeActivityResource: Option[ChallengeActivityResource] = None, validateSettings: Option[Boolean] /* = false*/): Option[ChallengeActivityResource] = {
    // create path and map variables
    val path = "/challenges/{challenge_id}/activities".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "challenge_id" + "\\}",apiInvoker.escape(challengeId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    validateSettings.map(paramVal => queryParams += "validateSettings" -> paramVal.toString)
    

    var postBody: AnyRef = challengeActivityResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[ChallengeActivityResource]).asInstanceOf[ChallengeActivityResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create a challenge template
   * Challenge Templates define a type of challenge and the properties they have
   * @param challengeTemplateResource The challenge template resource object (optional)
   * @return TemplateResource
   */
  def createChallengeTemplate(challengeTemplateResource: Option[TemplateResource] = None): Option[TemplateResource] = {
    // create path and map variables
    val path = "/challenges/templates".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = challengeTemplateResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[TemplateResource]).asInstanceOf[TemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete a challenge
   * 
   * @param id The challenge id 
   * @return void
   */
  def deleteChallenge(id: Long) = {
    // create path and map variables
    val path = "/challenges/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
   * Delete a challenge activity
   * 
   * @param activityId The activity id 
   * @param challengeId The challenge id 
   * @return void
   */
  def deleteChallengeActivity(activityId: Long, challengeId: Long) = {
    // create path and map variables
    val path = "/challenges/{challenge_id}/activities/{activity_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "activity_id" + "\\}",apiInvoker.escape(activityId)).replaceAll("\\{" + "challenge_id" + "\\}",apiInvoker.escape(challengeId))

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
   * Delete a challenge event
   * 
   * @param id The challenge event id 
   * @return void
   */
  def deleteChallengeEvent(id: Long) = {
    // create path and map variables
    val path = "/challenges/events/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
   * Delete a challenge template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return void
   */
  def deleteChallengeTemplate(id: String, cascade: Option[String] = None) = {
    // create path and map variables
    val path = "/challenges/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling CampaignsChallengesApi->deleteChallengeTemplate")

    cascade.map(paramVal => queryParams += "cascade" -> paramVal.toString)
    

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
   * Retrieve a challenge
   * 
   * @param id The challenge id 
   * @return ChallengeResource
   */
  def getChallenge(id: Long): Option[ChallengeResource] = {
    // create path and map variables
    val path = "/challenges/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
           Some(apiInvoker.deserialize(s, "", classOf[ChallengeResource]).asInstanceOf[ChallengeResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List and search challenge activities
   * 
   * @param challengeId The challenge id 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceBareChallengeActivityResource
   */
  def getChallengeActivities(challengeId: Long, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceBareChallengeActivityResource] = {
    // create path and map variables
    val path = "/challenges/{challenge_id}/activities".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "challenge_id" + "\\}",apiInvoker.escape(challengeId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceBareChallengeActivityResource]).asInstanceOf[PageResourceBareChallengeActivityResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single challenge activity
   * 
   * @param activityId The activity id 
   * @return ChallengeActivityResource
   */
  def getChallengeActivity(activityId: Long): Option[ChallengeActivityResource] = {
    // create path and map variables
    val path = "/challenges/{challenge_id}/activities/{activity_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "activity_id" + "\\}",apiInvoker.escape(activityId))

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
           Some(apiInvoker.deserialize(s, "", classOf[ChallengeActivityResource]).asInstanceOf[ChallengeActivityResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve a single challenge event details
   * 
   * @param id The challenge event id 
   * @return ChallengeEventResource
   */
  def getChallengeEvent(id: Long): Option[ChallengeEventResource] = {
    // create path and map variables
    val path = "/challenges/events/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
           Some(apiInvoker.deserialize(s, "", classOf[ChallengeEventResource]).asInstanceOf[ChallengeEventResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve a list of challenge events
   * 
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the event start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterEndDate A comma separated string without spaces.  First value is the operator to search on, second value is the event end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterCampaigns check only for events from currently running campaigns (optional)
   * @param filterChallenge check only for events from the challenge specified by id (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceChallengeEventResource
   */
  def getChallengeEvents(filterStartDate: Option[String] = None, filterEndDate: Option[String] = None, filterCampaigns: Option[Boolean] = None, filterChallenge: Option[Long] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceChallengeEventResource] = {
    // create path and map variables
    val path = "/challenges/events".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterStartDate.map(paramVal => queryParams += "filter_start_date" -> paramVal.toString)
    filterEndDate.map(paramVal => queryParams += "filter_end_date" -> paramVal.toString)
    filterCampaigns.map(paramVal => queryParams += "filter_campaigns" -> paramVal.toString)
    filterChallenge.map(paramVal => queryParams += "filter_challenge" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceChallengeEventResource]).asInstanceOf[PageResourceChallengeEventResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single challenge template
   * 
   * @param id The id of the template 
   * @return TemplateResource
   */
  def getChallengeTemplate(id: String): Option[TemplateResource] = {
    // create path and map variables
    val path = "/challenges/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling CampaignsChallengesApi->getChallengeTemplate")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[TemplateResource]).asInstanceOf[TemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List and search challenge templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   */
  def getChallengeTemplates(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceTemplateResource] = {
    // create path and map variables
    val path = "/challenges/templates".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceTemplateResource]).asInstanceOf[PageResourceTemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve a list of challenges
   * 
   * @param filterTemplate Filter for challenges that are not tied to campaigns (templates) (optional)
   * @param filterActiveCampaign Filter for challenges that are tied to active campaigns (optional)
   * @return PageResourceChallengeResource
   */
  def getChallenges(filterTemplate: Option[Boolean] = None, filterActiveCampaign: Option[Boolean] = None): Option[PageResourceChallengeResource] = {
    // create path and map variables
    val path = "/challenges".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterTemplate.map(paramVal => queryParams += "filter_template" -> paramVal.toString)
    filterActiveCampaign.map(paramVal => queryParams += "filter_active_campaign" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceChallengeResource]).asInstanceOf[PageResourceChallengeResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update a challenge
   * If the challenge is a copy, changes will propagate to all the related challenges
   * @param id The challenge id 
   * @param challengeResource The challenge resource object (optional)
   * @return ChallengeResource
   */
  def updateChallenge(id: Long, challengeResource: Option[ChallengeResource] = None): Option[ChallengeResource] = {
    // create path and map variables
    val path = "/challenges/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = challengeResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[ChallengeResource]).asInstanceOf[ChallengeResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update a challenge activity
   * 
   * @param activityId The activity id 
   * @param challengeId The challenge id 
   * @param challengeActivityResource The challenge activity resource object (optional)
   * @return ChallengeActivityResource
   */
  def updateChallengeActivity(activityId: Long, challengeId: Long, challengeActivityResource: Option[ChallengeActivityResource] = None): Option[ChallengeActivityResource] = {
    // create path and map variables
    val path = "/challenges/{challenge_id}/activities/{activity_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "activity_id" + "\\}",apiInvoker.escape(activityId)).replaceAll("\\{" + "challenge_id" + "\\}",apiInvoker.escape(challengeId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = challengeActivityResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[ChallengeActivityResource]).asInstanceOf[ChallengeActivityResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update a challenge template
   * 
   * @param id The id of the template 
   * @param challengeTemplateResource The challenge template resource object (optional)
   * @return TemplateResource
   */
  def updateChallengeTemplate(id: String, challengeTemplateResource: Option[TemplateResource] = None): Option[TemplateResource] = {
    // create path and map variables
    val path = "/challenges/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling CampaignsChallengesApi->updateChallengeTemplate")

    

    var postBody: AnyRef = challengeTemplateResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[TemplateResource]).asInstanceOf[TemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
