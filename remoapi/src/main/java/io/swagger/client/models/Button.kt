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

import io.swagger.client.models.Image

/**
 * 
 * @param name Name of button. It is used for \"POST /1/{applaince}/tv\" and \"POST /1/{appliance}/light\".
 * @param image 
 * @param label Label of button.
 */
data class Button (

    /* Name of button. It is used for \"POST /1/{applaince}/tv\" and \"POST /1/{appliance}/light\". */
    val name: kotlin.String? = null,
    val image: Image? = null,
    /* Label of button. */
    val label: kotlin.String? = null
) {
}