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

import com.knetikcloud.client.model.BreTriggerResource
import com.knetikcloud.client.model.IntWrapper
import com.knetikcloud.client.model.LevelingResource
import com.knetikcloud.client.model.PageResourceLevelingResource
import com.knetikcloud.client.model.PageResourceUserLevelingResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.UserLevelingResource
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

class GamificationLevelingApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  val helper = new GamificationLevelingApiAsyncHelper(client, config)

  /**
   * Create a level schema
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param level The level schema definition (optional)
   * @return LevelingResource
   */
  def createLevel(level: Option[LevelingResource] = None): Option[LevelingResource] = {
    val await = Try(Await.result(createLevelAsync(level), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a level schema asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param level The level schema definition (optional)
   * @return Future(LevelingResource)
  */
  def createLevelAsync(level: Option[LevelingResource] = None): Future[LevelingResource] = {
      helper.createLevel(level)
  }


  /**
   * Delete a level
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param name The level schema name 
   * @return void
   */
  def deleteLevel(name: String) = {
    val await = Try(Await.result(deleteLevelAsync(name), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a level asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param name The level schema name 
   * @return Future(void)
  */
  def deleteLevelAsync(name: String) = {
      helper.deleteLevel(name)
  }


  /**
   * Retrieve a level
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param name The level schema name 
   * @return LevelingResource
   */
  def getLevel(name: String): Option[LevelingResource] = {
    val await = Try(Await.result(getLevelAsync(name), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Retrieve a level asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param name The level schema name 
   * @return Future(LevelingResource)
  */
  def getLevelAsync(name: String): Future[LevelingResource] = {
      helper.getLevel(name)
  }


  /**
   * Get the list of triggers that can be used to trigger a leveling progress update
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @return List[BreTriggerResource]
   */
  def getLevelTriggers(): Option[List[BreTriggerResource]] = {
    val await = Try(Await.result(getLevelTriggersAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get the list of triggers that can be used to trigger a leveling progress update asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @return Future(List[BreTriggerResource])
  */
  def getLevelTriggersAsync(): Future[List[BreTriggerResource]] = {
      helper.getLevelTriggers()
  }


  /**
   * List and search levels
   * Get a list of levels schemas with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param filterName Filter for level schemas whose name contains a given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return PageResourceLevelingResource
   */
  def getLevels(filterName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = name:ASC*/): Option[PageResourceLevelingResource] = {
    val await = Try(Await.result(getLevelsAsync(filterName, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List and search levels asynchronously
   * Get a list of levels schemas with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param filterName Filter for level schemas whose name contains a given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return Future(PageResourceLevelingResource)
  */
  def getLevelsAsync(filterName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = name:ASC*/): Future[PageResourceLevelingResource] = {
      helper.getLevels(filterName, size, page, order)
  }


  /**
   * Get a user&#39;s progress for a given level schema
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN or self
   * @param userId The id of the user or &#39;me&#39; 
   * @param name The level schema name 
   * @return UserLevelingResource
   */
  def getUserLevel(userId: String, name: String): Option[UserLevelingResource] = {
    val await = Try(Await.result(getUserLevelAsync(userId, name), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a user&#39;s progress for a given level schema asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN or self
   * @param userId The id of the user or &#39;me&#39; 
   * @param name The level schema name 
   * @return Future(UserLevelingResource)
  */
  def getUserLevelAsync(userId: String, name: String): Future[UserLevelingResource] = {
      helper.getUserLevel(userId, name)
  }


  /**
   * Get a user&#39;s progress for all level schemas
   * Filtering and sorting is based on the LevelingResource object, not the UserLevelingResource that is returned here. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN or self
   * @param userId The id of the user or &#39;me&#39; 
   * @param filterName Filter for level schemas whose name contains a given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return PageResourceUserLevelingResource
   */
  def getUserLevels(userId: String, filterName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] = None): Option[PageResourceUserLevelingResource] = {
    val await = Try(Await.result(getUserLevelsAsync(userId, filterName, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a user&#39;s progress for all level schemas asynchronously
   * Filtering and sorting is based on the LevelingResource object, not the UserLevelingResource that is returned here. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN or self
   * @param userId The id of the user or &#39;me&#39; 
   * @param filterName Filter for level schemas whose name contains a given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Future(PageResourceUserLevelingResource)
  */
  def getUserLevelsAsync(userId: String, filterName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] = None): Future[PageResourceUserLevelingResource] = {
      helper.getUserLevels(userId, filterName, size, page, order)
  }


  /**
   * Update or create a leveling progress record for a user
   * If no progress record yet exists for the user, it will be created. Otherwise the provided value will be added to it. May be negative. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param userId The id of the user 
   * @param name The level schema name 
   * @param progress The amount of progress to add (optional)
   * @return void
   */
  def incrementProgress(userId: Integer, name: String, progress: Option[IntWrapper] = None) = {
    val await = Try(Await.result(incrementProgressAsync(userId, name, progress), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update or create a leveling progress record for a user asynchronously
   * If no progress record yet exists for the user, it will be created. Otherwise the provided value will be added to it. May be negative. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param userId The id of the user 
   * @param name The level schema name 
   * @param progress The amount of progress to add (optional)
   * @return Future(void)
  */
  def incrementProgressAsync(userId: Integer, name: String, progress: Option[IntWrapper] = None) = {
      helper.incrementProgress(userId, name, progress)
  }


  /**
   * Set leveling progress for a user
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated to the provided value. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param userId The id of the user 
   * @param name The level schema name 
   * @param progress The new progress amount (optional)
   * @return void
   */
  def setProgress(userId: Integer, name: String, progress: Option[IntWrapper] = None) = {
    val await = Try(Await.result(setProgressAsync(userId, name, progress), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Set leveling progress for a user asynchronously
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated to the provided value. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param userId The id of the user 
   * @param name The level schema name 
   * @param progress The new progress amount (optional)
   * @return Future(void)
  */
  def setProgressAsync(userId: Integer, name: String, progress: Option[IntWrapper] = None) = {
      helper.setProgress(userId, name, progress)
  }


  /**
   * Update a level
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param name The level schema name 
   * @param newLevel The level schema definition (optional)
   * @return LevelingResource
   */
  def updateLevel(name: String, newLevel: Option[LevelingResource] = None): Option[LevelingResource] = {
    val await = Try(Await.result(updateLevelAsync(name, newLevel), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a level asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param name The level schema name 
   * @param newLevel The level schema definition (optional)
   * @return Future(LevelingResource)
  */
  def updateLevelAsync(name: String, newLevel: Option[LevelingResource] = None): Future[LevelingResource] = {
      helper.updateLevel(name, newLevel)
  }


}

class GamificationLevelingApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createLevel(level: Option[LevelingResource] = None
    )(implicit reader: ClientResponseReader[LevelingResource], writer: RequestWriter[LevelingResource]): Future[LevelingResource] = {
    // create path and map variables
    val path = (addFmt("/leveling"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(level))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteLevel(name: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/leveling/{name}")
      replaceAll ("\\{" + "name" + "\\}",name.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationLevelingApi->deleteLevel")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getLevel(name: String)(implicit reader: ClientResponseReader[LevelingResource]): Future[LevelingResource] = {
    // create path and map variables
    val path = (addFmt("/leveling/{name}")
      replaceAll ("\\{" + "name" + "\\}",name.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationLevelingApi->getLevel")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getLevelTriggers()(implicit reader: ClientResponseReader[List[BreTriggerResource]]): Future[List[BreTriggerResource]] = {
    // create path and map variables
    val path = (addFmt("/leveling/triggers"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getLevels(filterName: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(name:ASC)
    )(implicit reader: ClientResponseReader[PageResourceLevelingResource]): Future[PageResourceLevelingResource] = {
    // create path and map variables
    val path = (addFmt("/leveling"))

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

  def getUserLevel(userId: String,
    name: String)(implicit reader: ClientResponseReader[UserLevelingResource]): Future[UserLevelingResource] = {
    // create path and map variables
    val path = (addFmt("/users/{user_id}/leveling/{name}")
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString)
      replaceAll ("\\{" + "name" + "\\}",name.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling GamificationLevelingApi->getUserLevel")

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationLevelingApi->getUserLevel")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getUserLevels(userId: String,
    filterName: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = None
    )(implicit reader: ClientResponseReader[PageResourceUserLevelingResource]): Future[PageResourceUserLevelingResource] = {
    // create path and map variables
    val path = (addFmt("/users/{user_id}/leveling")
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling GamificationLevelingApi->getUserLevels")

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

  def incrementProgress(userId: Integer,
    name: String,
    progress: Option[IntWrapper] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[IntWrapper]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/users/{user_id}/leveling/{name}/progress")
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString)
      replaceAll ("\\{" + "name" + "\\}",name.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationLevelingApi->incrementProgress")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(progress))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setProgress(userId: Integer,
    name: String,
    progress: Option[IntWrapper] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[IntWrapper]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/users/{user_id}/leveling/{name}/progress")
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString)
      replaceAll ("\\{" + "name" + "\\}",name.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationLevelingApi->setProgress")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(progress))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateLevel(name: String,
    newLevel: Option[LevelingResource] = None
    )(implicit reader: ClientResponseReader[LevelingResource], writer: RequestWriter[LevelingResource]): Future[LevelingResource] = {
    // create path and map variables
    val path = (addFmt("/leveling/{name}")
      replaceAll ("\\{" + "name" + "\\}",name.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationLevelingApi->updateLevel")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(newLevel))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
