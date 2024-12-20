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


public class CatalogCategoryUpdateJobCreateQuery {

    @JsonProperty("data")
    private CatalogCategoryUpdateJobCreateQueryResourceObject data;

    @JsonCreator
    public CatalogCategoryUpdateJobCreateQuery(
            @JsonProperty("data") CatalogCategoryUpdateJobCreateQueryResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public CatalogCategoryUpdateJobCreateQueryResourceObject data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CatalogCategoryUpdateJobCreateQuery withData(CatalogCategoryUpdateJobCreateQueryResourceObject data) {
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
        CatalogCategoryUpdateJobCreateQuery other = (CatalogCategoryUpdateJobCreateQuery) o;
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
        return Utils.toString(CatalogCategoryUpdateJobCreateQuery.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private CatalogCategoryUpdateJobCreateQueryResourceObject data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(CatalogCategoryUpdateJobCreateQueryResourceObject data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public CatalogCategoryUpdateJobCreateQuery build() {
            return new CatalogCategoryUpdateJobCreateQuery(
                data);
        }
    }
}

