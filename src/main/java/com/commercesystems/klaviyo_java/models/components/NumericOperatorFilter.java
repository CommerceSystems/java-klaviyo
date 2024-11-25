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


public class NumericOperatorFilter {

    @JsonProperty("type")
    private NumericEnum type;

    /**
     * Operators for numeric filters.
     */
    @JsonProperty("operator")
    private Operator operator;

    @JsonProperty("value")
    private NumericOperatorFilterValue value;

    @JsonCreator
    public NumericOperatorFilter(
            @JsonProperty("type") NumericEnum type,
            @JsonProperty("operator") Operator operator,
            @JsonProperty("value") NumericOperatorFilterValue value) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        Utils.checkNotNull(value, "value");
        this.type = type;
        this.operator = operator;
        this.value = value;
    }

    @JsonIgnore
    public NumericEnum type() {
        return type;
    }

    /**
     * Operators for numeric filters.
     */
    @JsonIgnore
    public Operator operator() {
        return operator;
    }

    @JsonIgnore
    public NumericOperatorFilterValue value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NumericOperatorFilter withType(NumericEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Operators for numeric filters.
     */
    public NumericOperatorFilter withOperator(Operator operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
        return this;
    }

    public NumericOperatorFilter withValue(NumericOperatorFilterValue value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        NumericOperatorFilter other = (NumericOperatorFilter) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.operator, other.operator) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            operator,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NumericOperatorFilter.class,
                "type", type,
                "operator", operator,
                "value", value);
    }
    
    public final static class Builder {
 
        private NumericEnum type;
 
        private Operator operator;
 
        private NumericOperatorFilterValue value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(NumericEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Operators for numeric filters.
         */
        public Builder operator(Operator operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }

        public Builder value(NumericOperatorFilterValue value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public NumericOperatorFilter build() {
            return new NumericOperatorFilter(
                type,
                operator,
                value);
        }
    }
}

