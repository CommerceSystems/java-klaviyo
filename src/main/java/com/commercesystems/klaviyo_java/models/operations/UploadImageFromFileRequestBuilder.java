/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.ImageUploadQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class UploadImageFromFileRequestBuilder {

    private String revision;
    private ImageUploadQuery imageUploadQuery;
    private final SDKMethodInterfaces.MethodCallUploadImageFromFile sdk;

    public UploadImageFromFileRequestBuilder(SDKMethodInterfaces.MethodCallUploadImageFromFile sdk) {
        this.sdk = sdk;
    }

    public UploadImageFromFileRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UploadImageFromFileRequestBuilder imageUploadQuery(ImageUploadQuery imageUploadQuery) {
        Utils.checkNotNull(imageUploadQuery, "imageUploadQuery");
        this.imageUploadQuery = imageUploadQuery;
        return this;
    }

    public UploadImageFromFileResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.uploadImageFromFile(
            revision,
            imageUploadQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}