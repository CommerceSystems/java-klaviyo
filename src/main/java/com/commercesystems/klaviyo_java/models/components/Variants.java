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

/**
 * Variants - Array of catalog variants to create.
 */

public class Variants {

    @JsonProperty("data")
    private List<CatalogVariantCreateQueryResourceObject> data;

    @JsonCreator
    public Variants(
            @JsonProperty("data") List<CatalogVariantCreateQueryResourceObject> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public List<CatalogVariantCreateQueryResourceObject> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Variants withData(List<CatalogVariantCreateQueryResourceObject> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        Variants other = (Variants) o;
        return 
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Variants.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private List<CatalogVariantCreateQueryResourceObject> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<CatalogVariantCreateQueryResourceObject> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public Variants build() {
            return new Variants(
                data);
        }
    }
}

