/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * CalendarDateFilterOperator - Operators for calendar date filters.
 */
public enum CalendarDateFilterOperator {
    CALENDAR_MONTH("calendar-month");

    @JsonValue
    private final String value;

    private CalendarDateFilterOperator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
