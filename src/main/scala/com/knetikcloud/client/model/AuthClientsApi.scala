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

import com.knetikcloud.client.model.ClientResource
import com.knetikcloud.client.model.GrantTypeResource
import com.knetikcloud.client.model.PageResourceClientResource
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

class AuthClientsApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  val helper = new AuthClientsApiAsyncHelper(client, config)

  /**
   * Create a new client
   * 
   * @param clientResource The client resource object (optional)
   * @return ClientResource
   */
  def createClient(clientResource: Option[ClientResource] = None): Option[ClientResource] = {
    val await = Try(Await.result(createClientAsync(clientResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a new client asynchronously
   * 
   * @param clientResource The client resource object (optional)
   * @return Future(ClientResource)
  */
  def createClientAsync(clientResource: Option[ClientResource] = None): Future[ClientResource] = {
      helper.createClient(clientResource)
  }


  /**
   * Delete a client
   * 
   * @param clientKey The key of the client 
   * @return void
   */
  def deleteClient(clientKey: String) = {
    val await = Try(Await.result(deleteClientAsync(clientKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a client asynchronously
   * 
   * @param clientKey The key of the client 
   * @return Future(void)
  */
  def deleteClientAsync(clientKey: String) = {
      helper.deleteClient(clientKey)
  }


  /**
   * Get a single client
   * 
   * @param clientKey The key of the client 
   * @return ClientResource
   */
  def getClient(clientKey: String): Option[ClientResource] = {
    val await = Try(Await.result(getClientAsync(clientKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single client asynchronously
   * 
   * @param clientKey The key of the client 
   * @return Future(ClientResource)
  */
  def getClientAsync(clientKey: String): Future[ClientResource] = {
      helper.getClient(clientKey)
  }


  /**
   * List available client grant types
   * 
   * @return List[GrantTypeResource]
   */
  def getClientGrantTypes(): Option[List[GrantTypeResource]] = {
    val await = Try(Await.result(getClientGrantTypesAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List available client grant types asynchronously
   * 
   * @return Future(List[GrantTypeResource])
  */
  def getClientGrantTypesAsync(): Future[List[GrantTypeResource]] = {
      helper.getClientGrantTypes()
  }


  /**
   * List and search clients
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceClientResource
   */
  def getClients(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceClientResource] = {
    val await = Try(Await.result(getClientsAsync(size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search clients asynchronously
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceClientResource)
  */
  def getClientsAsync(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceClientResource] = {
      helper.getClients(size, page, order)
  }


  /**
   * Set grant types for a client
   * 
   * @param clientKey The key of the client 
   * @param grantList A list of unique grant types (optional)
   * @return void
   */
  def setClientGrantTypes(clientKey: String, grantList: Option[List[String]] = None) = {
    val await = Try(Await.result(setClientGrantTypesAsync(clientKey, grantList), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Set grant types for a client asynchronously
   * 
   * @param clientKey The key of the client 
   * @param grantList A list of unique grant types (optional)
   * @return Future(void)
  */
  def setClientGrantTypesAsync(clientKey: String, grantList: Option[List[String]] = None) = {
      helper.setClientGrantTypes(clientKey, grantList)
  }


  /**
   * Set redirect uris for a client
   * 
   * @param clientKey The key of the client 
   * @param redirectList A list of unique redirect uris (optional)
   * @return void
   */
  def setClientRedirectUris(clientKey: String, redirectList: Option[List[String]] = None) = {
    val await = Try(Await.result(setClientRedirectUrisAsync(clientKey, redirectList), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Set redirect uris for a client asynchronously
   * 
   * @param clientKey The key of the client 
   * @param redirectList A list of unique redirect uris (optional)
   * @return Future(void)
  */
  def setClientRedirectUrisAsync(clientKey: String, redirectList: Option[List[String]] = None) = {
      helper.setClientRedirectUris(clientKey, redirectList)
  }


  /**
   * Update a client
   * 
   * @param clientKey The key of the client 
   * @param clientResource The client resource object (optional)
   * @return ClientResource
   */
  def updateClient(clientKey: String, clientResource: Option[ClientResource] = None): Option[ClientResource] = {
    val await = Try(Await.result(updateClientAsync(clientKey, clientResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a client asynchronously
   * 
   * @param clientKey The key of the client 
   * @param clientResource The client resource object (optional)
   * @return Future(ClientResource)
  */
  def updateClientAsync(clientKey: String, clientResource: Option[ClientResource] = None): Future[ClientResource] = {
      helper.updateClient(clientKey, clientResource)
  }


}

class AuthClientsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createClient(clientResource: Option[ClientResource] = None
    )(implicit reader: ClientResponseReader[ClientResource], writer: RequestWriter[ClientResource]): Future[ClientResource] = {
    // create path and map variables
    val path = (addFmt("/auth/clients"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(clientResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteClient(clientKey: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/auth/clients/{client_key}")
      replaceAll ("\\{" + "client_key" + "\\}",clientKey.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (clientKey == null) throw new Exception("Missing required parameter 'clientKey' when calling AuthClientsApi->deleteClient")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getClient(clientKey: String)(implicit reader: ClientResponseReader[ClientResource]): Future[ClientResource] = {
    // create path and map variables
    val path = (addFmt("/auth/clients/{client_key}")
      replaceAll ("\\{" + "client_key" + "\\}",clientKey.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (clientKey == null) throw new Exception("Missing required parameter 'clientKey' when calling AuthClientsApi->getClient")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getClientGrantTypes()(implicit reader: ClientResponseReader[List[GrantTypeResource]]): Future[List[GrantTypeResource]] = {
    // create path and map variables
    val path = (addFmt("/auth/clients/grant-types"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getClients(size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceClientResource]): Future[PageResourceClientResource] = {
    // create path and map variables
    val path = (addFmt("/auth/clients"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

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

  def setClientGrantTypes(clientKey: String,
    grantList: Option[List[String]] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[String]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/auth/clients/{client_key}/grant-types")
      replaceAll ("\\{" + "client_key" + "\\}",clientKey.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (clientKey == null) throw new Exception("Missing required parameter 'clientKey' when calling AuthClientsApi->setClientGrantTypes")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(grantList))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setClientRedirectUris(clientKey: String,
    redirectList: Option[List[String]] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[String]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/auth/clients/{client_key}/redirect-uris")
      replaceAll ("\\{" + "client_key" + "\\}",clientKey.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (clientKey == null) throw new Exception("Missing required parameter 'clientKey' when calling AuthClientsApi->setClientRedirectUris")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(redirectList))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateClient(clientKey: String,
    clientResource: Option[ClientResource] = None
    )(implicit reader: ClientResponseReader[ClientResource], writer: RequestWriter[ClientResource]): Future[ClientResource] = {
    // create path and map variables
    val path = (addFmt("/auth/clients/{client_key}")
      replaceAll ("\\{" + "client_key" + "\\}",clientKey.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (clientKey == null) throw new Exception("Missing required parameter 'clientKey' when calling AuthClientsApi->updateClient")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(clientResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
