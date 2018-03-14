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

import com.knetikcloud.client.model.DispositionCount
import com.knetikcloud.client.model.DispositionResource
import com.knetikcloud.client.model.PageResourceDispositionResource
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

class DispositionsApi(val defBasePath: String = "https://jsapi-integration.us-east-1.elasticbeanstalk.com",
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
  val helper = new DispositionsApiAsyncHelper(client, config)

  /**
   * Add a new disposition
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DISPOSITIONS_USER and user, or DISPOSITIONS_ADMIN
   * @param disposition The new disposition record (optional)
   * @return DispositionResource
   */
  def addDisposition(disposition: Option[DispositionResource] = None): Option[DispositionResource] = {
    val await = Try(Await.result(addDispositionAsync(disposition), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a new disposition asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DISPOSITIONS_USER and user, or DISPOSITIONS_ADMIN
   * @param disposition The new disposition record (optional)
   * @return Future(DispositionResource)
  */
  def addDispositionAsync(disposition: Option[DispositionResource] = None): Future[DispositionResource] = {
      helper.addDisposition(disposition)
  }


  /**
   * Delete a disposition
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DISPOSITIONS_USER and owner, or DISPOSITIONS_ADMIN
   * @param id The id of the disposition record 
   * @return void
   */
  def deleteDisposition(id: Long) = {
    val await = Try(Await.result(deleteDispositionAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a disposition asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DISPOSITIONS_USER and owner, or DISPOSITIONS_ADMIN
   * @param id The id of the disposition record 
   * @return Future(void)
  */
  def deleteDispositionAsync(id: Long) = {
      helper.deleteDisposition(id)
  }


  /**
   * Returns a disposition
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the disposition record 
   * @return DispositionResource
   */
  def getDisposition(id: Long): Option[DispositionResource] = {
    val await = Try(Await.result(getDispositionAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Returns a disposition asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the disposition record 
   * @return Future(DispositionResource)
  */
  def getDispositionAsync(id: Long): Future[DispositionResource] = {
      helper.getDisposition(id)
  }


  /**
   * Returns a list of disposition counts
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterContext Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context&#x3D;video:47 (optional)
   * @param filterOwner Filter for dispositions from a specific user by id or &#39;me&#39; (optional)
   * @return List[DispositionCount]
   */
  def getDispositionCounts(filterContext: Option[String] = None, filterOwner: Option[String] = None): Option[List[DispositionCount]] = {
    val await = Try(Await.result(getDispositionCountsAsync(filterContext, filterOwner), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Returns a list of disposition counts asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterContext Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context&#x3D;video:47 (optional)
   * @param filterOwner Filter for dispositions from a specific user by id or &#39;me&#39; (optional)
   * @return Future(List[DispositionCount])
  */
  def getDispositionCountsAsync(filterContext: Option[String] = None, filterOwner: Option[String] = None): Future[List[DispositionCount]] = {
      helper.getDispositionCounts(filterContext, filterOwner)
  }


  /**
   * Returns a page of dispositions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterContext Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context&#x3D;video:47 (optional)
   * @param filterOwner Filter for dispositions from a specific user by id or &#39;me&#39; (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceDispositionResource
   */
  def getDispositions(filterContext: Option[String] = None, filterOwner: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceDispositionResource] = {
    val await = Try(Await.result(getDispositionsAsync(filterContext, filterOwner, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Returns a page of dispositions asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterContext Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context&#x3D;video:47 (optional)
   * @param filterOwner Filter for dispositions from a specific user by id or &#39;me&#39; (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceDispositionResource)
  */
  def getDispositionsAsync(filterContext: Option[String] = None, filterOwner: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceDispositionResource] = {
      helper.getDispositions(filterContext, filterOwner, size, page, order)
  }


}

class DispositionsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addDisposition(disposition: Option[DispositionResource] = None
    )(implicit reader: ClientResponseReader[DispositionResource], writer: RequestWriter[DispositionResource]): Future[DispositionResource] = {
    // create path and map variables
    val path = (addFmt("/dispositions"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(disposition))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteDisposition(id: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/dispositions/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDisposition(id: Long)(implicit reader: ClientResponseReader[DispositionResource]): Future[DispositionResource] = {
    // create path and map variables
    val path = (addFmt("/dispositions/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDispositionCounts(filterContext: Option[String] = None,
    filterOwner: Option[String] = None
    )(implicit reader: ClientResponseReader[List[DispositionCount]]): Future[List[DispositionCount]] = {
    // create path and map variables
    val path = (addFmt("/dispositions/count"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterContext match {
      case Some(param) => queryParams += "filter_context" -> param.toString
      case _ => queryParams
    }
    filterOwner match {
      case Some(param) => queryParams += "filter_owner" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDispositions(filterContext: Option[String] = None,
    filterOwner: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceDispositionResource]): Future[PageResourceDispositionResource] = {
    // create path and map variables
    val path = (addFmt("/dispositions"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterContext match {
      case Some(param) => queryParams += "filter_context" -> param.toString
      case _ => queryParams
    }
    filterOwner match {
      case Some(param) => queryParams += "filter_owner" -> param.toString
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


}
