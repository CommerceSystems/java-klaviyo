/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetCatalogCategoriesRequestBuilder {

    private GetCatalogCategoriesRequest request;
    private final SDKMethodInterfaces.MethodCallGetCatalogCategories sdk;

    public GetCatalogCategoriesRequestBuilder(SDKMethodInterfaces.MethodCallGetCatalogCategories sdk) {
        this.sdk = sdk;
    }

    public GetCatalogCategoriesRequestBuilder request(GetCatalogCategoriesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCatalogCategoriesResponse call() throws Exception {

        return sdk.getCatalogCategories(
            request);
    }
}
