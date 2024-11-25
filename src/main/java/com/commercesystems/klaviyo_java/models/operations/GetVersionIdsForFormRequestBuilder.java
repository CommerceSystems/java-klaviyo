/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class GetVersionIdsForFormRequestBuilder {

    private String id;
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetVersionIdsForForm sdk;

    public GetVersionIdsForFormRequestBuilder(SDKMethodInterfaces.MethodCallGetVersionIdsForForm sdk) {
        this.sdk = sdk;
    }

    public GetVersionIdsForFormRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetVersionIdsForFormRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetVersionIdsForFormResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getVersionIdsForForm(
            id,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}