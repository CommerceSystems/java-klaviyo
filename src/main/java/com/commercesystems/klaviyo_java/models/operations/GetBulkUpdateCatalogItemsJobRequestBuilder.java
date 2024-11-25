/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetBulkUpdateCatalogItemsJobRequestBuilder {

    private GetBulkUpdateCatalogItemsJobRequest request;
    private final SDKMethodInterfaces.MethodCallGetBulkUpdateCatalogItemsJob sdk;

    public GetBulkUpdateCatalogItemsJobRequestBuilder(SDKMethodInterfaces.MethodCallGetBulkUpdateCatalogItemsJob sdk) {
        this.sdk = sdk;
    }

    public GetBulkUpdateCatalogItemsJobRequestBuilder request(GetBulkUpdateCatalogItemsJobRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetBulkUpdateCatalogItemsJobResponse call() throws Exception {

        return sdk.getBulkUpdateCatalogItemsJob(
            request);
    }
}
