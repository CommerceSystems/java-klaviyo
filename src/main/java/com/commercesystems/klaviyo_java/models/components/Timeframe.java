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


public class Timeframe {

    /**
     * Pre-defined key that represents a set timeframe
     */
    @JsonProperty("key")
    private Key key;

    @JsonCreator
    public Timeframe(
            @JsonProperty("key") Key key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
    }

    /**
     * Pre-defined key that represents a set timeframe
     */
    @JsonIgnore
    public Key key() {
        return key;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Pre-defined key that represents a set timeframe
     */
    public Timeframe withKey(Key key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
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
        Timeframe other = (Timeframe) o;
        return 
            Objects.deepEquals(this.key, other.key);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Timeframe.class,
                "key", key);
    }
    
    public final static class Builder {
 
        private Key key;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Pre-defined key that represents a set timeframe
         */
        public Builder key(Key key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }
        
        public Timeframe build() {
            return new Timeframe(
                key);
        }
    }
}

