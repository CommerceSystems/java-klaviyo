/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.ImageCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class UploadImageFromUrlRequestBuilder {

    private String revision;
    private ImageCreateQuery imageCreateQuery;
    private final SDKMethodInterfaces.MethodCallUploadImageFromUrl sdk;

    public UploadImageFromUrlRequestBuilder(SDKMethodInterfaces.MethodCallUploadImageFromUrl sdk) {
        this.sdk = sdk;
    }

    public UploadImageFromUrlRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UploadImageFromUrlRequestBuilder imageCreateQuery(ImageCreateQuery imageCreateQuery) {
        Utils.checkNotNull(imageCreateQuery, "imageCreateQuery");
        this.imageCreateQuery = imageCreateQuery;
        return this;
    }

    public UploadImageFromUrlResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.uploadImageFromUrl(
            revision,
            imageCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
