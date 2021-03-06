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

import com.knetikcloud.client.model.BooleanResource
import com.knetikcloud.client.model.BreRule
import com.knetikcloud.client.model.Expressionobject
import com.knetikcloud.client.model.PageResourceBreRule
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

class Rule_Engine_RulesApi(val defBasePath: String = "https://jsapi-integration.us-east-1.elasticbeanstalk.com",
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
  val helper = new Rule_Engine_RulesApiAsyncHelper(client, config)

  /**
   * Create a rule
   * Rules define which actions to run when a given event verifies the specified condition. Full list of predicates and other type of expressions can be found at GET /bre/expressions/. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param breRule The BRE rule object (optional)
   * @return BreRule
   */
  def createBRERule(breRule: Option[BreRule] = None): Option[BreRule] = {
    val await = Try(Await.result(createBRERuleAsync(breRule), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a rule asynchronously
   * Rules define which actions to run when a given event verifies the specified condition. Full list of predicates and other type of expressions can be found at GET /bre/expressions/. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param breRule The BRE rule object (optional)
   * @return Future(BreRule)
  */
  def createBRERuleAsync(breRule: Option[BreRule] = None): Future[BreRule] = {
      helper.createBRERule(breRule)
  }


  /**
   * Delete a rule
   * May fail if there are existing rules against it. Cannot delete core rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param id The id of the rule 
   * @return void
   */
  def deleteBRERule(id: String) = {
    val await = Try(Await.result(deleteBRERuleAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a rule asynchronously
   * May fail if there are existing rules against it. Cannot delete core rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param id The id of the rule 
   * @return Future(void)
  */
  def deleteBRERuleAsync(id: String) = {
      helper.deleteBRERule(id)
  }


  /**
   * Returns a string representation of the provided expression
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param expression The expression (optional)
   * @return String
   */
  def getBREExpressionAsString(expression: Option[Expressionobject] = None): Option[String] = {
    val await = Try(Await.result(getBREExpressionAsStringAsync(expression), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Returns a string representation of the provided expression asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param expression The expression (optional)
   * @return Future(String)
  */
  def getBREExpressionAsStringAsync(expression: Option[Expressionobject] = None): Future[String] = {
      helper.getBREExpressionAsString(expression)
  }


  /**
   * Get a single rule
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param id The id of the rule 
   * @return BreRule
   */
  def getBRERule(id: String): Option[BreRule] = {
    val await = Try(Await.result(getBRERuleAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single rule asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param id The id of the rule 
   * @return Future(BreRule)
  */
  def getBRERuleAsync(id: String): Future[BreRule] = {
      helper.getBRERule(id)
  }


  /**
   * List rules
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param filterName Filter for rules containing the given name (optional)
   * @param filterEnabled Filter for rules by active status, null for both (optional, default to null)
   * @param filterSystem Filter for rules that are system rules when true, or not when false. Leave off for both mixed (optional)
   * @param filterTrigger Filter for rules that are for the trigger with the given name (optional)
   * @param filterAction Filter for rules that use the action with the given name (optional)
   * @param filterCondition Filter for rules that have a condition containing the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceBreRule
   */
  def getBRERules(filterName: Option[String] = None, filterEnabled: Option[Boolean] /* = null*/, filterSystem: Option[Boolean] = None, filterTrigger: Option[String] = None, filterAction: Option[String] = None, filterCondition: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceBreRule] = {
    val await = Try(Await.result(getBRERulesAsync(filterName, filterEnabled, filterSystem, filterTrigger, filterAction, filterCondition, size, page), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List rules asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param filterName Filter for rules containing the given name (optional)
   * @param filterEnabled Filter for rules by active status, null for both (optional, default to null)
   * @param filterSystem Filter for rules that are system rules when true, or not when false. Leave off for both mixed (optional)
   * @param filterTrigger Filter for rules that are for the trigger with the given name (optional)
   * @param filterAction Filter for rules that use the action with the given name (optional)
   * @param filterCondition Filter for rules that have a condition containing the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Future(PageResourceBreRule)
  */
  def getBRERulesAsync(filterName: Option[String] = None, filterEnabled: Option[Boolean] /* = null*/, filterSystem: Option[Boolean] = None, filterTrigger: Option[String] = None, filterAction: Option[String] = None, filterCondition: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Future[PageResourceBreRule] = {
      helper.getBRERules(filterName, filterEnabled, filterSystem, filterTrigger, filterAction, filterCondition, size, page)
  }


  /**
   * Enable or disable a rule
   * This is helpful for turning off systems rules which cannot be deleted or modified otherwise. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param id The id of the rule 
   * @param enabled The boolean value (optional)
   * @return void
   */
  def setBRERule(id: String, enabled: Option[BooleanResource] = None) = {
    val await = Try(Await.result(setBRERuleAsync(id, enabled), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Enable or disable a rule asynchronously
   * This is helpful for turning off systems rules which cannot be deleted or modified otherwise. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param id The id of the rule 
   * @param enabled The boolean value (optional)
   * @return Future(void)
  */
  def setBRERuleAsync(id: String, enabled: Option[BooleanResource] = None) = {
      helper.setBRERule(id, enabled)
  }


  /**
   * Update a rule
   * Cannot update system rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param id The id of the rule 
   * @param breRule The BRE rule object (optional)
   * @return BreRule
   */
  def updateBRERule(id: String, breRule: Option[BreRule] = None): Option[BreRule] = {
    val await = Try(Await.result(updateBRERuleAsync(id, breRule), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update a rule asynchronously
   * Cannot update system rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
   * @param id The id of the rule 
   * @param breRule The BRE rule object (optional)
   * @return Future(BreRule)
  */
  def updateBRERuleAsync(id: String, breRule: Option[BreRule] = None): Future[BreRule] = {
      helper.updateBRERule(id, breRule)
  }


}

class Rule_Engine_RulesApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createBRERule(breRule: Option[BreRule] = None
    )(implicit reader: ClientResponseReader[BreRule], writer: RequestWriter[BreRule]): Future[BreRule] = {
    // create path and map variables
    val path = (addFmt("/bre/rules"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(breRule))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteBRERule(id: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/bre/rules/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Rule_Engine_RulesApi->deleteBRERule")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getBREExpressionAsString(expression: Option[Expressionobject] = None
    )(implicit reader: ClientResponseReader[String], writer: RequestWriter[Expressionobject]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/bre/rules/expression-as-string"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(expression))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getBRERule(id: String)(implicit reader: ClientResponseReader[BreRule]): Future[BreRule] = {
    // create path and map variables
    val path = (addFmt("/bre/rules/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Rule_Engine_RulesApi->getBRERule")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getBRERules(filterName: Option[String] = None,
    filterEnabled: Option[Boolean] = Some(null),
    filterSystem: Option[Boolean] = None,
    filterTrigger: Option[String] = None,
    filterAction: Option[String] = None,
    filterCondition: Option[String] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1)
    )(implicit reader: ClientResponseReader[PageResourceBreRule]): Future[PageResourceBreRule] = {
    // create path and map variables
    val path = (addFmt("/bre/rules"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterName match {
      case Some(param) => queryParams += "filter_name" -> param.toString
      case _ => queryParams
    }
    filterEnabled match {
      case Some(param) => queryParams += "filter_enabled" -> param.toString
      case _ => queryParams
    }
    filterSystem match {
      case Some(param) => queryParams += "filter_system" -> param.toString
      case _ => queryParams
    }
    filterTrigger match {
      case Some(param) => queryParams += "filter_trigger" -> param.toString
      case _ => queryParams
    }
    filterAction match {
      case Some(param) => queryParams += "filter_action" -> param.toString
      case _ => queryParams
    }
    filterCondition match {
      case Some(param) => queryParams += "filter_condition" -> param.toString
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

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setBRERule(id: String,
    enabled: Option[BooleanResource] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[BooleanResource]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/bre/rules/{id}/enabled")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Rule_Engine_RulesApi->setBRERule")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(enabled))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateBRERule(id: String,
    breRule: Option[BreRule] = None
    )(implicit reader: ClientResponseReader[BreRule], writer: RequestWriter[BreRule]): Future[BreRule] = {
    // create path and map variables
    val path = (addFmt("/bre/rules/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Rule_Engine_RulesApi->updateBRERule")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(breRule))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
