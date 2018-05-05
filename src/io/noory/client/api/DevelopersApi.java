

package io.noory.client.api;

import io.noory.client.invoker.ApiCallback;
import io.noory.client.invoker.ApiClient;
import io.noory.client.invoker.ApiException;
import io.noory.client.invoker.ApiResponse;
import io.noory.client.invoker.Configuration;
import io.noory.client.invoker.Pair;
import io.noory.client.invoker.ProgressRequestBody;
import io.noory.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.noory.client.model.Customer;
import io.noory.client.model.CustomerCreateDto;
import io.noory.client.model.CustomerUpdateDto;
import io.noory.client.model.InlineResponse400;
import io.noory.client.model.SourceCreateDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevelopersApi {
    private ApiClient apiClient;

    public DevelopersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DevelopersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addCustomer
     * @param customerCreateDto Customer record to add (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addCustomerCall(CustomerCreateDto customerCreateDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = customerCreateDto;

        // create path and map variables
        String localVarPath = "/customers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addCustomerValidateBeforeCall(CustomerCreateDto customerCreateDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = addCustomerCall(customerCreateDto, progressListener, progressRequestListener);
        return call;

    }

    /**
     * adds a customer
     * Adds a customer
     * @param customerCreateDto Customer record to add (optional)
     * @return Customer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Customer addCustomer(CustomerCreateDto customerCreateDto) throws ApiException {
        ApiResponse<Customer> resp = addCustomerWithHttpInfo(customerCreateDto);
        return resp.getData();
    }

    /**
     * adds a customer
     * Adds a customer
     * @param customerCreateDto Customer record to add (optional)
     * @return ApiResponse&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Customer> addCustomerWithHttpInfo(CustomerCreateDto customerCreateDto) throws ApiException {
        com.squareup.okhttp.Call call = addCustomerValidateBeforeCall(customerCreateDto, null, null);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * adds a customer (asynchronously)
     * Adds a customer
     * @param customerCreateDto Customer record to add (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addCustomerAsync(CustomerCreateDto customerCreateDto, final ApiCallback<Customer> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addCustomerValidateBeforeCall(customerCreateDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteCustomer
     * @param id Unique ID of customer (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCustomerCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/customers/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteCustomerValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteCustomer(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCustomerCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a single customer record.
     * Delete a single customer record. Deletion does not remove the record from the database but soft deletes it by setting the deleted attribute to true. You can still access the customer record but it won&#39;t show up in listings 
     * @param id Unique ID of customer (required)
     * @return Customer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Customer deleteCustomer(String id) throws ApiException {
        ApiResponse<Customer> resp = deleteCustomerWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Delete a single customer record.
     * Delete a single customer record. Deletion does not remove the record from the database but soft deletes it by setting the deleted attribute to true. You can still access the customer record but it won&#39;t show up in listings 
     * @param id Unique ID of customer (required)
     * @return ApiResponse&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Customer> deleteCustomerWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteCustomerValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a single customer record. (asynchronously)
     * Delete a single customer record. Deletion does not remove the record from the database but soft deletes it by setting the deleted attribute to true. You can still access the customer record but it won&#39;t show up in listings 
     * @param id Unique ID of customer (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCustomerAsync(String id, final ApiCallback<Customer> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteCustomerValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getByExternalID
     * @param externalId Unique externalId of customer (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getByExternalIDCall(String externalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/customers/byExternalId/{externalId}"
            .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getByExternalIDValidateBeforeCall(String externalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new ApiException("Missing the required parameter 'externalId' when calling getByExternalID(Async)");
        }
        

        com.squareup.okhttp.Call call = getByExternalIDCall(externalId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * GETs a single customer its external ID
     * GETs a single customer its external ID
     * @param externalId Unique externalId of customer (required)
     * @return Customer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Customer getByExternalID(String externalId) throws ApiException {
        ApiResponse<Customer> resp = getByExternalIDWithHttpInfo(externalId);
        return resp.getData();
    }

    /**
     * GETs a single customer its external ID
     * GETs a single customer its external ID
     * @param externalId Unique externalId of customer (required)
     * @return ApiResponse&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Customer> getByExternalIDWithHttpInfo(String externalId) throws ApiException {
        com.squareup.okhttp.Call call = getByExternalIDValidateBeforeCall(externalId, null, null);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GETs a single customer its external ID (asynchronously)
     * GETs a single customer its external ID
     * @param externalId Unique externalId of customer (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getByExternalIDAsync(String externalId, final ApiCallback<Customer> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getByExternalIDValidateBeforeCall(externalId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCustomer
     * @param id Unique ID of customer (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCustomerCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/customers/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCustomerValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getCustomer(Async)");
        }
        

        com.squareup.okhttp.Call call = getCustomerCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a single customer
     * Gets a single customer
     * @param id Unique ID of customer (required)
     * @return Customer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Customer getCustomer(String id) throws ApiException {
        ApiResponse<Customer> resp = getCustomerWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a single customer
     * Gets a single customer
     * @param id Unique ID of customer (required)
     * @return ApiResponse&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Customer> getCustomerWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getCustomerValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a single customer (asynchronously)
     * Gets a single customer
     * @param id Unique ID of customer (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCustomerAsync(String id, final ApiCallback<Customer> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCustomerValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listCustomers
     * @param search pass an optional RSQL search string for looking up inventory (optional)
     * @param page page for pagination (optional)
     * @param size maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCustomersCall(String search, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/customers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search", search));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listCustomersValidateBeforeCall(String search, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listCustomersCall(search, page, size, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of customers
     * Gets a list of customers; supports filtering, size, page by 
     * @param search pass an optional RSQL search string for looking up inventory (optional)
     * @param page page for pagination (optional)
     * @param size maximum number of records to return (optional)
     * @return List&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Customer> listCustomers(String search, Integer page, Integer size) throws ApiException {
        ApiResponse<List<Customer>> resp = listCustomersWithHttpInfo(search, page, size);
        return resp.getData();
    }

    /**
     * Gets a list of customers
     * Gets a list of customers; supports filtering, size, page by 
     * @param search pass an optional RSQL search string for looking up inventory (optional)
     * @param page page for pagination (optional)
     * @param size maximum number of records to return (optional)
     * @return ApiResponse&lt;List&lt;Customer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Customer>> listCustomersWithHttpInfo(String search, Integer page, Integer size) throws ApiException {
        com.squareup.okhttp.Call call = listCustomersValidateBeforeCall(search, page, size, null, null);
        Type localVarReturnType = new TypeToken<List<Customer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of customers (asynchronously)
     * Gets a list of customers; supports filtering, size, page by 
     * @param search pass an optional RSQL search string for looking up inventory (optional)
     * @param page page for pagination (optional)
     * @param size maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCustomersAsync(String search, Integer page, Integer size, final ApiCallback<List<Customer>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listCustomersValidateBeforeCall(search, page, size, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Customer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for markCustomerSourceDefault
     * @param id Unique ID of customer (required)
     * @param sid ID of source we wish to make default (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call markCustomerSourceDefaultCall(String id, String sid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/customers/{id}/sources/{sid}/default"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "sid" + "\\}", apiClient.escapeString(sid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call markCustomerSourceDefaultValidateBeforeCall(String id, String sid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling markCustomerSourceDefault(Async)");
        }
        
        // verify the required parameter 'sid' is set
        if (sid == null) {
            throw new ApiException("Missing the required parameter 'sid' when calling markCustomerSourceDefault(Async)");
        }
        

        com.squareup.okhttp.Call call = markCustomerSourceDefaultCall(id, sid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Marks a customer payment source as default
     * Marks a customer payment source as default 
     * @param id Unique ID of customer (required)
     * @param sid ID of source we wish to make default (required)
     * @return Customer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Customer markCustomerSourceDefault(String id, String sid) throws ApiException {
        ApiResponse<Customer> resp = markCustomerSourceDefaultWithHttpInfo(id, sid);
        return resp.getData();
    }

    /**
     * Marks a customer payment source as default
     * Marks a customer payment source as default 
     * @param id Unique ID of customer (required)
     * @param sid ID of source we wish to make default (required)
     * @return ApiResponse&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Customer> markCustomerSourceDefaultWithHttpInfo(String id, String sid) throws ApiException {
        com.squareup.okhttp.Call call = markCustomerSourceDefaultValidateBeforeCall(id, sid, null, null);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Marks a customer payment source as default (asynchronously)
     * Marks a customer payment source as default 
     * @param id Unique ID of customer (required)
     * @param sid ID of source we wish to make default (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call markCustomerSourceDefaultAsync(String id, String sid, final ApiCallback<Customer> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = markCustomerSourceDefaultValidateBeforeCall(id, sid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCustomer
     * @param id Unique ID of customer (required)
     * @param customerUpdateDto Customer record to update (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCustomerCall(String id, CustomerUpdateDto customerUpdateDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = customerUpdateDto;

        // create path and map variables
        String localVarPath = "/customers/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCustomerValidateBeforeCall(String id, CustomerUpdateDto customerUpdateDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateCustomer(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCustomerCall(id, customerUpdateDto, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a customer
     * Update a customer&#39;s record 
     * @param id Unique ID of customer (required)
     * @param customerUpdateDto Customer record to update (optional)
     * @return Customer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Customer updateCustomer(String id, CustomerUpdateDto customerUpdateDto) throws ApiException {
        ApiResponse<Customer> resp = updateCustomerWithHttpInfo(id, customerUpdateDto);
        return resp.getData();
    }

    /**
     * Updates a customer
     * Update a customer&#39;s record 
     * @param id Unique ID of customer (required)
     * @param customerUpdateDto Customer record to update (optional)
     * @return ApiResponse&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Customer> updateCustomerWithHttpInfo(String id, CustomerUpdateDto customerUpdateDto) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomerValidateBeforeCall(id, customerUpdateDto, null, null);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a customer (asynchronously)
     * Update a customer&#39;s record 
     * @param id Unique ID of customer (required)
     * @param customerUpdateDto Customer record to update (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomerAsync(String id, CustomerUpdateDto customerUpdateDto, final ApiCallback<Customer> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCustomerValidateBeforeCall(id, customerUpdateDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCustomerSources
     * @param id Unique ID of customer (required)
     * @param sourceCreateDto Soruce record to create (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCustomerSourcesCall(String id, SourceCreateDto sourceCreateDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = sourceCreateDto;

        // create path and map variables
        String localVarPath = "/customers/{id}/sources"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCustomerSourcesValidateBeforeCall(String id, SourceCreateDto sourceCreateDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateCustomerSources(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCustomerSourcesCall(id, sourceCreateDto, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds a payment source to customer
     * Adds a payment source to customer 
     * @param id Unique ID of customer (required)
     * @param sourceCreateDto Soruce record to create (optional)
     * @return Customer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Customer updateCustomerSources(String id, SourceCreateDto sourceCreateDto) throws ApiException {
        ApiResponse<Customer> resp = updateCustomerSourcesWithHttpInfo(id, sourceCreateDto);
        return resp.getData();
    }

    /**
     * Adds a payment source to customer
     * Adds a payment source to customer 
     * @param id Unique ID of customer (required)
     * @param sourceCreateDto Soruce record to create (optional)
     * @return ApiResponse&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Customer> updateCustomerSourcesWithHttpInfo(String id, SourceCreateDto sourceCreateDto) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomerSourcesValidateBeforeCall(id, sourceCreateDto, null, null);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a payment source to customer (asynchronously)
     * Adds a payment source to customer 
     * @param id Unique ID of customer (required)
     * @param sourceCreateDto Soruce record to create (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomerSourcesAsync(String id, SourceCreateDto sourceCreateDto, final ApiCallback<Customer> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCustomerSourcesValidateBeforeCall(id, sourceCreateDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
