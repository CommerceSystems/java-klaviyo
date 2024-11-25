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


public class ProfileSuppressionCreateQueryResourceObject {

    @JsonProperty("type")
    private ProfileEnum type;

    @JsonProperty("attributes")
    private ProfileSuppressionCreateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public ProfileSuppressionCreateQueryResourceObject(
            @JsonProperty("type") ProfileEnum type,
            @JsonProperty("attributes") ProfileSuppressionCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public ProfileEnum type() {
        return type;
    }

    @JsonIgnore
    public ProfileSuppressionCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ProfileSuppressionCreateQueryResourceObject withType(ProfileEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public ProfileSuppressionCreateQueryResourceObject withAttributes(ProfileSuppressionCreateQueryResourceObjectAttributes attributes) {
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
        ProfileSuppressionCreateQueryResourceObject other = (ProfileSuppressionCreateQueryResourceObject) o;
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
        return Utils.toString(ProfileSuppressionCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private ProfileEnum type;
 
        private ProfileSuppressionCreateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ProfileEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(ProfileSuppressionCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public ProfileSuppressionCreateQueryResourceObject build() {
            return new ProfileSuppressionCreateQueryResourceObject(
                type,
                attributes);
        }
    }
}

