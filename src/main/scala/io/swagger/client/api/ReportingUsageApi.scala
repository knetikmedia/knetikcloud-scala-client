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

import io.swagger.client.model.PageResourceUsageInfo
import io.swagger.client.model.Result
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
   * Returns aggregated endpoint usage information by day
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds 
   * @param endDate The ending of the range being requested, unix timestamp in seconds 
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   */
  def getUsageByDay(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, method: Option[String] = None, url: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceUsageInfo] = {
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
    method.map(paramVal => queryParams += "method" -> paramVal.toString)
    url.map(paramVal => queryParams += "url" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceUsageInfo]).asInstanceOf[PageResourceUsageInfo])
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
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   */
  def getUsageByHour(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, method: Option[String] = None, url: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceUsageInfo] = {
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
    method.map(paramVal => queryParams += "method" -> paramVal.toString)
    url.map(paramVal => queryParams += "url" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceUsageInfo]).asInstanceOf[PageResourceUsageInfo])
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
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   */
  def getUsageByMinute(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, method: Option[String] = None, url: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceUsageInfo] = {
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
    method.map(paramVal => queryParams += "method" -> paramVal.toString)
    url.map(paramVal => queryParams += "url" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceUsageInfo]).asInstanceOf[PageResourceUsageInfo])
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
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   */
  def getUsageByMonth(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, method: Option[String] = None, url: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceUsageInfo] = {
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
    method.map(paramVal => queryParams += "method" -> paramVal.toString)
    url.map(paramVal => queryParams += "url" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceUsageInfo]).asInstanceOf[PageResourceUsageInfo])
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
   * @param combineEndpoints Whether to combine counts from different endpoints. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   */
  def getUsageByYear(startDate: Long, endDate: Long, combineEndpoints: Option[Boolean] /* = false*/, method: Option[String] = None, url: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceUsageInfo] = {
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
    method.map(paramVal => queryParams += "method" -> paramVal.toString)
    url.map(paramVal => queryParams += "url" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceUsageInfo]).asInstanceOf[PageResourceUsageInfo])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns list of endpoints called (method and url)
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds 
   * @param endDate The ending of the range being requested, unix timestamp in seconds 
   * @return List[String]
   */
  def getUsageEndpoints(startDate: Long, endDate: Long): Option[List[String]] = {
    // create path and map variables
    val path = "/reporting/usage/endpoints".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    queryParams += "start_date" -> startDate.toString
    queryParams += "end_date" -> endDate.toString
    

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
