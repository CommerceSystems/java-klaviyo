/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.GetCampaignMessageResponseCompoundDocument;
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


public class GetCampaignMessageResponse implements Response {

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
    private Optional<? extends GetCampaignMessageResponseCompoundDocument> getCampaignMessageResponseCompoundDocument;

    @JsonCreator
    public GetCampaignMessageResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetCampaignMessageResponseCompoundDocument> getCampaignMessageResponseCompoundDocument) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getCampaignMessageResponseCompoundDocument, "getCampaignMessageResponseCompoundDocument");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getCampaignMessageResponseCompoundDocument = getCampaignMessageResponseCompoundDocument;
    }
    
    public GetCampaignMessageResponse(
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
    public Optional<GetCampaignMessageResponseCompoundDocument> getCampaignMessageResponseCompoundDocument() {
        return (Optional<GetCampaignMessageResponseCompoundDocument>) getCampaignMessageResponseCompoundDocument;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetCampaignMessageResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCampaignMessageResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCampaignMessageResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetCampaignMessageResponse withGetCampaignMessageResponseCompoundDocument(GetCampaignMessageResponseCompoundDocument getCampaignMessageResponseCompoundDocument) {
        Utils.checkNotNull(getCampaignMessageResponseCompoundDocument, "getCampaignMessageResponseCompoundDocument");
        this.getCampaignMessageResponseCompoundDocument = Optional.ofNullable(getCampaignMessageResponseCompoundDocument);
        return this;
    }

    /**
     * Success
     */
    public GetCampaignMessageResponse withGetCampaignMessageResponseCompoundDocument(Optional<? extends GetCampaignMessageResponseCompoundDocument> getCampaignMessageResponseCompoundDocument) {
        Utils.checkNotNull(getCampaignMessageResponseCompoundDocument, "getCampaignMessageResponseCompoundDocument");
        this.getCampaignMessageResponseCompoundDocument = getCampaignMessageResponseCompoundDocument;
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
        GetCampaignMessageResponse other = (GetCampaignMessageResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getCampaignMessageResponseCompoundDocument, other.getCampaignMessageResponseCompoundDocument);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getCampaignMessageResponseCompoundDocument);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCampaignMessageResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getCampaignMessageResponseCompoundDocument", getCampaignMessageResponseCompoundDocument);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetCampaignMessageResponseCompoundDocument> getCampaignMessageResponseCompoundDocument = Optional.empty();  
        
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
        public Builder getCampaignMessageResponseCompoundDocument(GetCampaignMessageResponseCompoundDocument getCampaignMessageResponseCompoundDocument) {
            Utils.checkNotNull(getCampaignMessageResponseCompoundDocument, "getCampaignMessageResponseCompoundDocument");
            this.getCampaignMessageResponseCompoundDocument = Optional.ofNullable(getCampaignMessageResponseCompoundDocument);
            return this;
        }

        /**
         * Success
         */
        public Builder getCampaignMessageResponseCompoundDocument(Optional<? extends GetCampaignMessageResponseCompoundDocument> getCampaignMessageResponseCompoundDocument) {
            Utils.checkNotNull(getCampaignMessageResponseCompoundDocument, "getCampaignMessageResponseCompoundDocument");
            this.getCampaignMessageResponseCompoundDocument = getCampaignMessageResponseCompoundDocument;
            return this;
        }
        
        public GetCampaignMessageResponse build() {
            return new GetCampaignMessageResponse(
                contentType,
                statusCode,
                rawResponse,
                getCampaignMessageResponseCompoundDocument);
        }
    }
}
