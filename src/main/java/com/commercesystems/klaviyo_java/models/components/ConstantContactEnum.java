/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum ConstantContactEnum {
    CONSTANT_CONTACT("constant_contact");

    @JsonValue
    private final String value;

    private ConstantContactEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}