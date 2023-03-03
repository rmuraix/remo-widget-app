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

import io.swagger.client.models.Id
import io.swagger.client.models.Image

/**
 * 
 * @param id 
 * @param manufacturer 
 * @param remoteName 
 * @param name 
 * @param image 
 */
data class ApplianceModel (

    val id: Id? = null,
    val manufacturer: kotlin.String? = null,
    val remoteName: kotlin.String? = null,
    val name: kotlin.String? = null,
    val image: Image? = null
) {
}