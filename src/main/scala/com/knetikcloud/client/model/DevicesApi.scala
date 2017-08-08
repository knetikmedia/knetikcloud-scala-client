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

import com.knetikcloud.client.model.DeviceResource
import com.knetikcloud.client.model.PageResourceDeviceResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.SimpleUserResource
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

class DevicesApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  val helper = new DevicesApiAsyncHelper(client, config)

  /**
   * Add device users
   * 
   * @param userResources userResources 
   * @param id id 
   * @return DeviceResource
   */
  def addDeviceUsers(userResources: List[SimpleUserResource], id: Integer): Option[DeviceResource] = {
    val await = Try(Await.result(addDeviceUsersAsync(userResources, id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add device users asynchronously
   * 
   * @param userResources userResources 
   * @param id id 
   * @return Future(DeviceResource)
  */
  def addDeviceUsersAsync(userResources: List[SimpleUserResource], id: Integer): Future[DeviceResource] = {
      helper.addDeviceUsers(userResources, id)
  }


  /**
   * Create a device
   * 
   * @param device device 
   * @return DeviceResource
   */
  def createDevice(device: DeviceResource): Option[DeviceResource] = {
    val await = Try(Await.result(createDeviceAsync(device), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a device asynchronously
   * 
   * @param device device 
   * @return Future(DeviceResource)
  */
  def createDeviceAsync(device: DeviceResource): Future[DeviceResource] = {
      helper.createDevice(device)
  }


  /**
   * Delete a device
   * 
   * @param id id 
   * @return void
   */
  def deleteDevice(id: Integer) = {
    val await = Try(Await.result(deleteDeviceAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a device asynchronously
   * 
   * @param id id 
   * @return Future(void)
  */
  def deleteDeviceAsync(id: Integer) = {
      helper.deleteDevice(id)
  }


  /**
   * Delete a device user
   * 
   * @param id The id of the device 
   * @param userId The user id of the device user 
   * @return void
   */
  def deleteDeviceUser(id: Integer, userId: Integer) = {
    val await = Try(Await.result(deleteDeviceUserAsync(id, userId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a device user asynchronously
   * 
   * @param id The id of the device 
   * @param userId The user id of the device user 
   * @return Future(void)
  */
  def deleteDeviceUserAsync(id: Integer, userId: Integer) = {
      helper.deleteDeviceUser(id, userId)
  }


  /**
   * Delete all device users
   * 
   * @param id The id of the device 
   * @param filterId Filter for device users to delete with a user id in a given comma separated list of ids (optional)
   * @return void
   */
  def deleteDeviceUsers(id: Integer, filterId: Option[String] = None) = {
    val await = Try(Await.result(deleteDeviceUsersAsync(id, filterId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete all device users asynchronously
   * 
   * @param id The id of the device 
   * @param filterId Filter for device users to delete with a user id in a given comma separated list of ids (optional)
   * @return Future(void)
  */
  def deleteDeviceUsersAsync(id: Integer, filterId: Option[String] = None) = {
      helper.deleteDeviceUsers(id, filterId)
  }


  /**
   * Get a single device
   * 
   * @param id id 
   * @return DeviceResource
   */
  def getDevice(id: Integer): Option[DeviceResource] = {
    val await = Try(Await.result(getDeviceAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single device asynchronously
   * 
   * @param id id 
   * @return Future(DeviceResource)
  */
  def getDeviceAsync(id: Integer): Future[DeviceResource] = {
      helper.getDevice(id)
  }


  /**
   * List and search devices
   * Get a list of devices with optional filtering
   * @param filterMake Filter for devices with specified make (optional)
   * @param filterModel Filter for devices with specified model (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceDeviceResource
   */
  def getDevices(filterMake: Option[String] = None, filterModel: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceDeviceResource] = {
    val await = Try(Await.result(getDevicesAsync(filterMake, filterModel, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search devices asynchronously
   * Get a list of devices with optional filtering
   * @param filterMake Filter for devices with specified make (optional)
   * @param filterModel Filter for devices with specified model (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceDeviceResource)
  */
  def getDevicesAsync(filterMake: Option[String] = None, filterModel: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceDeviceResource] = {
      helper.getDevices(filterMake, filterModel, size, page, order)
  }


  /**
   * Update a device
   * 
   * @param device device 
   * @param id id 
   * @return DeviceResource
   */
  def updateDevice(device: DeviceResource, id: Integer): Option[DeviceResource] = {
    val await = Try(Await.result(updateDeviceAsync(device, id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a device asynchronously
   * 
   * @param device device 
   * @param id id 
   * @return Future(DeviceResource)
  */
  def updateDeviceAsync(device: DeviceResource, id: Integer): Future[DeviceResource] = {
      helper.updateDevice(device, id)
  }


}

class DevicesApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addDeviceUsers(userResources: List[SimpleUserResource],
    id: Integer)(implicit reader: ClientResponseReader[DeviceResource], writer: RequestWriter[List[SimpleUserResource]]): Future[DeviceResource] = {
    // create path and map variables
    val path = (addFmt("/devices/{id}/users")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userResources == null) throw new Exception("Missing required parameter 'userResources' when calling DevicesApi->addDeviceUsers")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(userResources))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createDevice(device: DeviceResource)(implicit reader: ClientResponseReader[DeviceResource], writer: RequestWriter[DeviceResource]): Future[DeviceResource] = {
    // create path and map variables
    val path = (addFmt("/devices"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (device == null) throw new Exception("Missing required parameter 'device' when calling DevicesApi->createDevice")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(device))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteDevice(id: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/devices/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteDeviceUser(id: Integer,
    userId: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/devices/{id}/users/{user_id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString)
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteDeviceUsers(id: Integer,
    filterId: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/devices/{id}/users")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterId match {
      case Some(param) => queryParams += "filter_id" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDevice(id: Integer)(implicit reader: ClientResponseReader[DeviceResource]): Future[DeviceResource] = {
    // create path and map variables
    val path = (addFmt("/devices/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDevices(filterMake: Option[String] = None,
    filterModel: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceDeviceResource]): Future[PageResourceDeviceResource] = {
    // create path and map variables
    val path = (addFmt("/devices"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterMake match {
      case Some(param) => queryParams += "filter_make" -> param.toString
      case _ => queryParams
    }
    filterModel match {
      case Some(param) => queryParams += "filter_model" -> param.toString
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

  def updateDevice(device: DeviceResource,
    id: Integer)(implicit reader: ClientResponseReader[DeviceResource], writer: RequestWriter[DeviceResource]): Future[DeviceResource] = {
    // create path and map variables
    val path = (addFmt("/devices/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (device == null) throw new Exception("Missing required parameter 'device' when calling DevicesApi->updateDevice")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(device))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
