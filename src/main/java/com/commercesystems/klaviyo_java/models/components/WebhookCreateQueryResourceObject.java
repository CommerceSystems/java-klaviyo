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


public class WebhookCreateQueryResourceObject {

    @JsonProperty("type")
    private WebhookEnum type;

    @JsonProperty("attributes")
    private WebhookCreateQueryResourceObjectAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends WebhookCreateQueryResourceObjectRelationships> relationships;

    @JsonCreator
    public WebhookCreateQueryResourceObject(
            @JsonProperty("type") WebhookEnum type,
            @JsonProperty("attributes") WebhookCreateQueryResourceObjectAttributes attributes,
            @JsonProperty("relationships") Optional<? extends WebhookCreateQueryResourceObjectRelationships> relationships) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(relationships, "relationships");
        this.type = type;
        this.attributes = attributes;
        this.relationships = relationships;
    }
    
    public WebhookCreateQueryResourceObject(
            WebhookEnum type,
            WebhookCreateQueryResourceObjectAttributes attributes) {
        this(type, attributes, Optional.empty());
    }

    @JsonIgnore
    public WebhookEnum type() {
        return type;
    }

    @JsonIgnore
    public WebhookCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WebhookCreateQueryResourceObjectRelationships> relationships() {
        return (Optional<WebhookCreateQueryResourceObjectRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WebhookCreateQueryResourceObject withType(WebhookEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public WebhookCreateQueryResourceObject withAttributes(WebhookCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public WebhookCreateQueryResourceObject withRelationships(WebhookCreateQueryResourceObjectRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public WebhookCreateQueryResourceObject withRelationships(Optional<? extends WebhookCreateQueryResourceObjectRelationships> relationships) {
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
        WebhookCreateQueryResourceObject other = (WebhookCreateQueryResourceObject) o;
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
        return Utils.toString(WebhookCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private WebhookEnum type;
 
        private WebhookCreateQueryResourceObjectAttributes attributes;
 
        private Optional<? extends WebhookCreateQueryResourceObjectRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(WebhookEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(WebhookCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(WebhookCreateQueryResourceObjectRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends WebhookCreateQueryResourceObjectRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public WebhookCreateQueryResourceObject build() {
            return new WebhookCreateQueryResourceObject(
                type,
                attributes,
                relationships);
        }
    }
}

