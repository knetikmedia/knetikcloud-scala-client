/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import io.swagger.client.model.AchievementDefinitionResource
import io.swagger.client.model.AchievementProgressUpdateRequest
import io.swagger.client.model.BreTriggerResource
import io.swagger.client.model.PageAchievementDefinitionResource
import io.swagger.client.model.PageTemplateResource
import io.swagger.client.model.PageUserAchievementGroupResource
import io.swagger.client.model.TemplateResource
import io.swagger.client.model.UserAchievementGroupResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class GamificationAchievementsApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Create a new achievement definition
   * If the definition contains a trigger event name, a BRE rule is created, so that tracking logic is executed when the triggering event occurs. If no trigger event name is specified, the user&#39;s achievement status must manually be updated via the API.
   * @param achievement The achievement definition (optional)
   * @return AchievementDefinitionResource
   */
  def createAchievementUsingPOST(achievement: Option[AchievementDefinitionResource] = None): Option[AchievementDefinitionResource] = {
    // create path and map variables
    val path = "/achievements".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = achievement.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[AchievementDefinitionResource]).asInstanceOf[AchievementDefinitionResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create an achievement template
   * Achievement templates define a type of achievement and the properties they have
   * @param template The achievement template to be created (optional)
   * @return TemplateResource
   */
  def createTemplateUsingPOST(template: Option[TemplateResource] = None): Option[TemplateResource] = {
    // create path and map variables
    val path = "/achievements/templates".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = template.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[TemplateResource]).asInstanceOf[TemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete an achievement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return void
   */
  def deleteAchievementTemplateUsingDELETE(id: String, cascade: Option[String] = None) = {
    // create path and map variables
    val path = "/achievements/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling GamificationAchievementsApi->deleteAchievementTemplateUsingDELETE")

    cascade.map(paramVal => queryParams += "cascade" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete an achievement definition
   * Will also disable the associated generated rule, if any.
   * @param name The name of the achievement 
   * @return void
   */
  def deleteAchievementUsingDELETE(name: String) = {
    // create path and map variables
    val path = "/achievements/{name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "name" + "\\}",apiInvoker.escape(name))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationAchievementsApi->deleteAchievementUsingDELETE")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a list of derived achievements
   * Used by other services that depend on achievements
   * @param name The name of the derived achievement 
   * @return List[AchievementDefinitionResource]
   */
  def findAllByGroupNameUsingGET(name: String): Option[List[AchievementDefinitionResource]] = {
    // create path and map variables
    val path = "/achievements/derived/{name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "name" + "\\}",apiInvoker.escape(name))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationAchievementsApi->findAllByGroupNameUsingGET")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[AchievementDefinitionResource]).asInstanceOf[List[AchievementDefinitionResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single achievement template
   * 
   * @param id The id of the template 
   * @return TemplateResource
   */
  def getAchievementTemplateUsingGET(id: String): Option[TemplateResource] = {
    // create path and map variables
    val path = "/achievements/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling GamificationAchievementsApi->getAchievementTemplateUsingGET")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[TemplateResource]).asInstanceOf[TemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List and search achievement templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageTemplateResource
   */
  def getAchievementTemplatesUsingGET(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageTemplateResource] = {
    // create path and map variables
    val path = "/achievements/templates".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    order.map(paramVal => queryParams += "order" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[PageTemplateResource]).asInstanceOf[PageTemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single achievement definition
   * 
   * @param name The name of the achievement 
   * @return AchievementDefinitionResource
   */
  def getAchievementUsingGET(name: String): Option[AchievementDefinitionResource] = {
    // create path and map variables
    val path = "/achievements/{name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "name" + "\\}",apiInvoker.escape(name))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationAchievementsApi->getAchievementUsingGET")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[AchievementDefinitionResource]).asInstanceOf[AchievementDefinitionResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get all achievement definitions in the system
   * 
   * @param filterTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterName Filter for achievements whose name contains a string (optional)
   * @param filterHidden Filter for achievements that are hidden or not (optional)
   * @param filterDerived Filter for achievements that are derived from other services (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return PageAchievementDefinitionResource
   */
  def getAchievementsUsingGET(filterTagset: Option[String] = None, filterName: Option[String] = None, filterHidden: Option[Boolean] = None, filterDerived: Option[Boolean] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = name:ASC*/): Option[PageAchievementDefinitionResource] = {
    // create path and map variables
    val path = "/achievements".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterTagset.map(paramVal => queryParams += "filter_tagset" -> paramVal.toString)
    filterName.map(paramVal => queryParams += "filter_name" -> paramVal.toString)
    filterHidden.map(paramVal => queryParams += "filter_hidden" -> paramVal.toString)
    filterDerived.map(paramVal => queryParams += "filter_derived" -> paramVal.toString)
    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    order.map(paramVal => queryParams += "order" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[PageAchievementDefinitionResource]).asInstanceOf[PageAchievementDefinitionResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve progress on a given achievement for all users
   * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.
   * @param achievementName The achievement&#39;s name 
   * @param filterAchievementDerived Filter for achievements that are derived from other services (optional)
   * @param filterAchievementTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterAchievementHidden Filter for achievements that are hidden or not (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageUserAchievementGroupResource
   */
  def getAllUserProgressForAchievementUsingGET(achievementName: String, filterAchievementDerived: Option[Boolean] = None, filterAchievementTagset: Option[String] = None, filterAchievementHidden: Option[Boolean] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageUserAchievementGroupResource] = {
    // create path and map variables
    val path = "/users/achievements/{achievement_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "achievement_name" + "\\}",apiInvoker.escape(achievementName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (achievementName == null) throw new Exception("Missing required parameter 'achievementName' when calling GamificationAchievementsApi->getAllUserProgressForAchievementUsingGET")

    filterAchievementDerived.map(paramVal => queryParams += "filter_achievement_derived" -> paramVal.toString)
    filterAchievementTagset.map(paramVal => queryParams += "filter_achievement_tagset" -> paramVal.toString)
    filterAchievementHidden.map(paramVal => queryParams += "filter_achievement_hidden" -> paramVal.toString)
    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[PageUserAchievementGroupResource]).asInstanceOf[PageUserAchievementGroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve progress on achievements for all users
   * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.
   * @param filterAchievementDerived Filter for achievements that are derived from other services (optional)
   * @param filterAchievementTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterAchievementName Filter for achievements whose name contains a string (optional)
   * @param filterAchievementHidden Filter for achievements that are hidden or not (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageUserAchievementGroupResource
   */
  def getAllUserProgressUsingGET(filterAchievementDerived: Option[Boolean] = None, filterAchievementTagset: Option[String] = None, filterAchievementName: Option[String] = None, filterAchievementHidden: Option[Boolean] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageUserAchievementGroupResource] = {
    // create path and map variables
    val path = "/users/achievements".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterAchievementDerived.map(paramVal => queryParams += "filter_achievement_derived" -> paramVal.toString)
    filterAchievementTagset.map(paramVal => queryParams += "filter_achievement_tagset" -> paramVal.toString)
    filterAchievementName.map(paramVal => queryParams += "filter_achievement_name" -> paramVal.toString)
    filterAchievementHidden.map(paramVal => queryParams += "filter_achievement_hidden" -> paramVal.toString)
    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[PageUserAchievementGroupResource]).asInstanceOf[PageUserAchievementGroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get the list of triggers that can be used to trigger an achievement progress update
   * 
   * @return List[BreTriggerResource]
   */
  def getAvailableTriggersUsingGET(): Option[List[BreTriggerResource]] = {
    // create path and map variables
    val path = "/achievements/triggers".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[BreTriggerResource]).asInstanceOf[List[BreTriggerResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve progress on a given achievement for a given user
   * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.
   * @param userId The user&#39;s id 
   * @param achievementName The achievement&#39;s name 
   * @return UserAchievementGroupResource
   */
  def getUserProgressForAchievementUsingGET(userId: Integer, achievementName: String): Option[UserAchievementGroupResource] = {
    // create path and map variables
    val path = "/users/{user_id}/achievements/{achievement_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "achievement_name" + "\\}",apiInvoker.escape(achievementName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (achievementName == null) throw new Exception("Missing required parameter 'achievementName' when calling GamificationAchievementsApi->getUserProgressForAchievementUsingGET")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[UserAchievementGroupResource]).asInstanceOf[UserAchievementGroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve progress on achievements for a given user
   * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.
   * @param userId The user&#39;s id 
   * @param filterAchievementDerived Filter for achievements that are derived from other services (optional)
   * @param filterAchievementTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterAchievementName Filter for achievements whose name contains a string (optional)
   * @param filterAchievementHidden Filter for achievements that are hidden or not (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageUserAchievementGroupResource
   */
  def getUserProgressUsingGET(userId: Integer, filterAchievementDerived: Option[Boolean] = None, filterAchievementTagset: Option[String] = None, filterAchievementName: Option[String] = None, filterAchievementHidden: Option[Boolean] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageUserAchievementGroupResource] = {
    // create path and map variables
    val path = "/users/{user_id}/achievements".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterAchievementDerived.map(paramVal => queryParams += "filter_achievement_derived" -> paramVal.toString)
    filterAchievementTagset.map(paramVal => queryParams += "filter_achievement_tagset" -> paramVal.toString)
    filterAchievementName.map(paramVal => queryParams += "filter_achievement_name" -> paramVal.toString)
    filterAchievementHidden.map(paramVal => queryParams += "filter_achievement_hidden" -> paramVal.toString)
    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[PageUserAchievementGroupResource]).asInstanceOf[PageUserAchievementGroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update an achievement definition
   * The existing generated rule, if any, will be deleted. A new rule will be created if a trigger event name is specified in the new version.
   * @param name The name of the achievement 
   * @param achievement The achievement definition (optional)
   * @return void
   */
  def updateAchievementUsingPUT(name: String, achievement: Option[AchievementDefinitionResource] = None) = {
    // create path and map variables
    val path = "/achievements/{name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "name" + "\\}",apiInvoker.escape(name))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationAchievementsApi->updateAchievementUsingPUT")

    

    var postBody: AnyRef = achievement.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update or create an achievement progress record for a user
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
   * @param userId The user&#39;s id 
   * @param achievementName The achievement&#39;s name 
   * @param request The progress update details (optional)
   * @return UserAchievementGroupResource
   */
  def updateProgressUsingPUT(userId: Integer, achievementName: String, request: Option[AchievementProgressUpdateRequest] = None): Option[UserAchievementGroupResource] = {
    // create path and map variables
    val path = "/users/{user_id}/achievements/{achievement_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "achievement_name" + "\\}",apiInvoker.escape(achievementName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (achievementName == null) throw new Exception("Missing required parameter 'achievementName' when calling GamificationAchievementsApi->updateProgressUsingPUT")

    

    var postBody: AnyRef = request.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[UserAchievementGroupResource]).asInstanceOf[UserAchievementGroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update an achievement template
   * 
   * @param id The id of the template 
   * @param template The updated template (optional)
   * @return void
   */
  def updateTemplateUsingPUT(id: String, template: Option[TemplateResource] = None) = {
    // create path and map variables
    val path = "/achievements/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling GamificationAchievementsApi->updateTemplateUsingPUT")

    

    var postBody: AnyRef = template.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
