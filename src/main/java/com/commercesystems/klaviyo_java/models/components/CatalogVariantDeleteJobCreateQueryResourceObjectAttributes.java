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


public class CatalogVariantDeleteJobCreateQueryResourceObjectAttributes {

    /**
     * Array of catalog variants to delete.
     */
    @JsonProperty("variants")
    private CatalogVariantDeleteJobCreateQueryResourceObjectVariants variants;

    @JsonCreator
    public CatalogVariantDeleteJobCreateQueryResourceObjectAttributes(
            @JsonProperty("variants") CatalogVariantDeleteJobCreateQueryResourceObjectVariants variants) {
        Utils.checkNotNull(variants, "variants");
        this.variants = variants;
    }

    /**
     * Array of catalog variants to delete.
     */
    @JsonIgnore
    public CatalogVariantDeleteJobCreateQueryResourceObjectVariants variants() {
        return variants;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Array of catalog variants to delete.
     */
    public CatalogVariantDeleteJobCreateQueryResourceObjectAttributes withVariants(CatalogVariantDeleteJobCreateQueryResourceObjectVariants variants) {
        Utils.checkNotNull(variants, "variants");
        this.variants = variants;
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
        CatalogVariantDeleteJobCreateQueryResourceObjectAttributes other = (CatalogVariantDeleteJobCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.variants, other.variants);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            variants);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CatalogVariantDeleteJobCreateQueryResourceObjectAttributes.class,
                "variants", variants);
    }
    
    public final static class Builder {
 
        private CatalogVariantDeleteJobCreateQueryResourceObjectVariants variants;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Array of catalog variants to delete.
         */
        public Builder variants(CatalogVariantDeleteJobCreateQueryResourceObjectVariants variants) {
            Utils.checkNotNull(variants, "variants");
            this.variants = variants;
            return this;
        }
        
        public CatalogVariantDeleteJobCreateQueryResourceObjectAttributes build() {
            return new CatalogVariantDeleteJobCreateQueryResourceObjectAttributes(
                variants);
        }
    }
}
