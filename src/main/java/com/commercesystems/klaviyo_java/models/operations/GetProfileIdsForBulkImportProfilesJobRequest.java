/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetProfileIdsForBulkImportProfilesJobRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page[cursor]")
    private Optional<String> pageCursor;

    /**
     * Default: 20. Min: 1. Max: 100.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page[size]")
    private Optional<Long> pageSize;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetProfileIdsForBulkImportProfilesJobRequest(
            String id,
            Optional<String> pageCursor,
            Optional<Long> pageSize,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(pageCursor, "pageCursor");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.pageCursor = pageCursor;
        this.pageSize = pageSize;
        this.revision = revision;
    }
    
    public GetProfileIdsForBulkImportProfilesJobRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), Optional.empty(), revision);
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @JsonIgnore
    public Optional<String> pageCursor() {
        return pageCursor;
    }

    /**
     * Default: 20. Min: 1. Max: 100.
     */
    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetProfileIdsForBulkImportProfilesJobRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetProfileIdsForBulkImportProfilesJobRequest withPageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.ofNullable(pageCursor);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetProfileIdsForBulkImportProfilesJobRequest withPageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    /**
     * Default: 20. Min: 1. Max: 100.
     */
    public GetProfileIdsForBulkImportProfilesJobRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * Default: 20. Min: 1. Max: 100.
     */
    public GetProfileIdsForBulkImportProfilesJobRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetProfileIdsForBulkImportProfilesJobRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetProfileIdsForBulkImportProfilesJobRequest other = (GetProfileIdsForBulkImportProfilesJobRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.pageCursor, other.pageCursor) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            pageCursor,
            pageSize,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetProfileIdsForBulkImportProfilesJobRequest.class,
                "id", id,
                "pageCursor", pageCursor,
                "pageSize", pageSize,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<String> pageCursor = Optional.empty();
 
        private Optional<Long> pageSize;
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
         */
        public Builder pageCursor(String pageCursor) {
            Utils.checkNotNull(pageCursor, "pageCursor");
            this.pageCursor = Optional.ofNullable(pageCursor);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
         */
        public Builder pageCursor(Optional<String> pageCursor) {
            Utils.checkNotNull(pageCursor, "pageCursor");
            this.pageCursor = pageCursor;
            return this;
        }

        /**
         * Default: 20. Min: 1. Max: 100.
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * Default: 20. Min: 1. Max: 100.
         */
        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }
        
        public GetProfileIdsForBulkImportProfilesJobRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetProfileIdsForBulkImportProfilesJobRequest(
                id,
                pageCursor,
                pageSize,
                revision);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "page[size]",
                        "20",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

