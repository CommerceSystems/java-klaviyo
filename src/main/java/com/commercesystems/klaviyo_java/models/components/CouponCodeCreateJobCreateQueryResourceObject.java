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


public class CouponCodeCreateJobCreateQueryResourceObject {

    @JsonProperty("type")
    private CouponCodeBulkCreateJobEnum type;

    @JsonProperty("attributes")
    private CouponCodeCreateJobCreateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public CouponCodeCreateJobCreateQueryResourceObject(
            @JsonProperty("type") CouponCodeBulkCreateJobEnum type,
            @JsonProperty("attributes") CouponCodeCreateJobCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public CouponCodeBulkCreateJobEnum type() {
        return type;
    }

    @JsonIgnore
    public CouponCodeCreateJobCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CouponCodeCreateJobCreateQueryResourceObject withType(CouponCodeBulkCreateJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CouponCodeCreateJobCreateQueryResourceObject withAttributes(CouponCodeCreateJobCreateQueryResourceObjectAttributes attributes) {
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
        CouponCodeCreateJobCreateQueryResourceObject other = (CouponCodeCreateJobCreateQueryResourceObject) o;
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
        return Utils.toString(CouponCodeCreateJobCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private CouponCodeBulkCreateJobEnum type;
 
        private CouponCodeCreateJobCreateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CouponCodeBulkCreateJobEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(CouponCodeCreateJobCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public CouponCodeCreateJobCreateQueryResourceObject build() {
            return new CouponCodeCreateJobCreateQueryResourceObject(
                type,
                attributes);
        }
    }
}

