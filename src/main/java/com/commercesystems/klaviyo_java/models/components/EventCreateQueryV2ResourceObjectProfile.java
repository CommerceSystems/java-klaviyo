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


public class EventCreateQueryV2ResourceObjectProfile {

    @JsonProperty("data")
    private EventProfileCreateQueryResourceObject data;

    @JsonCreator
    public EventCreateQueryV2ResourceObjectProfile(
            @JsonProperty("data") EventProfileCreateQueryResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public EventProfileCreateQueryResourceObject data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EventCreateQueryV2ResourceObjectProfile withData(EventProfileCreateQueryResourceObject data) {
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
        EventCreateQueryV2ResourceObjectProfile other = (EventCreateQueryV2ResourceObjectProfile) o;
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
        return Utils.toString(EventCreateQueryV2ResourceObjectProfile.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private EventProfileCreateQueryResourceObject data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(EventProfileCreateQueryResourceObject data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public EventCreateQueryV2ResourceObjectProfile build() {
            return new EventCreateQueryV2ResourceObjectProfile(
                data);
        }
    }
}

