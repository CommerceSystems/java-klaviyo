/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.GetProfileImportJobProfileRelationshipsResponseCollection;
import com.commercesystems.klaviyo_java.utils.Response;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class GetProfileIdsForBulkImportProfilesJobResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Success
     */
    private Optional<? extends GetProfileImportJobProfileRelationshipsResponseCollection> getProfileImportJobProfileRelationshipsResponseCollection;

    @JsonCreator
    public GetProfileIdsForBulkImportProfilesJobResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetProfileImportJobProfileRelationshipsResponseCollection> getProfileImportJobProfileRelationshipsResponseCollection) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getProfileImportJobProfileRelationshipsResponseCollection, "getProfileImportJobProfileRelationshipsResponseCollection");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getProfileImportJobProfileRelationshipsResponseCollection = getProfileImportJobProfileRelationshipsResponseCollection;
    }
    
    public GetProfileIdsForBulkImportProfilesJobResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetProfileImportJobProfileRelationshipsResponseCollection> getProfileImportJobProfileRelationshipsResponseCollection() {
        return (Optional<GetProfileImportJobProfileRelationshipsResponseCollection>) getProfileImportJobProfileRelationshipsResponseCollection;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetProfileIdsForBulkImportProfilesJobResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetProfileIdsForBulkImportProfilesJobResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetProfileIdsForBulkImportProfilesJobResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetProfileIdsForBulkImportProfilesJobResponse withGetProfileImportJobProfileRelationshipsResponseCollection(GetProfileImportJobProfileRelationshipsResponseCollection getProfileImportJobProfileRelationshipsResponseCollection) {
        Utils.checkNotNull(getProfileImportJobProfileRelationshipsResponseCollection, "getProfileImportJobProfileRelationshipsResponseCollection");
        this.getProfileImportJobProfileRelationshipsResponseCollection = Optional.ofNullable(getProfileImportJobProfileRelationshipsResponseCollection);
        return this;
    }

    /**
     * Success
     */
    public GetProfileIdsForBulkImportProfilesJobResponse withGetProfileImportJobProfileRelationshipsResponseCollection(Optional<? extends GetProfileImportJobProfileRelationshipsResponseCollection> getProfileImportJobProfileRelationshipsResponseCollection) {
        Utils.checkNotNull(getProfileImportJobProfileRelationshipsResponseCollection, "getProfileImportJobProfileRelationshipsResponseCollection");
        this.getProfileImportJobProfileRelationshipsResponseCollection = getProfileImportJobProfileRelationshipsResponseCollection;
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
        GetProfileIdsForBulkImportProfilesJobResponse other = (GetProfileIdsForBulkImportProfilesJobResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getProfileImportJobProfileRelationshipsResponseCollection, other.getProfileImportJobProfileRelationshipsResponseCollection);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getProfileImportJobProfileRelationshipsResponseCollection);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetProfileIdsForBulkImportProfilesJobResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getProfileImportJobProfileRelationshipsResponseCollection", getProfileImportJobProfileRelationshipsResponseCollection);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetProfileImportJobProfileRelationshipsResponseCollection> getProfileImportJobProfileRelationshipsResponseCollection = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Success
         */
        public Builder getProfileImportJobProfileRelationshipsResponseCollection(GetProfileImportJobProfileRelationshipsResponseCollection getProfileImportJobProfileRelationshipsResponseCollection) {
            Utils.checkNotNull(getProfileImportJobProfileRelationshipsResponseCollection, "getProfileImportJobProfileRelationshipsResponseCollection");
            this.getProfileImportJobProfileRelationshipsResponseCollection = Optional.ofNullable(getProfileImportJobProfileRelationshipsResponseCollection);
            return this;
        }

        /**
         * Success
         */
        public Builder getProfileImportJobProfileRelationshipsResponseCollection(Optional<? extends GetProfileImportJobProfileRelationshipsResponseCollection> getProfileImportJobProfileRelationshipsResponseCollection) {
            Utils.checkNotNull(getProfileImportJobProfileRelationshipsResponseCollection, "getProfileImportJobProfileRelationshipsResponseCollection");
            this.getProfileImportJobProfileRelationshipsResponseCollection = getProfileImportJobProfileRelationshipsResponseCollection;
            return this;
        }
        
        public GetProfileIdsForBulkImportProfilesJobResponse build() {
            return new GetProfileIdsForBulkImportProfilesJobResponse(
                contentType,
                statusCode,
                rawResponse,
                getProfileImportJobProfileRelationshipsResponseCollection);
        }
    }
}

