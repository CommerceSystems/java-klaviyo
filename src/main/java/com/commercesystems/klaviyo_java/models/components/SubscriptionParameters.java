/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class SubscriptionParameters {

    /**
     * The Consent status to be set as part of the subscribe call. Currently supports "SUBSCRIBED".
     */
    @JsonProperty("consent")
    private SubscriptionParametersConsent consent;

    /**
     * The timestamp of when the profile's consent was gathered. This should only be used when syncing over historical consent info to Klaviyo; if the `historical_import` flag is not included, providing any value for this field will raise an error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("consented_at")
    private JsonNullable<OffsetDateTime> consentedAt;

    @JsonCreator
    public SubscriptionParameters(
            @JsonProperty("consent") SubscriptionParametersConsent consent,
            @JsonProperty("consented_at") JsonNullable<OffsetDateTime> consentedAt) {
        Utils.checkNotNull(consent, "consent");
        Utils.checkNotNull(consentedAt, "consentedAt");
        this.consent = consent;
        this.consentedAt = consentedAt;
    }
    
    public SubscriptionParameters(
            SubscriptionParametersConsent consent) {
        this(consent, JsonNullable.undefined());
    }

    /**
     * The Consent status to be set as part of the subscribe call. Currently supports "SUBSCRIBED".
     */
    @JsonIgnore
    public SubscriptionParametersConsent consent() {
        return consent;
    }

    /**
     * The timestamp of when the profile's consent was gathered. This should only be used when syncing over historical consent info to Klaviyo; if the `historical_import` flag is not included, providing any value for this field will raise an error.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> consentedAt() {
        return consentedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Consent status to be set as part of the subscribe call. Currently supports "SUBSCRIBED".
     */
    public SubscriptionParameters withConsent(SubscriptionParametersConsent consent) {
        Utils.checkNotNull(consent, "consent");
        this.consent = consent;
        return this;
    }

    /**
     * The timestamp of when the profile's consent was gathered. This should only be used when syncing over historical consent info to Klaviyo; if the `historical_import` flag is not included, providing any value for this field will raise an error.
     */
    public SubscriptionParameters withConsentedAt(OffsetDateTime consentedAt) {
        Utils.checkNotNull(consentedAt, "consentedAt");
        this.consentedAt = JsonNullable.of(consentedAt);
        return this;
    }

    /**
     * The timestamp of when the profile's consent was gathered. This should only be used when syncing over historical consent info to Klaviyo; if the `historical_import` flag is not included, providing any value for this field will raise an error.
     */
    public SubscriptionParameters withConsentedAt(JsonNullable<OffsetDateTime> consentedAt) {
        Utils.checkNotNull(consentedAt, "consentedAt");
        this.consentedAt = consentedAt;
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
        SubscriptionParameters other = (SubscriptionParameters) o;
        return 
            Objects.deepEquals(this.consent, other.consent) &&
            Objects.deepEquals(this.consentedAt, other.consentedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            consent,
            consentedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SubscriptionParameters.class,
                "consent", consent,
                "consentedAt", consentedAt);
    }
    
    public final static class Builder {
 
        private SubscriptionParametersConsent consent;
 
        private JsonNullable<OffsetDateTime> consentedAt = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Consent status to be set as part of the subscribe call. Currently supports "SUBSCRIBED".
         */
        public Builder consent(SubscriptionParametersConsent consent) {
            Utils.checkNotNull(consent, "consent");
            this.consent = consent;
            return this;
        }

        /**
         * The timestamp of when the profile's consent was gathered. This should only be used when syncing over historical consent info to Klaviyo; if the `historical_import` flag is not included, providing any value for this field will raise an error.
         */
        public Builder consentedAt(OffsetDateTime consentedAt) {
            Utils.checkNotNull(consentedAt, "consentedAt");
            this.consentedAt = JsonNullable.of(consentedAt);
            return this;
        }

        /**
         * The timestamp of when the profile's consent was gathered. This should only be used when syncing over historical consent info to Klaviyo; if the `historical_import` flag is not included, providing any value for this field will raise an error.
         */
        public Builder consentedAt(JsonNullable<OffsetDateTime> consentedAt) {
            Utils.checkNotNull(consentedAt, "consentedAt");
            this.consentedAt = consentedAt;
            return this;
        }
        
        public SubscriptionParameters build() {
            return new SubscriptionParameters(
                consent,
                consentedAt);
        }
    }
}
