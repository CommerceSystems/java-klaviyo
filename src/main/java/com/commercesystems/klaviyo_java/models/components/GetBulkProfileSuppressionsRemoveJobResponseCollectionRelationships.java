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


public class GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lists")
    private Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionLists> lists;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("segments")
    private Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionSegments> segments;

    @JsonCreator
    public GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships(
            @JsonProperty("lists") Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionLists> lists,
            @JsonProperty("segments") Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionSegments> segments) {
        Utils.checkNotNull(lists, "lists");
        Utils.checkNotNull(segments, "segments");
        this.lists = lists;
        this.segments = segments;
    }
    
    public GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetBulkProfileSuppressionsRemoveJobResponseCollectionLists> lists() {
        return (Optional<GetBulkProfileSuppressionsRemoveJobResponseCollectionLists>) lists;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetBulkProfileSuppressionsRemoveJobResponseCollectionSegments> segments() {
        return (Optional<GetBulkProfileSuppressionsRemoveJobResponseCollectionSegments>) segments;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships withLists(GetBulkProfileSuppressionsRemoveJobResponseCollectionLists lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = Optional.ofNullable(lists);
        return this;
    }

    public GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships withLists(Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionLists> lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = lists;
        return this;
    }

    public GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships withSegments(GetBulkProfileSuppressionsRemoveJobResponseCollectionSegments segments) {
        Utils.checkNotNull(segments, "segments");
        this.segments = Optional.ofNullable(segments);
        return this;
    }

    public GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships withSegments(Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionSegments> segments) {
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
        GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships other = (GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships) o;
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
        return Utils.toString(GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships.class,
                "lists", lists,
                "segments", segments);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionLists> lists = Optional.empty();
 
        private Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionSegments> segments = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lists(GetBulkProfileSuppressionsRemoveJobResponseCollectionLists lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = Optional.ofNullable(lists);
            return this;
        }

        public Builder lists(Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionLists> lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = lists;
            return this;
        }

        public Builder segments(GetBulkProfileSuppressionsRemoveJobResponseCollectionSegments segments) {
            Utils.checkNotNull(segments, "segments");
            this.segments = Optional.ofNullable(segments);
            return this;
        }

        public Builder segments(Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseCollectionSegments> segments) {
            Utils.checkNotNull(segments, "segments");
            this.segments = segments;
            return this;
        }
        
        public GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships build() {
            return new GetBulkProfileSuppressionsRemoveJobResponseCollectionRelationships(
                lists,
                segments);
        }
    }
}

