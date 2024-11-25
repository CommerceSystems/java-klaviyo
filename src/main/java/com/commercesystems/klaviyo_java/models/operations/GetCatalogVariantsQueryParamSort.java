/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetCatalogVariantsQueryParamSort - For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
 */
public enum GetCatalogVariantsQueryParamSort {
    CREATED("created"),
    MINUS_CREATED("-created");

    @JsonValue
    private final String value;

    private GetCatalogVariantsQueryParamSort(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
