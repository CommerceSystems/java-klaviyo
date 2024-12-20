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
import java.util.Optional;


public class CampaignMessage {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends AttributionResponseObjectResourceRelationshipsCampaignMessageData> data;

    @JsonCreator
    public CampaignMessage(
            @JsonProperty("data") Optional<? extends AttributionResponseObjectResourceRelationshipsCampaignMessageData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }
    
    public CampaignMessage() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AttributionResponseObjectResourceRelationshipsCampaignMessageData> data() {
        return (Optional<AttributionResponseObjectResourceRelationshipsCampaignMessageData>) data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CampaignMessage withData(AttributionResponseObjectResourceRelationshipsCampaignMessageData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public CampaignMessage withData(Optional<? extends AttributionResponseObjectResourceRelationshipsCampaignMessageData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        CampaignMessage other = (CampaignMessage) o;
        return 
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignMessage.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Optional<? extends AttributionResponseObjectResourceRelationshipsCampaignMessageData> data = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(AttributionResponseObjectResourceRelationshipsCampaignMessageData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends AttributionResponseObjectResourceRelationshipsCampaignMessageData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public CampaignMessage build() {
            return new CampaignMessage(
                data);
        }
    }
}

