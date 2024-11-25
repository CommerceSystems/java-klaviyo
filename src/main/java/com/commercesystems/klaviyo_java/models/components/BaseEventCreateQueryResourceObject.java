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


public class BaseEventCreateQueryResourceObject {

    @JsonProperty("type")
    private EventEnum type;

    @JsonProperty("attributes")
    private BaseEventCreateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public BaseEventCreateQueryResourceObject(
            @JsonProperty("type") EventEnum type,
            @JsonProperty("attributes") BaseEventCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public EventEnum type() {
        return type;
    }

    @JsonIgnore
    public BaseEventCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BaseEventCreateQueryResourceObject withType(EventEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public BaseEventCreateQueryResourceObject withAttributes(BaseEventCreateQueryResourceObjectAttributes attributes) {
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
        BaseEventCreateQueryResourceObject other = (BaseEventCreateQueryResourceObject) o;
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
        return Utils.toString(BaseEventCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private EventEnum type;
 
        private BaseEventCreateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(EventEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(BaseEventCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public BaseEventCreateQueryResourceObject build() {
            return new BaseEventCreateQueryResourceObject(
                type,
                attributes);
        }
    }
}
