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


public class PatchTemplateResponse {

    @JsonProperty("data")
    private PatchTemplateResponseData data;

    @JsonCreator
    public PatchTemplateResponse(
            @JsonProperty("data") PatchTemplateResponseData data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public PatchTemplateResponseData data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchTemplateResponse withData(PatchTemplateResponseData data) {
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
        PatchTemplateResponse other = (PatchTemplateResponse) o;
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
        return Utils.toString(PatchTemplateResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private PatchTemplateResponseData data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(PatchTemplateResponseData data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public PatchTemplateResponse build() {
            return new PatchTemplateResponse(
                data);
        }
    }
}

