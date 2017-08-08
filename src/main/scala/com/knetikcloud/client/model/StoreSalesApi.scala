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

import com.knetikcloud.client.model.CatalogSale
import com.knetikcloud.client.model.PageResourceCatalogSale
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

class StoreSalesApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  val helper = new StoreSalesApiAsyncHelper(client, config)

  /**
   * Create a sale
   * 
   * @param catalogSale The catalog sale object (optional)
   * @return CatalogSale
   */
  def createCatalogSale(catalogSale: Option[CatalogSale] = None): Option[CatalogSale] = {
    val await = Try(Await.result(createCatalogSaleAsync(catalogSale), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a sale asynchronously
   * 
   * @param catalogSale The catalog sale object (optional)
   * @return Future(CatalogSale)
  */
  def createCatalogSaleAsync(catalogSale: Option[CatalogSale] = None): Future[CatalogSale] = {
      helper.createCatalogSale(catalogSale)
  }


  /**
   * Delete a sale
   * 
   * @param id The id of the sale 
   * @return void
   */
  def deleteCatalogSale(id: Integer) = {
    val await = Try(Await.result(deleteCatalogSaleAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a sale asynchronously
   * 
   * @param id The id of the sale 
   * @return Future(void)
  */
  def deleteCatalogSaleAsync(id: Integer) = {
      helper.deleteCatalogSale(id)
  }


  /**
   * Get a single sale
   * 
   * @param id The id of the sale 
   * @return CatalogSale
   */
  def getCatalogSale(id: Integer): Option[CatalogSale] = {
    val await = Try(Await.result(getCatalogSaleAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single sale asynchronously
   * 
   * @param id The id of the sale 
   * @return Future(CatalogSale)
  */
  def getCatalogSaleAsync(id: Integer): Future[CatalogSale] = {
      helper.getCatalogSale(id)
  }


  /**
   * List and search sales
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceCatalogSale
   */
  def getCatalogSales(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceCatalogSale] = {
    val await = Try(Await.result(getCatalogSalesAsync(size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search sales asynchronously
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceCatalogSale)
  */
  def getCatalogSalesAsync(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceCatalogSale] = {
      helper.getCatalogSales(size, page, order)
  }


  /**
   * Update a sale
   * 
   * @param id The id of the sale 
   * @param catalogSale The catalog sale object (optional)
   * @return CatalogSale
   */
  def updateCatalogSale(id: Integer, catalogSale: Option[CatalogSale] = None): Option[CatalogSale] = {
    val await = Try(Await.result(updateCatalogSaleAsync(id, catalogSale), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a sale asynchronously
   * 
   * @param id The id of the sale 
   * @param catalogSale The catalog sale object (optional)
   * @return Future(CatalogSale)
  */
  def updateCatalogSaleAsync(id: Integer, catalogSale: Option[CatalogSale] = None): Future[CatalogSale] = {
      helper.updateCatalogSale(id, catalogSale)
  }


}

class StoreSalesApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createCatalogSale(catalogSale: Option[CatalogSale] = None
    )(implicit reader: ClientResponseReader[CatalogSale], writer: RequestWriter[CatalogSale]): Future[CatalogSale] = {
    // create path and map variables
    val path = (addFmt("/store/sales"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(catalogSale))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteCatalogSale(id: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/store/sales/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCatalogSale(id: Integer)(implicit reader: ClientResponseReader[CatalogSale]): Future[CatalogSale] = {
    // create path and map variables
    val path = (addFmt("/store/sales/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCatalogSales(size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceCatalogSale]): Future[PageResourceCatalogSale] = {
    // create path and map variables
    val path = (addFmt("/store/sales"))

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

  def updateCatalogSale(id: Integer,
    catalogSale: Option[CatalogSale] = None
    )(implicit reader: ClientResponseReader[CatalogSale], writer: RequestWriter[CatalogSale]): Future[CatalogSale] = {
    // create path and map variables
    val path = (addFmt("/store/sales/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(catalogSale))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
