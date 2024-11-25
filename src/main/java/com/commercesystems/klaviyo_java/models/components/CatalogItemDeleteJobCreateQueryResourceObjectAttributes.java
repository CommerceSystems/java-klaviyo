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


public class CatalogItemDeleteJobCreateQueryResourceObjectAttributes {

    /**
     * Array of catalog items to delete.
     */
    @JsonProperty("items")
    private CatalogItemDeleteJobCreateQueryResourceObjectItems items;

    @JsonCreator
    public CatalogItemDeleteJobCreateQueryResourceObjectAttributes(
            @JsonProperty("items") CatalogItemDeleteJobCreateQueryResourceObjectItems items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
    }

    /**
     * Array of catalog items to delete.
     */
    @JsonIgnore
    public CatalogItemDeleteJobCreateQueryResourceObjectItems items() {
        return items;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Array of catalog items to delete.
     */
    public CatalogItemDeleteJobCreateQueryResourceObjectAttributes withItems(CatalogItemDeleteJobCreateQueryResourceObjectItems items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
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
        CatalogItemDeleteJobCreateQueryResourceObjectAttributes other = (CatalogItemDeleteJobCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.items, other.items);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            items);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CatalogItemDeleteJobCreateQueryResourceObjectAttributes.class,
                "items", items);
    }
    
    public final static class Builder {
 
        private CatalogItemDeleteJobCreateQueryResourceObjectItems items;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Array of catalog items to delete.
         */
        public Builder items(CatalogItemDeleteJobCreateQueryResourceObjectItems items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public CatalogItemDeleteJobCreateQueryResourceObjectAttributes build() {
            return new CatalogItemDeleteJobCreateQueryResourceObjectAttributes(
                items);
        }
    }
}

