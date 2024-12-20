/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.FlowValuesRequestDTO;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;
import java.util.Optional;

public class QueryFlowValuesRequestBuilder {

    private Optional<String> pageCursor = Optional.empty();
    private String revision;
    private FlowValuesRequestDTO flowValuesRequestDTO;
    private final SDKMethodInterfaces.MethodCallQueryFlowValues sdk;

    public QueryFlowValuesRequestBuilder(SDKMethodInterfaces.MethodCallQueryFlowValues sdk) {
        this.sdk = sdk;
    }
                
    public QueryFlowValuesRequestBuilder pageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.of(pageCursor);
        return this;
    }

    public QueryFlowValuesRequestBuilder pageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    public QueryFlowValuesRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public QueryFlowValuesRequestBuilder flowValuesRequestDTO(FlowValuesRequestDTO flowValuesRequestDTO) {
        Utils.checkNotNull(flowValuesRequestDTO, "flowValuesRequestDTO");
        this.flowValuesRequestDTO = flowValuesRequestDTO;
        return this;
    }

    public QueryFlowValuesResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.queryFlowValues(
            pageCursor,
            revision,
            flowValuesRequestDTO);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
