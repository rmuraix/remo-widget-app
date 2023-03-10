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

import io.swagger.client.models.Button
import io.swagger.client.models.LIGHTState

/**
 * 
 * @param state 
 * @param buttons 
 */
data class LIGHT (

    val state: LIGHTState? = null,
    val buttons: kotlin.Array<Button>? = null
) {
}