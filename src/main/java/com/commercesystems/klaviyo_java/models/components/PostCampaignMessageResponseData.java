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


public class PostCampaignMessageResponseData {

    @JsonProperty("type")
    private CampaignMessageEnum type;

    /**
     * The message ID
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private PostCampaignMessageResponseAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends PostCampaignMessageResponseRelationships> relationships;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonCreator
    public PostCampaignMessageResponseData(
            @JsonProperty("type") CampaignMessageEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") PostCampaignMessageResponseAttributes attributes,
            @JsonProperty("relationships") Optional<? extends PostCampaignMessageResponseRelationships> relationships,
            @JsonProperty("links") ObjectLinks links) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(relationships, "relationships");
        Utils.checkNotNull(links, "links");
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.relationships = relationships;
        this.links = links;
    }
    
    public PostCampaignMessageResponseData(
            CampaignMessageEnum type,
            String id,
            PostCampaignMessageResponseAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, Optional.empty(), links);
    }

    @JsonIgnore
    public CampaignMessageEnum type() {
        return type;
    }

    /**
     * The message ID
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public PostCampaignMessageResponseAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostCampaignMessageResponseRelationships> relationships() {
        return (Optional<PostCampaignMessageResponseRelationships>) relationships;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostCampaignMessageResponseData withType(CampaignMessageEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The message ID
     */
    public PostCampaignMessageResponseData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public PostCampaignMessageResponseData withAttributes(PostCampaignMessageResponseAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public PostCampaignMessageResponseData withRelationships(PostCampaignMessageResponseRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public PostCampaignMessageResponseData withRelationships(Optional<? extends PostCampaignMessageResponseRelationships> relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = relationships;
        return this;
    }

    public PostCampaignMessageResponseData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
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
        PostCampaignMessageResponseData other = (PostCampaignMessageResponseData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.attributes, other.attributes) &&
            Objects.deepEquals(this.relationships, other.relationships) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id,
            attributes,
            relationships,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostCampaignMessageResponseData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "relationships", relationships,
                "links", links);
    }
    
    public final static class Builder {
 
        private CampaignMessageEnum type;
 
        private String id;
 
        private PostCampaignMessageResponseAttributes attributes;
 
        private Optional<? extends PostCampaignMessageResponseRelationships> relationships = Optional.empty();
 
        private ObjectLinks links;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CampaignMessageEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The message ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(PostCampaignMessageResponseAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(PostCampaignMessageResponseRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends PostCampaignMessageResponseRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public PostCampaignMessageResponseData build() {
            return new PostCampaignMessageResponseData(
                type,
                id,
                attributes,
                relationships,
                links);
        }
    }
}

