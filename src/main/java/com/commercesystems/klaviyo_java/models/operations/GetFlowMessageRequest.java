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


public class GetFlowMessageRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[flow-action]")
    private Optional<? extends List<GetFlowMessageQueryParamFieldsFlowAction>> fieldsFlowAction;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[flow-message]")
    private Optional<? extends List<QueryParamFieldsFlowMessage>> fieldsFlowMessage;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[template]")
    private Optional<? extends List<GetFlowMessageQueryParamFieldsTemplate>> fieldsTemplate;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetFlowMessageQueryParamInclude>> include;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetFlowMessageRequest(
            String id,
            Optional<? extends List<GetFlowMessageQueryParamFieldsFlowAction>> fieldsFlowAction,
            Optional<? extends List<QueryParamFieldsFlowMessage>> fieldsFlowMessage,
            Optional<? extends List<GetFlowMessageQueryParamFieldsTemplate>> fieldsTemplate,
            Optional<? extends List<GetFlowMessageQueryParamInclude>> include,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(fieldsFlowAction, "fieldsFlowAction");
        Utils.checkNotNull(fieldsFlowMessage, "fieldsFlowMessage");
        Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.fieldsFlowAction = fieldsFlowAction;
        this.fieldsFlowMessage = fieldsFlowMessage;
        this.fieldsTemplate = fieldsTemplate;
        this.include = include;
        this.revision = revision;
    }
    
    public GetFlowMessageRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetFlowMessageQueryParamFieldsFlowAction>> fieldsFlowAction() {
        return (Optional<List<GetFlowMessageQueryParamFieldsFlowAction>>) fieldsFlowAction;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<QueryParamFieldsFlowMessage>> fieldsFlowMessage() {
        return (Optional<List<QueryParamFieldsFlowMessage>>) fieldsFlowMessage;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetFlowMessageQueryParamFieldsTemplate>> fieldsTemplate() {
        return (Optional<List<GetFlowMessageQueryParamFieldsTemplate>>) fieldsTemplate;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetFlowMessageQueryParamInclude>> include() {
        return (Optional<List<GetFlowMessageQueryParamInclude>>) include;
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

    public GetFlowMessageRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFlowMessageRequest withFieldsFlowAction(List<GetFlowMessageQueryParamFieldsFlowAction> fieldsFlowAction) {
        Utils.checkNotNull(fieldsFlowAction, "fieldsFlowAction");
        this.fieldsFlowAction = Optional.ofNullable(fieldsFlowAction);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFlowMessageRequest withFieldsFlowAction(Optional<? extends List<GetFlowMessageQueryParamFieldsFlowAction>> fieldsFlowAction) {
        Utils.checkNotNull(fieldsFlowAction, "fieldsFlowAction");
        this.fieldsFlowAction = fieldsFlowAction;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFlowMessageRequest withFieldsFlowMessage(List<QueryParamFieldsFlowMessage> fieldsFlowMessage) {
        Utils.checkNotNull(fieldsFlowMessage, "fieldsFlowMessage");
        this.fieldsFlowMessage = Optional.ofNullable(fieldsFlowMessage);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFlowMessageRequest withFieldsFlowMessage(Optional<? extends List<QueryParamFieldsFlowMessage>> fieldsFlowMessage) {
        Utils.checkNotNull(fieldsFlowMessage, "fieldsFlowMessage");
        this.fieldsFlowMessage = fieldsFlowMessage;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFlowMessageRequest withFieldsTemplate(List<GetFlowMessageQueryParamFieldsTemplate> fieldsTemplate) {
        Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
        this.fieldsTemplate = Optional.ofNullable(fieldsTemplate);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFlowMessageRequest withFieldsTemplate(Optional<? extends List<GetFlowMessageQueryParamFieldsTemplate>> fieldsTemplate) {
        Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
        this.fieldsTemplate = fieldsTemplate;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetFlowMessageRequest withInclude(List<GetFlowMessageQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetFlowMessageRequest withInclude(Optional<? extends List<GetFlowMessageQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetFlowMessageRequest withRevision(String revision) {
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
        GetFlowMessageRequest other = (GetFlowMessageRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.fieldsFlowAction, other.fieldsFlowAction) &&
            Objects.deepEquals(this.fieldsFlowMessage, other.fieldsFlowMessage) &&
            Objects.deepEquals(this.fieldsTemplate, other.fieldsTemplate) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            fieldsFlowAction,
            fieldsFlowMessage,
            fieldsTemplate,
            include,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFlowMessageRequest.class,
                "id", id,
                "fieldsFlowAction", fieldsFlowAction,
                "fieldsFlowMessage", fieldsFlowMessage,
                "fieldsTemplate", fieldsTemplate,
                "include", include,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends List<GetFlowMessageQueryParamFieldsFlowAction>> fieldsFlowAction = Optional.empty();
 
        private Optional<? extends List<QueryParamFieldsFlowMessage>> fieldsFlowMessage = Optional.empty();
 
        private Optional<? extends List<GetFlowMessageQueryParamFieldsTemplate>> fieldsTemplate = Optional.empty();
 
        private Optional<? extends List<GetFlowMessageQueryParamInclude>> include = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFlowAction(List<GetFlowMessageQueryParamFieldsFlowAction> fieldsFlowAction) {
            Utils.checkNotNull(fieldsFlowAction, "fieldsFlowAction");
            this.fieldsFlowAction = Optional.ofNullable(fieldsFlowAction);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFlowAction(Optional<? extends List<GetFlowMessageQueryParamFieldsFlowAction>> fieldsFlowAction) {
            Utils.checkNotNull(fieldsFlowAction, "fieldsFlowAction");
            this.fieldsFlowAction = fieldsFlowAction;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFlowMessage(List<QueryParamFieldsFlowMessage> fieldsFlowMessage) {
            Utils.checkNotNull(fieldsFlowMessage, "fieldsFlowMessage");
            this.fieldsFlowMessage = Optional.ofNullable(fieldsFlowMessage);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFlowMessage(Optional<? extends List<QueryParamFieldsFlowMessage>> fieldsFlowMessage) {
            Utils.checkNotNull(fieldsFlowMessage, "fieldsFlowMessage");
            this.fieldsFlowMessage = fieldsFlowMessage;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsTemplate(List<GetFlowMessageQueryParamFieldsTemplate> fieldsTemplate) {
            Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
            this.fieldsTemplate = Optional.ofNullable(fieldsTemplate);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsTemplate(Optional<? extends List<GetFlowMessageQueryParamFieldsTemplate>> fieldsTemplate) {
            Utils.checkNotNull(fieldsTemplate, "fieldsTemplate");
            this.fieldsTemplate = fieldsTemplate;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(List<GetFlowMessageQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(Optional<? extends List<GetFlowMessageQueryParamInclude>> include) {
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
        
        public GetFlowMessageRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetFlowMessageRequest(
                id,
                fieldsFlowAction,
                fieldsFlowMessage,
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

