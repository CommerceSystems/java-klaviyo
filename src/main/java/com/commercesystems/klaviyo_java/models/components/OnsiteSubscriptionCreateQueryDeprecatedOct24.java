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


public class OnsiteSubscriptionCreateQueryDeprecatedOct24 {

    @JsonProperty("data")
    private OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject data;

    @JsonCreator
    public OnsiteSubscriptionCreateQueryDeprecatedOct24(
            @JsonProperty("data") OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OnsiteSubscriptionCreateQueryDeprecatedOct24 withData(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject data) {
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
        OnsiteSubscriptionCreateQueryDeprecatedOct24 other = (OnsiteSubscriptionCreateQueryDeprecatedOct24) o;
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
        return Utils.toString(OnsiteSubscriptionCreateQueryDeprecatedOct24.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public OnsiteSubscriptionCreateQueryDeprecatedOct24 build() {
            return new OnsiteSubscriptionCreateQueryDeprecatedOct24(
                data);
        }
    }
}
