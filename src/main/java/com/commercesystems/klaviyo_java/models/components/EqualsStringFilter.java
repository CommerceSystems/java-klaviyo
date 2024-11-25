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


public class EqualsStringFilter {

    @JsonProperty("type")
    private StringEnum type;

    @JsonProperty("operator")
    private EqualsEnum operator;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("value")
    private Optional<String> value;

    @JsonCreator
    public EqualsStringFilter(
            @JsonProperty("type") StringEnum type,
            @JsonProperty("operator") EqualsEnum operator,
            @JsonProperty("value") Optional<String> value) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        Utils.checkNotNull(value, "value");
        this.type = type;
        this.operator = operator;
        this.value = value;
    }
    
    public EqualsStringFilter(
            StringEnum type,
            EqualsEnum operator) {
        this(type, operator, Optional.empty());
    }

    @JsonIgnore
    public StringEnum type() {
        return type;
    }

    @JsonIgnore
    public EqualsEnum operator() {
        return operator;
    }

    @JsonIgnore
    public Optional<String> value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EqualsStringFilter withType(StringEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public EqualsStringFilter withOperator(EqualsEnum operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
        return this;
    }

    public EqualsStringFilter withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public EqualsStringFilter withValue(Optional<String> value) {
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
        EqualsStringFilter other = (EqualsStringFilter) o;
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
        return Utils.toString(EqualsStringFilter.class,
                "type", type,
                "operator", operator,
                "value", value);
    }
    
    public final static class Builder {
 
        private StringEnum type;
 
        private EqualsEnum operator;
 
        private Optional<String> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(StringEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder operator(EqualsEnum operator) {
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
        
        public EqualsStringFilter build() {
            return new EqualsStringFilter(
                type,
                operator,
                value);
        }
    }
}
