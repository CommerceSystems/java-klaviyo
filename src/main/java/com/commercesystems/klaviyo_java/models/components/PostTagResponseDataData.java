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


public class PostTagResponseDataData {

    @JsonProperty("type")
    private ListEnum type;

    @JsonProperty("id")
    private String id;

    @JsonCreator
    public PostTagResponseDataData(
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

    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostTagResponseDataData withType(ListEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PostTagResponseDataData withId(String id) {
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
        PostTagResponseDataData other = (PostTagResponseDataData) o;
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
        return Utils.toString(PostTagResponseDataData.class,
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

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PostTagResponseDataData build() {
            return new PostTagResponseDataData(
                type,
                id);
        }
    }
}
