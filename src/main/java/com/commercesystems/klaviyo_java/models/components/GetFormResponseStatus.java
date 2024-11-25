/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetFormResponseStatus - Status of the form. A live form with an in-progress draft is considered "live".
 */
public enum GetFormResponseStatus {
    DRAFT("draft"),
    LIVE("live");

    @JsonValue
    private final String value;

    private GetFormResponseStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}