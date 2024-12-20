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


public class GetTagGroupResponseCollectionRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends GetTagGroupResponseCollectionTags> tags;

    @JsonCreator
    public GetTagGroupResponseCollectionRelationships(
            @JsonProperty("tags") Optional<? extends GetTagGroupResponseCollectionTags> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
    }
    
    public GetTagGroupResponseCollectionRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetTagGroupResponseCollectionTags> tags() {
        return (Optional<GetTagGroupResponseCollectionTags>) tags;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetTagGroupResponseCollectionRelationships withTags(GetTagGroupResponseCollectionTags tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public GetTagGroupResponseCollectionRelationships withTags(Optional<? extends GetTagGroupResponseCollectionTags> tags) {
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
        GetTagGroupResponseCollectionRelationships other = (GetTagGroupResponseCollectionRelationships) o;
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
        return Utils.toString(GetTagGroupResponseCollectionRelationships.class,
                "tags", tags);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetTagGroupResponseCollectionTags> tags = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder tags(GetTagGroupResponseCollectionTags tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends GetTagGroupResponseCollectionTags> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }
        
        public GetTagGroupResponseCollectionRelationships build() {
            return new GetTagGroupResponseCollectionRelationships(
                tags);
        }
    }
}

