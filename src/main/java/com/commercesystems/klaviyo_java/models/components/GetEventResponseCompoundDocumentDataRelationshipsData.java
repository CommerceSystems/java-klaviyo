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


public class GetEventResponseCompoundDocumentDataRelationshipsData {

    @JsonProperty("type")
    private AttributionEnum type;

    /**
     * Attributions for this event
     */
    @JsonProperty("id")
    private String id;

    @JsonCreator
    public GetEventResponseCompoundDocumentDataRelationshipsData(
            @JsonProperty("type") AttributionEnum type,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        this.type = type;
        this.id = id;
    }

    @JsonIgnore
    public AttributionEnum type() {
        return type;
    }

    /**
     * Attributions for this event
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetEventResponseCompoundDocumentDataRelationshipsData withType(AttributionEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Attributions for this event
     */
    public GetEventResponseCompoundDocumentDataRelationshipsData withId(String id) {
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
        GetEventResponseCompoundDocumentDataRelationshipsData other = (GetEventResponseCompoundDocumentDataRelationshipsData) o;
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
        return Utils.toString(GetEventResponseCompoundDocumentDataRelationshipsData.class,
                "type", type,
                "id", id);
    }
    
    public final static class Builder {
 
        private AttributionEnum type;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(AttributionEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Attributions for this event
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public GetEventResponseCompoundDocumentDataRelationshipsData build() {
            return new GetEventResponseCompoundDocumentDataRelationshipsData(
                type,
                id);
        }
    }
}

