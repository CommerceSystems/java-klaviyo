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


public class CampaignCampaignTrackingSettingDynamicParam {

    @JsonProperty("type")
    private DynamicEnum type;

    /**
     * The value of the tracking parameter
     */
    @JsonProperty("value")
    private CampaignTrackingSettingDynamicParamCampaignValue value;

    @JsonCreator
    public CampaignCampaignTrackingSettingDynamicParam(
            @JsonProperty("type") DynamicEnum type,
            @JsonProperty("value") CampaignTrackingSettingDynamicParamCampaignValue value) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.type = type;
        this.value = value;
    }

    @JsonIgnore
    public DynamicEnum type() {
        return type;
    }

    /**
     * The value of the tracking parameter
     */
    @JsonIgnore
    public CampaignTrackingSettingDynamicParamCampaignValue value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CampaignCampaignTrackingSettingDynamicParam withType(DynamicEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The value of the tracking parameter
     */
    public CampaignCampaignTrackingSettingDynamicParam withValue(CampaignTrackingSettingDynamicParamCampaignValue value) {
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
        CampaignCampaignTrackingSettingDynamicParam other = (CampaignCampaignTrackingSettingDynamicParam) o;
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
        return Utils.toString(CampaignCampaignTrackingSettingDynamicParam.class,
                "type", type,
                "value", value);
    }
    
    public final static class Builder {
 
        private DynamicEnum type;
 
        private CampaignTrackingSettingDynamicParamCampaignValue value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(DynamicEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The value of the tracking parameter
         */
        public Builder value(CampaignTrackingSettingDynamicParamCampaignValue value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public CampaignCampaignTrackingSettingDynamicParam build() {
            return new CampaignCampaignTrackingSettingDynamicParam(
                type,
                value);
        }
    }
}

