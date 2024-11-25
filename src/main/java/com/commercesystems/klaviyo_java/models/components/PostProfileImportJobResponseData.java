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


public class PostProfileImportJobResponseData {

    @JsonProperty("type")
    private ProfileBulkImportJobEnum type;

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private PostProfileImportJobResponseAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends PostProfileImportJobResponseRelationships> relationships;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonCreator
    public PostProfileImportJobResponseData(
            @JsonProperty("type") ProfileBulkImportJobEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") PostProfileImportJobResponseAttributes attributes,
            @JsonProperty("relationships") Optional<? extends PostProfileImportJobResponseRelationships> relationships,
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
    
    public PostProfileImportJobResponseData(
            ProfileBulkImportJobEnum type,
            String id,
            PostProfileImportJobResponseAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, Optional.empty(), links);
    }

    @JsonIgnore
    public ProfileBulkImportJobEnum type() {
        return type;
    }

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public PostProfileImportJobResponseAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostProfileImportJobResponseRelationships> relationships() {
        return (Optional<PostProfileImportJobResponseRelationships>) relationships;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostProfileImportJobResponseData withType(ProfileBulkImportJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    public PostProfileImportJobResponseData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public PostProfileImportJobResponseData withAttributes(PostProfileImportJobResponseAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public PostProfileImportJobResponseData withRelationships(PostProfileImportJobResponseRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public PostProfileImportJobResponseData withRelationships(Optional<? extends PostProfileImportJobResponseRelationships> relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = relationships;
        return this;
    }

    public PostProfileImportJobResponseData withLinks(ObjectLinks links) {
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
        PostProfileImportJobResponseData other = (PostProfileImportJobResponseData) o;
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
        return Utils.toString(PostProfileImportJobResponseData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "relationships", relationships,
                "links", links);
    }
    
    public final static class Builder {
 
        private ProfileBulkImportJobEnum type;
 
        private String id;
 
        private PostProfileImportJobResponseAttributes attributes;
 
        private Optional<? extends PostProfileImportJobResponseRelationships> relationships = Optional.empty();
 
        private ObjectLinks links;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ProfileBulkImportJobEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Unique identifier for retrieving the job. Generated by Klaviyo.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(PostProfileImportJobResponseAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(PostProfileImportJobResponseRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends PostProfileImportJobResponseRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public PostProfileImportJobResponseData build() {
            return new PostProfileImportJobResponseData(
                type,
                id,
                attributes,
                relationships,
                links);
        }
    }
}
