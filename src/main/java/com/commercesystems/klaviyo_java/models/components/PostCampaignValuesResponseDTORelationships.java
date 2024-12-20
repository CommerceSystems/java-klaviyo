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


public class PostCampaignValuesResponseDTORelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("campaigns")
    private Optional<? extends PostCampaignValuesResponseDTOCampaigns> campaigns;

    @JsonCreator
    public PostCampaignValuesResponseDTORelationships(
            @JsonProperty("campaigns") Optional<? extends PostCampaignValuesResponseDTOCampaigns> campaigns) {
        Utils.checkNotNull(campaigns, "campaigns");
        this.campaigns = campaigns;
    }
    
    public PostCampaignValuesResponseDTORelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostCampaignValuesResponseDTOCampaigns> campaigns() {
        return (Optional<PostCampaignValuesResponseDTOCampaigns>) campaigns;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostCampaignValuesResponseDTORelationships withCampaigns(PostCampaignValuesResponseDTOCampaigns campaigns) {
        Utils.checkNotNull(campaigns, "campaigns");
        this.campaigns = Optional.ofNullable(campaigns);
        return this;
    }

    public PostCampaignValuesResponseDTORelationships withCampaigns(Optional<? extends PostCampaignValuesResponseDTOCampaigns> campaigns) {
        Utils.checkNotNull(campaigns, "campaigns");
        this.campaigns = campaigns;
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
        PostCampaignValuesResponseDTORelationships other = (PostCampaignValuesResponseDTORelationships) o;
        return 
            Objects.deepEquals(this.campaigns, other.campaigns);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            campaigns);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostCampaignValuesResponseDTORelationships.class,
                "campaigns", campaigns);
    }
    
    public final static class Builder {
 
        private Optional<? extends PostCampaignValuesResponseDTOCampaigns> campaigns = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder campaigns(PostCampaignValuesResponseDTOCampaigns campaigns) {
            Utils.checkNotNull(campaigns, "campaigns");
            this.campaigns = Optional.ofNullable(campaigns);
            return this;
        }

        public Builder campaigns(Optional<? extends PostCampaignValuesResponseDTOCampaigns> campaigns) {
            Utils.checkNotNull(campaigns, "campaigns");
            this.campaigns = campaigns;
            return this;
        }
        
        public PostCampaignValuesResponseDTORelationships build() {
            return new PostCampaignValuesResponseDTORelationships(
                campaigns);
        }
    }
}

