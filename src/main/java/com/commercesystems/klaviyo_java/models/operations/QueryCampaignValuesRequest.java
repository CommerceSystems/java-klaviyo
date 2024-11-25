/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.CampaignValuesRequestDTO;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class QueryCampaignValuesRequest {

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_cursor")
    private Optional<String> pageCursor;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private CampaignValuesRequestDTO campaignValuesRequestDTO;

    @JsonCreator
    public QueryCampaignValuesRequest(
            Optional<String> pageCursor,
            String revision,
            CampaignValuesRequestDTO campaignValuesRequestDTO) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(campaignValuesRequestDTO, "campaignValuesRequestDTO");
        this.pageCursor = pageCursor;
        this.revision = revision;
        this.campaignValuesRequestDTO = campaignValuesRequestDTO;
    }
    
    public QueryCampaignValuesRequest(
            String revision,
            CampaignValuesRequestDTO campaignValuesRequestDTO) {
        this(Optional.empty(), revision, campaignValuesRequestDTO);
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @JsonIgnore
    public Optional<String> pageCursor() {
        return pageCursor;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public CampaignValuesRequestDTO campaignValuesRequestDTO() {
        return campaignValuesRequestDTO;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public QueryCampaignValuesRequest withPageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.ofNullable(pageCursor);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public QueryCampaignValuesRequest withPageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public QueryCampaignValuesRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public QueryCampaignValuesRequest withCampaignValuesRequestDTO(CampaignValuesRequestDTO campaignValuesRequestDTO) {
        Utils.checkNotNull(campaignValuesRequestDTO, "campaignValuesRequestDTO");
        this.campaignValuesRequestDTO = campaignValuesRequestDTO;
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
        QueryCampaignValuesRequest other = (QueryCampaignValuesRequest) o;
        return 
            Objects.deepEquals(this.pageCursor, other.pageCursor) &&
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.campaignValuesRequestDTO, other.campaignValuesRequestDTO);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            pageCursor,
            revision,
            campaignValuesRequestDTO);
    }
    
    @Override
    public String toString() {
        return Utils.toString(QueryCampaignValuesRequest.class,
                "pageCursor", pageCursor,
                "revision", revision,
                "campaignValuesRequestDTO", campaignValuesRequestDTO);
    }
    
    public final static class Builder {
 
        private Optional<String> pageCursor = Optional.empty();
 
        private String revision;
 
        private CampaignValuesRequestDTO campaignValuesRequestDTO;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
         */
        public Builder pageCursor(String pageCursor) {
            Utils.checkNotNull(pageCursor, "pageCursor");
            this.pageCursor = Optional.ofNullable(pageCursor);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
         */
        public Builder pageCursor(Optional<String> pageCursor) {
            Utils.checkNotNull(pageCursor, "pageCursor");
            this.pageCursor = pageCursor;
            return this;
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }

        public Builder campaignValuesRequestDTO(CampaignValuesRequestDTO campaignValuesRequestDTO) {
            Utils.checkNotNull(campaignValuesRequestDTO, "campaignValuesRequestDTO");
            this.campaignValuesRequestDTO = campaignValuesRequestDTO;
            return this;
        }
        
        public QueryCampaignValuesRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new QueryCampaignValuesRequest(
                pageCursor,
                revision,
                campaignValuesRequestDTO);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

