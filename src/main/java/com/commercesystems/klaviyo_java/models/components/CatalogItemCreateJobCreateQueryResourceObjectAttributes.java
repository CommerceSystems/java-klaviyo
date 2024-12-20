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


public class CatalogItemCreateJobCreateQueryResourceObjectAttributes {

    /**
     * Array of catalog items to create.
     */
    @JsonProperty("items")
    private CatalogItemCreateJobCreateQueryResourceObjectItems items;

    @JsonCreator
    public CatalogItemCreateJobCreateQueryResourceObjectAttributes(
            @JsonProperty("items") CatalogItemCreateJobCreateQueryResourceObjectItems items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
    }

    /**
     * Array of catalog items to create.
     */
    @JsonIgnore
    public CatalogItemCreateJobCreateQueryResourceObjectItems items() {
        return items;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Array of catalog items to create.
     */
    public CatalogItemCreateJobCreateQueryResourceObjectAttributes withItems(CatalogItemCreateJobCreateQueryResourceObjectItems items) {
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
        CatalogItemCreateJobCreateQueryResourceObjectAttributes other = (CatalogItemCreateJobCreateQueryResourceObjectAttributes) o;
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
        return Utils.toString(CatalogItemCreateJobCreateQueryResourceObjectAttributes.class,
                "items", items);
    }
    
    public final static class Builder {
 
        private CatalogItemCreateJobCreateQueryResourceObjectItems items;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Array of catalog items to create.
         */
        public Builder items(CatalogItemCreateJobCreateQueryResourceObjectItems items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public CatalogItemCreateJobCreateQueryResourceObjectAttributes build() {
            return new CatalogItemCreateJobCreateQueryResourceObjectAttributes(
                items);
        }
    }
}

