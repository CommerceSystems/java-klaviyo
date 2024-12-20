/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetCampaignMessageRequest {

    /**
     * The message ID to be retrieved
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[campaign-message]")
    private Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaignMessage>> fieldsCampaignMessage;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[campaign]")
    private Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaign>> fieldsCampaign;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[template]")
    private Optional<? extends List<FieldsTemplate>> fieldsTemplate;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetCampaignMessageQueryParamInclude>> include;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetCampaignMessageRequest(
            String id,
            Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaignMessage>> fieldsCampaignMessage,
            Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaign>> fieldsCampaign,
            Optional<? extends List<FieldsTemplate>> fieldsTemplate,
            Optional<? extends List<GetCampaignMessageQueryParamInclude>> include,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(fieldsCampaignMessage, "fieldsCampaignMessage");
        Utils.checkNotNull(fieldsCampaign, "fieldsCampaign");
        Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.fieldsCampaignMessage = fieldsCampaignMessage;
        this.fieldsCampaign = fieldsCampaign;
        this.fieldsTemplate = fieldsTemplate;
        this.include = include;
        this.revision = revision;
    }
    
    public GetCampaignMessageRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    /**
     * The message ID to be retrieved
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCampaignMessageQueryParamFieldsCampaignMessage>> fieldsCampaignMessage() {
        return (Optional<List<GetCampaignMessageQueryParamFieldsCampaignMessage>>) fieldsCampaignMessage;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCampaignMessageQueryParamFieldsCampaign>> fieldsCampaign() {
        return (Optional<List<GetCampaignMessageQueryParamFieldsCampaign>>) fieldsCampaign;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FieldsTemplate>> fieldsTemplate() {
        return (Optional<List<FieldsTemplate>>) fieldsTemplate;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCampaignMessageQueryParamInclude>> include() {
        return (Optional<List<GetCampaignMessageQueryParamInclude>>) include;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The message ID to be retrieved
     */
    public GetCampaignMessageRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCampaignMessageRequest withFieldsCampaignMessage(List<GetCampaignMessageQueryParamFieldsCampaignMessage> fieldsCampaignMessage) {
        Utils.checkNotNull(fieldsCampaignMessage, "fieldsCampaignMessage");
        this.fieldsCampaignMessage = Optional.ofNullable(fieldsCampaignMessage);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCampaignMessageRequest withFieldsCampaignMessage(Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaignMessage>> fieldsCampaignMessage) {
        Utils.checkNotNull(fieldsCampaignMessage, "fieldsCampaignMessage");
        this.fieldsCampaignMessage = fieldsCampaignMessage;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCampaignMessageRequest withFieldsCampaign(List<GetCampaignMessageQueryParamFieldsCampaign> fieldsCampaign) {
        Utils.checkNotNull(fieldsCampaign, "fieldsCampaign");
        this.fieldsCampaign = Optional.ofNullable(fieldsCampaign);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCampaignMessageRequest withFieldsCampaign(Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaign>> fieldsCampaign) {
        Utils.checkNotNull(fieldsCampaign, "fieldsCampaign");
        this.fieldsCampaign = fieldsCampaign;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCampaignMessageRequest withFieldsTemplate(List<FieldsTemplate> fieldsTemplate) {
        Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
        this.fieldsTemplate = Optional.ofNullable(fieldsTemplate);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCampaignMessageRequest withFieldsTemplate(Optional<? extends List<FieldsTemplate>> fieldsTemplate) {
        Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
        this.fieldsTemplate = fieldsTemplate;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetCampaignMessageRequest withInclude(List<GetCampaignMessageQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetCampaignMessageRequest withInclude(Optional<? extends List<GetCampaignMessageQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetCampaignMessageRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
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
        GetCampaignMessageRequest other = (GetCampaignMessageRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.fieldsCampaignMessage, other.fieldsCampaignMessage) &&
            Objects.deepEquals(this.fieldsCampaign, other.fieldsCampaign) &&
            Objects.deepEquals(this.fieldsTemplate, other.fieldsTemplate) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            fieldsCampaignMessage,
            fieldsCampaign,
            fieldsTemplate,
            include,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCampaignMessageRequest.class,
                "id", id,
                "fieldsCampaignMessage", fieldsCampaignMessage,
                "fieldsCampaign", fieldsCampaign,
                "fieldsTemplate", fieldsTemplate,
                "include", include,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaignMessage>> fieldsCampaignMessage = Optional.empty();
 
        private Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaign>> fieldsCampaign = Optional.empty();
 
        private Optional<? extends List<FieldsTemplate>> fieldsTemplate = Optional.empty();
 
        private Optional<? extends List<GetCampaignMessageQueryParamInclude>> include = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The message ID to be retrieved
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCampaignMessage(List<GetCampaignMessageQueryParamFieldsCampaignMessage> fieldsCampaignMessage) {
            Utils.checkNotNull(fieldsCampaignMessage, "fieldsCampaignMessage");
            this.fieldsCampaignMessage = Optional.ofNullable(fieldsCampaignMessage);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCampaignMessage(Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaignMessage>> fieldsCampaignMessage) {
            Utils.checkNotNull(fieldsCampaignMessage, "fieldsCampaignMessage");
            this.fieldsCampaignMessage = fieldsCampaignMessage;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCampaign(List<GetCampaignMessageQueryParamFieldsCampaign> fieldsCampaign) {
            Utils.checkNotNull(fieldsCampaign, "fieldsCampaign");
            this.fieldsCampaign = Optional.ofNullable(fieldsCampaign);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCampaign(Optional<? extends List<GetCampaignMessageQueryParamFieldsCampaign>> fieldsCampaign) {
            Utils.checkNotNull(fieldsCampaign, "fieldsCampaign");
            this.fieldsCampaign = fieldsCampaign;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsTemplate(List<FieldsTemplate> fieldsTemplate) {
            Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
            this.fieldsTemplate = Optional.ofNullable(fieldsTemplate);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsTemplate(Optional<? extends List<FieldsTemplate>> fieldsTemplate) {
            Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
            this.fieldsTemplate = fieldsTemplate;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(List<GetCampaignMessageQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(Optional<? extends List<GetCampaignMessageQueryParamInclude>> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
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
        
        public GetCampaignMessageRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetCampaignMessageRequest(
                id,
                fieldsCampaignMessage,
                fieldsCampaign,
                fieldsTemplate,
                include,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

