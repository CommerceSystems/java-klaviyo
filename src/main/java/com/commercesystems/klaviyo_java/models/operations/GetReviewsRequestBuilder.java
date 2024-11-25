/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetReviewsRequestBuilder {

    private GetReviewsRequest request;
    private final SDKMethodInterfaces.MethodCallGetReviews sdk;

    public GetReviewsRequestBuilder(SDKMethodInterfaces.MethodCallGetReviews sdk) {
        this.sdk = sdk;
    }

    public GetReviewsRequestBuilder request(GetReviewsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetReviewsResponse call() throws Exception {

        return sdk.getReviews(
            request);
    }
}