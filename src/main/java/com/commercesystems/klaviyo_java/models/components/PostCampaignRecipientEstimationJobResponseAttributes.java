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


public class PostCampaignRecipientEstimationJobResponseAttributes {

    /**
     * The status of the recipient estimation job
     */
    @JsonProperty("status")
    private PostCampaignRecipientEstimationJobResponseStatus status;

    @JsonCreator
    public PostCampaignRecipientEstimationJobResponseAttributes(
            @JsonProperty("status") PostCampaignRecipientEstimationJobResponseStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
    }

    /**
     * The status of the recipient estimation job
     */
    @JsonIgnore
    public PostCampaignRecipientEstimationJobResponseStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The status of the recipient estimation job
     */
    public PostCampaignRecipientEstimationJobResponseAttributes withStatus(PostCampaignRecipientEstimationJobResponseStatus status) {
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
        PostCampaignRecipientEstimationJobResponseAttributes other = (PostCampaignRecipientEstimationJobResponseAttributes) o;
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
        return Utils.toString(PostCampaignRecipientEstimationJobResponseAttributes.class,
                "status", status);
    }
    
    public final static class Builder {
 
        private PostCampaignRecipientEstimationJobResponseStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The status of the recipient estimation job
         */
        public Builder status(PostCampaignRecipientEstimationJobResponseStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public PostCampaignRecipientEstimationJobResponseAttributes build() {
            return new PostCampaignRecipientEstimationJobResponseAttributes(
                status);
        }
    }
}
