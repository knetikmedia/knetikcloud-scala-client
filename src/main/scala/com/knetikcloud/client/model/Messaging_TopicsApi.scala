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

import com.knetikcloud.client.model.PageResourceTopicResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.TopicSubscriberResource
import com.knetikcloud.client.model.ValueWrapperboolean
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

class Messaging_TopicsApi(val defBasePath: String = "https://jsapi-integration.us-east-1.elasticbeanstalk.com",
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
  val helper = new Messaging_TopicsApiAsyncHelper(client, config)

  /**
   * Enable or disable messages for a user
   * Useful for opt-out options on a single topic. Consider multiple topics for multiple opt-out options. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param id The id of the topic 
   * @param userId The id of the subscriber or &#39;me&#39; 
   * @param disabled disabled 
   * @return void
   */
  def disableTopicSubscriber(id: String, userId: String, disabled: ValueWrapperboolean) = {
    val await = Try(Await.result(disableTopicSubscriberAsync(id, userId, disabled), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Enable or disable messages for a user asynchronously
   * Useful for opt-out options on a single topic. Consider multiple topics for multiple opt-out options. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param id The id of the topic 
   * @param userId The id of the subscriber or &#39;me&#39; 
   * @param disabled disabled 
   * @return Future(void)
  */
  def disableTopicSubscriberAsync(id: String, userId: String, disabled: ValueWrapperboolean) = {
      helper.disableTopicSubscriber(id, userId, disabled)
  }


  /**
   * Get a subscriber to a topic
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param id The id of the topic 
   * @param userId The id of the subscriber or &#39;me&#39; 
   * @return TopicSubscriberResource
   */
  def getTopicSubscriber(id: String, userId: String): Option[TopicSubscriberResource] = {
    val await = Try(Await.result(getTopicSubscriberAsync(id, userId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a subscriber to a topic asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param id The id of the topic 
   * @param userId The id of the subscriber or &#39;me&#39; 
   * @return Future(TopicSubscriberResource)
  */
  def getTopicSubscriberAsync(id: String, userId: String): Future[TopicSubscriberResource] = {
      helper.getTopicSubscriber(id, userId)
  }


  /**
   * Get all messaging topics for a given user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param id The id of the user or &#39;me&#39; 
   * @return PageResourceTopicResource
   */
  def getUserTopics(id: String): Option[PageResourceTopicResource] = {
    val await = Try(Await.result(getUserTopicsAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get all messaging topics for a given user asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param id The id of the user or &#39;me&#39; 
   * @return Future(PageResourceTopicResource)
  */
  def getUserTopicsAsync(id: String): Future[PageResourceTopicResource] = {
      helper.getUserTopics(id)
  }


}

class Messaging_TopicsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def disableTopicSubscriber(id: String,
    userId: String,
    disabled: ValueWrapperboolean)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[ValueWrapperboolean]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/messaging/topics/{id}/subscribers/{user_id}/disabled")
      replaceAll ("\\{" + "id" + "\\}",id.toString)
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Messaging_TopicsApi->disableTopicSubscriber")

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling Messaging_TopicsApi->disableTopicSubscriber")

    if (disabled == null) throw new Exception("Missing required parameter 'disabled' when calling Messaging_TopicsApi->disableTopicSubscriber")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(disabled))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getTopicSubscriber(id: String,
    userId: String)(implicit reader: ClientResponseReader[TopicSubscriberResource]): Future[TopicSubscriberResource] = {
    // create path and map variables
    val path = (addFmt("/messaging/topics/{id}/subscribers/{user_id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString)
      replaceAll ("\\{" + "user_id" + "\\}",userId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Messaging_TopicsApi->getTopicSubscriber")

    if (userId == null) throw new Exception("Missing required parameter 'userId' when calling Messaging_TopicsApi->getTopicSubscriber")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getUserTopics(id: String)(implicit reader: ClientResponseReader[PageResourceTopicResource]): Future[PageResourceTopicResource] = {
    // create path and map variables
    val path = (addFmt("/users/{id}/topics")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Messaging_TopicsApi->getUserTopics")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}