/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.MetricAggregateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class QueryMetricAggregatesRequestBuilder {

    private String revision;
    private MetricAggregateQuery metricAggregateQuery;
    private final SDKMethodInterfaces.MethodCallQueryMetricAggregates sdk;

    public QueryMetricAggregatesRequestBuilder(SDKMethodInterfaces.MethodCallQueryMetricAggregates sdk) {
        this.sdk = sdk;
    }

    public QueryMetricAggregatesRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public QueryMetricAggregatesRequestBuilder metricAggregateQuery(MetricAggregateQuery metricAggregateQuery) {
        Utils.checkNotNull(metricAggregateQuery, "metricAggregateQuery");
        this.metricAggregateQuery = metricAggregateQuery;
        return this;
    }

    public QueryMetricAggregatesResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.queryMetricAggregates(
            revision,
            metricAggregateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
