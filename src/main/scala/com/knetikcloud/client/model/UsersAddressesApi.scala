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

import com.knetikcloud.client.model.PageResourceSavedAddressResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.SavedAddressResource
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

class UsersAddressesApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  val helper = new UsersAddressesApiAsyncHelper(client, config)

  /**
   * Create a new address
   * 
   * @param userId The id of the user 
   * @param savedAddressResource The new address (optional)
   * @return SavedAddressResource
   */
  def createAddress(userId: String, savedAddressResource: Option[SavedAddressResource] = None): Option[SavedAddressResource] = {
    val await = Try(Await.result(createAddressAsync(userId, savedAddressResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a new address asynchronously
   * 
   * @param userId The id of the user 
   * @param savedAddressResource The new address (optional)
   * @return Future(SavedAddressResource)
  */
  def createAddressAsync(userId: String, savedAddressResource: Option[SavedAddressResource] = None): Future[SavedAddressResource] = {
      helper.createAddress(userId, savedAddressResource)
  }


  /**
   * Delete an address
   * 
   * @param userId The id of the user 
   * @param id The id of the address 
   * @return void
   */
  def deleteAddress(userId: String, id: Integer) = {
    val await = Try(Await.result(deleteAddressAsync(userId, id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete an address asynchronously
   * 
   * @param userId The id of the user 
   * @param id The id of the address 
   * @return Future(void)
  */
  def deleteAddressAsync(userId: String, id: Integer) = {
      helper.deleteAddress(userId, id)
  }


  /**
   * Get a single address
   * 
   * @param userId The id of the user 
   * @param id The id of the address 
   * @return SavedAddressResource
   */
  def getAddress(userId: String, id: Integer): Option[SavedAddressResource] = {
    val await = Try(Await.result(getAddressAsync(userId, id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single address asynchronously
   * 
   * @param userId The id of the user 
   * @param id The id of the address 
   * @return Future(SavedAddressResource)
  */
  def getAddressAsync(userId: String, id: Integer): Future[SavedAddressResource] = {
      helper.getAddress(userId, id)
  }


  /**
   * List and search addresses
   * 
   * @param userId The id of the user 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceSavedAddressResource
   */
  def getAddresses(userId: String, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceSavedAddressResource] = {
    val await = Try(Await.result(getAddressesAsync(userId, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search addresses asynchronously
   * 
   * @param userId The id of the user 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceSavedAddressResource)
  */
  def getAddressesAsync(userId: String, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceSavedAddressResource] = {
      helper.getAddresses(userId, size, page, order)
  }


  /**
   * Update an address
   * 
   * @param userId The id of the user 
   * @param id The id of the address 
   * @param savedAddressResource The saved address resource object (optional)
   * @return SavedAddressResource
   */
  def updateAddress(userId: String, id: Integer, savedAddressResource: Option[SavedAddressResource] = None): Option[SavedAddressResource] = {
    val await = Try(Await.result(updateAddressAsync(userId, id, savedAddressResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update an address asynchronously
   * 
   * @param userId The id of the user 
   * @param id The id of the address 
   * @param savedAddressResource The saved address resource object (optional)
   * @return Future(SavedAddressResource)
  */
  def updateAddressAsync(userId: String, id: Integer, savedAddressResource: Option[SavedAddressResource] = None): Future[SavedAddressResource] = {
      helper.updateAddress(userId, id, savedAddressResource)
  }


}

class UsersAddressesApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createAddress(userId: String,
    savedAddressResource: Option[SavedAddressResource] = None
    )(implicit reader: ClientResponseReader[SavedAddressResource], writer: RequestWriter[SavedAddressResource]): Future[SavedAddressResource] = {
    // create path and map variables
    val path = (addFmt("/users/{user_id}/addresses")
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersAddressesApi->createAddress")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(savedAddressResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAddress(userId: String,
    id: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/users/{user_id}/addresses/{id}")
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString)
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersAddressesApi->deleteAddress")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAddress(userId: String,
    id: Integer)(implicit reader: ClientResponseReader[SavedAddressResource]): Future[SavedAddressResource] = {
    // create path and map variables
    val path = (addFmt("/users/{user_id}/addresses/{id}")
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString)
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersAddressesApi->getAddress")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAddresses(userId: String,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceSavedAddressResource]): Future[PageResourceSavedAddressResource] = {
    // create path and map variables
    val path = (addFmt("/users/{user_id}/addresses")
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersAddressesApi->getAddresses")

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

  def updateAddress(userId: String,
    id: Integer,
    savedAddressResource: Option[SavedAddressResource] = None
    )(implicit reader: ClientResponseReader[SavedAddressResource], writer: RequestWriter[SavedAddressResource]): Future[SavedAddressResource] = {
    // create path and map variables
    val path = (addFmt("/users/{user_id}/addresses/{id}")
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString)
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling UsersAddressesApi->updateAddress")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(savedAddressResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
