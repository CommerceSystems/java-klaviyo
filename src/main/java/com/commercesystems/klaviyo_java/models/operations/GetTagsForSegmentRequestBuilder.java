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

public class GetTagsForSegmentRequestBuilder {

    private String id;
    private Optional<? extends List<GetTagsForSegmentQueryParamFieldsTag>> fieldsTag = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetTagsForSegment sdk;

    public GetTagsForSegmentRequestBuilder(SDKMethodInterfaces.MethodCallGetTagsForSegment sdk) {
        this.sdk = sdk;
    }

    public GetTagsForSegmentRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetTagsForSegmentRequestBuilder fieldsTag(List<GetTagsForSegmentQueryParamFieldsTag> fieldsTag) {
        Utils.checkNotNull(fieldsTag, "fieldsTag");
        this.fieldsTag = Optional.of(fieldsTag);
        return this;
    }

    public GetTagsForSegmentRequestBuilder fieldsTag(Optional<? extends List<GetTagsForSegmentQueryParamFieldsTag>> fieldsTag) {
        Utils.checkNotNull(fieldsTag, "fieldsTag");
        this.fieldsTag = fieldsTag;
        return this;
    }

    public GetTagsForSegmentRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetTagsForSegmentResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getTagsForSegment(
            id,
            fieldsTag,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
