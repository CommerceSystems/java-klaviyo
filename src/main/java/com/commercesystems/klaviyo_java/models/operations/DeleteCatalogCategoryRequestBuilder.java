/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class DeleteCatalogCategoryRequestBuilder {

    private String id;
    private String revision;
    private final SDKMethodInterfaces.MethodCallDeleteCatalogCategory sdk;

    public DeleteCatalogCategoryRequestBuilder(SDKMethodInterfaces.MethodCallDeleteCatalogCategory sdk) {
        this.sdk = sdk;
    }

    public DeleteCatalogCategoryRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public DeleteCatalogCategoryRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public DeleteCatalogCategoryResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.deleteCatalogCategory(
            id,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
