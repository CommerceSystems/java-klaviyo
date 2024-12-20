/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class GetProfileIdsForBulkImportProfilesJobRequestBuilder {

    private String id;
    private Optional<String> pageCursor = Optional.empty();
    private Optional<Long> pageSize = Utils.readDefaultOrConstValue(
                            "pageSize",
                            "20",
                            new TypeReference<Optional<Long>>() {});
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetProfileIdsForBulkImportProfilesJob sdk;

    public GetProfileIdsForBulkImportProfilesJobRequestBuilder(SDKMethodInterfaces.MethodCallGetProfileIdsForBulkImportProfilesJob sdk) {
        this.sdk = sdk;
    }

    public GetProfileIdsForBulkImportProfilesJobRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetProfileIdsForBulkImportProfilesJobRequestBuilder pageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.of(pageCursor);
        return this;
    }

    public GetProfileIdsForBulkImportProfilesJobRequestBuilder pageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }
                
    public GetProfileIdsForBulkImportProfilesJobRequestBuilder pageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.of(pageSize);
        return this;
    }

    public GetProfileIdsForBulkImportProfilesJobRequestBuilder pageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public GetProfileIdsForBulkImportProfilesJobRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetProfileIdsForBulkImportProfilesJobResponse call() throws Exception {
        if (pageSize == null) {
            pageSize = _SINGLETON_VALUE_PageSize.value();
        }
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getProfileIdsForBulkImportProfilesJob(
            id,
            pageCursor,
            pageSize,
            revision);
    }

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_PageSize =
            new LazySingletonValue<>(
                    "pageSize",
                    "20",
                    new TypeReference<Optional<Long>>() {});

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
