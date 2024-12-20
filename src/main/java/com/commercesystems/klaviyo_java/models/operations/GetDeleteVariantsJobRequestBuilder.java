/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class GetDeleteVariantsJobRequestBuilder {

    private String jobId;
    private Optional<? extends List<QueryParamFieldsCatalogVariantBulkDeleteJob>> fieldsCatalogVariantBulkDeleteJob = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetDeleteVariantsJob sdk;

    public GetDeleteVariantsJobRequestBuilder(SDKMethodInterfaces.MethodCallGetDeleteVariantsJob sdk) {
        this.sdk = sdk;
    }

    public GetDeleteVariantsJobRequestBuilder jobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }
                
    public GetDeleteVariantsJobRequestBuilder fieldsCatalogVariantBulkDeleteJob(List<QueryParamFieldsCatalogVariantBulkDeleteJob> fieldsCatalogVariantBulkDeleteJob) {
        Utils.checkNotNull(fieldsCatalogVariantBulkDeleteJob, "fieldsCatalogVariantBulkDeleteJob");
        this.fieldsCatalogVariantBulkDeleteJob = Optional.of(fieldsCatalogVariantBulkDeleteJob);
        return this;
    }

    public GetDeleteVariantsJobRequestBuilder fieldsCatalogVariantBulkDeleteJob(Optional<? extends List<QueryParamFieldsCatalogVariantBulkDeleteJob>> fieldsCatalogVariantBulkDeleteJob) {
        Utils.checkNotNull(fieldsCatalogVariantBulkDeleteJob, "fieldsCatalogVariantBulkDeleteJob");
        this.fieldsCatalogVariantBulkDeleteJob = fieldsCatalogVariantBulkDeleteJob;
        return this;
    }

    public GetDeleteVariantsJobRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetDeleteVariantsJobResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getDeleteVariantsJob(
            jobId,
            fieldsCatalogVariantBulkDeleteJob,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
