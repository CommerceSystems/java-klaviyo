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


public class PostWebhookResponseData {

    @JsonProperty("type")
    private WebhookEnum type;

    /**
     * The ID of the webhook.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private PostWebhookResponseAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends PostWebhookResponseRelationships> relationships;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonCreator
    public PostWebhookResponseData(
            @JsonProperty("type") WebhookEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") PostWebhookResponseAttributes attributes,
            @JsonProperty("relationships") Optional<? extends PostWebhookResponseRelationships> relationships,
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
    
    public PostWebhookResponseData(
            WebhookEnum type,
            String id,
            PostWebhookResponseAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, Optional.empty(), links);
    }

    @JsonIgnore
    public WebhookEnum type() {
        return type;
    }

    /**
     * The ID of the webhook.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public PostWebhookResponseAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostWebhookResponseRelationships> relationships() {
        return (Optional<PostWebhookResponseRelationships>) relationships;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostWebhookResponseData withType(WebhookEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The ID of the webhook.
     */
    public PostWebhookResponseData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public PostWebhookResponseData withAttributes(PostWebhookResponseAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public PostWebhookResponseData withRelationships(PostWebhookResponseRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public PostWebhookResponseData withRelationships(Optional<? extends PostWebhookResponseRelationships> relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = relationships;
        return this;
    }

    public PostWebhookResponseData withLinks(ObjectLinks links) {
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
        PostWebhookResponseData other = (PostWebhookResponseData) o;
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
        return Utils.toString(PostWebhookResponseData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "relationships", relationships,
                "links", links);
    }
    
    public final static class Builder {
 
        private WebhookEnum type;
 
        private String id;
 
        private PostWebhookResponseAttributes attributes;
 
        private Optional<? extends PostWebhookResponseRelationships> relationships = Optional.empty();
 
        private ObjectLinks links;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(WebhookEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The ID of the webhook.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(PostWebhookResponseAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(PostWebhookResponseRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends PostWebhookResponseRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public PostWebhookResponseData build() {
            return new PostWebhookResponseData(
                type,
                id,
                attributes,
                relationships,
                links);
        }
    }
}

