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

import com.knetikcloud.client.model.Config
import com.knetikcloud.client.model.PageResourceConfig
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

class ConfigsApi(val defBasePath: String = "https://jsapi-integration.us-east-1.elasticbeanstalk.com",
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
  val helper = new ConfigsApiAsyncHelper(client, config)

  /**
   * Create a new config
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
   * @param config The config object (optional)
   * @return Config
   */
  def createConfig(config: Option[Config] = None): Option[Config] = {
    val await = Try(Await.result(createConfigAsync(config), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a new config asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
   * @param config The config object (optional)
   * @return Future(Config)
  */
  def createConfigAsync(config: Option[Config] = None): Future[Config] = {
      helper.createConfig(config)
  }


  /**
   * Delete an existing config
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
   * @param name The config name 
   * @return void
   */
  def deleteConfig(name: String) = {
    val await = Try(Await.result(deleteConfigAsync(name), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete an existing config asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
   * @param name The config name 
   * @return Future(void)
  */
  def deleteConfigAsync(name: String) = {
      helper.deleteConfig(name)
  }


  /**
   * Get a single config
   * Only configs that are public readable will be shown without admin access. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param name The config name 
   * @return Config
   */
  def getConfig(name: String): Option[Config] = {
    val await = Try(Await.result(getConfigAsync(name), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single config asynchronously
   * Only configs that are public readable will be shown without admin access. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param name The config name 
   * @return Future(Config)
  */
  def getConfigAsync(name: String): Future[Config] = {
      helper.getConfig(name)
  }


  /**
   * List and search configs
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterSearch Filter for configs whose name contains the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return PageResourceConfig
   */
  def getConfigs(filterSearch: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] = None): Option[PageResourceConfig] = {
    val await = Try(Await.result(getConfigsAsync(filterSearch, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search configs asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterSearch Filter for configs whose name contains the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Future(PageResourceConfig)
  */
  def getConfigsAsync(filterSearch: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] = None): Future[PageResourceConfig] = {
      helper.getConfigs(filterSearch, size, page, order)
  }


  /**
   * Update an existing config
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
   * @param name The config name 
   * @param config The config object (optional)
   * @return void
   */
  def updateConfig(name: String, config: Option[Config] = None) = {
    val await = Try(Await.result(updateConfigAsync(name, config), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update an existing config asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
   * @param name The config name 
   * @param config The config object (optional)
   * @return Future(void)
  */
  def updateConfigAsync(name: String, config: Option[Config] = None) = {
      helper.updateConfig(name, config)
  }


}

class ConfigsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createConfig(config: Option[Config] = None
    )(implicit reader: ClientResponseReader[Config], writer: RequestWriter[Config]): Future[Config] = {
    // create path and map variables
    val path = (addFmt("/configs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(config))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteConfig(name: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/configs/{name}")
      replaceAll ("\\{" + "name" + "\\}",name.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling ConfigsApi->deleteConfig")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getConfig(name: String)(implicit reader: ClientResponseReader[Config]): Future[Config] = {
    // create path and map variables
    val path = (addFmt("/configs/{name}")
      replaceAll ("\\{" + "name" + "\\}",name.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling ConfigsApi->getConfig")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getConfigs(filterSearch: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = None
    )(implicit reader: ClientResponseReader[PageResourceConfig]): Future[PageResourceConfig] = {
    // create path and map variables
    val path = (addFmt("/configs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterSearch match {
      case Some(param) => queryParams += "filter_search" -> param.toString
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

  def updateConfig(name: String,
    config: Option[Config] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Config]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/configs/{name}")
      replaceAll ("\\{" + "name" + "\\}",name.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling ConfigsApi->updateConfig")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(config))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
