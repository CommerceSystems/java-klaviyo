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


public class GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("items")
    private Optional<? extends GetCatalogItemCreateJobResponseCollectionCompoundDocumentItems> items;

    @JsonCreator
    public GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships(
            @JsonProperty("items") Optional<? extends GetCatalogItemCreateJobResponseCollectionCompoundDocumentItems> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
    }
    
    public GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCatalogItemCreateJobResponseCollectionCompoundDocumentItems> items() {
        return (Optional<GetCatalogItemCreateJobResponseCollectionCompoundDocumentItems>) items;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships withItems(GetCatalogItemCreateJobResponseCollectionCompoundDocumentItems items) {
        Utils.checkNotNull(items, "items");
        this.items = Optional.ofNullable(items);
        return this;
    }

    public GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships withItems(Optional<? extends GetCatalogItemCreateJobResponseCollectionCompoundDocumentItems> items) {
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
        GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships other = (GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships) o;
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
        return Utils.toString(GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships.class,
                "items", items);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetCatalogItemCreateJobResponseCollectionCompoundDocumentItems> items = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder items(GetCatalogItemCreateJobResponseCollectionCompoundDocumentItems items) {
            Utils.checkNotNull(items, "items");
            this.items = Optional.ofNullable(items);
            return this;
        }

        public Builder items(Optional<? extends GetCatalogItemCreateJobResponseCollectionCompoundDocumentItems> items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships build() {
            return new GetCatalogItemCreateJobResponseCollectionCompoundDocumentRelationships(
                items);
        }
    }
}

