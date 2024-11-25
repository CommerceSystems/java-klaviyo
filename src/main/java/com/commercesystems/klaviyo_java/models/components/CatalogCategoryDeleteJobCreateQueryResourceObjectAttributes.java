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


public class CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes {

    /**
     * Array of catalog categories to delete.
     */
    @JsonProperty("categories")
    private CatalogCategoryDeleteJobCreateQueryResourceObjectCategories categories;

    @JsonCreator
    public CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes(
            @JsonProperty("categories") CatalogCategoryDeleteJobCreateQueryResourceObjectCategories categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = categories;
    }

    /**
     * Array of catalog categories to delete.
     */
    @JsonIgnore
    public CatalogCategoryDeleteJobCreateQueryResourceObjectCategories categories() {
        return categories;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Array of catalog categories to delete.
     */
    public CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes withCategories(CatalogCategoryDeleteJobCreateQueryResourceObjectCategories categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = categories;
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
        CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes other = (CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.categories, other.categories);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            categories);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes.class,
                "categories", categories);
    }
    
    public final static class Builder {
 
        private CatalogCategoryDeleteJobCreateQueryResourceObjectCategories categories;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Array of catalog categories to delete.
         */
        public Builder categories(CatalogCategoryDeleteJobCreateQueryResourceObjectCategories categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = categories;
            return this;
        }
        
        public CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes build() {
            return new CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes(
                categories);
        }
    }
}
