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


public class GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions {

    @JsonProperty("add_utm")
    private boolean addUtm;

    @JsonProperty("utm_params")
    private List<UtmParamInfo> utmParams;

    @JsonProperty("is_tracking_opens")
    private boolean isTrackingOpens;

    @JsonProperty("is_tracking_clicks")
    private boolean isTrackingClicks;

    @JsonCreator
    public GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions(
            @JsonProperty("add_utm") boolean addUtm,
            @JsonProperty("utm_params") List<UtmParamInfo> utmParams,
            @JsonProperty("is_tracking_opens") boolean isTrackingOpens,
            @JsonProperty("is_tracking_clicks") boolean isTrackingClicks) {
        Utils.checkNotNull(addUtm, "addUtm");
        Utils.checkNotNull(utmParams, "utmParams");
        Utils.checkNotNull(isTrackingOpens, "isTrackingOpens");
        Utils.checkNotNull(isTrackingClicks, "isTrackingClicks");
        this.addUtm = addUtm;
        this.utmParams = utmParams;
        this.isTrackingOpens = isTrackingOpens;
        this.isTrackingClicks = isTrackingClicks;
    }

    @JsonIgnore
    public boolean addUtm() {
        return addUtm;
    }

    @JsonIgnore
    public List<UtmParamInfo> utmParams() {
        return utmParams;
    }

    @JsonIgnore
    public boolean isTrackingOpens() {
        return isTrackingOpens;
    }

    @JsonIgnore
    public boolean isTrackingClicks() {
        return isTrackingClicks;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions withAddUtm(boolean addUtm) {
        Utils.checkNotNull(addUtm, "addUtm");
        this.addUtm = addUtm;
        return this;
    }

    public GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions withUtmParams(List<UtmParamInfo> utmParams) {
        Utils.checkNotNull(utmParams, "utmParams");
        this.utmParams = utmParams;
        return this;
    }

    public GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions withIsTrackingOpens(boolean isTrackingOpens) {
        Utils.checkNotNull(isTrackingOpens, "isTrackingOpens");
        this.isTrackingOpens = isTrackingOpens;
        return this;
    }

    public GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions withIsTrackingClicks(boolean isTrackingClicks) {
        Utils.checkNotNull(isTrackingClicks, "isTrackingClicks");
        this.isTrackingClicks = isTrackingClicks;
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
        GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions other = (GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions) o;
        return 
            Objects.deepEquals(this.addUtm, other.addUtm) &&
            Objects.deepEquals(this.utmParams, other.utmParams) &&
            Objects.deepEquals(this.isTrackingOpens, other.isTrackingOpens) &&
            Objects.deepEquals(this.isTrackingClicks, other.isTrackingClicks);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            addUtm,
            utmParams,
            isTrackingOpens,
            isTrackingClicks);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions.class,
                "addUtm", addUtm,
                "utmParams", utmParams,
                "isTrackingOpens", isTrackingOpens,
                "isTrackingClicks", isTrackingClicks);
    }
    
    public final static class Builder {
 
        private Boolean addUtm;
 
        private List<UtmParamInfo> utmParams;
 
        private Boolean isTrackingOpens;
 
        private Boolean isTrackingClicks;  
        
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

        public Builder isTrackingOpens(boolean isTrackingOpens) {
            Utils.checkNotNull(isTrackingOpens, "isTrackingOpens");
            this.isTrackingOpens = isTrackingOpens;
            return this;
        }

        public Builder isTrackingClicks(boolean isTrackingClicks) {
            Utils.checkNotNull(isTrackingClicks, "isTrackingClicks");
            this.isTrackingClicks = isTrackingClicks;
            return this;
        }
        
        public GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions build() {
            return new GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions(
                addUtm,
                utmParams,
                isTrackingOpens,
                isTrackingClicks);
        }
    }
}

