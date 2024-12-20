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
 * CatalogItemDeleteJobCreateQueryResourceObjectItems - Array of catalog items to delete.
 */

public class CatalogItemDeleteJobCreateQueryResourceObjectItems {

    @JsonProperty("data")
    private List<CatalogItemDeleteQueryResourceObject> data;

    @JsonCreator
    public CatalogItemDeleteJobCreateQueryResourceObjectItems(
            @JsonProperty("data") List<CatalogItemDeleteQueryResourceObject> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public List<CatalogItemDeleteQueryResourceObject> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CatalogItemDeleteJobCreateQueryResourceObjectItems withData(List<CatalogItemDeleteQueryResourceObject> data) {
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
        CatalogItemDeleteJobCreateQueryResourceObjectItems other = (CatalogItemDeleteJobCreateQueryResourceObjectItems) o;
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
        return Utils.toString(CatalogItemDeleteJobCreateQueryResourceObjectItems.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private List<CatalogItemDeleteQueryResourceObject> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<CatalogItemDeleteQueryResourceObject> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public CatalogItemDeleteJobCreateQueryResourceObjectItems build() {
            return new CatalogItemDeleteJobCreateQueryResourceObjectItems(
                data);
        }
    }
}

