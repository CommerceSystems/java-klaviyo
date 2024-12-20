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

public class GetImageRequestBuilder {

    private String id;
    private Optional<? extends List<QueryParamFieldsImage>> fieldsImage = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetImage sdk;

    public GetImageRequestBuilder(SDKMethodInterfaces.MethodCallGetImage sdk) {
        this.sdk = sdk;
    }

    public GetImageRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetImageRequestBuilder fieldsImage(List<QueryParamFieldsImage> fieldsImage) {
        Utils.checkNotNull(fieldsImage, "fieldsImage");
        this.fieldsImage = Optional.of(fieldsImage);
        return this;
    }

    public GetImageRequestBuilder fieldsImage(Optional<? extends List<QueryParamFieldsImage>> fieldsImage) {
        Utils.checkNotNull(fieldsImage, "fieldsImage");
        this.fieldsImage = fieldsImage;
        return this;
    }

    public GetImageRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetImageResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getImage(
            id,
            fieldsImage,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
