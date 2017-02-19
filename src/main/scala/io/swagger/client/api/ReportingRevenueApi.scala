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

import io.swagger.client.model.PageResourceRevenueCountryReportResource
import io.swagger.client.model.PageResourceRevenueProductReportResource
import io.swagger.client.model.Result
import io.swagger.client.model.RevenueReportResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ReportingRevenueApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Get item revenue info
   * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range
   * @param currencyCode The code for a currency to get sales data for 
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @return RevenueReportResource
   */
  def getItemRevenue(currencyCode: String, startDate: Option[Long] = None, endDate: Option[Long] = None): Option[RevenueReportResource] = {
    // create path and map variables
    val path = "/reporting/revenue/item-sales/{currency_code}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "currency_code" + "\\}",apiInvoker.escape(currencyCode))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (currencyCode == null) throw new Exception("Missing required parameter 'currencyCode' when calling ReportingRevenueApi->getItemRevenue")

    startDate.map(paramVal => queryParams += "start_date" -> paramVal.toString)
    endDate.map(paramVal => queryParams += "end_date" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[RevenueReportResource]).asInstanceOf[RevenueReportResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get refund revenue info
   * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
   * @param currencyCode The code for a currency to get refund data for 
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @return RevenueReportResource
   */
  def getRefundRevenue(currencyCode: String, startDate: Option[Long] = None, endDate: Option[Long] = None): Option[RevenueReportResource] = {
    // create path and map variables
    val path = "/reporting/revenue/refunds/{currency_code}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "currency_code" + "\\}",apiInvoker.escape(currencyCode))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (currencyCode == null) throw new Exception("Missing required parameter 'currencyCode' when calling ReportingRevenueApi->getRefundRevenue")

    startDate.map(paramVal => queryParams += "start_date" -> paramVal.toString)
    endDate.map(paramVal => queryParams += "end_date" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[RevenueReportResource]).asInstanceOf[RevenueReportResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get revenue info by country
   * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
   * @param currencyCode The code for a currency to get sales data for 
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceRevenueCountryReportResource
   */
  def getRevenueByCountry(currencyCode: String, startDate: Option[Long] = None, endDate: Option[Long] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceRevenueCountryReportResource] = {
    // create path and map variables
    val path = "/reporting/revenue/countries/{currency_code}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "currency_code" + "\\}",apiInvoker.escape(currencyCode))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (currencyCode == null) throw new Exception("Missing required parameter 'currencyCode' when calling ReportingRevenueApi->getRevenueByCountry")

    startDate.map(paramVal => queryParams += "start_date" -> paramVal.toString)
    endDate.map(paramVal => queryParams += "end_date" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceRevenueCountryReportResource]).asInstanceOf[PageResourceRevenueCountryReportResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get revenue info by item
   * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
   * @param currencyCode The code for a currency to get sales data for 
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceRevenueProductReportResource
   */
  def getRevenueByItem(currencyCode: String, startDate: Option[Long] = None, endDate: Option[Long] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceRevenueProductReportResource] = {
    // create path and map variables
    val path = "/reporting/revenue/products/{currency_code}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "currency_code" + "\\}",apiInvoker.escape(currencyCode))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (currencyCode == null) throw new Exception("Missing required parameter 'currencyCode' when calling ReportingRevenueApi->getRevenueByItem")

    startDate.map(paramVal => queryParams += "start_date" -> paramVal.toString)
    endDate.map(paramVal => queryParams += "end_date" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceRevenueProductReportResource]).asInstanceOf[PageResourceRevenueProductReportResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get subscription revenue info
   * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
   * @param currencyCode The code for a currency to get sales data for 
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @return RevenueReportResource
   */
  def getSubscriptionRevenue(currencyCode: String, startDate: Option[Long] = None, endDate: Option[Long] = None): Option[RevenueReportResource] = {
    // create path and map variables
    val path = "/reporting/revenue/subscription-sales/{currency_code}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "currency_code" + "\\}",apiInvoker.escape(currencyCode))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (currencyCode == null) throw new Exception("Missing required parameter 'currencyCode' when calling ReportingRevenueApi->getSubscriptionRevenue")

    startDate.map(paramVal => queryParams += "start_date" -> paramVal.toString)
    endDate.map(paramVal => queryParams += "end_date" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[RevenueReportResource]).asInstanceOf[RevenueReportResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
