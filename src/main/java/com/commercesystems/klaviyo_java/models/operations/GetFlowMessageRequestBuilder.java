/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetFlowMessageRequestBuilder {

    private GetFlowMessageRequest request;
    private final SDKMethodInterfaces.MethodCallGetFlowMessage sdk;

    public GetFlowMessageRequestBuilder(SDKMethodInterfaces.MethodCallGetFlowMessage sdk) {
        this.sdk = sdk;
    }

    public GetFlowMessageRequestBuilder request(GetFlowMessageRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetFlowMessageResponse call() throws Exception {

        return sdk.getFlowMessage(
            request);
    }
}
