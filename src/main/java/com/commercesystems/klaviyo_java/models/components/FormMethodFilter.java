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


public class FormMethodFilter {

    @JsonProperty("field")
    private MethodEnum field;

    @JsonProperty("method")
    private FormEnum method;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<? extends InStringArrayFilter> filter;

    @JsonCreator
    public FormMethodFilter(
            @JsonProperty("field") MethodEnum field,
            @JsonProperty("method") FormEnum method,
            @JsonProperty("filter") Optional<? extends InStringArrayFilter> filter) {
        Utils.checkNotNull(field, "field");
        Utils.checkNotNull(method, "method");
        Utils.checkNotNull(filter, "filter");
        this.field = field;
        this.method = method;
        this.filter = filter;
    }
    
    public FormMethodFilter(
            MethodEnum field,
            FormEnum method) {
        this(field, method, Optional.empty());
    }

    @JsonIgnore
    public MethodEnum field() {
        return field;
    }

    @JsonIgnore
    public FormEnum method() {
        return method;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InStringArrayFilter> filter() {
        return (Optional<InStringArrayFilter>) filter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FormMethodFilter withField(MethodEnum field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    public FormMethodFilter withMethod(FormEnum method) {
        Utils.checkNotNull(method, "method");
        this.method = method;
        return this;
    }

    public FormMethodFilter withFilter(InStringArrayFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public FormMethodFilter withFilter(Optional<? extends InStringArrayFilter> filter) {
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
        FormMethodFilter other = (FormMethodFilter) o;
        return 
            Objects.deepEquals(this.field, other.field) &&
            Objects.deepEquals(this.method, other.method) &&
            Objects.deepEquals(this.filter, other.filter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            field,
            method,
            filter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FormMethodFilter.class,
                "field", field,
                "method", method,
                "filter", filter);
    }
    
    public final static class Builder {
 
        private MethodEnum field;
 
        private FormEnum method;
 
        private Optional<? extends InStringArrayFilter> filter = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder field(MethodEnum field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }

        public Builder method(FormEnum method) {
            Utils.checkNotNull(method, "method");
            this.method = method;
            return this;
        }

        public Builder filter(InStringArrayFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        public Builder filter(Optional<? extends InStringArrayFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public FormMethodFilter build() {
            return new FormMethodFilter(
                field,
                method,
                filter);
        }
    }
}

