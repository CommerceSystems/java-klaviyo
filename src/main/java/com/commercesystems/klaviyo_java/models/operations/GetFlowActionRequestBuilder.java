/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetFlowActionRequestBuilder {

    private GetFlowActionRequest request;
    private final SDKMethodInterfaces.MethodCallGetFlowAction sdk;

    public GetFlowActionRequestBuilder(SDKMethodInterfaces.MethodCallGetFlowAction sdk) {
        this.sdk = sdk;
    }

    public GetFlowActionRequestBuilder request(GetFlowActionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetFlowActionResponse call() throws Exception {

        return sdk.getFlowAction(
            request);
    }
}