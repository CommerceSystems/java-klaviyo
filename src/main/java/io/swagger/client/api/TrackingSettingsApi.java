/*
 * Klaviyo API
 * The Klaviyo REST API. Please visit https://developers.klaviyo.com for more details.
 *
 * OpenAPI spec version: 2024-10-15
 * Contact: developers@klaviyo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.GetTrackingSettingResponse;
import io.swagger.client.model.GetTrackingSettingResponseCollection;
import io.swagger.client.model.InlineResponse4XX;
import io.swagger.client.model.PatchTrackingSettingResponse;
import io.swagger.client.model.TrackingSettingPartialUpdateQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackingSettingsApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public TrackingSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TrackingSettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for getTrackingSetting
     * @param id The id of the tracking setting (account ID). (required)
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param fieldsTrackingSetting For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTrackingSettingCall(String id, String revision, List<String> fieldsTrackingSetting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/tracking-settings/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fieldsTrackingSetting != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[tracking-setting]", fieldsTrackingSetting));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (revision != null)
        localVarHeaderParams.put("revision", apiClient.parameterToString(revision));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
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

        String[] localVarAuthNames = new String[] { "Klaviyo-API-Key" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTrackingSettingValidateBeforeCall(String id, String revision, List<String> fieldsTrackingSetting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTrackingSetting(Async)");
        }
        // verify the required parameter 'revision' is set
        if (revision == null) {
            throw new ApiException("Missing the required parameter 'revision' when calling getTrackingSetting(Async)");
        }
        
        com.squareup.okhttp.Call call = getTrackingSettingCall(id, revision, fieldsTrackingSetting, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Tracking Setting
     * Get the tracking setting with the given account ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;tracking-settings:read&#x60;
     * @param id The id of the tracking setting (account ID). (required)
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param fieldsTrackingSetting For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets (optional)
     * @return GetTrackingSettingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetTrackingSettingResponse getTrackingSetting(String id, String revision, List<String> fieldsTrackingSetting) throws ApiException {
        ApiResponse<GetTrackingSettingResponse> resp = getTrackingSettingWithHttpInfo(id, revision, fieldsTrackingSetting);
        return resp.getData();
    }

    /**
     * Get Tracking Setting
     * Get the tracking setting with the given account ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;tracking-settings:read&#x60;
     * @param id The id of the tracking setting (account ID). (required)
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param fieldsTrackingSetting For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets (optional)
     * @return ApiResponse&lt;GetTrackingSettingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetTrackingSettingResponse> getTrackingSettingWithHttpInfo(String id, String revision, List<String> fieldsTrackingSetting) throws ApiException {
        com.squareup.okhttp.Call call = getTrackingSettingValidateBeforeCall(id, revision, fieldsTrackingSetting, null, null);
        Type localVarReturnType = new TypeToken<GetTrackingSettingResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Tracking Setting (asynchronously)
     * Get the tracking setting with the given account ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;tracking-settings:read&#x60;
     * @param id The id of the tracking setting (account ID). (required)
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param fieldsTrackingSetting For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTrackingSettingAsync(String id, String revision, List<String> fieldsTrackingSetting, final ApiCallback<GetTrackingSettingResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTrackingSettingValidateBeforeCall(id, revision, fieldsTrackingSetting, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetTrackingSettingResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTrackingSettings
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param fieldsTrackingSetting For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets (optional)
     * @param pageCursor For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination (optional)
     * @param pageSize Default: 1. Min: 1. Max: 1. (optional, default to 1)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTrackingSettingsCall(String revision, List<String> fieldsTrackingSetting, String pageCursor, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/tracking-settings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fieldsTrackingSetting != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[tracking-setting]", fieldsTrackingSetting));
        if (pageCursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page[cursor]", pageCursor));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page[size]", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (revision != null)
        localVarHeaderParams.put("revision", apiClient.parameterToString(revision));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
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

        String[] localVarAuthNames = new String[] { "Klaviyo-API-Key" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTrackingSettingsValidateBeforeCall(String revision, List<String> fieldsTrackingSetting, String pageCursor, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'revision' is set
        if (revision == null) {
            throw new ApiException("Missing the required parameter 'revision' when calling getTrackingSettings(Async)");
        }
        
        com.squareup.okhttp.Call call = getTrackingSettingsCall(revision, fieldsTrackingSetting, pageCursor, pageSize, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Tracking Settings
     * Get all tracking settings in an account. Returns an array with a single tracking setting.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;tracking-settings:read&#x60;
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param fieldsTrackingSetting For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets (optional)
     * @param pageCursor For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination (optional)
     * @param pageSize Default: 1. Min: 1. Max: 1. (optional, default to 1)
     * @return GetTrackingSettingResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetTrackingSettingResponseCollection getTrackingSettings(String revision, List<String> fieldsTrackingSetting, String pageCursor, Integer pageSize) throws ApiException {
        ApiResponse<GetTrackingSettingResponseCollection> resp = getTrackingSettingsWithHttpInfo(revision, fieldsTrackingSetting, pageCursor, pageSize);
        return resp.getData();
    }

    /**
     * Get Tracking Settings
     * Get all tracking settings in an account. Returns an array with a single tracking setting.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;tracking-settings:read&#x60;
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param fieldsTrackingSetting For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets (optional)
     * @param pageCursor For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination (optional)
     * @param pageSize Default: 1. Min: 1. Max: 1. (optional, default to 1)
     * @return ApiResponse&lt;GetTrackingSettingResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetTrackingSettingResponseCollection> getTrackingSettingsWithHttpInfo(String revision, List<String> fieldsTrackingSetting, String pageCursor, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getTrackingSettingsValidateBeforeCall(revision, fieldsTrackingSetting, pageCursor, pageSize, null, null);
        Type localVarReturnType = new TypeToken<GetTrackingSettingResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Tracking Settings (asynchronously)
     * Get all tracking settings in an account. Returns an array with a single tracking setting.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;tracking-settings:read&#x60;
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param fieldsTrackingSetting For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets (optional)
     * @param pageCursor For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination (optional)
     * @param pageSize Default: 1. Min: 1. Max: 1. (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTrackingSettingsAsync(String revision, List<String> fieldsTrackingSetting, String pageCursor, Integer pageSize, final ApiCallback<GetTrackingSettingResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTrackingSettingsValidateBeforeCall(revision, fieldsTrackingSetting, pageCursor, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetTrackingSettingResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTrackingSetting
     * @param body DTO for updating tracking settings (required)
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param id The id of the tracking setting (account ID). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateTrackingSettingCall(TrackingSettingPartialUpdateQuery body, String revision, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/tracking-settings/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (revision != null)
        localVarHeaderParams.put("revision", apiClient.parameterToString(revision));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
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

        String[] localVarAuthNames = new String[] { "Klaviyo-API-Key" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTrackingSettingValidateBeforeCall(TrackingSettingPartialUpdateQuery body, String revision, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateTrackingSetting(Async)");
        }
        // verify the required parameter 'revision' is set
        if (revision == null) {
            throw new ApiException("Missing the required parameter 'revision' when calling updateTrackingSetting(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateTrackingSetting(Async)");
        }
        
        com.squareup.okhttp.Call call = updateTrackingSettingCall(body, revision, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Tracking Setting
     * Update the tracking setting with the given account ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;tracking-settings:write&#x60;
     * @param body DTO for updating tracking settings (required)
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param id The id of the tracking setting (account ID). (required)
     * @return PatchTrackingSettingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PatchTrackingSettingResponse updateTrackingSetting(TrackingSettingPartialUpdateQuery body, String revision, String id) throws ApiException {
        ApiResponse<PatchTrackingSettingResponse> resp = updateTrackingSettingWithHttpInfo(body, revision, id);
        return resp.getData();
    }

    /**
     * Update Tracking Setting
     * Update the tracking setting with the given account ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;tracking-settings:write&#x60;
     * @param body DTO for updating tracking settings (required)
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param id The id of the tracking setting (account ID). (required)
     * @return ApiResponse&lt;PatchTrackingSettingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PatchTrackingSettingResponse> updateTrackingSettingWithHttpInfo(TrackingSettingPartialUpdateQuery body, String revision, String id) throws ApiException {
        com.squareup.okhttp.Call call = updateTrackingSettingValidateBeforeCall(body, revision, id, null, null);
        Type localVarReturnType = new TypeToken<PatchTrackingSettingResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Tracking Setting (asynchronously)
     * Update the tracking setting with the given account ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;tracking-settings:write&#x60;
     * @param body DTO for updating tracking settings (required)
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (required)
     * @param id The id of the tracking setting (account ID). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTrackingSettingAsync(TrackingSettingPartialUpdateQuery body, String revision, String id, final ApiCallback<PatchTrackingSettingResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTrackingSettingValidateBeforeCall(body, revision, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PatchTrackingSettingResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
