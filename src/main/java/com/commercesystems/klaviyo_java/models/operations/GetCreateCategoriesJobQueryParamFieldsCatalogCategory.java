/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum GetCreateCategoriesJobQueryParamFieldsCatalogCategory {
    EXTERNAL_ID("external_id"),
    NAME("name"),
    UPDATED("updated");

    @JsonValue
    private final String value;

    private GetCreateCategoriesJobQueryParamFieldsCatalogCategory(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}