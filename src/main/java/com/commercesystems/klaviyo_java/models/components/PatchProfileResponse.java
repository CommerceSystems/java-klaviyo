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


public class PatchProfileResponse {

    @JsonProperty("data")
    private PatchProfileResponseData data;

    @JsonCreator
    public PatchProfileResponse(
            @JsonProperty("data") PatchProfileResponseData data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public PatchProfileResponseData data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchProfileResponse withData(PatchProfileResponseData data) {
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
        PatchProfileResponse other = (PatchProfileResponse) o;
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
        return Utils.toString(PatchProfileResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private PatchProfileResponseData data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(PatchProfileResponseData data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public PatchProfileResponse build() {
            return new PatchProfileResponse(
                data);
        }
    }
}

