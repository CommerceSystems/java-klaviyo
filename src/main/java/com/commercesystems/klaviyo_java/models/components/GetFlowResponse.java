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


public class GetFlowResponse {

    @JsonProperty("data")
    private GetFlowResponseData data;

    @JsonCreator
    public GetFlowResponse(
            @JsonProperty("data") GetFlowResponseData data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public GetFlowResponseData data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetFlowResponse withData(GetFlowResponseData data) {
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
        GetFlowResponse other = (GetFlowResponse) o;
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
        return Utils.toString(GetFlowResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private GetFlowResponseData data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(GetFlowResponseData data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public GetFlowResponse build() {
            return new GetFlowResponse(
                data);
        }
    }
}

