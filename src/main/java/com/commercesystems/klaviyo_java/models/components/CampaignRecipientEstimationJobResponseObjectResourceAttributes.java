/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CampaignRecipientEstimationJobResponseObjectResourceAttributes {

    /**
     * The status of the recipient estimation job
     */
    @JsonProperty("status")
    private CampaignRecipientEstimationJobResponseObjectResourceStatus status;

    @JsonCreator
    public CampaignRecipientEstimationJobResponseObjectResourceAttributes(
            @JsonProperty("status") CampaignRecipientEstimationJobResponseObjectResourceStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
    }

    /**
     * The status of the recipient estimation job
     */
    @JsonIgnore
    public CampaignRecipientEstimationJobResponseObjectResourceStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The status of the recipient estimation job
     */
    public CampaignRecipientEstimationJobResponseObjectResourceAttributes withStatus(CampaignRecipientEstimationJobResponseObjectResourceStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        CampaignRecipientEstimationJobResponseObjectResourceAttributes other = (CampaignRecipientEstimationJobResponseObjectResourceAttributes) o;
        return 
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignRecipientEstimationJobResponseObjectResourceAttributes.class,
                "status", status);
    }
    
    public final static class Builder {
 
        private CampaignRecipientEstimationJobResponseObjectResourceStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The status of the recipient estimation job
         */
        public Builder status(CampaignRecipientEstimationJobResponseObjectResourceStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public CampaignRecipientEstimationJobResponseObjectResourceAttributes build() {
            return new CampaignRecipientEstimationJobResponseObjectResourceAttributes(
                status);
        }
    }
}
