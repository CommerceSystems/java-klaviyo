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


public class GetCreateVariantsJobRequest {

    /**
     * ID of the job to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=job_id")
    private String jobId;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-variant-bulk-create-job]")
    private Optional<? extends List<QueryParamFieldsCatalogVariantBulkCreateJob>> fieldsCatalogVariantBulkCreateJob;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-variant]")
    private Optional<? extends List<GetCreateVariantsJobQueryParamFieldsCatalogVariant>> fieldsCatalogVariant;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetCreateVariantsJobQueryParamInclude>> include;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetCreateVariantsJobRequest(
            String jobId,
            Optional<? extends List<QueryParamFieldsCatalogVariantBulkCreateJob>> fieldsCatalogVariantBulkCreateJob,
            Optional<? extends List<GetCreateVariantsJobQueryParamFieldsCatalogVariant>> fieldsCatalogVariant,
            Optional<? extends List<GetCreateVariantsJobQueryParamInclude>> include,
            String revision) {
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(fieldsCatalogVariantBulkCreateJob, "fieldsCatalogVariantBulkCreateJob");
        Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(revision, "revision");
        this.jobId = jobId;
        this.fieldsCatalogVariantBulkCreateJob = fieldsCatalogVariantBulkCreateJob;
        this.fieldsCatalogVariant = fieldsCatalogVariant;
        this.include = include;
        this.revision = revision;
    }
    
    public GetCreateVariantsJobRequest(
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
    public Optional<List<QueryParamFieldsCatalogVariantBulkCreateJob>> fieldsCatalogVariantBulkCreateJob() {
        return (Optional<List<QueryParamFieldsCatalogVariantBulkCreateJob>>) fieldsCatalogVariantBulkCreateJob;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCreateVariantsJobQueryParamFieldsCatalogVariant>> fieldsCatalogVariant() {
        return (Optional<List<GetCreateVariantsJobQueryParamFieldsCatalogVariant>>) fieldsCatalogVariant;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCreateVariantsJobQueryParamInclude>> include() {
        return (Optional<List<GetCreateVariantsJobQueryParamInclude>>) include;
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
    public GetCreateVariantsJobRequest withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCreateVariantsJobRequest withFieldsCatalogVariantBulkCreateJob(List<QueryParamFieldsCatalogVariantBulkCreateJob> fieldsCatalogVariantBulkCreateJob) {
        Utils.checkNotNull(fieldsCatalogVariantBulkCreateJob, "fieldsCatalogVariantBulkCreateJob");
        this.fieldsCatalogVariantBulkCreateJob = Optional.ofNullable(fieldsCatalogVariantBulkCreateJob);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCreateVariantsJobRequest withFieldsCatalogVariantBulkCreateJob(Optional<? extends List<QueryParamFieldsCatalogVariantBulkCreateJob>> fieldsCatalogVariantBulkCreateJob) {
        Utils.checkNotNull(fieldsCatalogVariantBulkCreateJob, "fieldsCatalogVariantBulkCreateJob");
        this.fieldsCatalogVariantBulkCreateJob = fieldsCatalogVariantBulkCreateJob;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCreateVariantsJobRequest withFieldsCatalogVariant(List<GetCreateVariantsJobQueryParamFieldsCatalogVariant> fieldsCatalogVariant) {
        Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
        this.fieldsCatalogVariant = Optional.ofNullable(fieldsCatalogVariant);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCreateVariantsJobRequest withFieldsCatalogVariant(Optional<? extends List<GetCreateVariantsJobQueryParamFieldsCatalogVariant>> fieldsCatalogVariant) {
        Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
        this.fieldsCatalogVariant = fieldsCatalogVariant;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetCreateVariantsJobRequest withInclude(List<GetCreateVariantsJobQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetCreateVariantsJobRequest withInclude(Optional<? extends List<GetCreateVariantsJobQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetCreateVariantsJobRequest withRevision(String revision) {
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
        GetCreateVariantsJobRequest other = (GetCreateVariantsJobRequest) o;
        return 
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.fieldsCatalogVariantBulkCreateJob, other.fieldsCatalogVariantBulkCreateJob) &&
            Objects.deepEquals(this.fieldsCatalogVariant, other.fieldsCatalogVariant) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            jobId,
            fieldsCatalogVariantBulkCreateJob,
            fieldsCatalogVariant,
            include,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCreateVariantsJobRequest.class,
                "jobId", jobId,
                "fieldsCatalogVariantBulkCreateJob", fieldsCatalogVariantBulkCreateJob,
                "fieldsCatalogVariant", fieldsCatalogVariant,
                "include", include,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String jobId;
 
        private Optional<? extends List<QueryParamFieldsCatalogVariantBulkCreateJob>> fieldsCatalogVariantBulkCreateJob = Optional.empty();
 
        private Optional<? extends List<GetCreateVariantsJobQueryParamFieldsCatalogVariant>> fieldsCatalogVariant = Optional.empty();
 
        private Optional<? extends List<GetCreateVariantsJobQueryParamInclude>> include = Optional.empty();
 
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
        public Builder fieldsCatalogVariantBulkCreateJob(List<QueryParamFieldsCatalogVariantBulkCreateJob> fieldsCatalogVariantBulkCreateJob) {
            Utils.checkNotNull(fieldsCatalogVariantBulkCreateJob, "fieldsCatalogVariantBulkCreateJob");
            this.fieldsCatalogVariantBulkCreateJob = Optional.ofNullable(fieldsCatalogVariantBulkCreateJob);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogVariantBulkCreateJob(Optional<? extends List<QueryParamFieldsCatalogVariantBulkCreateJob>> fieldsCatalogVariantBulkCreateJob) {
            Utils.checkNotNull(fieldsCatalogVariantBulkCreateJob, "fieldsCatalogVariantBulkCreateJob");
            this.fieldsCatalogVariantBulkCreateJob = fieldsCatalogVariantBulkCreateJob;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogVariant(List<GetCreateVariantsJobQueryParamFieldsCatalogVariant> fieldsCatalogVariant) {
            Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
            this.fieldsCatalogVariant = Optional.ofNullable(fieldsCatalogVariant);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogVariant(Optional<? extends List<GetCreateVariantsJobQueryParamFieldsCatalogVariant>> fieldsCatalogVariant) {
            Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
            this.fieldsCatalogVariant = fieldsCatalogVariant;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(List<GetCreateVariantsJobQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(Optional<? extends List<GetCreateVariantsJobQueryParamInclude>> include) {
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
        
        public GetCreateVariantsJobRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetCreateVariantsJobRequest(
                jobId,
                fieldsCatalogVariantBulkCreateJob,
                fieldsCatalogVariant,
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

