/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.WebhookPartialUpdateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class UpdateWebhookRequestBuilder {

    private String id;
    private String revision;
    private WebhookPartialUpdateQuery webhookPartialUpdateQuery;
    private final SDKMethodInterfaces.MethodCallUpdateWebhook sdk;

    public UpdateWebhookRequestBuilder(SDKMethodInterfaces.MethodCallUpdateWebhook sdk) {
        this.sdk = sdk;
    }

    public UpdateWebhookRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateWebhookRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UpdateWebhookRequestBuilder webhookPartialUpdateQuery(WebhookPartialUpdateQuery webhookPartialUpdateQuery) {
        Utils.checkNotNull(webhookPartialUpdateQuery, "webhookPartialUpdateQuery");
        this.webhookPartialUpdateQuery = webhookPartialUpdateQuery;
        return this;
    }

    public UpdateWebhookResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.updateWebhook(
            id,
            revision,
            webhookPartialUpdateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
