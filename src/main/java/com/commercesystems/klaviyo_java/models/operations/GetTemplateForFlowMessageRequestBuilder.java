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

public class GetTemplateForFlowMessageRequestBuilder {

    private String id;
    private Optional<? extends List<GetTemplateForFlowMessageQueryParamFieldsTemplate>> fieldsTemplate = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetTemplateForFlowMessage sdk;

    public GetTemplateForFlowMessageRequestBuilder(SDKMethodInterfaces.MethodCallGetTemplateForFlowMessage sdk) {
        this.sdk = sdk;
    }

    public GetTemplateForFlowMessageRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetTemplateForFlowMessageRequestBuilder fieldsTemplate(List<GetTemplateForFlowMessageQueryParamFieldsTemplate> fieldsTemplate) {
        Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
        this.fieldsTemplate = Optional.of(fieldsTemplate);
        return this;
    }

    public GetTemplateForFlowMessageRequestBuilder fieldsTemplate(Optional<? extends List<GetTemplateForFlowMessageQueryParamFieldsTemplate>> fieldsTemplate) {
        Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
        this.fieldsTemplate = fieldsTemplate;
        return this;
    }

    public GetTemplateForFlowMessageRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetTemplateForFlowMessageResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getTemplateForFlowMessage(
            id,
            fieldsTemplate,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
