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

public class GetCampaignRecipientEstimationJobRequestBuilder {

    private String id;
    private Optional<? extends List<FieldsCampaignRecipientEstimationJob>> fieldsCampaignRecipientEstimationJob = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetCampaignRecipientEstimationJob sdk;

    public GetCampaignRecipientEstimationJobRequestBuilder(SDKMethodInterfaces.MethodCallGetCampaignRecipientEstimationJob sdk) {
        this.sdk = sdk;
    }

    public GetCampaignRecipientEstimationJobRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetCampaignRecipientEstimationJobRequestBuilder fieldsCampaignRecipientEstimationJob(List<FieldsCampaignRecipientEstimationJob> fieldsCampaignRecipientEstimationJob) {
        Utils.checkNotNull(fieldsCampaignRecipientEstimationJob, "fieldsCampaignRecipientEstimationJob");
        this.fieldsCampaignRecipientEstimationJob = Optional.of(fieldsCampaignRecipientEstimationJob);
        return this;
    }

    public GetCampaignRecipientEstimationJobRequestBuilder fieldsCampaignRecipientEstimationJob(Optional<? extends List<FieldsCampaignRecipientEstimationJob>> fieldsCampaignRecipientEstimationJob) {
        Utils.checkNotNull(fieldsCampaignRecipientEstimationJob, "fieldsCampaignRecipientEstimationJob");
        this.fieldsCampaignRecipientEstimationJob = fieldsCampaignRecipientEstimationJob;
        return this;
    }

    public GetCampaignRecipientEstimationJobRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetCampaignRecipientEstimationJobResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getCampaignRecipientEstimationJob(
            id,
            fieldsCampaignRecipientEstimationJob,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}