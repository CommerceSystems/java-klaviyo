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


public class GetCampaignResponseCompoundDocumentDataRelationshipsData {

    @JsonProperty("type")
    private CampaignMessageEnum type;

    /**
     * The message(s) associated with the campaign
     */
    @JsonProperty("id")
    private String id;

    @JsonCreator
    public GetCampaignResponseCompoundDocumentDataRelationshipsData(
            @JsonProperty("type") CampaignMessageEnum type,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        this.type = type;
        this.id = id;
    }

    @JsonIgnore
    public CampaignMessageEnum type() {
        return type;
    }

    /**
     * The message(s) associated with the campaign
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCampaignResponseCompoundDocumentDataRelationshipsData withType(CampaignMessageEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The message(s) associated with the campaign
     */
    public GetCampaignResponseCompoundDocumentDataRelationshipsData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        GetCampaignResponseCompoundDocumentDataRelationshipsData other = (GetCampaignResponseCompoundDocumentDataRelationshipsData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCampaignResponseCompoundDocumentDataRelationshipsData.class,
                "type", type,
                "id", id);
    }
    
    public final static class Builder {
 
        private CampaignMessageEnum type;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CampaignMessageEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The message(s) associated with the campaign
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public GetCampaignResponseCompoundDocumentDataRelationshipsData build() {
            return new GetCampaignResponseCompoundDocumentDataRelationshipsData(
                type,
                id);
        }
    }
}

