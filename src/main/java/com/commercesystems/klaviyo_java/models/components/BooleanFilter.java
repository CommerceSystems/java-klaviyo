/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class BooleanFilter {

    @JsonProperty("type")
    private BooleanEnum type;

    /**
     * Operators for boolean filters.
     */
    @JsonProperty("operator")
    private BooleanFilterOperator operator;

    @JsonProperty("value")
    private boolean value;

    @JsonCreator
    public BooleanFilter(
            @JsonProperty("type") BooleanEnum type,
            @JsonProperty("operator") BooleanFilterOperator operator,
            @JsonProperty("value") boolean value) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        Utils.checkNotNull(value, "value");
        this.type = type;
        this.operator = operator;
        this.value = value;
    }

    @JsonIgnore
    public BooleanEnum type() {
        return type;
    }

    /**
     * Operators for boolean filters.
     */
    @JsonIgnore
    public BooleanFilterOperator operator() {
        return operator;
    }

    @JsonIgnore
    public boolean value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BooleanFilter withType(BooleanEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Operators for boolean filters.
     */
    public BooleanFilter withOperator(BooleanFilterOperator operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
        return this;
    }

    public BooleanFilter withValue(boolean value) {
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
        BooleanFilter other = (BooleanFilter) o;
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
        return Utils.toString(BooleanFilter.class,
                "type", type,
                "operator", operator,
                "value", value);
    }
    
    public final static class Builder {
 
        private BooleanEnum type;
 
        private BooleanFilterOperator operator;
 
        private Boolean value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(BooleanEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Operators for boolean filters.
         */
        public Builder operator(BooleanFilterOperator operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }

        public Builder value(boolean value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public BooleanFilter build() {
            return new BooleanFilter(
                type,
                operator,
                value);
        }
    }
}

