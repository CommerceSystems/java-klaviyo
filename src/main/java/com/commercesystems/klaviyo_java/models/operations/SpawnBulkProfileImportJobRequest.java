/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.ProfileImportJobCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SpawnBulkProfileImportJobRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private ProfileImportJobCreateQuery profileImportJobCreateQuery;

    @JsonCreator
    public SpawnBulkProfileImportJobRequest(
            String revision,
            ProfileImportJobCreateQuery profileImportJobCreateQuery) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(profileImportJobCreateQuery, "profileImportJobCreateQuery");
        this.revision = revision;
        this.profileImportJobCreateQuery = profileImportJobCreateQuery;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public ProfileImportJobCreateQuery profileImportJobCreateQuery() {
        return profileImportJobCreateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public SpawnBulkProfileImportJobRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public SpawnBulkProfileImportJobRequest withProfileImportJobCreateQuery(ProfileImportJobCreateQuery profileImportJobCreateQuery) {
        Utils.checkNotNull(profileImportJobCreateQuery, "profileImportJobCreateQuery");
        this.profileImportJobCreateQuery = profileImportJobCreateQuery;
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
        SpawnBulkProfileImportJobRequest other = (SpawnBulkProfileImportJobRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.profileImportJobCreateQuery, other.profileImportJobCreateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            profileImportJobCreateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SpawnBulkProfileImportJobRequest.class,
                "revision", revision,
                "profileImportJobCreateQuery", profileImportJobCreateQuery);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private ProfileImportJobCreateQuery profileImportJobCreateQuery;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }

        public Builder profileImportJobCreateQuery(ProfileImportJobCreateQuery profileImportJobCreateQuery) {
            Utils.checkNotNull(profileImportJobCreateQuery, "profileImportJobCreateQuery");
            this.profileImportJobCreateQuery = profileImportJobCreateQuery;
            return this;
        }
        
        public SpawnBulkProfileImportJobRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new SpawnBulkProfileImportJobRequest(
                revision,
                profileImportJobCreateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

