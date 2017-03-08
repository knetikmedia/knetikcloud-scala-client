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

import io.swagger.client.model.Cart
import io.swagger.client.model.CartItemRequest
import io.swagger.client.model.CartShippableResponse
import io.swagger.client.model.CartShippingAddressRequest
import io.swagger.client.model.CouponDefinition
import io.swagger.client.model.PageResourceCartSummary
import io.swagger.client.model.Result
import io.swagger.client.model.SampleCountriesResponse
import io.swagger.client.model.SkuRequest
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class StoreShoppingCartsApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Adds a custom discount to the cart
   * 
   * @param id The id of the cart 
   * @param customDiscount The details of the discount to add (optional)
   * @return void
   */
  def addCustomDiscount(id: String, customDiscount: Option[CouponDefinition] = None) = {
    // create path and map variables
    val path = "/carts/{id}/custom-discounts".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->addCustomDiscount")

    

    var postBody: AnyRef = customDiscount.map(paramVal => paramVal)

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
   * Adds a discount coupon to the cart
   * 
   * @param id The id of the cart 
   * @param skuRequest The request of the sku (optional)
   * @return void
   */
  def addDiscountToCart(id: String, skuRequest: Option[SkuRequest] = None) = {
    // create path and map variables
    val path = "/carts/{id}/discounts".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->addDiscountToCart")

    

    var postBody: AnyRef = skuRequest.map(paramVal => paramVal)

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
   * Add an item to the cart
   * Currently, carts cannot contain virtual and real currency items at the same time. Furthermore, the API only support a single virtual item at the moment
   * @param id The id of the cart 
   * @param cartItemRequest The cart item request object (optional)
   * @return void
   */
  def addItemToCart(id: String, cartItemRequest: Option[CartItemRequest] = None) = {
    // create path and map variables
    val path = "/carts/{id}/items".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->addItemToCart")

    

    var postBody: AnyRef = cartItemRequest.map(paramVal => paramVal)

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
   * Create a cart
   * You don&#39;t have to have a user to create a cart but the API requires authentication to checkout
   * @param owner Set the owner of a cart. If not specified, defaults to the calling user&#39;s id. If specified and is not the calling user&#39;s id, SHOPPING_CARTS_ADMIN permission is required (optional)
   * @param currencyCode Set the currency for the cart, by currency code. May be disallowed by site settings. (optional)
   * @return String
   */
  def createCart(owner: Option[Integer] = None, currencyCode: Option[String] = None): Option[String] = {
    // create path and map variables
    val path = "/carts".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    owner.map(paramVal => queryParams += "owner" -> paramVal.toString)
    currencyCode.map(paramVal => queryParams += "currency_code" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[String]).asInstanceOf[String])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns the cart with the given GUID
   * 
   * @param id The id of the cart 
   * @return Cart
   */
  def getCart(id: String): Option[Cart] = {
    // create path and map variables
    val path = "/carts/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->getCart")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[Cart]).asInstanceOf[Cart])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a list of carts
   * 
   * @param filterOwnerId Filter by the id of the owner (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceCartSummary
   */
  def getCarts(filterOwnerId: Option[Integer] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceCartSummary] = {
    // create path and map variables
    val path = "/carts".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterOwnerId.map(paramVal => queryParams += "filter_owner_id" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[PageResourceCartSummary]).asInstanceOf[PageResourceCartSummary])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns whether a cart requires shipping
   * 
   * @param id The id of the cart 
   * @return CartShippableResponse
   */
  def getShippable(id: String): Option[CartShippableResponse] = {
    // create path and map variables
    val path = "/carts/{id}/shippable".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->getShippable")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[CartShippableResponse]).asInstanceOf[CartShippableResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get the list of available shipping countries per vendor
   * Since a cart can have multiple vendors with different shipping options, the countries are broken down by vendors. Please see notes about the response object as the fields are variable.
   * @param id The id of the cart 
   * @return SampleCountriesResponse
   */
  def getShippingCountries(id: String): Option[SampleCountriesResponse] = {
    // create path and map variables
    val path = "/carts/{id}/countries".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->getShippingCountries")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[SampleCountriesResponse]).asInstanceOf[SampleCountriesResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Removes a discount coupon from the cart
   * 
   * @param id The id of the cart 
   * @param code The SKU code of the coupon to remove 
   * @return void
   */
  def removeDiscountFromCart(id: String, code: String) = {
    // create path and map variables
    val path = "/carts/{id}/discounts/{code}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id)).replaceAll("\\{" + "code" + "\\}",apiInvoker.escape(code))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->removeDiscountFromCart")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling StoreShoppingCartsApi->removeDiscountFromCart")

    

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
   * Sets the currency to use for the cart
   * May be disallowed by site settings.
   * @param id The id of the cart 
   * @param currencyCode The code of the currency (optional)
   * @return void
   */
  def setCartCurrency(id: String, currencyCode: Option[String] = None) = {
    // create path and map variables
    val path = "/carts/{id}/currency".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->setCartCurrency")

    

    var postBody: AnyRef = currencyCode.map(paramVal => paramVal)

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
   * Sets the owner of a cart if none is set already
   * 
   * @param id The id of the cart 
   * @param userId The id of the user (optional)
   * @return void
   */
  def setCartOwner(id: String, userId: Option[Integer] = None) = {
    // create path and map variables
    val path = "/carts/{id}/owner".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->setCartOwner")

    

    var postBody: AnyRef = userId.map(paramVal => paramVal)

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
   * Changes the quantity of an item already in the cart
   * A quantity of zero will remove the item from the cart altogether.
   * @param id The id of the cart 
   * @param cartItemRequest The cart item request object (optional)
   * @return void
   */
  def updateItemInCart(id: String, cartItemRequest: Option[CartItemRequest] = None) = {
    // create path and map variables
    val path = "/carts/{id}/items".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->updateItemInCart")

    

    var postBody: AnyRef = cartItemRequest.map(paramVal => paramVal)

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
   * Modifies or sets the order shipping address
   * 
   * @param id The id of the cart 
   * @param cartShippingAddressRequest The cart shipping address request object (optional)
   * @return void
   */
  def updateShippingAddress(id: String, cartShippingAddressRequest: Option[CartShippingAddressRequest] = None) = {
    // create path and map variables
    val path = "/carts/{id}/shipping-address".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling StoreShoppingCartsApi->updateShippingAddress")

    

    var postBody: AnyRef = cartShippingAddressRequest.map(paramVal => paramVal)

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
