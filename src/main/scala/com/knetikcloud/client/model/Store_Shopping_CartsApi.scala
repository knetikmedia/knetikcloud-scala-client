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

import com.knetikcloud.client.model.Cart
import com.knetikcloud.client.model.CartItemRequest
import com.knetikcloud.client.model.CartShippableResponse
import com.knetikcloud.client.model.CartShippingAddressRequest
import com.knetikcloud.client.model.CouponDefinition
import com.knetikcloud.client.model.IntWrapper
import com.knetikcloud.client.model.PageResourceCartSummary
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.SampleCountriesResponse
import com.knetikcloud.client.model.SkuRequest
import com.knetikcloud.client.model.StringWrapper
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

class Store_Shopping_CartsApi(val defBasePath: String = "https://jsapi-integration.us-east-1.elasticbeanstalk.com",
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
  val helper = new Store_Shopping_CartsApiAsyncHelper(client, config)

  /**
   * Adds a custom discount to the cart
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN
   * @param id The id of the cart 
   * @param customDiscount The details of the discount to add (optional)
   * @return void
   */
  def addCustomDiscount(id: String, customDiscount: Option[CouponDefinition] = None) = {
    val await = Try(Await.result(addCustomDiscountAsync(id, customDiscount), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Adds a custom discount to the cart asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN
   * @param id The id of the cart 
   * @param customDiscount The details of the discount to add (optional)
   * @return Future(void)
  */
  def addCustomDiscountAsync(id: String, customDiscount: Option[CouponDefinition] = None) = {
      helper.addCustomDiscount(id, customDiscount)
  }


  /**
   * Adds a discount coupon to the cart
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param skuRequest The request of the sku (optional)
   * @return void
   */
  def addDiscountToCart(id: String, skuRequest: Option[SkuRequest] = None) = {
    val await = Try(Await.result(addDiscountToCartAsync(id, skuRequest), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Adds a discount coupon to the cart asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param skuRequest The request of the sku (optional)
   * @return Future(void)
  */
  def addDiscountToCartAsync(id: String, skuRequest: Option[SkuRequest] = None) = {
      helper.addDiscountToCart(id, skuRequest)
  }


  /**
   * Add an item to the cart
   * Currently, carts cannot contain virtual and real currency items at the same time. Furthermore, the API only support a single virtual item at the moment. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param cartItemRequest The cart item request object (optional)
   * @return void
   */
  def addItemToCart(id: String, cartItemRequest: Option[CartItemRequest] = None) = {
    val await = Try(Await.result(addItemToCartAsync(id, cartItemRequest), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add an item to the cart asynchronously
   * Currently, carts cannot contain virtual and real currency items at the same time. Furthermore, the API only support a single virtual item at the moment. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param cartItemRequest The cart item request object (optional)
   * @return Future(void)
  */
  def addItemToCartAsync(id: String, cartItemRequest: Option[CartItemRequest] = None) = {
      helper.addItemToCart(id, cartItemRequest)
  }


  /**
   * Create a cart
   * You don&#39;t have to have a user to create a cart but the API requires authentication to checkout. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param owner Set the owner of a cart. If not specified, defaults to the calling user&#39;s id. If specified and is not the calling user&#39;s id, SHOPPING_CARTS_ADMIN permission is required (optional)
   * @param currencyCode Set the currency for the cart, by currency code. May be disallowed by site settings. (optional)
   * @return String
   */
  def createCart(owner: Option[Integer] = None, currencyCode: Option[String] = None): Option[String] = {
    val await = Try(Await.result(createCartAsync(owner, currencyCode), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a cart asynchronously
   * You don&#39;t have to have a user to create a cart but the API requires authentication to checkout. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param owner Set the owner of a cart. If not specified, defaults to the calling user&#39;s id. If specified and is not the calling user&#39;s id, SHOPPING_CARTS_ADMIN permission is required (optional)
   * @param currencyCode Set the currency for the cart, by currency code. May be disallowed by site settings. (optional)
   * @return Future(String)
  */
  def createCartAsync(owner: Option[Integer] = None, currencyCode: Option[String] = None): Future[String] = {
      helper.createCart(owner, currencyCode)
  }


  /**
   * Returns the cart with the given GUID
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @return Cart
   */
  def getCart(id: String): Option[Cart] = {
    val await = Try(Await.result(getCartAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Returns the cart with the given GUID asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @return Future(Cart)
  */
  def getCartAsync(id: String): Future[Cart] = {
      helper.getCart(id)
  }


  /**
   * Get a list of carts
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param filterOwnerId Filter by the id of the owner (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceCartSummary
   */
  def getCarts(filterOwnerId: Option[Integer] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageResourceCartSummary] = {
    val await = Try(Await.result(getCartsAsync(filterOwnerId, size, page, order), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a list of carts asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param filterOwnerId Filter by the id of the owner (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Future(PageResourceCartSummary)
  */
  def getCartsAsync(filterOwnerId: Option[Integer] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Future[PageResourceCartSummary] = {
      helper.getCarts(filterOwnerId, size, page, order)
  }


  /**
   * Returns whether a cart requires shipping
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @return CartShippableResponse
   */
  def getShippable(id: String): Option[CartShippableResponse] = {
    val await = Try(Await.result(getShippableAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Returns whether a cart requires shipping asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @return Future(CartShippableResponse)
  */
  def getShippableAsync(id: String): Future[CartShippableResponse] = {
      helper.getShippable(id)
  }


  /**
   * Get the list of available shipping countries per vendor
   * Since a cart can have multiple vendors with different shipping options, the countries are broken down by vendors. Please see notes about the response object as the fields are variable. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @return SampleCountriesResponse
   */
  def getShippingCountries(id: String): Option[SampleCountriesResponse] = {
    val await = Try(Await.result(getShippingCountriesAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get the list of available shipping countries per vendor asynchronously
   * Since a cart can have multiple vendors with different shipping options, the countries are broken down by vendors. Please see notes about the response object as the fields are variable. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @return Future(SampleCountriesResponse)
  */
  def getShippingCountriesAsync(id: String): Future[SampleCountriesResponse] = {
      helper.getShippingCountries(id)
  }


  /**
   * Removes a discount coupon from the cart
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param code The SKU code of the coupon to remove 
   * @return void
   */
  def removeDiscountFromCart(id: String, code: String) = {
    val await = Try(Await.result(removeDiscountFromCartAsync(id, code), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Removes a discount coupon from the cart asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param code The SKU code of the coupon to remove 
   * @return Future(void)
  */
  def removeDiscountFromCartAsync(id: String, code: String) = {
      helper.removeDiscountFromCart(id, code)
  }


  /**
   * Sets the currency to use for the cart
   * May be disallowed by site settings. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param currencyCode The code of the currency (optional)
   * @return void
   */
  def setCartCurrency(id: String, currencyCode: Option[StringWrapper] = None) = {
    val await = Try(Await.result(setCartCurrencyAsync(id, currencyCode), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Sets the currency to use for the cart asynchronously
   * May be disallowed by site settings. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param currencyCode The code of the currency (optional)
   * @return Future(void)
  */
  def setCartCurrencyAsync(id: String, currencyCode: Option[StringWrapper] = None) = {
      helper.setCartCurrency(id, currencyCode)
  }


  /**
   * Sets the owner of a cart if none is set already
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param userId The id of the user (optional)
   * @return void
   */
  def setCartOwner(id: String, userId: Option[IntWrapper] = None) = {
    val await = Try(Await.result(setCartOwnerAsync(id, userId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Sets the owner of a cart if none is set already asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param userId The id of the user (optional)
   * @return Future(void)
  */
  def setCartOwnerAsync(id: String, userId: Option[IntWrapper] = None) = {
      helper.setCartOwner(id, userId)
  }


  /**
   * Changes the quantity of an item already in the cart
   * A quantity of zero will remove the item from the cart altogether. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param cartItemRequest The cart item request object (optional)
   * @return void
   */
  def updateItemInCart(id: String, cartItemRequest: Option[CartItemRequest] = None) = {
    val await = Try(Await.result(updateItemInCartAsync(id, cartItemRequest), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Changes the quantity of an item already in the cart asynchronously
   * A quantity of zero will remove the item from the cart altogether. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param cartItemRequest The cart item request object (optional)
   * @return Future(void)
  */
  def updateItemInCartAsync(id: String, cartItemRequest: Option[CartItemRequest] = None) = {
      helper.updateItemInCart(id, cartItemRequest)
  }


  /**
   * Modifies or sets the order shipping address
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param cartShippingAddressRequest The cart shipping address request object (optional)
   * @return void
   */
  def updateShippingAddress(id: String, cartShippingAddressRequest: Option[CartShippingAddressRequest] = None) = {
    val await = Try(Await.result(updateShippingAddressAsync(id, cartShippingAddressRequest), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Modifies or sets the order shipping address asynchronously
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart 
   * @param cartShippingAddressRequest The cart shipping address request object (optional)
   * @return Future(void)
  */
  def updateShippingAddressAsync(id: String, cartShippingAddressRequest: Option[CartShippingAddressRequest] = None) = {
      helper.updateShippingAddress(id, cartShippingAddressRequest)
  }


}

class Store_Shopping_CartsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addCustomDiscount(id: String,
    customDiscount: Option[CouponDefinition] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CouponDefinition]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/custom-discounts")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->addCustomDiscount")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(customDiscount))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def addDiscountToCart(id: String,
    skuRequest: Option[SkuRequest] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[SkuRequest]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/discounts")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->addDiscountToCart")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(skuRequest))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def addItemToCart(id: String,
    cartItemRequest: Option[CartItemRequest] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CartItemRequest]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/items")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->addItemToCart")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(cartItemRequest))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createCart(owner: Option[Integer] = None,
    currencyCode: Option[String] = None
    )(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/carts"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    owner match {
      case Some(param) => queryParams += "owner" -> param.toString
      case _ => queryParams
    }
    currencyCode match {
      case Some(param) => queryParams += "currency_code" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCart(id: String)(implicit reader: ClientResponseReader[Cart]): Future[Cart] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->getCart")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCarts(filterOwnerId: Option[Integer] = None,
    size: Option[Integer] = Some(25),
    page: Option[Integer] = Some(1),
    order: Option[String] = Some(id:ASC)
    )(implicit reader: ClientResponseReader[PageResourceCartSummary]): Future[PageResourceCartSummary] = {
    // create path and map variables
    val path = (addFmt("/carts"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    filterOwnerId match {
      case Some(param) => queryParams += "filter_owner_id" -> param.toString
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
    order match {
      case Some(param) => queryParams += "order" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getShippable(id: String)(implicit reader: ClientResponseReader[CartShippableResponse]): Future[CartShippableResponse] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/shippable")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->getShippable")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getShippingCountries(id: String)(implicit reader: ClientResponseReader[SampleCountriesResponse]): Future[SampleCountriesResponse] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/countries")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->getShippingCountries")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def removeDiscountFromCart(id: String,
    code: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/discounts/{code}")
      replaceAll ("\\{" + "id" + "\\}",id.toString)
      replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->removeDiscountFromCart")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling Store_Shopping_CartsApi->removeDiscountFromCart")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setCartCurrency(id: String,
    currencyCode: Option[StringWrapper] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[StringWrapper]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/currency")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->setCartCurrency")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(currencyCode))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setCartOwner(id: String,
    userId: Option[IntWrapper] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[IntWrapper]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/owner")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->setCartOwner")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(userId))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateItemInCart(id: String,
    cartItemRequest: Option[CartItemRequest] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CartItemRequest]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/items")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->updateItemInCart")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(cartItemRequest))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateShippingAddress(id: String,
    cartShippingAddressRequest: Option[CartShippingAddressRequest] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CartShippingAddressRequest]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/carts/{id}/shipping-address")
      replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling Store_Shopping_CartsApi->updateShippingAddress")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(cartShippingAddressRequest))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
