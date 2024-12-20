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


public class GetCampaignMessageResponseCollectionCompoundDocumentRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("campaign")
    private Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentCampaign> campaign;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("template")
    private Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentTemplate> template;

    @JsonCreator
    public GetCampaignMessageResponseCollectionCompoundDocumentRelationships(
            @JsonProperty("campaign") Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentCampaign> campaign,
            @JsonProperty("template") Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentTemplate> template) {
        Utils.checkNotNull(campaign, "campaign");
        Utils.checkNotNull(template, "template");
        this.campaign = campaign;
        this.template = template;
    }
    
    public GetCampaignMessageResponseCollectionCompoundDocumentRelationships() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCampaignMessageResponseCollectionCompoundDocumentCampaign> campaign() {
        return (Optional<GetCampaignMessageResponseCollectionCompoundDocumentCampaign>) campaign;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCampaignMessageResponseCollectionCompoundDocumentTemplate> template() {
        return (Optional<GetCampaignMessageResponseCollectionCompoundDocumentTemplate>) template;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCampaignMessageResponseCollectionCompoundDocumentRelationships withCampaign(GetCampaignMessageResponseCollectionCompoundDocumentCampaign campaign) {
        Utils.checkNotNull(campaign, "campaign");
        this.campaign = Optional.ofNullable(campaign);
        return this;
    }

    public GetCampaignMessageResponseCollectionCompoundDocumentRelationships withCampaign(Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentCampaign> campaign) {
        Utils.checkNotNull(campaign, "campaign");
        this.campaign = campaign;
        return this;
    }

    public GetCampaignMessageResponseCollectionCompoundDocumentRelationships withTemplate(GetCampaignMessageResponseCollectionCompoundDocumentTemplate template) {
        Utils.checkNotNull(template, "template");
        this.template = Optional.ofNullable(template);
        return this;
    }

    public GetCampaignMessageResponseCollectionCompoundDocumentRelationships withTemplate(Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentTemplate> template) {
        Utils.checkNotNull(template, "template");
        this.template = template;
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
        GetCampaignMessageResponseCollectionCompoundDocumentRelationships other = (GetCampaignMessageResponseCollectionCompoundDocumentRelationships) o;
        return 
            Objects.deepEquals(this.campaign, other.campaign) &&
            Objects.deepEquals(this.template, other.template);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            campaign,
            template);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCampaignMessageResponseCollectionCompoundDocumentRelationships.class,
                "campaign", campaign,
                "template", template);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentCampaign> campaign = Optional.empty();
 
        private Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentTemplate> template = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder campaign(GetCampaignMessageResponseCollectionCompoundDocumentCampaign campaign) {
            Utils.checkNotNull(campaign, "campaign");
            this.campaign = Optional.ofNullable(campaign);
            return this;
        }

        public Builder campaign(Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentCampaign> campaign) {
            Utils.checkNotNull(campaign, "campaign");
            this.campaign = campaign;
            return this;
        }

        public Builder template(GetCampaignMessageResponseCollectionCompoundDocumentTemplate template) {
            Utils.checkNotNull(template, "template");
            this.template = Optional.ofNullable(template);
            return this;
        }

        public Builder template(Optional<? extends GetCampaignMessageResponseCollectionCompoundDocumentTemplate> template) {
            Utils.checkNotNull(template, "template");
            this.template = template;
            return this;
        }
        
        public GetCampaignMessageResponseCollectionCompoundDocumentRelationships build() {
            return new GetCampaignMessageResponseCollectionCompoundDocumentRelationships(
                campaign,
                template);
        }
    }
}

