/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.OnsiteSubscriptionCreateQueryDeprecatedOct24;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class CreateClientSubscriptionRequestBuilder {

    private String companyId;
    private String revision;
    private OnsiteSubscriptionCreateQueryDeprecatedOct24 onsiteSubscriptionCreateQueryDeprecatedOct24;
    private final SDKMethodInterfaces.MethodCallCreateClientSubscription sdk;

    public CreateClientSubscriptionRequestBuilder(SDKMethodInterfaces.MethodCallCreateClientSubscription sdk) {
        this.sdk = sdk;
    }

    public CreateClientSubscriptionRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public CreateClientSubscriptionRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public CreateClientSubscriptionRequestBuilder onsiteSubscriptionCreateQueryDeprecatedOct24(OnsiteSubscriptionCreateQueryDeprecatedOct24 onsiteSubscriptionCreateQueryDeprecatedOct24) {
        Utils.checkNotNull(onsiteSubscriptionCreateQueryDeprecatedOct24, "onsiteSubscriptionCreateQueryDeprecatedOct24");
        this.onsiteSubscriptionCreateQueryDeprecatedOct24 = onsiteSubscriptionCreateQueryDeprecatedOct24;
        return this;
    }

    public CreateClientSubscriptionResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.createClientSubscription(
            companyId,
            revision,
            onsiteSubscriptionCreateQueryDeprecatedOct24);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}