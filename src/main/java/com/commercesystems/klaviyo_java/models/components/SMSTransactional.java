/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class SMSTransactional {

    /**
     * Whether or not this profile is subscribed to receive transactional SMS.
     */
    @JsonProperty("can_receive_sms_transactional")
    private boolean canReceiveSmsTransactional;

    /**
     * The consent status for SMS Transactional.
     */
    @JsonProperty("consent")
    private String consent;

    /**
     * The timestamp when consent was recorded or updated for Transactional SMS messaging , in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("consent_timestamp")
    private JsonNullable<OffsetDateTime> consentTimestamp;

    /**
     * The method by which the profile was subscribed to Transactional SMS messaging .
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("method")
    private JsonNullable<String> method;

    /**
     * Additional details about the method which the profile was subscribed to Transactional SMS messaging. This may be empty if no details were provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("method_detail")
    private JsonNullable<String> methodDetail;

    /**
     * The timestamp when the SMS consent record was last modified, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_updated")
    private JsonNullable<OffsetDateTime> lastUpdated;

    @JsonCreator
    public SMSTransactional(
            @JsonProperty("can_receive_sms_transactional") boolean canReceiveSmsTransactional,
            @JsonProperty("consent") String consent,
            @JsonProperty("consent_timestamp") JsonNullable<OffsetDateTime> consentTimestamp,
            @JsonProperty("method") JsonNullable<String> method,
            @JsonProperty("method_detail") JsonNullable<String> methodDetail,
            @JsonProperty("last_updated") JsonNullable<OffsetDateTime> lastUpdated) {
        Utils.checkNotNull(canReceiveSmsTransactional, "canReceiveSmsTransactional");
        Utils.checkNotNull(consent, "consent");
        Utils.checkNotNull(consentTimestamp, "consentTimestamp");
        Utils.checkNotNull(method, "method");
        Utils.checkNotNull(methodDetail, "methodDetail");
        Utils.checkNotNull(lastUpdated, "lastUpdated");
        this.canReceiveSmsTransactional = canReceiveSmsTransactional;
        this.consent = consent;
        this.consentTimestamp = consentTimestamp;
        this.method = method;
        this.methodDetail = methodDetail;
        this.lastUpdated = lastUpdated;
    }
    
    public SMSTransactional(
            boolean canReceiveSmsTransactional,
            String consent) {
        this(canReceiveSmsTransactional, consent, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Whether or not this profile is subscribed to receive transactional SMS.
     */
    @JsonIgnore
    public boolean canReceiveSmsTransactional() {
        return canReceiveSmsTransactional;
    }

    /**
     * The consent status for SMS Transactional.
     */
    @JsonIgnore
    public String consent() {
        return consent;
    }

    /**
     * The timestamp when consent was recorded or updated for Transactional SMS messaging , in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> consentTimestamp() {
        return consentTimestamp;
    }

    /**
     * The method by which the profile was subscribed to Transactional SMS messaging .
     */
    @JsonIgnore
    public JsonNullable<String> method() {
        return method;
    }

    /**
     * Additional details about the method which the profile was subscribed to Transactional SMS messaging. This may be empty if no details were provided.
     */
    @JsonIgnore
    public JsonNullable<String> methodDetail() {
        return methodDetail;
    }

    /**
     * The timestamp when the SMS consent record was last modified, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> lastUpdated() {
        return lastUpdated;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether or not this profile is subscribed to receive transactional SMS.
     */
    public SMSTransactional withCanReceiveSmsTransactional(boolean canReceiveSmsTransactional) {
        Utils.checkNotNull(canReceiveSmsTransactional, "canReceiveSmsTransactional");
        this.canReceiveSmsTransactional = canReceiveSmsTransactional;
        return this;
    }

    /**
     * The consent status for SMS Transactional.
     */
    public SMSTransactional withConsent(String consent) {
        Utils.checkNotNull(consent, "consent");
        this.consent = consent;
        return this;
    }

    /**
     * The timestamp when consent was recorded or updated for Transactional SMS messaging , in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public SMSTransactional withConsentTimestamp(OffsetDateTime consentTimestamp) {
        Utils.checkNotNull(consentTimestamp, "consentTimestamp");
        this.consentTimestamp = JsonNullable.of(consentTimestamp);
        return this;
    }

    /**
     * The timestamp when consent was recorded or updated for Transactional SMS messaging , in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public SMSTransactional withConsentTimestamp(JsonNullable<OffsetDateTime> consentTimestamp) {
        Utils.checkNotNull(consentTimestamp, "consentTimestamp");
        this.consentTimestamp = consentTimestamp;
        return this;
    }

    /**
     * The method by which the profile was subscribed to Transactional SMS messaging .
     */
    public SMSTransactional withMethod(String method) {
        Utils.checkNotNull(method, "method");
        this.method = JsonNullable.of(method);
        return this;
    }

    /**
     * The method by which the profile was subscribed to Transactional SMS messaging .
     */
    public SMSTransactional withMethod(JsonNullable<String> method) {
        Utils.checkNotNull(method, "method");
        this.method = method;
        return this;
    }

    /**
     * Additional details about the method which the profile was subscribed to Transactional SMS messaging. This may be empty if no details were provided.
     */
    public SMSTransactional withMethodDetail(String methodDetail) {
        Utils.checkNotNull(methodDetail, "methodDetail");
        this.methodDetail = JsonNullable.of(methodDetail);
        return this;
    }

    /**
     * Additional details about the method which the profile was subscribed to Transactional SMS messaging. This may be empty if no details were provided.
     */
    public SMSTransactional withMethodDetail(JsonNullable<String> methodDetail) {
        Utils.checkNotNull(methodDetail, "methodDetail");
        this.methodDetail = methodDetail;
        return this;
    }

    /**
     * The timestamp when the SMS consent record was last modified, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public SMSTransactional withLastUpdated(OffsetDateTime lastUpdated) {
        Utils.checkNotNull(lastUpdated, "lastUpdated");
        this.lastUpdated = JsonNullable.of(lastUpdated);
        return this;
    }

    /**
     * The timestamp when the SMS consent record was last modified, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public SMSTransactional withLastUpdated(JsonNullable<OffsetDateTime> lastUpdated) {
        Utils.checkNotNull(lastUpdated, "lastUpdated");
        this.lastUpdated = lastUpdated;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SMSTransactional other = (SMSTransactional) o;
        return 
            Objects.deepEquals(this.canReceiveSmsTransactional, other.canReceiveSmsTransactional) &&
            Objects.deepEquals(this.consent, other.consent) &&
            Objects.deepEquals(this.consentTimestamp, other.consentTimestamp) &&
            Objects.deepEquals(this.method, other.method) &&
            Objects.deepEquals(this.methodDetail, other.methodDetail) &&
            Objects.deepEquals(this.lastUpdated, other.lastUpdated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            canReceiveSmsTransactional,
            consent,
            consentTimestamp,
            method,
            methodDetail,
            lastUpdated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SMSTransactional.class,
                "canReceiveSmsTransactional", canReceiveSmsTransactional,
                "consent", consent,
                "consentTimestamp", consentTimestamp,
                "method", method,
                "methodDetail", methodDetail,
                "lastUpdated", lastUpdated);
    }
    
    public final static class Builder {
 
        private Boolean canReceiveSmsTransactional;
 
        private String consent;
 
        private JsonNullable<OffsetDateTime> consentTimestamp = JsonNullable.undefined();
 
        private JsonNullable<String> method = JsonNullable.undefined();
 
        private JsonNullable<String> methodDetail;
 
        private JsonNullable<OffsetDateTime> lastUpdated = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether or not this profile is subscribed to receive transactional SMS.
         */
        public Builder canReceiveSmsTransactional(boolean canReceiveSmsTransactional) {
            Utils.checkNotNull(canReceiveSmsTransactional, "canReceiveSmsTransactional");
            this.canReceiveSmsTransactional = canReceiveSmsTransactional;
            return this;
        }

        /**
         * The consent status for SMS Transactional.
         */
        public Builder consent(String consent) {
            Utils.checkNotNull(consent, "consent");
            this.consent = consent;
            return this;
        }

        /**
         * The timestamp when consent was recorded or updated for Transactional SMS messaging , in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder consentTimestamp(OffsetDateTime consentTimestamp) {
            Utils.checkNotNull(consentTimestamp, "consentTimestamp");
            this.consentTimestamp = JsonNullable.of(consentTimestamp);
            return this;
        }

        /**
         * The timestamp when consent was recorded or updated for Transactional SMS messaging , in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder consentTimestamp(JsonNullable<OffsetDateTime> consentTimestamp) {
            Utils.checkNotNull(consentTimestamp, "consentTimestamp");
            this.consentTimestamp = consentTimestamp;
            return this;
        }

        /**
         * The method by which the profile was subscribed to Transactional SMS messaging .
         */
        public Builder method(String method) {
            Utils.checkNotNull(method, "method");
            this.method = JsonNullable.of(method);
            return this;
        }

        /**
         * The method by which the profile was subscribed to Transactional SMS messaging .
         */
        public Builder method(JsonNullable<String> method) {
            Utils.checkNotNull(method, "method");
            this.method = method;
            return this;
        }

        /**
         * Additional details about the method which the profile was subscribed to Transactional SMS messaging. This may be empty if no details were provided.
         */
        public Builder methodDetail(String methodDetail) {
            Utils.checkNotNull(methodDetail, "methodDetail");
            this.methodDetail = JsonNullable.of(methodDetail);
            return this;
        }

        /**
         * Additional details about the method which the profile was subscribed to Transactional SMS messaging. This may be empty if no details were provided.
         */
        public Builder methodDetail(JsonNullable<String> methodDetail) {
            Utils.checkNotNull(methodDetail, "methodDetail");
            this.methodDetail = methodDetail;
            return this;
        }

        /**
         * The timestamp when the SMS consent record was last modified, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder lastUpdated(OffsetDateTime lastUpdated) {
            Utils.checkNotNull(lastUpdated, "lastUpdated");
            this.lastUpdated = JsonNullable.of(lastUpdated);
            return this;
        }

        /**
         * The timestamp when the SMS consent record was last modified, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder lastUpdated(JsonNullable<OffsetDateTime> lastUpdated) {
            Utils.checkNotNull(lastUpdated, "lastUpdated");
            this.lastUpdated = lastUpdated;
            return this;
        }
        
        public SMSTransactional build() {
            if (methodDetail == null) {
                methodDetail = _SINGLETON_VALUE_MethodDetail.value();
            }            return new SMSTransactional(
                canReceiveSmsTransactional,
                consent,
                consentTimestamp,
                method,
                methodDetail,
                lastUpdated);
        }

        private static final LazySingletonValue<JsonNullable<String>> _SINGLETON_VALUE_MethodDetail =
                new LazySingletonValue<>(
                        "method_detail",
                        "\"\"",
                        new TypeReference<JsonNullable<String>>() {});
    }
}
