/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ListSetFilterFilterOperator - Operators for list contains set filters.
 */
public enum ListSetFilterFilterOperator {
    CONTAINS_ALL("contains-all"),
    CONTAINS_ANY("contains-any"),
    NOT_CONTAINS_ALL("not-contains-all"),
    NOT_CONTAINS_ANY("not-contains-any");

    @JsonValue
    private final String value;

    private ListSetFilterFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}