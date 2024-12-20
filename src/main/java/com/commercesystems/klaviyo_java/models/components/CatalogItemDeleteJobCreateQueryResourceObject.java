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


public class CatalogItemDeleteJobCreateQueryResourceObject {

    @JsonProperty("type")
    private CatalogItemBulkDeleteJobEnum type;

    @JsonProperty("attributes")
    private CatalogItemDeleteJobCreateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public CatalogItemDeleteJobCreateQueryResourceObject(
            @JsonProperty("type") CatalogItemBulkDeleteJobEnum type,
            @JsonProperty("attributes") CatalogItemDeleteJobCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public CatalogItemBulkDeleteJobEnum type() {
        return type;
    }

    @JsonIgnore
    public CatalogItemDeleteJobCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CatalogItemDeleteJobCreateQueryResourceObject withType(CatalogItemBulkDeleteJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CatalogItemDeleteJobCreateQueryResourceObject withAttributes(CatalogItemDeleteJobCreateQueryResourceObjectAttributes attributes) {
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
        CatalogItemDeleteJobCreateQueryResourceObject other = (CatalogItemDeleteJobCreateQueryResourceObject) o;
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
        return Utils.toString(CatalogItemDeleteJobCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private CatalogItemBulkDeleteJobEnum type;
 
        private CatalogItemDeleteJobCreateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CatalogItemBulkDeleteJobEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(CatalogItemDeleteJobCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public CatalogItemDeleteJobCreateQueryResourceObject build() {
            return new CatalogItemDeleteJobCreateQueryResourceObject(
                type,
                attributes);
        }
    }
}

