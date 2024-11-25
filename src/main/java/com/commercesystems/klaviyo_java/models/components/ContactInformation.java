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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class ContactInformation {

    /**
     * This field is used to auto-populate the default sender name on flow and campaign emails.
     */
    @JsonProperty("default_sender_name")
    private String defaultSenderName;

    /**
     * This field is used to auto-populate the default sender email address on flow and campaign emails.
     */
    @JsonProperty("default_sender_email")
    private String defaultSenderEmail;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("website_url")
    private JsonNullable<String> websiteUrl;

    @JsonProperty("organization_name")
    private String organizationName;

    @JsonProperty("street_address")
    private StreetAddress streetAddress;

    @JsonCreator
    public ContactInformation(
            @JsonProperty("default_sender_name") String defaultSenderName,
            @JsonProperty("default_sender_email") String defaultSenderEmail,
            @JsonProperty("website_url") JsonNullable<String> websiteUrl,
            @JsonProperty("organization_name") String organizationName,
            @JsonProperty("street_address") StreetAddress streetAddress) {
        Utils.checkNotNull(defaultSenderName, "defaultSenderName");
        Utils.checkNotNull(defaultSenderEmail, "defaultSenderEmail");
        Utils.checkNotNull(websiteUrl, "websiteUrl");
        Utils.checkNotNull(organizationName, "organizationName");
        Utils.checkNotNull(streetAddress, "streetAddress");
        this.defaultSenderName = defaultSenderName;
        this.defaultSenderEmail = defaultSenderEmail;
        this.websiteUrl = websiteUrl;
        this.organizationName = organizationName;
        this.streetAddress = streetAddress;
    }
    
    public ContactInformation(
            String defaultSenderName,
            String defaultSenderEmail,
            String organizationName,
            StreetAddress streetAddress) {
        this(defaultSenderName, defaultSenderEmail, JsonNullable.undefined(), organizationName, streetAddress);
    }

    /**
     * This field is used to auto-populate the default sender name on flow and campaign emails.
     */
    @JsonIgnore
    public String defaultSenderName() {
        return defaultSenderName;
    }

    /**
     * This field is used to auto-populate the default sender email address on flow and campaign emails.
     */
    @JsonIgnore
    public String defaultSenderEmail() {
        return defaultSenderEmail;
    }

    @JsonIgnore
    public JsonNullable<String> websiteUrl() {
        return websiteUrl;
    }

    @JsonIgnore
    public String organizationName() {
        return organizationName;
    }

    @JsonIgnore
    public StreetAddress streetAddress() {
        return streetAddress;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * This field is used to auto-populate the default sender name on flow and campaign emails.
     */
    public ContactInformation withDefaultSenderName(String defaultSenderName) {
        Utils.checkNotNull(defaultSenderName, "defaultSenderName");
        this.defaultSenderName = defaultSenderName;
        return this;
    }

    /**
     * This field is used to auto-populate the default sender email address on flow and campaign emails.
     */
    public ContactInformation withDefaultSenderEmail(String defaultSenderEmail) {
        Utils.checkNotNull(defaultSenderEmail, "defaultSenderEmail");
        this.defaultSenderEmail = defaultSenderEmail;
        return this;
    }

    public ContactInformation withWebsiteUrl(String websiteUrl) {
        Utils.checkNotNull(websiteUrl, "websiteUrl");
        this.websiteUrl = JsonNullable.of(websiteUrl);
        return this;
    }

    public ContactInformation withWebsiteUrl(JsonNullable<String> websiteUrl) {
        Utils.checkNotNull(websiteUrl, "websiteUrl");
        this.websiteUrl = websiteUrl;
        return this;
    }

    public ContactInformation withOrganizationName(String organizationName) {
        Utils.checkNotNull(organizationName, "organizationName");
        this.organizationName = organizationName;
        return this;
    }

    public ContactInformation withStreetAddress(StreetAddress streetAddress) {
        Utils.checkNotNull(streetAddress, "streetAddress");
        this.streetAddress = streetAddress;
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
        ContactInformation other = (ContactInformation) o;
        return 
            Objects.deepEquals(this.defaultSenderName, other.defaultSenderName) &&
            Objects.deepEquals(this.defaultSenderEmail, other.defaultSenderEmail) &&
            Objects.deepEquals(this.websiteUrl, other.websiteUrl) &&
            Objects.deepEquals(this.organizationName, other.organizationName) &&
            Objects.deepEquals(this.streetAddress, other.streetAddress);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            defaultSenderName,
            defaultSenderEmail,
            websiteUrl,
            organizationName,
            streetAddress);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContactInformation.class,
                "defaultSenderName", defaultSenderName,
                "defaultSenderEmail", defaultSenderEmail,
                "websiteUrl", websiteUrl,
                "organizationName", organizationName,
                "streetAddress", streetAddress);
    }
    
    public final static class Builder {
 
        private String defaultSenderName;
 
        private String defaultSenderEmail;
 
        private JsonNullable<String> websiteUrl = JsonNullable.undefined();
 
        private String organizationName;
 
        private StreetAddress streetAddress;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * This field is used to auto-populate the default sender name on flow and campaign emails.
         */
        public Builder defaultSenderName(String defaultSenderName) {
            Utils.checkNotNull(defaultSenderName, "defaultSenderName");
            this.defaultSenderName = defaultSenderName;
            return this;
        }

        /**
         * This field is used to auto-populate the default sender email address on flow and campaign emails.
         */
        public Builder defaultSenderEmail(String defaultSenderEmail) {
            Utils.checkNotNull(defaultSenderEmail, "defaultSenderEmail");
            this.defaultSenderEmail = defaultSenderEmail;
            return this;
        }

        public Builder websiteUrl(String websiteUrl) {
            Utils.checkNotNull(websiteUrl, "websiteUrl");
            this.websiteUrl = JsonNullable.of(websiteUrl);
            return this;
        }

        public Builder websiteUrl(JsonNullable<String> websiteUrl) {
            Utils.checkNotNull(websiteUrl, "websiteUrl");
            this.websiteUrl = websiteUrl;
            return this;
        }

        public Builder organizationName(String organizationName) {
            Utils.checkNotNull(organizationName, "organizationName");
            this.organizationName = organizationName;
            return this;
        }

        public Builder streetAddress(StreetAddress streetAddress) {
            Utils.checkNotNull(streetAddress, "streetAddress");
            this.streetAddress = streetAddress;
            return this;
        }
        
        public ContactInformation build() {
            return new ContactInformation(
                defaultSenderName,
                defaultSenderEmail,
                websiteUrl,
                organizationName,
                streetAddress);
        }
    }
}

