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
import java.lang.SuppressWarnings;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class DeviceMetadata {

    /**
     * Relatively stable ID for the device. Will update on app uninstall and reinstall
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("device_id")
    private JsonNullable<String> deviceId;

    /**
     * The name of the SDK used to create the push token.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("klaviyo_sdk")
    private JsonNullable<? extends KlaviyoSDK> klaviyoSDK;

    /**
     * The version of the SDK used to create the push token
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sdk_version")
    private JsonNullable<String> sdkVersion;

    /**
     * The model of the device
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("device_model")
    private JsonNullable<String> deviceModel;

    /**
     * The name of the operating system on the device.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("os_name")
    private JsonNullable<? extends OsName> osName;

    /**
     * The version of the operating system on the device
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("os_version")
    private JsonNullable<String> osVersion;

    /**
     * The manufacturer of the device
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("manufacturer")
    private JsonNullable<String> manufacturer;

    /**
     * The name of the app that created the push token
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_name")
    private JsonNullable<String> appName;

    /**
     * The version of the app that created the push token
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_version")
    private JsonNullable<String> appVersion;

    /**
     * The build of the app that created the push token
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_build")
    private JsonNullable<String> appBuild;

    /**
     * The ID of the app that created the push token
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_id")
    private JsonNullable<String> appId;

    /**
     * The environment in which the push token was created
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("environment")
    private JsonNullable<? extends Environment> environment;

    @JsonCreator
    public DeviceMetadata(
            @JsonProperty("device_id") JsonNullable<String> deviceId,
            @JsonProperty("klaviyo_sdk") JsonNullable<? extends KlaviyoSDK> klaviyoSDK,
            @JsonProperty("sdk_version") JsonNullable<String> sdkVersion,
            @JsonProperty("device_model") JsonNullable<String> deviceModel,
            @JsonProperty("os_name") JsonNullable<? extends OsName> osName,
            @JsonProperty("os_version") JsonNullable<String> osVersion,
            @JsonProperty("manufacturer") JsonNullable<String> manufacturer,
            @JsonProperty("app_name") JsonNullable<String> appName,
            @JsonProperty("app_version") JsonNullable<String> appVersion,
            @JsonProperty("app_build") JsonNullable<String> appBuild,
            @JsonProperty("app_id") JsonNullable<String> appId,
            @JsonProperty("environment") JsonNullable<? extends Environment> environment) {
        Utils.checkNotNull(deviceId, "deviceId");
        Utils.checkNotNull(klaviyoSDK, "klaviyoSDK");
        Utils.checkNotNull(sdkVersion, "sdkVersion");
        Utils.checkNotNull(deviceModel, "deviceModel");
        Utils.checkNotNull(osName, "osName");
        Utils.checkNotNull(osVersion, "osVersion");
        Utils.checkNotNull(manufacturer, "manufacturer");
        Utils.checkNotNull(appName, "appName");
        Utils.checkNotNull(appVersion, "appVersion");
        Utils.checkNotNull(appBuild, "appBuild");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(environment, "environment");
        this.deviceId = deviceId;
        this.klaviyoSDK = klaviyoSDK;
        this.sdkVersion = sdkVersion;
        this.deviceModel = deviceModel;
        this.osName = osName;
        this.osVersion = osVersion;
        this.manufacturer = manufacturer;
        this.appName = appName;
        this.appVersion = appVersion;
        this.appBuild = appBuild;
        this.appId = appId;
        this.environment = environment;
    }
    
    public DeviceMetadata() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Relatively stable ID for the device. Will update on app uninstall and reinstall
     */
    @JsonIgnore
    public JsonNullable<String> deviceId() {
        return deviceId;
    }

    /**
     * The name of the SDK used to create the push token.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<KlaviyoSDK> klaviyoSDK() {
        return (JsonNullable<KlaviyoSDK>) klaviyoSDK;
    }

    /**
     * The version of the SDK used to create the push token
     */
    @JsonIgnore
    public JsonNullable<String> sdkVersion() {
        return sdkVersion;
    }

    /**
     * The model of the device
     */
    @JsonIgnore
    public JsonNullable<String> deviceModel() {
        return deviceModel;
    }

    /**
     * The name of the operating system on the device.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<OsName> osName() {
        return (JsonNullable<OsName>) osName;
    }

    /**
     * The version of the operating system on the device
     */
    @JsonIgnore
    public JsonNullable<String> osVersion() {
        return osVersion;
    }

    /**
     * The manufacturer of the device
     */
    @JsonIgnore
    public JsonNullable<String> manufacturer() {
        return manufacturer;
    }

    /**
     * The name of the app that created the push token
     */
    @JsonIgnore
    public JsonNullable<String> appName() {
        return appName;
    }

    /**
     * The version of the app that created the push token
     */
    @JsonIgnore
    public JsonNullable<String> appVersion() {
        return appVersion;
    }

    /**
     * The build of the app that created the push token
     */
    @JsonIgnore
    public JsonNullable<String> appBuild() {
        return appBuild;
    }

    /**
     * The ID of the app that created the push token
     */
    @JsonIgnore
    public JsonNullable<String> appId() {
        return appId;
    }

    /**
     * The environment in which the push token was created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Environment> environment() {
        return (JsonNullable<Environment>) environment;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Relatively stable ID for the device. Will update on app uninstall and reinstall
     */
    public DeviceMetadata withDeviceId(String deviceId) {
        Utils.checkNotNull(deviceId, "deviceId");
        this.deviceId = JsonNullable.of(deviceId);
        return this;
    }

    /**
     * Relatively stable ID for the device. Will update on app uninstall and reinstall
     */
    public DeviceMetadata withDeviceId(JsonNullable<String> deviceId) {
        Utils.checkNotNull(deviceId, "deviceId");
        this.deviceId = deviceId;
        return this;
    }

    /**
     * The name of the SDK used to create the push token.
     */
    public DeviceMetadata withKlaviyoSDK(KlaviyoSDK klaviyoSDK) {
        Utils.checkNotNull(klaviyoSDK, "klaviyoSDK");
        this.klaviyoSDK = JsonNullable.of(klaviyoSDK);
        return this;
    }

    /**
     * The name of the SDK used to create the push token.
     */
    public DeviceMetadata withKlaviyoSDK(JsonNullable<? extends KlaviyoSDK> klaviyoSDK) {
        Utils.checkNotNull(klaviyoSDK, "klaviyoSDK");
        this.klaviyoSDK = klaviyoSDK;
        return this;
    }

    /**
     * The version of the SDK used to create the push token
     */
    public DeviceMetadata withSDKVersion(String sdkVersion) {
        Utils.checkNotNull(sdkVersion, "sdkVersion");
        this.sdkVersion = JsonNullable.of(sdkVersion);
        return this;
    }

    /**
     * The version of the SDK used to create the push token
     */
    public DeviceMetadata withSDKVersion(JsonNullable<String> sdkVersion) {
        Utils.checkNotNull(sdkVersion, "sdkVersion");
        this.sdkVersion = sdkVersion;
        return this;
    }

    /**
     * The model of the device
     */
    public DeviceMetadata withDeviceModel(String deviceModel) {
        Utils.checkNotNull(deviceModel, "deviceModel");
        this.deviceModel = JsonNullable.of(deviceModel);
        return this;
    }

    /**
     * The model of the device
     */
    public DeviceMetadata withDeviceModel(JsonNullable<String> deviceModel) {
        Utils.checkNotNull(deviceModel, "deviceModel");
        this.deviceModel = deviceModel;
        return this;
    }

    /**
     * The name of the operating system on the device.
     */
    public DeviceMetadata withOsName(OsName osName) {
        Utils.checkNotNull(osName, "osName");
        this.osName = JsonNullable.of(osName);
        return this;
    }

    /**
     * The name of the operating system on the device.
     */
    public DeviceMetadata withOsName(JsonNullable<? extends OsName> osName) {
        Utils.checkNotNull(osName, "osName");
        this.osName = osName;
        return this;
    }

    /**
     * The version of the operating system on the device
     */
    public DeviceMetadata withOsVersion(String osVersion) {
        Utils.checkNotNull(osVersion, "osVersion");
        this.osVersion = JsonNullable.of(osVersion);
        return this;
    }

    /**
     * The version of the operating system on the device
     */
    public DeviceMetadata withOsVersion(JsonNullable<String> osVersion) {
        Utils.checkNotNull(osVersion, "osVersion");
        this.osVersion = osVersion;
        return this;
    }

    /**
     * The manufacturer of the device
     */
    public DeviceMetadata withManufacturer(String manufacturer) {
        Utils.checkNotNull(manufacturer, "manufacturer");
        this.manufacturer = JsonNullable.of(manufacturer);
        return this;
    }

    /**
     * The manufacturer of the device
     */
    public DeviceMetadata withManufacturer(JsonNullable<String> manufacturer) {
        Utils.checkNotNull(manufacturer, "manufacturer");
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * The name of the app that created the push token
     */
    public DeviceMetadata withAppName(String appName) {
        Utils.checkNotNull(appName, "appName");
        this.appName = JsonNullable.of(appName);
        return this;
    }

    /**
     * The name of the app that created the push token
     */
    public DeviceMetadata withAppName(JsonNullable<String> appName) {
        Utils.checkNotNull(appName, "appName");
        this.appName = appName;
        return this;
    }

    /**
     * The version of the app that created the push token
     */
    public DeviceMetadata withAppVersion(String appVersion) {
        Utils.checkNotNull(appVersion, "appVersion");
        this.appVersion = JsonNullable.of(appVersion);
        return this;
    }

    /**
     * The version of the app that created the push token
     */
    public DeviceMetadata withAppVersion(JsonNullable<String> appVersion) {
        Utils.checkNotNull(appVersion, "appVersion");
        this.appVersion = appVersion;
        return this;
    }

    /**
     * The build of the app that created the push token
     */
    public DeviceMetadata withAppBuild(String appBuild) {
        Utils.checkNotNull(appBuild, "appBuild");
        this.appBuild = JsonNullable.of(appBuild);
        return this;
    }

    /**
     * The build of the app that created the push token
     */
    public DeviceMetadata withAppBuild(JsonNullable<String> appBuild) {
        Utils.checkNotNull(appBuild, "appBuild");
        this.appBuild = appBuild;
        return this;
    }

    /**
     * The ID of the app that created the push token
     */
    public DeviceMetadata withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = JsonNullable.of(appId);
        return this;
    }

    /**
     * The ID of the app that created the push token
     */
    public DeviceMetadata withAppId(JsonNullable<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * The environment in which the push token was created
     */
    public DeviceMetadata withEnvironment(Environment environment) {
        Utils.checkNotNull(environment, "environment");
        this.environment = JsonNullable.of(environment);
        return this;
    }

    /**
     * The environment in which the push token was created
     */
    public DeviceMetadata withEnvironment(JsonNullable<? extends Environment> environment) {
        Utils.checkNotNull(environment, "environment");
        this.environment = environment;
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
        DeviceMetadata other = (DeviceMetadata) o;
        return 
            Objects.deepEquals(this.deviceId, other.deviceId) &&
            Objects.deepEquals(this.klaviyoSDK, other.klaviyoSDK) &&
            Objects.deepEquals(this.sdkVersion, other.sdkVersion) &&
            Objects.deepEquals(this.deviceModel, other.deviceModel) &&
            Objects.deepEquals(this.osName, other.osName) &&
            Objects.deepEquals(this.osVersion, other.osVersion) &&
            Objects.deepEquals(this.manufacturer, other.manufacturer) &&
            Objects.deepEquals(this.appName, other.appName) &&
            Objects.deepEquals(this.appVersion, other.appVersion) &&
            Objects.deepEquals(this.appBuild, other.appBuild) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.environment, other.environment);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            deviceId,
            klaviyoSDK,
            sdkVersion,
            deviceModel,
            osName,
            osVersion,
            manufacturer,
            appName,
            appVersion,
            appBuild,
            appId,
            environment);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeviceMetadata.class,
                "deviceId", deviceId,
                "klaviyoSDK", klaviyoSDK,
                "sdkVersion", sdkVersion,
                "deviceModel", deviceModel,
                "osName", osName,
                "osVersion", osVersion,
                "manufacturer", manufacturer,
                "appName", appName,
                "appVersion", appVersion,
                "appBuild", appBuild,
                "appId", appId,
                "environment", environment);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> deviceId = JsonNullable.undefined();
 
        private JsonNullable<? extends KlaviyoSDK> klaviyoSDK = JsonNullable.undefined();
 
        private JsonNullable<String> sdkVersion = JsonNullable.undefined();
 
        private JsonNullable<String> deviceModel = JsonNullable.undefined();
 
        private JsonNullable<? extends OsName> osName = JsonNullable.undefined();
 
        private JsonNullable<String> osVersion = JsonNullable.undefined();
 
        private JsonNullable<String> manufacturer = JsonNullable.undefined();
 
        private JsonNullable<String> appName = JsonNullable.undefined();
 
        private JsonNullable<String> appVersion = JsonNullable.undefined();
 
        private JsonNullable<String> appBuild = JsonNullable.undefined();
 
        private JsonNullable<String> appId = JsonNullable.undefined();
 
        private JsonNullable<? extends Environment> environment = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Relatively stable ID for the device. Will update on app uninstall and reinstall
         */
        public Builder deviceId(String deviceId) {
            Utils.checkNotNull(deviceId, "deviceId");
            this.deviceId = JsonNullable.of(deviceId);
            return this;
        }

        /**
         * Relatively stable ID for the device. Will update on app uninstall and reinstall
         */
        public Builder deviceId(JsonNullable<String> deviceId) {
            Utils.checkNotNull(deviceId, "deviceId");
            this.deviceId = deviceId;
            return this;
        }

        /**
         * The name of the SDK used to create the push token.
         */
        public Builder klaviyoSDK(KlaviyoSDK klaviyoSDK) {
            Utils.checkNotNull(klaviyoSDK, "klaviyoSDK");
            this.klaviyoSDK = JsonNullable.of(klaviyoSDK);
            return this;
        }

        /**
         * The name of the SDK used to create the push token.
         */
        public Builder klaviyoSDK(JsonNullable<? extends KlaviyoSDK> klaviyoSDK) {
            Utils.checkNotNull(klaviyoSDK, "klaviyoSDK");
            this.klaviyoSDK = klaviyoSDK;
            return this;
        }

        /**
         * The version of the SDK used to create the push token
         */
        public Builder sdkVersion(String sdkVersion) {
            Utils.checkNotNull(sdkVersion, "sdkVersion");
            this.sdkVersion = JsonNullable.of(sdkVersion);
            return this;
        }

        /**
         * The version of the SDK used to create the push token
         */
        public Builder sdkVersion(JsonNullable<String> sdkVersion) {
            Utils.checkNotNull(sdkVersion, "sdkVersion");
            this.sdkVersion = sdkVersion;
            return this;
        }

        /**
         * The model of the device
         */
        public Builder deviceModel(String deviceModel) {
            Utils.checkNotNull(deviceModel, "deviceModel");
            this.deviceModel = JsonNullable.of(deviceModel);
            return this;
        }

        /**
         * The model of the device
         */
        public Builder deviceModel(JsonNullable<String> deviceModel) {
            Utils.checkNotNull(deviceModel, "deviceModel");
            this.deviceModel = deviceModel;
            return this;
        }

        /**
         * The name of the operating system on the device.
         */
        public Builder osName(OsName osName) {
            Utils.checkNotNull(osName, "osName");
            this.osName = JsonNullable.of(osName);
            return this;
        }

        /**
         * The name of the operating system on the device.
         */
        public Builder osName(JsonNullable<? extends OsName> osName) {
            Utils.checkNotNull(osName, "osName");
            this.osName = osName;
            return this;
        }

        /**
         * The version of the operating system on the device
         */
        public Builder osVersion(String osVersion) {
            Utils.checkNotNull(osVersion, "osVersion");
            this.osVersion = JsonNullable.of(osVersion);
            return this;
        }

        /**
         * The version of the operating system on the device
         */
        public Builder osVersion(JsonNullable<String> osVersion) {
            Utils.checkNotNull(osVersion, "osVersion");
            this.osVersion = osVersion;
            return this;
        }

        /**
         * The manufacturer of the device
         */
        public Builder manufacturer(String manufacturer) {
            Utils.checkNotNull(manufacturer, "manufacturer");
            this.manufacturer = JsonNullable.of(manufacturer);
            return this;
        }

        /**
         * The manufacturer of the device
         */
        public Builder manufacturer(JsonNullable<String> manufacturer) {
            Utils.checkNotNull(manufacturer, "manufacturer");
            this.manufacturer = manufacturer;
            return this;
        }

        /**
         * The name of the app that created the push token
         */
        public Builder appName(String appName) {
            Utils.checkNotNull(appName, "appName");
            this.appName = JsonNullable.of(appName);
            return this;
        }

        /**
         * The name of the app that created the push token
         */
        public Builder appName(JsonNullable<String> appName) {
            Utils.checkNotNull(appName, "appName");
            this.appName = appName;
            return this;
        }

        /**
         * The version of the app that created the push token
         */
        public Builder appVersion(String appVersion) {
            Utils.checkNotNull(appVersion, "appVersion");
            this.appVersion = JsonNullable.of(appVersion);
            return this;
        }

        /**
         * The version of the app that created the push token
         */
        public Builder appVersion(JsonNullable<String> appVersion) {
            Utils.checkNotNull(appVersion, "appVersion");
            this.appVersion = appVersion;
            return this;
        }

        /**
         * The build of the app that created the push token
         */
        public Builder appBuild(String appBuild) {
            Utils.checkNotNull(appBuild, "appBuild");
            this.appBuild = JsonNullable.of(appBuild);
            return this;
        }

        /**
         * The build of the app that created the push token
         */
        public Builder appBuild(JsonNullable<String> appBuild) {
            Utils.checkNotNull(appBuild, "appBuild");
            this.appBuild = appBuild;
            return this;
        }

        /**
         * The ID of the app that created the push token
         */
        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = JsonNullable.of(appId);
            return this;
        }

        /**
         * The ID of the app that created the push token
         */
        public Builder appId(JsonNullable<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        /**
         * The environment in which the push token was created
         */
        public Builder environment(Environment environment) {
            Utils.checkNotNull(environment, "environment");
            this.environment = JsonNullable.of(environment);
            return this;
        }

        /**
         * The environment in which the push token was created
         */
        public Builder environment(JsonNullable<? extends Environment> environment) {
            Utils.checkNotNull(environment, "environment");
            this.environment = environment;
            return this;
        }
        
        public DeviceMetadata build() {
            return new DeviceMetadata(
                deviceId,
                klaviyoSDK,
                sdkVersion,
                deviceModel,
                osName,
                osVersion,
                manufacturer,
                appName,
                appVersion,
                appBuild,
                appId,
                environment);
        }
    }
}

