/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetCatalogItemsRequestBuilder {

    private GetCatalogItemsRequest request;
    private final SDKMethodInterfaces.MethodCallGetCatalogItems sdk;

    public GetCatalogItemsRequestBuilder(SDKMethodInterfaces.MethodCallGetCatalogItems sdk) {
        this.sdk = sdk;
    }

    public GetCatalogItemsRequestBuilder request(GetCatalogItemsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCatalogItemsResponse call() throws Exception {

        return sdk.getCatalogItems(
            request);
    }
}
