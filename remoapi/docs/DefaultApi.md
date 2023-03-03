# DefaultApi

All URIs are relative to *https://api.nature.global/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**1ApplianceOrdersPost**](DefaultApi.md#1ApplianceOrdersPost) | **POST** /1/appliance_orders | 
[**1AppliancesApplianceAirconSettingsPost**](DefaultApi.md#1AppliancesApplianceAirconSettingsPost) | **POST** /1/appliances/{appliance}/aircon_settings | 
[**1AppliancesApplianceDeletePost**](DefaultApi.md#1AppliancesApplianceDeletePost) | **POST** /1/appliances/{appliance}/delete | 
[**1AppliancesApplianceLightPost**](DefaultApi.md#1AppliancesApplianceLightPost) | **POST** /1/appliances/{appliance}/light | 
[**1AppliancesAppliancePost**](DefaultApi.md#1AppliancesAppliancePost) | **POST** /1/appliances/{appliance} | 
[**1AppliancesApplianceSignalOrdersPost**](DefaultApi.md#1AppliancesApplianceSignalOrdersPost) | **POST** /1/appliances/{appliance}/signal_orders | 
[**1AppliancesApplianceSignalsGet**](DefaultApi.md#1AppliancesApplianceSignalsGet) | **GET** /1/appliances/{appliance}/signals | 
[**1AppliancesApplianceSignalsPost**](DefaultApi.md#1AppliancesApplianceSignalsPost) | **POST** /1/appliances/{appliance}/signals | 
[**1AppliancesApplianceTvPost**](DefaultApi.md#1AppliancesApplianceTvPost) | **POST** /1/appliances/{appliance}/tv | 
[**1AppliancesGet**](DefaultApi.md#1AppliancesGet) | **GET** /1/appliances | 
[**1AppliancesPost**](DefaultApi.md#1AppliancesPost) | **POST** /1/appliances | 
[**1DetectappliancePost**](DefaultApi.md#1DetectappliancePost) | **POST** /1/detectappliance | 
[**1DevicesDeviceDeletePost**](DefaultApi.md#1DevicesDeviceDeletePost) | **POST** /1/devices/{device}/delete | 
[**1DevicesDeviceHumidityOffsetPost**](DefaultApi.md#1DevicesDeviceHumidityOffsetPost) | **POST** /1/devices/{device}/humidity_offset | 
[**1DevicesDevicePost**](DefaultApi.md#1DevicesDevicePost) | **POST** /1/devices/{device} | 
[**1DevicesDeviceTemperatureOffsetPost**](DefaultApi.md#1DevicesDeviceTemperatureOffsetPost) | **POST** /1/devices/{device}/temperature_offset | 
[**1DevicesGet**](DefaultApi.md#1DevicesGet) | **GET** /1/devices | 
[**1SignalsSignalDeletePost**](DefaultApi.md#1SignalsSignalDeletePost) | **POST** /1/signals/{signal}/delete | 
[**1SignalsSignalPost**](DefaultApi.md#1SignalsSignalPost) | **POST** /1/signals/{signal} | 
[**1SignalsSignalSendPost**](DefaultApi.md#1SignalsSignalSendPost) | **POST** /1/signals/{signal}/send | 
[**1UsersMeGet**](DefaultApi.md#1UsersMeGet) | **GET** /1/users/me | 
[**1UsersMePost**](DefaultApi.md#1UsersMePost) | **POST** /1/users/me | 

<a name="1ApplianceOrdersPost"></a>
# **1ApplianceOrdersPost**
> 1ApplianceOrdersPost(appliances)



Reorder appliances.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val appliances : kotlin.String = appliances_example // kotlin.String | 
try {
    apiInstance.1ApplianceOrdersPost(appliances)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1ApplianceOrdersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1ApplianceOrdersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appliances** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="1AppliancesApplianceAirconSettingsPost"></a>
# **1AppliancesApplianceAirconSettingsPost**
> 1AppliancesApplianceAirconSettingsPost(appliance, temperature, operationMode, airVolume, airDirection, button)



Update air conditioner settings.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val appliance : kotlin.String = appliance_example // kotlin.String | Appliance ID.
val temperature : kotlin.String = temperature_example // kotlin.String | 
val operationMode : kotlin.String = operationMode_example // kotlin.String | 
val airVolume : kotlin.String = airVolume_example // kotlin.String | 
val airDirection : kotlin.String = airDirection_example // kotlin.String | 
val button : kotlin.String = button_example // kotlin.String | 
try {
    apiInstance.1AppliancesApplianceAirconSettingsPost(appliance, temperature, operationMode, airVolume, airDirection, button)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesApplianceAirconSettingsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesApplianceAirconSettingsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appliance** | **kotlin.String**| Appliance ID. |
 **temperature** | **kotlin.String**|  | [optional]
 **operationMode** | **kotlin.String**|  | [optional]
 **airVolume** | **kotlin.String**|  | [optional]
 **airDirection** | **kotlin.String**|  | [optional]
 **button** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="1AppliancesApplianceDeletePost"></a>
# **1AppliancesApplianceDeletePost**
> 1AppliancesApplianceDeletePost(appliance)



Delete appliance.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val appliance : kotlin.String = appliance_example // kotlin.String | Appliance ID.
try {
    apiInstance.1AppliancesApplianceDeletePost(appliance)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesApplianceDeletePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesApplianceDeletePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appliance** | **kotlin.String**| Appliance ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="1AppliancesApplianceLightPost"></a>
# **1AppliancesApplianceLightPost**
> 1AppliancesApplianceLightPost(button, appliance)



Send light infrared signal.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val button : kotlin.String = button_example // kotlin.String | 
val appliance : kotlin.String = appliance_example // kotlin.String | Appliance ID.
try {
    apiInstance.1AppliancesApplianceLightPost(button, appliance)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesApplianceLightPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesApplianceLightPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **button** | **kotlin.String**|  |
 **appliance** | **kotlin.String**| Appliance ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="1AppliancesAppliancePost"></a>
# **1AppliancesAppliancePost**
> Appliance 1AppliancesAppliancePost(image, nickname, appliance)



Update appliance.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val image : kotlin.String = image_example // kotlin.String | 
val nickname : kotlin.String = nickname_example // kotlin.String | 
val appliance : kotlin.String = appliance_example // kotlin.String | Appliance ID.
try {
    val result : Appliance = apiInstance.1AppliancesAppliancePost(image, nickname, appliance)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesAppliancePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesAppliancePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **kotlin.String**|  |
 **nickname** | **kotlin.String**|  |
 **appliance** | **kotlin.String**| Appliance ID. |

### Return type

[**Appliance**](Appliance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="1AppliancesApplianceSignalOrdersPost"></a>
# **1AppliancesApplianceSignalOrdersPost**
> 1AppliancesApplianceSignalOrdersPost(signals, appliance)



Reorder signals under this appliance.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val signals : kotlin.String = signals_example // kotlin.String | 
val appliance : kotlin.String = appliance_example // kotlin.String | Appliance ID.
try {
    apiInstance.1AppliancesApplianceSignalOrdersPost(signals, appliance)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesApplianceSignalOrdersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesApplianceSignalOrdersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signals** | **kotlin.String**|  |
 **appliance** | **kotlin.String**| Appliance ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="1AppliancesApplianceSignalsGet"></a>
# **1AppliancesApplianceSignalsGet**
> kotlin.Array&lt;Signal&gt; 1AppliancesApplianceSignalsGet(appliance)



Fetch signals registered under this appliance.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val appliance : kotlin.String = appliance_example // kotlin.String | Appliance ID.
try {
    val result : kotlin.Array<Signal> = apiInstance.1AppliancesApplianceSignalsGet(appliance)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesApplianceSignalsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesApplianceSignalsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appliance** | **kotlin.String**| Appliance ID. |

### Return type

[**kotlin.Array&lt;Signal&gt;**](Signal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="1AppliancesApplianceSignalsPost"></a>
# **1AppliancesApplianceSignalsPost**
> Signal 1AppliancesApplianceSignalsPost(message, image, name, appliance)



Create a signal under this appliance.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val message : kotlin.String = message_example // kotlin.String | 
val image : kotlin.String = image_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val appliance : kotlin.String = appliance_example // kotlin.String | Appliance ID.
try {
    val result : Signal = apiInstance.1AppliancesApplianceSignalsPost(message, image, name, appliance)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesApplianceSignalsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesApplianceSignalsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **kotlin.String**|  |
 **image** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **appliance** | **kotlin.String**| Appliance ID. |

### Return type

[**Signal**](Signal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="1AppliancesApplianceTvPost"></a>
# **1AppliancesApplianceTvPost**
> 1AppliancesApplianceTvPost(button, appliance)



Send tv infrared signal.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val button : kotlin.String = button_example // kotlin.String | 
val appliance : kotlin.String = appliance_example // kotlin.String | Appliance ID.
try {
    apiInstance.1AppliancesApplianceTvPost(button, appliance)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesApplianceTvPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesApplianceTvPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **button** | **kotlin.String**|  |
 **appliance** | **kotlin.String**| Appliance ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="1AppliancesGet"></a>
# **1AppliancesGet**
> kotlin.Array&lt;Appliance&gt; 1AppliancesGet()



Fetch the list of appliances.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
try {
    val result : kotlin.Array<Appliance> = apiInstance.1AppliancesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Appliance&gt;**](Appliance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="1AppliancesPost"></a>
# **1AppliancesPost**
> Appliance 1AppliancesPost(nickname, model, modelType, device, image)



Create a new appliance.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val nickname : kotlin.String = nickname_example // kotlin.String | 
val model : kotlin.String = model_example // kotlin.String | 
val modelType : kotlin.String = modelType_example // kotlin.String | 
val device : kotlin.String = device_example // kotlin.String | 
val image : kotlin.String = image_example // kotlin.String | 
try {
    val result : Appliance = apiInstance.1AppliancesPost(nickname, model, modelType, device, image)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1AppliancesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1AppliancesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nickname** | **kotlin.String**|  |
 **model** | **kotlin.String**|  |
 **modelType** | **kotlin.String**|  | [enum: AC, TV, LIGHT]
 **device** | **kotlin.String**|  |
 **image** | **kotlin.String**|  |

### Return type

[**Appliance**](Appliance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="1DetectappliancePost"></a>
# **1DetectappliancePost**
> kotlin.Array&lt;ApplianceModelAndParam&gt; 1DetectappliancePost(message)



Find the air conditioner best matching the provided infrared signal.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val message : kotlin.String = message_example // kotlin.String | 
try {
    val result : kotlin.Array<ApplianceModelAndParam> = apiInstance.1DetectappliancePost(message)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1DetectappliancePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1DetectappliancePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **kotlin.String**|  |

### Return type

[**kotlin.Array&lt;ApplianceModelAndParam&gt;**](ApplianceModelAndParam.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="1DevicesDeviceDeletePost"></a>
# **1DevicesDeviceDeletePost**
> 1DevicesDeviceDeletePost(device)



Delete Remo.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val device : kotlin.String = device_example // kotlin.String | Device ID.
try {
    apiInstance.1DevicesDeviceDeletePost(device)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1DevicesDeviceDeletePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1DevicesDeviceDeletePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device** | **kotlin.String**| Device ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="1DevicesDeviceHumidityOffsetPost"></a>
# **1DevicesDeviceHumidityOffsetPost**
> 1DevicesDeviceHumidityOffsetPost(offset, device)



Update humidity offset.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val offset : kotlin.Int = 56 // kotlin.Int | 
val device : kotlin.String = device_example // kotlin.String | Device ID.
try {
    apiInstance.1DevicesDeviceHumidityOffsetPost(offset, device)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1DevicesDeviceHumidityOffsetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1DevicesDeviceHumidityOffsetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.Int**|  |
 **device** | **kotlin.String**| Device ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="1DevicesDevicePost"></a>
# **1DevicesDevicePost**
> 1DevicesDevicePost(name, device)



Update Remo

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val name : kotlin.String = name_example // kotlin.String | 
val device : kotlin.String = device_example // kotlin.String | Device ID.
try {
    apiInstance.1DevicesDevicePost(name, device)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1DevicesDevicePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1DevicesDevicePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **device** | **kotlin.String**| Device ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="1DevicesDeviceTemperatureOffsetPost"></a>
# **1DevicesDeviceTemperatureOffsetPost**
> 1DevicesDeviceTemperatureOffsetPost(offset, device)



Update temperature offset.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val offset : kotlin.Int = 56 // kotlin.Int | 
val device : kotlin.String = device_example // kotlin.String | Device ID.
try {
    apiInstance.1DevicesDeviceTemperatureOffsetPost(offset, device)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1DevicesDeviceTemperatureOffsetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1DevicesDeviceTemperatureOffsetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.Int**|  |
 **device** | **kotlin.String**| Device ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="1DevicesGet"></a>
# **1DevicesGet**
> Devices 1DevicesGet()



Fetch the list of Remo devices the user has access to.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
try {
    val result : Devices = apiInstance.1DevicesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1DevicesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1DevicesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Devices**](Devices.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="1SignalsSignalDeletePost"></a>
# **1SignalsSignalDeletePost**
> 1SignalsSignalDeletePost(signal)



Delete an infrared signal.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val signal : kotlin.String = signal_example // kotlin.String | Signal ID.
try {
    apiInstance.1SignalsSignalDeletePost(signal)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1SignalsSignalDeletePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1SignalsSignalDeletePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signal** | **kotlin.String**| Signal ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="1SignalsSignalPost"></a>
# **1SignalsSignalPost**
> 1SignalsSignalPost(image, name, signal)



Update infrared signal.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val image : kotlin.String = image_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val signal : kotlin.String = signal_example // kotlin.String | Signal ID.
try {
    apiInstance.1SignalsSignalPost(image, name, signal)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1SignalsSignalPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1SignalsSignalPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **signal** | **kotlin.String**| Signal ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="1SignalsSignalSendPost"></a>
# **1SignalsSignalSendPost**
> 1SignalsSignalSendPost(signal)



Send infrared signal.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val signal : kotlin.String = signal_example // kotlin.String | Signal ID.
try {
    apiInstance.1SignalsSignalSendPost(signal)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1SignalsSignalSendPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1SignalsSignalSendPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signal** | **kotlin.String**| Signal ID. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="1UsersMeGet"></a>
# **1UsersMeGet**
> User 1UsersMeGet()



Fetch the authenticated user&#x27;s information.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
try {
    val result : User = apiInstance.1UsersMeGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1UsersMeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1UsersMeGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="1UsersMePost"></a>
# **1UsersMePost**
> User 1UsersMePost(nickname)



Update authenticated user&#x27;s information.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val nickname : kotlin.String = nickname_example // kotlin.String | 
try {
    val result : User = apiInstance.1UsersMePost(nickname)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#1UsersMePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#1UsersMePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nickname** | **kotlin.String**|  |

### Return type

[**User**](User.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

