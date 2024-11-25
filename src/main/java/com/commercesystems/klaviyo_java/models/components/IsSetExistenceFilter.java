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


public class IsSetExistenceFilter {

    @JsonProperty("type")
    private ExistenceEnum type;

    @JsonProperty("operator")
    private IsSetEnum operator;

    @JsonCreator
    public IsSetExistenceFilter(
            @JsonProperty("type") ExistenceEnum type,
            @JsonProperty("operator") IsSetEnum operator) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        this.type = type;
        this.operator = operator;
    }

    @JsonIgnore
    public ExistenceEnum type() {
        return type;
    }

    @JsonIgnore
    public IsSetEnum operator() {
        return operator;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public IsSetExistenceFilter withType(ExistenceEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public IsSetExistenceFilter withOperator(IsSetEnum operator) {
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
        IsSetExistenceFilter other = (IsSetExistenceFilter) o;
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
        return Utils.toString(IsSetExistenceFilter.class,
                "type", type,
                "operator", operator);
    }
    
    public final static class Builder {
 
        private ExistenceEnum type;
 
        private IsSetEnum operator;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ExistenceEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder operator(IsSetEnum operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }
        
        public IsSetExistenceFilter build() {
            return new IsSetExistenceFilter(
                type,
                operator);
        }
    }
}
