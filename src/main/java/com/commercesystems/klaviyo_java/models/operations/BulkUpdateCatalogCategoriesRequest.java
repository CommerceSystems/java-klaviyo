/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateJobCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class BulkUpdateCatalogCategoriesRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private CatalogCategoryUpdateJobCreateQuery catalogCategoryUpdateJobCreateQuery;

    @JsonCreator
    public BulkUpdateCatalogCategoriesRequest(
            String revision,
            CatalogCategoryUpdateJobCreateQuery catalogCategoryUpdateJobCreateQuery) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(catalogCategoryUpdateJobCreateQuery, "catalogCategoryUpdateJobCreateQuery");
        this.revision = revision;
        this.catalogCategoryUpdateJobCreateQuery = catalogCategoryUpdateJobCreateQuery;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public CatalogCategoryUpdateJobCreateQuery catalogCategoryUpdateJobCreateQuery() {
        return catalogCategoryUpdateJobCreateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public BulkUpdateCatalogCategoriesRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkUpdateCatalogCategoriesRequest withCatalogCategoryUpdateJobCreateQuery(CatalogCategoryUpdateJobCreateQuery catalogCategoryUpdateJobCreateQuery) {
        Utils.checkNotNull(catalogCategoryUpdateJobCreateQuery, "catalogCategoryUpdateJobCreateQuery");
        this.catalogCategoryUpdateJobCreateQuery = catalogCategoryUpdateJobCreateQuery;
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
        BulkUpdateCatalogCategoriesRequest other = (BulkUpdateCatalogCategoriesRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.catalogCategoryUpdateJobCreateQuery, other.catalogCategoryUpdateJobCreateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            catalogCategoryUpdateJobCreateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BulkUpdateCatalogCategoriesRequest.class,
                "revision", revision,
                "catalogCategoryUpdateJobCreateQuery", catalogCategoryUpdateJobCreateQuery);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private CatalogCategoryUpdateJobCreateQuery catalogCategoryUpdateJobCreateQuery;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }

        public Builder catalogCategoryUpdateJobCreateQuery(CatalogCategoryUpdateJobCreateQuery catalogCategoryUpdateJobCreateQuery) {
            Utils.checkNotNull(catalogCategoryUpdateJobCreateQuery, "catalogCategoryUpdateJobCreateQuery");
            this.catalogCategoryUpdateJobCreateQuery = catalogCategoryUpdateJobCreateQuery;
            return this;
        }
        
        public BulkUpdateCatalogCategoriesRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new BulkUpdateCatalogCategoriesRequest(
                revision,
                catalogCategoryUpdateJobCreateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

