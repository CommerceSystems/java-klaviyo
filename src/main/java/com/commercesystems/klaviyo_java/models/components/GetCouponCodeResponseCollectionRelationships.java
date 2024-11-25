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


public class GetCouponCodeResponseCollectionRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("coupon")
    private Optional<? extends GetCouponCodeResponseCollectionCoupon> coupon;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile")
    private Optional<? extends GetCouponCodeResponseCollectionProfile> profile;

    @JsonCreator
    public GetCouponCodeResponseCollectionRelationships(
            @JsonProperty("coupon") Optional<? extends GetCouponCodeResponseCollectionCoupon> coupon,
            @JsonProperty("profile") Optional<? extends GetCouponCodeResponseCollectionProfile> profile) {
        Utils.checkNotNull(coupon, "coupon");
        Utils.checkNotNull(profile, "profile");
        this.coupon = coupon;
        this.profile = profile;
    }
    
    public GetCouponCodeResponseCollectionRelationships() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCouponCodeResponseCollectionCoupon> coupon() {
        return (Optional<GetCouponCodeResponseCollectionCoupon>) coupon;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCouponCodeResponseCollectionProfile> profile() {
        return (Optional<GetCouponCodeResponseCollectionProfile>) profile;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCouponCodeResponseCollectionRelationships withCoupon(GetCouponCodeResponseCollectionCoupon coupon) {
        Utils.checkNotNull(coupon, "coupon");
        this.coupon = Optional.ofNullable(coupon);
        return this;
    }

    public GetCouponCodeResponseCollectionRelationships withCoupon(Optional<? extends GetCouponCodeResponseCollectionCoupon> coupon) {
        Utils.checkNotNull(coupon, "coupon");
        this.coupon = coupon;
        return this;
    }

    public GetCouponCodeResponseCollectionRelationships withProfile(GetCouponCodeResponseCollectionProfile profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = Optional.ofNullable(profile);
        return this;
    }

    public GetCouponCodeResponseCollectionRelationships withProfile(Optional<? extends GetCouponCodeResponseCollectionProfile> profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = profile;
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
        GetCouponCodeResponseCollectionRelationships other = (GetCouponCodeResponseCollectionRelationships) o;
        return 
            Objects.deepEquals(this.coupon, other.coupon) &&
            Objects.deepEquals(this.profile, other.profile);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            coupon,
            profile);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCouponCodeResponseCollectionRelationships.class,
                "coupon", coupon,
                "profile", profile);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetCouponCodeResponseCollectionCoupon> coupon = Optional.empty();
 
        private Optional<? extends GetCouponCodeResponseCollectionProfile> profile = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder coupon(GetCouponCodeResponseCollectionCoupon coupon) {
            Utils.checkNotNull(coupon, "coupon");
            this.coupon = Optional.ofNullable(coupon);
            return this;
        }

        public Builder coupon(Optional<? extends GetCouponCodeResponseCollectionCoupon> coupon) {
            Utils.checkNotNull(coupon, "coupon");
            this.coupon = coupon;
            return this;
        }

        public Builder profile(GetCouponCodeResponseCollectionProfile profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = Optional.ofNullable(profile);
            return this;
        }

        public Builder profile(Optional<? extends GetCouponCodeResponseCollectionProfile> profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }
        
        public GetCouponCodeResponseCollectionRelationships build() {
            return new GetCouponCodeResponseCollectionRelationships(
                coupon,
                profile);
        }
    }
}

