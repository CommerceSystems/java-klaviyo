/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum BackInStockEnum {
    BACK_IN_STOCK("back_in_stock");

    @JsonValue
    private final String value;

    private BackInStockEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
