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


public class PostCatalogCategoryDeleteJobResponseData {

    @JsonProperty("type")
    private CatalogCategoryBulkDeleteJobEnum type;

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private PostCatalogCategoryDeleteJobResponseAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends PostCatalogCategoryDeleteJobResponseRelationships> relationships;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonCreator
    public PostCatalogCategoryDeleteJobResponseData(
            @JsonProperty("type") CatalogCategoryBulkDeleteJobEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") PostCatalogCategoryDeleteJobResponseAttributes attributes,
            @JsonProperty("relationships") Optional<? extends PostCatalogCategoryDeleteJobResponseRelationships> relationships,
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
    
    public PostCatalogCategoryDeleteJobResponseData(
            CatalogCategoryBulkDeleteJobEnum type,
            String id,
            PostCatalogCategoryDeleteJobResponseAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, Optional.empty(), links);
    }

    @JsonIgnore
    public CatalogCategoryBulkDeleteJobEnum type() {
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
    public PostCatalogCategoryDeleteJobResponseAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostCatalogCategoryDeleteJobResponseRelationships> relationships() {
        return (Optional<PostCatalogCategoryDeleteJobResponseRelationships>) relationships;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostCatalogCategoryDeleteJobResponseData withType(CatalogCategoryBulkDeleteJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    public PostCatalogCategoryDeleteJobResponseData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public PostCatalogCategoryDeleteJobResponseData withAttributes(PostCatalogCategoryDeleteJobResponseAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public PostCatalogCategoryDeleteJobResponseData withRelationships(PostCatalogCategoryDeleteJobResponseRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public PostCatalogCategoryDeleteJobResponseData withRelationships(Optional<? extends PostCatalogCategoryDeleteJobResponseRelationships> relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = relationships;
        return this;
    }

    public PostCatalogCategoryDeleteJobResponseData withLinks(ObjectLinks links) {
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
        PostCatalogCategoryDeleteJobResponseData other = (PostCatalogCategoryDeleteJobResponseData) o;
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
        return Utils.toString(PostCatalogCategoryDeleteJobResponseData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "relationships", relationships,
                "links", links);
    }
    
    public final static class Builder {
 
        private CatalogCategoryBulkDeleteJobEnum type;
 
        private String id;
 
        private PostCatalogCategoryDeleteJobResponseAttributes attributes;
 
        private Optional<? extends PostCatalogCategoryDeleteJobResponseRelationships> relationships = Optional.empty();
 
        private ObjectLinks links;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CatalogCategoryBulkDeleteJobEnum type) {
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

        public Builder attributes(PostCatalogCategoryDeleteJobResponseAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(PostCatalogCategoryDeleteJobResponseRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends PostCatalogCategoryDeleteJobResponseRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public PostCatalogCategoryDeleteJobResponseData build() {
            return new PostCatalogCategoryDeleteJobResponseData(
                type,
                id,
                attributes,
                relationships,
                links);
        }
    }
}

