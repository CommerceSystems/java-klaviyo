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


public class EventCreateQueryV2 {

    @JsonProperty("data")
    private EventCreateQueryV2ResourceObject data;

    @JsonCreator
    public EventCreateQueryV2(
            @JsonProperty("data") EventCreateQueryV2ResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public EventCreateQueryV2ResourceObject data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EventCreateQueryV2 withData(EventCreateQueryV2ResourceObject data) {
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
        EventCreateQueryV2 other = (EventCreateQueryV2) o;
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
        return Utils.toString(EventCreateQueryV2.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private EventCreateQueryV2ResourceObject data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(EventCreateQueryV2ResourceObject data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public EventCreateQueryV2 build() {
            return new EventCreateQueryV2(
                data);
        }
    }
}

