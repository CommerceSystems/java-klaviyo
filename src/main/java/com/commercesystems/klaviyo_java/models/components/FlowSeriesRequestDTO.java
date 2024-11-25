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


public class FlowSeriesRequestDTO {

    @JsonProperty("data")
    private FlowSeriesRequestDTOResourceObject data;

    @JsonCreator
    public FlowSeriesRequestDTO(
            @JsonProperty("data") FlowSeriesRequestDTOResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public FlowSeriesRequestDTOResourceObject data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FlowSeriesRequestDTO withData(FlowSeriesRequestDTOResourceObject data) {
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
        FlowSeriesRequestDTO other = (FlowSeriesRequestDTO) o;
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
        return Utils.toString(FlowSeriesRequestDTO.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private FlowSeriesRequestDTOResourceObject data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(FlowSeriesRequestDTOResourceObject data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public FlowSeriesRequestDTO build() {
            return new FlowSeriesRequestDTO(
                data);
        }
    }
}

