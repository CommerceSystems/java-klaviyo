/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.GetFlowResponseCollectionCompoundDocument;
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


public class GetFlowsResponse implements Response {

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
    private Optional<? extends GetFlowResponseCollectionCompoundDocument> getFlowResponseCollectionCompoundDocument;

    @JsonCreator
    public GetFlowsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetFlowResponseCollectionCompoundDocument> getFlowResponseCollectionCompoundDocument) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getFlowResponseCollectionCompoundDocument, "getFlowResponseCollectionCompoundDocument");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getFlowResponseCollectionCompoundDocument = getFlowResponseCollectionCompoundDocument;
    }
    
    public GetFlowsResponse(
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
    public Optional<GetFlowResponseCollectionCompoundDocument> getFlowResponseCollectionCompoundDocument() {
        return (Optional<GetFlowResponseCollectionCompoundDocument>) getFlowResponseCollectionCompoundDocument;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetFlowsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetFlowsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetFlowsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetFlowsResponse withGetFlowResponseCollectionCompoundDocument(GetFlowResponseCollectionCompoundDocument getFlowResponseCollectionCompoundDocument) {
        Utils.checkNotNull(getFlowResponseCollectionCompoundDocument, "getFlowResponseCollectionCompoundDocument");
        this.getFlowResponseCollectionCompoundDocument = Optional.ofNullable(getFlowResponseCollectionCompoundDocument);
        return this;
    }

    /**
     * Success
     */
    public GetFlowsResponse withGetFlowResponseCollectionCompoundDocument(Optional<? extends GetFlowResponseCollectionCompoundDocument> getFlowResponseCollectionCompoundDocument) {
        Utils.checkNotNull(getFlowResponseCollectionCompoundDocument, "getFlowResponseCollectionCompoundDocument");
        this.getFlowResponseCollectionCompoundDocument = getFlowResponseCollectionCompoundDocument;
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
        GetFlowsResponse other = (GetFlowsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getFlowResponseCollectionCompoundDocument, other.getFlowResponseCollectionCompoundDocument);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getFlowResponseCollectionCompoundDocument);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFlowsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getFlowResponseCollectionCompoundDocument", getFlowResponseCollectionCompoundDocument);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetFlowResponseCollectionCompoundDocument> getFlowResponseCollectionCompoundDocument = Optional.empty();  
        
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
        public Builder getFlowResponseCollectionCompoundDocument(GetFlowResponseCollectionCompoundDocument getFlowResponseCollectionCompoundDocument) {
            Utils.checkNotNull(getFlowResponseCollectionCompoundDocument, "getFlowResponseCollectionCompoundDocument");
            this.getFlowResponseCollectionCompoundDocument = Optional.ofNullable(getFlowResponseCollectionCompoundDocument);
            return this;
        }

        /**
         * Success
         */
        public Builder getFlowResponseCollectionCompoundDocument(Optional<? extends GetFlowResponseCollectionCompoundDocument> getFlowResponseCollectionCompoundDocument) {
            Utils.checkNotNull(getFlowResponseCollectionCompoundDocument, "getFlowResponseCollectionCompoundDocument");
            this.getFlowResponseCollectionCompoundDocument = getFlowResponseCollectionCompoundDocument;
            return this;
        }
        
        public GetFlowsResponse build() {
            return new GetFlowsResponse(
                contentType,
                statusCode,
                rawResponse,
                getFlowResponseCollectionCompoundDocument);
        }
    }
}

