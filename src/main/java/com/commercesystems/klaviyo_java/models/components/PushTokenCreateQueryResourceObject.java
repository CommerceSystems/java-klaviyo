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


public class PushTokenCreateQueryResourceObject {

    @JsonProperty("type")
    private PushTokenEnum type;

    @JsonProperty("attributes")
    private PushTokenCreateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public PushTokenCreateQueryResourceObject(
            @JsonProperty("type") PushTokenEnum type,
            @JsonProperty("attributes") PushTokenCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public PushTokenEnum type() {
        return type;
    }

    @JsonIgnore
    public PushTokenCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PushTokenCreateQueryResourceObject withType(PushTokenEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PushTokenCreateQueryResourceObject withAttributes(PushTokenCreateQueryResourceObjectAttributes attributes) {
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
        PushTokenCreateQueryResourceObject other = (PushTokenCreateQueryResourceObject) o;
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
        return Utils.toString(PushTokenCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private PushTokenEnum type;
 
        private PushTokenCreateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(PushTokenEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(PushTokenCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public PushTokenCreateQueryResourceObject build() {
            return new PushTokenCreateQueryResourceObject(
                type,
                attributes);
        }
    }
}
