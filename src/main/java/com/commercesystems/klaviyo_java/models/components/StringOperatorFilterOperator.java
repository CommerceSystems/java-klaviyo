/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * StringOperatorFilterOperator - Operators for string filters.
 */
public enum StringOperatorFilterOperator {
    CONTAINS("contains"),
    ENDS_WITH("ends-with"),
    EQUALS("equals"),
    NOT_CONTAINS("not-contains"),
    NOT_ENDS_WITH("not-ends-with"),
    NOT_EQUALS("not-equals"),
    NOT_STARTS_WITH("not-starts-with"),
    STARTS_WITH("starts-with");

    @JsonValue
    private final String value;

    private StringOperatorFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}