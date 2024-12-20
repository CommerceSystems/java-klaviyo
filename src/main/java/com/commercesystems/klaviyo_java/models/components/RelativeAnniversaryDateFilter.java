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


public class RelativeAnniversaryDateFilter {

    @JsonProperty("type")
    private DateEnum type;

    /**
     * Operators for relative date filters.
     * 
     * e.g. "anniversary in the last 10 days"
     */
    @JsonProperty("operator")
    private RelativeAnniversaryDateFilterOperator operator;

    /**
     * Units for relative date filters.
     */
    @JsonProperty("unit")
    private RelativeAnniversaryDateFilterUnit unit;

    @JsonProperty("quantity")
    private long quantity;

    @JsonCreator
    public RelativeAnniversaryDateFilter(
            @JsonProperty("type") DateEnum type,
            @JsonProperty("operator") RelativeAnniversaryDateFilterOperator operator,
            @JsonProperty("unit") RelativeAnniversaryDateFilterUnit unit,
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
     * e.g. "anniversary in the last 10 days"
     */
    @JsonIgnore
    public RelativeAnniversaryDateFilterOperator operator() {
        return operator;
    }

    /**
     * Units for relative date filters.
     */
    @JsonIgnore
    public RelativeAnniversaryDateFilterUnit unit() {
        return unit;
    }

    @JsonIgnore
    public long quantity() {
        return quantity;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RelativeAnniversaryDateFilter withType(DateEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Operators for relative date filters.
     * 
     * e.g. "anniversary in the last 10 days"
     */
    public RelativeAnniversaryDateFilter withOperator(RelativeAnniversaryDateFilterOperator operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
        return this;
    }

    /**
     * Units for relative date filters.
     */
    public RelativeAnniversaryDateFilter withUnit(RelativeAnniversaryDateFilterUnit unit) {
        Utils.checkNotNull(unit, "unit");
        this.unit = unit;
        return this;
    }

    public RelativeAnniversaryDateFilter withQuantity(long quantity) {
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
        RelativeAnniversaryDateFilter other = (RelativeAnniversaryDateFilter) o;
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
        return Utils.toString(RelativeAnniversaryDateFilter.class,
                "type", type,
                "operator", operator,
                "unit", unit,
                "quantity", quantity);
    }
    
    public final static class Builder {
 
        private DateEnum type;
 
        private RelativeAnniversaryDateFilterOperator operator;
 
        private RelativeAnniversaryDateFilterUnit unit;
 
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
         * e.g. "anniversary in the last 10 days"
         */
        public Builder operator(RelativeAnniversaryDateFilterOperator operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }

        /**
         * Units for relative date filters.
         */
        public Builder unit(RelativeAnniversaryDateFilterUnit unit) {
            Utils.checkNotNull(unit, "unit");
            this.unit = unit;
            return this;
        }

        public Builder quantity(long quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }
        
        public RelativeAnniversaryDateFilter build() {
            return new RelativeAnniversaryDateFilter(
                type,
                operator,
                unit,
                quantity);
        }
    }
}

