/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum CampaignSendJobEnum {
    CAMPAIGN_SEND_JOB("campaign-send-job");

    @JsonValue
    private final String value;

    private CampaignSendJobEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
