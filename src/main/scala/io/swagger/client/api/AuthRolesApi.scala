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

package io.swagger.client.api

import io.swagger.client.model.ClientResource
import io.swagger.client.model.PageResourceRoleResource
import io.swagger.client.model.RoleResource
import io.swagger.client.model.UserResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class AuthRolesApi(val defBasePath: String = "https://integration.knetikcloud.com/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Create a new role
   * 
   * @param roleResource The role resource object (optional)
   * @return RoleResource
   */
  def createRole(roleResource: Option[RoleResource] = None): Option[RoleResource] = {
    // create path and map variables
    val path = "/auth/roles".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = roleResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[RoleResource]).asInstanceOf[RoleResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete a role
   * 
   * @param role The role value 
   * @param force If true, removes role from users/clients (optional)
   * @return void
   */
  def deleteRole(role: String, force: Option[Boolean] = None) = {
    // create path and map variables
    val path = "/auth/roles/{role}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "role" + "\\}",apiInvoker.escape(role))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (role == null) throw new Exception("Missing required parameter 'role' when calling AuthRolesApi->deleteRole")

    force.map(paramVal => queryParams += "force" -> paramVal.toString)
    

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
   * Get roles for a client
   * 
   * @param clientKey The client key 
   * @return List[RoleResource]
   */
  def getClientRoles(clientKey: String): Option[List[RoleResource]] = {
    // create path and map variables
    val path = "/auth/clients/{client_key}/roles".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "client_key" + "\\}",apiInvoker.escape(clientKey))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (clientKey == null) throw new Exception("Missing required parameter 'clientKey' when calling AuthRolesApi->getClientRoles")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "array", classOf[RoleResource]).asInstanceOf[List[RoleResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single role
   * 
   * @param role The role value 
   * @return RoleResource
   */
  def getRole(role: String): Option[RoleResource] = {
    // create path and map variables
    val path = "/auth/roles/{role}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "role" + "\\}",apiInvoker.escape(role))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (role == null) throw new Exception("Missing required parameter 'role' when calling AuthRolesApi->getRole")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[RoleResource]).asInstanceOf[RoleResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List and search roles
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return PageResourceRoleResource
   */
  def getRoles(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = name:ASC*/): Option[PageResourceRoleResource] = {
    // create path and map variables
    val path = "/auth/roles".replaceAll("\\{format\\}", "json")

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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceRoleResource]).asInstanceOf[PageResourceRoleResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get roles for a user
   * 
   * @param userId The user&#39;s id 
   * @return List[RoleResource]
   */
  def getUserRoles(userId: Integer): Option[List[RoleResource]] = {
    // create path and map variables
    val path = "/auth/users/{user_id}/roles".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

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
           Some(apiInvoker.deserialize(s, "array", classOf[RoleResource]).asInstanceOf[List[RoleResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Set roles for a client
   * 
   * @param clientKey The client key 
   * @param rolesList The list of unique roles (optional)
   * @return void
   */
  def setClientRoles(clientKey: String, rolesList: Option[List[String]] = None) = {
    // create path and map variables
    val path = "/auth/clients/{client_key}/roles".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "client_key" + "\\}",apiInvoker.escape(clientKey))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (clientKey == null) throw new Exception("Missing required parameter 'clientKey' when calling AuthRolesApi->setClientRoles")

    

    var postBody: AnyRef = rolesList.map(paramVal => paramVal)

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
   * Set permissions for a role
   * 
   * @param role The role value 
   * @param permissionsList The list of unique permissions (optional)
   * @return void
   */
  def setPermissionsForRole(role: String, permissionsList: Option[List[String]] = None) = {
    // create path and map variables
    val path = "/auth/roles/{role}/permissions".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "role" + "\\}",apiInvoker.escape(role))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (role == null) throw new Exception("Missing required parameter 'role' when calling AuthRolesApi->setPermissionsForRole")

    

    var postBody: AnyRef = permissionsList.map(paramVal => paramVal)

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
   * Set roles for a user
   * 
   * @param userId The user&#39;s id 
   * @param rolesList The list of unique roles (optional)
   * @return void
   */
  def setUserRoles(userId: Integer, rolesList: Option[List[String]] = None) = {
    // create path and map variables
    val path = "/auth/users/{user_id}/roles".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = rolesList.map(paramVal => paramVal)

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
   * Update a role
   * 
   * @param role The role value 
   * @param roleResource The role resource object (optional)
   * @return void
   */
  def updateRole(role: String, roleResource: Option[RoleResource] = None) = {
    // create path and map variables
    val path = "/auth/roles/{role}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "role" + "\\}",apiInvoker.escape(role))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (role == null) throw new Exception("Missing required parameter 'role' when calling AuthRolesApi->updateRole")

    

    var postBody: AnyRef = roleResource.map(paramVal => paramVal)

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
