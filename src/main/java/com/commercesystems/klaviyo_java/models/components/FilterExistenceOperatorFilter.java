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


public class FilterExistenceOperatorFilter {

    @JsonProperty("type")
    private ExistenceEnum type;

    /**
     * Operators for existence filters.
     */
    @JsonProperty("operator")
    private ExistenceOperatorFilterFilterOperator operator;

    @JsonCreator
    public FilterExistenceOperatorFilter(
            @JsonProperty("type") ExistenceEnum type,
            @JsonProperty("operator") ExistenceOperatorFilterFilterOperator operator) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        this.type = type;
        this.operator = operator;
    }

    @JsonIgnore
    public ExistenceEnum type() {
        return type;
    }

    /**
     * Operators for existence filters.
     */
    @JsonIgnore
    public ExistenceOperatorFilterFilterOperator operator() {
        return operator;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FilterExistenceOperatorFilter withType(ExistenceEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Operators for existence filters.
     */
    public FilterExistenceOperatorFilter withOperator(ExistenceOperatorFilterFilterOperator operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
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
        FilterExistenceOperatorFilter other = (FilterExistenceOperatorFilter) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.operator, other.operator);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            operator);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FilterExistenceOperatorFilter.class,
                "type", type,
                "operator", operator);
    }
    
    public final static class Builder {
 
        private ExistenceEnum type;
 
        private ExistenceOperatorFilterFilterOperator operator;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ExistenceEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Operators for existence filters.
         */
        public Builder operator(ExistenceOperatorFilterFilterOperator operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }
        
        public FilterExistenceOperatorFilter build() {
            return new FilterExistenceOperatorFilter(
                type,
                operator);
        }
    }
}

