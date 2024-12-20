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


public class CampaignTrackingSettingStaticParam {

    @JsonProperty("type")
    private StaticEnum type;

    /**
     * The value of the tracking parameter
     */
    @JsonProperty("value")
    private String value;

    @JsonCreator
    public CampaignTrackingSettingStaticParam(
            @JsonProperty("type") StaticEnum type,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.type = type;
        this.value = value;
    }

    @JsonIgnore
    public StaticEnum type() {
        return type;
    }

    /**
     * The value of the tracking parameter
     */
    @JsonIgnore
    public String value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CampaignTrackingSettingStaticParam withType(StaticEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The value of the tracking parameter
     */
    public CampaignTrackingSettingStaticParam withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        CampaignTrackingSettingStaticParam other = (CampaignTrackingSettingStaticParam) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignTrackingSettingStaticParam.class,
                "type", type,
                "value", value);
    }
    
    public final static class Builder {
 
        private StaticEnum type;
 
        private String value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(StaticEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The value of the tracking parameter
         */
        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public CampaignTrackingSettingStaticParam build() {
            return new CampaignTrackingSettingStaticParam(
                type,
                value);
        }
    }
}

