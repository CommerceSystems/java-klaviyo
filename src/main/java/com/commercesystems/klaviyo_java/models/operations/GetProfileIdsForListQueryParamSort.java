/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetProfileIdsForListQueryParamSort - For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
 */
public enum GetProfileIdsForListQueryParamSort {
    JOINED_GROUP_AT("joined_group_at"),
    MINUS_JOINED_GROUP_AT("-joined_group_at");

    @JsonValue
    private final String value;

    private GetProfileIdsForListQueryParamSort(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
