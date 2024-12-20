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


public class GetBulkUnsuppressProfilesJobRequest {

    /**
     * ID of the job to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=job_id")
    private String jobId;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[profile-suppression-bulk-delete-job]")
    private Optional<? extends List<QueryParamFieldsProfileSuppressionBulkDeleteJob>> fieldsProfileSuppressionBulkDeleteJob;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetBulkUnsuppressProfilesJobRequest(
            String jobId,
            Optional<? extends List<QueryParamFieldsProfileSuppressionBulkDeleteJob>> fieldsProfileSuppressionBulkDeleteJob,
            String revision) {
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(fieldsProfileSuppressionBulkDeleteJob, "fieldsProfileSuppressionBulkDeleteJob");
        Utils.checkNotNull(revision, "revision");
        this.jobId = jobId;
        this.fieldsProfileSuppressionBulkDeleteJob = fieldsProfileSuppressionBulkDeleteJob;
        this.revision = revision;
    }
    
    public GetBulkUnsuppressProfilesJobRequest(
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
    public Optional<List<QueryParamFieldsProfileSuppressionBulkDeleteJob>> fieldsProfileSuppressionBulkDeleteJob() {
        return (Optional<List<QueryParamFieldsProfileSuppressionBulkDeleteJob>>) fieldsProfileSuppressionBulkDeleteJob;
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
    public GetBulkUnsuppressProfilesJobRequest withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetBulkUnsuppressProfilesJobRequest withFieldsProfileSuppressionBulkDeleteJob(List<QueryParamFieldsProfileSuppressionBulkDeleteJob> fieldsProfileSuppressionBulkDeleteJob) {
        Utils.checkNotNull(fieldsProfileSuppressionBulkDeleteJob, "fieldsProfileSuppressionBulkDeleteJob");
        this.fieldsProfileSuppressionBulkDeleteJob = Optional.ofNullable(fieldsProfileSuppressionBulkDeleteJob);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetBulkUnsuppressProfilesJobRequest withFieldsProfileSuppressionBulkDeleteJob(Optional<? extends List<QueryParamFieldsProfileSuppressionBulkDeleteJob>> fieldsProfileSuppressionBulkDeleteJob) {
        Utils.checkNotNull(fieldsProfileSuppressionBulkDeleteJob, "fieldsProfileSuppressionBulkDeleteJob");
        this.fieldsProfileSuppressionBulkDeleteJob = fieldsProfileSuppressionBulkDeleteJob;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetBulkUnsuppressProfilesJobRequest withRevision(String revision) {
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
        GetBulkUnsuppressProfilesJobRequest other = (GetBulkUnsuppressProfilesJobRequest) o;
        return 
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.fieldsProfileSuppressionBulkDeleteJob, other.fieldsProfileSuppressionBulkDeleteJob) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            jobId,
            fieldsProfileSuppressionBulkDeleteJob,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBulkUnsuppressProfilesJobRequest.class,
                "jobId", jobId,
                "fieldsProfileSuppressionBulkDeleteJob", fieldsProfileSuppressionBulkDeleteJob,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String jobId;
 
        private Optional<? extends List<QueryParamFieldsProfileSuppressionBulkDeleteJob>> fieldsProfileSuppressionBulkDeleteJob = Optional.empty();
 
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
        public Builder fieldsProfileSuppressionBulkDeleteJob(List<QueryParamFieldsProfileSuppressionBulkDeleteJob> fieldsProfileSuppressionBulkDeleteJob) {
            Utils.checkNotNull(fieldsProfileSuppressionBulkDeleteJob, "fieldsProfileSuppressionBulkDeleteJob");
            this.fieldsProfileSuppressionBulkDeleteJob = Optional.ofNullable(fieldsProfileSuppressionBulkDeleteJob);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsProfileSuppressionBulkDeleteJob(Optional<? extends List<QueryParamFieldsProfileSuppressionBulkDeleteJob>> fieldsProfileSuppressionBulkDeleteJob) {
            Utils.checkNotNull(fieldsProfileSuppressionBulkDeleteJob, "fieldsProfileSuppressionBulkDeleteJob");
            this.fieldsProfileSuppressionBulkDeleteJob = fieldsProfileSuppressionBulkDeleteJob;
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
        
        public GetBulkUnsuppressProfilesJobRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetBulkUnsuppressProfilesJobRequest(
                jobId,
                fieldsProfileSuppressionBulkDeleteJob,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

