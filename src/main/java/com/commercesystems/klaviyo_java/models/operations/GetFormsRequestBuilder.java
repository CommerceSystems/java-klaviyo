/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetFormsRequestBuilder {

    private GetFormsRequest request;
    private final SDKMethodInterfaces.MethodCallGetForms sdk;

    public GetFormsRequestBuilder(SDKMethodInterfaces.MethodCallGetForms sdk) {
        this.sdk = sdk;
    }

    public GetFormsRequestBuilder request(GetFormsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetFormsResponse call() throws Exception {

        return sdk.getForms(
            request);
    }
}
