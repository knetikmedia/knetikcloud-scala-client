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

import com.knetikcloud.client.model.ArtistResource
import com.knetikcloud.client.model.PageResourceArtistResource
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

class Media_ArtistsApi(val defBasePath: String = "https://jsapi-integration.us-east-1.elasticbeanstalk.com",
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
  val helper = new Media_ArtistsApiAsyncHelper(client, config)

  /**
   * Adds a new artist in the system
   * Adds a new artist in the system. Use specific media contributions endpoint to add contributions. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param artistResource The new artist (optional)
   * @return ArtistResource
   */
  def addArtist(artistResource: Option[ArtistResource] = None): Option[ArtistResource] = {
    val await = Try(Await.result(addArtistAsync(artistResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Adds a new artist in the system asynchronously
   * Adds a new artist in the system. Use specific media contributions endpoint to add contributions. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param artistResource The new artist (optional)
   * @return Future(ArtistResource)
  */
  def addArtistAsync(artistResource: Option[ArtistResource] = None): Future[ArtistResource] = {
      helper.addArtist(artistResource)
  }


  /**
   * Create an artist template
   * Artist Templates define a type of artist and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param artistTemplateResource The artist template resource object (optional)
   * @return TemplateResource
   */
  def createArtistTemplate(artistTemplateResource: Option[TemplateResource] = None): Option[TemplateResource] = {
    val await = Try(Await.result(createArtistTemplateAsync(artistTemplateResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create an artist template asynchronously
   * Artist Templates define a type of artist and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param artistTemplateResource The artist template resource object (optional)
   * @return Future(TemplateResource)
  */
  def createArtistTemplateAsync(artistTemplateResource: Option[TemplateResource] = None): Future[TemplateResource] = {
      helper.createArtistTemplate(artistTemplateResource)
  }


  /**
   * Removes an artist from the system IF no resources are attached to it
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ARTISTS_ADMIN
   * @param id The artist id 
   * @return void
   */
  def deleteArtist(id: Long) = {
    val await = Try(Await.result(deleteArtistAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Removes an artist from the system IF no resources are attached to it asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ARTISTS_ADMIN
   * @param id The artist id 
   * @return Future(void)
  */
  def deleteArtistAsync(id: Long) = {
      helper.deleteArtist(id)
  }


  /**
   * Delete an artist template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return void
   */
  def deleteArtistTemplate(id: String, cascade: Option[String] = None) = {
    val await = Try(Await.result(deleteArtistTemplateAsync(id, cascade), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete an artist template asynchronously
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return Future(void)
  */
  def deleteArtistTemplateAsync(id: String, cascade: Option[String] = None) = {
      helper.deleteArtistTemplate(id, cascade)
  }


  /**
   * Loads a specific artist details
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The artist id 
   * @param showContributions The number of contributions to show fetch (optional)
   * @return ArtistResource
   */
  def getArtist(id: Long, showContributions: Option[Integer] = None): Option[ArtistResource] = {
    val await = Try(Await.result(getArtistAsync(id, showContributions), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Loads a specific artist details asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The artist id 
   * @param showContributions The number of contributions to show fetch (optional)
   * @return Future(ArtistResource)
  */
  def getArtistAsync(id: Long, showContributions: Option[Integer] = None): Future[ArtistResource] = {
      helper.getArtist(id, showContributions)
  }


  /**
   * Get a single artist template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ARTISTS_ADMIN
   * @param id The id of the template 
   * @return TemplateResource
   */
  def getArtistTemplate(id: String): Option[TemplateResource] = {
    val await = Try(Await.result(getArtistTemplateAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single artist template asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ARTISTS_ADMIN
   * @param id The id of the template 
   * @return Future(TemplateResource)
  */
  def getArtistTemplateAsync(id: String): Future[TemplateResource] = {
      helper.getArtistTemplate(id)
  }


  /**
   * List and search artist templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ARTISTS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   */
  def getArtistTemplates(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceTemplateResource] = {
    val await = Try(Await.result(getArtistTemplatesAsync(size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search artist templates asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ARTISTS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceTemplateResource)
  */
  def getArtistTemplatesAsync(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceTemplateResource] = {
      helper.getArtistTemplates(size, page, order)
  }


  /**
   * Search for artists
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterArtistsByName Filter for artists which name *STARTS* with the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceArtistResource
   */
  def getArtists(filterArtistsByName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceArtistResource] = {
    val await = Try(Await.result(getArtistsAsync(filterArtistsByName, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Search for artists asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterArtistsByName Filter for artists which name *STARTS* with the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceArtistResource)
  */
  def getArtistsAsync(filterArtistsByName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceArtistResource] = {
      helper.getArtists(filterArtistsByName, size, page, order)
  }


  /**
   * Modifies an artist details
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ARTISTS_ADMIN
   * @param id The artist id 
   * @param artistResource The new artist (optional)
   * @return void
   */
  def updateArtist(id: Long, artistResource: Option[ArtistResource] = None) = {
    val await = Try(Await.result(updateArtistAsync(id, artistResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Modifies an artist details asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ARTISTS_ADMIN
   * @param id The artist id 
   * @param artistResource The new artist (optional)
   * @return Future(void)
  */
  def updateArtistAsync(id: Long, artistResource: Option[ArtistResource] = None) = {
      helper.updateArtist(id, artistResource)
  }


  /**
   * Update an artist template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @param artistTemplateResource The artist template resource object (optional)
   * @return TemplateResource
   */
  def updateArtistTemplate(id: String, artistTemplateResource: Option[TemplateResource] = None): Option[TemplateResource] = {
    val await = Try(Await.result(updateArtistTemplateAsync(id, artistTemplateResource), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update an artist template asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template 
   * @param artistTemplateResource The artist template resource object (optional)
   * @return Future(TemplateResource)
  */
  def updateArtistTemplateAsync(id: String, artistTemplateResource: Option[TemplateResource] = None): Future[TemplateResource] = {
      helper.updateArtistTemplate(id, artistTemplateResource)
  }


}

class Media_ArtistsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addArtist(artistResource: Option[ArtistResource] = None
    )(implicit reader: ClientResponseReader[ArtistResource], writer: RequestWriter[ArtistResource]): Future[ArtistResource] = {
    // create path and map variables
    val path = (addFmt("/media/artists"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(artistResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createArtistTemplate(artistTemplateResource: Option[TemplateResource] = None
    )(implicit reader: ClientResponseReader[TemplateResource], writer: RequestWriter[TemplateResource]): Future[TemplateResource] = {
    // create path and map variables
    val path = (addFmt("/media/artists/templates"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(artistTemplateResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteArtist(id: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/media/artists/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteArtistTemplate(id: String,
    cascade: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/media/artists/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Media_ArtistsApi->deleteArtistTemplate")

    cascade match {
      case Some(param) => queryParams += "cascade" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getArtist(id: Long,
    showContributions: Option[Integer] = None
    )(implicit reader: ClientResponseReader[ArtistResource]): Future[ArtistResource] = {
    // create path and map variables
    val path = (addFmt("/media/artists/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    showContributions match {
      case Some(param) => queryParams += "show_contributions" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getArtistTemplate(id: String)(implicit reader: ClientResponseReader[TemplateResource]): Future[TemplateResource] = {
    // create path and map variables
    val path = (addFmt("/media/artists/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Media_ArtistsApi->getArtistTemplate")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getArtistTemplates(size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceTemplateResource]): Future[PageResourceTemplateResource] = {
    // create path and map variables
    val path = (addFmt("/media/artists/templates"))

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

  def getArtists(filterArtistsByName: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceArtistResource]): Future[PageResourceArtistResource] = {
    // create path and map variables
    val path = (addFmt("/media/artists"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterArtistsByName match {
      case Some(param) => queryParams += "filter_artists_by_name" -> param.toString
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

  def updateArtist(id: Long,
    artistResource: Option[ArtistResource] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[ArtistResource]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/media/artists/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(artistResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateArtistTemplate(id: String,
    artistTemplateResource: Option[TemplateResource] = None
    )(implicit reader: ClientResponseReader[TemplateResource], writer: RequestWriter[TemplateResource]): Future[TemplateResource] = {
    // create path and map variables
    val path = (addFmt("/media/artists/templates/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Media_ArtistsApi->updateArtistTemplate")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(artistTemplateResource))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
