/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetSegmentsRequestBuilder {

    private GetSegmentsRequest request;
    private final SDKMethodInterfaces.MethodCallGetSegments sdk;

    public GetSegmentsRequestBuilder(SDKMethodInterfaces.MethodCallGetSegments sdk) {
        this.sdk = sdk;
    }

    public GetSegmentsRequestBuilder request(GetSegmentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetSegmentsResponse call() throws Exception {

        return sdk.getSegments(
            request);
    }
}
