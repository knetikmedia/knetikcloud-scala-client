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

import io.swagger.client.model.PaymentAuthorizationResource
import io.swagger.client.model.PaymentMethodResource
import io.swagger.client.model.Result
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class PaymentsApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Create a new payment method for a user
   * 
   * @param userId ID of the user for whom the payment method is being created 
   * @param paymentMethod Payment method being created (optional)
   * @return PaymentMethodResource
   */
  def createPaymentMethod(userId: Integer, paymentMethod: Option[PaymentMethodResource] = None): Option[PaymentMethodResource] = {
    // create path and map variables
    val path = "/users/{user_id}/payment-methods".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = paymentMethod.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PaymentMethodResource]).asInstanceOf[PaymentMethodResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete an existing payment method for a user
   * 
   * @param userId ID of the user for whom the payment method is being updated 
   * @param id ID of the payment method being deleted 
   * @return void
   */
  def deletePaymentMethod(userId: Integer, id: Integer) = {
    // create path and map variables
    val path = "/users/{user_id}/payment-methods/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
   * Get a single payment method for a user
   * 
   * @param userId ID of the user for whom the payment method is being retrieved 
   * @param id ID of the payment method being retrieved 
   * @return PaymentMethodResource
   */
  def getPaymentMethod(userId: Integer, id: Integer): Option[PaymentMethodResource] = {
    // create path and map variables
    val path = "/users/{user_id}/payment-methods/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
           Some(apiInvoker.deserialize(s, "", classOf[PaymentMethodResource]).asInstanceOf[PaymentMethodResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get all payment methods for a user
   * 
   * @param userId ID of the user for whom the payment methods are being retrieved 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return List[PaymentMethodResource]
   */
  def getPaymentMethods(userId: Integer, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[List[PaymentMethodResource]] = {
    // create path and map variables
    val path = "/users/{user_id}/payment-methods".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

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
           Some(apiInvoker.deserialize(s, "array", classOf[PaymentMethodResource]).asInstanceOf[List[PaymentMethodResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Authorize payment of an invoice for later capture
   * 
   * @param request Payment authorization request (optional)
   * @return PaymentAuthorizationResource
   */
  def paymentAuthorization(request: Option[PaymentAuthorizationResource] = None): Option[PaymentAuthorizationResource] = {
    // create path and map variables
    val path = "/payment/authorizations".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = request.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PaymentAuthorizationResource]).asInstanceOf[PaymentAuthorizationResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Capture an existing invoice payment authorization
   * 
   * @param id ID of the payment authorization to capture 
   * @return void
   */
  def paymentCapture(id: Integer) = {
    // create path and map variables
    val path = "/payment/authorizations/{id}/capture".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
   * Update an existing payment method for a user
   * 
   * @param userId ID of the user for whom the payment method is being updated 
   * @param id ID of the payment method being updated 
   * @param paymentMethod The updated payment method data (optional)
   * @return PaymentMethodResource
   */
  def updatePaymentMethod(userId: Integer, id: Integer, paymentMethod: Option[PaymentMethodResource] = None): Option[PaymentMethodResource] = {
    // create path and map variables
    val path = "/users/{user_id}/payment-methods/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = paymentMethod.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PaymentMethodResource]).asInstanceOf[PaymentMethodResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
