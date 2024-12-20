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


public class DoubleOptinFilter {

    @JsonProperty("field")
    private IsDoubleOptInEnum field;

    @JsonProperty("filter")
    private BooleanFilter filter;

    @JsonCreator
    public DoubleOptinFilter(
            @JsonProperty("field") IsDoubleOptInEnum field,
            @JsonProperty("filter") BooleanFilter filter) {
        Utils.checkNotNull(field, "field");
        Utils.checkNotNull(filter, "filter");
        this.field = field;
        this.filter = filter;
    }

    @JsonIgnore
    public IsDoubleOptInEnum field() {
        return field;
    }

    @JsonIgnore
    public BooleanFilter filter() {
        return filter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DoubleOptinFilter withField(IsDoubleOptInEnum field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    public DoubleOptinFilter withFilter(BooleanFilter filter) {
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
        DoubleOptinFilter other = (DoubleOptinFilter) o;
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
        return Utils.toString(DoubleOptinFilter.class,
                "field", field,
                "filter", filter);
    }
    
    public final static class Builder {
 
        private IsDoubleOptInEnum field;
 
        private BooleanFilter filter;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder field(IsDoubleOptInEnum field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }

        public Builder filter(BooleanFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public DoubleOptinFilter build() {
            return new DoubleOptinFilter(
                field,
                filter);
        }
    }
}

