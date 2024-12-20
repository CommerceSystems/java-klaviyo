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

public class GetDeleteVariantsJobsRequestBuilder {

    private Optional<? extends List<FieldsCatalogVariantBulkDeleteJob>> fieldsCatalogVariantBulkDeleteJob = Optional.empty();
    private Optional<String> filter = Optional.empty();
    private Optional<String> pageCursor = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetDeleteVariantsJobs sdk;

    public GetDeleteVariantsJobsRequestBuilder(SDKMethodInterfaces.MethodCallGetDeleteVariantsJobs sdk) {
        this.sdk = sdk;
    }
                
    public GetDeleteVariantsJobsRequestBuilder fieldsCatalogVariantBulkDeleteJob(List<FieldsCatalogVariantBulkDeleteJob> fieldsCatalogVariantBulkDeleteJob) {
        Utils.checkNotNull(fieldsCatalogVariantBulkDeleteJob, "fieldsCatalogVariantBulkDeleteJob");
        this.fieldsCatalogVariantBulkDeleteJob = Optional.of(fieldsCatalogVariantBulkDeleteJob);
        return this;
    }

    public GetDeleteVariantsJobsRequestBuilder fieldsCatalogVariantBulkDeleteJob(Optional<? extends List<FieldsCatalogVariantBulkDeleteJob>> fieldsCatalogVariantBulkDeleteJob) {
        Utils.checkNotNull(fieldsCatalogVariantBulkDeleteJob, "fieldsCatalogVariantBulkDeleteJob");
        this.fieldsCatalogVariantBulkDeleteJob = fieldsCatalogVariantBulkDeleteJob;
        return this;
    }
                
    public GetDeleteVariantsJobsRequestBuilder filter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.of(filter);
        return this;
    }

    public GetDeleteVariantsJobsRequestBuilder filter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }
                
    public GetDeleteVariantsJobsRequestBuilder pageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.of(pageCursor);
        return this;
    }

    public GetDeleteVariantsJobsRequestBuilder pageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    public GetDeleteVariantsJobsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetDeleteVariantsJobsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getDeleteVariantsJobs(
            fieldsCatalogVariantBulkDeleteJob,
            filter,
            pageCursor,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
