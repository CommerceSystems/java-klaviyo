/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateJob;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class BulkCreateEventsRequestBuilder {

    private String revision;
    private EventsBulkCreateJob eventsBulkCreateJob;
    private final SDKMethodInterfaces.MethodCallBulkCreateEvents sdk;

    public BulkCreateEventsRequestBuilder(SDKMethodInterfaces.MethodCallBulkCreateEvents sdk) {
        this.sdk = sdk;
    }

    public BulkCreateEventsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkCreateEventsRequestBuilder eventsBulkCreateJob(EventsBulkCreateJob eventsBulkCreateJob) {
        Utils.checkNotNull(eventsBulkCreateJob, "eventsBulkCreateJob");
        this.eventsBulkCreateJob = eventsBulkCreateJob;
        return this;
    }

    public BulkCreateEventsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.bulkCreateEvents(
            revision,
            eventsBulkCreateJob);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
