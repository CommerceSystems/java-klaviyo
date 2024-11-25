/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum FieldsImportError {
    CODE("code"),
    TITLE("title"),
    DETAIL("detail"),
    SOURCE("source"),
    SOURCE_POINTER("source.pointer"),
    ORIGINAL_PAYLOAD("original_payload");

    @JsonValue
    private final String value;

    private FieldsImportError(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
