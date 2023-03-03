/**
 * Nature API
 * Read/Write Nature Remo
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models


/**
 * The ECHONET lite properties fetched from the appliance. See \"Detailed Requirements for ECHONET Device Objects\" for more details. ref. https://echonet.jp/spec_object_rl_en/ 
 * @param name 
 * @param epc ECHONET Property
 * @param &#x60;val&#x60; 
 * @param updatedAt 
 */
data class EchonetLiteProperty (

    val name: kotlin.String? = null,
    /* ECHONET Property */
    val epc: kotlin.Int? = null,
    val `val`: kotlin.String? = null,
    val updatedAt: java.time.LocalDateTime? = null
) {
}