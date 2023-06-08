
# Getting Started with Swagger Petstore - OpenAPI 3.0

## Introduction

This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about
Swagger at [https://swagger.io](https://swagger.io). In the third iteration of the pet store, we've switched to the design first approach!
You can now help us improve the API whether it's by making changes to the definition itself or to the code.
That way, with time, we can improve the API in general, and expose some of the new features in OAS3.

_If you're looking for the Swagger 2.0/OAS 2.0 version of Petstore, then click [here](https://editor.swagger.io/?url=https://petstore.swagger.io/v2/swagger.yaml). Alternatively, you can load via the `Edit > Load Petstore OAS 2.0` menu option!_

Some useful links:

- [The Pet Store repository](https://github.com/swagger-api/swagger-petstore)
- [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)

Find out more about Swagger: [http://swagger.io](http://swagger.io)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>sdksio-swagger-petstore-3-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.sdks/sdksio-swagger-petstore-3-sdk/1.0.0

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project SwaggerPetstoreOpenAPI30Lib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/http-client-configuration.md) | Http Client Configuration instance. |
| `apiKey` | `String` |  |

The API client can be initialized as follows:

```java
SwaggerPetstoreOpenAPI30Client client = new SwaggerPetstoreOpenAPI30Client.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .customHeaderAuthenticationCredentials("api_key")
    .build();
```

## Authorization

This API uses `Custom Header Signature`.

## List of APIs

* [Pet](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/controllers/pet.md)
* [Store](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/controllers/store.md)
* [User](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/controllers/user.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/headers.md)
* [ApiException](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/swagger-petstore-3-java-sdk/tree/1.0.0/doc/http-client-configuration-builder.md)

