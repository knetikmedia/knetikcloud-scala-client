/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.knetikcloud.client.model

import com.knetikcloud.client.model.AchievementDefinitionResource
import com.knetikcloud.client.model.BreTriggerResource
import com.knetikcloud.client.model.PageResourceAchievementDefinitionResource
import com.knetikcloud.client.model.PageResourceTemplateResource
import com.knetikcloud.client.model.PageResourceUserAchievementGroupResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.TemplateResource
import com.knetikcloud.client.model.UserAchievementGroupResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class GamificationAchievementsApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  def createAchievement(achievement: Option[AchievementDefinitionResource] = None): Option[AchievementDefinitionResource] = {
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
           Some(apiInvoker.deserialize(s, "", classOf[AchievementDefinitionResource]).asInstanceOf[AchievementDefinitionResource])
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
  def createAchievementTemplate(template: Option[TemplateResource] = None): Option[TemplateResource] = {
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
           Some(apiInvoker.deserialize(s, "", classOf[TemplateResource]).asInstanceOf[TemplateResource])
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
  def deleteAchievement(name: String) = {
    // create path and map variables
    val path = "/achievements/{name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "name" + "\\}",apiInvoker.escape(name))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationAchievementsApi->deleteAchievement")

    

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
   * Delete an achievement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return void
   */
  def deleteAchievementTemplate(id: String, cascade: Option[String] = None) = {
    // create path and map variables
    val path = "/achievements/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling GamificationAchievementsApi->deleteAchievementTemplate")

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
   * Get a single achievement definition
   * 
   * @param name The name of the achievement 
   * @return AchievementDefinitionResource
   */
  def getAchievement(name: String): Option[AchievementDefinitionResource] = {
    // create path and map variables
    val path = "/achievements/{name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "name" + "\\}",apiInvoker.escape(name))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationAchievementsApi->getAchievement")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[AchievementDefinitionResource]).asInstanceOf[AchievementDefinitionResource])
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
  def getAchievementTemplate(id: String): Option[TemplateResource] = {
    // create path and map variables
    val path = "/achievements/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling GamificationAchievementsApi->getAchievementTemplate")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[TemplateResource]).asInstanceOf[TemplateResource])
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
   * @return PageResourceTemplateResource
   */
  def getAchievementTemplates(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceTemplateResource] = {
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceTemplateResource]).asInstanceOf[PageResourceTemplateResource])
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
  def getAchievementTriggers(): Option[List[BreTriggerResource]] = {
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
           Some(apiInvoker.deserialize(s, "array", classOf[BreTriggerResource]).asInstanceOf[List[BreTriggerResource]])
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
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @param filterDerived Filter for achievements that are derived from other services (optional, default to false)
   * @return PageResourceAchievementDefinitionResource
   */
  def getAchievements(filterTagset: Option[String] = None, filterName: Option[String] = None, filterHidden: Option[Boolean] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = name:ASC*/, filterDerived: Option[Boolean] /* = false*/): Option[PageResourceAchievementDefinitionResource] = {
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
    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    order.map(paramVal => queryParams += "order" -> paramVal.toString)
    filterDerived.map(paramVal => queryParams += "filter_derived" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceAchievementDefinitionResource]).asInstanceOf[PageResourceAchievementDefinitionResource])
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
  def getDerivedAchievements(name: String): Option[List[AchievementDefinitionResource]] = {
    // create path and map variables
    val path = "/achievements/derived/{name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "name" + "\\}",apiInvoker.escape(name))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationAchievementsApi->getDerivedAchievements")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "array", classOf[AchievementDefinitionResource]).asInstanceOf[List[AchievementDefinitionResource]])
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
  def getUserAchievementProgress(userId: Integer, achievementName: String): Option[UserAchievementGroupResource] = {
    // create path and map variables
    val path = "/users/{user_id}/achievements/{achievement_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "achievement_name" + "\\}",apiInvoker.escape(achievementName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (achievementName == null) throw new Exception("Missing required parameter 'achievementName' when calling GamificationAchievementsApi->getUserAchievementProgress")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[UserAchievementGroupResource]).asInstanceOf[UserAchievementGroupResource])
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
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUserAchievementGroupResource
   */
  def getUserAchievementsProgress(userId: Integer, filterAchievementDerived: Option[Boolean] = None, filterAchievementTagset: Option[String] = None, filterAchievementName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceUserAchievementGroupResource] = {
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceUserAchievementGroupResource]).asInstanceOf[PageResourceUserAchievementGroupResource])
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
   * @param filterAchievementName Filter for achievements whose name contains a string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUserAchievementGroupResource
   */
  def getUsersAchievementProgress(achievementName: String, filterAchievementDerived: Option[Boolean] = None, filterAchievementTagset: Option[String] = None, filterAchievementName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceUserAchievementGroupResource] = {
    // create path and map variables
    val path = "/users/achievements/{achievement_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "achievement_name" + "\\}",apiInvoker.escape(achievementName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (achievementName == null) throw new Exception("Missing required parameter 'achievementName' when calling GamificationAchievementsApi->getUsersAchievementProgress")

    filterAchievementDerived.map(paramVal => queryParams += "filter_achievement_derived" -> paramVal.toString)
    filterAchievementTagset.map(paramVal => queryParams += "filter_achievement_tagset" -> paramVal.toString)
    filterAchievementName.map(paramVal => queryParams += "filter_achievement_name" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceUserAchievementGroupResource]).asInstanceOf[PageResourceUserAchievementGroupResource])
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
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUserAchievementGroupResource
   */
  def getUsersAchievementsProgress(filterAchievementDerived: Option[Boolean] = None, filterAchievementTagset: Option[String] = None, filterAchievementName: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceUserAchievementGroupResource] = {
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceUserAchievementGroupResource]).asInstanceOf[PageResourceUserAchievementGroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Increment an achievement progress record for a user
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and the provided value added to the existing progress. May be negative. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
   * @param userId The user&#39;s id 
   * @param achievementName The achievement&#39;s name 
   * @param progress The amount to add to the progress value (optional)
   * @return UserAchievementGroupResource
   */
  def incrementAchievementProgress(userId: Integer, achievementName: String, progress: Option[Integer] = None): Option[UserAchievementGroupResource] = {
    // create path and map variables
    val path = "/users/{user_id}/achievements/{achievement_name}/progress".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "achievement_name" + "\\}",apiInvoker.escape(achievementName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (achievementName == null) throw new Exception("Missing required parameter 'achievementName' when calling GamificationAchievementsApi->incrementAchievementProgress")

    

    var postBody: AnyRef = progress.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[UserAchievementGroupResource]).asInstanceOf[UserAchievementGroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Set an achievement progress record for a user
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and progress set to the provided value. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
   * @param userId The user&#39;s id 
   * @param achievementName The achievement&#39;s name 
   * @param progress The new progress value (optional)
   * @return UserAchievementGroupResource
   */
  def setAchievementProgress(userId: Integer, achievementName: String, progress: Option[Integer] = None): Option[UserAchievementGroupResource] = {
    // create path and map variables
    val path = "/users/{user_id}/achievements/{achievement_name}/progress".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "achievement_name" + "\\}",apiInvoker.escape(achievementName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (achievementName == null) throw new Exception("Missing required parameter 'achievementName' when calling GamificationAchievementsApi->setAchievementProgress")

    

    var postBody: AnyRef = progress.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[UserAchievementGroupResource]).asInstanceOf[UserAchievementGroupResource])
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
   * @return AchievementDefinitionResource
   */
  def updateAchievement(name: String, achievement: Option[AchievementDefinitionResource] = None): Option[AchievementDefinitionResource] = {
    // create path and map variables
    val path = "/achievements/{name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "name" + "\\}",apiInvoker.escape(name))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling GamificationAchievementsApi->updateAchievement")

    

    var postBody: AnyRef = achievement.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[AchievementDefinitionResource]).asInstanceOf[AchievementDefinitionResource])
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
   * @return TemplateResource
   */
  def updateAchievementTemplate(id: String, template: Option[TemplateResource] = None): Option[TemplateResource] = {
    // create path and map variables
    val path = "/achievements/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling GamificationAchievementsApi->updateAchievementTemplate")

    

    var postBody: AnyRef = template.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[TemplateResource]).asInstanceOf[TemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
