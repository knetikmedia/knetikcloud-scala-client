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

import com.knetikcloud.client.model.ApplyPaymentRequest
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

class Payments_AppleApi(val defBasePath: String = "https://jsapi-integration.us-east-1.elasticbeanstalk.com",
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
  val helper = new Payments_AppleApiAsyncHelper(client, config)

  /**
   * Pay invoice with Apple receipt
   * Mark an invoice paid using Apple payment receipt. A receipt will only be accepted once and the details of the transaction must match the invoice, including the product_id matching the sku text of the item in the invoice. Returns the transaction ID if successful. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param request The request for paying an invoice through an Apple receipt (optional)
   * @return String
   */
  def verifyAppleReceipt(request: Option[ApplyPaymentRequest] = None): Option[String] = {
    val await = Try(Await.result(verifyAppleReceiptAsync(request), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Pay invoice with Apple receipt asynchronously
   * Mark an invoice paid using Apple payment receipt. A receipt will only be accepted once and the details of the transaction must match the invoice, including the product_id matching the sku text of the item in the invoice. Returns the transaction ID if successful. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param request The request for paying an invoice through an Apple receipt (optional)
   * @return Future(String)
  */
  def verifyAppleReceiptAsync(request: Option[ApplyPaymentRequest] = None): Future[String] = {
      helper.verifyAppleReceipt(request)
  }


}

class Payments_AppleApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def verifyAppleReceipt(request: Option[ApplyPaymentRequest] = None
    )(implicit reader: ClientResponseReader[String], writer: RequestWriter[ApplyPaymentRequest]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/payment/provider/apple/receipt"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(request))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}