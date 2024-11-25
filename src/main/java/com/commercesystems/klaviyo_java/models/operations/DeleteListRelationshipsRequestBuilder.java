/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.ListMembersDeleteQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class DeleteListRelationshipsRequestBuilder {

    private String id;
    private String revision;
    private ListMembersDeleteQuery listMembersDeleteQuery;
    private final SDKMethodInterfaces.MethodCallDeleteListRelationships sdk;

    public DeleteListRelationshipsRequestBuilder(SDKMethodInterfaces.MethodCallDeleteListRelationships sdk) {
        this.sdk = sdk;
    }

    public DeleteListRelationshipsRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public DeleteListRelationshipsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public DeleteListRelationshipsRequestBuilder listMembersDeleteQuery(ListMembersDeleteQuery listMembersDeleteQuery) {
        Utils.checkNotNull(listMembersDeleteQuery, "listMembersDeleteQuery");
        this.listMembersDeleteQuery = listMembersDeleteQuery;
        return this;
    }

    public DeleteListRelationshipsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.deleteListRelationships(
            id,
            revision,
            listMembersDeleteQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
