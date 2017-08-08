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

import com.knetikcloud.client.model.AmazonS3Activity
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

class AmazonWebServicesS3Api(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  val helper = new AmazonWebServicesS3ApiAsyncHelper(client, config)

  /**
   * Get a signed S3 URL
   * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)
   * @param filename The file name (optional)
   * @param _contentType The content type (optional)
   * @return AmazonS3Activity
   */
  def getSignedS3URL(filename: Option[String] = None, _contentType: Option[String] = None): Option[AmazonS3Activity] = {
    val await = Try(Await.result(getSignedS3URLAsync(filename, _contentType), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a signed S3 URL asynchronously
   * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)
   * @param filename The file name (optional)
   * @param _contentType The content type (optional)
   * @return Future(AmazonS3Activity)
  */
  def getSignedS3URLAsync(filename: Option[String] = None, _contentType: Option[String] = None): Future[AmazonS3Activity] = {
      helper.getSignedS3URL(filename, _contentType)
  }


}

class AmazonWebServicesS3ApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getSignedS3URL(filename: Option[String] = None,
    _contentType: Option[String] = None
    )(implicit reader: ClientResponseReader[AmazonS3Activity]): Future[AmazonS3Activity] = {
    // create path and map variables
    val path = (addFmt("/amazon/s3/signedposturl"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filename match {
      case Some(param) => queryParams += "filename" -> param.toString
      case _ => queryParams
    }
    _contentType match {
      case Some(param) => queryParams += "content_type" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
