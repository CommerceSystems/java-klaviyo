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


public class GetProfileResponseCollectionRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lists")
    private Optional<? extends GetProfileResponseCollectionLists> lists;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("segments")
    private Optional<? extends GetProfileResponseCollectionSegments> segments;

    @JsonCreator
    public GetProfileResponseCollectionRelationships(
            @JsonProperty("lists") Optional<? extends GetProfileResponseCollectionLists> lists,
            @JsonProperty("segments") Optional<? extends GetProfileResponseCollectionSegments> segments) {
        Utils.checkNotNull(lists, "lists");
        Utils.checkNotNull(segments, "segments");
        this.lists = lists;
        this.segments = segments;
    }
    
    public GetProfileResponseCollectionRelationships() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetProfileResponseCollectionLists> lists() {
        return (Optional<GetProfileResponseCollectionLists>) lists;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetProfileResponseCollectionSegments> segments() {
        return (Optional<GetProfileResponseCollectionSegments>) segments;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetProfileResponseCollectionRelationships withLists(GetProfileResponseCollectionLists lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = Optional.ofNullable(lists);
        return this;
    }

    public GetProfileResponseCollectionRelationships withLists(Optional<? extends GetProfileResponseCollectionLists> lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = lists;
        return this;
    }

    public GetProfileResponseCollectionRelationships withSegments(GetProfileResponseCollectionSegments segments) {
        Utils.checkNotNull(segments, "segments");
        this.segments = Optional.ofNullable(segments);
        return this;
    }

    public GetProfileResponseCollectionRelationships withSegments(Optional<? extends GetProfileResponseCollectionSegments> segments) {
        Utils.checkNotNull(segments, "segments");
        this.segments = segments;
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
        GetProfileResponseCollectionRelationships other = (GetProfileResponseCollectionRelationships) o;
        return 
            Objects.deepEquals(this.lists, other.lists) &&
            Objects.deepEquals(this.segments, other.segments);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lists,
            segments);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetProfileResponseCollectionRelationships.class,
                "lists", lists,
                "segments", segments);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetProfileResponseCollectionLists> lists = Optional.empty();
 
        private Optional<? extends GetProfileResponseCollectionSegments> segments = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lists(GetProfileResponseCollectionLists lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = Optional.ofNullable(lists);
            return this;
        }

        public Builder lists(Optional<? extends GetProfileResponseCollectionLists> lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = lists;
            return this;
        }

        public Builder segments(GetProfileResponseCollectionSegments segments) {
            Utils.checkNotNull(segments, "segments");
            this.segments = Optional.ofNullable(segments);
            return this;
        }

        public Builder segments(Optional<? extends GetProfileResponseCollectionSegments> segments) {
            Utils.checkNotNull(segments, "segments");
            this.segments = segments;
            return this;
        }
        
        public GetProfileResponseCollectionRelationships build() {
            return new GetProfileResponseCollectionRelationships(
                lists,
                segments);
        }
    }
}
