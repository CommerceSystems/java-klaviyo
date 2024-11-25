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

public class GetTrackingSettingRequestBuilder {

    private String id;
    private Optional<? extends List<QueryParamFieldsTrackingSetting>> fieldsTrackingSetting = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetTrackingSetting sdk;

    public GetTrackingSettingRequestBuilder(SDKMethodInterfaces.MethodCallGetTrackingSetting sdk) {
        this.sdk = sdk;
    }

    public GetTrackingSettingRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public GetTrackingSettingRequestBuilder fieldsTrackingSetting(List<QueryParamFieldsTrackingSetting> fieldsTrackingSetting) {
        Utils.checkNotNull(fieldsTrackingSetting, "fieldsTrackingSetting");
        this.fieldsTrackingSetting = Optional.of(fieldsTrackingSetting);
        return this;
    }

    public GetTrackingSettingRequestBuilder fieldsTrackingSetting(Optional<? extends List<QueryParamFieldsTrackingSetting>> fieldsTrackingSetting) {
        Utils.checkNotNull(fieldsTrackingSetting, "fieldsTrackingSetting");
        this.fieldsTrackingSetting = fieldsTrackingSetting;
        return this;
    }

    public GetTrackingSettingRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetTrackingSettingResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getTrackingSetting(
            id,
            fieldsTrackingSetting,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
