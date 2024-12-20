/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * RelativeAnniversaryDateFilterOperator - Operators for relative date filters.
 * 
 * e.g. "anniversary in the last 10 days"
 */
public enum RelativeAnniversaryDateFilterOperator {
    ANNIVERSARY_LAST("anniversary-last"),
    ANNIVERSARY_NEXT("anniversary-next");

    @JsonValue
    private final String value;

    private RelativeAnniversaryDateFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
