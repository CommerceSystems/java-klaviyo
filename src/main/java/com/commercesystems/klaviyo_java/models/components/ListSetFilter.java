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
import java.util.List;
import java.util.Objects;


public class ListSetFilter {

    @JsonProperty("type")
    private ListEnum type;

    /**
     * Operators for list contains set filters.
     */
    @JsonProperty("operator")
    private ListSetFilterFilterOperator operator;

    @JsonProperty("value")
    private List<String> value;

    @JsonCreator
    public ListSetFilter(
            @JsonProperty("type") ListEnum type,
            @JsonProperty("operator") ListSetFilterFilterOperator operator,
            @JsonProperty("value") List<String> value) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        Utils.checkNotNull(value, "value");
        this.type = type;
        this.operator = operator;
        this.value = value;
    }

    @JsonIgnore
    public ListEnum type() {
        return type;
    }

    /**
     * Operators for list contains set filters.
     */
    @JsonIgnore
    public ListSetFilterFilterOperator operator() {
        return operator;
    }

    @JsonIgnore
    public List<String> value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListSetFilter withType(ListEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Operators for list contains set filters.
     */
    public ListSetFilter withOperator(ListSetFilterFilterOperator operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
        return this;
    }

    public ListSetFilter withValue(List<String> value) {
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
        ListSetFilter other = (ListSetFilter) o;
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
        return Utils.toString(ListSetFilter.class,
                "type", type,
                "operator", operator,
                "value", value);
    }
    
    public final static class Builder {
 
        private ListEnum type;
 
        private ListSetFilterFilterOperator operator;
 
        private List<String> value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ListEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Operators for list contains set filters.
         */
        public Builder operator(ListSetFilterFilterOperator operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }

        public Builder value(List<String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public ListSetFilter build() {
            return new ListSetFilter(
                type,
                operator,
                value);
        }
    }
}

