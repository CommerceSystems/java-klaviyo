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


public class GetCatalogVariantDeleteJobResponseCollectionData {

    @JsonProperty("type")
    private CatalogVariantBulkDeleteJobEnum type;

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private GetCatalogVariantDeleteJobResponseCollectionAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends GetCatalogVariantDeleteJobResponseCollectionRelationships> relationships;

    @JsonCreator
    public GetCatalogVariantDeleteJobResponseCollectionData(
            @JsonProperty("type") CatalogVariantBulkDeleteJobEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") GetCatalogVariantDeleteJobResponseCollectionAttributes attributes,
            @JsonProperty("links") ObjectLinks links,
            @JsonProperty("relationships") Optional<? extends GetCatalogVariantDeleteJobResponseCollectionRelationships> relationships) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(links, "links");
        Utils.checkNotNull(relationships, "relationships");
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.links = links;
        this.relationships = relationships;
    }
    
    public GetCatalogVariantDeleteJobResponseCollectionData(
            CatalogVariantBulkDeleteJobEnum type,
            String id,
            GetCatalogVariantDeleteJobResponseCollectionAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, links, Optional.empty());
    }

    @JsonIgnore
    public CatalogVariantBulkDeleteJobEnum type() {
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
    public GetCatalogVariantDeleteJobResponseCollectionAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCatalogVariantDeleteJobResponseCollectionRelationships> relationships() {
        return (Optional<GetCatalogVariantDeleteJobResponseCollectionRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCatalogVariantDeleteJobResponseCollectionData withType(CatalogVariantBulkDeleteJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    public GetCatalogVariantDeleteJobResponseCollectionData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetCatalogVariantDeleteJobResponseCollectionData withAttributes(GetCatalogVariantDeleteJobResponseCollectionAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public GetCatalogVariantDeleteJobResponseCollectionData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    public GetCatalogVariantDeleteJobResponseCollectionData withRelationships(GetCatalogVariantDeleteJobResponseCollectionRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public GetCatalogVariantDeleteJobResponseCollectionData withRelationships(Optional<? extends GetCatalogVariantDeleteJobResponseCollectionRelationships> relationships) {
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
        GetCatalogVariantDeleteJobResponseCollectionData other = (GetCatalogVariantDeleteJobResponseCollectionData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.attributes, other.attributes) &&
            Objects.deepEquals(this.links, other.links) &&
            Objects.deepEquals(this.relationships, other.relationships);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id,
            attributes,
            links,
            relationships);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCatalogVariantDeleteJobResponseCollectionData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private CatalogVariantBulkDeleteJobEnum type;
 
        private String id;
 
        private GetCatalogVariantDeleteJobResponseCollectionAttributes attributes;
 
        private ObjectLinks links;
 
        private Optional<? extends GetCatalogVariantDeleteJobResponseCollectionRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CatalogVariantBulkDeleteJobEnum type) {
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

        public Builder attributes(GetCatalogVariantDeleteJobResponseCollectionAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        public Builder relationships(GetCatalogVariantDeleteJobResponseCollectionRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends GetCatalogVariantDeleteJobResponseCollectionRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public GetCatalogVariantDeleteJobResponseCollectionData build() {
            return new GetCatalogVariantDeleteJobResponseCollectionData(
                type,
                id,
                attributes,
                links,
                relationships);
        }
    }
}

