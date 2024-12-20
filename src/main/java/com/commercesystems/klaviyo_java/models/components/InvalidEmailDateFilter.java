/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InvalidEmailDateFilter {

    @JsonProperty("field")
    private InvalidEmailDateEnum field;

    @JsonProperty("filter")
    private InvalidEmailDateFilterFilter filter;

    @JsonCreator
    public InvalidEmailDateFilter(
            @JsonProperty("field") InvalidEmailDateEnum field,
            @JsonProperty("filter") InvalidEmailDateFilterFilter filter) {
        Utils.checkNotNull(field, "field");
        Utils.checkNotNull(filter, "filter");
        this.field = field;
        this.filter = filter;
    }

    @JsonIgnore
    public InvalidEmailDateEnum field() {
        return field;
    }

    @JsonIgnore
    public InvalidEmailDateFilterFilter filter() {
        return filter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public InvalidEmailDateFilter withField(InvalidEmailDateEnum field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    public InvalidEmailDateFilter withFilter(InvalidEmailDateFilterFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
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
        InvalidEmailDateFilter other = (InvalidEmailDateFilter) o;
        return 
            Objects.deepEquals(this.field, other.field) &&
            Objects.deepEquals(this.filter, other.filter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            field,
            filter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvalidEmailDateFilter.class,
                "field", field,
                "filter", filter);
    }
    
    public final static class Builder {
 
        private InvalidEmailDateEnum field;
 
        private InvalidEmailDateFilterFilter filter;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder field(InvalidEmailDateEnum field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }

        public Builder filter(InvalidEmailDateFilterFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public InvalidEmailDateFilter build() {
            return new InvalidEmailDateFilter(
                field,
                filter);
        }
    }
}

