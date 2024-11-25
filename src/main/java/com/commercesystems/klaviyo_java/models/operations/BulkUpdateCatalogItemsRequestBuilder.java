/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateJobCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class BulkUpdateCatalogItemsRequestBuilder {

    private String revision;
    private CatalogItemUpdateJobCreateQuery catalogItemUpdateJobCreateQuery;
    private final SDKMethodInterfaces.MethodCallBulkUpdateCatalogItems sdk;

    public BulkUpdateCatalogItemsRequestBuilder(SDKMethodInterfaces.MethodCallBulkUpdateCatalogItems sdk) {
        this.sdk = sdk;
    }

    public BulkUpdateCatalogItemsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkUpdateCatalogItemsRequestBuilder catalogItemUpdateJobCreateQuery(CatalogItemUpdateJobCreateQuery catalogItemUpdateJobCreateQuery) {
        Utils.checkNotNull(catalogItemUpdateJobCreateQuery, "catalogItemUpdateJobCreateQuery");
        this.catalogItemUpdateJobCreateQuery = catalogItemUpdateJobCreateQuery;
        return this;
    }

    public BulkUpdateCatalogItemsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.bulkUpdateCatalogItems(
            revision,
            catalogItemUpdateJobCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
