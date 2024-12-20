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


public class GetListMemberResponseCollectionRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lists")
    private Optional<? extends GetListMemberResponseCollectionLists> lists;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("segments")
    private Optional<? extends GetListMemberResponseCollectionSegments> segments;

    @JsonCreator
    public GetListMemberResponseCollectionRelationships(
            @JsonProperty("lists") Optional<? extends GetListMemberResponseCollectionLists> lists,
            @JsonProperty("segments") Optional<? extends GetListMemberResponseCollectionSegments> segments) {
        Utils.checkNotNull(lists, "lists");
        Utils.checkNotNull(segments, "segments");
        this.lists = lists;
        this.segments = segments;
    }
    
    public GetListMemberResponseCollectionRelationships() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetListMemberResponseCollectionLists> lists() {
        return (Optional<GetListMemberResponseCollectionLists>) lists;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetListMemberResponseCollectionSegments> segments() {
        return (Optional<GetListMemberResponseCollectionSegments>) segments;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetListMemberResponseCollectionRelationships withLists(GetListMemberResponseCollectionLists lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = Optional.ofNullable(lists);
        return this;
    }

    public GetListMemberResponseCollectionRelationships withLists(Optional<? extends GetListMemberResponseCollectionLists> lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = lists;
        return this;
    }

    public GetListMemberResponseCollectionRelationships withSegments(GetListMemberResponseCollectionSegments segments) {
        Utils.checkNotNull(segments, "segments");
        this.segments = Optional.ofNullable(segments);
        return this;
    }

    public GetListMemberResponseCollectionRelationships withSegments(Optional<? extends GetListMemberResponseCollectionSegments> segments) {
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
        GetListMemberResponseCollectionRelationships other = (GetListMemberResponseCollectionRelationships) o;
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
        return Utils.toString(GetListMemberResponseCollectionRelationships.class,
                "lists", lists,
                "segments", segments);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetListMemberResponseCollectionLists> lists = Optional.empty();
 
        private Optional<? extends GetListMemberResponseCollectionSegments> segments = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lists(GetListMemberResponseCollectionLists lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = Optional.ofNullable(lists);
            return this;
        }

        public Builder lists(Optional<? extends GetListMemberResponseCollectionLists> lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = lists;
            return this;
        }

        public Builder segments(GetListMemberResponseCollectionSegments segments) {
            Utils.checkNotNull(segments, "segments");
            this.segments = Optional.ofNullable(segments);
            return this;
        }

        public Builder segments(Optional<? extends GetListMemberResponseCollectionSegments> segments) {
            Utils.checkNotNull(segments, "segments");
            this.segments = segments;
            return this;
        }
        
        public GetListMemberResponseCollectionRelationships build() {
            return new GetListMemberResponseCollectionRelationships(
                lists,
                segments);
        }
    }
}

