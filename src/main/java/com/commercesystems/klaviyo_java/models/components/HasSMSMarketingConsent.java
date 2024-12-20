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


public class HasSMSMarketingConsent {

    @JsonProperty("channel")
    private SmsEnum channel;

    @JsonProperty("can_receive_marketing")
    private HasSMSMarketingConsentCanReceiveMarketing canReceiveMarketing;

    @JsonProperty("consent_status")
    private HasSMSMarketingSubscribed consentStatus;

    @JsonCreator
    public HasSMSMarketingConsent(
            @JsonProperty("channel") SmsEnum channel,
            @JsonProperty("can_receive_marketing") HasSMSMarketingConsentCanReceiveMarketing canReceiveMarketing,
            @JsonProperty("consent_status") HasSMSMarketingSubscribed consentStatus) {
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
    public HasSMSMarketingConsentCanReceiveMarketing canReceiveMarketing() {
        return canReceiveMarketing;
    }

    @JsonIgnore
    public HasSMSMarketingSubscribed consentStatus() {
        return consentStatus;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HasSMSMarketingConsent withChannel(SmsEnum channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = channel;
        return this;
    }

    public HasSMSMarketingConsent withCanReceiveMarketing(HasSMSMarketingConsentCanReceiveMarketing canReceiveMarketing) {
        Utils.checkNotNull(canReceiveMarketing, "canReceiveMarketing");
        this.canReceiveMarketing = canReceiveMarketing;
        return this;
    }

    public HasSMSMarketingConsent withConsentStatus(HasSMSMarketingSubscribed consentStatus) {
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
        HasSMSMarketingConsent other = (HasSMSMarketingConsent) o;
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
        return Utils.toString(HasSMSMarketingConsent.class,
                "channel", channel,
                "canReceiveMarketing", canReceiveMarketing,
                "consentStatus", consentStatus);
    }
    
    public final static class Builder {
 
        private SmsEnum channel;
 
        private HasSMSMarketingConsentCanReceiveMarketing canReceiveMarketing;
 
        private HasSMSMarketingSubscribed consentStatus;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder channel(SmsEnum channel) {
            Utils.checkNotNull(channel, "channel");
            this.channel = channel;
            return this;
        }

        public Builder canReceiveMarketing(HasSMSMarketingConsentCanReceiveMarketing canReceiveMarketing) {
            Utils.checkNotNull(canReceiveMarketing, "canReceiveMarketing");
            this.canReceiveMarketing = canReceiveMarketing;
            return this;
        }

        public Builder consentStatus(HasSMSMarketingSubscribed consentStatus) {
            Utils.checkNotNull(consentStatus, "consentStatus");
            this.consentStatus = consentStatus;
            return this;
        }
        
        public HasSMSMarketingConsent build() {
            return new HasSMSMarketingConsent(
                channel,
                canReceiveMarketing,
                consentStatus);
        }
    }
}

