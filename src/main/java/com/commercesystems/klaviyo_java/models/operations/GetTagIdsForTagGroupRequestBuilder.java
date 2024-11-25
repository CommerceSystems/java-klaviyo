/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class GetTagIdsForTagGroupRequestBuilder {

    private String id;
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetTagIdsForTagGroup sdk;

    public GetTagIdsForTagGroupRequestBuilder(SDKMethodInterfaces.MethodCallGetTagIdsForTagGroup sdk) {
        this.sdk = sdk;
    }

    public GetTagIdsForTagGroupRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetTagIdsForTagGroupRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetTagIdsForTagGroupResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getTagIdsForTagGroup(
            id,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
