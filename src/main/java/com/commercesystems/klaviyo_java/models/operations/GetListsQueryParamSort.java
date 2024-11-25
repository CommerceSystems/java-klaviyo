/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetListsQueryParamSort - For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
 */
public enum GetListsQueryParamSort {
    CREATED("created"),
    MINUS_CREATED("-created"),
    ID("id"),
    MINUS_ID("-id"),
    NAME("name"),
    MINUS_NAME("-name"),
    UPDATED("updated"),
    MINUS_UPDATED("-updated");

    @JsonValue
    private final String value;

    private GetListsQueryParamSort(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}