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


public class BounceDateFilter {

    @JsonProperty("field")
    private BounceDateEnum field;

    @JsonProperty("filter")
    private BounceDateFilterFilter filter;

    @JsonCreator
    public BounceDateFilter(
            @JsonProperty("field") BounceDateEnum field,
            @JsonProperty("filter") BounceDateFilterFilter filter) {
        Utils.checkNotNull(field, "field");
        Utils.checkNotNull(filter, "filter");
        this.field = field;
        this.filter = filter;
    }

    @JsonIgnore
    public BounceDateEnum field() {
        return field;
    }

    @JsonIgnore
    public BounceDateFilterFilter filter() {
        return filter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BounceDateFilter withField(BounceDateEnum field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    public BounceDateFilter withFilter(BounceDateFilterFilter filter) {
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
        BounceDateFilter other = (BounceDateFilter) o;
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
        return Utils.toString(BounceDateFilter.class,
                "field", field,
                "filter", filter);
    }
    
    public final static class Builder {
 
        private BounceDateEnum field;
 
        private BounceDateFilterFilter filter;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder field(BounceDateEnum field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }

        public Builder filter(BounceDateFilterFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public BounceDateFilter build() {
            return new BounceDateFilter(
                field,
                filter);
        }
    }
}

