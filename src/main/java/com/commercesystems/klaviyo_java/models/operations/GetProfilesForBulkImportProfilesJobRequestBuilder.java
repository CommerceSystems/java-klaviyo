/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetProfilesForBulkImportProfilesJobRequestBuilder {

    private GetProfilesForBulkImportProfilesJobRequest request;
    private final SDKMethodInterfaces.MethodCallGetProfilesForBulkImportProfilesJob sdk;

    public GetProfilesForBulkImportProfilesJobRequestBuilder(SDKMethodInterfaces.MethodCallGetProfilesForBulkImportProfilesJob sdk) {
        this.sdk = sdk;
    }

    public GetProfilesForBulkImportProfilesJobRequestBuilder request(GetProfilesForBulkImportProfilesJobRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetProfilesForBulkImportProfilesJobResponse call() throws Exception {

        return sdk.getProfilesForBulkImportProfilesJob(
            request);
    }
}
