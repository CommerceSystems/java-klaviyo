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


public class AnniversaryDateFilter {

    @JsonProperty("type")
    private DateEnum type;

    /**
     * Operators for anniversary date filters.
     */
    @JsonProperty("operator")
    private AnniversaryDateFilterOperator operator;

    @JsonCreator
    public AnniversaryDateFilter(
            @JsonProperty("type") DateEnum type,
            @JsonProperty("operator") AnniversaryDateFilterOperator operator) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        this.type = type;
        this.operator = operator;
    }

    @JsonIgnore
    public DateEnum type() {
        return type;
    }

    /**
     * Operators for anniversary date filters.
     */
    @JsonIgnore
    public AnniversaryDateFilterOperator operator() {
        return operator;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AnniversaryDateFilter withType(DateEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Operators for anniversary date filters.
     */
    public AnniversaryDateFilter withOperator(AnniversaryDateFilterOperator operator) {
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
        AnniversaryDateFilter other = (AnniversaryDateFilter) o;
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
        return Utils.toString(AnniversaryDateFilter.class,
                "type", type,
                "operator", operator);
    }
    
    public final static class Builder {
 
        private DateEnum type;
 
        private AnniversaryDateFilterOperator operator;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(DateEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Operators for anniversary date filters.
         */
        public Builder operator(AnniversaryDateFilterOperator operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }
        
        public AnniversaryDateFilter build() {
            return new AnniversaryDateFilter(
                type,
                operator);
        }
    }
}

