/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.GetImportErrorResponseCollection;
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


public class GetErrorsForBulkImportProfilesJobResponse implements Response {

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
    private Optional<? extends GetImportErrorResponseCollection> getImportErrorResponseCollection;

    @JsonCreator
    public GetErrorsForBulkImportProfilesJobResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetImportErrorResponseCollection> getImportErrorResponseCollection) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getImportErrorResponseCollection, "getImportErrorResponseCollection");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getImportErrorResponseCollection = getImportErrorResponseCollection;
    }
    
    public GetErrorsForBulkImportProfilesJobResponse(
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
    public Optional<GetImportErrorResponseCollection> getImportErrorResponseCollection() {
        return (Optional<GetImportErrorResponseCollection>) getImportErrorResponseCollection;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetErrorsForBulkImportProfilesJobResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetErrorsForBulkImportProfilesJobResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetErrorsForBulkImportProfilesJobResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetErrorsForBulkImportProfilesJobResponse withGetImportErrorResponseCollection(GetImportErrorResponseCollection getImportErrorResponseCollection) {
        Utils.checkNotNull(getImportErrorResponseCollection, "getImportErrorResponseCollection");
        this.getImportErrorResponseCollection = Optional.ofNullable(getImportErrorResponseCollection);
        return this;
    }

    /**
     * Success
     */
    public GetErrorsForBulkImportProfilesJobResponse withGetImportErrorResponseCollection(Optional<? extends GetImportErrorResponseCollection> getImportErrorResponseCollection) {
        Utils.checkNotNull(getImportErrorResponseCollection, "getImportErrorResponseCollection");
        this.getImportErrorResponseCollection = getImportErrorResponseCollection;
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
        GetErrorsForBulkImportProfilesJobResponse other = (GetErrorsForBulkImportProfilesJobResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getImportErrorResponseCollection, other.getImportErrorResponseCollection);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getImportErrorResponseCollection);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetErrorsForBulkImportProfilesJobResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getImportErrorResponseCollection", getImportErrorResponseCollection);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetImportErrorResponseCollection> getImportErrorResponseCollection = Optional.empty();  
        
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
        public Builder getImportErrorResponseCollection(GetImportErrorResponseCollection getImportErrorResponseCollection) {
            Utils.checkNotNull(getImportErrorResponseCollection, "getImportErrorResponseCollection");
            this.getImportErrorResponseCollection = Optional.ofNullable(getImportErrorResponseCollection);
            return this;
        }

        /**
         * Success
         */
        public Builder getImportErrorResponseCollection(Optional<? extends GetImportErrorResponseCollection> getImportErrorResponseCollection) {
            Utils.checkNotNull(getImportErrorResponseCollection, "getImportErrorResponseCollection");
            this.getImportErrorResponseCollection = getImportErrorResponseCollection;
            return this;
        }
        
        public GetErrorsForBulkImportProfilesJobResponse build() {
            return new GetErrorsForBulkImportProfilesJobResponse(
                contentType,
                statusCode,
                rawResponse,
                getImportErrorResponseCollection);
        }
    }
}

