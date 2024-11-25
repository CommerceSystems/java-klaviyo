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
import org.openapitools.jackson.nullable.JsonNullable;


public class CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject {

    /**
     * Whether the campaign needs custom tracking parameters. If set to False, tracking params will not be used.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("add_tracking_params")
    private JsonNullable<Boolean> addTrackingParams;

    /**
     * A list of custom tracking parameters. If an empty list is given and add_tracking_params is True, uses company defaults.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_tracking_params")
    private JsonNullable<? extends List<SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams>> customTrackingParams;

    @JsonCreator
    public CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject(
            @JsonProperty("add_tracking_params") JsonNullable<Boolean> addTrackingParams,
            @JsonProperty("custom_tracking_params") JsonNullable<? extends List<SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams>> customTrackingParams) {
        Utils.checkNotNull(addTrackingParams, "addTrackingParams");
        Utils.checkNotNull(customTrackingParams, "customTrackingParams");
        this.addTrackingParams = addTrackingParams;
        this.customTrackingParams = customTrackingParams;
    }
    
    public CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Whether the campaign needs custom tracking parameters. If set to False, tracking params will not be used.
     */
    @JsonIgnore
    public JsonNullable<Boolean> addTrackingParams() {
        return addTrackingParams;
    }

    /**
     * A list of custom tracking parameters. If an empty list is given and add_tracking_params is True, uses company defaults.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams>> customTrackingParams() {
        return (JsonNullable<List<SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams>>) customTrackingParams;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether the campaign needs custom tracking parameters. If set to False, tracking params will not be used.
     */
    public CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject withAddTrackingParams(boolean addTrackingParams) {
        Utils.checkNotNull(addTrackingParams, "addTrackingParams");
        this.addTrackingParams = JsonNullable.of(addTrackingParams);
        return this;
    }

    /**
     * Whether the campaign needs custom tracking parameters. If set to False, tracking params will not be used.
     */
    public CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject withAddTrackingParams(JsonNullable<Boolean> addTrackingParams) {
        Utils.checkNotNull(addTrackingParams, "addTrackingParams");
        this.addTrackingParams = addTrackingParams;
        return this;
    }

    /**
     * A list of custom tracking parameters. If an empty list is given and add_tracking_params is True, uses company defaults.
     */
    public CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject withCustomTrackingParams(List<SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams> customTrackingParams) {
        Utils.checkNotNull(customTrackingParams, "customTrackingParams");
        this.customTrackingParams = JsonNullable.of(customTrackingParams);
        return this;
    }

    /**
     * A list of custom tracking parameters. If an empty list is given and add_tracking_params is True, uses company defaults.
     */
    public CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject withCustomTrackingParams(JsonNullable<? extends List<SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams>> customTrackingParams) {
        Utils.checkNotNull(customTrackingParams, "customTrackingParams");
        this.customTrackingParams = customTrackingParams;
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
        CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject other = (CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject) o;
        return 
            Objects.deepEquals(this.addTrackingParams, other.addTrackingParams) &&
            Objects.deepEquals(this.customTrackingParams, other.customTrackingParams);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            addTrackingParams,
            customTrackingParams);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject.class,
                "addTrackingParams", addTrackingParams,
                "customTrackingParams", customTrackingParams);
    }
    
    public final static class Builder {
 
        private JsonNullable<Boolean> addTrackingParams = JsonNullable.undefined();
 
        private JsonNullable<? extends List<SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams>> customTrackingParams = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether the campaign needs custom tracking parameters. If set to False, tracking params will not be used.
         */
        public Builder addTrackingParams(boolean addTrackingParams) {
            Utils.checkNotNull(addTrackingParams, "addTrackingParams");
            this.addTrackingParams = JsonNullable.of(addTrackingParams);
            return this;
        }

        /**
         * Whether the campaign needs custom tracking parameters. If set to False, tracking params will not be used.
         */
        public Builder addTrackingParams(JsonNullable<Boolean> addTrackingParams) {
            Utils.checkNotNull(addTrackingParams, "addTrackingParams");
            this.addTrackingParams = addTrackingParams;
            return this;
        }

        /**
         * A list of custom tracking parameters. If an empty list is given and add_tracking_params is True, uses company defaults.
         */
        public Builder customTrackingParams(List<SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams> customTrackingParams) {
            Utils.checkNotNull(customTrackingParams, "customTrackingParams");
            this.customTrackingParams = JsonNullable.of(customTrackingParams);
            return this;
        }

        /**
         * A list of custom tracking parameters. If an empty list is given and add_tracking_params is True, uses company defaults.
         */
        public Builder customTrackingParams(JsonNullable<? extends List<SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams>> customTrackingParams) {
            Utils.checkNotNull(customTrackingParams, "customTrackingParams");
            this.customTrackingParams = customTrackingParams;
            return this;
        }
        
        public CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject build() {
            return new CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject(
                addTrackingParams,
                customTrackingParams);
        }
    }
}
