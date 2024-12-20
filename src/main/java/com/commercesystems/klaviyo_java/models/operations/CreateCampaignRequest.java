/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.CampaignCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CreateCampaignRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    /**
     * Creates a campaign from parameters
     */
    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private CampaignCreateQuery campaignCreateQuery;

    @JsonCreator
    public CreateCampaignRequest(
            String revision,
            CampaignCreateQuery campaignCreateQuery) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(campaignCreateQuery, "campaignCreateQuery");
        this.revision = revision;
        this.campaignCreateQuery = campaignCreateQuery;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    /**
     * Creates a campaign from parameters
     */
    @JsonIgnore
    public CampaignCreateQuery campaignCreateQuery() {
        return campaignCreateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public CreateCampaignRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    /**
     * Creates a campaign from parameters
     */
    public CreateCampaignRequest withCampaignCreateQuery(CampaignCreateQuery campaignCreateQuery) {
        Utils.checkNotNull(campaignCreateQuery, "campaignCreateQuery");
        this.campaignCreateQuery = campaignCreateQuery;
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
        CreateCampaignRequest other = (CreateCampaignRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.campaignCreateQuery, other.campaignCreateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            campaignCreateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCampaignRequest.class,
                "revision", revision,
                "campaignCreateQuery", campaignCreateQuery);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private CampaignCreateQuery campaignCreateQuery;  
        
        private Builder() {
          // force use of static builder() method
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
         * Creates a campaign from parameters
         */
        public Builder campaignCreateQuery(CampaignCreateQuery campaignCreateQuery) {
            Utils.checkNotNull(campaignCreateQuery, "campaignCreateQuery");
            this.campaignCreateQuery = campaignCreateQuery;
            return this;
        }
        
        public CreateCampaignRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new CreateCampaignRequest(
                revision,
                campaignCreateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

