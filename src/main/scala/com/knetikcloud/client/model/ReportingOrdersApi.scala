/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.knetikcloud.client.model

import java.text.SimpleDateFormat

import com.knetikcloud.client.model.PageResourceAggregateInvoiceReportResource
import com.knetikcloud.client.model.Result
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

class ReportingOrdersApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {

  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+0000")
  }
  implicit val stringReader = ClientResponseReaders.StringReader
  implicit val unitReader = ClientResponseReaders.UnitReader
  implicit val jvalueReader = ClientResponseReaders.JValueReader
  implicit val jsonReader = JsonFormatsReader
  implicit val stringWriter = RequestWriters.StringWriter
  implicit val jsonWriter = JsonFormatsWriter

  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value

  val config = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new ReportingOrdersApiAsyncHelper(client, config)

  /**
   * Retrieve invoice counts aggregated by time ranges
   * 
   * @param currencyCode The code for a currency to get sales data for 
   * @param granularity The time duration to aggregate by (optional, default to day)
   * @param filterPaymentStatus A payment status to filter results by, can be a comma separated list (optional)
   * @param filterFulfillmentStatus An invoice fulfillment status to filter results by, can be a comma separated list (optional)
   * @param startDate The start of the time range to return, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to return, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @return PageResourceAggregateInvoiceReportResource
   */
  def getInvoiceReports(currencyCode: String, granularity: Option[String] /* = day*/, filterPaymentStatus: Option[String] = None, filterFulfillmentStatus: Option[String] = None, startDate: Option[Long] = None, endDate: Option[Long] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceAggregateInvoiceReportResource] = {
    val await = Try(Await.result(getInvoiceReportsAsync(currencyCode, granularity, filterPaymentStatus, filterFulfillmentStatus, startDate, endDate, size, page), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Retrieve invoice counts aggregated by time ranges asynchronously
   * 
   * @param currencyCode The code for a currency to get sales data for 
   * @param granularity The time duration to aggregate by (optional, default to day)
   * @param filterPaymentStatus A payment status to filter results by, can be a comma separated list (optional)
   * @param filterFulfillmentStatus An invoice fulfillment status to filter results by, can be a comma separated list (optional)
   * @param startDate The start of the time range to return, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to return, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @return Future(PageResourceAggregateInvoiceReportResource)
  */
  def getInvoiceReportsAsync(currencyCode: String, granularity: Option[String] /* = day*/, filterPaymentStatus: Option[String] = None, filterFulfillmentStatus: Option[String] = None, startDate: Option[Long] = None, endDate: Option[Long] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Future[PageResourceAggregateInvoiceReportResource] = {
      helper.getInvoiceReports(currencyCode, granularity, filterPaymentStatus, filterFulfillmentStatus, startDate, endDate, size, page)
  }


}

class ReportingOrdersApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getInvoiceReports(currencyCode: String,
    granularity: Option[String] = Some(day),
    filterPaymentStatus: Option[String] = None,
    filterFulfillmentStatus: Option[String] = None,
    startDate: Option[Long] = None,
    endDate: Option[Long] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1)
    )(implicit reader: ClientResponseReader[PageResourceAggregateInvoiceReportResource]): Future[PageResourceAggregateInvoiceReportResource] = {
    // create path and map variables
    val path = (addFmt("/reporting/orders/count/{currency_code}")
      replaceAll ("\\{" + "currency_code" + "\\}",currencyCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currencyCode == null) throw new Exception("Missing required parameter 'currencyCode' when calling ReportingOrdersApi->getInvoiceReports")

    granularity match {
      case Some(param) => queryParams += "granularity" -> param.toString
      case _ => queryParams
    }
    filterPaymentStatus match {
      case Some(param) => queryParams += "filter_payment_status" -> param.toString
      case _ => queryParams
    }
    filterFulfillmentStatus match {
      case Some(param) => queryParams += "filter_fulfillment_status" -> param.toString
      case _ => queryParams
    }
    startDate match {
      case Some(param) => queryParams += "start_date" -> param.toString
      case _ => queryParams
    }
    endDate match {
      case Some(param) => queryParams += "end_date" -> param.toString
      case _ => queryParams
    }
    size match {
      case Some(param) => queryParams += "size" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
