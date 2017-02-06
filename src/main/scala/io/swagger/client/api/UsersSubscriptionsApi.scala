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

import io.swagger.client.model.InventorySubscriptionResource
import io.swagger.client.model.InvoiceResource
import io.swagger.client.model.ReactivateSubscriptionRequest
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class UsersSubscriptionsApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Get details about a user&#39;s subscription
   * 
   * @param userId The id of the user 
   * @param inventoryId The id of the user&#39;s inventory 
   * @return InventorySubscriptionResource
   */
  def getUserSubscriptionDetails(userId: Integer, inventoryId: Integer): Option[InventorySubscriptionResource] = {
    // create path and map variables
    val path = "/users/{user_id}/subscriptions/{inventory_id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "inventory_id" + "\\}",apiInvoker.escape(inventoryId))

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
           Some(apiInvoker.deserialize(s, "", classOf[InventorySubscriptionResource]).asInstanceOf[InventorySubscriptionResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get details about a user&#39;s subscriptions
   * 
   * @param userId The id of the user 
   * @return List[InventorySubscriptionResource]
   */
  def getUsersSubscriptionDetails(userId: Integer): Option[List[InventorySubscriptionResource]] = {
    // create path and map variables
    val path = "/users/{user_id}/subscriptions".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId))

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
           Some(apiInvoker.deserialize(s, "array", classOf[InventorySubscriptionResource]).asInstanceOf[List[InventorySubscriptionResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Reactivate a subscription and charge fee
   * 
   * @param userId The id of the user 
   * @param inventoryId The id of the user&#39;s inventory 
   * @param reactivateSubscriptionRequest The reactivate subscription request object inventory (optional)
   * @return InvoiceResource
   */
  def reactivateUserSubscription(userId: Integer, inventoryId: Integer, reactivateSubscriptionRequest: Option[ReactivateSubscriptionRequest] = None): Option[InvoiceResource] = {
    // create path and map variables
    val path = "/users/{user_id}/subscriptions/{inventory_id}/reactivate".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "inventory_id" + "\\}",apiInvoker.escape(inventoryId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = reactivateSubscriptionRequest.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[InvoiceResource]).asInstanceOf[InvoiceResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Set a new date to bill a subscription on
   * 
   * @param userId The id of the user 
   * @param inventoryId The id of the user&#39;s inventory 
   * @param billDate The new bill date. Unix timestamp in seconds 
   * @return void
   */
  def setSubscriptionBillDate(userId: Integer, inventoryId: Integer, billDate: Long) = {
    // create path and map variables
    val path = "/users/{user_id}/subscriptions/{inventory_id}/bill-date".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "inventory_id" + "\\}",apiInvoker.escape(inventoryId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = billDate

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
   * Set the payment method to use for a subscription
   * May send null to use floating default
   * @param userId The id of the user 
   * @param inventoryId The id of the user&#39;s inventory 
   * @param paymentMethodId The id of the payment method (optional)
   * @return void
   */
  def setSubscriptionPaymentMethod(userId: Integer, inventoryId: Integer, paymentMethodId: Option[Integer] = None) = {
    // create path and map variables
    val path = "/users/{user_id}/subscriptions/{inventory_id}/payment-method".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "inventory_id" + "\\}",apiInvoker.escape(inventoryId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = paymentMethodId.map(paramVal => paramVal)

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
   * Set the status of a subscription
   * The body is a json string (put in quotes) that should match a desired invoice status type. Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases
   * @param userId The id of the user 
   * @param inventoryId The id of the user&#39;s inventory 
   * @param status The new status for the subscription. Actual options may differ from the indicated set if the invoice status type data has been altered.  Allowable values: (&#39;current&#39;, &#39;canceled&#39;, &#39;stopped&#39;, &#39;payment_failed&#39;, &#39;suspended&#39;) 
   * @return void
   */
  def setSubscriptionStatus(userId: Integer, inventoryId: Integer, status: String) = {
    // create path and map variables
    val path = "/users/{user_id}/subscriptions/{inventory_id}/status".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "inventory_id" + "\\}",apiInvoker.escape(inventoryId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (status == null) throw new Exception("Missing required parameter 'status' when calling UsersSubscriptionsApi->setSubscriptionStatus")

    

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
   * Set a new subscription plan for a user
   * 
   * @param userId The id of the user 
   * @param inventoryId The id of the user&#39;s inventory 
   * @param planId The id of the new plan. Must be from the same subscription (optional)
   * @return void
   */
  def setUserSubscriptionPlan(userId: Integer, inventoryId: Integer, planId: Option[String] = None) = {
    // create path and map variables
    val path = "/users/{user_id}/subscriptions/{inventory_id}/plan".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "user_id" + "\\}",apiInvoker.escape(userId)).replaceAll("\\{" + "inventory_id" + "\\}",apiInvoker.escape(inventoryId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = planId.map(paramVal => paramVal)

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
