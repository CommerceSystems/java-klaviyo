/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum GetBulkCreateCouponCodesJobQueryParamInclude {
    COUPON_CODES("coupon-codes");

    @JsonValue
    private final String value;

    private GetBulkCreateCouponCodesJobQueryParamInclude(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
