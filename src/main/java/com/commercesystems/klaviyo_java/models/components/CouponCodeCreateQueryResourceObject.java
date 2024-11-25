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


public class CouponCodeCreateQueryResourceObject {

    @JsonProperty("type")
    private CouponCodeEnum type;

    @JsonProperty("attributes")
    private CouponCodeCreateQueryResourceObjectAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends CouponCodeCreateQueryResourceObjectRelationships> relationships;

    @JsonCreator
    public CouponCodeCreateQueryResourceObject(
            @JsonProperty("type") CouponCodeEnum type,
            @JsonProperty("attributes") CouponCodeCreateQueryResourceObjectAttributes attributes,
            @JsonProperty("relationships") Optional<? extends CouponCodeCreateQueryResourceObjectRelationships> relationships) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(relationships, "relationships");
        this.type = type;
        this.attributes = attributes;
        this.relationships = relationships;
    }
    
    public CouponCodeCreateQueryResourceObject(
            CouponCodeEnum type,
            CouponCodeCreateQueryResourceObjectAttributes attributes) {
        this(type, attributes, Optional.empty());
    }

    @JsonIgnore
    public CouponCodeEnum type() {
        return type;
    }

    @JsonIgnore
    public CouponCodeCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CouponCodeCreateQueryResourceObjectRelationships> relationships() {
        return (Optional<CouponCodeCreateQueryResourceObjectRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CouponCodeCreateQueryResourceObject withType(CouponCodeEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CouponCodeCreateQueryResourceObject withAttributes(CouponCodeCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public CouponCodeCreateQueryResourceObject withRelationships(CouponCodeCreateQueryResourceObjectRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public CouponCodeCreateQueryResourceObject withRelationships(Optional<? extends CouponCodeCreateQueryResourceObjectRelationships> relationships) {
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
        CouponCodeCreateQueryResourceObject other = (CouponCodeCreateQueryResourceObject) o;
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
        return Utils.toString(CouponCodeCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private CouponCodeEnum type;
 
        private CouponCodeCreateQueryResourceObjectAttributes attributes;
 
        private Optional<? extends CouponCodeCreateQueryResourceObjectRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CouponCodeEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(CouponCodeCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(CouponCodeCreateQueryResourceObjectRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends CouponCodeCreateQueryResourceObjectRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public CouponCodeCreateQueryResourceObject build() {
            return new CouponCodeCreateQueryResourceObject(
                type,
                attributes,
                relationships);
        }
    }
}
