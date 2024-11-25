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


public class PostCampaignValuesResponseDTOData {

    @JsonProperty("type")
    private CampaignValuesReportEnum type;

    @JsonProperty("attributes")
    private PostCampaignValuesResponseDTOAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends PostCampaignValuesResponseDTORelationships> relationships;

    @JsonCreator
    public PostCampaignValuesResponseDTOData(
            @JsonProperty("type") CampaignValuesReportEnum type,
            @JsonProperty("attributes") PostCampaignValuesResponseDTOAttributes attributes,
            @JsonProperty("relationships") Optional<? extends PostCampaignValuesResponseDTORelationships> relationships) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(relationships, "relationships");
        this.type = type;
        this.attributes = attributes;
        this.relationships = relationships;
    }
    
    public PostCampaignValuesResponseDTOData(
            CampaignValuesReportEnum type,
            PostCampaignValuesResponseDTOAttributes attributes) {
        this(type, attributes, Optional.empty());
    }

    @JsonIgnore
    public CampaignValuesReportEnum type() {
        return type;
    }

    @JsonIgnore
    public PostCampaignValuesResponseDTOAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostCampaignValuesResponseDTORelationships> relationships() {
        return (Optional<PostCampaignValuesResponseDTORelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostCampaignValuesResponseDTOData withType(CampaignValuesReportEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PostCampaignValuesResponseDTOData withAttributes(PostCampaignValuesResponseDTOAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public PostCampaignValuesResponseDTOData withRelationships(PostCampaignValuesResponseDTORelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public PostCampaignValuesResponseDTOData withRelationships(Optional<? extends PostCampaignValuesResponseDTORelationships> relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = relationships;
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
        PostCampaignValuesResponseDTOData other = (PostCampaignValuesResponseDTOData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.attributes, other.attributes) &&
            Objects.deepEquals(this.relationships, other.relationships);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            attributes,
            relationships);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostCampaignValuesResponseDTOData.class,
                "type", type,
                "attributes", attributes,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private CampaignValuesReportEnum type;
 
        private PostCampaignValuesResponseDTOAttributes attributes;
 
        private Optional<? extends PostCampaignValuesResponseDTORelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CampaignValuesReportEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(PostCampaignValuesResponseDTOAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(PostCampaignValuesResponseDTORelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends PostCampaignValuesResponseDTORelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public PostCampaignValuesResponseDTOData build() {
            return new PostCampaignValuesResponseDTOData(
                type,
                attributes,
                relationships);
        }
    }
}

