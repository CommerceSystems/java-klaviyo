/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java;

import com.commercesystems.klaviyo_java.models.components.DataPrivacyCreateDeletionJobQuery;
import com.commercesystems.klaviyo_java.models.errors.APIException;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RequestProfileDeletionRequest;
import com.commercesystems.klaviyo_java.models.operations.RequestProfileDeletionRequestBuilder;
import com.commercesystems.klaviyo_java.models.operations.RequestProfileDeletionResponse;
import com.commercesystems.klaviyo_java.models.operations.SDKMethodInterfaces.*;
import com.commercesystems.klaviyo_java.utils.HTTPClient;
import com.commercesystems.klaviyo_java.utils.HTTPRequest;
import com.commercesystems.klaviyo_java.utils.Hook.AfterErrorContextImpl;
import com.commercesystems.klaviyo_java.utils.Hook.AfterSuccessContextImpl;
import com.commercesystems.klaviyo_java.utils.Hook.BeforeRequestContextImpl;
import com.commercesystems.klaviyo_java.utils.SerializedBody;
import com.commercesystems.klaviyo_java.utils.Utils.JsonShape;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

/**
 * data privacy
 */
public class DataPrivacy implements
            MethodCallRequestProfileDeletion {

    private final SDKConfiguration sdkConfiguration;

    DataPrivacy(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Request Profile Deletion
     * Request a deletion for the profiles corresponding to one of the following identifiers: `email`, `phone_number`, or `id`. If multiple identifiers are provided, we will return an error.
     * 
     * All profiles that match the provided identifier will be deleted.
     * 
     * The deletion occurs asynchronously; however, once it has completed, the deleted profile will appear on the [Deleted Profiles page](https://www.klaviyo.com/account/deleted).
     * 
     * For more information on the deletion process, please refer to our [Help Center docs on how to handle GDPR and CCPA deletion requests](https://help.klaviyo.com/hc/en-us/articles/360004217631-How-to-Handle-GDPR-Requests#record-gdpr-and-ccpa%20%20-deletion-requests2).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: `3/s`&lt;br&gt;Steady: `60/m`
     * 
     * **Scopes:**
     * `data-privacy:write`
     * @return The call builder
     */
    public RequestProfileDeletionRequestBuilder requestProfileDeletion() {
        return new RequestProfileDeletionRequestBuilder(this);
    }

    /**
     * Request Profile Deletion
     * Request a deletion for the profiles corresponding to one of the following identifiers: `email`, `phone_number`, or `id`. If multiple identifiers are provided, we will return an error.
     * 
     * All profiles that match the provided identifier will be deleted.
     * 
     * The deletion occurs asynchronously; however, once it has completed, the deleted profile will appear on the [Deleted Profiles page](https://www.klaviyo.com/account/deleted).
     * 
     * For more information on the deletion process, please refer to our [Help Center docs on how to handle GDPR and CCPA deletion requests](https://help.klaviyo.com/hc/en-us/articles/360004217631-How-to-Handle-GDPR-Requests#record-gdpr-and-ccpa%20%20-deletion-requests2).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: `3/s`&lt;br&gt;Steady: `60/m`
     * 
     * **Scopes:**
     * `data-privacy:write`
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix])
     * @param dataPrivacyCreateDeletionJobQuery
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RequestProfileDeletionResponse requestProfileDeletion(
            String revision,
            DataPrivacyCreateDeletionJobQuery dataPrivacyCreateDeletionJobQuery) throws Exception {
        RequestProfileDeletionRequest request =
            RequestProfileDeletionRequest
                .builder()
                .revision(revision)
                .dataPrivacyCreateDeletionJobQuery(dataPrivacyCreateDeletionJobQuery)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/api/data-privacy-deletion-jobs");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "dataPrivacyCreateDeletionJobQuery",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/vnd.api+json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "request_profile_deletion", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "request_profile_deletion",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "request_profile_deletion",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "request_profile_deletion",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        RequestProfileDeletionResponse.Builder _resBuilder = 
            RequestProfileDeletionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        RequestProfileDeletionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "202")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            if (Utils.contentTypeMatches(_contentType, "application/vnd.api+json")) {
                ClientError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ClientError>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            if (Utils.contentTypeMatches(_contentType, "application/vnd.api+json")) {
                ServerError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ServerError>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
