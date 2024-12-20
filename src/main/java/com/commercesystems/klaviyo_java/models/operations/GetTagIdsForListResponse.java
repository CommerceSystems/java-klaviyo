/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.GetListTagRelationshipListResponseCollection;
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


public class GetTagIdsForListResponse implements Response {

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
    private Optional<? extends GetListTagRelationshipListResponseCollection> getListTagRelationshipListResponseCollection;

    @JsonCreator
    public GetTagIdsForListResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetListTagRelationshipListResponseCollection> getListTagRelationshipListResponseCollection) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getListTagRelationshipListResponseCollection, "getListTagRelationshipListResponseCollection");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getListTagRelationshipListResponseCollection = getListTagRelationshipListResponseCollection;
    }
    
    public GetTagIdsForListResponse(
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
    public Optional<GetListTagRelationshipListResponseCollection> getListTagRelationshipListResponseCollection() {
        return (Optional<GetListTagRelationshipListResponseCollection>) getListTagRelationshipListResponseCollection;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetTagIdsForListResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetTagIdsForListResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetTagIdsForListResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetTagIdsForListResponse withGetListTagRelationshipListResponseCollection(GetListTagRelationshipListResponseCollection getListTagRelationshipListResponseCollection) {
        Utils.checkNotNull(getListTagRelationshipListResponseCollection, "getListTagRelationshipListResponseCollection");
        this.getListTagRelationshipListResponseCollection = Optional.ofNullable(getListTagRelationshipListResponseCollection);
        return this;
    }

    /**
     * Success
     */
    public GetTagIdsForListResponse withGetListTagRelationshipListResponseCollection(Optional<? extends GetListTagRelationshipListResponseCollection> getListTagRelationshipListResponseCollection) {
        Utils.checkNotNull(getListTagRelationshipListResponseCollection, "getListTagRelationshipListResponseCollection");
        this.getListTagRelationshipListResponseCollection = getListTagRelationshipListResponseCollection;
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
        GetTagIdsForListResponse other = (GetTagIdsForListResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getListTagRelationshipListResponseCollection, other.getListTagRelationshipListResponseCollection);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getListTagRelationshipListResponseCollection);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTagIdsForListResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getListTagRelationshipListResponseCollection", getListTagRelationshipListResponseCollection);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetListTagRelationshipListResponseCollection> getListTagRelationshipListResponseCollection = Optional.empty();  
        
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
        public Builder getListTagRelationshipListResponseCollection(GetListTagRelationshipListResponseCollection getListTagRelationshipListResponseCollection) {
            Utils.checkNotNull(getListTagRelationshipListResponseCollection, "getListTagRelationshipListResponseCollection");
            this.getListTagRelationshipListResponseCollection = Optional.ofNullable(getListTagRelationshipListResponseCollection);
            return this;
        }

        /**
         * Success
         */
        public Builder getListTagRelationshipListResponseCollection(Optional<? extends GetListTagRelationshipListResponseCollection> getListTagRelationshipListResponseCollection) {
            Utils.checkNotNull(getListTagRelationshipListResponseCollection, "getListTagRelationshipListResponseCollection");
            this.getListTagRelationshipListResponseCollection = getListTagRelationshipListResponseCollection;
            return this;
        }
        
        public GetTagIdsForListResponse build() {
            return new GetTagIdsForListResponse(
                contentType,
                statusCode,
                rawResponse,
                getListTagRelationshipListResponseCollection);
        }
    }
}

