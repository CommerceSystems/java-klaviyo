/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ClientBISSubscriptionCreateQueryResourceObjectChannels - The different channel types that a profile could subscribe to BIS notifications for
 */
public enum ClientBISSubscriptionCreateQueryResourceObjectChannels {
    EMAIL("EMAIL"),
    PUSH("PUSH"),
    SMS("SMS");

    @JsonValue
    private final String value;

    private ClientBISSubscriptionCreateQueryResourceObjectChannels(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}