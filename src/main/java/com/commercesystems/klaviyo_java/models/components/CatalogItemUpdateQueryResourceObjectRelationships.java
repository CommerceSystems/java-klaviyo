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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CatalogItemUpdateQueryResourceObjectRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("categories")
    private Optional<? extends CatalogItemUpdateQueryResourceObjectCategories> categories;

    @JsonCreator
    public CatalogItemUpdateQueryResourceObjectRelationships(
            @JsonProperty("categories") Optional<? extends CatalogItemUpdateQueryResourceObjectCategories> categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = categories;
    }
    
    public CatalogItemUpdateQueryResourceObjectRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CatalogItemUpdateQueryResourceObjectCategories> categories() {
        return (Optional<CatalogItemUpdateQueryResourceObjectCategories>) categories;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CatalogItemUpdateQueryResourceObjectRelationships withCategories(CatalogItemUpdateQueryResourceObjectCategories categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = Optional.ofNullable(categories);
        return this;
    }

    public CatalogItemUpdateQueryResourceObjectRelationships withCategories(Optional<? extends CatalogItemUpdateQueryResourceObjectCategories> categories) {
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
        CatalogItemUpdateQueryResourceObjectRelationships other = (CatalogItemUpdateQueryResourceObjectRelationships) o;
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
        return Utils.toString(CatalogItemUpdateQueryResourceObjectRelationships.class,
                "categories", categories);
    }
    
    public final static class Builder {
 
        private Optional<? extends CatalogItemUpdateQueryResourceObjectCategories> categories = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder categories(CatalogItemUpdateQueryResourceObjectCategories categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = Optional.ofNullable(categories);
            return this;
        }

        public Builder categories(Optional<? extends CatalogItemUpdateQueryResourceObjectCategories> categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = categories;
            return this;
        }
        
        public CatalogItemUpdateQueryResourceObjectRelationships build() {
            return new CatalogItemUpdateQueryResourceObjectRelationships(
                categories);
        }
    }
}

