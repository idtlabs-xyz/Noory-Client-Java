# noory-api-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.noory</groupId>
    <artifactId>noory-api-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.noory:noory-api-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/noory-api-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.noory.client.invoker.*;
import io.noory.client.invoker.auth.*;
import io.noory.client.model.*;
import io.noory.client.api.DevelopersApi;

import java.io.File;
import java.util.*;

public class DevelopersApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        DevelopersApi apiInstance = new DevelopersApi();
        CustomerCreateDto customerCreateDto = new CustomerCreateDto(); // CustomerCreateDto | Customer record to add
        try {
            Customer result = apiInstance.addCustomer(customerCreateDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DevelopersApi#addCustomer");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/iDT-Labs/Noory/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DevelopersApi* | [**addCustomer**](docs/DevelopersApi.md#addCustomer) | **POST** /customers | adds a customer
*DevelopersApi* | [**deleteCustomer**](docs/DevelopersApi.md#deleteCustomer) | **DELETE** /customers/{id} | Delete a single customer record.
*DevelopersApi* | [**getByExternalID**](docs/DevelopersApi.md#getByExternalID) | **GET** /customers/byExternalId/{externalId} | GETs a single customer its external ID
*DevelopersApi* | [**getCustomer**](docs/DevelopersApi.md#getCustomer) | **GET** /customers/{id} | Gets a single customer
*DevelopersApi* | [**listCustomers**](docs/DevelopersApi.md#listCustomers) | **GET** /customers | Gets a list of customers
*DevelopersApi* | [**markCustomerSourceDefault**](docs/DevelopersApi.md#markCustomerSourceDefault) | **POST** /customers/{id}/sources/{sid}/default | Marks a customer payment source as default
*DevelopersApi* | [**updateCustomer**](docs/DevelopersApi.md#updateCustomer) | **PUT** /customers/{id} | Updates a customer
*DevelopersApi* | [**updateCustomerSources**](docs/DevelopersApi.md#updateCustomerSources) | **POST** /customers/{id}/sources | Adds a payment source to customer


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountVerification](docs/AccountVerification.md)
 - [Customer](docs/Customer.md)
 - [CustomerCreateDto](docs/CustomerCreateDto.md)
 - [CustomerUpdateDto](docs/CustomerUpdateDto.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [PayoutSchedule](docs/PayoutSchedule.md)
 - [Schedule](docs/Schedule.md)
 - [Source](docs/Source.md)
 - [SourceCreateDto](docs/SourceCreateDto.md)
 - [SourceUpdateDto](docs/SourceUpdateDto.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

develop@noory.io

