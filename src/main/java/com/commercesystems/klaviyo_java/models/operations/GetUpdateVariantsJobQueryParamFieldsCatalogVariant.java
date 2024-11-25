/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum GetUpdateVariantsJobQueryParamFieldsCatalogVariant {
    EXTERNAL_ID("external_id"),
    TITLE("title"),
    DESCRIPTION("description"),
    SKU("sku"),
    INVENTORY_POLICY("inventory_policy"),
    INVENTORY_QUANTITY("inventory_quantity"),
    PRICE("price"),
    URL("url"),
    IMAGE_FULL_URL("image_full_url"),
    IMAGE_THUMBNAIL_URL("image_thumbnail_url"),
    IMAGES("images"),
    CUSTOM_METADATA("custom_metadata"),
    PUBLISHED("published"),
    CREATED("created"),
    UPDATED("updated");

    @JsonValue
    private final String value;

    private GetUpdateVariantsJobQueryParamFieldsCatalogVariant(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
