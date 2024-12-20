/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ProfilePredictiveAnalyticsStringConditionDimension - Dimension for string profile predictive analytics conditions.
 */
public enum ProfilePredictiveAnalyticsStringConditionDimension {
    PREDICTED_GENDER("predicted_gender");

    @JsonValue
    private final String value;

    private ProfilePredictiveAnalyticsStringConditionDimension(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
