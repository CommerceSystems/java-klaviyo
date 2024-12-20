/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.WebhookCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class CreateWebhookRequestBuilder {

    private String revision;
    private WebhookCreateQuery webhookCreateQuery;
    private final SDKMethodInterfaces.MethodCallCreateWebhook sdk;

    public CreateWebhookRequestBuilder(SDKMethodInterfaces.MethodCallCreateWebhook sdk) {
        this.sdk = sdk;
    }

    public CreateWebhookRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public CreateWebhookRequestBuilder webhookCreateQuery(WebhookCreateQuery webhookCreateQuery) {
        Utils.checkNotNull(webhookCreateQuery, "webhookCreateQuery");
        this.webhookCreateQuery = webhookCreateQuery;
        return this;
    }

    public CreateWebhookResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.createWebhook(
            revision,
            webhookCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
