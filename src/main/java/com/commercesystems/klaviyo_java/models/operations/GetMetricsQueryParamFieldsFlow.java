/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum GetMetricsQueryParamFieldsFlow {
    NAME("name"),
    STATUS("status"),
    ARCHIVED("archived"),
    CREATED("created"),
    UPDATED("updated"),
    TRIGGER_TYPE("trigger_type");

    @JsonValue
    private final String value;

    private GetMetricsQueryParamFieldsFlow(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
