/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ExistenceOperatorFilterFilterOperator - Operators for existence filters.
 */
public enum ExistenceOperatorFilterFilterOperator {
    IS_SET("is-set"),
    NOT_SET("not-set");

    @JsonValue
    private final String value;

    private ExistenceOperatorFilterFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
