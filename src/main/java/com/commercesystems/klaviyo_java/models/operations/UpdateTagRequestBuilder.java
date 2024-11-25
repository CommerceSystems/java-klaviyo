/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.TagUpdateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class UpdateTagRequestBuilder {

    private String id;
    private String revision;
    private TagUpdateQuery tagUpdateQuery;
    private final SDKMethodInterfaces.MethodCallUpdateTag sdk;

    public UpdateTagRequestBuilder(SDKMethodInterfaces.MethodCallUpdateTag sdk) {
        this.sdk = sdk;
    }

    public UpdateTagRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateTagRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UpdateTagRequestBuilder tagUpdateQuery(TagUpdateQuery tagUpdateQuery) {
        Utils.checkNotNull(tagUpdateQuery, "tagUpdateQuery");
        this.tagUpdateQuery = tagUpdateQuery;
        return this;
    }

    public UpdateTagResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.updateTag(
            id,
            revision,
            tagUpdateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
