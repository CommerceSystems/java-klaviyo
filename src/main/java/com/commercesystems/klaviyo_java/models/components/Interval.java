/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Interval - Aggregation interval, e.g. "hour", "day", "week", "month"
 */
public enum Interval {
    DAY("day"),
    HOUR("hour"),
    MONTH("month"),
    WEEK("week");

    @JsonValue
    private final String value;

    private Interval(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
