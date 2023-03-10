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
 * The range of OperationModes which the air conditioner accepts depends on the air conditioner model. Check the 'AirConRangeMode' information in the response for the range of the particular air conditioner model.
 * Values: EMPTY,COOL,WARM,DRY,BLOW,AUTO
 */
enum class OperationMode(val value: kotlin.String){
    EMPTY(""),// :/
    COOL("cool"),// :/
    WARM("warm"),// :/
    DRY("dry"),// :/
    BLOW("blow"),// :/
    AUTO("auto");// :/
}