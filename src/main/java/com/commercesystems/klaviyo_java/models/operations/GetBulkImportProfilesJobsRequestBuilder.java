/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetBulkImportProfilesJobsRequestBuilder {

    private GetBulkImportProfilesJobsRequest request;
    private final SDKMethodInterfaces.MethodCallGetBulkImportProfilesJobs sdk;

    public GetBulkImportProfilesJobsRequestBuilder(SDKMethodInterfaces.MethodCallGetBulkImportProfilesJobs sdk) {
        this.sdk = sdk;
    }

    public GetBulkImportProfilesJobsRequestBuilder request(GetBulkImportProfilesJobsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetBulkImportProfilesJobsResponse call() throws Exception {

        return sdk.getBulkImportProfilesJobs(
            request);
    }
}