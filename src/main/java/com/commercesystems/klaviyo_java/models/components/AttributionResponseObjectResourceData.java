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


public class AttributionResponseObjectResourceData {

    @JsonProperty("type")
    private EventEnum type;

    /**
     * Event
     */
    @JsonProperty("id")
    private String id;

    @JsonCreator
    public AttributionResponseObjectResourceData(
            @JsonProperty("type") EventEnum type,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        this.type = type;
        this.id = id;
    }

    @JsonIgnore
    public EventEnum type() {
        return type;
    }

    /**
     * Event
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AttributionResponseObjectResourceData withType(EventEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Event
     */
    public AttributionResponseObjectResourceData withId(String id) {
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
        AttributionResponseObjectResourceData other = (AttributionResponseObjectResourceData) o;
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
        return Utils.toString(AttributionResponseObjectResourceData.class,
                "type", type,
                "id", id);
    }
    
    public final static class Builder {
 
        private EventEnum type;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(EventEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Event
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public AttributionResponseObjectResourceData build() {
            return new AttributionResponseObjectResourceData(
                type,
                id);
        }
    }
}

