/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum MailboxProviderEnum {
    MAILBOX_PROVIDER("mailbox_provider");

    @JsonValue
    private final String value;

    private MailboxProviderEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
