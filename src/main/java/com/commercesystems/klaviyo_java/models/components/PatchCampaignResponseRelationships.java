/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class PatchCampaignResponseRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("campaign-messages")
    private Optional<? extends PatchCampaignResponseCampaignMessages> campaignMessages;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends PatchCampaignResponseTags> tags;

    @JsonCreator
    public PatchCampaignResponseRelationships(
            @JsonProperty("campaign-messages") Optional<? extends PatchCampaignResponseCampaignMessages> campaignMessages,
            @JsonProperty("tags") Optional<? extends PatchCampaignResponseTags> tags) {
        Utils.checkNotNull(campaignMessages, "campaignMessages");
        Utils.checkNotNull(tags, "tags");
        this.campaignMessages = campaignMessages;
        this.tags = tags;
    }
    
    public PatchCampaignResponseRelationships() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PatchCampaignResponseCampaignMessages> campaignMessages() {
        return (Optional<PatchCampaignResponseCampaignMessages>) campaignMessages;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PatchCampaignResponseTags> tags() {
        return (Optional<PatchCampaignResponseTags>) tags;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchCampaignResponseRelationships withCampaignMessages(PatchCampaignResponseCampaignMessages campaignMessages) {
        Utils.checkNotNull(campaignMessages, "campaignMessages");
        this.campaignMessages = Optional.ofNullable(campaignMessages);
        return this;
    }

    public PatchCampaignResponseRelationships withCampaignMessages(Optional<? extends PatchCampaignResponseCampaignMessages> campaignMessages) {
        Utils.checkNotNull(campaignMessages, "campaignMessages");
        this.campaignMessages = campaignMessages;
        return this;
    }

    public PatchCampaignResponseRelationships withTags(PatchCampaignResponseTags tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public PatchCampaignResponseRelationships withTags(Optional<? extends PatchCampaignResponseTags> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
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
        PatchCampaignResponseRelationships other = (PatchCampaignResponseRelationships) o;
        return 
            Objects.deepEquals(this.campaignMessages, other.campaignMessages) &&
            Objects.deepEquals(this.tags, other.tags);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            campaignMessages,
            tags);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchCampaignResponseRelationships.class,
                "campaignMessages", campaignMessages,
                "tags", tags);
    }
    
    public final static class Builder {
 
        private Optional<? extends PatchCampaignResponseCampaignMessages> campaignMessages = Optional.empty();
 
        private Optional<? extends PatchCampaignResponseTags> tags = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder campaignMessages(PatchCampaignResponseCampaignMessages campaignMessages) {
            Utils.checkNotNull(campaignMessages, "campaignMessages");
            this.campaignMessages = Optional.ofNullable(campaignMessages);
            return this;
        }

        public Builder campaignMessages(Optional<? extends PatchCampaignResponseCampaignMessages> campaignMessages) {
            Utils.checkNotNull(campaignMessages, "campaignMessages");
            this.campaignMessages = campaignMessages;
            return this;
        }

        public Builder tags(PatchCampaignResponseTags tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends PatchCampaignResponseTags> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }
        
        public PatchCampaignResponseRelationships build() {
            return new PatchCampaignResponseRelationships(
                campaignMessages,
                tags);
        }
    }
}

