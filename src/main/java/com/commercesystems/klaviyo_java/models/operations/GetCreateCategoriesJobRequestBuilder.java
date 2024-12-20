/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetCreateCategoriesJobRequestBuilder {

    private GetCreateCategoriesJobRequest request;
    private final SDKMethodInterfaces.MethodCallGetCreateCategoriesJob sdk;

    public GetCreateCategoriesJobRequestBuilder(SDKMethodInterfaces.MethodCallGetCreateCategoriesJob sdk) {
        this.sdk = sdk;
    }

    public GetCreateCategoriesJobRequestBuilder request(GetCreateCategoriesJobRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCreateCategoriesJobResponse call() throws Exception {

        return sdk.getCreateCategoriesJob(
            request);
    }
}
