/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import io.swagger.client.model.PageUsageInfo
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ReportingUsageApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Returns aggregated endpoint usage information by the day
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds 
   * @param endDate The ending of the range being requested, unix timestamp in seconds 
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageUsageInfo
   */
  def getUsageByDayUsingGET(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageUsageInfo] = {
    // create path and map variables
    val path = "/reporting/usage/day".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    queryParams += "start_date" -> startDate.toString
    queryParams += "end_date" -> endDate.toString
    combineEndpoints.map(paramVal => queryParams += "combine_endpoints" -> paramVal.toString)
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
           Some(ApiInvoker.deserialize(s, "", classOf[PageUsageInfo]).asInstanceOf[PageUsageInfo])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns aggregated endpoint usage information by hour
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds 
   * @param endDate The ending of the range being requested, unix timestamp in seconds 
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageUsageInfo
   */
  def getUsageByHourUsingGET(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageUsageInfo] = {
    // create path and map variables
    val path = "/reporting/usage/hour".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    queryParams += "start_date" -> startDate.toString
    queryParams += "end_date" -> endDate.toString
    combineEndpoints.map(paramVal => queryParams += "combine_endpoints" -> paramVal.toString)
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
           Some(ApiInvoker.deserialize(s, "", classOf[PageUsageInfo]).asInstanceOf[PageUsageInfo])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns aggregated endpoint usage information by minute
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds 
   * @param endDate The ending of the range being requested, unix timestamp in seconds 
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageUsageInfo
   */
  def getUsageByMinuteUsingGET(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageUsageInfo] = {
    // create path and map variables
    val path = "/reporting/usage/minute".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    queryParams += "start_date" -> startDate.toString
    queryParams += "end_date" -> endDate.toString
    combineEndpoints.map(paramVal => queryParams += "combine_endpoints" -> paramVal.toString)
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
           Some(ApiInvoker.deserialize(s, "", classOf[PageUsageInfo]).asInstanceOf[PageUsageInfo])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns aggregated endpoint usage information by month
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds 
   * @param endDate The ending of the range being requested, unix timestamp in seconds 
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageUsageInfo
   */
  def getUsageByMonthUsingGET(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageUsageInfo] = {
    // create path and map variables
    val path = "/reporting/usage/month".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    queryParams += "start_date" -> startDate.toString
    queryParams += "end_date" -> endDate.toString
    combineEndpoints.map(paramVal => queryParams += "combine_endpoints" -> paramVal.toString)
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
           Some(ApiInvoker.deserialize(s, "", classOf[PageUsageInfo]).asInstanceOf[PageUsageInfo])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns aggregated endpoint usage information by year
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds 
   * @param endDate The ending of the range being requested, unix timestamp in seconds 
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageUsageInfo
   */
  def getUsageByYearUsingGET(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageUsageInfo] = {
    // create path and map variables
    val path = "/reporting/usage/year".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    queryParams += "start_date" -> startDate.toString
    queryParams += "end_date" -> endDate.toString
    combineEndpoints.map(paramVal => queryParams += "combine_endpoints" -> paramVal.toString)
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
           Some(ApiInvoker.deserialize(s, "", classOf[PageUsageInfo]).asInstanceOf[PageUsageInfo])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
