/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.DataPrivacyCreateDeletionJobQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class RequestProfileDeletionRequestBuilder {

    private String revision;
    private DataPrivacyCreateDeletionJobQuery dataPrivacyCreateDeletionJobQuery;
    private final SDKMethodInterfaces.MethodCallRequestProfileDeletion sdk;

    public RequestProfileDeletionRequestBuilder(SDKMethodInterfaces.MethodCallRequestProfileDeletion sdk) {
        this.sdk = sdk;
    }

    public RequestProfileDeletionRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public RequestProfileDeletionRequestBuilder dataPrivacyCreateDeletionJobQuery(DataPrivacyCreateDeletionJobQuery dataPrivacyCreateDeletionJobQuery) {
        Utils.checkNotNull(dataPrivacyCreateDeletionJobQuery, "dataPrivacyCreateDeletionJobQuery");
        this.dataPrivacyCreateDeletionJobQuery = dataPrivacyCreateDeletionJobQuery;
        return this;
    }

    public RequestProfileDeletionResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.requestProfileDeletion(
            revision,
            dataPrivacyCreateDeletionJobQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
