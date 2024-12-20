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


public class ProfileImportJobCreateQueryResourceObjectRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lists")
    private Optional<? extends Lists> lists;

    @JsonCreator
    public ProfileImportJobCreateQueryResourceObjectRelationships(
            @JsonProperty("lists") Optional<? extends Lists> lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = lists;
    }
    
    public ProfileImportJobCreateQueryResourceObjectRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Lists> lists() {
        return (Optional<Lists>) lists;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ProfileImportJobCreateQueryResourceObjectRelationships withLists(Lists lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = Optional.ofNullable(lists);
        return this;
    }

    public ProfileImportJobCreateQueryResourceObjectRelationships withLists(Optional<? extends Lists> lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = lists;
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
        ProfileImportJobCreateQueryResourceObjectRelationships other = (ProfileImportJobCreateQueryResourceObjectRelationships) o;
        return 
            Objects.deepEquals(this.lists, other.lists);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lists);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProfileImportJobCreateQueryResourceObjectRelationships.class,
                "lists", lists);
    }
    
    public final static class Builder {
 
        private Optional<? extends Lists> lists = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lists(Lists lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = Optional.ofNullable(lists);
            return this;
        }

        public Builder lists(Optional<? extends Lists> lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = lists;
            return this;
        }
        
        public ProfileImportJobCreateQueryResourceObjectRelationships build() {
            return new ProfileImportJobCreateQueryResourceObjectRelationships(
                lists);
        }
    }
}

