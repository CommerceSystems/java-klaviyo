/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * EnablementStatus - This is the enablement status for the individual push token.
 */
public enum EnablementStatus {
    AUTHORIZED("AUTHORIZED"),
    DENIED("DENIED"),
    NOT_DETERMINED("NOT_DETERMINED"),
    PROVISIONAL("PROVISIONAL"),
    UNAUTHORIZED("UNAUTHORIZED");

    @JsonValue
    private final String value;

    private EnablementStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
