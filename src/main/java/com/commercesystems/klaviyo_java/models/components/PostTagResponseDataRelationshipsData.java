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


public class PostTagResponseDataRelationshipsData {

    @JsonProperty("type")
    private SegmentEnum type;

    @JsonProperty("id")
    private String id;

    @JsonCreator
    public PostTagResponseDataRelationshipsData(
            @JsonProperty("type") SegmentEnum type,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        this.type = type;
        this.id = id;
    }

    @JsonIgnore
    public SegmentEnum type() {
        return type;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostTagResponseDataRelationshipsData withType(SegmentEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PostTagResponseDataRelationshipsData withId(String id) {
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
        PostTagResponseDataRelationshipsData other = (PostTagResponseDataRelationshipsData) o;
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
        return Utils.toString(PostTagResponseDataRelationshipsData.class,
                "type", type,
                "id", id);
    }
    
    public final static class Builder {
 
        private SegmentEnum type;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(SegmentEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PostTagResponseDataRelationshipsData build() {
            return new PostTagResponseDataRelationshipsData(
                type,
                id);
        }
    }
}
