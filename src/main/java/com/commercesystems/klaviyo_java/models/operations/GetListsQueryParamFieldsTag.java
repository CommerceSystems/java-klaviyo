/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum GetListsQueryParamFieldsTag {
    NAME("name");

    @JsonValue
    private final String value;

    private GetListsQueryParamFieldsTag(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
