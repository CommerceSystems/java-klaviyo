/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum ProfileSubscriptionBulkDeleteJobEnum {
    PROFILE_SUBSCRIPTION_BULK_DELETE_JOB("profile-subscription-bulk-delete-job");

    @JsonValue
    private final String value;

    private ProfileSubscriptionBulkDeleteJobEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
