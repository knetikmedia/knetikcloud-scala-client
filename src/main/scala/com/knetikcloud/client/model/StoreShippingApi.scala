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

import com.knetikcloud.client.model.ItemTemplateResource
import com.knetikcloud.client.model.PageResourceItemTemplateResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.ShippingItem
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

class StoreShippingApi(val defBasePath: String = "https://devsandbox.knetikcloud.com",
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
  val helper = new StoreShippingApiAsyncHelper(client, config)

  /**
   * Create a shipping item
   * A shipping item represents a shipping option and cost. SKUs have to be unique in the entire store.
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param shippingItem The shipping item object (optional)
   * @return ShippingItem
   */
  def createShippingItem(cascade: Option[Boolean] /* = false*/, shippingItem: Option[ShippingItem] = None): Option[ShippingItem] = {
    val await = Try(Await.result(createShippingItemAsync(cascade, shippingItem), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a shipping item asynchronously
   * A shipping item represents a shipping option and cost. SKUs have to be unique in the entire store.
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param shippingItem The shipping item object (optional)
   * @return Future(ShippingItem)
  */
  def createShippingItemAsync(cascade: Option[Boolean] /* = false*/, shippingItem: Option[ShippingItem] = None): Future[ShippingItem] = {
      helper.createShippingItem(cascade, shippingItem)
  }


  /**
   * Create a shipping template
   * Shipping Templates define a type of shipping and the properties they have.
   * @param shippingTemplateResource The new shipping template (optional)
   * @return ItemTemplateResource
   */
  def createShippingTemplate(shippingTemplateResource: Option[ItemTemplateResource] = None): Option[ItemTemplateResource] = {
    val await = Try(Await.result(createShippingTemplateAsync(shippingTemplateResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a shipping template asynchronously
   * Shipping Templates define a type of shipping and the properties they have.
   * @param shippingTemplateResource The new shipping template (optional)
   * @return Future(ItemTemplateResource)
  */
  def createShippingTemplateAsync(shippingTemplateResource: Option[ItemTemplateResource] = None): Future[ItemTemplateResource] = {
      helper.createShippingTemplate(shippingTemplateResource)
  }


  /**
   * Delete a shipping item
   * 
   * @param id The id of the shipping item 
   * @return void
   */
  def deleteShippingItem(id: Integer) = {
    val await = Try(Await.result(deleteShippingItemAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a shipping item asynchronously
   * 
   * @param id The id of the shipping item 
   * @return Future(void)
  */
  def deleteShippingItemAsync(id: Integer) = {
      helper.deleteShippingItem(id)
  }


  /**
   * Delete a shipping template
   * 
   * @param id The id of the template 
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return void
   */
  def deleteShippingTemplate(id: String, cascade: Option[String] = None) = {
    val await = Try(Await.result(deleteShippingTemplateAsync(id, cascade), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a shipping template asynchronously
   * 
   * @param id The id of the template 
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return Future(void)
  */
  def deleteShippingTemplateAsync(id: String, cascade: Option[String] = None) = {
      helper.deleteShippingTemplate(id, cascade)
  }


  /**
   * Get a single shipping item
   * 
   * @param id The id of the shipping item 
   * @return ShippingItem
   */
  def getShippingItem(id: Integer): Option[ShippingItem] = {
    val await = Try(Await.result(getShippingItemAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single shipping item asynchronously
   * 
   * @param id The id of the shipping item 
   * @return Future(ShippingItem)
  */
  def getShippingItemAsync(id: Integer): Future[ShippingItem] = {
      helper.getShippingItem(id)
  }


  /**
   * Get a single shipping template
   * Shipping Templates define a type of shipping and the properties they have.
   * @param id The id of the template 
   * @return ItemTemplateResource
   */
  def getShippingTemplate(id: String): Option[ItemTemplateResource] = {
    val await = Try(Await.result(getShippingTemplateAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single shipping template asynchronously
   * Shipping Templates define a type of shipping and the properties they have.
   * @param id The id of the template 
   * @return Future(ItemTemplateResource)
  */
  def getShippingTemplateAsync(id: String): Future[ItemTemplateResource] = {
      helper.getShippingTemplate(id)
  }


  /**
   * List and search shipping templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceItemTemplateResource
   */
  def getShippingTemplates(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceItemTemplateResource] = {
    val await = Try(Await.result(getShippingTemplatesAsync(size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search shipping templates asynchronously
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceItemTemplateResource)
  */
  def getShippingTemplatesAsync(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceItemTemplateResource] = {
      helper.getShippingTemplates(size, page, order)
  }


  /**
   * Update a shipping item
   * 
   * @param id The id of the shipping item 
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param shippingItem The shipping item object (optional)
   * @return ShippingItem
   */
  def updateShippingItem(id: Integer, cascade: Option[Boolean] /* = false*/, shippingItem: Option[ShippingItem] = None): Option[ShippingItem] = {
    val await = Try(Await.result(updateShippingItemAsync(id, cascade, shippingItem), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a shipping item asynchronously
   * 
   * @param id The id of the shipping item 
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param shippingItem The shipping item object (optional)
   * @return Future(ShippingItem)
  */
  def updateShippingItemAsync(id: Integer, cascade: Option[Boolean] /* = false*/, shippingItem: Option[ShippingItem] = None): Future[ShippingItem] = {
      helper.updateShippingItem(id, cascade, shippingItem)
  }


  /**
   * Update a shipping template
   * 
   * @param id The id of the template 
   * @param shippingTemplateResource The shipping template resource object (optional)
   * @return ItemTemplateResource
   */
  def updateShippingTemplate(id: String, shippingTemplateResource: Option[ItemTemplateResource] = None): Option[ItemTemplateResource] = {
    val await = Try(Await.result(updateShippingTemplateAsync(id, shippingTemplateResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a shipping template asynchronously
   * 
   * @param id The id of the template 
   * @param shippingTemplateResource The shipping template resource object (optional)
   * @return Future(ItemTemplateResource)
  */
  def updateShippingTemplateAsync(id: String, shippingTemplateResource: Option[ItemTemplateResource] = None): Future[ItemTemplateResource] = {
      helper.updateShippingTemplate(id, shippingTemplateResource)
  }


}

class StoreShippingApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createShippingItem(cascade: Option[Boolean] = Some(false),
    shippingItem: Option[ShippingItem] = None
    )(implicit reader: ClientResponseReader[ShippingItem], writer: RequestWriter[ShippingItem]): Future[ShippingItem] = {
    // create path and map variables
    val path = (addFmt("/store/shipping"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    cascade match {
      case Some(param) => queryParams += "cascade" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(shippingItem))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createShippingTemplate(shippingTemplateResource: Option[ItemTemplateResource] = None
    )(implicit reader: ClientResponseReader[ItemTemplateResource], writer: RequestWriter[ItemTemplateResource]): Future[ItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/store/shipping/templates"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(shippingTemplateResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteShippingItem(id: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/store/shipping/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteShippingTemplate(id: String,
    cascade: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/store/shipping/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShippingApi->deleteShippingTemplate")

    cascade match {
      case Some(param) => queryParams += "cascade" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getShippingItem(id: Integer)(implicit reader: ClientResponseReader[ShippingItem]): Future[ShippingItem] = {
    // create path and map variables
    val path = (addFmt("/store/shipping/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getShippingTemplate(id: String)(implicit reader: ClientResponseReader[ItemTemplateResource]): Future[ItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/store/shipping/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShippingApi->getShippingTemplate")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getShippingTemplates(size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceItemTemplateResource]): Future[PageResourceItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/store/shipping/templates"))

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

  def updateShippingItem(id: Integer,
    cascade: Option[Boolean] = Some(false),
    shippingItem: Option[ShippingItem] = None
    )(implicit reader: ClientResponseReader[ShippingItem], writer: RequestWriter[ShippingItem]): Future[ShippingItem] = {
    // create path and map variables
    val path = (addFmt("/store/shipping/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    cascade match {
      case Some(param) => queryParams += "cascade" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(shippingItem))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateShippingTemplate(id: String,
    shippingTemplateResource: Option[ItemTemplateResource] = None
    )(implicit reader: ClientResponseReader[ItemTemplateResource], writer: RequestWriter[ItemTemplateResource]): Future[ItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/store/shipping/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShippingApi->updateShippingTemplate")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(shippingTemplateResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
