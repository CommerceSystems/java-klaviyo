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


public class GetCatalogVariantCreateJobResponseCompoundDocumentData {

    @JsonProperty("type")
    private CatalogVariantBulkCreateJobEnum type;

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private GetCatalogVariantCreateJobResponseCompoundDocumentAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends GetCatalogVariantCreateJobResponseCompoundDocumentRelationships> relationships;

    @JsonCreator
    public GetCatalogVariantCreateJobResponseCompoundDocumentData(
            @JsonProperty("type") CatalogVariantBulkCreateJobEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") GetCatalogVariantCreateJobResponseCompoundDocumentAttributes attributes,
            @JsonProperty("links") ObjectLinks links,
            @JsonProperty("relationships") Optional<? extends GetCatalogVariantCreateJobResponseCompoundDocumentRelationships> relationships) {
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
    
    public GetCatalogVariantCreateJobResponseCompoundDocumentData(
            CatalogVariantBulkCreateJobEnum type,
            String id,
            GetCatalogVariantCreateJobResponseCompoundDocumentAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, links, Optional.empty());
    }

    @JsonIgnore
    public CatalogVariantBulkCreateJobEnum type() {
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
    public GetCatalogVariantCreateJobResponseCompoundDocumentAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCatalogVariantCreateJobResponseCompoundDocumentRelationships> relationships() {
        return (Optional<GetCatalogVariantCreateJobResponseCompoundDocumentRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCatalogVariantCreateJobResponseCompoundDocumentData withType(CatalogVariantBulkCreateJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    public GetCatalogVariantCreateJobResponseCompoundDocumentData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetCatalogVariantCreateJobResponseCompoundDocumentData withAttributes(GetCatalogVariantCreateJobResponseCompoundDocumentAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public GetCatalogVariantCreateJobResponseCompoundDocumentData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    public GetCatalogVariantCreateJobResponseCompoundDocumentData withRelationships(GetCatalogVariantCreateJobResponseCompoundDocumentRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public GetCatalogVariantCreateJobResponseCompoundDocumentData withRelationships(Optional<? extends GetCatalogVariantCreateJobResponseCompoundDocumentRelationships> relationships) {
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
        GetCatalogVariantCreateJobResponseCompoundDocumentData other = (GetCatalogVariantCreateJobResponseCompoundDocumentData) o;
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
        return Utils.toString(GetCatalogVariantCreateJobResponseCompoundDocumentData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private CatalogVariantBulkCreateJobEnum type;
 
        private String id;
 
        private GetCatalogVariantCreateJobResponseCompoundDocumentAttributes attributes;
 
        private ObjectLinks links;
 
        private Optional<? extends GetCatalogVariantCreateJobResponseCompoundDocumentRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CatalogVariantBulkCreateJobEnum type) {
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

        public Builder attributes(GetCatalogVariantCreateJobResponseCompoundDocumentAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        public Builder relationships(GetCatalogVariantCreateJobResponseCompoundDocumentRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends GetCatalogVariantCreateJobResponseCompoundDocumentRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public GetCatalogVariantCreateJobResponseCompoundDocumentData build() {
            return new GetCatalogVariantCreateJobResponseCompoundDocumentData(
                type,
                id,
                attributes,
                links,
                relationships);
        }
    }
}

