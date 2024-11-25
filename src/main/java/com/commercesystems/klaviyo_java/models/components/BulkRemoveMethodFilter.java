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


public class BulkRemoveMethodFilter {

    @JsonProperty("field")
    private MethodEnum field;

    @JsonProperty("method")
    private BulkRemoveEnum method;

    @JsonCreator
    public BulkRemoveMethodFilter(
            @JsonProperty("field") MethodEnum field,
            @JsonProperty("method") BulkRemoveEnum method) {
        Utils.checkNotNull(field, "field");
        Utils.checkNotNull(method, "method");
        this.field = field;
        this.method = method;
    }

    @JsonIgnore
    public MethodEnum field() {
        return field;
    }

    @JsonIgnore
    public BulkRemoveEnum method() {
        return method;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BulkRemoveMethodFilter withField(MethodEnum field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    public BulkRemoveMethodFilter withMethod(BulkRemoveEnum method) {
        Utils.checkNotNull(method, "method");
        this.method = method;
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
        BulkRemoveMethodFilter other = (BulkRemoveMethodFilter) o;
        return 
            Objects.deepEquals(this.field, other.field) &&
            Objects.deepEquals(this.method, other.method);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            field,
            method);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BulkRemoveMethodFilter.class,
                "field", field,
                "method", method);
    }
    
    public final static class Builder {
 
        private MethodEnum field;
 
        private BulkRemoveEnum method;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder field(MethodEnum field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }

        public Builder method(BulkRemoveEnum method) {
            Utils.checkNotNull(method, "method");
            this.method = method;
            return this;
        }
        
        public BulkRemoveMethodFilter build() {
            return new BulkRemoveMethodFilter(
                field,
                method);
        }
    }
}

