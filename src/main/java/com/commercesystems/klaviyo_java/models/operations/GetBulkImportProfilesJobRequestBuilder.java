/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.Utils;

public class GetBulkImportProfilesJobRequestBuilder {

    private GetBulkImportProfilesJobRequest request;
    private final SDKMethodInterfaces.MethodCallGetBulkImportProfilesJob sdk;

    public GetBulkImportProfilesJobRequestBuilder(SDKMethodInterfaces.MethodCallGetBulkImportProfilesJob sdk) {
        this.sdk = sdk;
    }

    public GetBulkImportProfilesJobRequestBuilder request(GetBulkImportProfilesJobRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetBulkImportProfilesJobResponse call() throws Exception {

        return sdk.getBulkImportProfilesJob(
            request);
    }
}
