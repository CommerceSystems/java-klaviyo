/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetCouponCodeRequestBuilder {

    private GetCouponCodeRequest request;
    private final SDKMethodInterfaces.MethodCallGetCouponCode sdk;

    public GetCouponCodeRequestBuilder(SDKMethodInterfaces.MethodCallGetCouponCode sdk) {
        this.sdk = sdk;
    }

    public GetCouponCodeRequestBuilder request(GetCouponCodeRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCouponCodeResponse call() throws Exception {

        return sdk.getCouponCode(
            request);
    }
}
