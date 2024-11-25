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


public class CatalogVariantCreateQueryResourceObject {

    @JsonProperty("type")
    private CatalogVariantEnum type;

    @JsonProperty("attributes")
    private CatalogVariantCreateQueryResourceObjectAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends CatalogVariantCreateQueryResourceObjectRelationships> relationships;

    @JsonCreator
    public CatalogVariantCreateQueryResourceObject(
            @JsonProperty("type") CatalogVariantEnum type,
            @JsonProperty("attributes") CatalogVariantCreateQueryResourceObjectAttributes attributes,
            @JsonProperty("relationships") Optional<? extends CatalogVariantCreateQueryResourceObjectRelationships> relationships) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(relationships, "relationships");
        this.type = type;
        this.attributes = attributes;
        this.relationships = relationships;
    }
    
    public CatalogVariantCreateQueryResourceObject(
            CatalogVariantEnum type,
            CatalogVariantCreateQueryResourceObjectAttributes attributes) {
        this(type, attributes, Optional.empty());
    }

    @JsonIgnore
    public CatalogVariantEnum type() {
        return type;
    }

    @JsonIgnore
    public CatalogVariantCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CatalogVariantCreateQueryResourceObjectRelationships> relationships() {
        return (Optional<CatalogVariantCreateQueryResourceObjectRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CatalogVariantCreateQueryResourceObject withType(CatalogVariantEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CatalogVariantCreateQueryResourceObject withAttributes(CatalogVariantCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public CatalogVariantCreateQueryResourceObject withRelationships(CatalogVariantCreateQueryResourceObjectRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public CatalogVariantCreateQueryResourceObject withRelationships(Optional<? extends CatalogVariantCreateQueryResourceObjectRelationships> relationships) {
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
        CatalogVariantCreateQueryResourceObject other = (CatalogVariantCreateQueryResourceObject) o;
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
        return Utils.toString(CatalogVariantCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private CatalogVariantEnum type;
 
        private CatalogVariantCreateQueryResourceObjectAttributes attributes;
 
        private Optional<? extends CatalogVariantCreateQueryResourceObjectRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CatalogVariantEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(CatalogVariantCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(CatalogVariantCreateQueryResourceObjectRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends CatalogVariantCreateQueryResourceObjectRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public CatalogVariantCreateQueryResourceObject build() {
            return new CatalogVariantCreateQueryResourceObject(
                type,
                attributes,
                relationships);
        }
    }
}
