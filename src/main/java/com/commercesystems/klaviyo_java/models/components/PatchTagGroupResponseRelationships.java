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


public class PatchTagGroupResponseRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends PatchTagGroupResponseTags> tags;

    @JsonCreator
    public PatchTagGroupResponseRelationships(
            @JsonProperty("tags") Optional<? extends PatchTagGroupResponseTags> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
    }
    
    public PatchTagGroupResponseRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PatchTagGroupResponseTags> tags() {
        return (Optional<PatchTagGroupResponseTags>) tags;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchTagGroupResponseRelationships withTags(PatchTagGroupResponseTags tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public PatchTagGroupResponseRelationships withTags(Optional<? extends PatchTagGroupResponseTags> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
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
        PatchTagGroupResponseRelationships other = (PatchTagGroupResponseRelationships) o;
        return 
            Objects.deepEquals(this.tags, other.tags);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            tags);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchTagGroupResponseRelationships.class,
                "tags", tags);
    }
    
    public final static class Builder {
 
        private Optional<? extends PatchTagGroupResponseTags> tags = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder tags(PatchTagGroupResponseTags tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends PatchTagGroupResponseTags> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }
        
        public PatchTagGroupResponseRelationships build() {
            return new PatchTagGroupResponseRelationships(
                tags);
        }
    }
}

