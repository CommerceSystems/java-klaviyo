/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.ListPartialUpdateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class UpdateListRequestBuilder {

    private String id;
    private String revision;
    private ListPartialUpdateQuery listPartialUpdateQuery;
    private final SDKMethodInterfaces.MethodCallUpdateList sdk;

    public UpdateListRequestBuilder(SDKMethodInterfaces.MethodCallUpdateList sdk) {
        this.sdk = sdk;
    }

    public UpdateListRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateListRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UpdateListRequestBuilder listPartialUpdateQuery(ListPartialUpdateQuery listPartialUpdateQuery) {
        Utils.checkNotNull(listPartialUpdateQuery, "listPartialUpdateQuery");
        this.listPartialUpdateQuery = listPartialUpdateQuery;
        return this;
    }

    public UpdateListResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.updateList(
            id,
            revision,
            listPartialUpdateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
