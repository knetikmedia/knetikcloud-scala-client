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

import io.swagger.client.model.AddressResource
import io.swagger.client.model.InvoiceCreateRequest
import io.swagger.client.model.InvoicePaymentStatusRequest
import io.swagger.client.model.InvoiceResource
import io.swagger.client.model.PageInvoiceLogEntry
import io.swagger.client.model.PageInvoiceResource
import io.swagger.client.model.PayBySavedMethodRequest
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class InvoicesApi(val defBasePath: String = "https://localhost:8080/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Create an invoice
   * Create an invoice(s) by providing a cart GUID. Note that there may be multiple invoices created, one per vendor.
   * @param req Invoice to be created (optional)
   * @return List[InvoiceResource]
   */
  def createInvoiceUsingPOST(req: Option[InvoiceCreateRequest] = None): Option[List[InvoiceResource]] = {
    // create path and map variables
    val path = "/invoices".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = req.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[InvoiceResource]).asInstanceOf[List[InvoiceResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve invoices
   * Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user&#39;s invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices.
   * @param filterUser The id of a user to get invoices for. Automtically added if not being called with admin permissions. (optional)
   * @param filterEmail Filters invoices by customer&#39;s email. Admins only. (optional)
   * @param filterFulfillmentStatus Filters invoices by fulfillment status type. Can be a comma separated list of statuses (optional)
   * @param filterPaymentStatus Filters invoices by payment status type. Can be a comma separated list of statuses (optional)
   * @param filterItemName Filters invoices by item name containing the given string (optional)
   * @param filterCreatedDate Filters invoices by creation date. Multiple values possible for range search. Format: filter_created_date&#x3D;OP,ts&amp;... where OP in (GT, LT, GOE, LOE, EQ) and ts is a unix timestamp in seconds. Ex: filter_created_date&#x3D;GT,1452154258,LT,1554254874 (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageInvoiceResource
   */
  def getInvoiceHistoryUsingGET(filterUser: Option[Integer] = None, filterEmail: Option[String] = None, filterFulfillmentStatus: Option[String] = None, filterPaymentStatus: Option[String] = None, filterItemName: Option[String] = None, filterCreatedDate: Option[String] = None, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/, order: Option[String] /* = id:ASC*/): Option[PageInvoiceResource] = {
    // create path and map variables
    val path = "/invoices".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    filterUser.map(paramVal => queryParams += "filter_user" -> paramVal.toString)
    filterEmail.map(paramVal => queryParams += "filter_email" -> paramVal.toString)
    filterFulfillmentStatus.map(paramVal => queryParams += "filter_fulfillment_status" -> paramVal.toString)
    filterPaymentStatus.map(paramVal => queryParams += "filter_payment_status" -> paramVal.toString)
    filterItemName.map(paramVal => queryParams += "filter_item_name" -> paramVal.toString)
    filterCreatedDate.map(paramVal => queryParams += "filter_created_date" -> paramVal.toString)
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
           Some(ApiInvoker.deserialize(s, "", classOf[PageInvoiceResource]).asInstanceOf[PageInvoiceResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Retrieve an invoice
   * The postal code associated with the invoice may be required for security purposes if the invoice has one set and the config postal_code_required is set to true. Send &#39;none&#39; if the invoice has no postal code.
   * @param id The id of the invoice 
   * @param postalCode The postal code of the invoice or &#39;none&#39;. (optional)
   * @return InvoiceResource
   */
  def getInvoiceUsingGET(id: Integer, postalCode: Option[String] = None): Option[InvoiceResource] = {
    // create path and map variables
    val path = "/invoices/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    postalCode.map(paramVal => queryParams += "postal_code" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[InvoiceResource]).asInstanceOf[InvoiceResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List invoice logs
   * 
   * @param id The id of the invoice 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageInvoiceLogEntry
   */
  def getLogsUsingGET(id: Integer, size: Option[Integer] /* = 25*/, page: Option[Integer] /* = 1*/): Option[PageInvoiceLogEntry] = {
    // create path and map variables
    val path = "/invoices/{id}/logs".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

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
           Some(ApiInvoker.deserialize(s, "", classOf[PageInvoiceLogEntry]).asInstanceOf[PageInvoiceLogEntry])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Lists available fulfillment statuses
   * 
   * @return List[String]
   */
  def listFulFillmentStatusesUsingGET(): Option[List[String]] = {
    // create path and map variables
    val path = "/invoices/fulfillment-statuses".replaceAll("\\{format\\}", "json")

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
   * Lists available payment statuses
   * 
   * @return List[String]
   */
  def listPaymentStatusesUsingGET(): Option[List[String]] = {
    // create path and map variables
    val path = "/invoices/payment-statuses".replaceAll("\\{format\\}", "json")

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
   * Trigger payment of an invoice
   * 
   * @param id The id of the invoice 
   * @param request Payment info (optional)
   * @return void
   */
  def payInvoiceUsingPOST(id: Integer, request: Option[PayBySavedMethodRequest] = None) = {
    // create path and map variables
    val path = "/invoices/{id}/payments".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Set the fulfillment status of an invoice item
   * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which.
   * @param id The id of the invoice 
   * @param sku The sku of an item in the invoice 
   * @param status The new fulfillment status for the item. Additional options may be available based on configuration.  Allowable values:  &#39;unfulfilled&#39;, &#39;fulfilled&#39;, &#39;not fulfillable&#39;, &#39;failed&#39;, &#39;processing&#39;, &#39;failed_permanent&#39;, &#39;delayed&#39; 
   * @return void
   */
  def setItemFulfillmentStatusUsingPUT(id: Integer, sku: String, status: String) = {
    // create path and map variables
    val path = "/invoices/{id}/items/{sku}/fulfillment-status".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id)).replaceAll("\\{" + "sku" + "\\}",apiInvoker.escape(sku))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (sku == null) throw new Exception("Missing required parameter 'sku' when calling InvoicesApi->setItemFulfillmentStatusUsingPUT")

    if (status == null) throw new Exception("Missing required parameter 'status' when calling InvoicesApi->setItemFulfillmentStatusUsingPUT")

    

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
   * Set the order notes of an invoice
   * 
   * @param id The id of the invoice 
   * @param orderNotes Payment status info (optional)
   * @return void
   */
  def setOrderNotesUsingPUT(id: Integer, orderNotes: Option[String] = None) = {
    // create path and map variables
    val path = "/invoices/{id}/order-notes".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = orderNotes.map(paramVal => paramVal)

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
   * Set the payment status of an invoice
   * This may trigger fulfillment if setting the status to &#39;paid&#39;. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which.
   * @param id The id of the invoice 
   * @param request Payment status info (optional)
   * @return void
   */
  def setPaymentStatusUsingPUT(id: Integer, request: Option[InvoicePaymentStatusRequest] = None) = {
    // create path and map variables
    val path = "/invoices/{id}/payment-status".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

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
   * Set or update billing info
   * 
   * @param id The id of the invoice 
   * @param billingInfoRequest Address info (optional)
   * @return void
   */
  def updateBillingInfoUsingPUT(id: Integer, billingInfoRequest: Option[AddressResource] = None) = {
    // create path and map variables
    val path = "/invoices/{id}/billing-address".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = billingInfoRequest.map(paramVal => paramVal)

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