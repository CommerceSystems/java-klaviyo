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


public class CampaignCreateQueryResourceObject {

    @JsonProperty("type")
    private CampaignEnum type;

    @JsonProperty("attributes")
    private CampaignCreateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public CampaignCreateQueryResourceObject(
            @JsonProperty("type") CampaignEnum type,
            @JsonProperty("attributes") CampaignCreateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public CampaignEnum type() {
        return type;
    }

    @JsonIgnore
    public CampaignCreateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CampaignCreateQueryResourceObject withType(CampaignEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CampaignCreateQueryResourceObject withAttributes(CampaignCreateQueryResourceObjectAttributes attributes) {
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
        CampaignCreateQueryResourceObject other = (CampaignCreateQueryResourceObject) o;
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
        return Utils.toString(CampaignCreateQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private CampaignEnum type;
 
        private CampaignCreateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CampaignEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(CampaignCreateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public CampaignCreateQueryResourceObject build() {
            return new CampaignCreateQueryResourceObject(
                type,
                attributes);
        }
    }
}

