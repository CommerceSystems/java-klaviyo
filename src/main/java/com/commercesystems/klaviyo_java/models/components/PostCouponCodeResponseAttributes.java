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
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class PostCouponCodeResponseAttributes {

    /**
     * This is a unique string that will be or is assigned to each customer/profile and is associated with a coupon.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unique_code")
    private JsonNullable<String> uniqueCode;

    /**
     * The datetime when this coupon code will expire. If not specified or set to null, it will be automatically set to 1 year.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_at")
    private JsonNullable<OffsetDateTime> expiresAt;

    /**
     * The current status of the coupon code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends PostCouponCodeResponseStatus> status;

    @JsonCreator
    public PostCouponCodeResponseAttributes(
            @JsonProperty("unique_code") JsonNullable<String> uniqueCode,
            @JsonProperty("expires_at") JsonNullable<OffsetDateTime> expiresAt,
            @JsonProperty("status") JsonNullable<? extends PostCouponCodeResponseStatus> status) {
        Utils.checkNotNull(uniqueCode, "uniqueCode");
        Utils.checkNotNull(expiresAt, "expiresAt");
        Utils.checkNotNull(status, "status");
        this.uniqueCode = uniqueCode;
        this.expiresAt = expiresAt;
        this.status = status;
    }
    
    public PostCouponCodeResponseAttributes() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * This is a unique string that will be or is assigned to each customer/profile and is associated with a coupon.
     */
    @JsonIgnore
    public JsonNullable<String> uniqueCode() {
        return uniqueCode;
    }

    /**
     * The datetime when this coupon code will expire. If not specified or set to null, it will be automatically set to 1 year.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> expiresAt() {
        return expiresAt;
    }

    /**
     * The current status of the coupon code.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PostCouponCodeResponseStatus> status() {
        return (JsonNullable<PostCouponCodeResponseStatus>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * This is a unique string that will be or is assigned to each customer/profile and is associated with a coupon.
     */
    public PostCouponCodeResponseAttributes withUniqueCode(String uniqueCode) {
        Utils.checkNotNull(uniqueCode, "uniqueCode");
        this.uniqueCode = JsonNullable.of(uniqueCode);
        return this;
    }

    /**
     * This is a unique string that will be or is assigned to each customer/profile and is associated with a coupon.
     */
    public PostCouponCodeResponseAttributes withUniqueCode(JsonNullable<String> uniqueCode) {
        Utils.checkNotNull(uniqueCode, "uniqueCode");
        this.uniqueCode = uniqueCode;
        return this;
    }

    /**
     * The datetime when this coupon code will expire. If not specified or set to null, it will be automatically set to 1 year.
     */
    public PostCouponCodeResponseAttributes withExpiresAt(OffsetDateTime expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = JsonNullable.of(expiresAt);
        return this;
    }

    /**
     * The datetime when this coupon code will expire. If not specified or set to null, it will be automatically set to 1 year.
     */
    public PostCouponCodeResponseAttributes withExpiresAt(JsonNullable<OffsetDateTime> expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * The current status of the coupon code.
     */
    public PostCouponCodeResponseAttributes withStatus(PostCouponCodeResponseStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * The current status of the coupon code.
     */
    public PostCouponCodeResponseAttributes withStatus(JsonNullable<? extends PostCouponCodeResponseStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        PostCouponCodeResponseAttributes other = (PostCouponCodeResponseAttributes) o;
        return 
            Objects.deepEquals(this.uniqueCode, other.uniqueCode) &&
            Objects.deepEquals(this.expiresAt, other.expiresAt) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uniqueCode,
            expiresAt,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostCouponCodeResponseAttributes.class,
                "uniqueCode", uniqueCode,
                "expiresAt", expiresAt,
                "status", status);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> uniqueCode = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.undefined();
 
        private JsonNullable<? extends PostCouponCodeResponseStatus> status = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * This is a unique string that will be or is assigned to each customer/profile and is associated with a coupon.
         */
        public Builder uniqueCode(String uniqueCode) {
            Utils.checkNotNull(uniqueCode, "uniqueCode");
            this.uniqueCode = JsonNullable.of(uniqueCode);
            return this;
        }

        /**
         * This is a unique string that will be or is assigned to each customer/profile and is associated with a coupon.
         */
        public Builder uniqueCode(JsonNullable<String> uniqueCode) {
            Utils.checkNotNull(uniqueCode, "uniqueCode");
            this.uniqueCode = uniqueCode;
            return this;
        }

        /**
         * The datetime when this coupon code will expire. If not specified or set to null, it will be automatically set to 1 year.
         */
        public Builder expiresAt(OffsetDateTime expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = JsonNullable.of(expiresAt);
            return this;
        }

        /**
         * The datetime when this coupon code will expire. If not specified or set to null, it will be automatically set to 1 year.
         */
        public Builder expiresAt(JsonNullable<OffsetDateTime> expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * The current status of the coupon code.
         */
        public Builder status(PostCouponCodeResponseStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * The current status of the coupon code.
         */
        public Builder status(JsonNullable<? extends PostCouponCodeResponseStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public PostCouponCodeResponseAttributes build() {
            return new PostCouponCodeResponseAttributes(
                uniqueCode,
                expiresAt,
                status);
        }
    }
}
