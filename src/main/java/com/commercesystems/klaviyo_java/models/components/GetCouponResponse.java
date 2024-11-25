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


public class GetCouponResponse {

    @JsonProperty("data")
    private CouponResponseObjectResource data;

    @JsonCreator
    public GetCouponResponse(
            @JsonProperty("data") CouponResponseObjectResource data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public CouponResponseObjectResource data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCouponResponse withData(CouponResponseObjectResource data) {
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
        GetCouponResponse other = (GetCouponResponse) o;
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
        return Utils.toString(GetCouponResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private CouponResponseObjectResource data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(CouponResponseObjectResource data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public GetCouponResponse build() {
            return new GetCouponResponse(
                data);
        }
    }
}
