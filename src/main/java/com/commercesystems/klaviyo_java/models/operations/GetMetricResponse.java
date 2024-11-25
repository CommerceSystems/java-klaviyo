/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.GetMetricResponseCompoundDocument;
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


public class GetMetricResponse implements Response {

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
    private Optional<? extends GetMetricResponseCompoundDocument> getMetricResponseCompoundDocument;

    @JsonCreator
    public GetMetricResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetMetricResponseCompoundDocument> getMetricResponseCompoundDocument) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getMetricResponseCompoundDocument, "getMetricResponseCompoundDocument");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getMetricResponseCompoundDocument = getMetricResponseCompoundDocument;
    }
    
    public GetMetricResponse(
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
    public Optional<GetMetricResponseCompoundDocument> getMetricResponseCompoundDocument() {
        return (Optional<GetMetricResponseCompoundDocument>) getMetricResponseCompoundDocument;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetMetricResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetMetricResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetMetricResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetMetricResponse withGetMetricResponseCompoundDocument(GetMetricResponseCompoundDocument getMetricResponseCompoundDocument) {
        Utils.checkNotNull(getMetricResponseCompoundDocument, "getMetricResponseCompoundDocument");
        this.getMetricResponseCompoundDocument = Optional.ofNullable(getMetricResponseCompoundDocument);
        return this;
    }

    /**
     * Success
     */
    public GetMetricResponse withGetMetricResponseCompoundDocument(Optional<? extends GetMetricResponseCompoundDocument> getMetricResponseCompoundDocument) {
        Utils.checkNotNull(getMetricResponseCompoundDocument, "getMetricResponseCompoundDocument");
        this.getMetricResponseCompoundDocument = getMetricResponseCompoundDocument;
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
        GetMetricResponse other = (GetMetricResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getMetricResponseCompoundDocument, other.getMetricResponseCompoundDocument);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getMetricResponseCompoundDocument);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetricResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getMetricResponseCompoundDocument", getMetricResponseCompoundDocument);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetMetricResponseCompoundDocument> getMetricResponseCompoundDocument = Optional.empty();  
        
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
        public Builder getMetricResponseCompoundDocument(GetMetricResponseCompoundDocument getMetricResponseCompoundDocument) {
            Utils.checkNotNull(getMetricResponseCompoundDocument, "getMetricResponseCompoundDocument");
            this.getMetricResponseCompoundDocument = Optional.ofNullable(getMetricResponseCompoundDocument);
            return this;
        }

        /**
         * Success
         */
        public Builder getMetricResponseCompoundDocument(Optional<? extends GetMetricResponseCompoundDocument> getMetricResponseCompoundDocument) {
            Utils.checkNotNull(getMetricResponseCompoundDocument, "getMetricResponseCompoundDocument");
            this.getMetricResponseCompoundDocument = getMetricResponseCompoundDocument;
            return this;
        }
        
        public GetMetricResponse build() {
            return new GetMetricResponse(
                contentType,
                statusCode,
                rawResponse,
                getMetricResponseCompoundDocument);
        }
    }
}

