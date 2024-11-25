/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RelativeDateOperatorBaseFilter {

    @JsonProperty("type")
    private DateEnum type;

    /**
     * Operators for relative date filters.
     * 
     * e.g. "in the last 10 days"
     */
    @JsonProperty("operator")
    private RelativeDateOperatorBaseFilterOperator operator;

    /**
     * Units for relative date filters.
     */
    @JsonProperty("unit")
    private Unit unit;

    @JsonProperty("quantity")
    private long quantity;

    @JsonCreator
    public RelativeDateOperatorBaseFilter(
            @JsonProperty("type") DateEnum type,
            @JsonProperty("operator") RelativeDateOperatorBaseFilterOperator operator,
            @JsonProperty("unit") Unit unit,
            @JsonProperty("quantity") long quantity) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        Utils.checkNotNull(unit, "unit");
        Utils.checkNotNull(quantity, "quantity");
        this.type = type;
        this.operator = operator;
        this.unit = unit;
        this.quantity = quantity;
    }

    @JsonIgnore
    public DateEnum type() {
        return type;
    }

    /**
     * Operators for relative date filters.
     * 
     * e.g. "in the last 10 days"
     */
    @JsonIgnore
    public RelativeDateOperatorBaseFilterOperator operator() {
        return operator;
    }

    /**
     * Units for relative date filters.
     */
    @JsonIgnore
    public Unit unit() {
        return unit;
    }

    @JsonIgnore
    public long quantity() {
        return quantity;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RelativeDateOperatorBaseFilter withType(DateEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Operators for relative date filters.
     * 
     * e.g. "in the last 10 days"
     */
    public RelativeDateOperatorBaseFilter withOperator(RelativeDateOperatorBaseFilterOperator operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
        return this;
    }

    /**
     * Units for relative date filters.
     */
    public RelativeDateOperatorBaseFilter withUnit(Unit unit) {
        Utils.checkNotNull(unit, "unit");
        this.unit = unit;
        return this;
    }

    public RelativeDateOperatorBaseFilter withQuantity(long quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
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
        RelativeDateOperatorBaseFilter other = (RelativeDateOperatorBaseFilter) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.operator, other.operator) &&
            Objects.deepEquals(this.unit, other.unit) &&
            Objects.deepEquals(this.quantity, other.quantity);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            operator,
            unit,
            quantity);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RelativeDateOperatorBaseFilter.class,
                "type", type,
                "operator", operator,
                "unit", unit,
                "quantity", quantity);
    }
    
    public final static class Builder {
 
        private DateEnum type;
 
        private RelativeDateOperatorBaseFilterOperator operator;
 
        private Unit unit;
 
        private Long quantity;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(DateEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Operators for relative date filters.
         * 
         * e.g. "in the last 10 days"
         */
        public Builder operator(RelativeDateOperatorBaseFilterOperator operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }

        /**
         * Units for relative date filters.
         */
        public Builder unit(Unit unit) {
            Utils.checkNotNull(unit, "unit");
            this.unit = unit;
            return this;
        }

        public Builder quantity(long quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }
        
        public RelativeDateOperatorBaseFilter build() {
            return new RelativeDateOperatorBaseFilter(
                type,
                operator,
                unit,
                quantity);
        }
    }
}

