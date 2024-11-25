/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list")
    private Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList> list;

    @JsonCreator
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships(
            @JsonProperty("list") Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList> list) {
        Utils.checkNotNull(list, "list");
        this.list = list;
    }
    
    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList> list() {
        return (Optional<OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList>) list;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships withList(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList list) {
        Utils.checkNotNull(list, "list");
        this.list = Optional.ofNullable(list);
        return this;
    }

    public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships withList(Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList> list) {
        Utils.checkNotNull(list, "list");
        this.list = list;
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
        OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships other = (OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships) o;
        return 
            Objects.deepEquals(this.list, other.list);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            list);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships.class,
                "list", list);
    }
    
    public final static class Builder {
 
        private Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList> list = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder list(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList list) {
            Utils.checkNotNull(list, "list");
            this.list = Optional.ofNullable(list);
            return this;
        }

        public Builder list(Optional<? extends OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList> list) {
            Utils.checkNotNull(list, "list");
            this.list = list;
            return this;
        }
        
        public OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships build() {
            return new OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships(
                list);
        }
    }
}
