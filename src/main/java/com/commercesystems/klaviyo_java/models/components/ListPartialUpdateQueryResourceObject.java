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


public class ListPartialUpdateQueryResourceObject {

    @JsonProperty("type")
    private ListEnum type;

    /**
     * Primary key that uniquely identifies this list. Generated by Klaviyo.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private ListPartialUpdateQueryResourceObjectAttributes attributes;

    @JsonCreator
    public ListPartialUpdateQueryResourceObject(
            @JsonProperty("type") ListEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") ListPartialUpdateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.id = id;
        this.attributes = attributes;
    }

    @JsonIgnore
    public ListEnum type() {
        return type;
    }

    /**
     * Primary key that uniquely identifies this list. Generated by Klaviyo.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public ListPartialUpdateQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListPartialUpdateQueryResourceObject withType(ListEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Primary key that uniquely identifies this list. Generated by Klaviyo.
     */
    public ListPartialUpdateQueryResourceObject withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ListPartialUpdateQueryResourceObject withAttributes(ListPartialUpdateQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
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
        ListPartialUpdateQueryResourceObject other = (ListPartialUpdateQueryResourceObject) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.attributes, other.attributes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id,
            attributes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListPartialUpdateQueryResourceObject.class,
                "type", type,
                "id", id,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private ListEnum type;
 
        private String id;
 
        private ListPartialUpdateQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ListEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Primary key that uniquely identifies this list. Generated by Klaviyo.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(ListPartialUpdateQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public ListPartialUpdateQueryResourceObject build() {
            return new ListPartialUpdateQueryResourceObject(
                type,
                id,
                attributes);
        }
    }
}
