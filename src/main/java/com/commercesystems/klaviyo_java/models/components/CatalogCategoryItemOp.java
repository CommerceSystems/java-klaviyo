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


public class CatalogCategoryItemOp {

    @JsonProperty("data")
    private List<CatalogCategoryItemOpData> data;

    @JsonCreator
    public CatalogCategoryItemOp(
            @JsonProperty("data") List<CatalogCategoryItemOpData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public List<CatalogCategoryItemOpData> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CatalogCategoryItemOp withData(List<CatalogCategoryItemOpData> data) {
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
        CatalogCategoryItemOp other = (CatalogCategoryItemOp) o;
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
        return Utils.toString(CatalogCategoryItemOp.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private List<CatalogCategoryItemOpData> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<CatalogCategoryItemOpData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public CatalogCategoryItemOp build() {
            return new CatalogCategoryItemOp(
                data);
        }
    }
}

