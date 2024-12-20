/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.CampaignMessageAssignTemplateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AssignTemplateToCampaignMessageRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    /**
     * Takes a reusable template, clones it, and assigns the non-reusable clone to the message.
     */
    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private CampaignMessageAssignTemplateQuery campaignMessageAssignTemplateQuery;

    @JsonCreator
    public AssignTemplateToCampaignMessageRequest(
            String revision,
            CampaignMessageAssignTemplateQuery campaignMessageAssignTemplateQuery) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(campaignMessageAssignTemplateQuery, "campaignMessageAssignTemplateQuery");
        this.revision = revision;
        this.campaignMessageAssignTemplateQuery = campaignMessageAssignTemplateQuery;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    /**
     * Takes a reusable template, clones it, and assigns the non-reusable clone to the message.
     */
    @JsonIgnore
    public CampaignMessageAssignTemplateQuery campaignMessageAssignTemplateQuery() {
        return campaignMessageAssignTemplateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public AssignTemplateToCampaignMessageRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    /**
     * Takes a reusable template, clones it, and assigns the non-reusable clone to the message.
     */
    public AssignTemplateToCampaignMessageRequest withCampaignMessageAssignTemplateQuery(CampaignMessageAssignTemplateQuery campaignMessageAssignTemplateQuery) {
        Utils.checkNotNull(campaignMessageAssignTemplateQuery, "campaignMessageAssignTemplateQuery");
        this.campaignMessageAssignTemplateQuery = campaignMessageAssignTemplateQuery;
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
        AssignTemplateToCampaignMessageRequest other = (AssignTemplateToCampaignMessageRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.campaignMessageAssignTemplateQuery, other.campaignMessageAssignTemplateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            campaignMessageAssignTemplateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AssignTemplateToCampaignMessageRequest.class,
                "revision", revision,
                "campaignMessageAssignTemplateQuery", campaignMessageAssignTemplateQuery);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private CampaignMessageAssignTemplateQuery campaignMessageAssignTemplateQuery;  
        
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
         * Takes a reusable template, clones it, and assigns the non-reusable clone to the message.
         */
        public Builder campaignMessageAssignTemplateQuery(CampaignMessageAssignTemplateQuery campaignMessageAssignTemplateQuery) {
            Utils.checkNotNull(campaignMessageAssignTemplateQuery, "campaignMessageAssignTemplateQuery");
            this.campaignMessageAssignTemplateQuery = campaignMessageAssignTemplateQuery;
            return this;
        }
        
        public AssignTemplateToCampaignMessageRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new AssignTemplateToCampaignMessageRequest(
                revision,
                campaignMessageAssignTemplateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

