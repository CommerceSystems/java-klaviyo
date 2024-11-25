/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.GetCatalogVariantCreateJobResponseCollectionCompoundDocument;
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


public class GetCreateVariantsJobsResponse implements Response {

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
    private Optional<? extends GetCatalogVariantCreateJobResponseCollectionCompoundDocument> getCatalogVariantCreateJobResponseCollectionCompoundDocument;

    @JsonCreator
    public GetCreateVariantsJobsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetCatalogVariantCreateJobResponseCollectionCompoundDocument> getCatalogVariantCreateJobResponseCollectionCompoundDocument) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getCatalogVariantCreateJobResponseCollectionCompoundDocument, "getCatalogVariantCreateJobResponseCollectionCompoundDocument");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getCatalogVariantCreateJobResponseCollectionCompoundDocument = getCatalogVariantCreateJobResponseCollectionCompoundDocument;
    }
    
    public GetCreateVariantsJobsResponse(
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
    public Optional<GetCatalogVariantCreateJobResponseCollectionCompoundDocument> getCatalogVariantCreateJobResponseCollectionCompoundDocument() {
        return (Optional<GetCatalogVariantCreateJobResponseCollectionCompoundDocument>) getCatalogVariantCreateJobResponseCollectionCompoundDocument;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetCreateVariantsJobsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCreateVariantsJobsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCreateVariantsJobsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetCreateVariantsJobsResponse withGetCatalogVariantCreateJobResponseCollectionCompoundDocument(GetCatalogVariantCreateJobResponseCollectionCompoundDocument getCatalogVariantCreateJobResponseCollectionCompoundDocument) {
        Utils.checkNotNull(getCatalogVariantCreateJobResponseCollectionCompoundDocument, "getCatalogVariantCreateJobResponseCollectionCompoundDocument");
        this.getCatalogVariantCreateJobResponseCollectionCompoundDocument = Optional.ofNullable(getCatalogVariantCreateJobResponseCollectionCompoundDocument);
        return this;
    }

    /**
     * Success
     */
    public GetCreateVariantsJobsResponse withGetCatalogVariantCreateJobResponseCollectionCompoundDocument(Optional<? extends GetCatalogVariantCreateJobResponseCollectionCompoundDocument> getCatalogVariantCreateJobResponseCollectionCompoundDocument) {
        Utils.checkNotNull(getCatalogVariantCreateJobResponseCollectionCompoundDocument, "getCatalogVariantCreateJobResponseCollectionCompoundDocument");
        this.getCatalogVariantCreateJobResponseCollectionCompoundDocument = getCatalogVariantCreateJobResponseCollectionCompoundDocument;
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
        GetCreateVariantsJobsResponse other = (GetCreateVariantsJobsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getCatalogVariantCreateJobResponseCollectionCompoundDocument, other.getCatalogVariantCreateJobResponseCollectionCompoundDocument);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getCatalogVariantCreateJobResponseCollectionCompoundDocument);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCreateVariantsJobsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getCatalogVariantCreateJobResponseCollectionCompoundDocument", getCatalogVariantCreateJobResponseCollectionCompoundDocument);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetCatalogVariantCreateJobResponseCollectionCompoundDocument> getCatalogVariantCreateJobResponseCollectionCompoundDocument = Optional.empty();  
        
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
        public Builder getCatalogVariantCreateJobResponseCollectionCompoundDocument(GetCatalogVariantCreateJobResponseCollectionCompoundDocument getCatalogVariantCreateJobResponseCollectionCompoundDocument) {
            Utils.checkNotNull(getCatalogVariantCreateJobResponseCollectionCompoundDocument, "getCatalogVariantCreateJobResponseCollectionCompoundDocument");
            this.getCatalogVariantCreateJobResponseCollectionCompoundDocument = Optional.ofNullable(getCatalogVariantCreateJobResponseCollectionCompoundDocument);
            return this;
        }

        /**
         * Success
         */
        public Builder getCatalogVariantCreateJobResponseCollectionCompoundDocument(Optional<? extends GetCatalogVariantCreateJobResponseCollectionCompoundDocument> getCatalogVariantCreateJobResponseCollectionCompoundDocument) {
            Utils.checkNotNull(getCatalogVariantCreateJobResponseCollectionCompoundDocument, "getCatalogVariantCreateJobResponseCollectionCompoundDocument");
            this.getCatalogVariantCreateJobResponseCollectionCompoundDocument = getCatalogVariantCreateJobResponseCollectionCompoundDocument;
            return this;
        }
        
        public GetCreateVariantsJobsResponse build() {
            return new GetCreateVariantsJobsResponse(
                contentType,
                statusCode,
                rawResponse,
                getCatalogVariantCreateJobResponseCollectionCompoundDocument);
        }
    }
}

