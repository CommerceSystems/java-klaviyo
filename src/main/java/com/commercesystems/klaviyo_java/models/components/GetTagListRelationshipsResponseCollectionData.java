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


public class GetTagListRelationshipsResponseCollectionData {

    @JsonProperty("type")
    private ListEnum type;

    /**
     * The IDs of all lists that are associated with the Tag
     */
    @JsonProperty("id")
    private String id;

    @JsonCreator
    public GetTagListRelationshipsResponseCollectionData(
            @JsonProperty("type") ListEnum type,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        this.type = type;
        this.id = id;
    }

    @JsonIgnore
    public ListEnum type() {
        return type;
    }

    /**
     * The IDs of all lists that are associated with the Tag
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetTagListRelationshipsResponseCollectionData withType(ListEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The IDs of all lists that are associated with the Tag
     */
    public GetTagListRelationshipsResponseCollectionData withId(String id) {
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
        GetTagListRelationshipsResponseCollectionData other = (GetTagListRelationshipsResponseCollectionData) o;
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
        return Utils.toString(GetTagListRelationshipsResponseCollectionData.class,
                "type", type,
                "id", id);
    }
    
    public final static class Builder {
 
        private ListEnum type;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ListEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The IDs of all lists that are associated with the Tag
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public GetTagListRelationshipsResponseCollectionData build() {
            return new GetTagListRelationshipsResponseCollectionData(
                type,
                id);
        }
    }
}

