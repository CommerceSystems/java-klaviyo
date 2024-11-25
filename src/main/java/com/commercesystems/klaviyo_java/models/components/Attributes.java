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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class Attributes {

    /**
     * Indicates if the account is a test account. Test accounts are not a separate testing engineering environment. Test accounts use the same production environment as normal Klaviyo accounts. This feature is primarily UI based to reduce human errors
     */
    @JsonProperty("test_account")
    private boolean testAccount;

    @JsonProperty("contact_information")
    private ContactInformation contactInformation;

    /**
     * The kind of business and/or types of goods that the business sells. This is leveraged in Klaviyo analytics and guidance.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("industry")
    private JsonNullable<String> industry;

    /**
     * The account's timezone is used when displaying dates and times. This is an IANA timezone. See [the full list here ](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
     */
    @JsonProperty("timezone")
    private String timezone;

    /**
     * The preferred currency for the account. This is the currency used for currency-based metrics in dashboards, analytics, coupons, and templates.
     */
    @JsonProperty("preferred_currency")
    private String preferredCurrency;

    /**
     * The Public API Key can be used for client-side API calls. [More info here](https://developers.klaviyo.com/en/docs/retrieve_api_credentials).
     */
    @JsonProperty("public_api_key")
    private String publicApiKey;

    /**
     * The account's locale is used to determine the region and language for the account.
     */
    @JsonProperty("locale")
    private String locale;

    @JsonCreator
    public Attributes(
            @JsonProperty("test_account") boolean testAccount,
            @JsonProperty("contact_information") ContactInformation contactInformation,
            @JsonProperty("industry") JsonNullable<String> industry,
            @JsonProperty("timezone") String timezone,
            @JsonProperty("preferred_currency") String preferredCurrency,
            @JsonProperty("public_api_key") String publicApiKey,
            @JsonProperty("locale") String locale) {
        Utils.checkNotNull(testAccount, "testAccount");
        Utils.checkNotNull(contactInformation, "contactInformation");
        Utils.checkNotNull(industry, "industry");
        Utils.checkNotNull(timezone, "timezone");
        Utils.checkNotNull(preferredCurrency, "preferredCurrency");
        Utils.checkNotNull(publicApiKey, "publicApiKey");
        Utils.checkNotNull(locale, "locale");
        this.testAccount = testAccount;
        this.contactInformation = contactInformation;
        this.industry = industry;
        this.timezone = timezone;
        this.preferredCurrency = preferredCurrency;
        this.publicApiKey = publicApiKey;
        this.locale = locale;
    }
    
    public Attributes(
            boolean testAccount,
            ContactInformation contactInformation,
            String timezone,
            String preferredCurrency,
            String publicApiKey,
            String locale) {
        this(testAccount, contactInformation, JsonNullable.undefined(), timezone, preferredCurrency, publicApiKey, locale);
    }

    /**
     * Indicates if the account is a test account. Test accounts are not a separate testing engineering environment. Test accounts use the same production environment as normal Klaviyo accounts. This feature is primarily UI based to reduce human errors
     */
    @JsonIgnore
    public boolean testAccount() {
        return testAccount;
    }

    @JsonIgnore
    public ContactInformation contactInformation() {
        return contactInformation;
    }

    /**
     * The kind of business and/or types of goods that the business sells. This is leveraged in Klaviyo analytics and guidance.
     */
    @JsonIgnore
    public JsonNullable<String> industry() {
        return industry;
    }

    /**
     * The account's timezone is used when displaying dates and times. This is an IANA timezone. See [the full list here ](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
     */
    @JsonIgnore
    public String timezone() {
        return timezone;
    }

    /**
     * The preferred currency for the account. This is the currency used for currency-based metrics in dashboards, analytics, coupons, and templates.
     */
    @JsonIgnore
    public String preferredCurrency() {
        return preferredCurrency;
    }

    /**
     * The Public API Key can be used for client-side API calls. [More info here](https://developers.klaviyo.com/en/docs/retrieve_api_credentials).
     */
    @JsonIgnore
    public String publicApiKey() {
        return publicApiKey;
    }

    /**
     * The account's locale is used to determine the region and language for the account.
     */
    @JsonIgnore
    public String locale() {
        return locale;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Indicates if the account is a test account. Test accounts are not a separate testing engineering environment. Test accounts use the same production environment as normal Klaviyo accounts. This feature is primarily UI based to reduce human errors
     */
    public Attributes withTestAccount(boolean testAccount) {
        Utils.checkNotNull(testAccount, "testAccount");
        this.testAccount = testAccount;
        return this;
    }

    public Attributes withContactInformation(ContactInformation contactInformation) {
        Utils.checkNotNull(contactInformation, "contactInformation");
        this.contactInformation = contactInformation;
        return this;
    }

    /**
     * The kind of business and/or types of goods that the business sells. This is leveraged in Klaviyo analytics and guidance.
     */
    public Attributes withIndustry(String industry) {
        Utils.checkNotNull(industry, "industry");
        this.industry = JsonNullable.of(industry);
        return this;
    }

    /**
     * The kind of business and/or types of goods that the business sells. This is leveraged in Klaviyo analytics and guidance.
     */
    public Attributes withIndustry(JsonNullable<String> industry) {
        Utils.checkNotNull(industry, "industry");
        this.industry = industry;
        return this;
    }

    /**
     * The account's timezone is used when displaying dates and times. This is an IANA timezone. See [the full list here ](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
     */
    public Attributes withTimezone(String timezone) {
        Utils.checkNotNull(timezone, "timezone");
        this.timezone = timezone;
        return this;
    }

    /**
     * The preferred currency for the account. This is the currency used for currency-based metrics in dashboards, analytics, coupons, and templates.
     */
    public Attributes withPreferredCurrency(String preferredCurrency) {
        Utils.checkNotNull(preferredCurrency, "preferredCurrency");
        this.preferredCurrency = preferredCurrency;
        return this;
    }

    /**
     * The Public API Key can be used for client-side API calls. [More info here](https://developers.klaviyo.com/en/docs/retrieve_api_credentials).
     */
    public Attributes withPublicApiKey(String publicApiKey) {
        Utils.checkNotNull(publicApiKey, "publicApiKey");
        this.publicApiKey = publicApiKey;
        return this;
    }

    /**
     * The account's locale is used to determine the region and language for the account.
     */
    public Attributes withLocale(String locale) {
        Utils.checkNotNull(locale, "locale");
        this.locale = locale;
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
        Attributes other = (Attributes) o;
        return 
            Objects.deepEquals(this.testAccount, other.testAccount) &&
            Objects.deepEquals(this.contactInformation, other.contactInformation) &&
            Objects.deepEquals(this.industry, other.industry) &&
            Objects.deepEquals(this.timezone, other.timezone) &&
            Objects.deepEquals(this.preferredCurrency, other.preferredCurrency) &&
            Objects.deepEquals(this.publicApiKey, other.publicApiKey) &&
            Objects.deepEquals(this.locale, other.locale);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            testAccount,
            contactInformation,
            industry,
            timezone,
            preferredCurrency,
            publicApiKey,
            locale);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Attributes.class,
                "testAccount", testAccount,
                "contactInformation", contactInformation,
                "industry", industry,
                "timezone", timezone,
                "preferredCurrency", preferredCurrency,
                "publicApiKey", publicApiKey,
                "locale", locale);
    }
    
    public final static class Builder {
 
        private Boolean testAccount;
 
        private ContactInformation contactInformation;
 
        private JsonNullable<String> industry = JsonNullable.undefined();
 
        private String timezone;
 
        private String preferredCurrency;
 
        private String publicApiKey;
 
        private String locale;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Indicates if the account is a test account. Test accounts are not a separate testing engineering environment. Test accounts use the same production environment as normal Klaviyo accounts. This feature is primarily UI based to reduce human errors
         */
        public Builder testAccount(boolean testAccount) {
            Utils.checkNotNull(testAccount, "testAccount");
            this.testAccount = testAccount;
            return this;
        }

        public Builder contactInformation(ContactInformation contactInformation) {
            Utils.checkNotNull(contactInformation, "contactInformation");
            this.contactInformation = contactInformation;
            return this;
        }

        /**
         * The kind of business and/or types of goods that the business sells. This is leveraged in Klaviyo analytics and guidance.
         */
        public Builder industry(String industry) {
            Utils.checkNotNull(industry, "industry");
            this.industry = JsonNullable.of(industry);
            return this;
        }

        /**
         * The kind of business and/or types of goods that the business sells. This is leveraged in Klaviyo analytics and guidance.
         */
        public Builder industry(JsonNullable<String> industry) {
            Utils.checkNotNull(industry, "industry");
            this.industry = industry;
            return this;
        }

        /**
         * The account's timezone is used when displaying dates and times. This is an IANA timezone. See [the full list here ](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
         */
        public Builder timezone(String timezone) {
            Utils.checkNotNull(timezone, "timezone");
            this.timezone = timezone;
            return this;
        }

        /**
         * The preferred currency for the account. This is the currency used for currency-based metrics in dashboards, analytics, coupons, and templates.
         */
        public Builder preferredCurrency(String preferredCurrency) {
            Utils.checkNotNull(preferredCurrency, "preferredCurrency");
            this.preferredCurrency = preferredCurrency;
            return this;
        }

        /**
         * The Public API Key can be used for client-side API calls. [More info here](https://developers.klaviyo.com/en/docs/retrieve_api_credentials).
         */
        public Builder publicApiKey(String publicApiKey) {
            Utils.checkNotNull(publicApiKey, "publicApiKey");
            this.publicApiKey = publicApiKey;
            return this;
        }

        /**
         * The account's locale is used to determine the region and language for the account.
         */
        public Builder locale(String locale) {
            Utils.checkNotNull(locale, "locale");
            this.locale = locale;
            return this;
        }
        
        public Attributes build() {
            return new Attributes(
                testAccount,
                contactInformation,
                industry,
                timezone,
                preferredCurrency,
                publicApiKey,
                locale);
        }
    }
}
