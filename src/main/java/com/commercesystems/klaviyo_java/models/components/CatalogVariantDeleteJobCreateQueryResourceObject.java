/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CatalogVariantDeleteJobCreateQueryResourceObject {

    @JsonProperty("type")
    private CatalogVariantBulkDeleteJobEnum type;

    @JsonProperty("attributes")
    private CatalogVariantDeleteJobCreateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public CatalogVariantDeleteJobCreateQueryResourceObject(
            @JsonProperty("type") CatalogVariantBulkDeleteJobEnum type,
            @JsonProperty("attributes") CatalogVariantDeleteJobCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public CatalogVariantBulkDeleteJobEnum type() {
        return type;
    }

    @JsonIgnore
    public CatalogVariantDeleteJobCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CatalogVariantDeleteJobCreateQueryResourceObject withType(CatalogVariantBulkDeleteJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CatalogVariantDeleteJobCreateQueryResourceObject withAttributes(CatalogVariantDeleteJobCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
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
        CatalogVariantDeleteJobCreateQueryResourceObject other = (CatalogVariantDeleteJobCreateQueryResourceObject) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.attributes, other.attributes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            attributes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CatalogVariantDeleteJobCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private CatalogVariantBulkDeleteJobEnum type;
 
        private CatalogVariantDeleteJobCreateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CatalogVariantBulkDeleteJobEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(CatalogVariantDeleteJobCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public CatalogVariantDeleteJobCreateQueryResourceObject build() {
            return new CatalogVariantDeleteJobCreateQueryResourceObject(
                type,
                attributes);
        }
    }
}

