/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.TagListOp;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class TagListsRequestBuilder {

    private String id;
    private String revision;
    private TagListOp tagListOp;
    private final SDKMethodInterfaces.MethodCallTagLists sdk;

    public TagListsRequestBuilder(SDKMethodInterfaces.MethodCallTagLists sdk) {
        this.sdk = sdk;
    }

    public TagListsRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TagListsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public TagListsRequestBuilder tagListOp(TagListOp tagListOp) {
        Utils.checkNotNull(tagListOp, "tagListOp");
        this.tagListOp = tagListOp;
        return this;
    }

    public TagListsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.tagLists(
            id,
            revision,
            tagListOp);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
