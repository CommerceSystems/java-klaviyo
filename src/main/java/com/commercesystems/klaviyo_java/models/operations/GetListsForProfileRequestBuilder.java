/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class GetListsForProfileRequestBuilder {

    private String id;
    private Optional<? extends List<GetListsForProfileQueryParamFieldsList>> fieldsList = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetListsForProfile sdk;

    public GetListsForProfileRequestBuilder(SDKMethodInterfaces.MethodCallGetListsForProfile sdk) {
        this.sdk = sdk;
    }

    public GetListsForProfileRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetListsForProfileRequestBuilder fieldsList(List<GetListsForProfileQueryParamFieldsList> fieldsList) {
        Utils.checkNotNull(fieldsList, "fieldsList");
        this.fieldsList = Optional.of(fieldsList);
        return this;
    }

    public GetListsForProfileRequestBuilder fieldsList(Optional<? extends List<GetListsForProfileQueryParamFieldsList>> fieldsList) {
        Utils.checkNotNull(fieldsList, "fieldsList");
        this.fieldsList = fieldsList;
        return this;
    }

    public GetListsForProfileRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetListsForProfileResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getListsForProfile(
            id,
            fieldsList,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
