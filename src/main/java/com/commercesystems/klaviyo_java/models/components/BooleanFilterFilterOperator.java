/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * BooleanFilterFilterOperator - Operators for boolean filters.
 */
public enum BooleanFilterFilterOperator {
    EQUALS("equals");

    @JsonValue
    private final String value;

    private BooleanFilterFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
