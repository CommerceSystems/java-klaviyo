/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.SegmentSeriesRequestDTO;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class QuerySegmentSeriesRequestBuilder {

    private String revision;
    private SegmentSeriesRequestDTO segmentSeriesRequestDTO;
    private final SDKMethodInterfaces.MethodCallQuerySegmentSeries sdk;

    public QuerySegmentSeriesRequestBuilder(SDKMethodInterfaces.MethodCallQuerySegmentSeries sdk) {
        this.sdk = sdk;
    }

    public QuerySegmentSeriesRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public QuerySegmentSeriesRequestBuilder segmentSeriesRequestDTO(SegmentSeriesRequestDTO segmentSeriesRequestDTO) {
        Utils.checkNotNull(segmentSeriesRequestDTO, "segmentSeriesRequestDTO");
        this.segmentSeriesRequestDTO = segmentSeriesRequestDTO;
        return this;
    }

    public QuerySegmentSeriesResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.querySegmentSeries(
            revision,
            segmentSeriesRequestDTO);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
