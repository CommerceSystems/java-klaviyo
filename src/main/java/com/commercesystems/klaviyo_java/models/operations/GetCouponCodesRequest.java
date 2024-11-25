/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetCouponCodesRequest {

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[coupon-code]")
    private Optional<? extends List<FieldsCouponCode>> fieldsCouponCode;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[coupon]")
    private Optional<? extends List<GetCouponCodesQueryParamFieldsCoupon>> fieldsCoupon;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter")
    private Optional<String> filter;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetCouponCodesQueryParamInclude>> include;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page[cursor]")
    private Optional<String> pageCursor;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetCouponCodesRequest(
            Optional<? extends List<FieldsCouponCode>> fieldsCouponCode,
            Optional<? extends List<GetCouponCodesQueryParamFieldsCoupon>> fieldsCoupon,
            Optional<String> filter,
            Optional<? extends List<GetCouponCodesQueryParamInclude>> include,
            Optional<String> pageCursor,
            String revision) {
        Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
        Utils.checkNotNull(fieldsCoupon, "fieldsCoupon");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(pageCursor, "pageCursor");
        Utils.checkNotNull(revision, "revision");
        this.fieldsCouponCode = fieldsCouponCode;
        this.fieldsCoupon = fieldsCoupon;
        this.filter = filter;
        this.include = include;
        this.pageCursor = pageCursor;
        this.revision = revision;
    }
    
    public GetCouponCodesRequest(
            String revision) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FieldsCouponCode>> fieldsCouponCode() {
        return (Optional<List<FieldsCouponCode>>) fieldsCouponCode;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCouponCodesQueryParamFieldsCoupon>> fieldsCoupon() {
        return (Optional<List<GetCouponCodesQueryParamFieldsCoupon>>) fieldsCoupon;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
     */
    @JsonIgnore
    public Optional<String> filter() {
        return filter;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCouponCodesQueryParamInclude>> include() {
        return (Optional<List<GetCouponCodesQueryParamInclude>>) include;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @JsonIgnore
    public Optional<String> pageCursor() {
        return pageCursor;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCouponCodesRequest withFieldsCouponCode(List<FieldsCouponCode> fieldsCouponCode) {
        Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
        this.fieldsCouponCode = Optional.ofNullable(fieldsCouponCode);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCouponCodesRequest withFieldsCouponCode(Optional<? extends List<FieldsCouponCode>> fieldsCouponCode) {
        Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
        this.fieldsCouponCode = fieldsCouponCode;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCouponCodesRequest withFieldsCoupon(List<GetCouponCodesQueryParamFieldsCoupon> fieldsCoupon) {
        Utils.checkNotNull(fieldsCoupon, "fieldsCoupon");
        this.fieldsCoupon = Optional.ofNullable(fieldsCoupon);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCouponCodesRequest withFieldsCoupon(Optional<? extends List<GetCouponCodesQueryParamFieldsCoupon>> fieldsCoupon) {
        Utils.checkNotNull(fieldsCoupon, "fieldsCoupon");
        this.fieldsCoupon = fieldsCoupon;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
     */
    public GetCouponCodesRequest withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
     */
    public GetCouponCodesRequest withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetCouponCodesRequest withInclude(List<GetCouponCodesQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetCouponCodesRequest withInclude(Optional<? extends List<GetCouponCodesQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetCouponCodesRequest withPageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.ofNullable(pageCursor);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetCouponCodesRequest withPageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetCouponCodesRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
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
        GetCouponCodesRequest other = (GetCouponCodesRequest) o;
        return 
            Objects.deepEquals(this.fieldsCouponCode, other.fieldsCouponCode) &&
            Objects.deepEquals(this.fieldsCoupon, other.fieldsCoupon) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.pageCursor, other.pageCursor) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fieldsCouponCode,
            fieldsCoupon,
            filter,
            include,
            pageCursor,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCouponCodesRequest.class,
                "fieldsCouponCode", fieldsCouponCode,
                "fieldsCoupon", fieldsCoupon,
                "filter", filter,
                "include", include,
                "pageCursor", pageCursor,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<FieldsCouponCode>> fieldsCouponCode = Optional.empty();
 
        private Optional<? extends List<GetCouponCodesQueryParamFieldsCoupon>> fieldsCoupon = Optional.empty();
 
        private Optional<String> filter = Optional.empty();
 
        private Optional<? extends List<GetCouponCodesQueryParamInclude>> include = Optional.empty();
 
        private Optional<String> pageCursor = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCouponCode(List<FieldsCouponCode> fieldsCouponCode) {
            Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
            this.fieldsCouponCode = Optional.ofNullable(fieldsCouponCode);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCouponCode(Optional<? extends List<FieldsCouponCode>> fieldsCouponCode) {
            Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
            this.fieldsCouponCode = fieldsCouponCode;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCoupon(List<GetCouponCodesQueryParamFieldsCoupon> fieldsCoupon) {
            Utils.checkNotNull(fieldsCoupon, "fieldsCoupon");
            this.fieldsCoupon = Optional.ofNullable(fieldsCoupon);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCoupon(Optional<? extends List<GetCouponCodesQueryParamFieldsCoupon>> fieldsCoupon) {
            Utils.checkNotNull(fieldsCoupon, "fieldsCoupon");
            this.fieldsCoupon = fieldsCoupon;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
         */
        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
         */
        public Builder filter(Optional<String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(List<GetCouponCodesQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(Optional<? extends List<GetCouponCodesQueryParamInclude>> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
         */
        public Builder pageCursor(String pageCursor) {
            Utils.checkNotNull(pageCursor, "pageCursor");
            this.pageCursor = Optional.ofNullable(pageCursor);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
         */
        public Builder pageCursor(Optional<String> pageCursor) {
            Utils.checkNotNull(pageCursor, "pageCursor");
            this.pageCursor = pageCursor;
            return this;
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }
        
        public GetCouponCodesRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetCouponCodesRequest(
                fieldsCouponCode,
                fieldsCoupon,
                filter,
                include,
                pageCursor,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

