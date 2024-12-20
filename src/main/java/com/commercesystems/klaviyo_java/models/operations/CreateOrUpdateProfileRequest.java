/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateOrUpdateProfileRequest {

    /**
     * Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=additional-fields[profile]")
    private Optional<? extends List<CreateOrUpdateProfileQueryParamAdditionalFieldsProfile>> additionalFieldsProfile;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private ProfileUpsertQuery profileUpsertQuery;

    @JsonCreator
    public CreateOrUpdateProfileRequest(
            Optional<? extends List<CreateOrUpdateProfileQueryParamAdditionalFieldsProfile>> additionalFieldsProfile,
            String revision,
            ProfileUpsertQuery profileUpsertQuery) {
        Utils.checkNotNull(additionalFieldsProfile, "additionalFieldsProfile");
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(profileUpsertQuery, "profileUpsertQuery");
        this.additionalFieldsProfile = additionalFieldsProfile;
        this.revision = revision;
        this.profileUpsertQuery = profileUpsertQuery;
    }
    
    public CreateOrUpdateProfileRequest(
            String revision,
            ProfileUpsertQuery profileUpsertQuery) {
        this(Optional.empty(), revision, profileUpsertQuery);
    }

    /**
     * Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CreateOrUpdateProfileQueryParamAdditionalFieldsProfile>> additionalFieldsProfile() {
        return (Optional<List<CreateOrUpdateProfileQueryParamAdditionalFieldsProfile>>) additionalFieldsProfile;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public ProfileUpsertQuery profileUpsertQuery() {
        return profileUpsertQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
     */
    public CreateOrUpdateProfileRequest withAdditionalFieldsProfile(List<CreateOrUpdateProfileQueryParamAdditionalFieldsProfile> additionalFieldsProfile) {
        Utils.checkNotNull(additionalFieldsProfile, "additionalFieldsProfile");
        this.additionalFieldsProfile = Optional.ofNullable(additionalFieldsProfile);
        return this;
    }

    /**
     * Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
     */
    public CreateOrUpdateProfileRequest withAdditionalFieldsProfile(Optional<? extends List<CreateOrUpdateProfileQueryParamAdditionalFieldsProfile>> additionalFieldsProfile) {
        Utils.checkNotNull(additionalFieldsProfile, "additionalFieldsProfile");
        this.additionalFieldsProfile = additionalFieldsProfile;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public CreateOrUpdateProfileRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public CreateOrUpdateProfileRequest withProfileUpsertQuery(ProfileUpsertQuery profileUpsertQuery) {
        Utils.checkNotNull(profileUpsertQuery, "profileUpsertQuery");
        this.profileUpsertQuery = profileUpsertQuery;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateOrUpdateProfileRequest other = (CreateOrUpdateProfileRequest) o;
        return 
            Objects.deepEquals(this.additionalFieldsProfile, other.additionalFieldsProfile) &&
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.profileUpsertQuery, other.profileUpsertQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalFieldsProfile,
            revision,
            profileUpsertQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateOrUpdateProfileRequest.class,
                "additionalFieldsProfile", additionalFieldsProfile,
                "revision", revision,
                "profileUpsertQuery", profileUpsertQuery);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<CreateOrUpdateProfileQueryParamAdditionalFieldsProfile>> additionalFieldsProfile = Optional.empty();
 
        private String revision;
 
        private ProfileUpsertQuery profileUpsertQuery;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
         */
        public Builder additionalFieldsProfile(List<CreateOrUpdateProfileQueryParamAdditionalFieldsProfile> additionalFieldsProfile) {
            Utils.checkNotNull(additionalFieldsProfile, "additionalFieldsProfile");
            this.additionalFieldsProfile = Optional.ofNullable(additionalFieldsProfile);
            return this;
        }

        /**
         * Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
         */
        public Builder additionalFieldsProfile(Optional<? extends List<CreateOrUpdateProfileQueryParamAdditionalFieldsProfile>> additionalFieldsProfile) {
            Utils.checkNotNull(additionalFieldsProfile, "additionalFieldsProfile");
            this.additionalFieldsProfile = additionalFieldsProfile;
            return this;
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }

        public Builder profileUpsertQuery(ProfileUpsertQuery profileUpsertQuery) {
            Utils.checkNotNull(profileUpsertQuery, "profileUpsertQuery");
            this.profileUpsertQuery = profileUpsertQuery;
            return this;
        }
        
        public CreateOrUpdateProfileRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new CreateOrUpdateProfileRequest(
                additionalFieldsProfile,
                revision,
                profileUpsertQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

