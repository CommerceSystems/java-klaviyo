/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * RelativeDateOperatorBaseFilterTimeframeFilterOperator - Operators for relative date filters.
 * 
 * e.g. "in the last 10 days"
 */
public enum RelativeDateOperatorBaseFilterTimeframeFilterOperator {
    AT_LEAST("at-least"),
    IN_THE_LAST("in-the-last"),
    IN_THE_NEXT("in-the-next");

    @JsonValue
    private final String value;

    private RelativeDateOperatorBaseFilterTimeframeFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
