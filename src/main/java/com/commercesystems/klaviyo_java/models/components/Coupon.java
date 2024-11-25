/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class Coupon {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends CouponCodeCreateQueryResourceObjectData> data;

    @JsonCreator
    public Coupon(
            @JsonProperty("data") Optional<? extends CouponCodeCreateQueryResourceObjectData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }
    
    public Coupon() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CouponCodeCreateQueryResourceObjectData> data() {
        return (Optional<CouponCodeCreateQueryResourceObjectData>) data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Coupon withData(CouponCodeCreateQueryResourceObjectData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public Coupon withData(Optional<? extends CouponCodeCreateQueryResourceObjectData> data) {
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
        Coupon other = (Coupon) o;
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
        return Utils.toString(Coupon.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Optional<? extends CouponCodeCreateQueryResourceObjectData> data = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(CouponCodeCreateQueryResourceObjectData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends CouponCodeCreateQueryResourceObjectData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public Coupon build() {
            return new Coupon(
                data);
        }
    }
}

