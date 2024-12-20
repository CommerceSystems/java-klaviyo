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


public class SuppressionCreateJobCreateQueryResourceObject {

    @JsonProperty("type")
    private ProfileSuppressionBulkCreateJobEnum type;

    @JsonProperty("attributes")
    private SuppressionCreateJobCreateQueryResourceObjectAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends SuppressionCreateJobCreateQueryResourceObjectRelationships> relationships;

    @JsonCreator
    public SuppressionCreateJobCreateQueryResourceObject(
            @JsonProperty("type") ProfileSuppressionBulkCreateJobEnum type,
            @JsonProperty("attributes") SuppressionCreateJobCreateQueryResourceObjectAttributes attributes,
            @JsonProperty("relationships") Optional<? extends SuppressionCreateJobCreateQueryResourceObjectRelationships> relationships) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(relationships, "relationships");
        this.type = type;
        this.attributes = attributes;
        this.relationships = relationships;
    }
    
    public SuppressionCreateJobCreateQueryResourceObject(
            ProfileSuppressionBulkCreateJobEnum type,
            SuppressionCreateJobCreateQueryResourceObjectAttributes attributes) {
        this(type, attributes, Optional.empty());
    }

    @JsonIgnore
    public ProfileSuppressionBulkCreateJobEnum type() {
        return type;
    }

    @JsonIgnore
    public SuppressionCreateJobCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SuppressionCreateJobCreateQueryResourceObjectRelationships> relationships() {
        return (Optional<SuppressionCreateJobCreateQueryResourceObjectRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SuppressionCreateJobCreateQueryResourceObject withType(ProfileSuppressionBulkCreateJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public SuppressionCreateJobCreateQueryResourceObject withAttributes(SuppressionCreateJobCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public SuppressionCreateJobCreateQueryResourceObject withRelationships(SuppressionCreateJobCreateQueryResourceObjectRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public SuppressionCreateJobCreateQueryResourceObject withRelationships(Optional<? extends SuppressionCreateJobCreateQueryResourceObjectRelationships> relationships) {
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
        SuppressionCreateJobCreateQueryResourceObject other = (SuppressionCreateJobCreateQueryResourceObject) o;
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
        return Utils.toString(SuppressionCreateJobCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private ProfileSuppressionBulkCreateJobEnum type;
 
        private SuppressionCreateJobCreateQueryResourceObjectAttributes attributes;
 
        private Optional<? extends SuppressionCreateJobCreateQueryResourceObjectRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ProfileSuppressionBulkCreateJobEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(SuppressionCreateJobCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(SuppressionCreateJobCreateQueryResourceObjectRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends SuppressionCreateJobCreateQueryResourceObjectRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public SuppressionCreateJobCreateQueryResourceObject build() {
            return new SuppressionCreateJobCreateQueryResourceObject(
                type,
                attributes,
                relationships);
        }
    }
}

