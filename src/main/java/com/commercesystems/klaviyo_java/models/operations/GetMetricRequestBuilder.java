/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetMetricRequestBuilder {

    private GetMetricRequest request;
    private final SDKMethodInterfaces.MethodCallGetMetric sdk;

    public GetMetricRequestBuilder(SDKMethodInterfaces.MethodCallGetMetric sdk) {
        this.sdk = sdk;
    }

    public GetMetricRequestBuilder request(GetMetricRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMetricResponse call() throws Exception {

        return sdk.getMetric(
            request);
    }
}