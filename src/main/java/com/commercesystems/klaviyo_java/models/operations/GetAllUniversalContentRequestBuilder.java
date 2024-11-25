/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetAllUniversalContentRequestBuilder {

    private GetAllUniversalContentRequest request;
    private final SDKMethodInterfaces.MethodCallGetAllUniversalContent sdk;

    public GetAllUniversalContentRequestBuilder(SDKMethodInterfaces.MethodCallGetAllUniversalContent sdk) {
        this.sdk = sdk;
    }

    public GetAllUniversalContentRequestBuilder request(GetAllUniversalContentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAllUniversalContentResponse call() throws Exception {

        return sdk.getAllUniversalContent(
            request);
    }
}