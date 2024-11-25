/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetReviewResponseDto20240715CollectionCompoundDocumentStatus - The status of this review
 */
public enum GetReviewResponseDto20240715CollectionCompoundDocumentStatus {
    FEATURED("featured"),
    PENDING("pending"),
    PUBLISHED("published"),
    REJECTED("rejected"),
    UNPUBLISHED("unpublished");

    @JsonValue
    private final String value;

    private GetReviewResponseDto20240715CollectionCompoundDocumentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
