/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.ImagePartialUpdateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class UpdateImageRequestBuilder {

    private String id;
    private String revision;
    private ImagePartialUpdateQuery imagePartialUpdateQuery;
    private final SDKMethodInterfaces.MethodCallUpdateImage sdk;

    public UpdateImageRequestBuilder(SDKMethodInterfaces.MethodCallUpdateImage sdk) {
        this.sdk = sdk;
    }

    public UpdateImageRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateImageRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UpdateImageRequestBuilder imagePartialUpdateQuery(ImagePartialUpdateQuery imagePartialUpdateQuery) {
        Utils.checkNotNull(imagePartialUpdateQuery, "imagePartialUpdateQuery");
        this.imagePartialUpdateQuery = imagePartialUpdateQuery;
        return this;
    }

    public UpdateImageResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.updateImage(
            id,
            revision,
            imagePartialUpdateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
