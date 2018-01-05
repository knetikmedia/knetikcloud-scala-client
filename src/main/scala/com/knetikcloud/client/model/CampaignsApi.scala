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

import com.knetikcloud.client.model.CampaignResource
import com.knetikcloud.client.model.PageResourceCampaignResource
import com.knetikcloud.client.model.PageResourceChallengeResource
import com.knetikcloud.client.model.PageResourceTemplateResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.TemplateResource
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

class CampaignsApi(val defBasePath: String = "https://devsandbox.knetikcloud.com",
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
  val helper = new CampaignsApiAsyncHelper(client, config)

  /**
   * Add a challenge to a campaign
   * 
   * @param id The id of the campaign 
   * @param challengeId The id of the challenge (optional)
   * @return void
   */
  def addChallengeToCampaign(id: Long, challengeId: Option[Long] = None) = {
    val await = Try(Await.result(addChallengeToCampaignAsync(id, challengeId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a challenge to a campaign asynchronously
   * 
   * @param id The id of the campaign 
   * @param challengeId The id of the challenge (optional)
   * @return Future(void)
  */
  def addChallengeToCampaignAsync(id: Long, challengeId: Option[Long] = None) = {
      helper.addChallengeToCampaign(id, challengeId)
  }


  /**
   * Create a campaign
   * 
   * @param campaignResource The campaign resource object (optional)
   * @return CampaignResource
   */
  def createCampaign(campaignResource: Option[CampaignResource] = None): Option[CampaignResource] = {
    val await = Try(Await.result(createCampaignAsync(campaignResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a campaign asynchronously
   * 
   * @param campaignResource The campaign resource object (optional)
   * @return Future(CampaignResource)
  */
  def createCampaignAsync(campaignResource: Option[CampaignResource] = None): Future[CampaignResource] = {
      helper.createCampaign(campaignResource)
  }


  /**
   * Create a campaign template
   * Campaign Templates define a type of campaign and the properties they have
   * @param campaignTemplateResource The campaign template resource object (optional)
   * @return TemplateResource
   */
  def createCampaignTemplate(campaignTemplateResource: Option[TemplateResource] = None): Option[TemplateResource] = {
    val await = Try(Await.result(createCampaignTemplateAsync(campaignTemplateResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a campaign template asynchronously
   * Campaign Templates define a type of campaign and the properties they have
   * @param campaignTemplateResource The campaign template resource object (optional)
   * @return Future(TemplateResource)
  */
  def createCampaignTemplateAsync(campaignTemplateResource: Option[TemplateResource] = None): Future[TemplateResource] = {
      helper.createCampaignTemplate(campaignTemplateResource)
  }


  /**
   * Delete a campaign
   * 
   * @param id The campaign id 
   * @return void
   */
  def deleteCampaign(id: Long) = {
    val await = Try(Await.result(deleteCampaignAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a campaign asynchronously
   * 
   * @param id The campaign id 
   * @return Future(void)
  */
  def deleteCampaignAsync(id: Long) = {
      helper.deleteCampaign(id)
  }


  /**
   * Delete a campaign template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return void
   */
  def deleteCampaignTemplate(id: String, cascade: Option[String] = None) = {
    val await = Try(Await.result(deleteCampaignTemplateAsync(id, cascade), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a campaign template asynchronously
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return Future(void)
  */
  def deleteCampaignTemplateAsync(id: String, cascade: Option[String] = None) = {
      helper.deleteCampaignTemplate(id, cascade)
  }


  /**
   * Returns a single campaign
   * 
   * @param id The campaign id 
   * @return CampaignResource
   */
  def getCampaign(id: Long): Option[CampaignResource] = {
    val await = Try(Await.result(getCampaignAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Returns a single campaign asynchronously
   * 
   * @param id The campaign id 
   * @return Future(CampaignResource)
  */
  def getCampaignAsync(id: Long): Future[CampaignResource] = {
      helper.getCampaign(id)
  }


  /**
   * List the challenges associated with a campaign
   * 
   * @param id The campaign id 
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the challenge start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterEndDate A comma separated string without spaces.  First value is the operator to search on, second value is the challenge end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceChallengeResource
   */
  def getCampaignChallenges(id: Long, filterStartDate: Option[String] = None, filterEndDate: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceChallengeResource] = {
    val await = Try(Await.result(getCampaignChallengesAsync(id, filterStartDate, filterEndDate, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List the challenges associated with a campaign asynchronously
   * 
   * @param id The campaign id 
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the challenge start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterEndDate A comma separated string without spaces.  First value is the operator to search on, second value is the challenge end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceChallengeResource)
  */
  def getCampaignChallengesAsync(id: Long, filterStartDate: Option[String] = None, filterEndDate: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceChallengeResource] = {
      helper.getCampaignChallenges(id, filterStartDate, filterEndDate, size, page, order)
  }


  /**
   * Get a single campaign template
   * 
   * @param id The id of the template 
   * @return TemplateResource
   */
  def getCampaignTemplate(id: String): Option[TemplateResource] = {
    val await = Try(Await.result(getCampaignTemplateAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single campaign template asynchronously
   * 
   * @param id The id of the template 
   * @return Future(TemplateResource)
  */
  def getCampaignTemplateAsync(id: String): Future[TemplateResource] = {
      helper.getCampaignTemplate(id)
  }


  /**
   * List and search campaign templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   */
  def getCampaignTemplates(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceTemplateResource] = {
    val await = Try(Await.result(getCampaignTemplatesAsync(size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search campaign templates asynchronously
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceTemplateResource)
  */
  def getCampaignTemplatesAsync(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceTemplateResource] = {
      helper.getCampaignTemplates(size, page, order)
  }


  /**
   * List and search campaigns
   * 
   * @param filterActive Filter for campaigns that are active (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceCampaignResource
   */
  def getCampaigns(filterActive: Option[Boolean] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceCampaignResource] = {
    val await = Try(Await.result(getCampaignsAsync(filterActive, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search campaigns asynchronously
   * 
   * @param filterActive Filter for campaigns that are active (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceCampaignResource)
  */
  def getCampaignsAsync(filterActive: Option[Boolean] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceCampaignResource] = {
      helper.getCampaigns(filterActive, size, page, order)
  }


  /**
   * Remove a challenge from a campaign
   * 
   * @param campaignId The campaign id 
   * @param id The challenge id 
   * @return void
   */
  def removeChallengeFromCampaign(campaignId: Long, id: Long) = {
    val await = Try(Await.result(removeChallengeFromCampaignAsync(campaignId, id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Remove a challenge from a campaign asynchronously
   * 
   * @param campaignId The campaign id 
   * @param id The challenge id 
   * @return Future(void)
  */
  def removeChallengeFromCampaignAsync(campaignId: Long, id: Long) = {
      helper.removeChallengeFromCampaign(campaignId, id)
  }


  /**
   * Update a campaign
   * 
   * @param id The campaign id 
   * @param campaignResource The campaign resource object (optional)
   * @return CampaignResource
   */
  def updateCampaign(id: Long, campaignResource: Option[CampaignResource] = None): Option[CampaignResource] = {
    val await = Try(Await.result(updateCampaignAsync(id, campaignResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a campaign asynchronously
   * 
   * @param id The campaign id 
   * @param campaignResource The campaign resource object (optional)
   * @return Future(CampaignResource)
  */
  def updateCampaignAsync(id: Long, campaignResource: Option[CampaignResource] = None): Future[CampaignResource] = {
      helper.updateCampaign(id, campaignResource)
  }


  /**
   * Update an campaign template
   * 
   * @param id The id of the template 
   * @param campaignTemplateResource The campaign template resource object (optional)
   * @return TemplateResource
   */
  def updateCampaignTemplate(id: String, campaignTemplateResource: Option[TemplateResource] = None): Option[TemplateResource] = {
    val await = Try(Await.result(updateCampaignTemplateAsync(id, campaignTemplateResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update an campaign template asynchronously
   * 
   * @param id The id of the template 
   * @param campaignTemplateResource The campaign template resource object (optional)
   * @return Future(TemplateResource)
  */
  def updateCampaignTemplateAsync(id: String, campaignTemplateResource: Option[TemplateResource] = None): Future[TemplateResource] = {
      helper.updateCampaignTemplate(id, campaignTemplateResource)
  }


}

class CampaignsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addChallengeToCampaign(id: Long,
    challengeId: Option[Long] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Long]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/campaigns/{id}/challenges")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(challengeId))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createCampaign(campaignResource: Option[CampaignResource] = None
    )(implicit reader: ClientResponseReader[CampaignResource], writer: RequestWriter[CampaignResource]): Future[CampaignResource] = {
    // create path and map variables
    val path = (addFmt("/campaigns"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(campaignResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createCampaignTemplate(campaignTemplateResource: Option[TemplateResource] = None
    )(implicit reader: ClientResponseReader[TemplateResource], writer: RequestWriter[TemplateResource]): Future[TemplateResource] = {
    // create path and map variables
    val path = (addFmt("/campaigns/templates"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(campaignTemplateResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteCampaign(id: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/campaigns/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteCampaignTemplate(id: String,
    cascade: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/campaigns/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling CampaignsApi->deleteCampaignTemplate")

    cascade match {
      case Some(param) => queryParams += "cascade" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCampaign(id: Long)(implicit reader: ClientResponseReader[CampaignResource]): Future[CampaignResource] = {
    // create path and map variables
    val path = (addFmt("/campaigns/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCampaignChallenges(id: Long,
    filterStartDate: Option[String] = None,
    filterEndDate: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceChallengeResource]): Future[PageResourceChallengeResource] = {
    // create path and map variables
    val path = (addFmt("/campaigns/{id}/challenges")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterStartDate match {
      case Some(param) => queryParams += "filter_start_date" -> param.toString
      case _ => queryParams
    }
    filterEndDate match {
      case Some(param) => queryParams += "filter_end_date" -> param.toString
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

  def getCampaignTemplate(id: String)(implicit reader: ClientResponseReader[TemplateResource]): Future[TemplateResource] = {
    // create path and map variables
    val path = (addFmt("/campaigns/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling CampaignsApi->getCampaignTemplate")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCampaignTemplates(size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceTemplateResource]): Future[PageResourceTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/campaigns/templates"))

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

  def getCampaigns(filterActive: Option[Boolean] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceCampaignResource]): Future[PageResourceCampaignResource] = {
    // create path and map variables
    val path = (addFmt("/campaigns"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterActive match {
      case Some(param) => queryParams += "filter_active" -> param.toString
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

  def removeChallengeFromCampaign(campaignId: Long,
    id: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/campaigns/{campaign_id}/challenges/{id}")
      replaceAll ("\\{" + "campaign_id" + "\\}",campaignId.toString)
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateCampaign(id: Long,
    campaignResource: Option[CampaignResource] = None
    )(implicit reader: ClientResponseReader[CampaignResource], writer: RequestWriter[CampaignResource]): Future[CampaignResource] = {
    // create path and map variables
    val path = (addFmt("/campaigns/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(campaignResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateCampaignTemplate(id: String,
    campaignTemplateResource: Option[TemplateResource] = None
    )(implicit reader: ClientResponseReader[TemplateResource], writer: RequestWriter[TemplateResource]): Future[TemplateResource] = {
    // create path and map variables
    val path = (addFmt("/campaigns/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling CampaignsApi->updateCampaignTemplate")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(campaignTemplateResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
