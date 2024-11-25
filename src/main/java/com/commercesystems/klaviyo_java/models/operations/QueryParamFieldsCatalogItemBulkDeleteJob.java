/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum QueryParamFieldsCatalogItemBulkDeleteJob {
    STATUS("status"),
    CREATED_AT("created_at"),
    TOTAL_COUNT("total_count"),
    COMPLETED_COUNT("completed_count"),
    FAILED_COUNT("failed_count"),
    COMPLETED_AT("completed_at"),
    ERRORS("errors"),
    EXPIRES_AT("expires_at");

    @JsonValue
    private final String value;

    private QueryParamFieldsCatalogItemBulkDeleteJob(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
