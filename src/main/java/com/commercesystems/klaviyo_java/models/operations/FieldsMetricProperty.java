/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum FieldsMetricProperty {
    LABEL("label"),
    PROPERTY("property"),
    INFERRED_TYPE("inferred_type"),
    SAMPLE_VALUES("sample_values");

    @JsonValue
    private final String value;

    private FieldsMetricProperty(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
