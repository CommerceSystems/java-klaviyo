/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetActionsForFlowQueryParamSort - For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
 */
public enum GetActionsForFlowQueryParamSort {
    ACTION_TYPE("action_type"),
    MINUS_ACTION_TYPE("-action_type"),
    CREATED("created"),
    MINUS_CREATED("-created"),
    ID("id"),
    MINUS_ID("-id"),
    STATUS("status"),
    MINUS_STATUS("-status"),
    UPDATED("updated"),
    MINUS_UPDATED("-updated");

    @JsonValue
    private final String value;

    private GetActionsForFlowQueryParamSort(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}