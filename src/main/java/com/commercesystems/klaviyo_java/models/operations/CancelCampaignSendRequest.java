/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.CampaignSendJobPartialUpdateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CancelCampaignSendRequest {

    /**
     * The ID of the currently sending campaign to cancel or revert
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    /**
     * Permanently cancel the campaign, setting the status to CANCELED or
     * revert the campaign, setting the status back to DRAFT
     */
    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private CampaignSendJobPartialUpdateQuery campaignSendJobPartialUpdateQuery;

    @JsonCreator
    public CancelCampaignSendRequest(
            String id,
            String revision,
            CampaignSendJobPartialUpdateQuery campaignSendJobPartialUpdateQuery) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(campaignSendJobPartialUpdateQuery, "campaignSendJobPartialUpdateQuery");
        this.id = id;
        this.revision = revision;
        this.campaignSendJobPartialUpdateQuery = campaignSendJobPartialUpdateQuery;
    }

    /**
     * The ID of the currently sending campaign to cancel or revert
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    /**
     * Permanently cancel the campaign, setting the status to CANCELED or
     * revert the campaign, setting the status back to DRAFT
     */
    @JsonIgnore
    public CampaignSendJobPartialUpdateQuery campaignSendJobPartialUpdateQuery() {
        return campaignSendJobPartialUpdateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the currently sending campaign to cancel or revert
     */
    public CancelCampaignSendRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public CancelCampaignSendRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    /**
     * Permanently cancel the campaign, setting the status to CANCELED or
     * revert the campaign, setting the status back to DRAFT
     */
    public CancelCampaignSendRequest withCampaignSendJobPartialUpdateQuery(CampaignSendJobPartialUpdateQuery campaignSendJobPartialUpdateQuery) {
        Utils.checkNotNull(campaignSendJobPartialUpdateQuery, "campaignSendJobPartialUpdateQuery");
        this.campaignSendJobPartialUpdateQuery = campaignSendJobPartialUpdateQuery;
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
        CancelCampaignSendRequest other = (CancelCampaignSendRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.campaignSendJobPartialUpdateQuery, other.campaignSendJobPartialUpdateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            revision,
            campaignSendJobPartialUpdateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CancelCampaignSendRequest.class,
                "id", id,
                "revision", revision,
                "campaignSendJobPartialUpdateQuery", campaignSendJobPartialUpdateQuery);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String revision;
 
        private CampaignSendJobPartialUpdateQuery campaignSendJobPartialUpdateQuery;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the currently sending campaign to cancel or revert
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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

        /**
         * Permanently cancel the campaign, setting the status to CANCELED or
         * revert the campaign, setting the status back to DRAFT
         */
        public Builder campaignSendJobPartialUpdateQuery(CampaignSendJobPartialUpdateQuery campaignSendJobPartialUpdateQuery) {
            Utils.checkNotNull(campaignSendJobPartialUpdateQuery, "campaignSendJobPartialUpdateQuery");
            this.campaignSendJobPartialUpdateQuery = campaignSendJobPartialUpdateQuery;
            return this;
        }
        
        public CancelCampaignSendRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new CancelCampaignSendRequest(
                id,
                revision,
                campaignSendJobPartialUpdateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

