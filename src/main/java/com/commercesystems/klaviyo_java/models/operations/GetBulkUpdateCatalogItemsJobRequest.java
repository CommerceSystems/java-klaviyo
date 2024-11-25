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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetBulkUpdateCatalogItemsJobRequest {

    /**
     * ID of the job to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=job_id")
    private String jobId;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-item-bulk-update-job]")
    private Optional<? extends List<QueryParamFieldsCatalogItemBulkUpdateJob>> fieldsCatalogItemBulkUpdateJob;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-item]")
    private Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamFieldsCatalogItem>> fieldsCatalogItem;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamInclude>> include;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetBulkUpdateCatalogItemsJobRequest(
            String jobId,
            Optional<? extends List<QueryParamFieldsCatalogItemBulkUpdateJob>> fieldsCatalogItemBulkUpdateJob,
            Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamFieldsCatalogItem>> fieldsCatalogItem,
            Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamInclude>> include,
            String revision) {
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(fieldsCatalogItemBulkUpdateJob, "fieldsCatalogItemBulkUpdateJob");
        Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(revision, "revision");
        this.jobId = jobId;
        this.fieldsCatalogItemBulkUpdateJob = fieldsCatalogItemBulkUpdateJob;
        this.fieldsCatalogItem = fieldsCatalogItem;
        this.include = include;
        this.revision = revision;
    }
    
    public GetBulkUpdateCatalogItemsJobRequest(
            String jobId,
            String revision) {
        this(jobId, Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    /**
     * ID of the job to retrieve.
     */
    @JsonIgnore
    public String jobId() {
        return jobId;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<QueryParamFieldsCatalogItemBulkUpdateJob>> fieldsCatalogItemBulkUpdateJob() {
        return (Optional<List<QueryParamFieldsCatalogItemBulkUpdateJob>>) fieldsCatalogItemBulkUpdateJob;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetBulkUpdateCatalogItemsJobQueryParamFieldsCatalogItem>> fieldsCatalogItem() {
        return (Optional<List<GetBulkUpdateCatalogItemsJobQueryParamFieldsCatalogItem>>) fieldsCatalogItem;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetBulkUpdateCatalogItemsJobQueryParamInclude>> include() {
        return (Optional<List<GetBulkUpdateCatalogItemsJobQueryParamInclude>>) include;
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

    /**
     * ID of the job to retrieve.
     */
    public GetBulkUpdateCatalogItemsJobRequest withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetBulkUpdateCatalogItemsJobRequest withFieldsCatalogItemBulkUpdateJob(List<QueryParamFieldsCatalogItemBulkUpdateJob> fieldsCatalogItemBulkUpdateJob) {
        Utils.checkNotNull(fieldsCatalogItemBulkUpdateJob, "fieldsCatalogItemBulkUpdateJob");
        this.fieldsCatalogItemBulkUpdateJob = Optional.ofNullable(fieldsCatalogItemBulkUpdateJob);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetBulkUpdateCatalogItemsJobRequest withFieldsCatalogItemBulkUpdateJob(Optional<? extends List<QueryParamFieldsCatalogItemBulkUpdateJob>> fieldsCatalogItemBulkUpdateJob) {
        Utils.checkNotNull(fieldsCatalogItemBulkUpdateJob, "fieldsCatalogItemBulkUpdateJob");
        this.fieldsCatalogItemBulkUpdateJob = fieldsCatalogItemBulkUpdateJob;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetBulkUpdateCatalogItemsJobRequest withFieldsCatalogItem(List<GetBulkUpdateCatalogItemsJobQueryParamFieldsCatalogItem> fieldsCatalogItem) {
        Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
        this.fieldsCatalogItem = Optional.ofNullable(fieldsCatalogItem);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetBulkUpdateCatalogItemsJobRequest withFieldsCatalogItem(Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamFieldsCatalogItem>> fieldsCatalogItem) {
        Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
        this.fieldsCatalogItem = fieldsCatalogItem;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetBulkUpdateCatalogItemsJobRequest withInclude(List<GetBulkUpdateCatalogItemsJobQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetBulkUpdateCatalogItemsJobRequest withInclude(Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetBulkUpdateCatalogItemsJobRequest withRevision(String revision) {
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
        GetBulkUpdateCatalogItemsJobRequest other = (GetBulkUpdateCatalogItemsJobRequest) o;
        return 
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.fieldsCatalogItemBulkUpdateJob, other.fieldsCatalogItemBulkUpdateJob) &&
            Objects.deepEquals(this.fieldsCatalogItem, other.fieldsCatalogItem) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            jobId,
            fieldsCatalogItemBulkUpdateJob,
            fieldsCatalogItem,
            include,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBulkUpdateCatalogItemsJobRequest.class,
                "jobId", jobId,
                "fieldsCatalogItemBulkUpdateJob", fieldsCatalogItemBulkUpdateJob,
                "fieldsCatalogItem", fieldsCatalogItem,
                "include", include,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String jobId;
 
        private Optional<? extends List<QueryParamFieldsCatalogItemBulkUpdateJob>> fieldsCatalogItemBulkUpdateJob = Optional.empty();
 
        private Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamFieldsCatalogItem>> fieldsCatalogItem = Optional.empty();
 
        private Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamInclude>> include = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the job to retrieve.
         */
        public Builder jobId(String jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogItemBulkUpdateJob(List<QueryParamFieldsCatalogItemBulkUpdateJob> fieldsCatalogItemBulkUpdateJob) {
            Utils.checkNotNull(fieldsCatalogItemBulkUpdateJob, "fieldsCatalogItemBulkUpdateJob");
            this.fieldsCatalogItemBulkUpdateJob = Optional.ofNullable(fieldsCatalogItemBulkUpdateJob);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogItemBulkUpdateJob(Optional<? extends List<QueryParamFieldsCatalogItemBulkUpdateJob>> fieldsCatalogItemBulkUpdateJob) {
            Utils.checkNotNull(fieldsCatalogItemBulkUpdateJob, "fieldsCatalogItemBulkUpdateJob");
            this.fieldsCatalogItemBulkUpdateJob = fieldsCatalogItemBulkUpdateJob;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogItem(List<GetBulkUpdateCatalogItemsJobQueryParamFieldsCatalogItem> fieldsCatalogItem) {
            Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
            this.fieldsCatalogItem = Optional.ofNullable(fieldsCatalogItem);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogItem(Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamFieldsCatalogItem>> fieldsCatalogItem) {
            Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
            this.fieldsCatalogItem = fieldsCatalogItem;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(List<GetBulkUpdateCatalogItemsJobQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(Optional<? extends List<GetBulkUpdateCatalogItemsJobQueryParamInclude>> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
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
        
        public GetBulkUpdateCatalogItemsJobRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetBulkUpdateCatalogItemsJobRequest(
                jobId,
                fieldsCatalogItemBulkUpdateJob,
                fieldsCatalogItem,
                include,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}
