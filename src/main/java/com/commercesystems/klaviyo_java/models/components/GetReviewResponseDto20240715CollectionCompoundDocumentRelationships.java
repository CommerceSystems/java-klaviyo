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


public class GetReviewResponseDto20240715CollectionCompoundDocumentRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("events")
    private Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentEvents> events;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item")
    private Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentItem> item;

    @JsonCreator
    public GetReviewResponseDto20240715CollectionCompoundDocumentRelationships(
            @JsonProperty("events") Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentEvents> events,
            @JsonProperty("item") Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentItem> item) {
        Utils.checkNotNull(events, "events");
        Utils.checkNotNull(item, "item");
        this.events = events;
        this.item = item;
    }
    
    public GetReviewResponseDto20240715CollectionCompoundDocumentRelationships() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetReviewResponseDto20240715CollectionCompoundDocumentEvents> events() {
        return (Optional<GetReviewResponseDto20240715CollectionCompoundDocumentEvents>) events;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetReviewResponseDto20240715CollectionCompoundDocumentItem> item() {
        return (Optional<GetReviewResponseDto20240715CollectionCompoundDocumentItem>) item;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetReviewResponseDto20240715CollectionCompoundDocumentRelationships withEvents(GetReviewResponseDto20240715CollectionCompoundDocumentEvents events) {
        Utils.checkNotNull(events, "events");
        this.events = Optional.ofNullable(events);
        return this;
    }

    public GetReviewResponseDto20240715CollectionCompoundDocumentRelationships withEvents(Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentEvents> events) {
        Utils.checkNotNull(events, "events");
        this.events = events;
        return this;
    }

    public GetReviewResponseDto20240715CollectionCompoundDocumentRelationships withItem(GetReviewResponseDto20240715CollectionCompoundDocumentItem item) {
        Utils.checkNotNull(item, "item");
        this.item = Optional.ofNullable(item);
        return this;
    }

    public GetReviewResponseDto20240715CollectionCompoundDocumentRelationships withItem(Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentItem> item) {
        Utils.checkNotNull(item, "item");
        this.item = item;
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
        GetReviewResponseDto20240715CollectionCompoundDocumentRelationships other = (GetReviewResponseDto20240715CollectionCompoundDocumentRelationships) o;
        return 
            Objects.deepEquals(this.events, other.events) &&
            Objects.deepEquals(this.item, other.item);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            events,
            item);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetReviewResponseDto20240715CollectionCompoundDocumentRelationships.class,
                "events", events,
                "item", item);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentEvents> events = Optional.empty();
 
        private Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentItem> item = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder events(GetReviewResponseDto20240715CollectionCompoundDocumentEvents events) {
            Utils.checkNotNull(events, "events");
            this.events = Optional.ofNullable(events);
            return this;
        }

        public Builder events(Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentEvents> events) {
            Utils.checkNotNull(events, "events");
            this.events = events;
            return this;
        }

        public Builder item(GetReviewResponseDto20240715CollectionCompoundDocumentItem item) {
            Utils.checkNotNull(item, "item");
            this.item = Optional.ofNullable(item);
            return this;
        }

        public Builder item(Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocumentItem> item) {
            Utils.checkNotNull(item, "item");
            this.item = item;
            return this;
        }
        
        public GetReviewResponseDto20240715CollectionCompoundDocumentRelationships build() {
            return new GetReviewResponseDto20240715CollectionCompoundDocumentRelationships(
                events,
                item);
        }
    }
}

