/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.EventCreateQueryV2;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class CreateClientEventRequestBuilder {

    private String companyId;
    private String revision;
    private EventCreateQueryV2 eventCreateQueryV2;
    private final SDKMethodInterfaces.MethodCallCreateClientEvent sdk;

    public CreateClientEventRequestBuilder(SDKMethodInterfaces.MethodCallCreateClientEvent sdk) {
        this.sdk = sdk;
    }

    public CreateClientEventRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public CreateClientEventRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public CreateClientEventRequestBuilder eventCreateQueryV2(EventCreateQueryV2 eventCreateQueryV2) {
        Utils.checkNotNull(eventCreateQueryV2, "eventCreateQueryV2");
        this.eventCreateQueryV2 = eventCreateQueryV2;
        return this;
    }

    public CreateClientEventResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.createClientEvent(
            companyId,
            revision,
            eventCreateQueryV2);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
