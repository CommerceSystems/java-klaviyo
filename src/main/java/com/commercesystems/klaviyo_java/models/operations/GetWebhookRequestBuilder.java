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

public class GetWebhookRequestBuilder {

    private String id;
    private Optional<? extends List<QueryParamFieldsWebhook>> fieldsWebhook = Optional.empty();
    private Optional<? extends List<GetWebhookQueryParamInclude>> include = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetWebhook sdk;

    public GetWebhookRequestBuilder(SDKMethodInterfaces.MethodCallGetWebhook sdk) {
        this.sdk = sdk;
    }

    public GetWebhookRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetWebhookRequestBuilder fieldsWebhook(List<QueryParamFieldsWebhook> fieldsWebhook) {
        Utils.checkNotNull(fieldsWebhook, "fieldsWebhook");
        this.fieldsWebhook = Optional.of(fieldsWebhook);
        return this;
    }

    public GetWebhookRequestBuilder fieldsWebhook(Optional<? extends List<QueryParamFieldsWebhook>> fieldsWebhook) {
        Utils.checkNotNull(fieldsWebhook, "fieldsWebhook");
        this.fieldsWebhook = fieldsWebhook;
        return this;
    }
                
    public GetWebhookRequestBuilder include(List<GetWebhookQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.of(include);
        return this;
    }

    public GetWebhookRequestBuilder include(Optional<? extends List<GetWebhookQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    public GetWebhookRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetWebhookResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getWebhook(
            id,
            fieldsWebhook,
            include,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
