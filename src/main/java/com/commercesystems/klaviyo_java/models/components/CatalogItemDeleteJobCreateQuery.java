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


public class CatalogItemDeleteJobCreateQuery {

    @JsonProperty("data")
    private CatalogItemDeleteJobCreateQueryResourceObject data;

    @JsonCreator
    public CatalogItemDeleteJobCreateQuery(
            @JsonProperty("data") CatalogItemDeleteJobCreateQueryResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public CatalogItemDeleteJobCreateQueryResourceObject data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CatalogItemDeleteJobCreateQuery withData(CatalogItemDeleteJobCreateQueryResourceObject data) {
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
        CatalogItemDeleteJobCreateQuery other = (CatalogItemDeleteJobCreateQuery) o;
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
        return Utils.toString(CatalogItemDeleteJobCreateQuery.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private CatalogItemDeleteJobCreateQueryResourceObject data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(CatalogItemDeleteJobCreateQueryResourceObject data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public CatalogItemDeleteJobCreateQuery build() {
            return new CatalogItemDeleteJobCreateQuery(
                data);
        }
    }
}

