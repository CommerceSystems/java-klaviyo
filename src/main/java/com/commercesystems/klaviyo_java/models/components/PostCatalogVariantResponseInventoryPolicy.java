/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PostCatalogVariantResponseInventoryPolicy - This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values:
 * `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock.
 * `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity.
 */
public enum PostCatalogVariantResponseInventoryPolicy {
    ZERO(0L),
    ONE(1L),
    TWO(2L);

    @JsonValue
    private final long value;

    private PostCatalogVariantResponseInventoryPolicy(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
}