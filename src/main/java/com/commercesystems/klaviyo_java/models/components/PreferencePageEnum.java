/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PreferencePageEnum {
    PREFERENCE_PAGE("preference_page");

    @JsonValue
    private final String value;

    private PreferencePageEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}