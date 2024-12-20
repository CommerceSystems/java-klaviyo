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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class PushTokenCreateQueryResourceObjectAttributes {

    /**
     * A push token from APNS or FCM.
     */
    @JsonProperty("token")
    private String token;

    /**
     * The platform on which the push token was created.
     */
    @JsonProperty("platform")
    private Platform platform;

    /**
     * This is the enablement status for the individual push token.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enablement_status")
    private JsonNullable<? extends EnablementStatus> enablementStatus;

    /**
     * The vendor of the push token.
     */
    @JsonProperty("vendor")
    private Vendor vendor;

    /**
     * The background state of the push token.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("background")
    private JsonNullable<? extends Background> background;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("device_metadata")
    private Optional<? extends DeviceMetadata> deviceMetadata;

    /**
     * The profile associated with the push token to create/update
     */
    @JsonProperty("profile")
    private PushTokenCreateQueryResourceObjectProfile profile;

    @JsonCreator
    public PushTokenCreateQueryResourceObjectAttributes(
            @JsonProperty("token") String token,
            @JsonProperty("platform") Platform platform,
            @JsonProperty("enablement_status") JsonNullable<? extends EnablementStatus> enablementStatus,
            @JsonProperty("vendor") Vendor vendor,
            @JsonProperty("background") JsonNullable<? extends Background> background,
            @JsonProperty("device_metadata") Optional<? extends DeviceMetadata> deviceMetadata,
            @JsonProperty("profile") PushTokenCreateQueryResourceObjectProfile profile) {
        Utils.checkNotNull(token, "token");
        Utils.checkNotNull(platform, "platform");
        Utils.checkNotNull(enablementStatus, "enablementStatus");
        Utils.checkNotNull(vendor, "vendor");
        Utils.checkNotNull(background, "background");
        Utils.checkNotNull(deviceMetadata, "deviceMetadata");
        Utils.checkNotNull(profile, "profile");
        this.token = token;
        this.platform = platform;
        this.enablementStatus = enablementStatus;
        this.vendor = vendor;
        this.background = background;
        this.deviceMetadata = deviceMetadata;
        this.profile = profile;
    }
    
    public PushTokenCreateQueryResourceObjectAttributes(
            String token,
            Platform platform,
            Vendor vendor,
            PushTokenCreateQueryResourceObjectProfile profile) {
        this(token, platform, JsonNullable.undefined(), vendor, JsonNullable.undefined(), Optional.empty(), profile);
    }

    /**
     * A push token from APNS or FCM.
     */
    @JsonIgnore
    public String token() {
        return token;
    }

    /**
     * The platform on which the push token was created.
     */
    @JsonIgnore
    public Platform platform() {
        return platform;
    }

    /**
     * This is the enablement status for the individual push token.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EnablementStatus> enablementStatus() {
        return (JsonNullable<EnablementStatus>) enablementStatus;
    }

    /**
     * The vendor of the push token.
     */
    @JsonIgnore
    public Vendor vendor() {
        return vendor;
    }

    /**
     * The background state of the push token.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Background> background() {
        return (JsonNullable<Background>) background;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DeviceMetadata> deviceMetadata() {
        return (Optional<DeviceMetadata>) deviceMetadata;
    }

    /**
     * The profile associated with the push token to create/update
     */
    @JsonIgnore
    public PushTokenCreateQueryResourceObjectProfile profile() {
        return profile;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A push token from APNS or FCM.
     */
    public PushTokenCreateQueryResourceObjectAttributes withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
        return this;
    }

    /**
     * The platform on which the push token was created.
     */
    public PushTokenCreateQueryResourceObjectAttributes withPlatform(Platform platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = platform;
        return this;
    }

    /**
     * This is the enablement status for the individual push token.
     */
    public PushTokenCreateQueryResourceObjectAttributes withEnablementStatus(EnablementStatus enablementStatus) {
        Utils.checkNotNull(enablementStatus, "enablementStatus");
        this.enablementStatus = JsonNullable.of(enablementStatus);
        return this;
    }

    /**
     * This is the enablement status for the individual push token.
     */
    public PushTokenCreateQueryResourceObjectAttributes withEnablementStatus(JsonNullable<? extends EnablementStatus> enablementStatus) {
        Utils.checkNotNull(enablementStatus, "enablementStatus");
        this.enablementStatus = enablementStatus;
        return this;
    }

    /**
     * The vendor of the push token.
     */
    public PushTokenCreateQueryResourceObjectAttributes withVendor(Vendor vendor) {
        Utils.checkNotNull(vendor, "vendor");
        this.vendor = vendor;
        return this;
    }

    /**
     * The background state of the push token.
     */
    public PushTokenCreateQueryResourceObjectAttributes withBackground(Background background) {
        Utils.checkNotNull(background, "background");
        this.background = JsonNullable.of(background);
        return this;
    }

    /**
     * The background state of the push token.
     */
    public PushTokenCreateQueryResourceObjectAttributes withBackground(JsonNullable<? extends Background> background) {
        Utils.checkNotNull(background, "background");
        this.background = background;
        return this;
    }

    public PushTokenCreateQueryResourceObjectAttributes withDeviceMetadata(DeviceMetadata deviceMetadata) {
        Utils.checkNotNull(deviceMetadata, "deviceMetadata");
        this.deviceMetadata = Optional.ofNullable(deviceMetadata);
        return this;
    }

    public PushTokenCreateQueryResourceObjectAttributes withDeviceMetadata(Optional<? extends DeviceMetadata> deviceMetadata) {
        Utils.checkNotNull(deviceMetadata, "deviceMetadata");
        this.deviceMetadata = deviceMetadata;
        return this;
    }

    /**
     * The profile associated with the push token to create/update
     */
    public PushTokenCreateQueryResourceObjectAttributes withProfile(PushTokenCreateQueryResourceObjectProfile profile) {
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
        PushTokenCreateQueryResourceObjectAttributes other = (PushTokenCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.token, other.token) &&
            Objects.deepEquals(this.platform, other.platform) &&
            Objects.deepEquals(this.enablementStatus, other.enablementStatus) &&
            Objects.deepEquals(this.vendor, other.vendor) &&
            Objects.deepEquals(this.background, other.background) &&
            Objects.deepEquals(this.deviceMetadata, other.deviceMetadata) &&
            Objects.deepEquals(this.profile, other.profile);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            token,
            platform,
            enablementStatus,
            vendor,
            background,
            deviceMetadata,
            profile);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PushTokenCreateQueryResourceObjectAttributes.class,
                "token", token,
                "platform", platform,
                "enablementStatus", enablementStatus,
                "vendor", vendor,
                "background", background,
                "deviceMetadata", deviceMetadata,
                "profile", profile);
    }
    
    public final static class Builder {
 
        private String token;
 
        private Platform platform;
 
        private JsonNullable<? extends EnablementStatus> enablementStatus;
 
        private Vendor vendor;
 
        private JsonNullable<? extends Background> background;
 
        private Optional<? extends DeviceMetadata> deviceMetadata = Optional.empty();
 
        private PushTokenCreateQueryResourceObjectProfile profile;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A push token from APNS or FCM.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }

        /**
         * The platform on which the push token was created.
         */
        public Builder platform(Platform platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = platform;
            return this;
        }

        /**
         * This is the enablement status for the individual push token.
         */
        public Builder enablementStatus(EnablementStatus enablementStatus) {
            Utils.checkNotNull(enablementStatus, "enablementStatus");
            this.enablementStatus = JsonNullable.of(enablementStatus);
            return this;
        }

        /**
         * This is the enablement status for the individual push token.
         */
        public Builder enablementStatus(JsonNullable<? extends EnablementStatus> enablementStatus) {
            Utils.checkNotNull(enablementStatus, "enablementStatus");
            this.enablementStatus = enablementStatus;
            return this;
        }

        /**
         * The vendor of the push token.
         */
        public Builder vendor(Vendor vendor) {
            Utils.checkNotNull(vendor, "vendor");
            this.vendor = vendor;
            return this;
        }

        /**
         * The background state of the push token.
         */
        public Builder background(Background background) {
            Utils.checkNotNull(background, "background");
            this.background = JsonNullable.of(background);
            return this;
        }

        /**
         * The background state of the push token.
         */
        public Builder background(JsonNullable<? extends Background> background) {
            Utils.checkNotNull(background, "background");
            this.background = background;
            return this;
        }

        public Builder deviceMetadata(DeviceMetadata deviceMetadata) {
            Utils.checkNotNull(deviceMetadata, "deviceMetadata");
            this.deviceMetadata = Optional.ofNullable(deviceMetadata);
            return this;
        }

        public Builder deviceMetadata(Optional<? extends DeviceMetadata> deviceMetadata) {
            Utils.checkNotNull(deviceMetadata, "deviceMetadata");
            this.deviceMetadata = deviceMetadata;
            return this;
        }

        /**
         * The profile associated with the push token to create/update
         */
        public Builder profile(PushTokenCreateQueryResourceObjectProfile profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }
        
        public PushTokenCreateQueryResourceObjectAttributes build() {
            if (enablementStatus == null) {
                enablementStatus = _SINGLETON_VALUE_EnablementStatus.value();
            }
            if (background == null) {
                background = _SINGLETON_VALUE_Background.value();
            }            return new PushTokenCreateQueryResourceObjectAttributes(
                token,
                platform,
                enablementStatus,
                vendor,
                background,
                deviceMetadata,
                profile);
        }

        private static final LazySingletonValue<JsonNullable<? extends EnablementStatus>> _SINGLETON_VALUE_EnablementStatus =
                new LazySingletonValue<>(
                        "enablement_status",
                        "\"AUTHORIZED\"",
                        new TypeReference<JsonNullable<? extends EnablementStatus>>() {});

        private static final LazySingletonValue<JsonNullable<? extends Background>> _SINGLETON_VALUE_Background =
                new LazySingletonValue<>(
                        "background",
                        "\"AVAILABLE\"",
                        new TypeReference<JsonNullable<? extends Background>>() {});
    }
}

