/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class UpdateCatalogCategoryRequestBuilder {

    private String id;
    private String revision;
    private CatalogCategoryUpdateQuery catalogCategoryUpdateQuery;
    private final SDKMethodInterfaces.MethodCallUpdateCatalogCategory sdk;

    public UpdateCatalogCategoryRequestBuilder(SDKMethodInterfaces.MethodCallUpdateCatalogCategory sdk) {
        this.sdk = sdk;
    }

    public UpdateCatalogCategoryRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateCatalogCategoryRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UpdateCatalogCategoryRequestBuilder catalogCategoryUpdateQuery(CatalogCategoryUpdateQuery catalogCategoryUpdateQuery) {
        Utils.checkNotNull(catalogCategoryUpdateQuery, "catalogCategoryUpdateQuery");
        this.catalogCategoryUpdateQuery = catalogCategoryUpdateQuery;
        return this;
    }

    public UpdateCatalogCategoryResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.updateCatalogCategory(
            id,
            revision,
            catalogCategoryUpdateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
