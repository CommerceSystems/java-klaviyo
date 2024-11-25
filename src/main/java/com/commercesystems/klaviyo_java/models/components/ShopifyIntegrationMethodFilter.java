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


public class ShopifyIntegrationMethodFilter {

    @JsonProperty("field")
    private MethodEnum field;

    @JsonProperty("method")
    private IntegrationEnum method;

    @JsonProperty("filter")
    private ShopifyIntegrationFilter filter;

    @JsonCreator
    public ShopifyIntegrationMethodFilter(
            @JsonProperty("field") MethodEnum field,
            @JsonProperty("method") IntegrationEnum method,
            @JsonProperty("filter") ShopifyIntegrationFilter filter) {
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
    public ShopifyIntegrationFilter filter() {
        return filter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ShopifyIntegrationMethodFilter withField(MethodEnum field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    public ShopifyIntegrationMethodFilter withMethod(IntegrationEnum method) {
        Utils.checkNotNull(method, "method");
        this.method = method;
        return this;
    }

    public ShopifyIntegrationMethodFilter withFilter(ShopifyIntegrationFilter filter) {
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
        ShopifyIntegrationMethodFilter other = (ShopifyIntegrationMethodFilter) o;
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
        return Utils.toString(ShopifyIntegrationMethodFilter.class,
                "field", field,
                "method", method,
                "filter", filter);
    }
    
    public final static class Builder {
 
        private MethodEnum field;
 
        private IntegrationEnum method;
 
        private ShopifyIntegrationFilter filter;  
        
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

        public Builder filter(ShopifyIntegrationFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public ShopifyIntegrationMethodFilter build() {
            return new ShopifyIntegrationMethodFilter(
                field,
                method,
                filter);
        }
    }
}

