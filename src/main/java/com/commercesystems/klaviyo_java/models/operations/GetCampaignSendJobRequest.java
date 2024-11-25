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


public class GetCampaignSendJobRequest {

    /**
     * The ID of the campaign to send
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[campaign-send-job]")
    private Optional<? extends List<FieldsCampaignSendJob>> fieldsCampaignSendJob;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetCampaignSendJobRequest(
            String id,
            Optional<? extends List<FieldsCampaignSendJob>> fieldsCampaignSendJob,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(fieldsCampaignSendJob, "fieldsCampaignSendJob");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.fieldsCampaignSendJob = fieldsCampaignSendJob;
        this.revision = revision;
    }
    
    public GetCampaignSendJobRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), revision);
    }

    /**
     * The ID of the campaign to send
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FieldsCampaignSendJob>> fieldsCampaignSendJob() {
        return (Optional<List<FieldsCampaignSendJob>>) fieldsCampaignSendJob;
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
     * The ID of the campaign to send
     */
    public GetCampaignSendJobRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCampaignSendJobRequest withFieldsCampaignSendJob(List<FieldsCampaignSendJob> fieldsCampaignSendJob) {
        Utils.checkNotNull(fieldsCampaignSendJob, "fieldsCampaignSendJob");
        this.fieldsCampaignSendJob = Optional.ofNullable(fieldsCampaignSendJob);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCampaignSendJobRequest withFieldsCampaignSendJob(Optional<? extends List<FieldsCampaignSendJob>> fieldsCampaignSendJob) {
        Utils.checkNotNull(fieldsCampaignSendJob, "fieldsCampaignSendJob");
        this.fieldsCampaignSendJob = fieldsCampaignSendJob;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetCampaignSendJobRequest withRevision(String revision) {
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
        GetCampaignSendJobRequest other = (GetCampaignSendJobRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.fieldsCampaignSendJob, other.fieldsCampaignSendJob) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            fieldsCampaignSendJob,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCampaignSendJobRequest.class,
                "id", id,
                "fieldsCampaignSendJob", fieldsCampaignSendJob,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends List<FieldsCampaignSendJob>> fieldsCampaignSendJob = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the campaign to send
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCampaignSendJob(List<FieldsCampaignSendJob> fieldsCampaignSendJob) {
            Utils.checkNotNull(fieldsCampaignSendJob, "fieldsCampaignSendJob");
            this.fieldsCampaignSendJob = Optional.ofNullable(fieldsCampaignSendJob);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCampaignSendJob(Optional<? extends List<FieldsCampaignSendJob>> fieldsCampaignSendJob) {
            Utils.checkNotNull(fieldsCampaignSendJob, "fieldsCampaignSendJob");
            this.fieldsCampaignSendJob = fieldsCampaignSendJob;
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
        
        public GetCampaignSendJobRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetCampaignSendJobRequest(
                id,
                fieldsCampaignSendJob,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

