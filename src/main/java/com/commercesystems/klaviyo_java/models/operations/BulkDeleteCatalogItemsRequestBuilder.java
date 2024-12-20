/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CatalogItemDeleteJobCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class BulkDeleteCatalogItemsRequestBuilder {

    private String revision;
    private CatalogItemDeleteJobCreateQuery catalogItemDeleteJobCreateQuery;
    private final SDKMethodInterfaces.MethodCallBulkDeleteCatalogItems sdk;

    public BulkDeleteCatalogItemsRequestBuilder(SDKMethodInterfaces.MethodCallBulkDeleteCatalogItems sdk) {
        this.sdk = sdk;
    }

    public BulkDeleteCatalogItemsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkDeleteCatalogItemsRequestBuilder catalogItemDeleteJobCreateQuery(CatalogItemDeleteJobCreateQuery catalogItemDeleteJobCreateQuery) {
        Utils.checkNotNull(catalogItemDeleteJobCreateQuery, "catalogItemDeleteJobCreateQuery");
        this.catalogItemDeleteJobCreateQuery = catalogItemDeleteJobCreateQuery;
        return this;
    }

    public BulkDeleteCatalogItemsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.bulkDeleteCatalogItems(
            revision,
            catalogItemDeleteJobCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
