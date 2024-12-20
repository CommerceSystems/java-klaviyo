/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Region - Regions for profile region conditions.
 */
public enum Region {
    EUROPEAN_UNION("european_union"),
    UNITED_STATES("united_states");

    @JsonValue
    private final String value;

    private Region(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
