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


public class CampaignPartialUpdateQueryResourceObject {

    @JsonProperty("type")
    private CampaignEnum type;

    /**
     * The campaign ID to be retrieved
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private CampaignPartialUpdateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public CampaignPartialUpdateQueryResourceObject(
            @JsonProperty("type") CampaignEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") CampaignPartialUpdateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.id = id;
        this.attributes = attributes;
    }

    @JsonIgnore
    public CampaignEnum type() {
        return type;
    }

    /**
     * The campaign ID to be retrieved
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public CampaignPartialUpdateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CampaignPartialUpdateQueryResourceObject withType(CampaignEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The campaign ID to be retrieved
     */
    public CampaignPartialUpdateQueryResourceObject withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CampaignPartialUpdateQueryResourceObject withAttributes(CampaignPartialUpdateQueryResourceObjectAttributes attributes) {
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
        CampaignPartialUpdateQueryResourceObject other = (CampaignPartialUpdateQueryResourceObject) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.attributes, other.attributes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id,
            attributes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignPartialUpdateQueryResourceObject.class,
                "type", type,
                "id", id,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private CampaignEnum type;
 
        private String id;
 
        private CampaignPartialUpdateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CampaignEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The campaign ID to be retrieved
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(CampaignPartialUpdateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public CampaignPartialUpdateQueryResourceObject build() {
            return new CampaignPartialUpdateQueryResourceObject(
                type,
                id,
                attributes);
        }
    }
}
