/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.PostCatalogVariantResponse;
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


public class CreateCatalogVariantResponse implements Response {

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
    private Optional<? extends PostCatalogVariantResponse> postCatalogVariantResponse;

    @JsonCreator
    public CreateCatalogVariantResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends PostCatalogVariantResponse> postCatalogVariantResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(postCatalogVariantResponse, "postCatalogVariantResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.postCatalogVariantResponse = postCatalogVariantResponse;
    }
    
    public CreateCatalogVariantResponse(
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
    public Optional<PostCatalogVariantResponse> postCatalogVariantResponse() {
        return (Optional<PostCatalogVariantResponse>) postCatalogVariantResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateCatalogVariantResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateCatalogVariantResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateCatalogVariantResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public CreateCatalogVariantResponse withPostCatalogVariantResponse(PostCatalogVariantResponse postCatalogVariantResponse) {
        Utils.checkNotNull(postCatalogVariantResponse, "postCatalogVariantResponse");
        this.postCatalogVariantResponse = Optional.ofNullable(postCatalogVariantResponse);
        return this;
    }

    /**
     * Success
     */
    public CreateCatalogVariantResponse withPostCatalogVariantResponse(Optional<? extends PostCatalogVariantResponse> postCatalogVariantResponse) {
        Utils.checkNotNull(postCatalogVariantResponse, "postCatalogVariantResponse");
        this.postCatalogVariantResponse = postCatalogVariantResponse;
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
        CreateCatalogVariantResponse other = (CreateCatalogVariantResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.postCatalogVariantResponse, other.postCatalogVariantResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            postCatalogVariantResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCatalogVariantResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "postCatalogVariantResponse", postCatalogVariantResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends PostCatalogVariantResponse> postCatalogVariantResponse = Optional.empty();  
        
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
        public Builder postCatalogVariantResponse(PostCatalogVariantResponse postCatalogVariantResponse) {
            Utils.checkNotNull(postCatalogVariantResponse, "postCatalogVariantResponse");
            this.postCatalogVariantResponse = Optional.ofNullable(postCatalogVariantResponse);
            return this;
        }

        /**
         * Success
         */
        public Builder postCatalogVariantResponse(Optional<? extends PostCatalogVariantResponse> postCatalogVariantResponse) {
            Utils.checkNotNull(postCatalogVariantResponse, "postCatalogVariantResponse");
            this.postCatalogVariantResponse = postCatalogVariantResponse;
            return this;
        }
        
        public CreateCatalogVariantResponse build() {
            return new CreateCatalogVariantResponse(
                contentType,
                statusCode,
                rawResponse,
                postCatalogVariantResponse);
        }
    }
}
