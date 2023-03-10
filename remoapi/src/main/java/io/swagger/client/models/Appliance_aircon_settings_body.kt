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
 * 
 * @param temperature Temperature
 * @param operationMode AC operation mode
 * @param airVolume AC air volume
 * @param airDirection AC air direction
 * @param button Button
 */
data class ApplianceAirconSettingsBody (

    /* Temperature */
    val temperature: kotlin.String? = null,
    /* AC operation mode */
    val operationMode: kotlin.String? = null,
    /* AC air volume */
    val airVolume: kotlin.String? = null,
    /* AC air direction */
    val airDirection: kotlin.String? = null,
    /* Button */
    val button: kotlin.String? = null
) {
}