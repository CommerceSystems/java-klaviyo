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

public class GetPropertiesForMetricRequestBuilder {

    private String id;
    private Optional<? extends List<QueryParamAdditionalFieldsMetricProperty>> additionalFieldsMetricProperty = Optional.empty();
    private Optional<? extends List<QueryParamFieldsMetricProperty>> fieldsMetricProperty = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetPropertiesForMetric sdk;

    public GetPropertiesForMetricRequestBuilder(SDKMethodInterfaces.MethodCallGetPropertiesForMetric sdk) {
        this.sdk = sdk;
    }

    public GetPropertiesForMetricRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetPropertiesForMetricRequestBuilder additionalFieldsMetricProperty(List<QueryParamAdditionalFieldsMetricProperty> additionalFieldsMetricProperty) {
        Utils.checkNotNull(additionalFieldsMetricProperty, "additionalFieldsMetricProperty");
        this.additionalFieldsMetricProperty = Optional.of(additionalFieldsMetricProperty);
        return this;
    }

    public GetPropertiesForMetricRequestBuilder additionalFieldsMetricProperty(Optional<? extends List<QueryParamAdditionalFieldsMetricProperty>> additionalFieldsMetricProperty) {
        Utils.checkNotNull(additionalFieldsMetricProperty, "additionalFieldsMetricProperty");
        this.additionalFieldsMetricProperty = additionalFieldsMetricProperty;
        return this;
    }
                
    public GetPropertiesForMetricRequestBuilder fieldsMetricProperty(List<QueryParamFieldsMetricProperty> fieldsMetricProperty) {
        Utils.checkNotNull(fieldsMetricProperty, "fieldsMetricProperty");
        this.fieldsMetricProperty = Optional.of(fieldsMetricProperty);
        return this;
    }

    public GetPropertiesForMetricRequestBuilder fieldsMetricProperty(Optional<? extends List<QueryParamFieldsMetricProperty>> fieldsMetricProperty) {
        Utils.checkNotNull(fieldsMetricProperty, "fieldsMetricProperty");
        this.fieldsMetricProperty = fieldsMetricProperty;
        return this;
    }

    public GetPropertiesForMetricRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetPropertiesForMetricResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getPropertiesForMetric(
            id,
            additionalFieldsMetricProperty,
            fieldsMetricProperty,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
