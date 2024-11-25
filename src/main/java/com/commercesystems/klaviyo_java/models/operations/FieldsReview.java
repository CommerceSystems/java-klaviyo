/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum FieldsReview {
    EMAIL("email"),
    STATUS("status"),
    VERIFIED("verified"),
    REVIEW_TYPE("review_type"),
    CREATED("created"),
    UPDATED("updated"),
    IMAGES("images"),
    PRODUCT("product"),
    PRODUCT_URL("product.url"),
    PRODUCT_NAME("product.name"),
    PRODUCT_IMAGE_URL("product.image_url"),
    RATING("rating"),
    AUTHOR("author"),
    CONTENT("content"),
    TITLE("title"),
    SMART_QUOTE("smart_quote"),
    PUBLIC_REPLY("public_reply"),
    PUBLIC_REPLY_CONTENT("public_reply.content"),
    PUBLIC_REPLY_AUTHOR("public_reply.author"),
    PUBLIC_REPLY_UPDATED("public_reply.updated");

    @JsonValue
    private final String value;

    private FieldsReview(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
