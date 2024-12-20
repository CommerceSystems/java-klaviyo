/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class NoSMSMarketingConsent {

    @JsonProperty("channel")
    private SmsEnum channel;

    @JsonProperty("can_receive_marketing")
    private NoSMSMarketingConsentCanReceiveMarketing canReceiveMarketing;

    @JsonProperty("consent_status")
    private NoSMSMarketingConsentConsentStatus consentStatus;

    @JsonCreator
    public NoSMSMarketingConsent(
            @JsonProperty("channel") SmsEnum channel,
            @JsonProperty("can_receive_marketing") NoSMSMarketingConsentCanReceiveMarketing canReceiveMarketing,
            @JsonProperty("consent_status") NoSMSMarketingConsentConsentStatus consentStatus) {
        Utils.checkNotNull(channel, "channel");
        Utils.checkNotNull(canReceiveMarketing, "canReceiveMarketing");
        Utils.checkNotNull(consentStatus, "consentStatus");
        this.channel = channel;
        this.canReceiveMarketing = canReceiveMarketing;
        this.consentStatus = consentStatus;
    }

    @JsonIgnore
    public SmsEnum channel() {
        return channel;
    }

    @JsonIgnore
    public NoSMSMarketingConsentCanReceiveMarketing canReceiveMarketing() {
        return canReceiveMarketing;
    }

    @JsonIgnore
    public NoSMSMarketingConsentConsentStatus consentStatus() {
        return consentStatus;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NoSMSMarketingConsent withChannel(SmsEnum channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = channel;
        return this;
    }

    public NoSMSMarketingConsent withCanReceiveMarketing(NoSMSMarketingConsentCanReceiveMarketing canReceiveMarketing) {
        Utils.checkNotNull(canReceiveMarketing, "canReceiveMarketing");
        this.canReceiveMarketing = canReceiveMarketing;
        return this;
    }

    public NoSMSMarketingConsent withConsentStatus(NoSMSMarketingConsentConsentStatus consentStatus) {
        Utils.checkNotNull(consentStatus, "consentStatus");
        this.consentStatus = consentStatus;
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
        NoSMSMarketingConsent other = (NoSMSMarketingConsent) o;
        return 
            Objects.deepEquals(this.channel, other.channel) &&
            Objects.deepEquals(this.canReceiveMarketing, other.canReceiveMarketing) &&
            Objects.deepEquals(this.consentStatus, other.consentStatus);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            channel,
            canReceiveMarketing,
            consentStatus);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NoSMSMarketingConsent.class,
                "channel", channel,
                "canReceiveMarketing", canReceiveMarketing,
                "consentStatus", consentStatus);
    }
    
    public final static class Builder {
 
        private SmsEnum channel;
 
        private NoSMSMarketingConsentCanReceiveMarketing canReceiveMarketing;
 
        private NoSMSMarketingConsentConsentStatus consentStatus;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder channel(SmsEnum channel) {
            Utils.checkNotNull(channel, "channel");
            this.channel = channel;
            return this;
        }

        public Builder canReceiveMarketing(NoSMSMarketingConsentCanReceiveMarketing canReceiveMarketing) {
            Utils.checkNotNull(canReceiveMarketing, "canReceiveMarketing");
            this.canReceiveMarketing = canReceiveMarketing;
            return this;
        }

        public Builder consentStatus(NoSMSMarketingConsentConsentStatus consentStatus) {
            Utils.checkNotNull(consentStatus, "consentStatus");
            this.consentStatus = consentStatus;
            return this;
        }
        
        public NoSMSMarketingConsent build() {
            return new NoSMSMarketingConsent(
                channel,
                canReceiveMarketing,
                consentStatus);
        }
    }
}

