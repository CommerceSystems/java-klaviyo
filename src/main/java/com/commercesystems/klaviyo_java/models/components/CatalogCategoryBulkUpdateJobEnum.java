/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum CatalogCategoryBulkUpdateJobEnum {
    CATALOG_CATEGORY_BULK_UPDATE_JOB("catalog-category-bulk-update-job");

    @JsonValue
    private final String value;

    private CatalogCategoryBulkUpdateJobEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
