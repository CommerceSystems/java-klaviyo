/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetCatalogVariantCreateJobResponseCollectionCompoundDocumentStatus - Status of the asynchronous job.
 */
public enum GetCatalogVariantCreateJobResponseCollectionCompoundDocumentStatus {
    CANCELLED("cancelled"),
    COMPLETE("complete"),
    PROCESSING("processing"),
    QUEUED("queued");

    @JsonValue
    private final String value;

    private GetCatalogVariantCreateJobResponseCollectionCompoundDocumentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
