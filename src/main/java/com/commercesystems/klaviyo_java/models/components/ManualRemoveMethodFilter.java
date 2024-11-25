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


public class ManualRemoveMethodFilter {

    @JsonProperty("field")
    private MethodEnum field;

    @JsonProperty("method")
    private ManualRemoveEnum method;

    @JsonCreator
    public ManualRemoveMethodFilter(
            @JsonProperty("field") MethodEnum field,
            @JsonProperty("method") ManualRemoveEnum method) {
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
    public ManualRemoveEnum method() {
        return method;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ManualRemoveMethodFilter withField(MethodEnum field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    public ManualRemoveMethodFilter withMethod(ManualRemoveEnum method) {
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
        ManualRemoveMethodFilter other = (ManualRemoveMethodFilter) o;
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
        return Utils.toString(ManualRemoveMethodFilter.class,
                "field", field,
                "method", method);
    }
    
    public final static class Builder {
 
        private MethodEnum field;
 
        private ManualRemoveEnum method;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder field(MethodEnum field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }

        public Builder method(ManualRemoveEnum method) {
            Utils.checkNotNull(method, "method");
            this.method = method;
            return this;
        }
        
        public ManualRemoveMethodFilter build() {
            return new ManualRemoveMethodFilter(
                field,
                method);
        }
    }
}
