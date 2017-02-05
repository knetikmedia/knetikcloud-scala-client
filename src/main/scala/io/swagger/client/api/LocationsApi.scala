/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import io.swagger.client.model.CityResource
import io.swagger.client.model.CountryResource
import io.swagger.client.model.CurrencyResource
import io.swagger.client.model.StateResource
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class LocationsApi(val defBasePath: String = "https://integration.knetikcloud.com/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Get a list of a state&#39;s cities
   * 
   * @param countryCodeIso3 The iso3 code of the country 
   * @param stateCode The code of the state 
   * @return List[CityResource]
   */
  def citiesUsingGET(countryCodeIso3: String, stateCode: String): Option[List[CityResource]] = {
    // create path and map variables
    val path = "/location/countries/{country_code_iso3}/states/{state_code}/cities".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "country_code_iso3" + "\\}",apiInvoker.escape(countryCodeIso3)).replaceAll("\\{" + "state_code" + "\\}",apiInvoker.escape(stateCode))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (countryCodeIso3 == null) throw new Exception("Missing required parameter 'countryCodeIso3' when calling LocationsApi->citiesUsingGET")

    if (stateCode == null) throw new Exception("Missing required parameter 'stateCode' when calling LocationsApi->citiesUsingGET")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "array", classOf[CityResource]).asInstanceOf[List[CityResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a list of countries
   * 
   * @return List[CountryResource]
   */
  def countriesUsingGET(): Option[List[CountryResource]] = {
    // create path and map variables
    val path = "/location/countries".replaceAll("\\{format\\}", "json")

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
           Some(apiInvoker.deserialize(s, "array", classOf[CountryResource]).asInstanceOf[List[CountryResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get the currency information of your country
   * Determined by geo ip location, currency to country mapping and a fallback setting
   * @return CurrencyResource
   */
  def getCurrencyByGeoLocationUsingGET(): Option[CurrencyResource] = {
    // create path and map variables
    val path = "/location/geolocation/currency".replaceAll("\\{format\\}", "json")

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
           Some(apiInvoker.deserialize(s, "", classOf[CurrencyResource]).asInstanceOf[CurrencyResource])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get the iso3 code of your country
   * Determined by geo ip location
   * @return String
   */
  def getGeoLocationCountryUsingGET(): Option[String] = {
    // create path and map variables
    val path = "/location/geolocation/country".replaceAll("\\{format\\}", "json")

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
           Some(apiInvoker.deserialize(s, "", classOf[String]).asInstanceOf[String])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a list of a country&#39;s states
   * 
   * @param countryCodeIso3 The iso3 code of the country 
   * @return List[StateResource]
   */
  def statesUsingGET(countryCodeIso3: String): Option[List[StateResource]] = {
    // create path and map variables
    val path = "/location/countries/{country_code_iso3}/states".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "country_code_iso3" + "\\}",apiInvoker.escape(countryCodeIso3))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (countryCodeIso3 == null) throw new Exception("Missing required parameter 'countryCodeIso3' when calling LocationsApi->statesUsingGET")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "array", classOf[StateResource]).asInstanceOf[List[StateResource]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
