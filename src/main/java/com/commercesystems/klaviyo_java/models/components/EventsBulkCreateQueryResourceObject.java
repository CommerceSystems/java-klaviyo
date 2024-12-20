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


public class EventsBulkCreateQueryResourceObject {

    @JsonProperty("type")
    private EventBulkCreateEnum type;

    @JsonProperty("attributes")
    private EventsBulkCreateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public EventsBulkCreateQueryResourceObject(
            @JsonProperty("type") EventBulkCreateEnum type,
            @JsonProperty("attributes") EventsBulkCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public EventBulkCreateEnum type() {
        return type;
    }

    @JsonIgnore
    public EventsBulkCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EventsBulkCreateQueryResourceObject withType(EventBulkCreateEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public EventsBulkCreateQueryResourceObject withAttributes(EventsBulkCreateQueryResourceObjectAttributes attributes) {
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
        EventsBulkCreateQueryResourceObject other = (EventsBulkCreateQueryResourceObject) o;
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
        return Utils.toString(EventsBulkCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private EventBulkCreateEnum type;
 
        private EventsBulkCreateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(EventBulkCreateEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(EventsBulkCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public EventsBulkCreateQueryResourceObject build() {
            return new EventsBulkCreateQueryResourceObject(
                type,
                attributes);
        }
    }
}

