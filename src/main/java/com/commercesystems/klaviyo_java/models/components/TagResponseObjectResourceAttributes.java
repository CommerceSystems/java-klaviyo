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


public class TagResponseObjectResourceAttributes {

    /**
     * The Tag name
     */
    @JsonProperty("name")
    private String name;

    @JsonCreator
    public TagResponseObjectResourceAttributes(
            @JsonProperty("name") String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
    }

    /**
     * The Tag name
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Tag name
     */
    public TagResponseObjectResourceAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        TagResponseObjectResourceAttributes other = (TagResponseObjectResourceAttributes) o;
        return 
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TagResponseObjectResourceAttributes.class,
                "name", name);
    }
    
    public final static class Builder {
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Tag name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public TagResponseObjectResourceAttributes build() {
            return new TagResponseObjectResourceAttributes(
                name);
        }
    }
}

