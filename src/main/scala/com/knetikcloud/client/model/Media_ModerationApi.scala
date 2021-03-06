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

import com.knetikcloud.client.model.FlagReportResource
import com.knetikcloud.client.model.FlagResource
import com.knetikcloud.client.model.PageResourceFlagReportResource
import com.knetikcloud.client.model.PageResourceFlagResource
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

class Media_ModerationApi(val defBasePath: String = "https://jsapi-integration.us-east-1.elasticbeanstalk.com",
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
  val helper = new Media_ModerationApiAsyncHelper(client, config)

  /**
   * Add a flag
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param flagResource The flag resource object (optional)
   * @return FlagResource
   */
  def addFlag(flagResource: Option[FlagResource] = None): Option[FlagResource] = {
    val await = Try(Await.result(addFlagAsync(flagResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a flag asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param flagResource The flag resource object (optional)
   * @return Future(FlagResource)
  */
  def addFlagAsync(flagResource: Option[FlagResource] = None): Future[FlagResource] = {
      helper.addFlag(flagResource)
  }


  /**
   * Delete a flag
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN or owner
   * @param contextName The name of the context (optional)
   * @param contextId The id of the context (optional)
   * @param userId The id of the user (optional)
   * @return void
   */
  def deleteFlag(contextName: Option[String] = None, contextId: Option[String] = None, userId: Option[Integer] = None) = {
    val await = Try(Await.result(deleteFlagAsync(contextName, contextId, userId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a flag asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN or owner
   * @param contextName The name of the context (optional)
   * @param contextId The id of the context (optional)
   * @param userId The id of the user (optional)
   * @return Future(void)
  */
  def deleteFlagAsync(contextName: Option[String] = None, contextId: Option[String] = None, userId: Option[Integer] = None) = {
      helper.deleteFlag(contextName, contextId, userId)
  }


  /**
   * Returns a page of flags
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN or owner
   * @param filterContext Filter by flag context (optional)
   * @param filterContextId Filter by flag context ID (optional)
   * @param filterUserId Filter by user ID (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceFlagResource
   */
  def getFlags(filterContext: Option[String] = None, filterContextId: Option[String] = None, filterUserId: Option[Integer] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceFlagResource] = {
    val await = Try(Await.result(getFlagsAsync(filterContext, filterContextId, filterUserId, size, page), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Returns a page of flags asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN or owner
   * @param filterContext Filter by flag context (optional)
   * @param filterContextId Filter by flag context ID (optional)
   * @param filterUserId Filter by user ID (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Future(PageResourceFlagResource)
  */
  def getFlagsAsync(filterContext: Option[String] = None, filterContextId: Option[String] = None, filterUserId: Option[Integer] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Future[PageResourceFlagResource] = {
      helper.getFlags(filterContext, filterContextId, filterUserId, size, page)
  }


  /**
   * Get a flag report
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
   * @param id The flag report id 
   * @return FlagReportResource
   */
  def getModerationReport(id: Long): Option[FlagReportResource] = {
    val await = Try(Await.result(getModerationReportAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a flag report asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
   * @param id The flag report id 
   * @return Future(FlagReportResource)
  */
  def getModerationReportAsync(id: Long): Future[FlagReportResource] = {
      helper.getModerationReport(id)
  }


  /**
   * Returns a page of flag reports
   * Context can be either a free-form string or a pre-defined context name. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
   * @param excludeResolved Ignore resolved context (optional, default to true)
   * @param filterContext Filter by moderation context (optional)
   * @param filterContextId Filter by moderation context ID (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return PageResourceFlagReportResource
   */
  def getModerationReports(excludeResolved: Option[Boolean] /* = true*/, filterContext: Option[String] = None, filterContextId: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] = None): Option[PageResourceFlagReportResource] = {
    val await = Try(Await.result(getModerationReportsAsync(excludeResolved, filterContext, filterContextId, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Returns a page of flag reports asynchronously
   * Context can be either a free-form string or a pre-defined context name. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
   * @param excludeResolved Ignore resolved context (optional, default to true)
   * @param filterContext Filter by moderation context (optional)
   * @param filterContextId Filter by moderation context ID (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Future(PageResourceFlagReportResource)
  */
  def getModerationReportsAsync(excludeResolved: Option[Boolean] /* = true*/, filterContext: Option[String] = None, filterContextId: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] = None): Future[PageResourceFlagReportResource] = {
      helper.getModerationReports(excludeResolved, filterContext, filterContextId, size, page, order)
  }


  /**
   * Update a flag report
   * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
   * @param id The flag report id 
   * @param flagReportResource The new flag report (optional)
   * @return void
   */
  def updateModerationReport(id: Long, flagReportResource: Option[FlagReportResource] = None) = {
    val await = Try(Await.result(updateModerationReportAsync(id, flagReportResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a flag report asynchronously
   * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
   * @param id The flag report id 
   * @param flagReportResource The new flag report (optional)
   * @return Future(void)
  */
  def updateModerationReportAsync(id: Long, flagReportResource: Option[FlagReportResource] = None) = {
      helper.updateModerationReport(id, flagReportResource)
  }


}

class Media_ModerationApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addFlag(flagResource: Option[FlagResource] = None
    )(implicit reader: ClientResponseReader[FlagResource], writer: RequestWriter[FlagResource]): Future[FlagResource] = {
    // create path and map variables
    val path = (addFmt("/moderation/flags"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(flagResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteFlag(contextName: Option[String] = None,
    contextId: Option[String] = None,
    userId: Option[Integer] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/moderation/flags"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    contextName match {
      case Some(param) => queryParams += "context_name" -> param.toString
      case _ => queryParams
    }
    contextId match {
      case Some(param) => queryParams += "context_id" -> param.toString
      case _ => queryParams
    }
    userId match {
      case Some(param) => queryParams += "user_id" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFlags(filterContext: Option[String] = None,
    filterContextId: Option[String] = None,
    filterUserId: Option[Integer] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1)
    )(implicit reader: ClientResponseReader[PageResourceFlagResource]): Future[PageResourceFlagResource] = {
    // create path and map variables
    val path = (addFmt("/moderation/flags"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterContext match {
      case Some(param) => queryParams += "filter_context" -> param.toString
      case _ => queryParams
    }
    filterContextId match {
      case Some(param) => queryParams += "filter_context_id" -> param.toString
      case _ => queryParams
    }
    filterUserId match {
      case Some(param) => queryParams += "filter_user_id" -> param.toString
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

  def getModerationReport(id: Long)(implicit reader: ClientResponseReader[FlagReportResource]): Future[FlagReportResource] = {
    // create path and map variables
    val path = (addFmt("/moderation/reports/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getModerationReports(excludeResolved: Option[Boolean] = Some(true),
    filterContext: Option[String] = None,
    filterContextId: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = None
    )(implicit reader: ClientResponseReader[PageResourceFlagReportResource]): Future[PageResourceFlagReportResource] = {
    // create path and map variables
    val path = (addFmt("/moderation/reports"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    excludeResolved match {
      case Some(param) => queryParams += "exclude_resolved" -> param.toString
      case _ => queryParams
    }
    filterContext match {
      case Some(param) => queryParams += "filter_context" -> param.toString
      case _ => queryParams
    }
    filterContextId match {
      case Some(param) => queryParams += "filter_context_id" -> param.toString
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
    order match {
      case Some(param) => queryParams += "order" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateModerationReport(id: Long,
    flagReportResource: Option[FlagReportResource] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[FlagReportResource]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/moderation/reports/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(flagReportResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
