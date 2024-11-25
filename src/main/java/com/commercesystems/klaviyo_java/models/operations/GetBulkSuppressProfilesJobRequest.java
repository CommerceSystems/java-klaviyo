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


public class GetBulkSuppressProfilesJobRequest {

    /**
     * ID of the job to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=job_id")
    private String jobId;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[profile-suppression-bulk-create-job]")
    private Optional<? extends List<QueryParamFieldsProfileSuppressionBulkCreateJob>> fieldsProfileSuppressionBulkCreateJob;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetBulkSuppressProfilesJobRequest(
            String jobId,
            Optional<? extends List<QueryParamFieldsProfileSuppressionBulkCreateJob>> fieldsProfileSuppressionBulkCreateJob,
            String revision) {
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(fieldsProfileSuppressionBulkCreateJob, "fieldsProfileSuppressionBulkCreateJob");
        Utils.checkNotNull(revision, "revision");
        this.jobId = jobId;
        this.fieldsProfileSuppressionBulkCreateJob = fieldsProfileSuppressionBulkCreateJob;
        this.revision = revision;
    }
    
    public GetBulkSuppressProfilesJobRequest(
            String jobId,
            String revision) {
        this(jobId, Optional.empty(), revision);
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
    public Optional<List<QueryParamFieldsProfileSuppressionBulkCreateJob>> fieldsProfileSuppressionBulkCreateJob() {
        return (Optional<List<QueryParamFieldsProfileSuppressionBulkCreateJob>>) fieldsProfileSuppressionBulkCreateJob;
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
    public GetBulkSuppressProfilesJobRequest withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetBulkSuppressProfilesJobRequest withFieldsProfileSuppressionBulkCreateJob(List<QueryParamFieldsProfileSuppressionBulkCreateJob> fieldsProfileSuppressionBulkCreateJob) {
        Utils.checkNotNull(fieldsProfileSuppressionBulkCreateJob, "fieldsProfileSuppressionBulkCreateJob");
        this.fieldsProfileSuppressionBulkCreateJob = Optional.ofNullable(fieldsProfileSuppressionBulkCreateJob);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetBulkSuppressProfilesJobRequest withFieldsProfileSuppressionBulkCreateJob(Optional<? extends List<QueryParamFieldsProfileSuppressionBulkCreateJob>> fieldsProfileSuppressionBulkCreateJob) {
        Utils.checkNotNull(fieldsProfileSuppressionBulkCreateJob, "fieldsProfileSuppressionBulkCreateJob");
        this.fieldsProfileSuppressionBulkCreateJob = fieldsProfileSuppressionBulkCreateJob;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetBulkSuppressProfilesJobRequest withRevision(String revision) {
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
        GetBulkSuppressProfilesJobRequest other = (GetBulkSuppressProfilesJobRequest) o;
        return 
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.fieldsProfileSuppressionBulkCreateJob, other.fieldsProfileSuppressionBulkCreateJob) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            jobId,
            fieldsProfileSuppressionBulkCreateJob,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBulkSuppressProfilesJobRequest.class,
                "jobId", jobId,
                "fieldsProfileSuppressionBulkCreateJob", fieldsProfileSuppressionBulkCreateJob,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String jobId;
 
        private Optional<? extends List<QueryParamFieldsProfileSuppressionBulkCreateJob>> fieldsProfileSuppressionBulkCreateJob = Optional.empty();
 
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
        public Builder fieldsProfileSuppressionBulkCreateJob(List<QueryParamFieldsProfileSuppressionBulkCreateJob> fieldsProfileSuppressionBulkCreateJob) {
            Utils.checkNotNull(fieldsProfileSuppressionBulkCreateJob, "fieldsProfileSuppressionBulkCreateJob");
            this.fieldsProfileSuppressionBulkCreateJob = Optional.ofNullable(fieldsProfileSuppressionBulkCreateJob);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsProfileSuppressionBulkCreateJob(Optional<? extends List<QueryParamFieldsProfileSuppressionBulkCreateJob>> fieldsProfileSuppressionBulkCreateJob) {
            Utils.checkNotNull(fieldsProfileSuppressionBulkCreateJob, "fieldsProfileSuppressionBulkCreateJob");
            this.fieldsProfileSuppressionBulkCreateJob = fieldsProfileSuppressionBulkCreateJob;
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
        
        public GetBulkSuppressProfilesJobRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetBulkSuppressProfilesJobRequest(
                jobId,
                fieldsProfileSuppressionBulkCreateJob,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

