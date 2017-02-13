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

import io.swagger.client.model.PageResourceMapstringobject
import io.swagger.client.model.SearchReferenceMapping
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class SearchApi(val defBasePath: String = "https://integration.knetikcloud.com/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Add a new object to an index
   * Mainly intended for internal use.
   * @param _type The index type 
   * @param id The ID of the object 
   * @param _object The object to add (optional)
   * @return void
   */
  def addSearchIndex(_type: String, id: String, _object: Option[Any] = None) = {
    // create path and map variables
    val path = "/search/index/{type}/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "type" + "\\}",apiInvoker.escape(_type)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (_type == null) throw new Exception("Missing required parameter '_type' when calling SearchApi->addSearchIndex")

    if (id == null) throw new Exception("Missing required parameter 'id' when calling SearchApi->addSearchIndex")

    

    var postBody: AnyRef = _object.map(paramVal => paramVal)

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
   * Register reference mappings
   * Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.
   * @param mappings The mappings to add (optional)
   * @return void
   */
  def addSearchMappings(mappings: Option[List[SearchReferenceMapping]] = None) = {
    // create path and map variables
    val path = "/search/mappings".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = mappings.map(paramVal => paramVal)

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
   * Delete an object
   * Mainly intended for internal use. Requires SEARCH_ADMIN.
   * @param _type The index type 
   * @param id The ID of the object to delete 
   * @return void
   */
  def deleteSearchIndex(_type: String, id: String) = {
    // create path and map variables
    val path = "/search/index/{type}/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "type" + "\\}",apiInvoker.escape(_type)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (_type == null) throw new Exception("Missing required parameter '_type' when calling SearchApi->deleteSearchIndex")

    if (id == null) throw new Exception("Missing required parameter 'id' when calling SearchApi->deleteSearchIndex")

    

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
   * Delete all objects in an index
   * Mainly intended for internal use
   * @param _type The index type 
   * @return void
   */
  def deleteSearchIndexes(_type: String) = {
    // create path and map variables
    val path = "/search/index/{type}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "type" + "\\}",apiInvoker.escape(_type))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (_type == null) throw new Exception("Missing required parameter '_type' when calling SearchApi->deleteSearchIndexes")

    

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
   * Search an index
   * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.
   * @param _type The index type 
   * @param query The query to be used for the search (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceMapstringobject
   */
  def searchIndex(_type: String, query: Option[Any] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageResourceMapstringobject] = {
    // create path and map variables
    val path = "/search/index/{type}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "type" + "\\}",apiInvoker.escape(_type))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (_type == null) throw new Exception("Missing required parameter '_type' when calling SearchApi->searchIndex")

    size.map(paramVal => queryParams += "size" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    

    var postBody: AnyRef = query.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceMapstringobject]).asInstanceOf[PageResourceMapstringobject])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
