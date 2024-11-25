/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * RelativeDateRangeFilterTimeframeFilterOperator - Operators for relative date range filters.
 * 
 * e.g. "between 10 and 20 days ago"
 */
public enum RelativeDateRangeFilterTimeframeFilterOperator {
    BETWEEN("between");

    @JsonValue
    private final String value;

    private RelativeDateRangeFilterTimeframeFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
