/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * PatchCatalogItemResponseCustomMetadata - Flat JSON blob to provide custom metadata about the catalog item. May not exceed 100kb.
 */

public class PatchCatalogItemResponseCustomMetadata {

    @JsonCreator
    public PatchCatalogItemResponseCustomMetadata() {
        
        
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchCatalogItemResponseCustomMetadata.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public PatchCatalogItemResponseCustomMetadata build() {
            return new PatchCatalogItemResponseCustomMetadata(
                );
        }
    }
}

