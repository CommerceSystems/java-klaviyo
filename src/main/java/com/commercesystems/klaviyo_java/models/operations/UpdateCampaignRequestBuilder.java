/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CampaignPartialUpdateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class UpdateCampaignRequestBuilder {

    private String id;
    private String revision;
    private CampaignPartialUpdateQuery campaignPartialUpdateQuery;
    private final SDKMethodInterfaces.MethodCallUpdateCampaign sdk;

    public UpdateCampaignRequestBuilder(SDKMethodInterfaces.MethodCallUpdateCampaign sdk) {
        this.sdk = sdk;
    }

    public UpdateCampaignRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateCampaignRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UpdateCampaignRequestBuilder campaignPartialUpdateQuery(CampaignPartialUpdateQuery campaignPartialUpdateQuery) {
        Utils.checkNotNull(campaignPartialUpdateQuery, "campaignPartialUpdateQuery");
        this.campaignPartialUpdateQuery = campaignPartialUpdateQuery;
        return this;
    }

    public UpdateCampaignResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.updateCampaign(
            id,
            revision,
            campaignPartialUpdateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
