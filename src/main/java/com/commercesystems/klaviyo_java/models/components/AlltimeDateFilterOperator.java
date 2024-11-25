/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * AlltimeDateFilterOperator - Operators for alltime date filters.
 */
public enum AlltimeDateFilterOperator {
    ALLTIME("alltime");

    @JsonValue
    private final String value;

    private AlltimeDateFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}