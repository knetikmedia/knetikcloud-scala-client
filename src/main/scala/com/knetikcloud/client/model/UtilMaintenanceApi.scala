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

import com.knetikcloud.client.model.Maintenance
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

class UtilMaintenanceApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  val helper = new UtilMaintenanceApiAsyncHelper(client, config)

  /**
   * Delete maintenance info
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
   * @return void
   */
  def deleteMaintenance() = {
    val await = Try(Await.result(deleteMaintenanceAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete maintenance info asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
   * @return Future(void)
  */
  def deleteMaintenanceAsync() = {
      helper.deleteMaintenance()
  }


  /**
   * Get current maintenance info
   * Get current maintenance info. 404 if no maintenance. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @return Maintenance
   */
  def getMaintenance(): Option[Maintenance] = {
    val await = Try(Await.result(getMaintenanceAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get current maintenance info asynchronously
   * Get current maintenance info. 404 if no maintenance. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @return Future(Maintenance)
  */
  def getMaintenanceAsync(): Future[Maintenance] = {
      helper.getMaintenance()
  }


  /**
   * Set current maintenance info
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
   * @param maintenance The maintenance object (optional)
   * @return void
   */
  def setMaintenance(maintenance: Option[Maintenance] = None) = {
    val await = Try(Await.result(setMaintenanceAsync(maintenance), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Set current maintenance info asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
   * @param maintenance The maintenance object (optional)
   * @return Future(void)
  */
  def setMaintenanceAsync(maintenance: Option[Maintenance] = None) = {
      helper.setMaintenance(maintenance)
  }


  /**
   * Update current maintenance info
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
   * @param maintenance The maintenance object (optional)
   * @return void
   */
  def updateMaintenance(maintenance: Option[Maintenance] = None) = {
    val await = Try(Await.result(updateMaintenanceAsync(maintenance), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update current maintenance info asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
   * @param maintenance The maintenance object (optional)
   * @return Future(void)
  */
  def updateMaintenanceAsync(maintenance: Option[Maintenance] = None) = {
      helper.updateMaintenance(maintenance)
  }


}

class UtilMaintenanceApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def deleteMaintenance()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/maintenance"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getMaintenance()(implicit reader: ClientResponseReader[Maintenance]): Future[Maintenance] = {
    // create path and map variables
    val path = (addFmt("/maintenance"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setMaintenance(maintenance: Option[Maintenance] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Maintenance]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/maintenance"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(maintenance))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateMaintenance(maintenance: Option[Maintenance] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Maintenance]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/maintenance"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(maintenance))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
