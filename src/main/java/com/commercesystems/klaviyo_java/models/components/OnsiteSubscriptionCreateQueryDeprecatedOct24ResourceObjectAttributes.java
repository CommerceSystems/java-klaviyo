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


public class OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes {

    /**
     * A custom method detail or source to store on the consent records for this subscription.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_source")
    private JsonNullable<String> customSource;

    @JsonProperty("profile")
    private OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile profile;

    @JsonCreator
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes(
            @JsonProperty("custom_source") JsonNullable<String> customSource,
            @JsonProperty("profile") OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile profile) {
        Utils.checkNotNull(customSource, "customSource");
        Utils.checkNotNull(profile, "profile");
        this.customSource = customSource;
        this.profile = profile;
    }
    
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes(
            OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile profile) {
        this(JsonNullable.undefined(), profile);
    }

    /**
     * A custom method detail or source to store on the consent records for this subscription.
     */
    @JsonIgnore
    public JsonNullable<String> customSource() {
        return customSource;
    }

    @JsonIgnore
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile profile() {
        return profile;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A custom method detail or source to store on the consent records for this subscription.
     */
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes withCustomSource(String customSource) {
        Utils.checkNotNull(customSource, "customSource");
        this.customSource = JsonNullable.of(customSource);
        return this;
    }

    /**
     * A custom method detail or source to store on the consent records for this subscription.
     */
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes withCustomSource(JsonNullable<String> customSource) {
        Utils.checkNotNull(customSource, "customSource");
        this.customSource = customSource;
        return this;
    }

    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes withProfile(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = profile;
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
        OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes other = (OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.customSource, other.customSource) &&
            Objects.deepEquals(this.profile, other.profile);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customSource,
            profile);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes.class,
                "customSource", customSource,
                "profile", profile);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> customSource = JsonNullable.undefined();
 
        private OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile profile;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A custom method detail or source to store on the consent records for this subscription.
         */
        public Builder customSource(String customSource) {
            Utils.checkNotNull(customSource, "customSource");
            this.customSource = JsonNullable.of(customSource);
            return this;
        }

        /**
         * A custom method detail or source to store on the consent records for this subscription.
         */
        public Builder customSource(JsonNullable<String> customSource) {
            Utils.checkNotNull(customSource, "customSource");
            this.customSource = customSource;
            return this;
        }

        public Builder profile(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }
        
        public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes build() {
            return new OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes(
                customSource,
                profile);
        }
    }
}

