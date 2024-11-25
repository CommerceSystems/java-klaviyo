/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum QueryParamFieldsSegment {
    NAME("name"),
    DEFINITION("definition"),
    DEFINITION_CONDITION_GROUPS("definition.condition_groups"),
    CREATED("created"),
    UPDATED("updated"),
    IS_ACTIVE("is_active"),
    IS_PROCESSING("is_processing"),
    IS_STARRED("is_starred");

    @JsonValue
    private final String value;

    private QueryParamFieldsSegment(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
