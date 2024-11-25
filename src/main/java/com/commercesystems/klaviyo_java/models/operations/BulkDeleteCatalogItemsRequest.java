/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.CatalogItemDeleteJobCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class BulkDeleteCatalogItemsRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private CatalogItemDeleteJobCreateQuery catalogItemDeleteJobCreateQuery;

    @JsonCreator
    public BulkDeleteCatalogItemsRequest(
            String revision,
            CatalogItemDeleteJobCreateQuery catalogItemDeleteJobCreateQuery) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(catalogItemDeleteJobCreateQuery, "catalogItemDeleteJobCreateQuery");
        this.revision = revision;
        this.catalogItemDeleteJobCreateQuery = catalogItemDeleteJobCreateQuery;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public CatalogItemDeleteJobCreateQuery catalogItemDeleteJobCreateQuery() {
        return catalogItemDeleteJobCreateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public BulkDeleteCatalogItemsRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkDeleteCatalogItemsRequest withCatalogItemDeleteJobCreateQuery(CatalogItemDeleteJobCreateQuery catalogItemDeleteJobCreateQuery) {
        Utils.checkNotNull(catalogItemDeleteJobCreateQuery, "catalogItemDeleteJobCreateQuery");
        this.catalogItemDeleteJobCreateQuery = catalogItemDeleteJobCreateQuery;
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
        BulkDeleteCatalogItemsRequest other = (BulkDeleteCatalogItemsRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.catalogItemDeleteJobCreateQuery, other.catalogItemDeleteJobCreateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            catalogItemDeleteJobCreateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BulkDeleteCatalogItemsRequest.class,
                "revision", revision,
                "catalogItemDeleteJobCreateQuery", catalogItemDeleteJobCreateQuery);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private CatalogItemDeleteJobCreateQuery catalogItemDeleteJobCreateQuery;  
        
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

        public Builder catalogItemDeleteJobCreateQuery(CatalogItemDeleteJobCreateQuery catalogItemDeleteJobCreateQuery) {
            Utils.checkNotNull(catalogItemDeleteJobCreateQuery, "catalogItemDeleteJobCreateQuery");
            this.catalogItemDeleteJobCreateQuery = catalogItemDeleteJobCreateQuery;
            return this;
        }
        
        public BulkDeleteCatalogItemsRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new BulkDeleteCatalogItemsRequest(
                revision,
                catalogItemDeleteJobCreateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}
