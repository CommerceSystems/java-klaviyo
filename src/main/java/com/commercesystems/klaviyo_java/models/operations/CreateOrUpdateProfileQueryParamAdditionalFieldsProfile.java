/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum CreateOrUpdateProfileQueryParamAdditionalFieldsProfile {
    SUBSCRIPTIONS("subscriptions"),
    PREDICTIVE_ANALYTICS("predictive_analytics");

    @JsonValue
    private final String value;

    private CreateOrUpdateProfileQueryParamAdditionalFieldsProfile(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
