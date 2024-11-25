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


public class TrackingSettingPartialUpdateQuery {

    @JsonProperty("data")
    private TrackingSettingPartialUpdateQueryResourceObject data;

    @JsonCreator
    public TrackingSettingPartialUpdateQuery(
            @JsonProperty("data") TrackingSettingPartialUpdateQueryResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public TrackingSettingPartialUpdateQueryResourceObject data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TrackingSettingPartialUpdateQuery withData(TrackingSettingPartialUpdateQueryResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        TrackingSettingPartialUpdateQuery other = (TrackingSettingPartialUpdateQuery) o;
        return 
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TrackingSettingPartialUpdateQuery.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private TrackingSettingPartialUpdateQueryResourceObject data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(TrackingSettingPartialUpdateQueryResourceObject data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public TrackingSettingPartialUpdateQuery build() {
            return new TrackingSettingPartialUpdateQuery(
                data);
        }
    }
}

