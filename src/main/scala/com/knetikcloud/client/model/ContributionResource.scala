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

package com.knetikcloud.client.model


case class ContributionResource (
  /* A reference to the contributing artist */
  artist: SimpleReferenceResourcelong,
  /* A reference to the media being contributed to */
  media: SimpleReferenceResourcelong,
  /* The nature of the contribution (role of the artist as in 'producer', 'performer', etc) */
  role: String
)

