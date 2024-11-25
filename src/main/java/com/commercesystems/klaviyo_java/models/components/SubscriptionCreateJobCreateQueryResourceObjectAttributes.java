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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class SubscriptionCreateJobCreateQueryResourceObjectAttributes {

    /**
     * A custom method detail or source to store on the consent records.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_source")
    private JsonNullable<String> customSource;

    /**
     * The profile(s) to subscribe
     */
    @JsonProperty("profiles")
    private SubscriptionCreateJobCreateQueryResourceObjectProfiles profiles;

    /**
     * Whether this subscription is part of a historical import. If true, the consented_at field must be provided for each profile.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("historical_import")
    private JsonNullable<Boolean> historicalImport;

    @JsonCreator
    public SubscriptionCreateJobCreateQueryResourceObjectAttributes(
            @JsonProperty("custom_source") JsonNullable<String> customSource,
            @JsonProperty("profiles") SubscriptionCreateJobCreateQueryResourceObjectProfiles profiles,
            @JsonProperty("historical_import") JsonNullable<Boolean> historicalImport) {
        Utils.checkNotNull(customSource, "customSource");
        Utils.checkNotNull(profiles, "profiles");
        Utils.checkNotNull(historicalImport, "historicalImport");
        this.customSource = customSource;
        this.profiles = profiles;
        this.historicalImport = historicalImport;
    }
    
    public SubscriptionCreateJobCreateQueryResourceObjectAttributes(
            SubscriptionCreateJobCreateQueryResourceObjectProfiles profiles) {
        this(JsonNullable.undefined(), profiles, JsonNullable.undefined());
    }

    /**
     * A custom method detail or source to store on the consent records.
     */
    @JsonIgnore
    public JsonNullable<String> customSource() {
        return customSource;
    }

    /**
     * The profile(s) to subscribe
     */
    @JsonIgnore
    public SubscriptionCreateJobCreateQueryResourceObjectProfiles profiles() {
        return profiles;
    }

    /**
     * Whether this subscription is part of a historical import. If true, the consented_at field must be provided for each profile.
     */
    @JsonIgnore
    public JsonNullable<Boolean> historicalImport() {
        return historicalImport;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A custom method detail or source to store on the consent records.
     */
    public SubscriptionCreateJobCreateQueryResourceObjectAttributes withCustomSource(String customSource) {
        Utils.checkNotNull(customSource, "customSource");
        this.customSource = JsonNullable.of(customSource);
        return this;
    }

    /**
     * A custom method detail or source to store on the consent records.
     */
    public SubscriptionCreateJobCreateQueryResourceObjectAttributes withCustomSource(JsonNullable<String> customSource) {
        Utils.checkNotNull(customSource, "customSource");
        this.customSource = customSource;
        return this;
    }

    /**
     * The profile(s) to subscribe
     */
    public SubscriptionCreateJobCreateQueryResourceObjectAttributes withProfiles(SubscriptionCreateJobCreateQueryResourceObjectProfiles profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
        return this;
    }

    /**
     * Whether this subscription is part of a historical import. If true, the consented_at field must be provided for each profile.
     */
    public SubscriptionCreateJobCreateQueryResourceObjectAttributes withHistoricalImport(boolean historicalImport) {
        Utils.checkNotNull(historicalImport, "historicalImport");
        this.historicalImport = JsonNullable.of(historicalImport);
        return this;
    }

    /**
     * Whether this subscription is part of a historical import. If true, the consented_at field must be provided for each profile.
     */
    public SubscriptionCreateJobCreateQueryResourceObjectAttributes withHistoricalImport(JsonNullable<Boolean> historicalImport) {
        Utils.checkNotNull(historicalImport, "historicalImport");
        this.historicalImport = historicalImport;
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
        SubscriptionCreateJobCreateQueryResourceObjectAttributes other = (SubscriptionCreateJobCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.customSource, other.customSource) &&
            Objects.deepEquals(this.profiles, other.profiles) &&
            Objects.deepEquals(this.historicalImport, other.historicalImport);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customSource,
            profiles,
            historicalImport);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SubscriptionCreateJobCreateQueryResourceObjectAttributes.class,
                "customSource", customSource,
                "profiles", profiles,
                "historicalImport", historicalImport);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> customSource = JsonNullable.undefined();
 
        private SubscriptionCreateJobCreateQueryResourceObjectProfiles profiles;
 
        private JsonNullable<Boolean> historicalImport;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A custom method detail or source to store on the consent records.
         */
        public Builder customSource(String customSource) {
            Utils.checkNotNull(customSource, "customSource");
            this.customSource = JsonNullable.of(customSource);
            return this;
        }

        /**
         * A custom method detail or source to store on the consent records.
         */
        public Builder customSource(JsonNullable<String> customSource) {
            Utils.checkNotNull(customSource, "customSource");
            this.customSource = customSource;
            return this;
        }

        /**
         * The profile(s) to subscribe
         */
        public Builder profiles(SubscriptionCreateJobCreateQueryResourceObjectProfiles profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }

        /**
         * Whether this subscription is part of a historical import. If true, the consented_at field must be provided for each profile.
         */
        public Builder historicalImport(boolean historicalImport) {
            Utils.checkNotNull(historicalImport, "historicalImport");
            this.historicalImport = JsonNullable.of(historicalImport);
            return this;
        }

        /**
         * Whether this subscription is part of a historical import. If true, the consented_at field must be provided for each profile.
         */
        public Builder historicalImport(JsonNullable<Boolean> historicalImport) {
            Utils.checkNotNull(historicalImport, "historicalImport");
            this.historicalImport = historicalImport;
            return this;
        }
        
        public SubscriptionCreateJobCreateQueryResourceObjectAttributes build() {
            if (historicalImport == null) {
                historicalImport = _SINGLETON_VALUE_HistoricalImport.value();
            }            return new SubscriptionCreateJobCreateQueryResourceObjectAttributes(
                customSource,
                profiles,
                historicalImport);
        }

        private static final LazySingletonValue<JsonNullable<Boolean>> _SINGLETON_VALUE_HistoricalImport =
                new LazySingletonValue<>(
                        "historical_import",
                        "false",
                        new TypeReference<JsonNullable<Boolean>>() {});
    }
}
