/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetVersionsForFormRequestBuilder {

    private GetVersionsForFormRequest request;
    private final SDKMethodInterfaces.MethodCallGetVersionsForForm sdk;

    public GetVersionsForFormRequestBuilder(SDKMethodInterfaces.MethodCallGetVersionsForForm sdk) {
        this.sdk = sdk;
    }

    public GetVersionsForFormRequestBuilder request(GetVersionsForFormRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetVersionsForFormResponse call() throws Exception {

        return sdk.getVersionsForForm(
            request);
    }
}
