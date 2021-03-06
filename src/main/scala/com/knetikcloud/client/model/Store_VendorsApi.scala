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
import com.knetikcloud.client.model.PageResourceVendorResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.VendorResource
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

class Store_VendorsApi(val defBasePath: String = "https://jsapi-integration.us-east-1.elasticbeanstalk.com",
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
  val helper = new Store_VendorsApiAsyncHelper(client, config)

  /**
   * Create a vendor
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
   * @param vendor The vendor (optional)
   * @return VendorResource
   */
  def createVendor(vendor: Option[VendorResource] = None): Option[VendorResource] = {
    val await = Try(Await.result(createVendorAsync(vendor), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a vendor asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
   * @param vendor The vendor (optional)
   * @return Future(VendorResource)
  */
  def createVendorAsync(vendor: Option[VendorResource] = None): Future[VendorResource] = {
      helper.createVendor(vendor)
  }


  /**
   * Create a vendor template
   * Vendor Templates define a type of vendor and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param vendorTemplateResource The new vendor template (optional)
   * @return ItemTemplateResource
   */
  def createVendorTemplate(vendorTemplateResource: Option[ItemTemplateResource] = None): Option[ItemTemplateResource] = {
    val await = Try(Await.result(createVendorTemplateAsync(vendorTemplateResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a vendor template asynchronously
   * Vendor Templates define a type of vendor and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param vendorTemplateResource The new vendor template (optional)
   * @return Future(ItemTemplateResource)
  */
  def createVendorTemplateAsync(vendorTemplateResource: Option[ItemTemplateResource] = None): Future[ItemTemplateResource] = {
      helper.createVendorTemplate(vendorTemplateResource)
  }


  /**
   * Delete a vendor
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
   * @param id The id of the vendor 
   * @return void
   */
  def deleteVendor(id: Integer) = {
    val await = Try(Await.result(deleteVendorAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a vendor asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
   * @param id The id of the vendor 
   * @return Future(void)
  */
  def deleteVendorAsync(id: Integer) = {
      helper.deleteVendor(id)
  }


  /**
   * Delete a vendor template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return void
   */
  def deleteVendorTemplate(id: String, cascade: Option[String] = None) = {
    val await = Try(Await.result(deleteVendorTemplateAsync(id, cascade), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a vendor template asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return Future(void)
  */
  def deleteVendorTemplateAsync(id: String, cascade: Option[String] = None) = {
      helper.deleteVendorTemplate(id, cascade)
  }


  /**
   * Get a single vendor
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the vendor 
   * @return VendorResource
   */
  def getVendor(id: Integer): Option[VendorResource] = {
    val await = Try(Await.result(getVendorAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single vendor asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the vendor 
   * @return Future(VendorResource)
  */
  def getVendorAsync(id: Integer): Future[VendorResource] = {
      helper.getVendor(id)
  }


  /**
   * Get a single vendor template
   * Vendor Templates define a type of vendor and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @return ItemTemplateResource
   */
  def getVendorTemplate(id: String): Option[ItemTemplateResource] = {
    val await = Try(Await.result(getVendorTemplateAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single vendor template asynchronously
   * Vendor Templates define a type of vendor and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @return Future(ItemTemplateResource)
  */
  def getVendorTemplateAsync(id: String): Future[ItemTemplateResource] = {
      helper.getVendorTemplate(id)
  }


  /**
   * List and search vendor templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return PageResourceItemTemplateResource
   */
  def getVendorTemplates(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] = None): Option[PageResourceItemTemplateResource] = {
    val await = Try(Await.result(getVendorTemplatesAsync(size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search vendor templates asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Future(PageResourceItemTemplateResource)
  */
  def getVendorTemplatesAsync(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] = None): Future[PageResourceItemTemplateResource] = {
      helper.getVendorTemplates(size, page, order)
  }


  /**
   * List and search vendors
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterName Filters vendors by name starting with the text provided in the filter (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceVendorResource
   */
  def getVendors(filterName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceVendorResource] = {
    val await = Try(Await.result(getVendorsAsync(filterName, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search vendors asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterName Filters vendors by name starting with the text provided in the filter (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceVendorResource)
  */
  def getVendorsAsync(filterName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceVendorResource] = {
      helper.getVendors(filterName, size, page, order)
  }


  /**
   * Update a vendor
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
   * @param id The id of the vendor 
   * @param vendor The vendor (optional)
   * @return VendorResource
   */
  def updateVendor(id: Integer, vendor: Option[VendorResource] = None): Option[VendorResource] = {
    val await = Try(Await.result(updateVendorAsync(id, vendor), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a vendor asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
   * @param id The id of the vendor 
   * @param vendor The vendor (optional)
   * @return Future(VendorResource)
  */
  def updateVendorAsync(id: Integer, vendor: Option[VendorResource] = None): Future[VendorResource] = {
      helper.updateVendor(id, vendor)
  }


  /**
   * Update a vendor template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @param vendorTemplateResource The vendor template resource object (optional)
   * @return ItemTemplateResource
   */
  def updateVendorTemplate(id: String, vendorTemplateResource: Option[ItemTemplateResource] = None): Option[ItemTemplateResource] = {
    val await = Try(Await.result(updateVendorTemplateAsync(id, vendorTemplateResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a vendor template asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @param vendorTemplateResource The vendor template resource object (optional)
   * @return Future(ItemTemplateResource)
  */
  def updateVendorTemplateAsync(id: String, vendorTemplateResource: Option[ItemTemplateResource] = None): Future[ItemTemplateResource] = {
      helper.updateVendorTemplate(id, vendorTemplateResource)
  }


}

class Store_VendorsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createVendor(vendor: Option[VendorResource] = None
    )(implicit reader: ClientResponseReader[VendorResource], writer: RequestWriter[VendorResource]): Future[VendorResource] = {
    // create path and map variables
    val path = (addFmt("/vendors"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(vendor))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createVendorTemplate(vendorTemplateResource: Option[ItemTemplateResource] = None
    )(implicit reader: ClientResponseReader[ItemTemplateResource], writer: RequestWriter[ItemTemplateResource]): Future[ItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/vendors/templates"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(vendorTemplateResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteVendor(id: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/vendors/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteVendorTemplate(id: String,
    cascade: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/vendors/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_VendorsApi->deleteVendorTemplate")

    cascade match {
      case Some(param) => queryParams += "cascade" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVendor(id: Integer)(implicit reader: ClientResponseReader[VendorResource]): Future[VendorResource] = {
    // create path and map variables
    val path = (addFmt("/vendors/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVendorTemplate(id: String)(implicit reader: ClientResponseReader[ItemTemplateResource]): Future[ItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/vendors/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_VendorsApi->getVendorTemplate")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVendorTemplates(size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = None
    )(implicit reader: ClientResponseReader[PageResourceItemTemplateResource]): Future[PageResourceItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/vendors/templates"))

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

  def getVendors(filterName: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceVendorResource]): Future[PageResourceVendorResource] = {
    // create path and map variables
    val path = (addFmt("/vendors"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterName match {
      case Some(param) => queryParams += "filter_name" -> param.toString
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

  def updateVendor(id: Integer,
    vendor: Option[VendorResource] = None
    )(implicit reader: ClientResponseReader[VendorResource], writer: RequestWriter[VendorResource]): Future[VendorResource] = {
    // create path and map variables
    val path = (addFmt("/vendors/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(vendor))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateVendorTemplate(id: String,
    vendorTemplateResource: Option[ItemTemplateResource] = None
    )(implicit reader: ClientResponseReader[ItemTemplateResource], writer: RequestWriter[ItemTemplateResource]): Future[ItemTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/vendors/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_VendorsApi->updateVendorTemplate")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(vendorTemplateResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
