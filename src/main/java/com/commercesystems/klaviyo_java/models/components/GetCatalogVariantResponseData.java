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


public class GetCatalogVariantResponseData {

    @JsonProperty("type")
    private CatalogVariantEnum type;

    /**
     * The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private GetCatalogVariantResponseAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends GetCatalogVariantResponseRelationships> relationships;

    @JsonCreator
    public GetCatalogVariantResponseData(
            @JsonProperty("type") CatalogVariantEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") GetCatalogVariantResponseAttributes attributes,
            @JsonProperty("links") ObjectLinks links,
            @JsonProperty("relationships") Optional<? extends GetCatalogVariantResponseRelationships> relationships) {
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
    
    public GetCatalogVariantResponseData(
            CatalogVariantEnum type,
            String id,
            GetCatalogVariantResponseAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, links, Optional.empty());
    }

    @JsonIgnore
    public CatalogVariantEnum type() {
        return type;
    }

    /**
     * The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public GetCatalogVariantResponseAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCatalogVariantResponseRelationships> relationships() {
        return (Optional<GetCatalogVariantResponseRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCatalogVariantResponseData withType(CatalogVariantEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
     */
    public GetCatalogVariantResponseData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetCatalogVariantResponseData withAttributes(GetCatalogVariantResponseAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public GetCatalogVariantResponseData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    public GetCatalogVariantResponseData withRelationships(GetCatalogVariantResponseRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public GetCatalogVariantResponseData withRelationships(Optional<? extends GetCatalogVariantResponseRelationships> relationships) {
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
        GetCatalogVariantResponseData other = (GetCatalogVariantResponseData) o;
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
        return Utils.toString(GetCatalogVariantResponseData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private CatalogVariantEnum type;
 
        private String id;
 
        private GetCatalogVariantResponseAttributes attributes;
 
        private ObjectLinks links;
 
        private Optional<? extends GetCatalogVariantResponseRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CatalogVariantEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(GetCatalogVariantResponseAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        public Builder relationships(GetCatalogVariantResponseRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends GetCatalogVariantResponseRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public GetCatalogVariantResponseData build() {
            return new GetCatalogVariantResponseData(
                type,
                id,
                attributes,
                links,
                relationships);
        }
    }
}
