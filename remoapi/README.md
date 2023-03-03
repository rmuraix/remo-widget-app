# io.swagger.client - Kotlin client library for Nature API

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.nature.global/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**1ApplianceOrdersPost**](docs/DefaultApi.md#1applianceorderspost) | **POST** /1/appliance_orders | 
*DefaultApi* | [**1AppliancesApplianceAirconSettingsPost**](docs/DefaultApi.md#1appliancesapplianceairconsettingspost) | **POST** /1/appliances/{appliance}/aircon_settings | 
*DefaultApi* | [**1AppliancesApplianceDeletePost**](docs/DefaultApi.md#1appliancesappliancedeletepost) | **POST** /1/appliances/{appliance}/delete | 
*DefaultApi* | [**1AppliancesApplianceLightPost**](docs/DefaultApi.md#1appliancesappliancelightpost) | **POST** /1/appliances/{appliance}/light | 
*DefaultApi* | [**1AppliancesAppliancePost**](docs/DefaultApi.md#1appliancesappliancepost) | **POST** /1/appliances/{appliance} | 
*DefaultApi* | [**1AppliancesApplianceSignalOrdersPost**](docs/DefaultApi.md#1appliancesappliancesignalorderspost) | **POST** /1/appliances/{appliance}/signal_orders | 
*DefaultApi* | [**1AppliancesApplianceSignalsGet**](docs/DefaultApi.md#1appliancesappliancesignalsget) | **GET** /1/appliances/{appliance}/signals | 
*DefaultApi* | [**1AppliancesApplianceSignalsPost**](docs/DefaultApi.md#1appliancesappliancesignalspost) | **POST** /1/appliances/{appliance}/signals | 
*DefaultApi* | [**1AppliancesApplianceTvPost**](docs/DefaultApi.md#1appliancesappliancetvpost) | **POST** /1/appliances/{appliance}/tv | 
*DefaultApi* | [**1AppliancesGet**](docs/DefaultApi.md#1appliancesget) | **GET** /1/appliances | 
*DefaultApi* | [**1AppliancesPost**](docs/DefaultApi.md#1appliancespost) | **POST** /1/appliances | 
*DefaultApi* | [**1DetectappliancePost**](docs/DefaultApi.md#1detectappliancepost) | **POST** /1/detectappliance | 
*DefaultApi* | [**1DevicesDeviceDeletePost**](docs/DefaultApi.md#1devicesdevicedeletepost) | **POST** /1/devices/{device}/delete | 
*DefaultApi* | [**1DevicesDeviceHumidityOffsetPost**](docs/DefaultApi.md#1devicesdevicehumidityoffsetpost) | **POST** /1/devices/{device}/humidity_offset | 
*DefaultApi* | [**1DevicesDevicePost**](docs/DefaultApi.md#1devicesdevicepost) | **POST** /1/devices/{device} | 
*DefaultApi* | [**1DevicesDeviceTemperatureOffsetPost**](docs/DefaultApi.md#1devicesdevicetemperatureoffsetpost) | **POST** /1/devices/{device}/temperature_offset | 
*DefaultApi* | [**1DevicesGet**](docs/DefaultApi.md#1devicesget) | **GET** /1/devices | 
*DefaultApi* | [**1SignalsSignalDeletePost**](docs/DefaultApi.md#1signalssignaldeletepost) | **POST** /1/signals/{signal}/delete | 
*DefaultApi* | [**1SignalsSignalPost**](docs/DefaultApi.md#1signalssignalpost) | **POST** /1/signals/{signal} | 
*DefaultApi* | [**1SignalsSignalSendPost**](docs/DefaultApi.md#1signalssignalsendpost) | **POST** /1/signals/{signal}/send | 
*DefaultApi* | [**1UsersMeGet**](docs/DefaultApi.md#1usersmeget) | **GET** /1/users/me | 
*DefaultApi* | [**1UsersMePost**](docs/DefaultApi.md#1usersmepost) | **POST** /1/users/me | 

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.ACButton](docs/ACButton.md)
 - [io.swagger.client.models.AirCon](docs/AirCon.md)
 - [io.swagger.client.models.AirConParams](docs/AirConParams.md)
 - [io.swagger.client.models.AirConRange](docs/AirConRange.md)
 - [io.swagger.client.models.AirConRangeMode](docs/AirConRangeMode.md)
 - [io.swagger.client.models.AirConRangeModes](docs/AirConRangeModes.md)
 - [io.swagger.client.models.AirDirection](docs/AirDirection.md)
 - [io.swagger.client.models.AirVolume](docs/AirVolume.md)
 - [io.swagger.client.models.Appliance](docs/Appliance.md)
 - [io.swagger.client.models.ApplianceAirconSettingsBody](docs/ApplianceAirconSettingsBody.md)
 - [io.swagger.client.models.ApplianceLightBody](docs/ApplianceLightBody.md)
 - [io.swagger.client.models.ApplianceModel](docs/ApplianceModel.md)
 - [io.swagger.client.models.ApplianceModelAndParam](docs/ApplianceModelAndParam.md)
 - [io.swagger.client.models.ApplianceSignalOrdersBody](docs/ApplianceSignalOrdersBody.md)
 - [io.swagger.client.models.ApplianceSignalsBody](docs/ApplianceSignalsBody.md)
 - [io.swagger.client.models.ApplianceTvBody](docs/ApplianceTvBody.md)
 - [io.swagger.client.models.ApplianceType](docs/ApplianceType.md)
 - [io.swagger.client.models.AppliancesApplianceBody](docs/AppliancesApplianceBody.md)
 - [io.swagger.client.models.Button](docs/Button.md)
 - [io.swagger.client.models.Device](docs/Device.md)
 - [io.swagger.client.models.DeviceCore](docs/DeviceCore.md)
 - [io.swagger.client.models.DeviceHumidityOffsetBody](docs/DeviceHumidityOffsetBody.md)
 - [io.swagger.client.models.DeviceNewestEvents](docs/DeviceNewestEvents.md)
 - [io.swagger.client.models.DeviceTemperatureOffsetBody](docs/DeviceTemperatureOffsetBody.md)
 - [io.swagger.client.models.Devices](docs/Devices.md)
 - [io.swagger.client.models.DevicesDeviceBody](docs/DevicesDeviceBody.md)
 - [io.swagger.client.models.EchonetLiteProperty](docs/EchonetLiteProperty.md)
 - [io.swagger.client.models.FormDataApplianceImage](docs/FormDataApplianceImage.md)
 - [io.swagger.client.models.FormDataIrsignal](docs/FormDataIrsignal.md)
 - [io.swagger.client.models.FormDataSignalImage](docs/FormDataSignalImage.md)
 - [io.swagger.client.models.Id](docs/Id.md)
 - [io.swagger.client.models.Image](docs/Image.md)
 - [io.swagger.client.models.LIGHT](docs/LIGHT.md)
 - [io.swagger.client.models.LIGHTState](docs/LIGHTState.md)
 - [io.swagger.client.models.OperationMode](docs/OperationMode.md)
 - [io.swagger.client.models.SensorValue](docs/SensorValue.md)
 - [io.swagger.client.models.Signal](docs/Signal.md)
 - [io.swagger.client.models.SignalsSignalBody](docs/SignalsSignalBody.md)
 - [io.swagger.client.models.SmartMeter](docs/SmartMeter.md)
 - [io.swagger.client.models.TV](docs/TV.md)
 - [io.swagger.client.models.TVState](docs/TVState.md)
 - [io.swagger.client.models.Temperature](docs/Temperature.md)
 - [io.swagger.client.models.User](docs/User.md)
 - [io.swagger.client.models.UsersMeBody](docs/UsersMeBody.md)
 - [io.swagger.client.models._1ApplianceOrdersBody](docs/_1ApplianceOrdersBody.md)
 - [io.swagger.client.models._1AppliancesBody](docs/_1AppliancesBody.md)
 - [io.swagger.client.models._1DetectapplianceBody](docs/_1DetectapplianceBody.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="oauth2"></a>
### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://api.nature.global/oauth2/auth
- **Scopes**: 
  - basic.read: Read only access to user&#x27;s profile (excluding email), Remos, appliances, signals.
  - basic: Read + write access to user&#x27;s profile (excluding email), Remos, appliances, signals.
  - sendir: Send infrared signals through Remo.
  - detectappliance: Detect air conditioner model from infrared signals.

