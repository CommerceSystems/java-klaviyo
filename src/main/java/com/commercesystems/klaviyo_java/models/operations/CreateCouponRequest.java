/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.CouponCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CreateCouponRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private CouponCreateQuery couponCreateQuery;

    @JsonCreator
    public CreateCouponRequest(
            String revision,
            CouponCreateQuery couponCreateQuery) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(couponCreateQuery, "couponCreateQuery");
        this.revision = revision;
        this.couponCreateQuery = couponCreateQuery;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public CouponCreateQuery couponCreateQuery() {
        return couponCreateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public CreateCouponRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public CreateCouponRequest withCouponCreateQuery(CouponCreateQuery couponCreateQuery) {
        Utils.checkNotNull(couponCreateQuery, "couponCreateQuery");
        this.couponCreateQuery = couponCreateQuery;
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
        CreateCouponRequest other = (CreateCouponRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.couponCreateQuery, other.couponCreateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            couponCreateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCouponRequest.class,
                "revision", revision,
                "couponCreateQuery", couponCreateQuery);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private CouponCreateQuery couponCreateQuery;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }

        public Builder couponCreateQuery(CouponCreateQuery couponCreateQuery) {
            Utils.checkNotNull(couponCreateQuery, "couponCreateQuery");
            this.couponCreateQuery = couponCreateQuery;
            return this;
        }
        
        public CreateCouponRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new CreateCouponRequest(
                revision,
                couponCreateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}
