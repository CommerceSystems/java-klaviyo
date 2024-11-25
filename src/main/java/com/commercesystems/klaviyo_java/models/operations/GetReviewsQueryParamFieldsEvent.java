/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum GetReviewsQueryParamFieldsEvent {
    TIMESTAMP("timestamp"),
    EVENT_PROPERTIES("event_properties"),
    DATETIME("datetime"),
    UUID("uuid");

    @JsonValue
    private final String value;

    private GetReviewsQueryParamFieldsEvent(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
