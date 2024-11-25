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


public class ConstantContactIntegrationMethodFilter {

    @JsonProperty("field")
    private MethodEnum field;

    @JsonProperty("method")
    private IntegrationEnum method;

    @JsonProperty("filter")
    private ConstantContactIntegrationFilter filter;

    @JsonCreator
    public ConstantContactIntegrationMethodFilter(
            @JsonProperty("field") MethodEnum field,
            @JsonProperty("method") IntegrationEnum method,
            @JsonProperty("filter") ConstantContactIntegrationFilter filter) {
        Utils.checkNotNull(field, "field");
        Utils.checkNotNull(method, "method");
        Utils.checkNotNull(filter, "filter");
        this.field = field;
        this.method = method;
        this.filter = filter;
    }

    @JsonIgnore
    public MethodEnum field() {
        return field;
    }

    @JsonIgnore
    public IntegrationEnum method() {
        return method;
    }

    @JsonIgnore
    public ConstantContactIntegrationFilter filter() {
        return filter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConstantContactIntegrationMethodFilter withField(MethodEnum field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    public ConstantContactIntegrationMethodFilter withMethod(IntegrationEnum method) {
        Utils.checkNotNull(method, "method");
        this.method = method;
        return this;
    }

    public ConstantContactIntegrationMethodFilter withFilter(ConstantContactIntegrationFilter filter) {
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
        ConstantContactIntegrationMethodFilter other = (ConstantContactIntegrationMethodFilter) o;
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
        return Utils.toString(ConstantContactIntegrationMethodFilter.class,
                "field", field,
                "method", method,
                "filter", filter);
    }
    
    public final static class Builder {
 
        private MethodEnum field;
 
        private IntegrationEnum method;
 
        private ConstantContactIntegrationFilter filter;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder field(MethodEnum field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }

        public Builder method(IntegrationEnum method) {
            Utils.checkNotNull(method, "method");
            this.method = method;
            return this;
        }

        public Builder filter(ConstantContactIntegrationFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public ConstantContactIntegrationMethodFilter build() {
            return new ConstantContactIntegrationMethodFilter(
                field,
                method,
                filter);
        }
    }
}

