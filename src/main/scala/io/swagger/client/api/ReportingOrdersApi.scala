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

import io.swagger.client.model.PageResourceAggregateInvoiceReportResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ReportingOrdersApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Retrieve invoice counts aggregated by time ranges
   * 
   * @param currencyCode The code for a currency to get sales data for 
   * @param granularity The time duration to aggregate by (optional, default to day)
   * @param filterPaymentStatus A payment status to filter results by, can be a comma separated list (optional)
   * @param filterFulfillmentStatus An invoice fulfillment status to filter results by, can be a comma separated list (optional)
   * @param startDate The start of the time range to return, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to return, unix timestamp in seconds. Default is end of time (optional)
   * @return PageResourceAggregateInvoiceReportResource
   */
  def getDailyInvoicesUsingGET(currencyCode: String, granularity: Option[String] /* = day*/, filterPaymentStatus: Option[String] = None, filterFulfillmentStatus: Option[String] = None, startDate: Option[Long] = None, endDate: Option[Long] = None): Option[PageResourceAggregateInvoiceReportResource] = {
    // create path and map variables
    val path = "/reporting/orders/count/{currency_code}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "currency_code" + "\\}",apiInvoker.escape(currencyCode))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (currencyCode == null) throw new Exception("Missing required parameter 'currencyCode' when calling ReportingOrdersApi->getDailyInvoicesUsingGET")

    granularity.map(paramVal => queryParams += "granularity" -> paramVal.toString)
    filterPaymentStatus.map(paramVal => queryParams += "filter_payment_status" -> paramVal.toString)
    filterFulfillmentStatus.map(paramVal => queryParams += "filter_fulfillment_status" -> paramVal.toString)
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
           Some(ApiInvoker.deserialize(s, "", classOf[PageResourceAggregateInvoiceReportResource]).asInstanceOf[PageResourceAggregateInvoiceReportResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
