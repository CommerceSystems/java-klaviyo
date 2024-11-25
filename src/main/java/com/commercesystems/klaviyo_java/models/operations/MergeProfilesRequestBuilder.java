/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.ProfileMergeQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class MergeProfilesRequestBuilder {

    private String revision;
    private ProfileMergeQuery profileMergeQuery;
    private final SDKMethodInterfaces.MethodCallMergeProfiles sdk;

    public MergeProfilesRequestBuilder(SDKMethodInterfaces.MethodCallMergeProfiles sdk) {
        this.sdk = sdk;
    }

    public MergeProfilesRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public MergeProfilesRequestBuilder profileMergeQuery(ProfileMergeQuery profileMergeQuery) {
        Utils.checkNotNull(profileMergeQuery, "profileMergeQuery");
        this.profileMergeQuery = profileMergeQuery;
        return this;
    }

    public MergeProfilesResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.mergeProfiles(
            revision,
            profileMergeQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}
