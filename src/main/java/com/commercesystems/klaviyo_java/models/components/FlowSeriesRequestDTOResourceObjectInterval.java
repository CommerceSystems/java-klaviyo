/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * FlowSeriesRequestDTOResourceObjectInterval - The interval used to aggregate data within the series request.
 * If hourly is used, the timeframe cannot be longer than 7 days.
 * If daily is used, the timeframe cannot be longer than 60 days.
 * If monthly is used, the timeframe cannot be longer than 52 weeks.
 */
public enum FlowSeriesRequestDTOResourceObjectInterval {
    DAILY("daily"),
    HOURLY("hourly"),
    MONTHLY("monthly"),
    WEEKLY("weekly");

    @JsonValue
    private final String value;

    private FlowSeriesRequestDTOResourceObjectInterval(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
