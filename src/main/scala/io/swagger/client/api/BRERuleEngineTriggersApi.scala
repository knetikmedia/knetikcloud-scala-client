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

package io.swagger.client.api

import io.swagger.client.model.BreTriggerResource
import io.swagger.client.model.PageResourceBreTriggerResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class BRERuleEngineTriggersApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Create a trigger
   * Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services
   * @param breTriggerResource The BRE trigger resource object (optional)
   * @return BreTriggerResource
   */
  def createTriggerUsingPOST(breTriggerResource: Option[BreTriggerResource] = None): Option[BreTriggerResource] = {
    // create path and map variables
    val path = "/bre/triggers".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = breTriggerResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[BreTriggerResource]).asInstanceOf[BreTriggerResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete a trigger
   * May fail if there are existing rules against it. Cannot delete core triggers
   * @param eventName The trigger event name 
   * @return void
   */
  def deleteTriggerUsingDELETE(eventName: String) = {
    // create path and map variables
    val path = "/bre/triggers/{event_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "event_name" + "\\}",apiInvoker.escape(eventName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (eventName == null) throw new Exception("Missing required parameter 'eventName' when calling BRERuleEngineTriggersApi->deleteTriggerUsingDELETE")

    

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
   * Get a single trigger
   * 
   * @param eventName The trigger event name 
   * @return BreTriggerResource
   */
  def getTriggerUsingGET(eventName: String): Option[BreTriggerResource] = {
    // create path and map variables
    val path = "/bre/triggers/{event_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "event_name" + "\\}",apiInvoker.escape(eventName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (eventName == null) throw new Exception("Missing required parameter 'eventName' when calling BRERuleEngineTriggersApi->getTriggerUsingGET")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[BreTriggerResource]).asInstanceOf[BreTriggerResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List triggers
   * 
   * @param filterSystem Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed (optional)
   * @param filterCategory Filter for triggers that are within a specific category (optional)
   * @param filterName Filter for triggers that have names containing the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceBreTriggerResource
   */
  def getTriggersUsingGET(filterSystem: Option[Boolean] = None, filterCategory: Option[String] = None, filterName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceBreTriggerResource] = {
    // create path and map variables
    val path = "/bre/triggers".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterSystem.map(paramVal => queryParams += "filter_system" -> paramVal.toString)
    filterCategory.map(paramVal => queryParams += "filter_category" -> paramVal.toString)
    filterName.map(paramVal => queryParams += "filter_name" -> paramVal.toString)
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
           Some(ApiInvoker.deserialize(s, "", classOf[PageResourceBreTriggerResource]).asInstanceOf[PageResourceBreTriggerResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update a trigger
   * May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers
   * @param eventName The trigger event name 
   * @param breTriggerResource The BRE trigger resource object (optional)
   * @return void
   */
  def updateTriggerUsingPUT(eventName: String, breTriggerResource: Option[BreTriggerResource] = None) = {
    // create path and map variables
    val path = "/bre/triggers/{event_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "event_name" + "\\}",apiInvoker.escape(eventName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (eventName == null) throw new Exception("Missing required parameter 'eventName' when calling BRERuleEngineTriggersApi->updateTriggerUsingPUT")

    

    var postBody: AnyRef = breTriggerResource.map(paramVal => paramVal)

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
