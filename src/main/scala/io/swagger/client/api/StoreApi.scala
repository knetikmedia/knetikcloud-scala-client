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

import io.swagger.client.model.BehaviorDefinitionResource
import io.swagger.client.model.PageResourceStoreItem
import io.swagger.client.model.PageResourceStoreItemTemplateResource
import io.swagger.client.model.Result
import io.swagger.client.model.StoreItem
import io.swagger.client.model.StoreItemTemplateResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class StoreApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Create an item template
   * Item Templates define a type of item and the properties they have.
   * @param itemTemplateResource The new item template (optional)
   * @return StoreItemTemplateResource
   */
  def createItemTemplate(itemTemplateResource: Option[StoreItemTemplateResource] = None): Option[StoreItemTemplateResource] = {
    // create path and map variables
    val path = "/store/items/templates".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = itemTemplateResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[StoreItemTemplateResource]).asInstanceOf[StoreItemTemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create a store item
   * SKUs have to be unique in the entire store. If a duplicate SKU is found, a 400 error is generated and the response will have a \&quot;parameters\&quot; field that is a list of duplicates. A duplicate is an object like {item_id, offending_sku_list}. Ex:&lt;br /&gt; {..., parameters: [[{item: 1, skus: [\&quot;SKU-1\&quot;]}]]}&lt;br /&gt; If an item is brand new and has duplicate SKUs within itself, the item ID will be 0.  Item subclasses are not allowed here, you will have to use their respective endpoints.
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param storeItem The store item object (optional)
   * @return StoreItem
   */
  def createStoreItem(cascade: Option[Boolean] /* = false*/, storeItem: Option[StoreItem] = None): Option[StoreItem] = {
    // create path and map variables
    val path = "/store/items".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    cascade.map(paramVal => queryParams += "cascade" -> paramVal.toString)
    

    var postBody: AnyRef = storeItem.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[StoreItem]).asInstanceOf[StoreItem])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete an item template
   * 
   * @param id The id of the template 
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return void
   */
  def deleteItemTemplate(id: String, cascade: Option[String] = None) = {
    // create path and map variables
    val path = "/store/items/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreApi->deleteItemTemplate")

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
   * Delete a store item
   * 
   * @param id The id of the item 
   * @return void
   */
  def deleteStoreItem(id: Integer) = {
    // create path and map variables
    val path = "/store/items/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
   * List available item behaviors
   * 
   * @return List[BehaviorDefinitionResource]
   */
  def getBehaviors(): Option[List[BehaviorDefinitionResource]] = {
    // create path and map variables
    val path = "/store/items/behaviors".replaceAll("\\{format\\}", "json")

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
           Some(apiInvoker.deserialize(s, "array", classOf[BehaviorDefinitionResource]).asInstanceOf[List[BehaviorDefinitionResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single item template
   * Item Templates define a type of item and the properties they have.
   * @param id The id of the template 
   * @return StoreItemTemplateResource
   */
  def getItemTemplate(id: String): Option[StoreItemTemplateResource] = {
    // create path and map variables
    val path = "/store/items/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreApi->getItemTemplate")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[StoreItemTemplateResource]).asInstanceOf[StoreItemTemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List and search item templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceStoreItemTemplateResource
   */
  def getItemTemplates(size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceStoreItemTemplateResource] = {
    // create path and map variables
    val path = "/store/items/templates".replaceAll("\\{format\\}", "json")

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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceStoreItemTemplateResource]).asInstanceOf[PageResourceStoreItemTemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a listing of store items
   * The exact structure of each items may differ to include fields specific to the type. The same is true for behaviors.
   * @param limit The amount of items returned (optional)
   * @param page The page of the request (optional)
   * @param useCatalog Whether to remove items that are not intended for display or not in date (optional)
   * @param ignoreLocation Whether to ignore country restrictions based on the caller&#39;s location (optional)
   * @param inStockOnly Whether only in-stock items should be returned.  Default value is false (optional, default to false)
   * @return PageResourceStoreItem
   */
  def getStore(limit: Option[Integer] = None, page: Option[Integer] = None, useCatalog: Option[Boolean] = None, ignoreLocation: Option[Boolean] = None, inStockOnly: Option[Boolean] /* = false*/): Option[PageResourceStoreItem] = {
    // create path and map variables
    val path = "/store".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    limit.map(paramVal => queryParams += "limit" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    useCatalog.map(paramVal => queryParams += "use_catalog" -> paramVal.toString)
    ignoreLocation.map(paramVal => queryParams += "ignore_location" -> paramVal.toString)
    inStockOnly.map(paramVal => queryParams += "in_stock_only" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceStoreItem]).asInstanceOf[PageResourceStoreItem])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a single store item
   * 
   * @param id The id of the item 
   * @return StoreItem
   */
  def getStoreItem(id: Integer): Option[StoreItem] = {
    // create path and map variables
    val path = "/store/items/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
           Some(apiInvoker.deserialize(s, "", classOf[StoreItem]).asInstanceOf[StoreItem])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List and search store items
   * 
   * @param filterNameSearch Filter for items whose name starts with a given string. (optional)
   * @param filterUniqueKey Filter for items whose unique_key is a given string. (optional)
   * @param filterPublished Filter for skus that have been published. (optional)
   * @param filterDisplayable Filter for items that are displayable. (optional)
   * @param filterStart A comma separated string without spaces.  First value is the operator to search on, second value is the store start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterEnd A comma separated string without spaces.  First value is the operator to search on, second value is the store end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the sku start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterStopDate A comma separated string without spaces.  First value is the operator to search on, second value is the sku end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterSku Filter for skus whose name starts with a given string. (optional)
   * @param filterPrice A colon separated string without spaces.  First value is the operator to search on, second value is the price of a sku.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterTag A comma separated list without spaces of the names of tags. Will only return items with at least one of the tags. (optional)
   * @param filterItemsByType Filter for item type based on its type hint. (optional)
   * @param filterBundledSkus Filter for skus inside bundles whose name starts with a given string.  Used only when type hint is &#39;bundle_item&#39; (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceStoreItem
   */
  def getStoreItems(filterNameSearch: Option[String] = None, filterUniqueKey: Option[String] = None, filterPublished: Option[Boolean] = None, filterDisplayable: Option[Boolean] = None, filterStart: Option[String] = None, filterEnd: Option[String] = None, filterStartDate: Option[String] = None, filterStopDate: Option[String] = None, filterSku: Option[String] = None, filterPrice: Option[String] = None, filterTag: Option[String] = None, filterItemsByType: Option[String] = None, filterBundledSkus: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceStoreItem] = {
    // create path and map variables
    val path = "/store/items".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterNameSearch.map(paramVal => queryParams += "filter_name_search" -> paramVal.toString)
    filterUniqueKey.map(paramVal => queryParams += "filter_unique_key" -> paramVal.toString)
    filterPublished.map(paramVal => queryParams += "filter_published" -> paramVal.toString)
    filterDisplayable.map(paramVal => queryParams += "filter_displayable" -> paramVal.toString)
    filterStart.map(paramVal => queryParams += "filter_start" -> paramVal.toString)
    filterEnd.map(paramVal => queryParams += "filter_end" -> paramVal.toString)
    filterStartDate.map(paramVal => queryParams += "filter_start_date" -> paramVal.toString)
    filterStopDate.map(paramVal => queryParams += "filter_stop_date" -> paramVal.toString)
    filterSku.map(paramVal => queryParams += "filter_sku" -> paramVal.toString)
    filterPrice.map(paramVal => queryParams += "filter_price" -> paramVal.toString)
    filterTag.map(paramVal => queryParams += "filter_tag" -> paramVal.toString)
    filterItemsByType.map(paramVal => queryParams += "filter_items_by_type" -> paramVal.toString)
    filterBundledSkus.map(paramVal => queryParams += "filter_bundled_skus" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceStoreItem]).asInstanceOf[PageResourceStoreItem])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update an item template
   * 
   * @param id The id of the template 
   * @param itemTemplateResource The item template resource object (optional)
   * @return StoreItemTemplateResource
   */
  def updateItemTemplate(id: String, itemTemplateResource: Option[StoreItemTemplateResource] = None): Option[StoreItemTemplateResource] = {
    // create path and map variables
    val path = "/store/items/templates/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreApi->updateItemTemplate")

    

    var postBody: AnyRef = itemTemplateResource.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[StoreItemTemplateResource]).asInstanceOf[StoreItemTemplateResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update a store item
   * 
   * @param id The id of the item 
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param storeItem The store item object (optional)
   * @return StoreItem
   */
  def updateStoreItem(id: Integer, cascade: Option[Boolean] /* = false*/, storeItem: Option[StoreItem] = None): Option[StoreItem] = {
    // create path and map variables
    val path = "/store/items/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    cascade.map(paramVal => queryParams += "cascade" -> paramVal.toString)
    

    var postBody: AnyRef = storeItem.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[StoreItem]).asInstanceOf[StoreItem])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
