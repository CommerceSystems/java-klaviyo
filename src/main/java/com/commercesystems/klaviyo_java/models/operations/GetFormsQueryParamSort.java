/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetFormsQueryParamSort - For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
 */
public enum GetFormsQueryParamSort {
    CREATED_AT("created_at"),
    MINUS_CREATED_AT("-created_at"),
    UPDATED_AT("updated_at"),
    MINUS_UPDATED_AT("-updated_at");

    @JsonValue
    private final String value;

    private GetFormsQueryParamSort(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
