/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ncp.airlock.client;

import com.ncp.airlock.client.invoker.ApiCallback;
import com.ncp.airlock.client.invoker.ApiClient;
import com.ncp.airlock.client.invoker.ApiException;
import com.ncp.airlock.client.invoker.ApiResponse;
import com.ncp.airlock.client.invoker.Configuration;
import com.ncp.airlock.client.invoker.Pair;
import com.ncp.airlock.client.invoker.ProgressRequestBody;
import com.ncp.airlock.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamsApi {
    private ApiClient apiClient;

    public StreamsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StreamsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addEvents
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param ERROR_UNKNOWN  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addEventsCall(String productInstanceId, List<Object> ERROR_UNKNOWN, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = ERROR_UNKNOWN;

        // create path and map variables
        String localVarPath = "/products/{productInstanceId}/streams/addEvents"
            .replaceAll("\\{" + "productInstanceId" + "\\}", apiClient.escapeString(productInstanceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addEventsValidateBeforeCall(String productInstanceId, List<Object> ERROR_UNKNOWN, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'productInstanceId' is set
        if (productInstanceId == null) {
            throw new ApiException("Missing the required parameter 'productInstanceId' when calling addEvents(Async)");
        }
        

        com.squareup.okhttp.Call call = addEventsCall(productInstanceId, ERROR_UNKNOWN, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add events to the streams processing stack
     * 
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param ERROR_UNKNOWN  (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String addEvents(String productInstanceId, List<Object> ERROR_UNKNOWN) throws ApiException {
        ApiResponse<String> resp = addEventsWithHttpInfo(productInstanceId, ERROR_UNKNOWN);
        return resp.getData();
    }

    /**
     * Add events to the streams processing stack
     * 
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param ERROR_UNKNOWN  (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> addEventsWithHttpInfo(String productInstanceId, List<Object> ERROR_UNKNOWN) throws ApiException {
        com.squareup.okhttp.Call call = addEventsValidateBeforeCall(productInstanceId, ERROR_UNKNOWN, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add events to the streams processing stack (asynchronously)
     * 
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param ERROR_UNKNOWN  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addEventsAsync(String productInstanceId, List<Object> ERROR_UNKNOWN, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addEventsValidateBeforeCall(productInstanceId, ERROR_UNKNOWN, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStreamsResults
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStreamsResultsCall(String productInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/products/{productInstanceId}/streams/results"
            .replaceAll("\\{" + "productInstanceId" + "\\}", apiClient.escapeString(productInstanceId.toString()));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getStreamsResultsValidateBeforeCall(String productInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'productInstanceId' is set
        if (productInstanceId == null) {
            throw new ApiException("Missing the required parameter 'productInstanceId' when calling getStreamsResults(Async)");
        }
        

        com.squareup.okhttp.Call call = getStreamsResultsCall(productInstanceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves the last streams calculation results
     * 
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @return Map&lt;String, Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, Object> getStreamsResults(String productInstanceId) throws ApiException {
        ApiResponse<Map<String, Object>> resp = getStreamsResultsWithHttpInfo(productInstanceId);
        return resp.getData();
    }

    /**
     * Retrieves the last streams calculation results
     * 
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @return ApiResponse&lt;Map&lt;String, Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, Object>> getStreamsResultsWithHttpInfo(String productInstanceId) throws ApiException {
        com.squareup.okhttp.Call call = getStreamsResultsValidateBeforeCall(productInstanceId, null, null);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves the last streams calculation results (asynchronously)
     * 
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStreamsResultsAsync(String productInstanceId, final ApiCallback<Map<String, Object>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStreamsResultsValidateBeforeCall(productInstanceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for runStreams
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param streamId  (optional)
     * @param ERROR_UNKNOWN  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call runStreamsCall(String productInstanceId, String streamId, List<Object> ERROR_UNKNOWN, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = ERROR_UNKNOWN;

        // create path and map variables
        String localVarPath = "/products/{productInstanceId}/streams/run"
            .replaceAll("\\{" + "productInstanceId" + "\\}", apiClient.escapeString(productInstanceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (streamId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("streamId", streamId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call runStreamsValidateBeforeCall(String productInstanceId, String streamId, List<Object> ERROR_UNKNOWN, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'productInstanceId' is set
        if (productInstanceId == null) {
            throw new ApiException("Missing the required parameter 'productInstanceId' when calling runStreams(Async)");
        }
        

        com.squareup.okhttp.Call call = runStreamsCall(productInstanceId, streamId, ERROR_UNKNOWN, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Calculates all streams according to the events sent
     * 
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param streamId  (optional)
     * @param ERROR_UNKNOWN  (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String runStreams(String productInstanceId, String streamId, List<Object> ERROR_UNKNOWN) throws ApiException {
        ApiResponse<String> resp = runStreamsWithHttpInfo(productInstanceId, streamId, ERROR_UNKNOWN);
        return resp.getData();
    }

    /**
     * Calculates all streams according to the events sent
     * 
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param streamId  (optional)
     * @param ERROR_UNKNOWN  (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> runStreamsWithHttpInfo(String productInstanceId, String streamId, List<Object> ERROR_UNKNOWN) throws ApiException {
        com.squareup.okhttp.Call call = runStreamsValidateBeforeCall(productInstanceId, streamId, ERROR_UNKNOWN, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calculates all streams according to the events sent (asynchronously)
     * 
     * @param productInstanceId The product id as returned by the init function or taken directly from the defaults file. (required)
     * @param streamId  (optional)
     * @param ERROR_UNKNOWN  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call runStreamsAsync(String productInstanceId, String streamId, List<Object> ERROR_UNKNOWN, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = runStreamsValidateBeforeCall(productInstanceId, streamId, ERROR_UNKNOWN, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
