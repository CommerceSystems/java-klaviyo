/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CatalogItemCategoryOp;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class RemoveCategoriesFromCatalogItemRequestBuilder {

    private String id;
    private String revision;
    private CatalogItemCategoryOp catalogItemCategoryOp;
    private final SDKMethodInterfaces.MethodCallRemoveCategoriesFromCatalogItem sdk;

    public RemoveCategoriesFromCatalogItemRequestBuilder(SDKMethodInterfaces.MethodCallRemoveCategoriesFromCatalogItem sdk) {
        this.sdk = sdk;
    }

    public RemoveCategoriesFromCatalogItemRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public RemoveCategoriesFromCatalogItemRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public RemoveCategoriesFromCatalogItemRequestBuilder catalogItemCategoryOp(CatalogItemCategoryOp catalogItemCategoryOp) {
        Utils.checkNotNull(catalogItemCategoryOp, "catalogItemCategoryOp");
        this.catalogItemCategoryOp = catalogItemCategoryOp;
        return this;
    }

    public RemoveCategoriesFromCatalogItemResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.removeCategoriesFromCatalogItem(
            id,
            revision,
            catalogItemCategoryOp);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
