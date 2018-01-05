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

import com.knetikcloud.client.model.OptimalPaymentRequest
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

class PaymentsOptimalApi(val defBasePath: String = "https://devsandbox.knetikcloud.com",
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
  val helper = new PaymentsOptimalApiAsyncHelper(client, config)

  /**
   * Initiate silent post with Optimal
   * Will return the url for a hosted payment endpoint to post to. See Optimal documentation for details.
   * @param request The payment request to initiate (optional)
   * @return String
   */
  def silentPostOptimal(request: Option[OptimalPaymentRequest] = None): Option[String] = {
    val await = Try(Await.result(silentPostOptimalAsync(request), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Initiate silent post with Optimal asynchronously
   * Will return the url for a hosted payment endpoint to post to. See Optimal documentation for details.
   * @param request The payment request to initiate (optional)
   * @return Future(String)
  */
  def silentPostOptimalAsync(request: Option[OptimalPaymentRequest] = None): Future[String] = {
      helper.silentPostOptimal(request)
  }


}

class PaymentsOptimalApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def silentPostOptimal(request: Option[OptimalPaymentRequest] = None
    )(implicit reader: ClientResponseReader[String], writer: RequestWriter[OptimalPaymentRequest]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/payment/provider/optimal/silent"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(request))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
