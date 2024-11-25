/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java;

import com.commercesystems.klaviyo_java.models.components.GetAccountResponseCollection;
import com.commercesystems.klaviyo_java.models.errors.APIException;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsAccount;
import com.commercesystems.klaviyo_java.models.operations.GetAccountRequest;
import com.commercesystems.klaviyo_java.models.operations.GetAccountRequestBuilder;
import com.commercesystems.klaviyo_java.models.operations.GetAccountResponse;
import com.commercesystems.klaviyo_java.models.operations.GetAccountsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetAccountsRequestBuilder;
import com.commercesystems.klaviyo_java.models.operations.GetAccountsResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsAccount;
import com.commercesystems.klaviyo_java.models.operations.SDKMethodInterfaces.*;
import com.commercesystems.klaviyo_java.utils.HTTPClient;
import com.commercesystems.klaviyo_java.utils.HTTPRequest;
import com.commercesystems.klaviyo_java.utils.Hook.AfterErrorContextImpl;
import com.commercesystems.klaviyo_java.utils.Hook.AfterSuccessContextImpl;
import com.commercesystems.klaviyo_java.utils.Hook.BeforeRequestContextImpl;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

/**
 * accounts
 */
public class Accounts implements
            MethodCallGetAccounts,
            MethodCallGetAccount {

    private final SDKConfiguration sdkConfiguration;

    Accounts(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get Accounts
     * Retrieve the account(s) associated with a given private API key. This will return 1 account object within the array.
     * 
     * You can use this to retrieve account-specific data (contact information, timezone, currency, Public API key, etc.) or test if a Private API Key belongs to the correct account prior to performing subsequent actions with the API.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: `1/s`&lt;br&gt;Steady: `15/m`
     * 
     * **Scopes:**
     * `accounts:read`
     * @return The call builder
     */
    public GetAccountsRequestBuilder getAccounts() {
        return new GetAccountsRequestBuilder(this);
    }

    /**
     * Get Accounts
     * Retrieve the account(s) associated with a given private API key. This will return 1 account object within the array.
     * 
     * You can use this to retrieve account-specific data (contact information, timezone, currency, Public API key, etc.) or test if a Private API Key belongs to the correct account prior to performing subsequent actions with the API.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: `1/s`&lt;br&gt;Steady: `15/m`
     * 
     * **Scopes:**
     * `accounts:read`
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix])
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAccountsResponse getAccounts(
            String revision) throws Exception {
        return getAccounts(Optional.empty(), revision);
    }
    
    /**
     * Get Accounts
     * Retrieve the account(s) associated with a given private API key. This will return 1 account object within the array.
     * 
     * You can use this to retrieve account-specific data (contact information, timezone, currency, Public API key, etc.) or test if a Private API Key belongs to the correct account prior to performing subsequent actions with the API.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: `1/s`&lt;br&gt;Steady: `15/m`
     * 
     * **Scopes:**
     * `accounts:read`
     * @param fieldsAccount For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix])
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAccountsResponse getAccounts(
            Optional<? extends List<FieldsAccount>> fieldsAccount,
            String revision) throws Exception {
        GetAccountsRequest request =
            GetAccountsRequest
                .builder()
                .fieldsAccount(fieldsAccount)
                .revision(revision)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/api/accounts");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/vnd.api+json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetAccountsRequest.class,
                request, 
                null));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "get_accounts", 
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
                            "get_accounts",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get_accounts",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get_accounts",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetAccountsResponse.Builder _resBuilder = 
            GetAccountsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetAccountsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/vnd.api+json")) {
                GetAccountResponseCollection _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetAccountResponseCollection>() {});
                _res.withGetAccountResponseCollection(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
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



    /**
     * Get Account
     * Retrieve a single account object by its account ID. You can only request the account by which the private API key was generated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: `1/s`&lt;br&gt;Steady: `15/m`
     * 
     * **Scopes:**
     * `accounts:read`
     * @return The call builder
     */
    public GetAccountRequestBuilder getAccount() {
        return new GetAccountRequestBuilder(this);
    }

    /**
     * Get Account
     * Retrieve a single account object by its account ID. You can only request the account by which the private API key was generated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: `1/s`&lt;br&gt;Steady: `15/m`
     * 
     * **Scopes:**
     * `accounts:read`
     * @param id The ID of the account
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix])
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAccountResponse getAccount(
            String id,
            String revision) throws Exception {
        return getAccount(id, Optional.empty(), revision);
    }
    
    /**
     * Get Account
     * Retrieve a single account object by its account ID. You can only request the account by which the private API key was generated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: `1/s`&lt;br&gt;Steady: `15/m`
     * 
     * **Scopes:**
     * `accounts:read`
     * @param id The ID of the account
     * @param fieldsAccount For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix])
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAccountResponse getAccount(
            String id,
            Optional<? extends List<QueryParamFieldsAccount>> fieldsAccount,
            String revision) throws Exception {
        GetAccountRequest request =
            GetAccountRequest
                .builder()
                .id(id)
                .fieldsAccount(fieldsAccount)
                .revision(revision)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetAccountRequest.class,
                _baseUrl,
                "/api/accounts/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/vnd.api+json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetAccountRequest.class,
                request, 
                null));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "get_account", 
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
                            "get_account",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get_account",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get_account",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetAccountResponse.Builder _resBuilder = 
            GetAccountResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetAccountResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/vnd.api+json")) {
                com.commercesystems.klaviyo_java.models.components.GetAccountResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.commercesystems.klaviyo_java.models.components.GetAccountResponse>() {});
                _res.withGetAccountResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
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
