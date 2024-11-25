/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class TrackingOptionsSMSTrackingOptions {

    @JsonProperty("add_utm")
    private boolean addUtm;

    @JsonProperty("utm_params")
    private List<UtmParamInfo> utmParams;

    @JsonCreator
    public TrackingOptionsSMSTrackingOptions(
            @JsonProperty("add_utm") boolean addUtm,
            @JsonProperty("utm_params") List<UtmParamInfo> utmParams) {
        Utils.checkNotNull(addUtm, "addUtm");
        Utils.checkNotNull(utmParams, "utmParams");
        this.addUtm = addUtm;
        this.utmParams = utmParams;
    }

    @JsonIgnore
    public boolean addUtm() {
        return addUtm;
    }

    @JsonIgnore
    public List<UtmParamInfo> utmParams() {
        return utmParams;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TrackingOptionsSMSTrackingOptions withAddUtm(boolean addUtm) {
        Utils.checkNotNull(addUtm, "addUtm");
        this.addUtm = addUtm;
        return this;
    }

    public TrackingOptionsSMSTrackingOptions withUtmParams(List<UtmParamInfo> utmParams) {
        Utils.checkNotNull(utmParams, "utmParams");
        this.utmParams = utmParams;
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
        TrackingOptionsSMSTrackingOptions other = (TrackingOptionsSMSTrackingOptions) o;
        return 
            Objects.deepEquals(this.addUtm, other.addUtm) &&
            Objects.deepEquals(this.utmParams, other.utmParams);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            addUtm,
            utmParams);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TrackingOptionsSMSTrackingOptions.class,
                "addUtm", addUtm,
                "utmParams", utmParams);
    }
    
    public final static class Builder {
 
        private Boolean addUtm;
 
        private List<UtmParamInfo> utmParams;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder addUtm(boolean addUtm) {
            Utils.checkNotNull(addUtm, "addUtm");
            this.addUtm = addUtm;
            return this;
        }

        public Builder utmParams(List<UtmParamInfo> utmParams) {
            Utils.checkNotNull(utmParams, "utmParams");
            this.utmParams = utmParams;
            return this;
        }
        
        public TrackingOptionsSMSTrackingOptions build() {
            return new TrackingOptionsSMSTrackingOptions(
                addUtm,
                utmParams);
        }
    }
}

