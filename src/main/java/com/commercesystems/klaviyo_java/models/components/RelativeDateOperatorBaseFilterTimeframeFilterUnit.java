/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * RelativeDateOperatorBaseFilterTimeframeFilterUnit - Units for relative date filters.
 */
public enum RelativeDateOperatorBaseFilterTimeframeFilterUnit {
    DAY("day"),
    HOUR("hour"),
    WEEK("week");

    @JsonValue
    private final String value;

    private RelativeDateOperatorBaseFilterTimeframeFilterUnit(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
