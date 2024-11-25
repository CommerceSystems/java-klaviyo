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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class TrackingSettingResponseObjectResourceAttributes {

    /**
     * Whether tracking parameters are automatically added to campaigns and flows.
     */
    @JsonProperty("auto_add_parameters")
    private boolean autoAddParameters;

    @JsonProperty("utm_source")
    private TrackingParamDTO utmSource;

    @JsonProperty("utm_medium")
    private TrackingParamDTO utmMedium;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("utm_campaign")
    private Optional<? extends TrackingParamDTO> utmCampaign;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("utm_id")
    private Optional<? extends TrackingParamDTO> utmId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("utm_term")
    private Optional<? extends TrackingParamDTO> utmTerm;

    /**
     * Additional custom tracking parameters.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_parameters")
    private JsonNullable<? extends List<CustomTrackingParamDTO>> customParameters;

    @JsonCreator
    public TrackingSettingResponseObjectResourceAttributes(
            @JsonProperty("auto_add_parameters") boolean autoAddParameters,
            @JsonProperty("utm_source") TrackingParamDTO utmSource,
            @JsonProperty("utm_medium") TrackingParamDTO utmMedium,
            @JsonProperty("utm_campaign") Optional<? extends TrackingParamDTO> utmCampaign,
            @JsonProperty("utm_id") Optional<? extends TrackingParamDTO> utmId,
            @JsonProperty("utm_term") Optional<? extends TrackingParamDTO> utmTerm,
            @JsonProperty("custom_parameters") JsonNullable<? extends List<CustomTrackingParamDTO>> customParameters) {
        Utils.checkNotNull(autoAddParameters, "autoAddParameters");
        Utils.checkNotNull(utmSource, "utmSource");
        Utils.checkNotNull(utmMedium, "utmMedium");
        Utils.checkNotNull(utmCampaign, "utmCampaign");
        Utils.checkNotNull(utmId, "utmId");
        Utils.checkNotNull(utmTerm, "utmTerm");
        Utils.checkNotNull(customParameters, "customParameters");
        this.autoAddParameters = autoAddParameters;
        this.utmSource = utmSource;
        this.utmMedium = utmMedium;
        this.utmCampaign = utmCampaign;
        this.utmId = utmId;
        this.utmTerm = utmTerm;
        this.customParameters = customParameters;
    }
    
    public TrackingSettingResponseObjectResourceAttributes(
            boolean autoAddParameters,
            TrackingParamDTO utmSource,
            TrackingParamDTO utmMedium) {
        this(autoAddParameters, utmSource, utmMedium, Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    /**
     * Whether tracking parameters are automatically added to campaigns and flows.
     */
    @JsonIgnore
    public boolean autoAddParameters() {
        return autoAddParameters;
    }

    @JsonIgnore
    public TrackingParamDTO utmSource() {
        return utmSource;
    }

    @JsonIgnore
    public TrackingParamDTO utmMedium() {
        return utmMedium;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TrackingParamDTO> utmCampaign() {
        return (Optional<TrackingParamDTO>) utmCampaign;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TrackingParamDTO> utmId() {
        return (Optional<TrackingParamDTO>) utmId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TrackingParamDTO> utmTerm() {
        return (Optional<TrackingParamDTO>) utmTerm;
    }

    /**
     * Additional custom tracking parameters.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<CustomTrackingParamDTO>> customParameters() {
        return (JsonNullable<List<CustomTrackingParamDTO>>) customParameters;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether tracking parameters are automatically added to campaigns and flows.
     */
    public TrackingSettingResponseObjectResourceAttributes withAutoAddParameters(boolean autoAddParameters) {
        Utils.checkNotNull(autoAddParameters, "autoAddParameters");
        this.autoAddParameters = autoAddParameters;
        return this;
    }

    public TrackingSettingResponseObjectResourceAttributes withUtmSource(TrackingParamDTO utmSource) {
        Utils.checkNotNull(utmSource, "utmSource");
        this.utmSource = utmSource;
        return this;
    }

    public TrackingSettingResponseObjectResourceAttributes withUtmMedium(TrackingParamDTO utmMedium) {
        Utils.checkNotNull(utmMedium, "utmMedium");
        this.utmMedium = utmMedium;
        return this;
    }

    public TrackingSettingResponseObjectResourceAttributes withUtmCampaign(TrackingParamDTO utmCampaign) {
        Utils.checkNotNull(utmCampaign, "utmCampaign");
        this.utmCampaign = Optional.ofNullable(utmCampaign);
        return this;
    }

    public TrackingSettingResponseObjectResourceAttributes withUtmCampaign(Optional<? extends TrackingParamDTO> utmCampaign) {
        Utils.checkNotNull(utmCampaign, "utmCampaign");
        this.utmCampaign = utmCampaign;
        return this;
    }

    public TrackingSettingResponseObjectResourceAttributes withUtmId(TrackingParamDTO utmId) {
        Utils.checkNotNull(utmId, "utmId");
        this.utmId = Optional.ofNullable(utmId);
        return this;
    }

    public TrackingSettingResponseObjectResourceAttributes withUtmId(Optional<? extends TrackingParamDTO> utmId) {
        Utils.checkNotNull(utmId, "utmId");
        this.utmId = utmId;
        return this;
    }

    public TrackingSettingResponseObjectResourceAttributes withUtmTerm(TrackingParamDTO utmTerm) {
        Utils.checkNotNull(utmTerm, "utmTerm");
        this.utmTerm = Optional.ofNullable(utmTerm);
        return this;
    }

    public TrackingSettingResponseObjectResourceAttributes withUtmTerm(Optional<? extends TrackingParamDTO> utmTerm) {
        Utils.checkNotNull(utmTerm, "utmTerm");
        this.utmTerm = utmTerm;
        return this;
    }

    /**
     * Additional custom tracking parameters.
     */
    public TrackingSettingResponseObjectResourceAttributes withCustomParameters(List<CustomTrackingParamDTO> customParameters) {
        Utils.checkNotNull(customParameters, "customParameters");
        this.customParameters = JsonNullable.of(customParameters);
        return this;
    }

    /**
     * Additional custom tracking parameters.
     */
    public TrackingSettingResponseObjectResourceAttributes withCustomParameters(JsonNullable<? extends List<CustomTrackingParamDTO>> customParameters) {
        Utils.checkNotNull(customParameters, "customParameters");
        this.customParameters = customParameters;
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
        TrackingSettingResponseObjectResourceAttributes other = (TrackingSettingResponseObjectResourceAttributes) o;
        return 
            Objects.deepEquals(this.autoAddParameters, other.autoAddParameters) &&
            Objects.deepEquals(this.utmSource, other.utmSource) &&
            Objects.deepEquals(this.utmMedium, other.utmMedium) &&
            Objects.deepEquals(this.utmCampaign, other.utmCampaign) &&
            Objects.deepEquals(this.utmId, other.utmId) &&
            Objects.deepEquals(this.utmTerm, other.utmTerm) &&
            Objects.deepEquals(this.customParameters, other.customParameters);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            autoAddParameters,
            utmSource,
            utmMedium,
            utmCampaign,
            utmId,
            utmTerm,
            customParameters);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TrackingSettingResponseObjectResourceAttributes.class,
                "autoAddParameters", autoAddParameters,
                "utmSource", utmSource,
                "utmMedium", utmMedium,
                "utmCampaign", utmCampaign,
                "utmId", utmId,
                "utmTerm", utmTerm,
                "customParameters", customParameters);
    }
    
    public final static class Builder {
 
        private Boolean autoAddParameters;
 
        private TrackingParamDTO utmSource;
 
        private TrackingParamDTO utmMedium;
 
        private Optional<? extends TrackingParamDTO> utmCampaign = Optional.empty();
 
        private Optional<? extends TrackingParamDTO> utmId = Optional.empty();
 
        private Optional<? extends TrackingParamDTO> utmTerm = Optional.empty();
 
        private JsonNullable<? extends List<CustomTrackingParamDTO>> customParameters = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether tracking parameters are automatically added to campaigns and flows.
         */
        public Builder autoAddParameters(boolean autoAddParameters) {
            Utils.checkNotNull(autoAddParameters, "autoAddParameters");
            this.autoAddParameters = autoAddParameters;
            return this;
        }

        public Builder utmSource(TrackingParamDTO utmSource) {
            Utils.checkNotNull(utmSource, "utmSource");
            this.utmSource = utmSource;
            return this;
        }

        public Builder utmMedium(TrackingParamDTO utmMedium) {
            Utils.checkNotNull(utmMedium, "utmMedium");
            this.utmMedium = utmMedium;
            return this;
        }

        public Builder utmCampaign(TrackingParamDTO utmCampaign) {
            Utils.checkNotNull(utmCampaign, "utmCampaign");
            this.utmCampaign = Optional.ofNullable(utmCampaign);
            return this;
        }

        public Builder utmCampaign(Optional<? extends TrackingParamDTO> utmCampaign) {
            Utils.checkNotNull(utmCampaign, "utmCampaign");
            this.utmCampaign = utmCampaign;
            return this;
        }

        public Builder utmId(TrackingParamDTO utmId) {
            Utils.checkNotNull(utmId, "utmId");
            this.utmId = Optional.ofNullable(utmId);
            return this;
        }

        public Builder utmId(Optional<? extends TrackingParamDTO> utmId) {
            Utils.checkNotNull(utmId, "utmId");
            this.utmId = utmId;
            return this;
        }

        public Builder utmTerm(TrackingParamDTO utmTerm) {
            Utils.checkNotNull(utmTerm, "utmTerm");
            this.utmTerm = Optional.ofNullable(utmTerm);
            return this;
        }

        public Builder utmTerm(Optional<? extends TrackingParamDTO> utmTerm) {
            Utils.checkNotNull(utmTerm, "utmTerm");
            this.utmTerm = utmTerm;
            return this;
        }

        /**
         * Additional custom tracking parameters.
         */
        public Builder customParameters(List<CustomTrackingParamDTO> customParameters) {
            Utils.checkNotNull(customParameters, "customParameters");
            this.customParameters = JsonNullable.of(customParameters);
            return this;
        }

        /**
         * Additional custom tracking parameters.
         */
        public Builder customParameters(JsonNullable<? extends List<CustomTrackingParamDTO>> customParameters) {
            Utils.checkNotNull(customParameters, "customParameters");
            this.customParameters = customParameters;
            return this;
        }
        
        public TrackingSettingResponseObjectResourceAttributes build() {
            return new TrackingSettingResponseObjectResourceAttributes(
                autoAddParameters,
                utmSource,
                utmMedium,
                utmCampaign,
                utmId,
                utmTerm,
                customParameters);
        }
    }
}

