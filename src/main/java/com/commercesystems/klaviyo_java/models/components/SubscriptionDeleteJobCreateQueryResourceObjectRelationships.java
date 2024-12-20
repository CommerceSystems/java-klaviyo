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


public class SubscriptionDeleteJobCreateQueryResourceObjectRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list")
    private Optional<? extends SubscriptionDeleteJobCreateQueryResourceObjectList> list;

    @JsonCreator
    public SubscriptionDeleteJobCreateQueryResourceObjectRelationships(
            @JsonProperty("list") Optional<? extends SubscriptionDeleteJobCreateQueryResourceObjectList> list) {
        Utils.checkNotNull(list, "list");
        this.list = list;
    }
    
    public SubscriptionDeleteJobCreateQueryResourceObjectRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SubscriptionDeleteJobCreateQueryResourceObjectList> list() {
        return (Optional<SubscriptionDeleteJobCreateQueryResourceObjectList>) list;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SubscriptionDeleteJobCreateQueryResourceObjectRelationships withList(SubscriptionDeleteJobCreateQueryResourceObjectList list) {
        Utils.checkNotNull(list, "list");
        this.list = Optional.ofNullable(list);
        return this;
    }

    public SubscriptionDeleteJobCreateQueryResourceObjectRelationships withList(Optional<? extends SubscriptionDeleteJobCreateQueryResourceObjectList> list) {
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
        SubscriptionDeleteJobCreateQueryResourceObjectRelationships other = (SubscriptionDeleteJobCreateQueryResourceObjectRelationships) o;
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
        return Utils.toString(SubscriptionDeleteJobCreateQueryResourceObjectRelationships.class,
                "list", list);
    }
    
    public final static class Builder {
 
        private Optional<? extends SubscriptionDeleteJobCreateQueryResourceObjectList> list = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder list(SubscriptionDeleteJobCreateQueryResourceObjectList list) {
            Utils.checkNotNull(list, "list");
            this.list = Optional.ofNullable(list);
            return this;
        }

        public Builder list(Optional<? extends SubscriptionDeleteJobCreateQueryResourceObjectList> list) {
            Utils.checkNotNull(list, "list");
            this.list = list;
            return this;
        }
        
        public SubscriptionDeleteJobCreateQueryResourceObjectRelationships build() {
            return new SubscriptionDeleteJobCreateQueryResourceObjectRelationships(
                list);
        }
    }
}

