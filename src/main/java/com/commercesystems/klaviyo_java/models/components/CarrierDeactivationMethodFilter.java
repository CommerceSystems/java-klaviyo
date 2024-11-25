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


public class CarrierDeactivationMethodFilter {

    @JsonProperty("field")
    private MethodEnum field;

    @JsonProperty("method")
    private CarrierDeactivationEnum method;

    @JsonCreator
    public CarrierDeactivationMethodFilter(
            @JsonProperty("field") MethodEnum field,
            @JsonProperty("method") CarrierDeactivationEnum method) {
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
    public CarrierDeactivationEnum method() {
        return method;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CarrierDeactivationMethodFilter withField(MethodEnum field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    public CarrierDeactivationMethodFilter withMethod(CarrierDeactivationEnum method) {
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
        CarrierDeactivationMethodFilter other = (CarrierDeactivationMethodFilter) o;
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
        return Utils.toString(CarrierDeactivationMethodFilter.class,
                "field", field,
                "method", method);
    }
    
    public final static class Builder {
 
        private MethodEnum field;
 
        private CarrierDeactivationEnum method;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder field(MethodEnum field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }

        public Builder method(CarrierDeactivationEnum method) {
            Utils.checkNotNull(method, "method");
            this.method = method;
            return this;
        }
        
        public CarrierDeactivationMethodFilter build() {
            return new CarrierDeactivationMethodFilter(
                field,
                method);
        }
    }
}
