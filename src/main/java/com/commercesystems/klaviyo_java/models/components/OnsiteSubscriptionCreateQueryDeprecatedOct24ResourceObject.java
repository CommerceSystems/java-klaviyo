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


public class OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject {

    @JsonProperty("type")
    private SubscriptionEnum type;

    @JsonProperty("attributes")
    private OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships> relationships;

    @JsonCreator
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject(
            @JsonProperty("type") SubscriptionEnum type,
            @JsonProperty("attributes") OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes attributes,
            @JsonProperty("relationships") Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships> relationships) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(relationships, "relationships");
        this.type = type;
        this.attributes = attributes;
        this.relationships = relationships;
    }
    
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject(
            SubscriptionEnum type,
            OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes attributes) {
        this(type, attributes, Optional.empty());
    }

    @JsonIgnore
    public SubscriptionEnum type() {
        return type;
    }

    @JsonIgnore
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships> relationships() {
        return (Optional<OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject withType(SubscriptionEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject withAttributes(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject withRelationships(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject withRelationships(Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships> relationships) {
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
        OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject other = (OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject) o;
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
        return Utils.toString(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject.class,
                "type", type,
                "attributes", attributes,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private SubscriptionEnum type;
 
        private OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes attributes;
 
        private Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(SubscriptionEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject build() {
            return new OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject(
                type,
                attributes,
                relationships);
        }
    }
}
