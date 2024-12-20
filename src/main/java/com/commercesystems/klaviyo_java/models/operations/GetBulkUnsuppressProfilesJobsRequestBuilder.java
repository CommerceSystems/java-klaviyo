/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetBulkUnsuppressProfilesJobsRequestBuilder {

    private GetBulkUnsuppressProfilesJobsRequest request;
    private final SDKMethodInterfaces.MethodCallGetBulkUnsuppressProfilesJobs sdk;

    public GetBulkUnsuppressProfilesJobsRequestBuilder(SDKMethodInterfaces.MethodCallGetBulkUnsuppressProfilesJobs sdk) {
        this.sdk = sdk;
    }

    public GetBulkUnsuppressProfilesJobsRequestBuilder request(GetBulkUnsuppressProfilesJobsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetBulkUnsuppressProfilesJobsResponse call() throws Exception {

        return sdk.getBulkUnsuppressProfilesJobs(
            request);
    }
}
