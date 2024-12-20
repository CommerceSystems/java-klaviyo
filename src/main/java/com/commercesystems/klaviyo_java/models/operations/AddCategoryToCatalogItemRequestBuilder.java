/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CatalogItemCategoryOp;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class AddCategoryToCatalogItemRequestBuilder {

    private String id;
    private String revision;
    private CatalogItemCategoryOp catalogItemCategoryOp;
    private final SDKMethodInterfaces.MethodCallAddCategoryToCatalogItem sdk;

    public AddCategoryToCatalogItemRequestBuilder(SDKMethodInterfaces.MethodCallAddCategoryToCatalogItem sdk) {
        this.sdk = sdk;
    }

    public AddCategoryToCatalogItemRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AddCategoryToCatalogItemRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public AddCategoryToCatalogItemRequestBuilder catalogItemCategoryOp(CatalogItemCategoryOp catalogItemCategoryOp) {
        Utils.checkNotNull(catalogItemCategoryOp, "catalogItemCategoryOp");
        this.catalogItemCategoryOp = catalogItemCategoryOp;
        return this;
    }

    public AddCategoryToCatalogItemResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.addCategoryToCatalogItem(
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
