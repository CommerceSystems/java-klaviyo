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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetCatalogVariantCreateJobResponseCollectionCompoundDocument {

    @JsonProperty("data")
    private List<GetCatalogVariantCreateJobResponseCollectionCompoundDocumentData> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private Optional<? extends CollectionLinks> links;

    @JsonCreator
    public GetCatalogVariantCreateJobResponseCollectionCompoundDocument(
            @JsonProperty("data") List<GetCatalogVariantCreateJobResponseCollectionCompoundDocumentData> data,
            @JsonProperty("links") Optional<? extends CollectionLinks> links) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(links, "links");
        this.data = data;
        this.links = links;
    }
    
    public GetCatalogVariantCreateJobResponseCollectionCompoundDocument(
            List<GetCatalogVariantCreateJobResponseCollectionCompoundDocumentData> data) {
        this(data, Optional.empty());
    }

    @JsonIgnore
    public List<GetCatalogVariantCreateJobResponseCollectionCompoundDocumentData> data() {
        return data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CollectionLinks> links() {
        return (Optional<CollectionLinks>) links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCatalogVariantCreateJobResponseCollectionCompoundDocument withData(List<GetCatalogVariantCreateJobResponseCollectionCompoundDocumentData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public GetCatalogVariantCreateJobResponseCollectionCompoundDocument withLinks(CollectionLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    public GetCatalogVariantCreateJobResponseCollectionCompoundDocument withLinks(Optional<? extends CollectionLinks> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
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
        GetCatalogVariantCreateJobResponseCollectionCompoundDocument other = (GetCatalogVariantCreateJobResponseCollectionCompoundDocument) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCatalogVariantCreateJobResponseCollectionCompoundDocument.class,
                "data", data,
                "links", links);
    }
    
    public final static class Builder {
 
        private List<GetCatalogVariantCreateJobResponseCollectionCompoundDocumentData> data;
 
        private Optional<? extends CollectionLinks> links = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<GetCatalogVariantCreateJobResponseCollectionCompoundDocumentData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder links(CollectionLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = Optional.ofNullable(links);
            return this;
        }

        public Builder links(Optional<? extends CollectionLinks> links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public GetCatalogVariantCreateJobResponseCollectionCompoundDocument build() {
            return new GetCatalogVariantCreateJobResponseCollectionCompoundDocument(
                data,
                links);
        }
    }
}

