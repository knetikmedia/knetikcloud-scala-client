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

import com.knetikcloud.client.model.CreateBillingAgreementRequest
import com.knetikcloud.client.model.CreatePayPalPaymentRequest
import com.knetikcloud.client.model.FinalizeBillingAgreementRequest
import com.knetikcloud.client.model.FinalizePayPalPaymentRequest
import com.knetikcloud.client.model.Result
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

class PaymentsPayPalClassicApi(val defBasePath: String = "https://sandbox.knetikcloud.com",
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
  val helper = new PaymentsPayPalClassicApiAsyncHelper(client, config)

  /**
   * Create a PayPal Classic billing agreement for the user
   * Returns the token that should be used to forward the user to PayPal so they can accept the agreement. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to create a PayPal billing agreement (optional)
   * @return String
   */
  def createPayPalBillingAgreementUrl(request: Option[CreateBillingAgreementRequest] = None): Option[String] = {
    val await = Try(Await.result(createPayPalBillingAgreementUrlAsync(request), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a PayPal Classic billing agreement for the user asynchronously
   * Returns the token that should be used to forward the user to PayPal so they can accept the agreement. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to create a PayPal billing agreement (optional)
   * @return Future(String)
  */
  def createPayPalBillingAgreementUrlAsync(request: Option[CreateBillingAgreementRequest] = None): Future[String] = {
      helper.createPayPalBillingAgreementUrl(request)
  }


  /**
   * Create a payment token for PayPal express checkout
   * Returns the token that should be used to forward the user to PayPal so they can complete the checkout. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to create a PayPal payment token (optional)
   * @return String
   */
  def createPayPalExpressCheckout(request: Option[CreatePayPalPaymentRequest] = None): Option[String] = {
    val await = Try(Await.result(createPayPalExpressCheckoutAsync(request), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a payment token for PayPal express checkout asynchronously
   * Returns the token that should be used to forward the user to PayPal so they can complete the checkout. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to create a PayPal payment token (optional)
   * @return Future(String)
  */
  def createPayPalExpressCheckoutAsync(request: Option[CreatePayPalPaymentRequest] = None): Future[String] = {
      helper.createPayPalExpressCheckout(request)
  }


  /**
   * Finalizes a billing agreement after the user has accepted through PayPal
   * Returns the ID of the new payment method created for the user for the billing agreement. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to finalize a PayPal billing agreement (optional)
   * @return Integer
   */
  def finalizePayPalBillingAgreement(request: Option[FinalizeBillingAgreementRequest] = None): Option[Integer] = {
    val await = Try(Await.result(finalizePayPalBillingAgreementAsync(request), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Finalizes a billing agreement after the user has accepted through PayPal asynchronously
   * Returns the ID of the new payment method created for the user for the billing agreement. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to finalize a PayPal billing agreement (optional)
   * @return Future(Integer)
  */
  def finalizePayPalBillingAgreementAsync(request: Option[FinalizeBillingAgreementRequest] = None): Future[Integer] = {
      helper.finalizePayPalBillingAgreement(request)
  }


  /**
   * Finalizes a payment after the user has completed checkout with PayPal
   * The invoice will be marked paid/failed by asynchronous IPN callback. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to finalize the payment (optional)
   * @return void
   */
  def finalizePayPalCheckout(request: Option[FinalizePayPalPaymentRequest] = None) = {
    val await = Try(Await.result(finalizePayPalCheckoutAsync(request), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Finalizes a payment after the user has completed checkout with PayPal asynchronously
   * The invoice will be marked paid/failed by asynchronous IPN callback. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to finalize the payment (optional)
   * @return Future(void)
  */
  def finalizePayPalCheckoutAsync(request: Option[FinalizePayPalPaymentRequest] = None) = {
      helper.finalizePayPalCheckout(request)
  }


}

class PaymentsPayPalClassicApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createPayPalBillingAgreementUrl(request: Option[CreateBillingAgreementRequest] = None
    )(implicit reader: ClientResponseReader[String], writer: RequestWriter[CreateBillingAgreementRequest]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/payment/provider/paypal/classic/agreements/start"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(request))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createPayPalExpressCheckout(request: Option[CreatePayPalPaymentRequest] = None
    )(implicit reader: ClientResponseReader[String], writer: RequestWriter[CreatePayPalPaymentRequest]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/payment/provider/paypal/classic/checkout/start"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(request))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def finalizePayPalBillingAgreement(request: Option[FinalizeBillingAgreementRequest] = None
    )(implicit reader: ClientResponseReader[Integer], writer: RequestWriter[FinalizeBillingAgreementRequest]): Future[Integer] = {
    // create path and map variables
    val path = (addFmt("/payment/provider/paypal/classic/agreements/finish"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(request))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def finalizePayPalCheckout(request: Option[FinalizePayPalPaymentRequest] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[FinalizePayPalPaymentRequest]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/payment/provider/paypal/classic/checkout/finish"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(request))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
