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

public class GetEventMetricRequestBuilder {

    private String id;
    private Optional<? extends List<GetEventMetricQueryParamFieldsMetric>> fieldsMetric = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetEventMetric sdk;

    public GetEventMetricRequestBuilder(SDKMethodInterfaces.MethodCallGetEventMetric sdk) {
        this.sdk = sdk;
    }

    public GetEventMetricRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetEventMetricRequestBuilder fieldsMetric(List<GetEventMetricQueryParamFieldsMetric> fieldsMetric) {
        Utils.checkNotNull(fieldsMetric, "fieldsMetric");
        this.fieldsMetric = Optional.of(fieldsMetric);
        return this;
    }

    public GetEventMetricRequestBuilder fieldsMetric(Optional<? extends List<GetEventMetricQueryParamFieldsMetric>> fieldsMetric) {
        Utils.checkNotNull(fieldsMetric, "fieldsMetric");
        this.fieldsMetric = fieldsMetric;
        return this;
    }

    public GetEventMetricRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetEventMetricResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getEventMetric(
            id,
            fieldsMetric,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}