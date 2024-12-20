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


public class CustomTrackingParamDTO {

    /**
     * The value of the tracking parameter when applied to a flow.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow")
    private JsonNullable<? extends CustomTrackingParamDTOFlow> flow;

    /**
     * The value of the tracking parameter when applied to a campaign.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("campaign")
    private JsonNullable<? extends CustomTrackingParamDTOCampaign> campaign;

    /**
     * The name of the custom tracking parameter
     */
    @JsonProperty("name")
    private String name;

    @JsonCreator
    public CustomTrackingParamDTO(
            @JsonProperty("flow") JsonNullable<? extends CustomTrackingParamDTOFlow> flow,
            @JsonProperty("campaign") JsonNullable<? extends CustomTrackingParamDTOCampaign> campaign,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(flow, "flow");
        Utils.checkNotNull(campaign, "campaign");
        Utils.checkNotNull(name, "name");
        this.flow = flow;
        this.campaign = campaign;
        this.name = name;
    }
    
    public CustomTrackingParamDTO(
            String name) {
        this(JsonNullable.undefined(), JsonNullable.undefined(), name);
    }

    /**
     * The value of the tracking parameter when applied to a flow.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CustomTrackingParamDTOFlow> flow() {
        return (JsonNullable<CustomTrackingParamDTOFlow>) flow;
    }

    /**
     * The value of the tracking parameter when applied to a campaign.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CustomTrackingParamDTOCampaign> campaign() {
        return (JsonNullable<CustomTrackingParamDTOCampaign>) campaign;
    }

    /**
     * The name of the custom tracking parameter
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The value of the tracking parameter when applied to a flow.
     */
    public CustomTrackingParamDTO withFlow(CustomTrackingParamDTOFlow flow) {
        Utils.checkNotNull(flow, "flow");
        this.flow = JsonNullable.of(flow);
        return this;
    }

    /**
     * The value of the tracking parameter when applied to a flow.
     */
    public CustomTrackingParamDTO withFlow(JsonNullable<? extends CustomTrackingParamDTOFlow> flow) {
        Utils.checkNotNull(flow, "flow");
        this.flow = flow;
        return this;
    }

    /**
     * The value of the tracking parameter when applied to a campaign.
     */
    public CustomTrackingParamDTO withCampaign(CustomTrackingParamDTOCampaign campaign) {
        Utils.checkNotNull(campaign, "campaign");
        this.campaign = JsonNullable.of(campaign);
        return this;
    }

    /**
     * The value of the tracking parameter when applied to a campaign.
     */
    public CustomTrackingParamDTO withCampaign(JsonNullable<? extends CustomTrackingParamDTOCampaign> campaign) {
        Utils.checkNotNull(campaign, "campaign");
        this.campaign = campaign;
        return this;
    }

    /**
     * The name of the custom tracking parameter
     */
    public CustomTrackingParamDTO withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        CustomTrackingParamDTO other = (CustomTrackingParamDTO) o;
        return 
            Objects.deepEquals(this.flow, other.flow) &&
            Objects.deepEquals(this.campaign, other.campaign) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            flow,
            campaign,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomTrackingParamDTO.class,
                "flow", flow,
                "campaign", campaign,
                "name", name);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends CustomTrackingParamDTOFlow> flow = JsonNullable.undefined();
 
        private JsonNullable<? extends CustomTrackingParamDTOCampaign> campaign = JsonNullable.undefined();
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The value of the tracking parameter when applied to a flow.
         */
        public Builder flow(CustomTrackingParamDTOFlow flow) {
            Utils.checkNotNull(flow, "flow");
            this.flow = JsonNullable.of(flow);
            return this;
        }

        /**
         * The value of the tracking parameter when applied to a flow.
         */
        public Builder flow(JsonNullable<? extends CustomTrackingParamDTOFlow> flow) {
            Utils.checkNotNull(flow, "flow");
            this.flow = flow;
            return this;
        }

        /**
         * The value of the tracking parameter when applied to a campaign.
         */
        public Builder campaign(CustomTrackingParamDTOCampaign campaign) {
            Utils.checkNotNull(campaign, "campaign");
            this.campaign = JsonNullable.of(campaign);
            return this;
        }

        /**
         * The value of the tracking parameter when applied to a campaign.
         */
        public Builder campaign(JsonNullable<? extends CustomTrackingParamDTOCampaign> campaign) {
            Utils.checkNotNull(campaign, "campaign");
            this.campaign = campaign;
            return this;
        }

        /**
         * The name of the custom tracking parameter
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public CustomTrackingParamDTO build() {
            return new CustomTrackingParamDTO(
                flow,
                campaign,
                name);
        }
    }
}

