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

public class GetBulkUpdateCatalogItemsJobsRequestBuilder {

    private Optional<? extends List<FieldsCatalogItemBulkUpdateJob>> fieldsCatalogItemBulkUpdateJob = Optional.empty();
    private Optional<String> filter = Optional.empty();
    private Optional<String> pageCursor = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetBulkUpdateCatalogItemsJobs sdk;

    public GetBulkUpdateCatalogItemsJobsRequestBuilder(SDKMethodInterfaces.MethodCallGetBulkUpdateCatalogItemsJobs sdk) {
        this.sdk = sdk;
    }
                
    public GetBulkUpdateCatalogItemsJobsRequestBuilder fieldsCatalogItemBulkUpdateJob(List<FieldsCatalogItemBulkUpdateJob> fieldsCatalogItemBulkUpdateJob) {
        Utils.checkNotNull(fieldsCatalogItemBulkUpdateJob, "fieldsCatalogItemBulkUpdateJob");
        this.fieldsCatalogItemBulkUpdateJob = Optional.of(fieldsCatalogItemBulkUpdateJob);
        return this;
    }

    public GetBulkUpdateCatalogItemsJobsRequestBuilder fieldsCatalogItemBulkUpdateJob(Optional<? extends List<FieldsCatalogItemBulkUpdateJob>> fieldsCatalogItemBulkUpdateJob) {
        Utils.checkNotNull(fieldsCatalogItemBulkUpdateJob, "fieldsCatalogItemBulkUpdateJob");
        this.fieldsCatalogItemBulkUpdateJob = fieldsCatalogItemBulkUpdateJob;
        return this;
    }
                
    public GetBulkUpdateCatalogItemsJobsRequestBuilder filter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.of(filter);
        return this;
    }

    public GetBulkUpdateCatalogItemsJobsRequestBuilder filter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }
                
    public GetBulkUpdateCatalogItemsJobsRequestBuilder pageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.of(pageCursor);
        return this;
    }

    public GetBulkUpdateCatalogItemsJobsRequestBuilder pageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    public GetBulkUpdateCatalogItemsJobsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetBulkUpdateCatalogItemsJobsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getBulkUpdateCatalogItemsJobs(
            fieldsCatalogItemBulkUpdateJob,
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
