/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum FieldsImage {
    NAME("name"),
    IMAGE_URL("image_url"),
    FORMAT("format"),
    SIZE("size"),
    HIDDEN("hidden"),
    UPDATED_AT("updated_at");

    @JsonValue
    private final String value;

    private FieldsImage(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}