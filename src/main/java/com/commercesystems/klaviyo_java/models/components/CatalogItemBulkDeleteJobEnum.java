/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum CatalogItemBulkDeleteJobEnum {
    CATALOG_ITEM_BULK_DELETE_JOB("catalog-item-bulk-delete-job");

    @JsonValue
    private final String value;

    private CatalogItemBulkDeleteJobEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
