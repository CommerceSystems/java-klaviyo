/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.TemplateCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class CreateTemplateRequestBuilder {

    private String revision;
    private TemplateCreateQuery templateCreateQuery;
    private final SDKMethodInterfaces.MethodCallCreateTemplate sdk;

    public CreateTemplateRequestBuilder(SDKMethodInterfaces.MethodCallCreateTemplate sdk) {
        this.sdk = sdk;
    }

    public CreateTemplateRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public CreateTemplateRequestBuilder templateCreateQuery(TemplateCreateQuery templateCreateQuery) {
        Utils.checkNotNull(templateCreateQuery, "templateCreateQuery");
        this.templateCreateQuery = templateCreateQuery;
        return this;
    }

    public CreateTemplateResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.createTemplate(
            revision,
            templateCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
