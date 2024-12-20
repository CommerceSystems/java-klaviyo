/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.GetReviewResponseDto20240715CollectionCompoundDocument;
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


public class GetReviewsResponse implements Response {

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
    private Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocument> getReviewResponseDto20240715CollectionCompoundDocument;

    @JsonCreator
    public GetReviewsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocument> getReviewResponseDto20240715CollectionCompoundDocument) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getReviewResponseDto20240715CollectionCompoundDocument, "getReviewResponseDto20240715CollectionCompoundDocument");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getReviewResponseDto20240715CollectionCompoundDocument = getReviewResponseDto20240715CollectionCompoundDocument;
    }
    
    public GetReviewsResponse(
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
    public Optional<GetReviewResponseDto20240715CollectionCompoundDocument> getReviewResponseDto20240715CollectionCompoundDocument() {
        return (Optional<GetReviewResponseDto20240715CollectionCompoundDocument>) getReviewResponseDto20240715CollectionCompoundDocument;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetReviewsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetReviewsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetReviewsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetReviewsResponse withGetReviewResponseDto20240715CollectionCompoundDocument(GetReviewResponseDto20240715CollectionCompoundDocument getReviewResponseDto20240715CollectionCompoundDocument) {
        Utils.checkNotNull(getReviewResponseDto20240715CollectionCompoundDocument, "getReviewResponseDto20240715CollectionCompoundDocument");
        this.getReviewResponseDto20240715CollectionCompoundDocument = Optional.ofNullable(getReviewResponseDto20240715CollectionCompoundDocument);
        return this;
    }

    /**
     * Success
     */
    public GetReviewsResponse withGetReviewResponseDto20240715CollectionCompoundDocument(Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocument> getReviewResponseDto20240715CollectionCompoundDocument) {
        Utils.checkNotNull(getReviewResponseDto20240715CollectionCompoundDocument, "getReviewResponseDto20240715CollectionCompoundDocument");
        this.getReviewResponseDto20240715CollectionCompoundDocument = getReviewResponseDto20240715CollectionCompoundDocument;
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
        GetReviewsResponse other = (GetReviewsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getReviewResponseDto20240715CollectionCompoundDocument, other.getReviewResponseDto20240715CollectionCompoundDocument);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getReviewResponseDto20240715CollectionCompoundDocument);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetReviewsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getReviewResponseDto20240715CollectionCompoundDocument", getReviewResponseDto20240715CollectionCompoundDocument);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocument> getReviewResponseDto20240715CollectionCompoundDocument = Optional.empty();  
        
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
        public Builder getReviewResponseDto20240715CollectionCompoundDocument(GetReviewResponseDto20240715CollectionCompoundDocument getReviewResponseDto20240715CollectionCompoundDocument) {
            Utils.checkNotNull(getReviewResponseDto20240715CollectionCompoundDocument, "getReviewResponseDto20240715CollectionCompoundDocument");
            this.getReviewResponseDto20240715CollectionCompoundDocument = Optional.ofNullable(getReviewResponseDto20240715CollectionCompoundDocument);
            return this;
        }

        /**
         * Success
         */
        public Builder getReviewResponseDto20240715CollectionCompoundDocument(Optional<? extends GetReviewResponseDto20240715CollectionCompoundDocument> getReviewResponseDto20240715CollectionCompoundDocument) {
            Utils.checkNotNull(getReviewResponseDto20240715CollectionCompoundDocument, "getReviewResponseDto20240715CollectionCompoundDocument");
            this.getReviewResponseDto20240715CollectionCompoundDocument = getReviewResponseDto20240715CollectionCompoundDocument;
            return this;
        }
        
        public GetReviewsResponse build() {
            return new GetReviewsResponse(
                contentType,
                statusCode,
                rawResponse,
                getReviewResponseDto20240715CollectionCompoundDocument);
        }
    }
}

