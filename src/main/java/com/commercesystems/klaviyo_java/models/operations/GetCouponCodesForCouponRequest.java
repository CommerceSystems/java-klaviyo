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


public class GetCouponCodesForCouponRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[coupon-code]")
    private Optional<? extends List<GetCouponCodesForCouponQueryParamFieldsCouponCode>> fieldsCouponCode;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter")
    private Optional<String> filter;

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
    public GetCouponCodesForCouponRequest(
            String id,
            Optional<? extends List<GetCouponCodesForCouponQueryParamFieldsCouponCode>> fieldsCouponCode,
            Optional<String> filter,
            Optional<String> pageCursor,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(pageCursor, "pageCursor");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.fieldsCouponCode = fieldsCouponCode;
        this.filter = filter;
        this.pageCursor = pageCursor;
        this.revision = revision;
    }
    
    public GetCouponCodesForCouponRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCouponCodesForCouponQueryParamFieldsCouponCode>> fieldsCouponCode() {
        return (Optional<List<GetCouponCodesForCouponQueryParamFieldsCouponCode>>) fieldsCouponCode;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
     */
    @JsonIgnore
    public Optional<String> filter() {
        return filter;
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

    public GetCouponCodesForCouponRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCouponCodesForCouponRequest withFieldsCouponCode(List<GetCouponCodesForCouponQueryParamFieldsCouponCode> fieldsCouponCode) {
        Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
        this.fieldsCouponCode = Optional.ofNullable(fieldsCouponCode);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCouponCodesForCouponRequest withFieldsCouponCode(Optional<? extends List<GetCouponCodesForCouponQueryParamFieldsCouponCode>> fieldsCouponCode) {
        Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
        this.fieldsCouponCode = fieldsCouponCode;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
     */
    public GetCouponCodesForCouponRequest withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`&lt;br&gt;`status`: `equals`&lt;br&gt;`coupon.id`: `any`, `equals`&lt;br&gt;`profile.id`: `any`, `equals`
     */
    public GetCouponCodesForCouponRequest withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetCouponCodesForCouponRequest withPageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.ofNullable(pageCursor);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetCouponCodesForCouponRequest withPageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetCouponCodesForCouponRequest withRevision(String revision) {
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
        GetCouponCodesForCouponRequest other = (GetCouponCodesForCouponRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.fieldsCouponCode, other.fieldsCouponCode) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.pageCursor, other.pageCursor) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            fieldsCouponCode,
            filter,
            pageCursor,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCouponCodesForCouponRequest.class,
                "id", id,
                "fieldsCouponCode", fieldsCouponCode,
                "filter", filter,
                "pageCursor", pageCursor,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends List<GetCouponCodesForCouponQueryParamFieldsCouponCode>> fieldsCouponCode = Optional.empty();
 
        private Optional<String> filter = Optional.empty();
 
        private Optional<String> pageCursor = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCouponCode(List<GetCouponCodesForCouponQueryParamFieldsCouponCode> fieldsCouponCode) {
            Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
            this.fieldsCouponCode = Optional.ofNullable(fieldsCouponCode);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCouponCode(Optional<? extends List<GetCouponCodesForCouponQueryParamFieldsCouponCode>> fieldsCouponCode) {
            Utils.checkNotNull(fieldsCouponCode, "fieldsCouponCode");
            this.fieldsCouponCode = fieldsCouponCode;
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
        
        public GetCouponCodesForCouponRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetCouponCodesForCouponRequest(
                id,
                fieldsCouponCode,
                filter,
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

