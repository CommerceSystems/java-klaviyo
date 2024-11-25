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


public class OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile {

    @JsonProperty("data")
    private ProfileUpsertQueryResourceObject data;

    @JsonCreator
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile(
            @JsonProperty("data") ProfileUpsertQueryResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public ProfileUpsertQueryResourceObject data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile withData(ProfileUpsertQueryResourceObject data) {
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
        OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile other = (OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile) o;
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
        return Utils.toString(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private ProfileUpsertQueryResourceObject data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(ProfileUpsertQueryResourceObject data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile build() {
            return new OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile(
                data);
        }
    }
}
