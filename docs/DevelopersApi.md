# DevelopersApi

All URIs are relative to *https://virtserver.swaggerhub.com/iDT-Labs/Noory/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomer**](DevelopersApi.md#addCustomer) | **POST** /customers | adds a customer
[**deleteCustomer**](DevelopersApi.md#deleteCustomer) | **DELETE** /customers/{id} | Delete a single customer record.
[**getByExternalID**](DevelopersApi.md#getByExternalID) | **GET** /customers/byExternalId/{externalId} | GETs a single customer its external ID
[**getCustomer**](DevelopersApi.md#getCustomer) | **GET** /customers/{id} | Gets a single customer
[**listCustomers**](DevelopersApi.md#listCustomers) | **GET** /customers | Gets a list of customers
[**markCustomerSourceDefault**](DevelopersApi.md#markCustomerSourceDefault) | **POST** /customers/{id}/sources/{sid}/default | Marks a customer payment source as default
[**updateCustomer**](DevelopersApi.md#updateCustomer) | **PUT** /customers/{id} | Updates a customer
[**updateCustomerSources**](DevelopersApi.md#updateCustomerSources) | **POST** /customers/{id}/sources | Adds a payment source to customer


<a name="addCustomer"></a>
# **addCustomer**
> Customer addCustomer(customerCreateDto)

adds a customer

Adds a customer

### Example
```java
// Import classes:
//import io.noory.client.invoker.ApiClient;
//import io.noory.client.invoker.ApiException;
//import io.noory.client.invoker.Configuration;
//import io.noory.client.invoker.auth.*;
//import io.noory.client.api.DevelopersApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCreateDto** | [**CustomerCreateDto**](CustomerCreateDto.md)| Customer record to add | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomer"></a>
# **deleteCustomer**
> Customer deleteCustomer(id)

Delete a single customer record.

Delete a single customer record. Deletion does not remove the record from the database but soft deletes it by setting the deleted attribute to true. You can still access the customer record but it won&#39;t show up in listings 

### Example
```java
// Import classes:
//import io.noory.client.invoker.ApiClient;
//import io.noory.client.invoker.ApiException;
//import io.noory.client.invoker.Configuration;
//import io.noory.client.invoker.auth.*;
//import io.noory.client.api.DevelopersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DevelopersApi apiInstance = new DevelopersApi();
String id = "id_example"; // String | Unique ID of customer
try {
    Customer result = apiInstance.deleteCustomer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#deleteCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID of customer |

### Return type

[**Customer**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getByExternalID"></a>
# **getByExternalID**
> Customer getByExternalID(externalId)

GETs a single customer its external ID

GETs a single customer its external ID

### Example
```java
// Import classes:
//import io.noory.client.invoker.ApiClient;
//import io.noory.client.invoker.ApiException;
//import io.noory.client.invoker.Configuration;
//import io.noory.client.invoker.auth.*;
//import io.noory.client.api.DevelopersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DevelopersApi apiInstance = new DevelopersApi();
String externalId = "externalId_example"; // String | Unique externalId of customer
try {
    Customer result = apiInstance.getByExternalID(externalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#getByExternalID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| Unique externalId of customer |

### Return type

[**Customer**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> Customer getCustomer(id)

Gets a single customer

Gets a single customer

### Example
```java
// Import classes:
//import io.noory.client.invoker.ApiClient;
//import io.noory.client.invoker.ApiException;
//import io.noory.client.invoker.Configuration;
//import io.noory.client.invoker.auth.*;
//import io.noory.client.api.DevelopersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DevelopersApi apiInstance = new DevelopersApi();
String id = "id_example"; // String | Unique ID of customer
try {
    Customer result = apiInstance.getCustomer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID of customer |

### Return type

[**Customer**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCustomers"></a>
# **listCustomers**
> List&lt;Customer&gt; listCustomers(search, page, size)

Gets a list of customers

Gets a list of customers; supports filtering, size, page by 

### Example
```java
// Import classes:
//import io.noory.client.invoker.ApiClient;
//import io.noory.client.invoker.ApiException;
//import io.noory.client.invoker.Configuration;
//import io.noory.client.invoker.auth.*;
//import io.noory.client.api.DevelopersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DevelopersApi apiInstance = new DevelopersApi();
String search = "search_example"; // String | pass an optional RSQL search string for looking up inventory
Integer page = 56; // Integer | page for pagination
Integer size = 56; // Integer | maximum number of records to return
try {
    List<Customer> result = apiInstance.listCustomers(search, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#listCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**| pass an optional RSQL search string for looking up inventory | [optional]
 **page** | **Integer**| page for pagination | [optional]
 **size** | **Integer**| maximum number of records to return | [optional]

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="markCustomerSourceDefault"></a>
# **markCustomerSourceDefault**
> Customer markCustomerSourceDefault(id, sid)

Marks a customer payment source as default

Marks a customer payment source as default 

### Example
```java
// Import classes:
//import io.noory.client.invoker.ApiClient;
//import io.noory.client.invoker.ApiException;
//import io.noory.client.invoker.Configuration;
//import io.noory.client.invoker.auth.*;
//import io.noory.client.api.DevelopersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DevelopersApi apiInstance = new DevelopersApi();
String id = "id_example"; // String | Unique ID of customer
String sid = "sid_example"; // String | ID of source we wish to make default
try {
    Customer result = apiInstance.markCustomerSourceDefault(id, sid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#markCustomerSourceDefault");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID of customer |
 **sid** | **String**| ID of source we wish to make default |

### Return type

[**Customer**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
> Customer updateCustomer(id, customerUpdateDto)

Updates a customer

Update a customer&#39;s record 

### Example
```java
// Import classes:
//import io.noory.client.invoker.ApiClient;
//import io.noory.client.invoker.ApiException;
//import io.noory.client.invoker.Configuration;
//import io.noory.client.invoker.auth.*;
//import io.noory.client.api.DevelopersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DevelopersApi apiInstance = new DevelopersApi();
String id = "id_example"; // String | Unique ID of customer
CustomerUpdateDto customerUpdateDto = new CustomerUpdateDto(); // CustomerUpdateDto | Customer record to update
try {
    Customer result = apiInstance.updateCustomer(id, customerUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID of customer |
 **customerUpdateDto** | [**CustomerUpdateDto**](CustomerUpdateDto.md)| Customer record to update | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomerSources"></a>
# **updateCustomerSources**
> Customer updateCustomerSources(id, sourceCreateDto)

Adds a payment source to customer

Adds a payment source to customer 

### Example
```java
// Import classes:
//import io.noory.client.invoker.ApiClient;
//import io.noory.client.invoker.ApiException;
//import io.noory.client.invoker.Configuration;
//import io.noory.client.invoker.auth.*;
//import io.noory.client.api.DevelopersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DevelopersApi apiInstance = new DevelopersApi();
String id = "id_example"; // String | Unique ID of customer
SourceCreateDto sourceCreateDto = new SourceCreateDto(); // SourceCreateDto | Soruce record to create
try {
    Customer result = apiInstance.updateCustomerSources(id, sourceCreateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#updateCustomerSources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID of customer |
 **sourceCreateDto** | [**SourceCreateDto**](SourceCreateDto.md)| Soruce record to create | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

