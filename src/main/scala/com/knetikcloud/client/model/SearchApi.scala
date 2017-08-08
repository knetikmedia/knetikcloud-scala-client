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

import com.knetikcloud.client.model.PageResourceMapstringobject
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.SearchReferenceMapping
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

class SearchApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  val helper = new SearchApiAsyncHelper(client, config)

  /**
   * Add a new object to an index
   * Mainly intended for internal use.
   * @param _type The index type 
   * @param id The ID of the object 
   * @param _object The object to add (optional)
   * @return void
   */
  def addSearchIndex(_type: String, id: String, _object: Option[Any] = None) = {
    val await = Try(Await.result(addSearchIndexAsync(_type, id, _object), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a new object to an index asynchronously
   * Mainly intended for internal use.
   * @param _type The index type 
   * @param id The ID of the object 
   * @param _object The object to add (optional)
   * @return Future(void)
  */
  def addSearchIndexAsync(_type: String, id: String, _object: Option[Any] = None) = {
      helper.addSearchIndex(_type, id, _object)
  }


  /**
   * Register reference mappings
   * Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.
   * @param mappings The mappings to add (optional)
   * @return void
   */
  def addSearchMappings(mappings: Option[List[SearchReferenceMapping]] = None) = {
    val await = Try(Await.result(addSearchMappingsAsync(mappings), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Register reference mappings asynchronously
   * Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.
   * @param mappings The mappings to add (optional)
   * @return Future(void)
  */
  def addSearchMappingsAsync(mappings: Option[List[SearchReferenceMapping]] = None) = {
      helper.addSearchMappings(mappings)
  }


  /**
   * Delete an object
   * Mainly intended for internal use. Requires SEARCH_ADMIN.
   * @param _type The index type 
   * @param id The ID of the object to delete 
   * @return void
   */
  def deleteSearchIndex(_type: String, id: String) = {
    val await = Try(Await.result(deleteSearchIndexAsync(_type, id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete an object asynchronously
   * Mainly intended for internal use. Requires SEARCH_ADMIN.
   * @param _type The index type 
   * @param id The ID of the object to delete 
   * @return Future(void)
  */
  def deleteSearchIndexAsync(_type: String, id: String) = {
      helper.deleteSearchIndex(_type, id)
  }


  /**
   * Delete all objects in an index
   * Mainly intended for internal use
   * @param _type The index type 
   * @return void
   */
  def deleteSearchIndexes(_type: String) = {
    val await = Try(Await.result(deleteSearchIndexesAsync(_type), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete all objects in an index asynchronously
   * Mainly intended for internal use
   * @param _type The index type 
   * @return Future(void)
  */
  def deleteSearchIndexesAsync(_type: String) = {
      helper.deleteSearchIndexes(_type)
  }


  /**
   * Search an index
   * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.
   * @param _type The index type 
   * @param query The query to be used for the search (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceMapstringobject
   */
  def searchIndex(_type: String, query: Option[Any] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceMapstringobject] = {
    val await = Try(Await.result(searchIndexAsync(_type, query, size, page), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Search an index asynchronously
   * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.
   * @param _type The index type 
   * @param query The query to be used for the search (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Future(PageResourceMapstringobject)
  */
  def searchIndexAsync(_type: String, query: Option[Any] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Future[PageResourceMapstringobject] = {
      helper.searchIndex(_type, query, size, page)
  }


}

class SearchApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addSearchIndex(_type: String,
    id: String,
    _object: Option[Any] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Any]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/search/index/{type}/{id}")
      replaceAll ("\\{" + "type" + "\\}",_type.toString)
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (_type == null) throw new Exception("Missing required parameter '_type' when calling SearchApi->addSearchIndex")

    if (id == null) throw new Exception("Missing required parameter 'id' when calling SearchApi->addSearchIndex")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(_object))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def addSearchMappings(mappings: Option[List[SearchReferenceMapping]] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[SearchReferenceMapping]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/search/mappings"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(mappings))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteSearchIndex(_type: String,
    id: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/search/index/{type}/{id}")
      replaceAll ("\\{" + "type" + "\\}",_type.toString)
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (_type == null) throw new Exception("Missing required parameter '_type' when calling SearchApi->deleteSearchIndex")

    if (id == null) throw new Exception("Missing required parameter 'id' when calling SearchApi->deleteSearchIndex")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteSearchIndexes(_type: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/search/index/{type}")
      replaceAll ("\\{" + "type" + "\\}",_type.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (_type == null) throw new Exception("Missing required parameter '_type' when calling SearchApi->deleteSearchIndexes")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def searchIndex(_type: String,
    query: Option[Any] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1)
    )(implicit reader: ClientResponseReader[PageResourceMapstringobject], writer: RequestWriter[Any]): Future[PageResourceMapstringobject] = {
    // create path and map variables
    val path = (addFmt("/search/index/{type}")
      replaceAll ("\\{" + "type" + "\\}",_type.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (_type == null) throw new Exception("Missing required parameter '_type' when calling SearchApi->searchIndex")

    size match {
      case Some(param) => queryParams += "size" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(query))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
