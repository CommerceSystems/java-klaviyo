/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateJobCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class BulkCreateCatalogVariantsRequestBuilder {

    private String revision;
    private CatalogVariantCreateJobCreateQuery catalogVariantCreateJobCreateQuery;
    private final SDKMethodInterfaces.MethodCallBulkCreateCatalogVariants sdk;

    public BulkCreateCatalogVariantsRequestBuilder(SDKMethodInterfaces.MethodCallBulkCreateCatalogVariants sdk) {
        this.sdk = sdk;
    }

    public BulkCreateCatalogVariantsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkCreateCatalogVariantsRequestBuilder catalogVariantCreateJobCreateQuery(CatalogVariantCreateJobCreateQuery catalogVariantCreateJobCreateQuery) {
        Utils.checkNotNull(catalogVariantCreateJobCreateQuery, "catalogVariantCreateJobCreateQuery");
        this.catalogVariantCreateJobCreateQuery = catalogVariantCreateJobCreateQuery;
        return this;
    }

    public BulkCreateCatalogVariantsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.bulkCreateCatalogVariants(
            revision,
            catalogVariantCreateJobCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
