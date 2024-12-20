/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class StringOperatorFilter {

    @JsonProperty("type")
    private StringEnum type;

    /**
     * Operators for string filters.
     */
    @JsonProperty("operator")
    private StringOperatorFilterOperator operator;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("value")
    private Optional<String> value;

    @JsonCreator
    public StringOperatorFilter(
            @JsonProperty("type") StringEnum type,
            @JsonProperty("operator") StringOperatorFilterOperator operator,
            @JsonProperty("value") Optional<String> value) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        Utils.checkNotNull(value, "value");
        this.type = type;
        this.operator = operator;
        this.value = value;
    }
    
    public StringOperatorFilter(
            StringEnum type,
            StringOperatorFilterOperator operator) {
        this(type, operator, Optional.empty());
    }

    @JsonIgnore
    public StringEnum type() {
        return type;
    }

    /**
     * Operators for string filters.
     */
    @JsonIgnore
    public StringOperatorFilterOperator operator() {
        return operator;
    }

    @JsonIgnore
    public Optional<String> value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StringOperatorFilter withType(StringEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Operators for string filters.
     */
    public StringOperatorFilter withOperator(StringOperatorFilterOperator operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
        return this;
    }

    public StringOperatorFilter withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public StringOperatorFilter withValue(Optional<String> value) {
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
        StringOperatorFilter other = (StringOperatorFilter) o;
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
        return Utils.toString(StringOperatorFilter.class,
                "type", type,
                "operator", operator,
                "value", value);
    }
    
    public final static class Builder {
 
        private StringEnum type;
 
        private StringOperatorFilterOperator operator;
 
        private Optional<String> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(StringEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Operators for string filters.
         */
        public Builder operator(StringOperatorFilterOperator operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public StringOperatorFilter build() {
            return new StringOperatorFilter(
                type,
                operator,
                value);
        }
    }
}

