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

import com.knetikcloud.client.model.PageResourceRewardSetResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.RewardSetResource
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

class CampaignsRewardsApi(val defBasePath: String = "https://devsandbox.knetikcloud.com",
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
  val helper = new CampaignsRewardsApiAsyncHelper(client, config)

  /**
   * Create a reward set
   * 
   * @param rewardSetResource The reward set resource object (optional)
   * @return RewardSetResource
   */
  def createRewardSet(rewardSetResource: Option[RewardSetResource] = None): Option[RewardSetResource] = {
    val await = Try(Await.result(createRewardSetAsync(rewardSetResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a reward set asynchronously
   * 
   * @param rewardSetResource The reward set resource object (optional)
   * @return Future(RewardSetResource)
  */
  def createRewardSetAsync(rewardSetResource: Option[RewardSetResource] = None): Future[RewardSetResource] = {
      helper.createRewardSet(rewardSetResource)
  }


  /**
   * Delete a reward set
   * 
   * @param id The reward id 
   * @return void
   */
  def deleteRewardSet(id: Integer) = {
    val await = Try(Await.result(deleteRewardSetAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a reward set asynchronously
   * 
   * @param id The reward id 
   * @return Future(void)
  */
  def deleteRewardSetAsync(id: Integer) = {
      helper.deleteRewardSet(id)
  }


  /**
   * Get a single reward set
   * 
   * @param id The reward id 
   * @return RewardSetResource
   */
  def getRewardSet(id: Integer): Option[RewardSetResource] = {
    val await = Try(Await.result(getRewardSetAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single reward set asynchronously
   * 
   * @param id The reward id 
   * @return Future(RewardSetResource)
  */
  def getRewardSetAsync(id: Integer): Future[RewardSetResource] = {
      helper.getRewardSet(id)
  }


  /**
   * List and search reward sets
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceRewardSetResource
   */
  def getRewardSets(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceRewardSetResource] = {
    val await = Try(Await.result(getRewardSetsAsync(size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search reward sets asynchronously
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceRewardSetResource)
  */
  def getRewardSetsAsync(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceRewardSetResource] = {
      helper.getRewardSets(size, page, order)
  }


  /**
   * Update a reward set
   * 
   * @param id The reward id 
   * @param rewardSetResource The reward set resource object (optional)
   * @return RewardSetResource
   */
  def updateRewardSet(id: Integer, rewardSetResource: Option[RewardSetResource] = None): Option[RewardSetResource] = {
    val await = Try(Await.result(updateRewardSetAsync(id, rewardSetResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a reward set asynchronously
   * 
   * @param id The reward id 
   * @param rewardSetResource The reward set resource object (optional)
   * @return Future(RewardSetResource)
  */
  def updateRewardSetAsync(id: Integer, rewardSetResource: Option[RewardSetResource] = None): Future[RewardSetResource] = {
      helper.updateRewardSet(id, rewardSetResource)
  }


}

class CampaignsRewardsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createRewardSet(rewardSetResource: Option[RewardSetResource] = None
    )(implicit reader: ClientResponseReader[RewardSetResource], writer: RequestWriter[RewardSetResource]): Future[RewardSetResource] = {
    // create path and map variables
    val path = (addFmt("/rewards"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(rewardSetResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteRewardSet(id: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/rewards/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getRewardSet(id: Integer)(implicit reader: ClientResponseReader[RewardSetResource]): Future[RewardSetResource] = {
    // create path and map variables
    val path = (addFmt("/rewards/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getRewardSets(size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceRewardSetResource]): Future[PageResourceRewardSetResource] = {
    // create path and map variables
    val path = (addFmt("/rewards"))

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

  def updateRewardSet(id: Integer,
    rewardSetResource: Option[RewardSetResource] = None
    )(implicit reader: ClientResponseReader[RewardSetResource], writer: RequestWriter[RewardSetResource]): Future[RewardSetResource] = {
    // create path and map variables
    val path = (addFmt("/rewards/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(rewardSetResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
