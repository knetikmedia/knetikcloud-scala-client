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
import com.knetikcloud.client.model.ObjectResource
import com.knetikcloud.client.model.PageResourceItemTemplateResource
import com.knetikcloud.client.model.PageResourceObjectResource
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

class ObjectsApi(val defBasePath: String = "https://devsandbox.knetikcloud.com",
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
  val helper = new ObjectsApiAsyncHelper(client, config)

  /**
   * Create an object
   * 
   * @param templateId The id of the template this object is to be part of 
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @return ObjectResource
   */
  def createObjectItem(templateId: String, cascade: Option[Boolean] /* = false*/, objectItem: Option[ObjectResource] = None): Option[ObjectResource] = {
    val await = Try(Await.result(createObjectItemAsync(templateId, cascade, objectItem), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create an object asynchronously
   * 
   * @param templateId The id of the template this object is to be part of 
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @return Future(ObjectResource)
  */
  def createObjectItemAsync(templateId: String, cascade: Option[Boolean] /* = false*/, objectItem: Option[ObjectResource] = None): Future[ObjectResource] = {
      helper.createObjectItem(templateId, cascade, objectItem)
  }


  /**
   * Create an object template
   * Object templates define a type of entitlement and the properties they have
   * @param template The entitlement template to be created (optional)
   * @return ItemTemplateResource
   */
  def createObjectTemplate(template: Option[ItemTemplateResource] = None): Option[ItemTemplateResource] = {
    val await = Try(Await.result(createObjectTemplateAsync(template), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create an object template asynchronously
   * Object templates define a type of entitlement and the properties they have
   * @param template The entitlement template to be created (optional)
   * @return Future(ItemTemplateResource)
  */
  def createObjectTemplateAsync(template: Option[ItemTemplateResource] = None): Future[ItemTemplateResource] = {
      helper.createObjectTemplate(template)
  }


  /**
   * Delete an object
   * 
   * @param templateId The id of the template this object is part of 
   * @param objectId The id of the object 
   * @return void
   */
  def deleteObjectItem(templateId: String, objectId: Integer) = {
    val await = Try(Await.result(deleteObjectItemAsync(templateId, objectId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete an object asynchronously
   * 
   * @param templateId The id of the template this object is part of 
   * @param objectId The id of the object 
   * @return Future(void)
  */
  def deleteObjectItemAsync(templateId: String, objectId: Integer) = {
      helper.deleteObjectItem(templateId, objectId)
  }


  /**
   * Delete an entitlement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return void
   */
  def deleteObjectTemplate(id: String, cascade: Option[String] = None) = {
    val await = Try(Await.result(deleteObjectTemplateAsync(id, cascade), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete an entitlement template asynchronously
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return Future(void)
  */
  def deleteObjectTemplateAsync(id: String, cascade: Option[String] = None) = {
      helper.deleteObjectTemplate(id, cascade)
  }


  /**
   * Get a single object
   * 
   * @param templateId The id of the template this object is part of 
   * @param objectId The id of the object 
   * @return ObjectResource
   */
  def getObjectItem(templateId: String, objectId: Integer): Option[ObjectResource] = {
    val await = Try(Await.result(getObjectItemAsync(templateId, objectId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single object asynchronously
   * 
   * @param templateId The id of the template this object is part of 
   * @param objectId The id of the object 
   * @return Future(ObjectResource)
  */
  def getObjectItemAsync(templateId: String, objectId: Integer): Future[ObjectResource] = {
      helper.getObjectItem(templateId, objectId)
  }


  /**
   * List and search objects
   * 
   * @param templateId The id of the template to get objects for 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceObjectResource
   */
  def getObjectItems(templateId: String, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceObjectResource] = {
    val await = Try(Await.result(getObjectItemsAsync(templateId, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search objects asynchronously
   * 
   * @param templateId The id of the template to get objects for 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceObjectResource)
  */
  def getObjectItemsAsync(templateId: String, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceObjectResource] = {
      helper.getObjectItems(templateId, size, page, order)
  }


  /**
   * Get a single entitlement template
   * 
   * @param id The id of the template 
   * @return ItemTemplateResource
   */
  def getObjectTemplate(id: String): Option[ItemTemplateResource] = {
    val await = Try(Await.result(getObjectTemplateAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single entitlement template asynchronously
   * 
   * @param id The id of the template 
   * @return Future(ItemTemplateResource)
  */
  def getObjectTemplateAsync(id: String): Future[ItemTemplateResource] = {
      helper.getObjectTemplate(id)
  }


  /**
   * List and search entitlement templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceItemTemplateResource
   */
  def getObjectTemplates(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceItemTemplateResource] = {
    val await = Try(Await.result(getObjectTemplatesAsync(size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search entitlement templates asynchronously
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceItemTemplateResource)
  */
  def getObjectTemplatesAsync(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceItemTemplateResource] = {
      helper.getObjectTemplates(size, page, order)
  }


  /**
   * Update an object
   * 
   * @param templateId The id of the template this object is part of 
   * @param objectId The id of the object 
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @return void
   */
  def updateObjectItem(templateId: String, objectId: Integer, cascade: Option[Boolean] /* = false*/, objectItem: Option[ObjectResource] = None) = {
    val await = Try(Await.result(updateObjectItemAsync(templateId, objectId, cascade, objectItem), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update an object asynchronously
   * 
   * @param templateId The id of the template this object is part of 
   * @param objectId The id of the object 
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @return Future(void)
  */
  def updateObjectItemAsync(templateId: String, objectId: Integer, cascade: Option[Boolean] /* = false*/, objectItem: Option[ObjectResource] = None) = {
      helper.updateObjectItem(templateId, objectId, cascade, objectItem)
  }


  /**
   * Update an entitlement template
   * 
   * @param id The id of the template 
   * @param template The updated template (optional)
   * @return ItemTemplateResource
   */
  def updateObjectTemplate(id: String, template: Option[ItemTemplateResource] = None): Option[ItemTemplateResource] = {
    val await = Try(Await.result(updateObjectTemplateAsync(id, template), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update an entitlement template asynchronously
   * 
   * @param id The id of the template 
   * @param template The updated template (optional)
   * @return Future(ItemTemplateResource)
  */
  def updateObjectTemplateAsync(id: String, template: Option[ItemTemplateResource] = None): Future[ItemTemplateResource] = {
      helper.updateObjectTemplate(id, template)
  }


}

class ObjectsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createObjectItem(templateId: String,
    cascade: Option[Boolean] = Some(false),
    objectItem: Option[ObjectResource] = None
    )(implicit reader: ClientResponseReader[ObjectResource], writer: RequestWriter[ObjectResource]): Future[ObjectResource] = {
    // create path and map variables
    val path = (addFmt("/objects/{template_id}")
      replaceAll ("\\{" + "template_id" + "\\}",templateId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (templateId == null) throw new Exception("Missing required parameter 'templateId' when calling ObjectsApi->createObjectItem")

    cascade match {
      case Some(param) => queryParams += "cascade" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(objectItem))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createObjectTemplate(template: Option[ItemTemplateResource] = None
    )(implicit reader: ClientResponseReader[ItemTemplateResource], writer: RequestWriter[ItemTemplateResource]): Future[ItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/objects/templates"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(template))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteObjectItem(templateId: String,
    objectId: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/objects/{template_id}/{object_id}")
      replaceAll ("\\{" + "template_id" + "\\}",templateId.toString)
      replaceAll ("\\{" + "object_id" + "\\}",objectId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (templateId == null) throw new Exception("Missing required parameter 'templateId' when calling ObjectsApi->deleteObjectItem")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteObjectTemplate(id: String,
    cascade: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/objects/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling ObjectsApi->deleteObjectTemplate")

    cascade match {
      case Some(param) => queryParams += "cascade" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getObjectItem(templateId: String,
    objectId: Integer)(implicit reader: ClientResponseReader[ObjectResource]): Future[ObjectResource] = {
    // create path and map variables
    val path = (addFmt("/objects/{template_id}/{object_id}")
      replaceAll ("\\{" + "template_id" + "\\}",templateId.toString)
      replaceAll ("\\{" + "object_id" + "\\}",objectId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (templateId == null) throw new Exception("Missing required parameter 'templateId' when calling ObjectsApi->getObjectItem")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getObjectItems(templateId: String,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceObjectResource]): Future[PageResourceObjectResource] = {
    // create path and map variables
    val path = (addFmt("/objects/{template_id}")
      replaceAll ("\\{" + "template_id" + "\\}",templateId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (templateId == null) throw new Exception("Missing required parameter 'templateId' when calling ObjectsApi->getObjectItems")

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

  def getObjectTemplate(id: String)(implicit reader: ClientResponseReader[ItemTemplateResource]): Future[ItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/objects/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling ObjectsApi->getObjectTemplate")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getObjectTemplates(size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceItemTemplateResource]): Future[PageResourceItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/objects/templates"))

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

  def updateObjectItem(templateId: String,
    objectId: Integer,
    cascade: Option[Boolean] = Some(false),
    objectItem: Option[ObjectResource] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[ObjectResource]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/objects/{template_id}/{object_id}")
      replaceAll ("\\{" + "template_id" + "\\}",templateId.toString)
      replaceAll ("\\{" + "object_id" + "\\}",objectId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (templateId == null) throw new Exception("Missing required parameter 'templateId' when calling ObjectsApi->updateObjectItem")

    cascade match {
      case Some(param) => queryParams += "cascade" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(objectItem))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateObjectTemplate(id: String,
    template: Option[ItemTemplateResource] = None
    )(implicit reader: ClientResponseReader[ItemTemplateResource], writer: RequestWriter[ItemTemplateResource]): Future[ItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/objects/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling ObjectsApi->updateObjectTemplate")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(template))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
