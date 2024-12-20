/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Operator - Operators for numeric filters.
 */
public enum Operator {
    EQUALS("equals"),
    GREATER_THAN("greater-than"),
    GREATER_THAN_OR_EQUAL("greater-than-or-equal"),
    LESS_THAN("less-than"),
    LESS_THAN_OR_EQUAL("less-than-or-equal"),
    NOT_EQUALS("not-equals");

    @JsonValue
    private final String value;

    private Operator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
