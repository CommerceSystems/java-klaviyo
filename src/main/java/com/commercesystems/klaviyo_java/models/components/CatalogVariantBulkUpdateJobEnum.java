/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum CatalogVariantBulkUpdateJobEnum {
    CATALOG_VARIANT_BULK_UPDATE_JOB("catalog-variant-bulk-update-job");

    @JsonValue
    private final String value;

    private CatalogVariantBulkUpdateJobEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}