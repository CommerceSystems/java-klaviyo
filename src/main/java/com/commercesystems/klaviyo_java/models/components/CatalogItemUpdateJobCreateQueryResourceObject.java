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


public class CatalogItemUpdateJobCreateQueryResourceObject {

    @JsonProperty("type")
    private CatalogItemBulkUpdateJobEnum type;

    @JsonProperty("attributes")
    private CatalogItemUpdateJobCreateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public CatalogItemUpdateJobCreateQueryResourceObject(
            @JsonProperty("type") CatalogItemBulkUpdateJobEnum type,
            @JsonProperty("attributes") CatalogItemUpdateJobCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public CatalogItemBulkUpdateJobEnum type() {
        return type;
    }

    @JsonIgnore
    public CatalogItemUpdateJobCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CatalogItemUpdateJobCreateQueryResourceObject withType(CatalogItemBulkUpdateJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CatalogItemUpdateJobCreateQueryResourceObject withAttributes(CatalogItemUpdateJobCreateQueryResourceObjectAttributes attributes) {
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
        CatalogItemUpdateJobCreateQueryResourceObject other = (CatalogItemUpdateJobCreateQueryResourceObject) o;
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
        return Utils.toString(CatalogItemUpdateJobCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private CatalogItemBulkUpdateJobEnum type;
 
        private CatalogItemUpdateJobCreateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CatalogItemBulkUpdateJobEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(CatalogItemUpdateJobCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public CatalogItemUpdateJobCreateQueryResourceObject build() {
            return new CatalogItemUpdateJobCreateQueryResourceObject(
                type,
                attributes);
        }
    }
}

