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

import io.swagger.client.model.ActivityOccurrenceCreationFailure
import io.swagger.client.model.ActivityOccurrenceResource
import io.swagger.client.model.ActivityOccurrenceResults
import io.swagger.client.model.ActivityResource
import io.swagger.client.model.PageResourceBareActivityResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ActivitiesApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Create an activity
   * 
   * @param activityResource The activity resource object (optional)
   * @return ActivityResource
   */
  def createActivity(activityResource: Option[ActivityResource] = None): Option[ActivityResource] = {
    // create path and map variables
    val path = "/activities".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = activityResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[ActivityResource]).asInstanceOf[ActivityResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create a new activity occurrence
   * Has to enforce extra rules if not used as an admin
   * @param test if true, indicates that the occurrence should NOT be created. This can be used to test for eligibility and valid settings (optional, default to false)
   * @param activityOccurrenceResource The activity occurrence object (optional)
   * @return ActivityOccurrenceResource
   */
  def createActivityOccurrence(test: Option[Boolean] /* = false*/, activityOccurrenceResource: Option[ActivityOccurrenceResource] = None): Option[ActivityOccurrenceResource] = {
    // create path and map variables
    val path = "/activity-occurrences".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    test.map(paramVal => queryParams += "test" -> paramVal.toString)
    

    var postBody: AnyRef = activityOccurrenceResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[ActivityOccurrenceResource]).asInstanceOf[ActivityOccurrenceResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete an activity
   * 
   * @param id The id of the activity 
   * @return void
   */
  def deleteActivity(id: Long) = {
    // create path and map variables
    val path = "/activities/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
   * List activity definitions
   * 
   * @param filterTemplate Filter for activities that are templates, or specifically not if false (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceBareActivityResource
   */
  def getActivities(filterTemplate: Option[Boolean] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceBareActivityResource] = {
    // create path and map variables
    val path = "/activities".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterTemplate.map(paramVal => queryParams += "filter_template" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceBareActivityResource]).asInstanceOf[PageResourceBareActivityResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single activity
   * 
   * @param id The id of the activity 
   * @return ActivityResource
   */
  def getActivity(id: Long): Option[ActivityResource] = {
    // create path and map variables
    val path = "/activities/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
           Some(apiInvoker.deserialize(s, "", classOf[ActivityResource]).asInstanceOf[ActivityResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Sets the status of an activity occurrence to FINISHED and logs metrics
   * 
   * @param activityOccurrenceId The id of the activity occurrence 
   * @param activityOccurrenceResults The activity occurrence object (optional)
   * @return ActivityOccurrenceResults
   */
  def setActivityOccurrenceResults(activityOccurrenceId: Long, activityOccurrenceResults: Option[ActivityOccurrenceResults] = None): Option[ActivityOccurrenceResults] = {
    // create path and map variables
    val path = "/activity-occurrences/{activity_occurrence_id}/results".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "activity_occurrence_id" + "\\}",apiInvoker.escape(activityOccurrenceId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = activityOccurrenceResults.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[ActivityOccurrenceResults]).asInstanceOf[ActivityOccurrenceResults])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update an activity
   * 
   * @param id The id of the activity 
   * @param activityResource The activity resource object (optional)
   * @return void
   */
  def updateActivity(id: Long, activityResource: Option[ActivityResource] = None) = {
    // create path and map variables
    val path = "/activities/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = activityResource.map(paramVal => paramVal)

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
   * Updated the status of an activity occurrence
   * If setting to &#39;FINISHED&#39; you must POST to /results instead to record the metrics and get synchronous reward results
   * @param activityOccurrenceId The id of the activity occurrence 
   * @param activityCccurrenceStatus The activity occurrence status object (optional)
   * @return void
   */
  def updateActivityOccurrence(activityOccurrenceId: Long, activityCccurrenceStatus: Option[String] = None) = {
    // create path and map variables
    val path = "/activity-occurrences/{activity_occurrence_id}/status".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "activity_occurrence_id" + "\\}",apiInvoker.escape(activityOccurrenceId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = activityCccurrenceStatus.map(paramVal => paramVal)

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

}
