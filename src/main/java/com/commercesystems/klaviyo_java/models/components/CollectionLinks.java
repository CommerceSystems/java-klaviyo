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
import java.util.Objects;
import java.util.Optional;


public class CollectionLinks {

    @JsonProperty("self")
    private String self;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first")
    private Optional<String> first;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last")
    private Optional<String> last;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev")
    private Optional<String> prev;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private Optional<String> next;

    @JsonCreator
    public CollectionLinks(
            @JsonProperty("self") String self,
            @JsonProperty("first") Optional<String> first,
            @JsonProperty("last") Optional<String> last,
            @JsonProperty("prev") Optional<String> prev,
            @JsonProperty("next") Optional<String> next) {
        Utils.checkNotNull(self, "self");
        Utils.checkNotNull(first, "first");
        Utils.checkNotNull(last, "last");
        Utils.checkNotNull(prev, "prev");
        Utils.checkNotNull(next, "next");
        this.self = self;
        this.first = first;
        this.last = last;
        this.prev = prev;
        this.next = next;
    }
    
    public CollectionLinks(
            String self) {
        this(self, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String self() {
        return self;
    }

    @JsonIgnore
    public Optional<String> first() {
        return first;
    }

    @JsonIgnore
    public Optional<String> last() {
        return last;
    }

    @JsonIgnore
    public Optional<String> prev() {
        return prev;
    }

    @JsonIgnore
    public Optional<String> next() {
        return next;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CollectionLinks withSelf(String self) {
        Utils.checkNotNull(self, "self");
        this.self = self;
        return this;
    }

    public CollectionLinks withFirst(String first) {
        Utils.checkNotNull(first, "first");
        this.first = Optional.ofNullable(first);
        return this;
    }

    public CollectionLinks withFirst(Optional<String> first) {
        Utils.checkNotNull(first, "first");
        this.first = first;
        return this;
    }

    public CollectionLinks withLast(String last) {
        Utils.checkNotNull(last, "last");
        this.last = Optional.ofNullable(last);
        return this;
    }

    public CollectionLinks withLast(Optional<String> last) {
        Utils.checkNotNull(last, "last");
        this.last = last;
        return this;
    }

    public CollectionLinks withPrev(String prev) {
        Utils.checkNotNull(prev, "prev");
        this.prev = Optional.ofNullable(prev);
        return this;
    }

    public CollectionLinks withPrev(Optional<String> prev) {
        Utils.checkNotNull(prev, "prev");
        this.prev = prev;
        return this;
    }

    public CollectionLinks withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = Optional.ofNullable(next);
        return this;
    }

    public CollectionLinks withNext(Optional<String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
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
        CollectionLinks other = (CollectionLinks) o;
        return 
            Objects.deepEquals(this.self, other.self) &&
            Objects.deepEquals(this.first, other.first) &&
            Objects.deepEquals(this.last, other.last) &&
            Objects.deepEquals(this.prev, other.prev) &&
            Objects.deepEquals(this.next, other.next);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            self,
            first,
            last,
            prev,
            next);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CollectionLinks.class,
                "self", self,
                "first", first,
                "last", last,
                "prev", prev,
                "next", next);
    }
    
    public final static class Builder {
 
        private String self;
 
        private Optional<String> first = Optional.empty();
 
        private Optional<String> last = Optional.empty();
 
        private Optional<String> prev = Optional.empty();
 
        private Optional<String> next = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder self(String self) {
            Utils.checkNotNull(self, "self");
            this.self = self;
            return this;
        }

        public Builder first(String first) {
            Utils.checkNotNull(first, "first");
            this.first = Optional.ofNullable(first);
            return this;
        }

        public Builder first(Optional<String> first) {
            Utils.checkNotNull(first, "first");
            this.first = first;
            return this;
        }

        public Builder last(String last) {
            Utils.checkNotNull(last, "last");
            this.last = Optional.ofNullable(last);
            return this;
        }

        public Builder last(Optional<String> last) {
            Utils.checkNotNull(last, "last");
            this.last = last;
            return this;
        }

        public Builder prev(String prev) {
            Utils.checkNotNull(prev, "prev");
            this.prev = Optional.ofNullable(prev);
            return this;
        }

        public Builder prev(Optional<String> prev) {
            Utils.checkNotNull(prev, "prev");
            this.prev = prev;
            return this;
        }

        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = Optional.ofNullable(next);
            return this;
        }

        public Builder next(Optional<String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }
        
        public CollectionLinks build() {
            return new CollectionLinks(
                self,
                first,
                last,
                prev,
                next);
        }
    }
}

