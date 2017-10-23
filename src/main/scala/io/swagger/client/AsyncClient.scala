package io.swagger.client

import com.knetikcloud.client.model._

import com.wordnik.swagger.client._

import java.io.Closeable

class AsyncClient(config: SwaggerConfig) extends Closeable {
  val locator = config.locator
  val name = config.name

  private[this] val client = transportClient

  protected def transportClient: TransportClient = new RestClient(config)

  def close() {
    client.close()
  }
}
