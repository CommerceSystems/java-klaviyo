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


public class GetUpdateCategoriesJobRequest {

    /**
     * ID of the job to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=job_id")
    private String jobId;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-category-bulk-update-job]")
    private Optional<? extends List<QueryParamFieldsCatalogCategoryBulkUpdateJob>> fieldsCatalogCategoryBulkUpdateJob;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-category]")
    private Optional<? extends List<GetUpdateCategoriesJobQueryParamFieldsCatalogCategory>> fieldsCatalogCategory;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetUpdateCategoriesJobQueryParamInclude>> include;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetUpdateCategoriesJobRequest(
            String jobId,
            Optional<? extends List<QueryParamFieldsCatalogCategoryBulkUpdateJob>> fieldsCatalogCategoryBulkUpdateJob,
            Optional<? extends List<GetUpdateCategoriesJobQueryParamFieldsCatalogCategory>> fieldsCatalogCategory,
            Optional<? extends List<GetUpdateCategoriesJobQueryParamInclude>> include,
            String revision) {
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(fieldsCatalogCategoryBulkUpdateJob, "fieldsCatalogCategoryBulkUpdateJob");
        Utils.checkNotNull(fieldsCatalogCategory, "fieldsCatalogCategory");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(revision, "revision");
        this.jobId = jobId;
        this.fieldsCatalogCategoryBulkUpdateJob = fieldsCatalogCategoryBulkUpdateJob;
        this.fieldsCatalogCategory = fieldsCatalogCategory;
        this.include = include;
        this.revision = revision;
    }
    
    public GetUpdateCategoriesJobRequest(
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
    public Optional<List<QueryParamFieldsCatalogCategoryBulkUpdateJob>> fieldsCatalogCategoryBulkUpdateJob() {
        return (Optional<List<QueryParamFieldsCatalogCategoryBulkUpdateJob>>) fieldsCatalogCategoryBulkUpdateJob;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetUpdateCategoriesJobQueryParamFieldsCatalogCategory>> fieldsCatalogCategory() {
        return (Optional<List<GetUpdateCategoriesJobQueryParamFieldsCatalogCategory>>) fieldsCatalogCategory;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetUpdateCategoriesJobQueryParamInclude>> include() {
        return (Optional<List<GetUpdateCategoriesJobQueryParamInclude>>) include;
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
    public GetUpdateCategoriesJobRequest withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetUpdateCategoriesJobRequest withFieldsCatalogCategoryBulkUpdateJob(List<QueryParamFieldsCatalogCategoryBulkUpdateJob> fieldsCatalogCategoryBulkUpdateJob) {
        Utils.checkNotNull(fieldsCatalogCategoryBulkUpdateJob, "fieldsCatalogCategoryBulkUpdateJob");
        this.fieldsCatalogCategoryBulkUpdateJob = Optional.ofNullable(fieldsCatalogCategoryBulkUpdateJob);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetUpdateCategoriesJobRequest withFieldsCatalogCategoryBulkUpdateJob(Optional<? extends List<QueryParamFieldsCatalogCategoryBulkUpdateJob>> fieldsCatalogCategoryBulkUpdateJob) {
        Utils.checkNotNull(fieldsCatalogCategoryBulkUpdateJob, "fieldsCatalogCategoryBulkUpdateJob");
        this.fieldsCatalogCategoryBulkUpdateJob = fieldsCatalogCategoryBulkUpdateJob;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetUpdateCategoriesJobRequest withFieldsCatalogCategory(List<GetUpdateCategoriesJobQueryParamFieldsCatalogCategory> fieldsCatalogCategory) {
        Utils.checkNotNull(fieldsCatalogCategory, "fieldsCatalogCategory");
        this.fieldsCatalogCategory = Optional.ofNullable(fieldsCatalogCategory);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetUpdateCategoriesJobRequest withFieldsCatalogCategory(Optional<? extends List<GetUpdateCategoriesJobQueryParamFieldsCatalogCategory>> fieldsCatalogCategory) {
        Utils.checkNotNull(fieldsCatalogCategory, "fieldsCatalogCategory");
        this.fieldsCatalogCategory = fieldsCatalogCategory;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetUpdateCategoriesJobRequest withInclude(List<GetUpdateCategoriesJobQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetUpdateCategoriesJobRequest withInclude(Optional<? extends List<GetUpdateCategoriesJobQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetUpdateCategoriesJobRequest withRevision(String revision) {
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
        GetUpdateCategoriesJobRequest other = (GetUpdateCategoriesJobRequest) o;
        return 
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.fieldsCatalogCategoryBulkUpdateJob, other.fieldsCatalogCategoryBulkUpdateJob) &&
            Objects.deepEquals(this.fieldsCatalogCategory, other.fieldsCatalogCategory) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            jobId,
            fieldsCatalogCategoryBulkUpdateJob,
            fieldsCatalogCategory,
            include,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUpdateCategoriesJobRequest.class,
                "jobId", jobId,
                "fieldsCatalogCategoryBulkUpdateJob", fieldsCatalogCategoryBulkUpdateJob,
                "fieldsCatalogCategory", fieldsCatalogCategory,
                "include", include,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String jobId;
 
        private Optional<? extends List<QueryParamFieldsCatalogCategoryBulkUpdateJob>> fieldsCatalogCategoryBulkUpdateJob = Optional.empty();
 
        private Optional<? extends List<GetUpdateCategoriesJobQueryParamFieldsCatalogCategory>> fieldsCatalogCategory = Optional.empty();
 
        private Optional<? extends List<GetUpdateCategoriesJobQueryParamInclude>> include = Optional.empty();
 
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
        public Builder fieldsCatalogCategoryBulkUpdateJob(List<QueryParamFieldsCatalogCategoryBulkUpdateJob> fieldsCatalogCategoryBulkUpdateJob) {
            Utils.checkNotNull(fieldsCatalogCategoryBulkUpdateJob, "fieldsCatalogCategoryBulkUpdateJob");
            this.fieldsCatalogCategoryBulkUpdateJob = Optional.ofNullable(fieldsCatalogCategoryBulkUpdateJob);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogCategoryBulkUpdateJob(Optional<? extends List<QueryParamFieldsCatalogCategoryBulkUpdateJob>> fieldsCatalogCategoryBulkUpdateJob) {
            Utils.checkNotNull(fieldsCatalogCategoryBulkUpdateJob, "fieldsCatalogCategoryBulkUpdateJob");
            this.fieldsCatalogCategoryBulkUpdateJob = fieldsCatalogCategoryBulkUpdateJob;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogCategory(List<GetUpdateCategoriesJobQueryParamFieldsCatalogCategory> fieldsCatalogCategory) {
            Utils.checkNotNull(fieldsCatalogCategory, "fieldsCatalogCategory");
            this.fieldsCatalogCategory = Optional.ofNullable(fieldsCatalogCategory);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogCategory(Optional<? extends List<GetUpdateCategoriesJobQueryParamFieldsCatalogCategory>> fieldsCatalogCategory) {
            Utils.checkNotNull(fieldsCatalogCategory, "fieldsCatalogCategory");
            this.fieldsCatalogCategory = fieldsCatalogCategory;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(List<GetUpdateCategoriesJobQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(Optional<? extends List<GetUpdateCategoriesJobQueryParamInclude>> include) {
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
        
        public GetUpdateCategoriesJobRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetUpdateCategoriesJobRequest(
                jobId,
                fieldsCatalogCategoryBulkUpdateJob,
                fieldsCatalogCategory,
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

