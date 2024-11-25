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


public class GetCatalogVariantDeleteJobResponseRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("variants")
    private Optional<? extends GetCatalogVariantDeleteJobResponseVariants> variants;

    @JsonCreator
    public GetCatalogVariantDeleteJobResponseRelationships(
            @JsonProperty("variants") Optional<? extends GetCatalogVariantDeleteJobResponseVariants> variants) {
        Utils.checkNotNull(variants, "variants");
        this.variants = variants;
    }
    
    public GetCatalogVariantDeleteJobResponseRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCatalogVariantDeleteJobResponseVariants> variants() {
        return (Optional<GetCatalogVariantDeleteJobResponseVariants>) variants;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCatalogVariantDeleteJobResponseRelationships withVariants(GetCatalogVariantDeleteJobResponseVariants variants) {
        Utils.checkNotNull(variants, "variants");
        this.variants = Optional.ofNullable(variants);
        return this;
    }

    public GetCatalogVariantDeleteJobResponseRelationships withVariants(Optional<? extends GetCatalogVariantDeleteJobResponseVariants> variants) {
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
        GetCatalogVariantDeleteJobResponseRelationships other = (GetCatalogVariantDeleteJobResponseRelationships) o;
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
        return Utils.toString(GetCatalogVariantDeleteJobResponseRelationships.class,
                "variants", variants);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetCatalogVariantDeleteJobResponseVariants> variants = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder variants(GetCatalogVariantDeleteJobResponseVariants variants) {
            Utils.checkNotNull(variants, "variants");
            this.variants = Optional.ofNullable(variants);
            return this;
        }

        public Builder variants(Optional<? extends GetCatalogVariantDeleteJobResponseVariants> variants) {
            Utils.checkNotNull(variants, "variants");
            this.variants = variants;
            return this;
        }
        
        public GetCatalogVariantDeleteJobResponseRelationships build() {
            return new GetCatalogVariantDeleteJobResponseRelationships(
                variants);
        }
    }
}
