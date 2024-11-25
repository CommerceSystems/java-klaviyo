/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class GetCampaignRecipientEstimationRequestBuilder {

    private String id;
    private Optional<? extends List<FieldsCampaignRecipientEstimation>> fieldsCampaignRecipientEstimation = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetCampaignRecipientEstimation sdk;

    public GetCampaignRecipientEstimationRequestBuilder(SDKMethodInterfaces.MethodCallGetCampaignRecipientEstimation sdk) {
        this.sdk = sdk;
    }

    public GetCampaignRecipientEstimationRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetCampaignRecipientEstimationRequestBuilder fieldsCampaignRecipientEstimation(List<FieldsCampaignRecipientEstimation> fieldsCampaignRecipientEstimation) {
        Utils.checkNotNull(fieldsCampaignRecipientEstimation, "fieldsCampaignRecipientEstimation");
        this.fieldsCampaignRecipientEstimation = Optional.of(fieldsCampaignRecipientEstimation);
        return this;
    }

    public GetCampaignRecipientEstimationRequestBuilder fieldsCampaignRecipientEstimation(Optional<? extends List<FieldsCampaignRecipientEstimation>> fieldsCampaignRecipientEstimation) {
        Utils.checkNotNull(fieldsCampaignRecipientEstimation, "fieldsCampaignRecipientEstimation");
        this.fieldsCampaignRecipientEstimation = fieldsCampaignRecipientEstimation;
        return this;
    }

    public GetCampaignRecipientEstimationRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetCampaignRecipientEstimationResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getCampaignRecipientEstimation(
            id,
            fieldsCampaignRecipientEstimation,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}