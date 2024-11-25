/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.GetFlowActionResponseCompoundDocument;
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


public class GetFlowActionResponse implements Response {

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
    private Optional<? extends GetFlowActionResponseCompoundDocument> getFlowActionResponseCompoundDocument;

    @JsonCreator
    public GetFlowActionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetFlowActionResponseCompoundDocument> getFlowActionResponseCompoundDocument) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getFlowActionResponseCompoundDocument, "getFlowActionResponseCompoundDocument");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getFlowActionResponseCompoundDocument = getFlowActionResponseCompoundDocument;
    }
    
    public GetFlowActionResponse(
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
    public Optional<GetFlowActionResponseCompoundDocument> getFlowActionResponseCompoundDocument() {
        return (Optional<GetFlowActionResponseCompoundDocument>) getFlowActionResponseCompoundDocument;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetFlowActionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetFlowActionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetFlowActionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetFlowActionResponse withGetFlowActionResponseCompoundDocument(GetFlowActionResponseCompoundDocument getFlowActionResponseCompoundDocument) {
        Utils.checkNotNull(getFlowActionResponseCompoundDocument, "getFlowActionResponseCompoundDocument");
        this.getFlowActionResponseCompoundDocument = Optional.ofNullable(getFlowActionResponseCompoundDocument);
        return this;
    }

    /**
     * Success
     */
    public GetFlowActionResponse withGetFlowActionResponseCompoundDocument(Optional<? extends GetFlowActionResponseCompoundDocument> getFlowActionResponseCompoundDocument) {
        Utils.checkNotNull(getFlowActionResponseCompoundDocument, "getFlowActionResponseCompoundDocument");
        this.getFlowActionResponseCompoundDocument = getFlowActionResponseCompoundDocument;
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
        GetFlowActionResponse other = (GetFlowActionResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getFlowActionResponseCompoundDocument, other.getFlowActionResponseCompoundDocument);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getFlowActionResponseCompoundDocument);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFlowActionResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getFlowActionResponseCompoundDocument", getFlowActionResponseCompoundDocument);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetFlowActionResponseCompoundDocument> getFlowActionResponseCompoundDocument = Optional.empty();  
        
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
        public Builder getFlowActionResponseCompoundDocument(GetFlowActionResponseCompoundDocument getFlowActionResponseCompoundDocument) {
            Utils.checkNotNull(getFlowActionResponseCompoundDocument, "getFlowActionResponseCompoundDocument");
            this.getFlowActionResponseCompoundDocument = Optional.ofNullable(getFlowActionResponseCompoundDocument);
            return this;
        }

        /**
         * Success
         */
        public Builder getFlowActionResponseCompoundDocument(Optional<? extends GetFlowActionResponseCompoundDocument> getFlowActionResponseCompoundDocument) {
            Utils.checkNotNull(getFlowActionResponseCompoundDocument, "getFlowActionResponseCompoundDocument");
            this.getFlowActionResponseCompoundDocument = getFlowActionResponseCompoundDocument;
            return this;
        }
        
        public GetFlowActionResponse build() {
            return new GetFlowActionResponse(
                contentType,
                statusCode,
                rawResponse,
                getFlowActionResponseCompoundDocument);
        }
    }
}
