/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ListLengthFilterOperator - Operators for list length filters.
 */
public enum ListLengthFilterOperator {
    LENGTH_EQUALS("length-equals"),
    LENGTH_GREATER_THAN("length-greater-than"),
    LENGTH_GREATER_THAN_OR_EQUAL("length-greater-than-or-equal"),
    LENGTH_LESS_THAN("length-less-than"),
    LENGTH_LESS_THAN_OR_EQUAL("length-less-than-or-equal");

    @JsonValue
    private final String value;

    private ListLengthFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
