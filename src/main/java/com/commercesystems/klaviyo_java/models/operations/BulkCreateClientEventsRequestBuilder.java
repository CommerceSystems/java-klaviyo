/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class BulkCreateClientEventsRequestBuilder {

    private String companyId;
    private String revision;
    private EventsBulkCreateQuery eventsBulkCreateQuery;
    private final SDKMethodInterfaces.MethodCallBulkCreateClientEvents sdk;

    public BulkCreateClientEventsRequestBuilder(SDKMethodInterfaces.MethodCallBulkCreateClientEvents sdk) {
        this.sdk = sdk;
    }

    public BulkCreateClientEventsRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public BulkCreateClientEventsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkCreateClientEventsRequestBuilder eventsBulkCreateQuery(EventsBulkCreateQuery eventsBulkCreateQuery) {
        Utils.checkNotNull(eventsBulkCreateQuery, "eventsBulkCreateQuery");
        this.eventsBulkCreateQuery = eventsBulkCreateQuery;
        return this;
    }

    public BulkCreateClientEventsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.bulkCreateClientEvents(
            companyId,
            revision,
            eventsBulkCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}