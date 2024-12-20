/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CatalogVariantDeleteJobCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class BulkDeleteCatalogVariantsRequestBuilder {

    private String revision;
    private CatalogVariantDeleteJobCreateQuery catalogVariantDeleteJobCreateQuery;
    private final SDKMethodInterfaces.MethodCallBulkDeleteCatalogVariants sdk;

    public BulkDeleteCatalogVariantsRequestBuilder(SDKMethodInterfaces.MethodCallBulkDeleteCatalogVariants sdk) {
        this.sdk = sdk;
    }

    public BulkDeleteCatalogVariantsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkDeleteCatalogVariantsRequestBuilder catalogVariantDeleteJobCreateQuery(CatalogVariantDeleteJobCreateQuery catalogVariantDeleteJobCreateQuery) {
        Utils.checkNotNull(catalogVariantDeleteJobCreateQuery, "catalogVariantDeleteJobCreateQuery");
        this.catalogVariantDeleteJobCreateQuery = catalogVariantDeleteJobCreateQuery;
        return this;
    }

    public BulkDeleteCatalogVariantsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.bulkDeleteCatalogVariants(
            revision,
            catalogVariantDeleteJobCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
