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

import com.knetikcloud.client.model.CountryResource
import com.knetikcloud.client.model.CurrencyResource
import com.knetikcloud.client.model.Result
import com.knetikcloud.client.model.StateResource
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

class LocationsApi(val defBasePath: String = "https://devsandbox.knetikcloud.com",
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
  val helper = new LocationsApiAsyncHelper(client, config)

  /**
   * Get a list of countries
   * 
   * @return List[CountryResource]
   */
  def getCountries(): Option[List[CountryResource]] = {
    val await = Try(Await.result(getCountriesAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a list of countries asynchronously
   * 
   * @return Future(List[CountryResource])
  */
  def getCountriesAsync(): Future[List[CountryResource]] = {
      helper.getCountries()
  }


  /**
   * Get the iso3 code of your country
   * Determined by geo ip location
   * @return String
   */
  def getCountryByGeoLocation(): Option[String] = {
    val await = Try(Await.result(getCountryByGeoLocationAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get the iso3 code of your country asynchronously
   * Determined by geo ip location
   * @return Future(String)
  */
  def getCountryByGeoLocationAsync(): Future[String] = {
      helper.getCountryByGeoLocation()
  }


  /**
   * Get a list of a country&#39;s states
   * 
   * @param countryCodeIso3 The iso3 code of the country 
   * @return List[StateResource]
   */
  def getCountryStates(countryCodeIso3: String): Option[List[StateResource]] = {
    val await = Try(Await.result(getCountryStatesAsync(countryCodeIso3), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a list of a country&#39;s states asynchronously
   * 
   * @param countryCodeIso3 The iso3 code of the country 
   * @return Future(List[StateResource])
  */
  def getCountryStatesAsync(countryCodeIso3: String): Future[List[StateResource]] = {
      helper.getCountryStates(countryCodeIso3)
  }


  /**
   * Get the currency information of your country
   * Determined by geo ip location, currency to country mapping and a fallback setting
   * @return CurrencyResource
   */
  def getCurrencyByGeoLocation(): Option[CurrencyResource] = {
    val await = Try(Await.result(getCurrencyByGeoLocationAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get the currency information of your country asynchronously
   * Determined by geo ip location, currency to country mapping and a fallback setting
   * @return Future(CurrencyResource)
  */
  def getCurrencyByGeoLocationAsync(): Future[CurrencyResource] = {
      helper.getCurrencyByGeoLocation()
  }


}

class LocationsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getCountries()(implicit reader: ClientResponseReader[List[CountryResource]]): Future[List[CountryResource]] = {
    // create path and map variables
    val path = (addFmt("/location/countries"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCountryByGeoLocation()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/location/geolocation/country"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCountryStates(countryCodeIso3: String)(implicit reader: ClientResponseReader[List[StateResource]]): Future[List[StateResource]] = {
    // create path and map variables
    val path = (addFmt("/location/countries/{country_code_iso3}/states")
      replaceAll ("\\{" + "country_code_iso3" + "\\}",countryCodeIso3.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (countryCodeIso3 == null) throw new Exception("Missing required parameter 'countryCodeIso3' when calling LocationsApi->getCountryStates")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCurrencyByGeoLocation()(implicit reader: ClientResponseReader[CurrencyResource]): Future[CurrencyResource] = {
    // create path and map variables
    val path = (addFmt("/location/geolocation/currency"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
