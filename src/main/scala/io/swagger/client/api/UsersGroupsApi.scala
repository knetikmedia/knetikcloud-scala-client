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

import io.swagger.client.model.GroupMemberResource
import io.swagger.client.model.GroupResource
import io.swagger.client.model.PageResourceGroupMemberResource
import io.swagger.client.model.PageResourceGroupResource
import io.swagger.client.model.PageResourceTemplateResource
import io.swagger.client.model.Result
import io.swagger.client.model.TemplateResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class UsersGroupsApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Adds a new member to the group
   * 
   * @param uniqueName The group unique name 
   * @param username The username of a user to add to the group 
   * @return GroupMemberResource
   */
  def addMemberToGroup(uniqueName: String, username: GroupMemberResource): Option[GroupMemberResource] = {
    // create path and map variables
    val path = "/users/groups/{unique_name}/members".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "unique_name" + "\\}",apiInvoker.escape(uniqueName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (uniqueName == null) throw new Exception("Missing required parameter 'uniqueName' when calling UsersGroupsApi->addMemberToGroup")

    if (username == null) throw new Exception("Missing required parameter 'username' when calling UsersGroupsApi->addMemberToGroup")

    

    var postBody: AnyRef = username

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[GroupMemberResource]).asInstanceOf[GroupMemberResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create a group
   * 
   * @param groupResource The new group (optional)
   * @return GroupResource
   */
  def createGroup(groupResource: Option[GroupResource] = None): Option[GroupResource] = {
    // create path and map variables
    val path = "/users/groups".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = groupResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[GroupResource]).asInstanceOf[GroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create a group template
   * Group Templates define a type of group and the properties they have
   * @param groupTemplateResource The group template resource object (optional)
   * @return TemplateResource
   */
  def createGroupTemplate(groupTemplateResource: Option[TemplateResource] = None): Option[TemplateResource] = {
    // create path and map variables
    val path = "/users/groups/templates".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = groupTemplateResource.map(paramVal => paramVal)

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
   * Removes a group from the system IF no resources are attached to it
   * 
   * @param uniqueName The group unique name 
   * @return void
   */
  def deleteGroup(uniqueName: String) = {
    // create path and map variables
    val path = "/users/groups/{unique_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "unique_name" + "\\}",apiInvoker.escape(uniqueName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (uniqueName == null) throw new Exception("Missing required parameter 'uniqueName' when calling UsersGroupsApi->deleteGroup")

    

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
   * Delete a group template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template 
   * @param cascade The value needed to delete used templates (optional)
   * @return void
   */
  def deleteGroupTemplate(id: String, cascade: Option[String] = None) = {
    // create path and map variables
    val path = "/users/groups/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling UsersGroupsApi->deleteGroupTemplate")

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
   * Loads a specific group&#39;s details
   * 
   * @param uniqueName The group unique name 
   * @return GroupResource
   */
  def getGroup(uniqueName: String): Option[GroupResource] = {
    // create path and map variables
    val path = "/users/groups/{unique_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "unique_name" + "\\}",apiInvoker.escape(uniqueName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (uniqueName == null) throw new Exception("Missing required parameter 'uniqueName' when calling UsersGroupsApi->getGroup")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[GroupResource]).asInstanceOf[GroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a user from a group
   * 
   * @param uniqueName The group unique name 
   * @param userId The id of the user 
   * @return GroupMemberResource
   */
  def getGroupMember(uniqueName: String, userId: Integer): Option[GroupMemberResource] = {
    // create path and map variables
    val path = "/users/groups/{unique_name}/members/{user_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "unique_name" + "\\}",apiInvoker.escape(uniqueName)).replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (uniqueName == null) throw new Exception("Missing required parameter 'uniqueName' when calling UsersGroupsApi->getGroupMember")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[GroupMemberResource]).asInstanceOf[GroupMemberResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Lists members of the group
   * 
   * @param uniqueName The group unique name 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceGroupMemberResource
   */
  def getGroupMembers(uniqueName: String, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceGroupMemberResource] = {
    // create path and map variables
    val path = "/users/groups/{unique_name}/members".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "unique_name" + "\\}",apiInvoker.escape(uniqueName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (uniqueName == null) throw new Exception("Missing required parameter 'uniqueName' when calling UsersGroupsApi->getGroupMembers")

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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceGroupMemberResource]).asInstanceOf[PageResourceGroupMemberResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single group template
   * 
   * @param id The id of the template 
   * @return TemplateResource
   */
  def getGroupTemplate(id: String): Option[TemplateResource] = {
    // create path and map variables
    val path = "/users/groups/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling UsersGroupsApi->getGroupTemplate")

    

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
   * List and search group templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   */
  def getGroupTemplates(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceTemplateResource] = {
    // create path and map variables
    val path = "/users/groups/templates".replaceAll("\\{format\\}", "json")

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
   * List groups a user is in
   * 
   * @param userId The id of the user 
   * @return List[String]
   */
  def getGroupsForUser(userId: Integer): Option[List[String]] = {
    // create path and map variables
    val path = "/users/{user_id}/groups".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

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
           Some(apiInvoker.deserialize(s, "array", classOf[String]).asInstanceOf[List[String]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Removes a user from a group
   * 
   * @param uniqueName The group unique name 
   * @param userId The id of the user to remove 
   * @return void
   */
  def removeGroupMember(uniqueName: String, userId: Integer) = {
    // create path and map variables
    val path = "/users/groups/{unique_name}/members/{user_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "unique_name" + "\\}",apiInvoker.escape(uniqueName)).replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (uniqueName == null) throw new Exception("Missing required parameter 'uniqueName' when calling UsersGroupsApi->removeGroupMember")

    

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
   * Update a group
   * 
   * @param uniqueName The group unique name 
   * @param groupResource The updated group (optional)
   * @return void
   */
  def updateGroup(uniqueName: String, groupResource: Option[GroupResource] = None) = {
    // create path and map variables
    val path = "/users/groups/{unique_name}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "unique_name" + "\\}",apiInvoker.escape(uniqueName))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (uniqueName == null) throw new Exception("Missing required parameter 'uniqueName' when calling UsersGroupsApi->updateGroup")

    

    var postBody: AnyRef = groupResource.map(paramVal => paramVal)

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
   * Change a user&#39;s status
   * 
   * @param uniqueName The group unique name 
   * @param userId The user id of the member to modify 
   * @param status The new status for the user 
   * @return void
   */
  def updateGroupMemberStatus(uniqueName: String, userId: Integer, status: String) = {
    // create path and map variables
    val path = "/users/groups/{unique_name}/members/{user_id}/status".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "unique_name" + "\\}",apiInvoker.escape(uniqueName)).replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (uniqueName == null) throw new Exception("Missing required parameter 'uniqueName' when calling UsersGroupsApi->updateGroupMemberStatus")

    if (status == null) throw new Exception("Missing required parameter 'status' when calling UsersGroupsApi->updateGroupMemberStatus")

    

    var postBody: AnyRef = status

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
   * Update a group template
   * 
   * @param id The id of the template 
   * @param groupTemplateResource The group template resource object (optional)
   * @return TemplateResource
   */
  def updateGroupTemplate(id: String, groupTemplateResource: Option[TemplateResource] = None): Option[TemplateResource] = {
    // create path and map variables
    val path = "/users/groups/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling UsersGroupsApi->updateGroupTemplate")

    

    var postBody: AnyRef = groupTemplateResource.map(paramVal => paramVal)

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

  /**
   * List and search groups
   * 
   * @param filterName Filter for groups whose name starts with provided string (optional)
   * @param filterUniqueName Filter for groups whose unique_name starts with provided string (optional)
   * @param filterParent Filter for groups whose parent equals provided string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return PageResourceGroupResource
   */
  def updateGroups(filterName: Option[String] = None, filterUniqueName: Option[String] = None, filterParent: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = name:ASC*/): Option[PageResourceGroupResource] = {
    // create path and map variables
    val path = "/users/groups".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterName.map(paramVal => queryParams += "filter_name" -> paramVal.toString)
    filterUniqueName.map(paramVal => queryParams += "filter_unique_name" -> paramVal.toString)
    filterParent.map(paramVal => queryParams += "filter_parent" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceGroupResource]).asInstanceOf[PageResourceGroupResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
