/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.SuppressionCreateJobCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class BulkSuppressProfilesRequestBuilder {

    private String revision;
    private SuppressionCreateJobCreateQuery suppressionCreateJobCreateQuery;
    private final SDKMethodInterfaces.MethodCallBulkSuppressProfiles sdk;

    public BulkSuppressProfilesRequestBuilder(SDKMethodInterfaces.MethodCallBulkSuppressProfiles sdk) {
        this.sdk = sdk;
    }

    public BulkSuppressProfilesRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkSuppressProfilesRequestBuilder suppressionCreateJobCreateQuery(SuppressionCreateJobCreateQuery suppressionCreateJobCreateQuery) {
        Utils.checkNotNull(suppressionCreateJobCreateQuery, "suppressionCreateJobCreateQuery");
        this.suppressionCreateJobCreateQuery = suppressionCreateJobCreateQuery;
        return this;
    }

    public BulkSuppressProfilesResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.bulkSuppressProfiles(
            revision,
            suppressionCreateJobCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
