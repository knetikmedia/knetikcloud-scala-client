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

import io.swagger.client.model.NewPasswordRequest
import io.swagger.client.model.PageTemplateResource
import io.swagger.client.model.PageUserBaseResource
import io.swagger.client.model.TemplateResource
import io.swagger.client.model.UserResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class UsersApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Add a tag to a user
   * 
   * @param userId The id of the user 
   * @param tag tag 
   * @return void
   */
  def addTagUsingPOST1(userId: Integer, tag: String) = {
    // create path and map variables
    val path = "/users/{user_id}/tags".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (tag == null) throw new Exception("Missing required parameter 'tag' when calling UsersApi->addTagUsingPOST1")

    

    var postBody: AnyRef = tag

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create a user template
   * User Templates define a type of user and the properties they have
   * @param userTemplateResource The user template resource object (optional)
   * @return TemplateResource
   */
  def createUserTemplateUsingPOST(userTemplateResource: Option[TemplateResource] = None): Option[TemplateResource] = {
    // create path and map variables
    val path = "/users/templates".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = userTemplateResource.map(paramVal => paramVal)

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
   * Delete a user template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return void
   */
  def deleteUserTemplateUsingDELETE(id: String, cascade: Option[String] = None) = {
    // create path and map variables
    val path = "/users/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling UsersApi->deleteUserTemplateUsingDELETE")

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
   * Choose a new password after a reset
   * Finish resetting a user&#39;s password using the secret provided from the password-reset endpoint.  Password should be in plain text and will be encrypted on receipt. Use SSL for security.
   * @param id The id of the user 
   * @param newPasswordRequest The new password request object (optional)
   * @return void
   */
  def doPasswordResetUsingPUT(id: Integer, newPasswordRequest: Option[NewPasswordRequest] = None) = {
    // create path and map variables
    val path = "/users/{id}/password-reset".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = newPasswordRequest.map(paramVal => paramVal)

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
   * List tags for a user
   * 
   * @param userId The id of the user 
   * @return List[String]
   */
  def getTagsUsingGET3(userId: Integer): Option[List[String]] = {
    // create path and map variables
    val path = "/users/{user_id}/tags".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

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
           Some(ApiInvoker.deserialize(s, "array", classOf[String]).asInstanceOf[List[String]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single user template
   * 
   * @param id The id of the template 
   * @return TemplateResource
   */
  def getUserTemplateUsingGET(id: String): Option[TemplateResource] = {
    // create path and map variables
    val path = "/users/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling UsersApi->getUserTemplateUsingGET")

    

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
   * List and search user templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageTemplateResource
   */
  def getUserTemplatesUsingGET(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageTemplateResource] = {
    // create path and map variables
    val path = "/users/templates".replaceAll("\\{format\\}", "json")

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
   * Get a single user
   * Additional private info is included as USERS_ADMIN
   * @param id The id of the user or &#39;me&#39; 
   * @return UserResource
   */
  def getUserUsingGET(id: String): Option[UserResource] = {
    // create path and map variables
    val path = "/users/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling UsersApi->getUserUsingGET")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[UserResource]).asInstanceOf[UserResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List and search users
   * Additional private info is included as USERS_ADMIN
   * @param filterRole Filter for users whose roles has the provided role (optional)
   * @param filterDisplayname Filter for users whose display name starts with provided string. (optional)
   * @param filterEmail Filter for users whose email starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterFirstname Filter for users whose first name starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterFullname Filter for users whose full name starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterLastname Filter for users whose last name starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterUsername Filter for users whose username starts with the provided string. Requires USERS_ADMIN permission (optional)
   * @param filterTag Filter for users who have a given tag (optional)
   * @param filterGroup Filter for users in a given group, by unique name (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageUserBaseResource
   */
  def getUsersUsingGET(filterRole: Option[String] = None, filterDisplayname: Option[String] = None, filterEmail: Option[String] = None, filterFirstname: Option[String] = None, filterFullname: Option[String] = None, filterLastname: Option[String] = None, filterUsername: Option[String] = None, filterTag: Option[String] = None, filterGroup: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageUserBaseResource] = {
    // create path and map variables
    val path = "/users".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterRole.map(paramVal => queryParams += "filter_role" -> paramVal.toString)
    filterDisplayname.map(paramVal => queryParams += "filter_displayname" -> paramVal.toString)
    filterEmail.map(paramVal => queryParams += "filter_email" -> paramVal.toString)
    filterFirstname.map(paramVal => queryParams += "filter_firstname" -> paramVal.toString)
    filterFullname.map(paramVal => queryParams += "filter_fullname" -> paramVal.toString)
    filterLastname.map(paramVal => queryParams += "filter_lastname" -> paramVal.toString)
    filterUsername.map(paramVal => queryParams += "filter_username" -> paramVal.toString)
    filterTag.map(paramVal => queryParams += "filter_tag" -> paramVal.toString)
    filterGroup.map(paramVal => queryParams += "filter_group" -> paramVal.toString)
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
           Some(ApiInvoker.deserialize(s, "", classOf[PageUserBaseResource]).asInstanceOf[PageUserBaseResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Reset a user&#39;s password
   * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code; this can be routed to the user as needed and submitted to the &#39;choose a new password&#39; endpoint.
   * @param id The id of the user 
   * @return void
   */
  def initiatePasswordResetUsingPOST(id: Integer) = {
    // create path and map variables
    val path = "/users/{id}/password-reset".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Register a new user
   * Password should be in plain text and will be encrypted on receipt. Use SSL for security
   * @param userResource The user resource object (optional)
   * @return UserResource
   */
  def registerUserUsingPOST(userResource: Option[UserResource] = None): Option[UserResource] = {
    // create path and map variables
    val path = "/users".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = userResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[UserResource]).asInstanceOf[UserResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Remove a tag from a user
   * 
   * @param userId The id of the user 
   * @param tag The tag to remove 
   * @return void
   */
  def removeTagUsingDELETE1(userId: Integer, tag: String) = {
    // create path and map variables
    val path = "/users/{user_id}/tags/{tag}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "tag" + "\\}",apiInvoker.escape(tag))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (tag == null) throw new Exception("Missing required parameter 'tag' when calling UsersApi->removeTagUsingDELETE1")

    

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
   * Set a user&#39;s password
   * Password should be in plain text and will be encrypted on receipt. Use SSL for security.
   * @param id The id of the user 
   * @param password The new plain text password (optional)
   * @return void
   */
  def setPasswordUsingPUT(id: Integer, password: Option[String] = None) = {
    // create path and map variables
    val path = "/users/{id}/password".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = password.map(paramVal => paramVal)

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
   * Update a user template
   * 
   * @param id The id of the template 
   * @param userTemplateResource The user template resource object (optional)
   * @return void
   */
  def updateUserTemplateUsingPUT(id: String, userTemplateResource: Option[TemplateResource] = None) = {
    // create path and map variables
    val path = "/users/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling UsersApi->updateUserTemplateUsingPUT")

    

    var postBody: AnyRef = userTemplateResource.map(paramVal => paramVal)

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
   * Update a user&#39;s info
   * Password will not be edited on this endpoint, use password specific endpoints.
   * @param id The id of the user or &#39;me&#39; 
   * @param userResource The user resource object (optional)
   * @return void
   */
  def updateUserUsingPUT(id: String, userResource: Option[UserResource] = None) = {
    // create path and map variables
    val path = "/users/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling UsersApi->updateUserUsingPUT")

    

    var postBody: AnyRef = userResource.map(paramVal => paramVal)

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
